package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.83F, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C83F {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C83F[] A01;
    public static final C83F A02;
    public static final C83F A03;
    public static final C83F A04;
    public static final C83F A05;

    static {
        C83F c83f = new C83F("PENDING_OPEN", 0);
        A05 = c83f;
        C83F c83f2 = new C83F("OPEN", 1);
        A03 = c83f2;
        C83F c83f3 = new C83F("CLOSED", 2);
        A02 = c83f3;
        C83F c83f4 = new C83F("PENDING_CLOSE", 3);
        A04 = c83f4;
        C83F[] c83fArr = {c83f, c83f2, c83f3, c83f4};
        A01 = c83fArr;
        A00 = AbstractC12190kN.A00(c83fArr);
    }

    public static C83F valueOf(String str) {
        return (C83F) Enum.valueOf(C83F.class, str);
    }

    public static C83F[] values() {
        return (C83F[]) A01.clone();
    }

    public C83F(String str, int i) {
    }
}
