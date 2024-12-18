package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8KX, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8KX {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C8KX[] A01;
    public static final C8KX A02;
    public static final C8KX A03;
    public static final C8KX A04;
    public static final C8KX A05;
    public static final C8KX A06;
    public static final C8KX A07;

    static {
        C8KX c8kx = new C8KX("CONCEPT_SCORES", 0);
        A03 = c8kx;
        C8KX c8kx2 = new C8KX("AESTHETICS_SCORES", 1);
        A02 = c8kx2;
        C8KX c8kx3 = new C8KX("OFFENSIVE_SCORES", 2);
        A06 = c8kx3;
        C8KX c8kx4 = new C8KX("OCCLUSION", 3);
        A05 = c8kx4;
        C8KX c8kx5 = new C8KX("EMBEDDINGS", 4);
        A04 = c8kx5;
        C8KX c8kx6 = new C8KX("VISUAL_EMBEDDINGS", 5);
        A07 = c8kx6;
        C8KX[] c8kxArr = {c8kx, c8kx2, c8kx3, c8kx4, c8kx5, c8kx6};
        A01 = c8kxArr;
        A00 = AbstractC12190kN.A00(c8kxArr);
    }

    public static C8KX valueOf(String str) {
        return (C8KX) Enum.valueOf(C8KX.class, str);
    }

    public static C8KX[] values() {
        return (C8KX[]) A01.clone();
    }

    public C8KX(String str, int i) {
    }
}
