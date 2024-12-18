package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3T5, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3T5 {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ C3T5[] A03;
    public static final C3T5 A04;
    public static final C3T5 A05;
    public static final C3T5 A06;
    public static final C3T5 A07;
    public final char A00;
    public final char A01;

    static {
        C3T5 c3t5 = new C3T5("OBJ", '{', '}', 0);
        A06 = c3t5;
        C3T5 c3t52 = new C3T5("LIST", '[', ']', 1);
        A04 = c3t52;
        C3T5 c3t53 = new C3T5("MAP", '{', '}', 2);
        A05 = c3t53;
        C3T5 c3t54 = new C3T5("POLY_OBJ", '[', ']', 3);
        A07 = c3t54;
        C3T5[] c3t5Arr = {c3t5, c3t52, c3t53, c3t54};
        A03 = c3t5Arr;
        A02 = AbstractC12190kN.A00(c3t5Arr);
    }

    public static C3T5 valueOf(String str) {
        return (C3T5) Enum.valueOf(C3T5.class, str);
    }

    public static C3T5[] values() {
        return (C3T5[]) A03.clone();
    }

    public C3T5(String str, char c, char c2, int i) {
        this.A00 = c;
        this.A01 = c2;
    }
}
