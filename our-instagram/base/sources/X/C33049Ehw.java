package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ehw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33049Ehw extends C17T implements InterfaceC37270GbN {
    public List A00;

    public static final List A01(C1DY c1dy, C33049Ehw c33049Ehw) {
        ImmutableList A08 = c33049Ehw.A08(-917027213, ImmutablePandoUserDict.class);
        if (A08 != null) {
            ArrayList A0q = AbstractC167017dG.A0q(A08);
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                AbstractC31179DnN.A1I(c1dy, A0q, it);
            }
            return A0q;
        }
        return null;
    }

    @Override // X.InterfaceC37270GbN
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, FCE.A00(this));
    }

    @Override // X.InterfaceC37270GbN
    public final List AdW() {
        return this.A00;
    }

    @Override // X.InterfaceC37270GbN
    public final Integer AdY() {
        return getOptionalIntValueByHashCode(-2015407780);
    }

    @Override // X.InterfaceC37270GbN
    public final C32108E9g F7V(C1DY c1dy) {
        ArrayList arrayList;
        List A01 = A01(c1dy, this);
        if (A01 != null) {
            arrayList = AbstractC167017dG.A0q(A01);
            Iterator it = A01.iterator();
            while (it.hasNext()) {
                arrayList.add(c1dy.A00(AbstractC25226BEj.A15(it)));
            }
        } else {
            arrayList = null;
        }
        return new C32108E9g(getOptionalIntValueByHashCode(-2015407780), arrayList);
    }

    @Override // X.InterfaceC37270GbN
    public final C32108E9g F7W(C1DV c1dv) {
        return F7V(AbstractC25235BEs.A0b(c1dv));
    }
}
