package ru.reservetable.prototype.reservetablevisitor.rest.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity @Table(name = "reserve_client.socials")
public class Socials {
    @Id
    private Integer id;
    @Column(name = "vk_id")
    private String vkId;
    @Column(name = "fb_id")
    private String fbId;
    @Column(name = "twitter_id")
    private String twitterId;
    @Column(name = "instagram_id")
    private String instagramId;
}
