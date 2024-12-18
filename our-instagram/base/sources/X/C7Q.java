package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C7Q {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C7Q[] A02;
    public static final C7Q A03;
    public static final C7Q A04;
    public static final C7Q A05;
    public final CAY A00;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.CAY] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, X.CAY] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.CAY] */
    static {
        C7Q c7q = new C7Q(new Object(), "VIEW_TYPE_HEADER", 0);
        A04 = c7q;
        C7Q c7q2 = new C7Q(new Object(), "VIEW_TYPE_PRODUCT", 1);
        A05 = c7q2;
        C7Q c7q3 = new C7Q(new Object(), "VIEW_TYPE_ERROR_ROW", 2);
        A03 = c7q3;
        C7Q[] c7qArr = {c7q, c7q2, c7q3};
        A02 = c7qArr;
        A01 = AbstractC12190kN.A00(c7qArr);
    }

    public static C7Q valueOf(String str) {
        return (C7Q) Enum.valueOf(C7Q.class, str);
    }

    public static C7Q[] values() {
        return (C7Q[]) A02.clone();
    }

    public C7Q(CAY cay, String str, int i) {
        this.A00 = cay;
    }
}
