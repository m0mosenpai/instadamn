package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.5HE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5HE extends C0T6 implements C5HF {
    public final List A00;

    public C5HE(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    @Override // X.C5HF
    public final C5HE Err() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C5HE) && C14360o3.A0K(this.A00, ((C5HE) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.C5HF
    public final List Act() {
        return this.A00;
    }

    @Override // X.C5HF
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsAssetRecommendationInfo", AbstractC39810HlK.A00(this));
    }
}
