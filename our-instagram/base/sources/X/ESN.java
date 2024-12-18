package X;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class ESN extends C1P1 {
    public WeakReference A00;

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String A0p;
        int A03 = C0f9.A03(-425685088);
        C35155Fex c35155Fex = (C35155Fex) this.A00.get();
        if (c35155Fex != null) {
            c35155Fex.A00 = 2;
            C34708FQt c34708FQt = c35155Fex.A0A;
            c34708FQt.A00(2);
            C14360o3.A0B(abstractC115105If, 0);
            EJW ejw = c34708FQt.A00;
            if (ejw.isResumed()) {
                Context requireContext = ejw.requireContext();
                InterfaceC40821up A0L = AbstractC31172DnG.A0L(abstractC115105If);
                if (A0L == null || (A0p = A0L.getErrorMessage()) == null || A0p.length() <= 0) {
                    A0p = AbstractC166997dE.A0p(requireContext, 2131968430);
                }
                C9GR.A03(ejw.requireContext(), A0p, "onFetchSuggestedUsersFailure", 1);
            }
        }
        C0f9.A0A(1221512574, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(261601294);
        C35155Fex c35155Fex = (C35155Fex) this.A00.get();
        if (c35155Fex != null) {
            c35155Fex.A00 = 0;
            c35155Fex.A0A.A00(0);
        }
        C0f9.A0A(730055795, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(2094253880);
        ECD ecd = (ECD) obj;
        int A032 = C0f9.A03(799293700);
        C35155Fex c35155Fex = (C35155Fex) this.A00.get();
        if (c35155Fex != null) {
            c35155Fex.A00 = 1;
            c35155Fex.A0A.A00(1);
            c35155Fex.A04 = true;
            C34947FaX c34947FaX = c35155Fex.A09;
            Iterator A0i = AbstractC31177DnL.A0i(ecd.A00);
            while (A0i.hasNext()) {
                EB0 eb0 = (EB0) A0i.next();
                c34947FaX.A01.add(eb0);
                c34947FaX.A02.put(eb0.A04, eb0);
            }
            C34947FaX.A00(c34947FaX);
        }
        C0f9.A0A(1385377038, A032);
        C0f9.A0A(-381891297, A03);
    }
}
