package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.H2t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38707H2t extends C0T6 implements C5FM {
    public final String A00;

    @Override // X.C5FM
    public final C38707H2t EsQ() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C38707H2t) && C14360o3.A0K(this.A00, ((C38707H2t) obj).A00));
    }

    @Override // X.C5FM
    public final String BH2() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC167017dG.A0O(this.A00);
    }

    public C38707H2t(String str) {
        this.A00 = str;
    }

    @Override // X.C5FM
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        String str = this.A00;
        if (str != null) {
            A0X.put("imagine_create_media_url", str);
        }
        return AbstractC37300Gc1.A05("XDTCommentImagineCreateMediaInfo", AbstractC06930Yk.A0B(A0X));
    }
}
