package X;

import com.instagram.clips.audio.model.AudioPageAssetModel;

/* renamed from: X.NdS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53053NdS extends AbstractC53585Nmr {
    public final AudioPageAssetModel A00;
    public final boolean A01;
    public final String A02;

    public C53053NdS(AudioPageAssetModel audioPageAssetModel, String str, boolean z) {
        C14360o3.A0B(str, 2);
        this.A01 = z;
        this.A02 = str;
        this.A00 = audioPageAssetModel;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53053NdS) {
                C53053NdS c53053NdS = (C53053NdS) obj;
                if (this.A01 != c53053NdS.A01 || !C14360o3.A0K(this.A02, c53053NdS.A02) || !C14360o3.A0K(this.A00, c53053NdS.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0K(this.A02, AbstractC25225BEi.A08(this.A01)));
    }
}
