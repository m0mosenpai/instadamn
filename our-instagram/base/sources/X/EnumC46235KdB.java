package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KdB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46235KdB {
    public static final /* synthetic */ EnumC46235KdB[] A01;
    public static final EnumC46235KdB A02;
    public static final EnumC46235KdB A03;
    public final String A00;

    static {
        EnumC46235KdB enumC46235KdB = new EnumC46235KdB("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE");
        A03 = enumC46235KdB;
        EnumC46235KdB enumC46235KdB2 = new EnumC46235KdB("CANCELED", 1, "CANCELED");
        EnumC46235KdB enumC46235KdB3 = new EnumC46235KdB("CANCELED_WITH_REFUND", 2, "CANCELED_WITH_REFUND");
        EnumC46235KdB enumC46235KdB4 = new EnumC46235KdB("CANCELLATION_DECLINED", 3, "CANCELLATION_DECLINED");
        EnumC46235KdB enumC46235KdB5 = new EnumC46235KdB("CANCELLATION_REQUESTED", 4, "CANCELLATION_REQUESTED");
        EnumC46235KdB enumC46235KdB6 = new EnumC46235KdB("DELIVERED", 5, "DELIVERED");
        EnumC46235KdB enumC46235KdB7 = new EnumC46235KdB("DONATED", 6, "DONATED");
        EnumC46235KdB enumC46235KdB8 = new EnumC46235KdB("ORDERED", 7, "ORDERED");
        EnumC46235KdB enumC46235KdB9 = new EnumC46235KdB("OUT_FOR_DELIVERY", 8, "OUT_FOR_DELIVERY");
        EnumC46235KdB enumC46235KdB10 = new EnumC46235KdB("PAYMENT_UPDATE_REQUIRED", 9, "PAYMENT_UPDATE_REQUIRED");
        A02 = enumC46235KdB10;
        EnumC46235KdB enumC46235KdB11 = new EnumC46235KdB("PENDING", 10, "PENDING");
        EnumC46235KdB enumC46235KdB12 = new EnumC46235KdB("PICKED_UP", 11, "PICKED_UP");
        EnumC46235KdB enumC46235KdB13 = new EnumC46235KdB("PREORDERED", 12, "PREORDERED");
        EnumC46235KdB enumC46235KdB14 = new EnumC46235KdB("PREPARING_FOR_PICKUP", 13, "PREPARING_FOR_PICKUP");
        EnumC46235KdB enumC46235KdB15 = new EnumC46235KdB("PURCHASED", 14, "PURCHASED");
        EnumC46235KdB enumC46235KdB16 = new EnumC46235KdB("READY_FOR_PICKUP", 15, "READY_FOR_PICKUP");
        EnumC46235KdB enumC46235KdB17 = new EnumC46235KdB("RECEIVED", 16, "RECEIVED");
        EnumC46235KdB enumC46235KdB18 = new EnumC46235KdB("REFUNDED", 17, "REFUNDED");
        EnumC46235KdB enumC46235KdB19 = new EnumC46235KdB("REFUND_IN_PROGRESS", 18, "REFUND_IN_PROGRESS");
        EnumC46235KdB enumC46235KdB20 = new EnumC46235KdB("REJECTED", 19, "REJECTED");
        EnumC46235KdB enumC46235KdB21 = new EnumC46235KdB("RESERVED", 20, "RESERVED");
        EnumC46235KdB enumC46235KdB22 = new EnumC46235KdB("RETURN_DISAPPROVED", 21, "RETURN_DISAPPROVED");
        EnumC46235KdB enumC46235KdB23 = new EnumC46235KdB("RETURN_INITIATED", 22, "RETURN_INITIATED");
        EnumC46235KdB enumC46235KdB24 = new EnumC46235KdB("RETURN_IN_PROGRESS", 23, "RETURN_IN_PROGRESS");
        EnumC46235KdB enumC46235KdB25 = new EnumC46235KdB("RETURN_REFUNDED", 24, "RETURN_REFUNDED");
        EnumC46235KdB enumC46235KdB26 = new EnumC46235KdB("SHIPMENT_CANCELED", 25, "SHIPMENT_CANCELED");
        EnumC46235KdB enumC46235KdB27 = new EnumC46235KdB("SHIPPED", 26, "SHIPPED");
        EnumC46235KdB enumC46235KdB28 = new EnumC46235KdB("UNKNOWN", 27, "UNKNOWN");
        EnumC46235KdB[] enumC46235KdBArr = new EnumC46235KdB[28];
        System.arraycopy(new EnumC46235KdB[]{enumC46235KdB, enumC46235KdB2, enumC46235KdB3, enumC46235KdB4, enumC46235KdB5, enumC46235KdB6, enumC46235KdB7, enumC46235KdB8, enumC46235KdB9, enumC46235KdB10, enumC46235KdB11, enumC46235KdB12, enumC46235KdB13, enumC46235KdB14, enumC46235KdB15, enumC46235KdB16, enumC46235KdB17, enumC46235KdB18, enumC46235KdB19, enumC46235KdB20, enumC46235KdB21, enumC46235KdB22, enumC46235KdB23, enumC46235KdB24, enumC46235KdB25, enumC46235KdB26, enumC46235KdB27}, 0, enumC46235KdBArr, 0, 27);
        System.arraycopy(new EnumC46235KdB[]{enumC46235KdB28}, 0, enumC46235KdBArr, 27, 1);
        A01 = enumC46235KdBArr;
    }

    public static EnumC46235KdB valueOf(String str) {
        return (EnumC46235KdB) Enum.valueOf(EnumC46235KdB.class, str);
    }

    public static EnumC46235KdB[] values() {
        return (EnumC46235KdB[]) A01.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EnumC46235KdB(String str, int i, String str2) {
        this.A00 = str2;
    }
}
