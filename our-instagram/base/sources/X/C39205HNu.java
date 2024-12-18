package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImmutablePandoVideoVersion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HNu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39205HNu extends C17T implements InterfaceC43505JJr {
    @Override // X.InterfaceC43505JJr
    public final List CFe() {
        return A0o(713258463, ImmutablePandoVideoVersion.class);
    }

    @Override // X.InterfaceC43505JJr
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39830Hle.A00(this));
    }

    @Override // X.InterfaceC43505JJr
    public final C38704H2p EsF() {
        List CFe = CFe();
        ArrayList A0q = AbstractC167017dG.A0q(CFe);
        Iterator it = CFe.iterator();
        while (it.hasNext()) {
            AbstractC37303Gc4.A1Y(A0q, it);
        }
        return new C38704H2p(A0q);
    }
}
