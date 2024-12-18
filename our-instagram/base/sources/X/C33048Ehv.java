package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ehv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33048Ehv extends C17T implements InterfaceC37276GbT {
    public List A00;

    @Override // X.InterfaceC37276GbT
    public final E9X F6y(C1DV c1dv) {
        C14360o3.A0B(c1dv, 0);
        return F6x(new C1DY(c1dv, 6, false));
    }

    @Override // X.InterfaceC37276GbT
    public final List CH6() {
        List list = this.A00;
        if (list == null) {
            return A0o(-810660181, C33047Ehu.class);
        }
        return list;
    }

    @Override // X.InterfaceC37276GbT
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC34285FAf.A00(this));
    }

    @Override // X.InterfaceC37276GbT
    public final String BPp() {
        return A0j(-1081138730);
    }

    @Override // X.InterfaceC37276GbT
    public final boolean BUt() {
        return getBooleanValueByHashCode(1024940639);
    }

    @Override // X.InterfaceC37276GbT
    public final InterfaceC37276GbT EC6(C1DY c1dy) {
        List<InterfaceC37275GbS> CH6 = CH6();
        ArrayList A0q = AbstractC167017dG.A0q(CH6);
        for (InterfaceC37275GbS interfaceC37275GbS : CH6) {
            interfaceC37275GbS.EC5(c1dy);
            A0q.add(interfaceC37275GbS);
        }
        this.A00 = A0q;
        return this;
    }

    @Override // X.InterfaceC37276GbT
    public final E9X F6x(C1DY c1dy) {
        String A0j = A0j(-1081138730);
        boolean booleanValueByHashCode = getBooleanValueByHashCode(1024940639);
        String A0k = A0k(-397914725);
        List CH6 = CH6();
        ArrayList A0q = AbstractC167017dG.A0q(CH6);
        Iterator it = CH6.iterator();
        while (it.hasNext()) {
            A0q.add(((InterfaceC37275GbS) it.next()).F6w(c1dy));
        }
        return new E9X(A0q, booleanValueByHashCode, A0j, A0k);
    }

    @Override // X.InterfaceC37276GbT
    public final String getPollId() {
        return A0k(-397914725);
    }
}
