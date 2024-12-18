package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9H2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9H2 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C9H2[] A01;
    public static final C9H2 A02;
    public static final C9H2 A03;

    static {
        C9H2 c9h2 = new C9H2("IMAGINE", 0);
        A02 = c9h2;
        C9H2 c9h22 = new C9H2("IMAGINE_ME", 1);
        A03 = c9h22;
        C9H2[] c9h2Arr = {c9h2, c9h22};
        A01 = c9h2Arr;
        A00 = AbstractC12190kN.A00(c9h2Arr);
    }

    public static C9H2 valueOf(String str) {
        return (C9H2) Enum.valueOf(C9H2.class, str);
    }

    public static C9H2[] values() {
        return (C9H2[]) A01.clone();
    }

    public C9H2(String str, int i) {
    }
}
