package X;

import com.facebook.R;

/* loaded from: classes8.dex */
public final class KNM extends L8Z {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof KNM) && C14360o3.A0K(this.A00, ((KNM) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public KNM(String str) {
        super(-3, Integer.valueOf(R.drawable.instagram_circle_play_pano_outline_24));
        this.A00 = str;
    }
}
