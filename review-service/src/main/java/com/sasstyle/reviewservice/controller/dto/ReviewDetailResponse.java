package com.sasstyle.reviewservice.controller.dto;

import com.sasstyle.reviewservice.entity.Review;
import com.sasstyle.reviewservice.entity.ReviewImage;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class ReviewDetailResponse {

    @Schema(description = "리뷰 후기", example = "너무 상품이 마음에 들어요~", required = true)
    private String content;

    @Schema(description = "리뷰 상세 이미지", example = "[https://picsum.photos/seed/picsum/200/300]")
    private List<String> images;

    @Schema(description = "리뷰 평점", example = "5", required = true)
    private int rate;

    public ReviewDetailResponse(Review review) {
        this.content = review.getContent();
        this.images = review.getReviewImages().stream()
                .map(ReviewImage::getImageUrl)
                .collect(Collectors.toList());
        this.rate = review.getRate();
    }
}