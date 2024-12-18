package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VD5 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ VD5[] A01;
    public static final VD5 A02;
    public static final VD5 A03;
    public static final VD5 A04;
    public static final VD5 A05;
    public static final VD5 A06;
    public static final VD5 A07;

    static {
        VD5 vd5 = new VD5("INVALID_ASPECT_RATIO", 0);
        A06 = vd5;
        VD5 vd52 = new VD5("VIDEO_FILE_MISSING_ERROR", 1);
        A07 = vd52;
        VD5 vd53 = new VD5("COVER_PHOTO_FILE_MISSING_ERROR", 2);
        A04 = vd53;
        VD5 vd54 = new VD5("CLIP_INFO_MISSING_ERROR", 3);
        A03 = vd54;
        VD5 vd55 = new VD5("AUDIO_OVERLAY_INFO_ERROR", 4);
        A02 = vd55;
        VD5 vd56 = new VD5("GIF_OVERLAY_MISSING_ERROR", 5);
        A05 = vd56;
        VD5[] vd5Arr = {vd5, vd52, vd53, vd54, vd55, vd56, new VD5("GIF_OVERLAY_ORIGINAL_URL_MISSING_ERROR", 6)};
        A01 = vd5Arr;
        A00 = AbstractC12190kN.A00(vd5Arr);
    }

    public static VD5 valueOf(String str) {
        return (VD5) Enum.valueOf(VD5.class, str);
    }

    public static VD5[] values() {
        return (VD5[]) A01.clone();
    }

    public VD5(String str, int i) {
    }
}
