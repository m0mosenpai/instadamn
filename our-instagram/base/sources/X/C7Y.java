package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C7Y {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C7Y[] A02;
    public static final C7Y A03;
    public static final C7Y A04;
    public static final C7Y A05;
    public static final C7Y A06;
    public static final C7Y A07;
    public final int A00;

    static {
        C7Y c7y = new C7Y("TYPE_0213", 0, 0);
        A04 = c7y;
        C7Y c7y2 = new C7Y("TYPE_0321", 1, 1);
        A07 = c7y2;
        C7Y c7y3 = new C7Y("TYPE_0312", 2, 2);
        A06 = c7y3;
        C7Y c7y4 = new C7Y("TYPE_0231", 3, 3);
        A05 = c7y4;
        C7Y c7y5 = new C7Y("TYPE_0132", 4, 4);
        A03 = c7y5;
        C7Y[] c7yArr = {c7y, c7y2, c7y3, c7y4, c7y5, new C7Y("TYPE_0123", 5, 5)};
        A02 = c7yArr;
        A01 = AbstractC12190kN.A00(c7yArr);
    }

    public static C7Y valueOf(String str) {
        return (C7Y) Enum.valueOf(C7Y.class, str);
    }

    public static C7Y[] values() {
        return (C7Y[]) A02.clone();
    }

    public C7Y(String str, int i, int i2) {
        this.A00 = i2;
    }
}
