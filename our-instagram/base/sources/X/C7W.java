package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C7W {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C7W[] A02;
    public static final C7W A03;
    public static final C7W A04;
    public static final C7W A05;
    public static final C7W A06;
    public static final C7W A07;
    public final float A00;

    public static C7W valueOf(String str) {
        return (C7W) Enum.valueOf(C7W.class, str);
    }

    public static C7W[] values() {
        return (C7W[]) A02.clone();
    }

    static {
        C7W c7w = new C7W("SMALL_VERY_COMPACT", 0, 8.0f);
        A07 = c7w;
        C7W c7w2 = new C7W("SMALL_COMPACT", 1, 10.0f);
        A06 = c7w2;
        C7W c7w3 = new C7W("SMALL", 2, 10.0f);
        A05 = c7w3;
        C7W c7w4 = new C7W("POST_ACTION", 3, 10.0f);
        A04 = c7w4;
        C7W c7w5 = new C7W("LARGE", 4, 18.0f);
        A03 = c7w5;
        C7W[] c7wArr = {c7w, c7w2, c7w3, c7w4, c7w5, new C7W("ICON", 5, 8.0f)};
        A02 = c7wArr;
        A01 = AbstractC12190kN.A00(c7wArr);
    }

    public C7W(String str, int i, float f) {
        this.A00 = f;
    }
}
