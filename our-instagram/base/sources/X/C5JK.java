package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5JK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5JK {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ C5JK[] A03;
    public static final C5JK A04;
    public static final C5JK A05;
    public static final C5JK A06;
    public static final C5JK A07;
    public final String A00;

    static {
        C5JK c5jk = new C5JK("CLIPS", 0, "clips");
        A05 = c5jk;
        C5JK c5jk2 = new C5JK("FEED_POST", 1, "feed_post");
        A06 = c5jk2;
        C5JK c5jk3 = new C5JK("PHOTO", 2, "photos");
        A07 = c5jk3;
        C5JK c5jk4 = new C5JK("CAROUSEL", 3, "carousel");
        A04 = c5jk4;
        C5JK[] c5jkArr = {c5jk, c5jk2, c5jk3, c5jk4, new C5JK("CLIPS_MEME_IT", 4, "clips_meme_it")};
        A03 = c5jkArr;
        A02 = AbstractC12190kN.A00(c5jkArr);
        C5JK[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (C5JK c5jk5 : values) {
            linkedHashMap.put(c5jk5.A00, c5jk5);
        }
        A01 = linkedHashMap;
    }

    public static C5JK valueOf(String str) {
        return (C5JK) Enum.valueOf(C5JK.class, str);
    }

    public static C5JK[] values() {
        return (C5JK[]) A03.clone();
    }

    public C5JK(String str, int i, String str2) {
        this.A00 = str2;
    }
}
