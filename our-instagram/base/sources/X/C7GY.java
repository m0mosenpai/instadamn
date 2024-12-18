package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7GY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7GY {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C7GY[] A02;
    public static final C7GY A03;
    public static final C7GY A04;
    public static final C7GY A05;
    public static final C7GY A06;
    public static final C7GY A07;
    public final String A00;

    static {
        C7GY c7gy = new C7GY("LEFT", 0, "composer_left");
        A03 = c7gy;
        C7GY c7gy2 = new C7GY("LEFT_INSET", 1, "composer_left_inset");
        A04 = c7gy2;
        C7GY c7gy3 = new C7GY("RIGHT", 2, "composer_right");
        A06 = c7gy3;
        C7GY c7gy4 = new C7GY("RIGHT_INSET", 3, "composer_right_inset");
        A07 = c7gy4;
        C7GY c7gy5 = new C7GY("OVERFLOW", 4, "composer_overflow");
        A05 = c7gy5;
        C7GY[] c7gyArr = {c7gy, c7gy2, c7gy3, c7gy4, c7gy5};
        A02 = c7gyArr;
        A01 = AbstractC12190kN.A00(c7gyArr);
    }

    public static C7GY valueOf(String str) {
        return (C7GY) Enum.valueOf(C7GY.class, str);
    }

    public static C7GY[] values() {
        return (C7GY[]) A02.clone();
    }

    public C7GY(String str, int i, String str2) {
        this.A00 = str2;
    }
}
