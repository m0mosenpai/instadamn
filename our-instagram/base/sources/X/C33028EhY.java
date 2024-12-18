package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EhY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33028EhY extends C17T implements InterfaceC81183jn {
    @Override // X.InterfaceC81183jn
    public final List BdF() {
        return A0o(1174631302, Eh5.class);
    }

    @Override // X.InterfaceC81183jn
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC31217Do0.A00(this));
    }

    @Override // X.InterfaceC81183jn
    public final Boolean BCU() {
        return getOptionalBooleanValueByHashCode(-161366719);
    }

    @Override // X.InterfaceC81183jn
    public final C81173jm Ey0() {
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-161366719);
        List BdF = BdF();
        ArrayList A0q = AbstractC167017dG.A0q(BdF);
        Iterator it = BdF.iterator();
        while (it.hasNext()) {
            A0q.add(((C44Q) it.next()).Erk());
        }
        return new C81173jm(optionalBooleanValueByHashCode, A0q);
    }
}
