package X;

import android.view.View;
import java.util.AbstractCollection;

/* loaded from: classes6.dex */
public final class E91 extends C0T6 implements InterfaceC66482zP {
    public final View.OnClickListener A00;
    public final C5QE A01;
    public final C5QE A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E91) {
                E91 e91 = (E91) obj;
                if (!C14360o3.A0K(this.A02, e91.A02) || !C14360o3.A0K(this.A01, e91.A01) || !C14360o3.A0K(this.A00, e91.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(AbstractCollection abstractCollection, Object[] objArr, int i) {
        abstractCollection.add(new E91(null, new BHS(objArr, i), null));
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0G(this.A02) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public E91(View.OnClickListener onClickListener, C5QE c5qe, C5QE c5qe2) {
        this.A02 = c5qe;
        this.A01 = c5qe2;
        this.A00 = onClickListener;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
