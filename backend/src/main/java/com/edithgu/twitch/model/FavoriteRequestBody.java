package com.edithgu.twitch.model;


// imports...


import com.edithgu.twitch.db.entity.ItemEntity;


public record FavoriteRequestBody(
        ItemEntity favorite
) {}
