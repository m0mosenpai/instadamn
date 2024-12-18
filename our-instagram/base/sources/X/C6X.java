package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C6X {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6X[] A01;
    public static final C6X A02;
    public static final C6X A03;
    public static final C6X A04;

    static {
        C6X c6x = new C6X("FeedPost", 0);
        A02 = c6x;
        C6X c6x2 = new C6X("PostComposer", 1);
        A03 = c6x2;
        C6X c6x3 = new C6X("PostPreview", 2);
        A04 = c6x3;
        C6X[] c6xArr = {c6x, c6x2, c6x3};
        A01 = c6xArr;
        A00 = AbstractC12190kN.A00(c6xArr);
    }

    public static C6X valueOf(String str) {
        return (C6X) Enum.valueOf(C6X.class, str);
    }

    public static C6X[] values() {
        return (C6X[]) A01.clone();
    }

    public C6X(String str, int i) {
    }
}
