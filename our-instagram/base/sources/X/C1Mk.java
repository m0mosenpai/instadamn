package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1Mk, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Mk {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C1Mk[] A02;
    public static final C1Mk A03;
    public static final C1Mk A04;
    public static final C1Mk A05;
    public static final C1Mk A06;
    public static final C1Mk A07;
    public final float A00;

    static {
        C1Mk c1Mk = new C1Mk("IMAGE", 0, 0.25f);
        A04 = c1Mk;
        C1Mk c1Mk2 = new C1Mk("VIDEO", 1, 0.25f);
        A07 = c1Mk2;
        C1Mk c1Mk3 = new C1Mk("SUBTITLES", 2, 0.1f);
        A06 = c1Mk3;
        C1Mk c1Mk4 = new C1Mk("REMOTE_ASSETS", 3, 0.1f);
        A05 = c1Mk4;
        C1Mk c1Mk5 = new C1Mk("GIFS", 4, 0.05f);
        A03 = c1Mk5;
        C1Mk[] c1MkArr = {c1Mk, c1Mk2, c1Mk3, c1Mk4, c1Mk5, new C1Mk("FREE_SPACE", 5, 0.25f)};
        A02 = c1MkArr;
        A01 = AbstractC12190kN.A00(c1MkArr);
        float f = 0.0f;
        for (C1Mk c1Mk6 : values()) {
            f += c1Mk6.A00;
        }
        if (f > 1.0f) {
            throw new IllegalArgumentException("Cache fractions sum up to more than 100%!");
        }
    }

    public static C1Mk valueOf(String str) {
        return (C1Mk) Enum.valueOf(C1Mk.class, str);
    }

    public static C1Mk[] values() {
        return (C1Mk[]) A02.clone();
    }

    public C1Mk(String str, int i, float f) {
        this.A00 = f;
    }
}
