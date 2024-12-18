package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.89W, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C89W {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C89W[] A01;
    public static final C89W A02;
    public static final C89W A03;
    public static final C89W A04;

    static {
        C89W c89w = new C89W("LOADING", 0);
        A03 = c89w;
        C89W c89w2 = new C89W("SUCCESS", 1);
        A04 = c89w2;
        C89W c89w3 = new C89W("FAIL", 2);
        A02 = c89w3;
        C89W[] c89wArr = {c89w, c89w2, c89w3};
        A01 = c89wArr;
        A00 = AbstractC12190kN.A00(c89wArr);
    }

    public static C89W valueOf(String str) {
        return (C89W) Enum.valueOf(C89W.class, str);
    }

    public static C89W[] values() {
        return (C89W[]) A01.clone();
    }

    public C89W(String str, int i) {
    }
}
