package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.85B, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C85B {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C85B[] A01;
    public static final C85B A02;
    public static final C85B A03;
    public static final C85B A04;
    public static final C85B A05;
    public static final C85B A06;
    public static final C85B A07;
    public static final C85B A08;
    public static final C85B A09;
    public static final C85B A0A;
    public static final C85B A0B;
    public static final C85B A0C;
    public static final C85B A0D;

    static {
        C85B c85b = new C85B("DEFAULT", 0);
        A03 = c85b;
        C85B c85b2 = new C85B("MINI_GALLERY", 1);
        A0B = c85b2;
        C85B c85b3 = new C85B("EFFECT_TRAY", 2);
        A06 = c85b3;
        C85B c85b4 = new C85B("EFFECT_FOOTER", 3);
        A04 = c85b4;
        C85B c85b5 = new C85B("OTHER", 4);
        A0C = c85b5;
        C85B c85b6 = new C85B("FLOATING_BUTTON", 5);
        A07 = c85b6;
        C85B c85b7 = new C85B("INSPIRATION_HUB", 6);
        A0A = c85b7;
        C85B c85b8 = new C85B("GALLERY", 7);
        A08 = c85b8;
        C85B c85b9 = new C85B("EFFECT_SUGGESTION", 8);
        A05 = c85b9;
        C85B c85b10 = new C85B("ATTRIBUTION", 9);
        A02 = c85b10;
        C85B c85b11 = new C85B("TEMPLATE", 10);
        A0D = c85b11;
        C85B c85b12 = new C85B("GREEN_SCREEN_TOOL", 11);
        A09 = c85b12;
        C85B[] c85bArr = {c85b, c85b2, c85b3, c85b4, c85b5, c85b6, c85b7, c85b8, c85b9, c85b10, c85b11, c85b12, new C85B("POST_CAPTURE", 12)};
        A01 = c85bArr;
        A00 = AbstractC12190kN.A00(c85bArr);
    }

    public static C85B valueOf(String str) {
        return (C85B) Enum.valueOf(C85B.class, str);
    }

    public static C85B[] values() {
        return (C85B[]) A01.clone();
    }

    public C85B(String str, int i) {
    }
}
