package com.example.demo.src.store.model.response;

import com.example.demo.src.store.model.entity.MenuCategory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class GetStoreRes {
    private int store_idx;
    private String store_name;
    private int store_min_order;
    private String store_address;
    private String store_phone;
    private String store_owner;
    private String store_reg_num;
    private String store_buisness_hour;
    private String store_info;
    private String store_owner_note;
    private Timestamp store_join_date;
    private int store_delivery_fee;
    private double store_lng;
    private double store_lat;
    private double store_user_distance;
    private int store_min_prep_time;
    private int store_max_prep_time;
    private int store_min_delivery_time;
    private int store_max_delivery_time;
    private int store_pickup_status;
    private int store_cheetah_delivery;
    private float store_rating_avg;
    private int store_review_num;
    private int user_liked_status;
    private List<String>category_list;
    private List<String>store_img_url;
    private List<MenuCategory> menu_list_stored_by_category;
}
