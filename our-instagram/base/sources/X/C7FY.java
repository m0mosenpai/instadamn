package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7FY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7FY {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C7FY[] A02;
    public static final C7FY A03;
    public static final C7FY A04;
    public final char A00;

    static {
        C7FY c7fy = new C7FY("MENTION", '@', 0);
        A04 = c7fy;
        C7FY c7fy2 = new C7FY("ACTION", '/', 1);
        A03 = c7fy2;
        C7FY[] c7fyArr = {c7fy, c7fy2};
        A02 = c7fyArr;
        A01 = AbstractC12190kN.A00(c7fyArr);
    }

    public static C7FY valueOf(String str) {
        return (C7FY) Enum.valueOf(C7FY.class, str);
    }

    public static C7FY[] values() {
        return (C7FY[]) A02.clone();
    }

    public C7FY(String str, char c, int i) {
        this.A00 = c;
    }
}
