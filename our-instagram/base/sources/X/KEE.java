package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class KEE extends C7E1 implements InterfaceC152956uP {
    public final List A00;
    public final List A01;
    public final int A02;
    public final Context A03;
    public final KER A04;
    public final C215289g4 A05;
    public final Map A06;

    @Override // X.InterfaceC152956uP
    public final C153336v2 BQs(String str) {
        C14360o3.A0B(str, 0);
        return AbstractC37304Gc5.A0G(str, this.A06);
    }

    public KEE(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7OC c7oc, int i, int i2) {
        this.A03 = context;
        this.A02 = i;
        C215289g4 c215289g4 = new C215289g4(interfaceC11380iw, userSession, c7oc, i, i2);
        this.A05 = c215289g4;
        KER ker = new KER(context, null);
        this.A04 = ker;
        this.A01 = AbstractC166987dD.A1E();
        this.A00 = AbstractC166987dD.A1E();
        this.A06 = AbstractC166987dD.A1G();
        A0B(c215289g4, ker);
    }

    public static final void A00(KEE kee) {
        kee.A06();
        List list = kee.A01;
        if (!list.isEmpty()) {
            kee.A08(kee.A04, new C45127Jxw((C45127Jxw) null, AbstractC166997dE.A0q(kee.A03.getResources(), 2131971546)));
            double size = list.size();
            int i = kee.A02;
            int ceil = (int) Math.ceil(size / i);
            for (int i2 = 0; i2 < ceil; i2++) {
                C153126ug c153126ug = new C153126ug(list, i2 * i, i);
                C153336v2 BQs = kee.BQs(AbstractC166997dE.A0u(c153126ug));
                BQs.A00(i2, AbstractC167007dF.A1P(i2, ceil - 1));
                kee.A09(kee.A05, c153126ug, BQs);
            }
        }
        kee.A08(kee.A04, new C45127Jxw((C45127Jxw) null, AbstractC166997dE.A0q(kee.A03.getResources(), 2131952902)));
        List list2 = kee.A00;
        double size2 = list2.size();
        int i3 = kee.A02;
        int ceil2 = (int) Math.ceil(size2 / i3);
        for (int i4 = 0; i4 < ceil2; i4++) {
            C153126ug c153126ug2 = new C153126ug(list2, i4 * i3, i3);
            C153336v2 BQs2 = kee.BQs(AbstractC166997dE.A0u(c153126ug2));
            BQs2.A00(i4, AbstractC167007dF.A1P(i4, ceil2 - 1));
            kee.A09(kee.A05, c153126ug2, BQs2);
        }
        kee.A07();
    }
}
