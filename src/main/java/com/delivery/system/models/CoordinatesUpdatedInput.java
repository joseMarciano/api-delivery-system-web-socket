package com.delivery.system.models;

public record CoordinatesUpdatedInput(
        String latitude,
        String longitude,
        String idOrder
) {
}
