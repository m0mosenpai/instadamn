package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.10L, reason: invalid class name */
/* loaded from: classes.dex */
public final class C10L {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C10L[] A01;
    public static final C10L A02;
    public static final C10L A03;
    public static final C10L A04;

    public static C10L valueOf(String str) {
        return (C10L) Enum.valueOf(C10L.class, str);
    }

    public static C10L[] values() {
        return (C10L[]) A01.clone();
    }

    static {
        C10L c10l = new C10L("START", 0);
        A02 = c10l;
        C10L c10l2 = new C10L("STOP", 1);
        A03 = c10l2;
        C10L c10l3 = new C10L("STOP_AND_RESET_REPLAY_CACHE", 2);
        A04 = c10l3;
        C10L[] c10lArr = {c10l, c10l2, c10l3};
        A01 = c10lArr;
        A00 = AbstractC12190kN.A00(c10lArr);
    }

    public C10L(String str, int i) {
    }
}
