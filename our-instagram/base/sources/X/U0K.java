package X;

import kotlin.enums.EnumEntries;
import org.webrtc.MediaStreamTrack;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class U0K {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ U0K[] A02;
    public static final U0K A03;
    public static final U0K A04;
    public static final U0K A05;
    public static final U0K A06;
    public static final U0K A07;
    public static final U0K A08;
    public final String A00;

    static {
        U0K u0k = new U0K("BLENDED", 0, "blended");
        A04 = u0k;
        U0K u0k2 = new U0K("USERS", 1, "users");
        A08 = u0k2;
        U0K u0k3 = new U0K("HASHTAG", 2, "hashtags");
        A05 = u0k3;
        U0K u0k4 = new U0K("PLACES", 3, "places");
        A07 = u0k4;
        U0K u0k5 = new U0K("AUDIO", 4, MediaStreamTrack.AUDIO_TRACK_KIND);
        A03 = u0k5;
        U0K u0k6 = new U0K("MAP", 5, "map");
        A06 = u0k6;
        U0K[] u0kArr = {u0k, u0k2, u0k3, u0k4, u0k5, u0k6, new U0K("EMPTY_SERP", 6, "empty_serp")};
        A02 = u0kArr;
        A01 = AbstractC12190kN.A00(u0kArr);
    }

    public static U0K valueOf(String str) {
        return (U0K) Enum.valueOf(U0K.class, str);
    }

    public static U0K[] values() {
        return (U0K[]) A02.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public U0K(String str, int i, String str2) {
        this.A00 = str2;
    }
}
