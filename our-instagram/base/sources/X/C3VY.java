package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3VY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3VY {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C3VY[] A02;
    public static final C3VY A03;
    public static final C3VY A04;
    public final C55942hf A00;

    static {
        C3VY c3vy = new C3VY(0, "PAGING", 40.0d);
        A03 = c3vy;
        C3VY c3vy2 = new C3VY(1, "WHEEL_OF_FORTUNE", 30.0d);
        A04 = c3vy2;
        C3VY[] c3vyArr = {c3vy, c3vy2};
        A02 = c3vyArr;
        A01 = AbstractC12190kN.A00(c3vyArr);
    }

    public static C3VY valueOf(String str) {
        return (C3VY) Enum.valueOf(C3VY.class, str);
    }

    public static C3VY[] values() {
        return (C3VY[]) A02.clone();
    }

    public C3VY(int i, String str, double d) {
        this.A00 = C55942hf.A04(d, 9.2d);
    }
}
