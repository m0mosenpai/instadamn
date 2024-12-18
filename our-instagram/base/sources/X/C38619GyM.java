package X;

import com.instagram.api.schemas.ProductTaggingFeedComponentType;

/* renamed from: X.GyM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38619GyM extends C0T6 {
    public int A00;
    public C38684GzP A01;
    public ProductTaggingFeedComponentType A02;
    public String A03;

    public C38619GyM() {
        ProductTaggingFeedComponentType productTaggingFeedComponentType = ProductTaggingFeedComponentType.A0A;
        C38684GzP c38684GzP = new C38684GzP(null, 511);
        this.A02 = productTaggingFeedComponentType;
        this.A03 = "";
        this.A00 = 0;
        this.A01 = c38684GzP;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38619GyM) {
                C38619GyM c38619GyM = (C38619GyM) obj;
                if (this.A02 != c38619GyM.A02 || !C14360o3.A0K(this.A03, c38619GyM.A03) || this.A00 != c38619GyM.A00 || !C14360o3.A0K(this.A01, c38619GyM.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, (AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0G(this.A02)) + this.A00) * 31);
    }
}
