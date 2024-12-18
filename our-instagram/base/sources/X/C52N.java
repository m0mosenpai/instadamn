package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MediaNoteMimicryType;
import java.util.List;

/* renamed from: X.52N, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C52N extends C0T6 implements C52O {
    public final MediaNoteMimicryType A00;
    public final List A01;

    @Override // X.C52O
    public final C52N EwK() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52N) {
                C52N c52n = (C52N) obj;
                if (!C14360o3.A0K(this.A01, c52n.A01) || this.A00 != c52n.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A01;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        MediaNoteMimicryType mediaNoteMimicryType = this.A00;
        return hashCode + (mediaNoteMimicryType != null ? mediaNoteMimicryType.hashCode() : 0);
    }

    @Override // X.C52O
    public final List CB5() {
        return this.A01;
    }

    @Override // X.C52O
    public final MediaNoteMimicryType CBW() {
        return this.A00;
    }

    @Override // X.C52O
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMediaNoteMimicryStrategyDict", CDK.A00(this));
    }

    public C52N(MediaNoteMimicryType mediaNoteMimicryType, List list) {
        this.A01 = list;
        this.A00 = mediaNoteMimicryType;
    }
}
