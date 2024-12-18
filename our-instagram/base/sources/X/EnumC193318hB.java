package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8hB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC193318hB implements InterfaceC02530Ab {
    public static final /* synthetic */ EnumC193318hB[] A01;
    public static final EnumC193318hB A02;
    public static final EnumC193318hB A03;
    public static final EnumC193318hB A04;
    public static final EnumC193318hB A05;
    public static final EnumC193318hB A06;
    public static final EnumC193318hB A07;
    public static final EnumC193318hB A08;
    public static final EnumC193318hB A09;
    public final long A00;

    static {
        EnumC193318hB enumC193318hB = new EnumC193318hB("NORMAL", 0, 1L);
        A08 = enumC193318hB;
        EnumC193318hB enumC193318hB2 = new EnumC193318hB("RICHTEXT", 1, 2L);
        EnumC193318hB enumC193318hB3 = new EnumC193318hB("LIVE", 2, 3L);
        A07 = enumC193318hB3;
        EnumC193318hB enumC193318hB4 = new EnumC193318hB("BOOMERANG", 3, 4L);
        EnumC193318hB enumC193318hB5 = new EnumC193318hB("SOUNDBOARD", 4, 5L);
        EnumC193318hB enumC193318hB6 = new EnumC193318hB("FOCUS", 5, 6L);
        EnumC193318hB enumC193318hB7 = new EnumC193318hB("SUPERZOOM", 6, 7L);
        EnumC193318hB enumC193318hB8 = new EnumC193318hB("REWIND", 7, 8L);
        EnumC193318hB enumC193318hB9 = new EnumC193318hB("HANDSFREE", 8, 9L);
        EnumC193318hB enumC193318hB10 = new EnumC193318hB("STOPMOTION", 9, 10L);
        EnumC193318hB enumC193318hB11 = new EnumC193318hB("RESHARE", 10, 11L);
        EnumC193318hB enumC193318hB12 = new EnumC193318hB("GALLERY", 11, 12L);
        A04 = enumC193318hB12;
        EnumC193318hB enumC193318hB13 = new EnumC193318hB("MUSIC", 12, 13L);
        EnumC193318hB enumC193318hB14 = new EnumC193318hB("PROPHOTO", 13, 14L);
        EnumC193318hB enumC193318hB15 = new EnumC193318hB("MEMORIES_RESHARE", 14, 15L);
        EnumC193318hB enumC193318hB16 = new EnumC193318hB("PRODUCT_RESHARE", 15, 16L);
        EnumC193318hB enumC193318hB17 = new EnumC193318hB("LAYOUT", 16, 17L);
        A06 = enumC193318hB17;
        EnumC193318hB enumC193318hB18 = new EnumC193318hB("CLIPS", 17, 18L);
        A02 = enumC193318hB18;
        EnumC193318hB enumC193318hB19 = new EnumC193318hB("MULTICAM", 18, 19L);
        EnumC193318hB enumC193318hB20 = new EnumC193318hB("MIRROR", 19, 20L);
        EnumC193318hB enumC193318hB21 = new EnumC193318hB("POSES", 20, 21L);
        EnumC193318hB enumC193318hB22 = new EnumC193318hB("IGTV_REACTIONS", 21, 22L);
        EnumC193318hB enumC193318hB23 = new EnumC193318hB("IGTV_CAMERA", 22, 23L);
        A05 = enumC193318hB23;
        EnumC193318hB enumC193318hB24 = new EnumC193318hB("MULTI_CAPTURE", 23, 24L);
        EnumC193318hB enumC193318hB25 = new EnumC193318hB("FEED", 24, 25L);
        A03 = enumC193318hB25;
        EnumC193318hB enumC193318hB26 = new EnumC193318hB("VIDEO_LAYOUT", 25, 26L);
        A09 = enumC193318hB26;
        EnumC193318hB enumC193318hB27 = new EnumC193318hB("PRODUCT_COLLECTION_RESHARE", 26, 27L);
        EnumC193318hB enumC193318hB28 = new EnumC193318hB("STOREFRONT_RESHARE", 27, 28L);
        EnumC193318hB enumC193318hB29 = new EnumC193318hB("BLIND_REACTION", 28, 30L);
        EnumC193318hB enumC193318hB30 = new EnumC193318hB("ROLLCALL", 29, 31L);
        EnumC193318hB enumC193318hB31 = new EnumC193318hB("SUPERLATIVES", 30, 32L);
        EnumC193318hB[] enumC193318hBArr = new EnumC193318hB[31];
        System.arraycopy(new EnumC193318hB[]{enumC193318hB, enumC193318hB2, enumC193318hB3, enumC193318hB4, enumC193318hB5, enumC193318hB6, enumC193318hB7, enumC193318hB8, enumC193318hB9, enumC193318hB10, enumC193318hB11, enumC193318hB12, enumC193318hB13, enumC193318hB14, enumC193318hB15, enumC193318hB16, enumC193318hB17, enumC193318hB18, enumC193318hB19, enumC193318hB20, enumC193318hB21, enumC193318hB22, enumC193318hB23, enumC193318hB24, enumC193318hB25, enumC193318hB26, enumC193318hB27}, 0, enumC193318hBArr, 0, 27);
        System.arraycopy(new EnumC193318hB[]{enumC193318hB28, enumC193318hB29, enumC193318hB30, enumC193318hB31}, 0, enumC193318hBArr, 27, 4);
        A01 = enumC193318hBArr;
    }

    public static EnumC193318hB valueOf(String str) {
        return (EnumC193318hB) Enum.valueOf(EnumC193318hB.class, str);
    }

    public static EnumC193318hB[] values() {
        return (EnumC193318hB[]) A01.clone();
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.A00);
    }

    public EnumC193318hB(String str, int i, long j) {
        this.A00 = j;
    }
}
