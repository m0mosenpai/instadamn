package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C7J {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C7J[] A02;
    public static final C7J A03;
    public static final C7J A04;
    public final CAY A00;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.CAY] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.CAY] */
    static {
        C7J c7j = new C7J(new Object(), "VIEW_TYPE_VALUE_PROPS_LIST", 0);
        A04 = c7j;
        C7J c7j2 = new C7J(new Object(), "VIEW_TYPE_CRITERIA_LIST", 1);
        A03 = c7j2;
        C7J[] c7jArr = {c7j, c7j2};
        A02 = c7jArr;
        A01 = AbstractC12190kN.A00(c7jArr);
    }

    public static C7J valueOf(String str) {
        return (C7J) Enum.valueOf(C7J.class, str);
    }

    public static C7J[] values() {
        return (C7J[]) A02.clone();
    }

    public C7J(CAY cay, String str, int i) {
        this.A00 = cay;
    }
}
