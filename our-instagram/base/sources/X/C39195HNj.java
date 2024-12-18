package X;

import com.instagram.api.schemas.ImmutablePandoIntentAwareAdsInfo;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HNj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39195HNj extends C17T implements JKB {
    public List A00;

    @Override // X.JKB
    public final IntentAwareAdsInfoIntf BIo() {
        return (IntentAwareAdsInfoIntf) A04(-1964130399, ImmutablePandoIntentAwareAdsInfo.class);
    }

    @Override // X.JKB
    public final List BVF() {
        List list = this.A00;
        if (list == null) {
            return A0o(557197200, C39178HMg.class);
        }
        return list;
    }

    @Override // X.JKB
    public final JKB E8r(C1DY c1dy) {
        List<InterfaceC43584JMs> BVF = BVF();
        ArrayList A0q = AbstractC167017dG.A0q(BVF);
        for (InterfaceC43584JMs interfaceC43584JMs : BVF) {
            interfaceC43584JMs.E8g(c1dy);
            A0q.add(interfaceC43584JMs);
        }
        this.A00 = A0q;
        return this;
    }

    @Override // X.JKB
    public final C38697H2i Es1(C1DY c1dy) {
        IntentAwareAdsInfo Evj = BIo().Evj();
        List BVF = BVF();
        ArrayList A0q = AbstractC167017dG.A0q(BVF);
        Iterator it = BVF.iterator();
        while (it.hasNext()) {
            AbstractC37303Gc4.A17(c1dy, A0q, it);
        }
        return new C38697H2i(Evj, A0q);
    }
}
