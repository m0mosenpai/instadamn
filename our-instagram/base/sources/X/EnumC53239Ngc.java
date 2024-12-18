package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ngc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53239Ngc {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53239Ngc[] A02;
    public static final EnumC53239Ngc A03;
    public static final EnumC53239Ngc A04;
    public static final EnumC53239Ngc A05;
    public static final EnumC53239Ngc A06;
    public static final EnumC53239Ngc A07;
    public static final EnumC53239Ngc A08;
    public static final EnumC53239Ngc A09;
    public static final EnumC53239Ngc A0A;
    public final String A00;

    static {
        EnumC53239Ngc enumC53239Ngc = new EnumC53239Ngc("FACE_NOT_VISIBLE", 0, "face_not_visible");
        A08 = enumC53239Ngc;
        EnumC53239Ngc enumC53239Ngc2 = new EnumC53239Ngc("FACE_NOT_CENTERED", 1, "face_not_centered");
        A07 = enumC53239Ngc2;
        EnumC53239Ngc enumC53239Ngc3 = new EnumC53239Ngc("EYES_CLOSED", 2, "eyes_closed");
        A06 = enumC53239Ngc3;
        EnumC53239Ngc enumC53239Ngc4 = new EnumC53239Ngc("FACE_UP", 3, "face_up");
        A09 = enumC53239Ngc4;
        EnumC53239Ngc enumC53239Ngc5 = new EnumC53239Ngc("HOLD_STILL", 4, "hold_still");
        A0A = enumC53239Ngc5;
        EnumC53239Ngc enumC53239Ngc6 = new EnumC53239Ngc("AUTOGEN_READY", 5, "autogen_ready");
        A05 = enumC53239Ngc6;
        EnumC53239Ngc enumC53239Ngc7 = new EnumC53239Ngc("AUTOGEN_FINISHED", 6, "autogen_finished");
        A04 = enumC53239Ngc7;
        EnumC53239Ngc enumC53239Ngc8 = new EnumC53239Ngc("AUTOGEN_ALIGNED", 7, "autogen_aligned");
        A03 = enumC53239Ngc8;
        EnumC53239Ngc[] enumC53239NgcArr = {enumC53239Ngc, enumC53239Ngc2, enumC53239Ngc3, enumC53239Ngc4, enumC53239Ngc5, enumC53239Ngc6, enumC53239Ngc7, enumC53239Ngc8};
        A02 = enumC53239NgcArr;
        A01 = AbstractC12190kN.A00(enumC53239NgcArr);
    }

    public static EnumC53239Ngc valueOf(String str) {
        return (EnumC53239Ngc) Enum.valueOf(EnumC53239Ngc.class, str);
    }

    public static EnumC53239Ngc[] values() {
        return (EnumC53239Ngc[]) A02.clone();
    }

    public EnumC53239Ngc(String str, int i, String str2) {
        this.A00 = str2;
    }
}
