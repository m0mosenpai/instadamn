package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3PO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3PO {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ C3PO[] A03;
    public static final C3PO A04;
    public static final C3PO A05;
    public static final C3PO A06;
    public static final C3PO A07;
    public static final C3PO A08;
    public static final C3PO A09;
    public static final C3PO A0A;
    public final Integer A00;
    public final String A01;

    static {
        C3PO c3po = new C3PO(0, "PUBLIC", "public", 0);
        A08 = c3po;
        C3PO c3po2 = new C3PO(3, "PRACTICE", "PRAC", 1);
        A07 = c3po2;
        C3PO c3po3 = new C3PO(4, "SUBSCRIBERS", "fan_club", 2);
        A0A = c3po3;
        C3PO c3po4 = new C3PO(5, "CLOSE_FRIENDS", "close_friends", 3);
        A04 = c3po4;
        C3PO c3po5 = new C3PO(6, "FOLLOWERS_YOU_FOLLOW_BACK", "followers_you_follow_back", 4);
        A05 = c3po5;
        C3PO c3po6 = new C3PO(7, "PUBLIC_CHAT", "public_chat", 5);
        A09 = c3po6;
        C3PO c3po7 = new C3PO(null, "INTERNAL", "internal", 6);
        A06 = c3po7;
        C3PO[] c3poArr = {c3po, c3po2, c3po3, c3po4, c3po5, c3po6, c3po7};
        A03 = c3poArr;
        A02 = AbstractC12190kN.A00(c3poArr);
    }

    public static C3PO valueOf(String str) {
        return (C3PO) Enum.valueOf(C3PO.class, str);
    }

    public static C3PO[] values() {
        return (C3PO[]) A03.clone();
    }

    public C3PO(Integer num, String str, String str2, int i) {
        this.A01 = str2;
        this.A00 = num;
    }
}
