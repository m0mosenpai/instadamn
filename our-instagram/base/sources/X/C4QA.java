package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4QA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4QA {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C4QA[] A01;
    public static final C4QA A02;
    public static final C4QA A03;

    static {
        C4QA c4qa = new C4QA("AT_MOST_ONCE", 0);
        A03 = c4qa;
        C4QA c4qa2 = new C4QA("AT_LEAST_ONCE", 1);
        A02 = c4qa2;
        C4QA[] c4qaArr = {c4qa, c4qa2};
        A01 = c4qaArr;
        A00 = AbstractC12190kN.A00(c4qaArr);
    }

    public static C4QA valueOf(String str) {
        return (C4QA) Enum.valueOf(C4QA.class, str);
    }

    public static C4QA[] values() {
        return (C4QA[]) A01.clone();
    }

    public C4QA(String str, int i) {
    }
}
