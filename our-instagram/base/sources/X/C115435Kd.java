package X;

import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.5Kd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C115435Kd {
    public static final C115445Ke A09 = new Object();
    public static final C115435Kd A0A = C115445Ke.A01(EnumC115415Kb.A0L, "test failure", null, null);
    public final int A00;
    public final EnumC115415Kb A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final Throwable A08;

    public C115435Kd(EnumC115415Kb enumC115415Kb, String str, String str2, String str3, String str4, Throwable th, int i) {
        C14360o3.A0B(enumC115415Kb, 1);
        C14360o3.A0B(str, 2);
        this.A01 = enumC115415Kb;
        this.A04 = str;
        this.A07 = str2;
        this.A00 = i;
        this.A08 = th;
        this.A05 = str3;
        this.A06 = str4;
        if (str.length() > 400) {
            str = str.substring(0, ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI);
            C14360o3.A07(str);
        }
        this.A03 = str;
        StringBuilder sb = new StringBuilder();
        sb.append("ErrorType: ");
        sb.append(enumC115415Kb);
        sb.append(", Reason: ");
        sb.append(str4);
        sb.append(", ErrorMessage: ");
        sb.append(str);
        this.A02 = sb.toString();
    }
}
