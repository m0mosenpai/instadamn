package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C7H {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C7H[] A01;
    public static final C7H A02;
    public static final C7H A03;
    public static final C7H A04;
    public static final C7H A05;
    public static final C7H A06;
    public static final C7H A07;
    public static final C7H A08;
    public static final C7H A09;
    public static final C7H A0A;
    public static final C7H A0B;
    public static final C7H A0C;
    public static final C7H A0D;
    public static final C7H A0E;
    public static final C7H A0F;
    public static final C7H A0G;
    public static final C7H A0H;
    public static final C7H A0I;

    static {
        C7H c7h = new C7H("NUX", 0);
        A06 = c7h;
        C7H c7h2 = new C7H("CAPTURE_CONSENT", 1);
        A02 = c7h2;
        C7H c7h3 = new C7H("PRE_CAPTURE", 2);
        A0E = c7h3;
        C7H c7h4 = new C7H("DETECTOR_READY", 3);
        A03 = c7h4;
        C7H c7h5 = new C7H("POSE_DETECTING", 4);
        A09 = c7h5;
        C7H c7h6 = new C7H("POSE_DETECTED", 5);
        A08 = c7h6;
        C7H c7h7 = new C7H("POSE_CENTER_FACE", 6);
        A07 = c7h7;
        C7H c7h8 = new C7H("POSE_TOO_CLOSE", 7);
        A0B = c7h8;
        C7H c7h9 = new C7H("POSE_TOO_FAR", 8);
        A0C = c7h9;
        C7H c7h10 = new C7H("POSE_FIND_FACE", 9);
        A0A = c7h10;
        C7H c7h11 = new C7H("POSE_TOO_MANY_FACES", 10);
        A0D = c7h11;
        C7H c7h12 = new C7H("UPLOADING", 11);
        A0F = c7h12;
        C7H c7h13 = new C7H("UPLOAD_COMPLETE", 12);
        A0G = c7h13;
        C7H c7h14 = new C7H("UPLOAD_COMPLETE_CAMERA_ROLL_FAIL", 13);
        A0H = c7h14;
        C7H c7h15 = new C7H("UPLOAD_FAIL", 14);
        A0I = c7h15;
        C7H c7h16 = new C7H("FRAME_TOO_DARK", 15);
        A04 = c7h16;
        C7H c7h17 = new C7H("IMAGE_PICKER", 16);
        A05 = c7h17;
        C7H[] c7hArr = {c7h, c7h2, c7h3, c7h4, c7h5, c7h6, c7h7, c7h8, c7h9, c7h10, c7h11, c7h12, c7h13, c7h14, c7h15, c7h16, c7h17};
        A01 = c7hArr;
        A00 = AbstractC12190kN.A00(c7hArr);
    }

    public static C7H valueOf(String str) {
        return (C7H) Enum.valueOf(C7H.class, str);
    }

    public static C7H[] values() {
        return (C7H[]) A01.clone();
    }

    public C7H(String str, int i) {
    }
}
