package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C7T {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C7T[] A02;
    public static final C7T A03;
    public static final C7T A04;
    public static final C7T A05;
    public static final C7T A06;
    public final int A00;

    public static C7T valueOf(String str) {
        return (C7T) Enum.valueOf(C7T.class, str);
    }

    public static C7T[] values() {
        return (C7T[]) A02.clone();
    }

    static {
        C7T c7t = new C7T("ONLY_ME", 0, 2131966229);
        A06 = c7t;
        C7T c7t2 = new C7T("CLOSE_FRIENDS", 1, 2131966227);
        A04 = c7t2;
        C7T c7t3 = new C7T("FOLLOWERS_YOU_FOLLOW_BACK", 2, 2131966228);
        A05 = c7t3;
        C7T c7t4 = new C7T("ALL_FOLLOWERS", 3, 2131966226);
        A03 = c7t4;
        C7T[] c7tArr = {c7t, c7t2, c7t3, c7t4};
        A02 = c7tArr;
        A01 = AbstractC12190kN.A00(c7tArr);
    }

    public C7T(String str, int i, int i2) {
        this.A00 = i2;
    }
}
