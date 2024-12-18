package X;

import com.facebook.R;

/* loaded from: classes8.dex */
public final class KNK extends L8Z {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof KNK) && C14360o3.A0K(this.A00, ((KNK) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public KNK(String str) {
        super(-2, Integer.valueOf(R.drawable.instagram_photo_pano_filled_24));
        this.A00 = str;
    }
}
