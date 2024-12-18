package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3ZF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3ZF {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ C3ZF[] A03;
    public static final C3ZF A04;
    public static final C3ZF A05;
    public static final C3ZF A06;
    public final String A00;

    static {
        C3ZF c3zf = new C3ZF("FEED_RECS", 0, "feed_recs");
        A05 = c3zf;
        C3ZF c3zf2 = new C3ZF("OLDER_POSTS", 1, "past_posts");
        A06 = c3zf2;
        C3ZF c3zf3 = new C3ZF("FAVORITES", 2, "feed_favorites");
        A04 = c3zf3;
        C3ZF[] c3zfArr = {c3zf, c3zf2, c3zf3};
        A03 = c3zfArr;
        A02 = AbstractC12190kN.A00(c3zfArr);
        C3ZF[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (C3ZF c3zf4 : values) {
            linkedHashMap.put(c3zf4.A00, c3zf4);
        }
        A01 = linkedHashMap;
    }

    public static C3ZF valueOf(String str) {
        return (C3ZF) Enum.valueOf(C3ZF.class, str);
    }

    public static C3ZF[] values() {
        return (C3ZF[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public C3ZF(String str, int i, String str2) {
        this.A00 = str2;
    }
}
