package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1QL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1QL {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C1QL[] A02;
    public static final C1QL A03;
    public static final C1QL A04;
    public final boolean A00;

    static {
        C1QL c1ql = new C1QL("CONTROL", 0, false);
        A03 = c1ql;
        C1QL c1ql2 = new C1QL("INDIGO_PRIMARY_BORDERED_SECONDARY", 1, true);
        A04 = c1ql2;
        C1QL[] c1qlArr = {c1ql, c1ql2};
        A02 = c1qlArr;
        A01 = AbstractC12190kN.A00(c1qlArr);
    }

    public static C1QL valueOf(String str) {
        return (C1QL) Enum.valueOf(C1QL.class, str);
    }

    public static C1QL[] values() {
        return (C1QL[]) A02.clone();
    }

    public C1QL(String str, int i, boolean z) {
        this.A00 = z;
    }
}
