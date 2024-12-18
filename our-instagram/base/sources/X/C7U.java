package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C7U {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C7U[] A02;
    public static final C7U A03;
    public static final C7U A04;
    public static final C7U A05;
    public static final C7U A06;
    public final int A00;

    public static C7U valueOf(String str) {
        return (C7U) Enum.valueOf(C7U.class, str);
    }

    public static C7U[] values() {
        return (C7U[]) A02.clone();
    }

    static {
        C7U c7u = new C7U("ALL", 0, R.drawable.instagram_media_pano_outline_24);
        A03 = c7u;
        C7U c7u2 = new C7U("VIDEO", 1, R.drawable.instagram_reels_pano_filled_24);
        A06 = c7u2;
        C7U c7u3 = new C7U("PHOTO", 2, R.drawable.instagram_photo_pano_filled_24);
        A05 = c7u3;
        C7U c7u4 = new C7U("CAROUSEL", 3, R.drawable.instagram_carousel_pano_filled_24);
        A04 = c7u4;
        C7U[] c7uArr = {c7u, c7u2, c7u3, c7u4};
        A02 = c7uArr;
        A01 = AbstractC12190kN.A00(c7uArr);
    }

    public C7U(String str, int i, int i2) {
        this.A00 = i2;
    }
}
