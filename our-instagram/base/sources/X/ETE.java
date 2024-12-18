package X;

import android.content.Context;
import androidx.fragment.app.Fragment;

/* loaded from: classes6.dex */
public abstract class ETE extends C1P1 {
    public final Fragment A00;
    public final AbstractC12990ll A01;
    public final EnumC31713DwI A02;

    public ETE(Fragment fragment, AbstractC12990ll abstractC12990ll, EnumC31713DwI enumC31713DwI) {
        this.A01 = abstractC12990ll;
        this.A00 = fragment;
        this.A02 = enumC31713DwI;
    }

    public void A00(EDY edy) {
        int A03 = C0f9.A03(-803962001);
        Fragment fragment = this.A00;
        if (fragment.getContext() != null && fragment.isResumed()) {
            C193328hC A0c = AbstractC31176DnK.A0c(fragment);
            A0c.A05 = edy.A07;
            A0c.A0r(edy.A03);
            AbstractC31176DnK.A15(DialogInterfaceOnClickListenerC35453FkA.A00(this, 39), A0c);
        }
        C0f9.A0A(1754676117, A03);
    }

    @Override // X.C1P1
    public void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-171478022);
        Fragment fragment = this.A00;
        if (fragment.getContext() != null && fragment.isResumed()) {
            if (abstractC115105If instanceof C115115Ig) {
                EDY edy = (EDY) abstractC115105If.A00();
                Context context = fragment.getContext();
                String str = edy.mErrorTitle;
                String str2 = edy.A06;
                C14360o3.A0B(context, 0);
                AbstractC35254Fgn.A06(context, str2, str);
            } else {
                AbstractC35254Fgn.A01(fragment.getContext());
            }
        }
        C0f9.A0A(513160065, A03);
    }
}
