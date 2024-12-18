package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C7F {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C7F[] A01;
    public static final C7F A02;
    public static final C7F A03;
    public static final C7F A04;
    public static final C7F A05;
    public static final C7F A06;
    public static final C7F A07;
    public static final C7F A08;
    public static final C7F A09;
    public static final C7F A0A;
    public static final C7F A0B;
    public static final C7F A0C;

    static {
        C7F c7f = new C7F("Text", 0);
        A0C = c7f;
        C7F c7f2 = new C7F("Number", 1);
        A08 = c7f2;
        C7F c7f3 = new C7F("Email", 2);
        A07 = c7f3;
        C7F c7f4 = new C7F("Phone", 3);
        A0B = c7f4;
        C7F c7f5 = new C7F("Password", 4);
        A0A = c7f5;
        C7F c7f6 = new C7F("Passcode", 5);
        A09 = c7f6;
        C7F c7f7 = new C7F("Amount", 6);
        A02 = c7f7;
        C7F c7f8 = new C7F("Date", 7);
        A06 = c7f8;
        C7F c7f9 = new C7F("CapWords", 8);
        A05 = c7f9;
        C7F c7f10 = new C7F("CapSentences", 9);
        A04 = c7f10;
        C7F c7f11 = new C7F("CapLetters", 10);
        A03 = c7f11;
        C7F[] c7fArr = {c7f, c7f2, c7f3, c7f4, c7f5, c7f6, c7f7, c7f8, c7f9, c7f10, c7f11, new C7F("TextNoSuggestions", 11)};
        A01 = c7fArr;
        A00 = AbstractC12190kN.A00(c7fArr);
    }

    public static C7F valueOf(String str) {
        return (C7F) Enum.valueOf(C7F.class, str);
    }

    public static C7F[] values() {
        return (C7F[]) A01.clone();
    }

    public C7F(String str, int i) {
    }
}
