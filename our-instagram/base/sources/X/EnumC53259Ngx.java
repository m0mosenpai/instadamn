package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ngx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53259Ngx {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC53259Ngx[] A03;
    public static final EnumC53259Ngx A04;
    public static final EnumC53259Ngx A05;
    public static final EnumC53259Ngx A06;
    public static final EnumC53259Ngx A07;
    public static final EnumC53259Ngx A08;
    public static final EnumC53259Ngx A09;
    public static final EnumC53259Ngx A0A;
    public static final EnumC53259Ngx A0B;
    public static final EnumC53259Ngx A0C;
    public final int A00;
    public final String A01;

    static {
        EnumC53259Ngx enumC53259Ngx = new EnumC53259Ngx("START", 0, 0, "start");
        A0A = enumC53259Ngx;
        EnumC53259Ngx enumC53259Ngx2 = new EnumC53259Ngx("CAMERA", 1, 0, "camera");
        A04 = enumC53259Ngx2;
        EnumC53259Ngx enumC53259Ngx3 = new EnumC53259Ngx("VIDEO_GALLERY", 2, 1, "video_gallery");
        A0B = enumC53259Ngx3;
        EnumC53259Ngx enumC53259Ngx4 = new EnumC53259Ngx("VIDEO_PREVIEW", 3, 2, "video_preview");
        A0C = enumC53259Ngx4;
        EnumC53259Ngx enumC53259Ngx5 = new EnumC53259Ngx("COVER_IMAGE", 4, 3, "cover_image");
        A05 = enumC53259Ngx5;
        EnumC53259Ngx enumC53259Ngx6 = new EnumC53259Ngx("POST_LIVE_COVER_IMAGE", 5, 3, "post_live_cover_image");
        A07 = enumC53259Ngx6;
        EnumC53259Ngx enumC53259Ngx7 = new EnumC53259Ngx("METADATA", 6, 4, "metadata");
        A06 = enumC53259Ngx7;
        EnumC53259Ngx enumC53259Ngx8 = new EnumC53259Ngx("READY_TO_PUBLISH", 7, 5, "ready_to_publish");
        A09 = enumC53259Ngx8;
        EnumC53259Ngx enumC53259Ngx9 = new EnumC53259Ngx("PUBLISHED", 8, 6, "published");
        A08 = enumC53259Ngx9;
        EnumC53259Ngx[] enumC53259NgxArr = {enumC53259Ngx, enumC53259Ngx2, enumC53259Ngx3, enumC53259Ngx4, enumC53259Ngx5, enumC53259Ngx6, enumC53259Ngx7, enumC53259Ngx8, enumC53259Ngx9};
        A03 = enumC53259NgxArr;
        A02 = AbstractC12190kN.A00(enumC53259NgxArr);
    }

    public static EnumC53259Ngx valueOf(String str) {
        return (EnumC53259Ngx) Enum.valueOf(EnumC53259Ngx.class, str);
    }

    public static EnumC53259Ngx[] values() {
        return (EnumC53259Ngx[]) A03.clone();
    }

    public EnumC53259Ngx(String str, int i, int i2, String str2) {
        this.A00 = i2;
        this.A01 = str2;
    }
}
