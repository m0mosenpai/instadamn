package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C6W {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6W[] A01;
    public static final C6W A02;
    public static final C6W A03;
    public static final C6W A04;

    static {
        C6W c6w = new C6W("UseProfilePic", 0);
        A04 = c6w;
        C6W c6w2 = new C6W("ChooseNewPic", 1);
        A02 = c6w2;
        C6W c6w3 = new C6W("RemovePic", 2);
        A03 = c6w3;
        C6W[] c6wArr = {c6w, c6w2, c6w3};
        A01 = c6wArr;
        A00 = AbstractC12190kN.A00(c6wArr);
    }

    public static C6W valueOf(String str) {
        return (C6W) Enum.valueOf(C6W.class, str);
    }

    public static C6W[] values() {
        return (C6W[]) A01.clone();
    }

    public C6W(String str, int i) {
    }
}
