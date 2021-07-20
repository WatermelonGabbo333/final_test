package it.euris.ires.entity;

import java.time.LocalDateTime;
import java.util.UUID;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
public abstract class AbstractEntity {

	@Getter
	UUID uuid;

	@Getter
	LocalDateTime createdDate;

	@Setter
	@Getter
	LocalDateTime modifiedDate;

	@Getter
	String version = "1.0.0";

	public void setUuid(UUID uuid) {
		this.uuid = UUID.randomUUID();
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = LocalDateTime.now();
	}
}
