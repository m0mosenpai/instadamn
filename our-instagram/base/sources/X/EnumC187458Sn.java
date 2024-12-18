package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8Sn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC187458Sn {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC187458Sn[] A03;
    public static final EnumC187458Sn A04;
    public static final EnumC187458Sn A05;
    public static final EnumC187458Sn A06;
    public static final EnumC187458Sn A07;
    public float A00 = 1.0f;
    public final float A01;

    static {
        EnumC187458Sn enumC187458Sn = new EnumC187458Sn("SWIPE_TO_ENTER_TIMELINE_MIN_PREVIEW_PERCENTAGE", 0, 0.988f);
        A06 = enumC187458Sn;
        EnumC187458Sn enumC187458Sn2 = new EnumC187458Sn("DISMISS_DRAWER", 1, 0.8f);
        A04 = enumC187458Sn2;
        EnumC187458Sn enumC187458Sn3 = new EnumC187458Sn("GO_LARGE", 2, 0.56f);
        A05 = enumC187458Sn3;
        EnumC187458Sn enumC187458Sn4 = new EnumC187458Sn("SWITCH_TIMELINE_FRAGMENTS", 3, -1.0f);
        A07 = enumC187458Sn4;
        EnumC187458Sn[] enumC187458SnArr = {enumC187458Sn, enumC187458Sn2, enumC187458Sn3, enumC187458Sn4};
        A03 = enumC187458SnArr;
        A02 = AbstractC12190kN.A00(enumC187458SnArr);
    }

    public EnumC187458Sn(String str, int i, float f) {
        this.A01 = f;
    }

    public static EnumC187458Sn valueOf(String str) {
        return (EnumC187458Sn) Enum.valueOf(EnumC187458Sn.class, str);
    }

    public static EnumC187458Sn[] values() {
        return (EnumC187458Sn[]) A03.clone();
    }
}
