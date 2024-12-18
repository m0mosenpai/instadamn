package X;

import com.facebook.R;

/* loaded from: classes8.dex */
public final class KNN extends L8Z {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KNN) {
                KNN knn = (KNN) obj;
                if (this.A00 != knn.A00 || !C14360o3.A0K(this.A01, knn.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, this.A00 * 31);
    }

    public KNN(int i, String str) {
        super(i, Integer.valueOf(R.drawable.instagram_glasses_pano_outline_24));
        this.A00 = i;
        this.A01 = str;
    }
}
