package com.zed.enigme.domain.enigma;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * A enigma.
 */
@Entity
@Table(name = "enigma")
public class Enigma implements Serializable {

	private static final long serialVersionUID = -1390989831026277694L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "number")
	private Integer number;

	@NotNull
	@Column(name = "question", length = 255, unique = false, nullable = false)
	private String question;

	@NotNull
	@Column(name = "answer", length = 255, unique = false, nullable = false)
	private String answer;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Enigma [id=");
		builder.append(id);
		builder.append(", number=");
		builder.append(number);
		builder.append(", question=");
		builder.append(question);
		builder.append(", answer=");
		builder.append(answer);
		builder.append("]");
		return builder.toString();
	}

}
