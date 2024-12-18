package X;

import com.instagram.mediakit.model.MediaKitInsightType;

/* loaded from: classes7.dex */
public final class H7W extends C0T6 implements JJ9 {
    public final MediaKitInsightType A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H7W) {
                H7W h7w = (H7W) obj;
                if (this.A00 != h7w.A00 || !C14360o3.A0K(this.A01, h7w.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public H7W(MediaKitInsightType mediaKitInsightType, String str) {
        AbstractC167017dG.A1P(mediaKitInsightType, str);
        this.A00 = mediaKitInsightType;
        this.A01 = str;
    }
}
