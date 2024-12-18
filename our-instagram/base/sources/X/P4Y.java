package X;

import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class P4Y implements InterfaceC58153PqI {
    public final int A00;
    public final Object A01;

    public P4Y(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC58153PqI
    public final void DVA() {
        C122145g6 c122145g6;
        FragmentActivity requireActivity;
        UserSession A0r;
        C52572NNs c52572NNs;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            N6C n6c = (N6C) obj;
            C50992Mfz c50992Mfz = (C50992Mfz) n6c.A0F.getValue();
            InterfaceC09390do interfaceC09390do = n6c.A0G;
            c50992Mfz.A00(MSW.A0g(interfaceC09390do).A00, MSW.A0g(interfaceC09390do).A03);
            Parcelable.Creator creator = User.CREATOR;
            c122145g6 = new C122145g6(AbstractC31177DnL.A0j(new User(MSW.A0g(interfaceC09390do).A0E, MSW.A0g(interfaceC09390do).A0F)));
            requireActivity = n6c.requireActivity();
            A0r = MSW.A0g(interfaceC09390do).A0B;
            c52572NNs = n6c;
        } else {
            C52572NNs c52572NNs2 = (C52572NNs) obj;
            C50992Mfz c50992Mfz2 = (C50992Mfz) c52572NNs2.A03.getValue();
            InterfaceC09390do interfaceC09390do2 = c52572NNs2.A04;
            c50992Mfz2.A00(((AbstractC51031Mge) interfaceC09390do2.getValue()).A00, ((NP0) interfaceC09390do2.getValue()).A00);
            Parcelable.Creator creator2 = User.CREATOR;
            c122145g6 = new C122145g6(AbstractC31177DnL.A0j(new User(((NP0) interfaceC09390do2.getValue()).A06, ((NP0) interfaceC09390do2.getValue()).A07)));
            requireActivity = c52572NNs2.requireActivity();
            A0r = AbstractC166987dD.A0r(c52572NNs2.A0G);
            c52572NNs = c52572NNs2;
        }
        C36881nl A01 = C36881nl.A01(requireActivity, c52572NNs, A0r, "direct_thread");
        A01.A0B = c122145g6;
        A01.A0s = true;
        A01.A06();
    }

    @Override // X.InterfaceC58153PqI
    public final void onDismiss() {
        if (this.A00 != 0) {
            N6C.A01((N6C) this.A01);
        } else {
            C52572NNs.A02((C52572NNs) this.A01, true);
        }
    }

    @Override // X.InterfaceC58153PqI
    public final void onShow() {
        C50992Mfz c50992Mfz;
        String str;
        boolean z;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            N6C n6c = (N6C) obj;
            c50992Mfz = (C50992Mfz) n6c.A0F.getValue();
            InterfaceC09390do interfaceC09390do = n6c.A0G;
            str = MSW.A0g(interfaceC09390do).A00;
            z = MSW.A0g(interfaceC09390do).A03;
        } else {
            C52572NNs c52572NNs = (C52572NNs) obj;
            c50992Mfz = (C50992Mfz) c52572NNs.A03.getValue();
            InterfaceC09390do interfaceC09390do2 = c52572NNs.A04;
            str = ((AbstractC51031Mge) interfaceC09390do2.getValue()).A00;
            z = ((NP0) interfaceC09390do2.getValue()).A00;
        }
        c50992Mfz.A02(str, z);
    }

    @Override // X.InterfaceC58153PqI
    public final void Dar() {
        throw C00O.createAndThrow();
    }
}
