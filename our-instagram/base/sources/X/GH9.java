package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* loaded from: classes6.dex */
public final class GH9 implements C7XU {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public GH9(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj3;
        this.A01 = obj;
        this.A03 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C7XU
    public final void DAy() {
        C189478aR c189478aR;
        Activity activity;
        Fragment A00;
        Object obj;
        switch (this.A00) {
            case 0:
                c189478aR = (C189478aR) this.A03;
                activity = (Activity) this.A01;
                obj = this.A02;
                A00 = (Fragment) obj;
                c189478aR.A02(activity, A00);
                return;
            case 1:
                Activity activity2 = (Activity) this.A02;
                C3DN A0r = AbstractC31172DnG.A0r(activity2);
                if (A0r != null) {
                    A0r.A0Q(null);
                }
                C32785Ebp c32785Ebp = (C32785Ebp) this.A03;
                String A0g = AbstractC31171DnF.A0g(this.A01);
                InterfaceC09390do interfaceC09390do = c32785Ebp.A06;
                AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
                String A15 = AbstractC25225BEi.A15(c32785Ebp.A01);
                C34416FFg c34416FFg = new C34416FFg(c32785Ebp);
                AbstractC167017dG.A1O(A0o, A15);
                Bundle A0D = AbstractC31174DnI.A0D(A0o);
                A0D.putString("arg_key_creator_user_id", A0g);
                A0D.putString("arg_key_thread_id", A15);
                EN6 en6 = new EN6();
                en6.setArguments(A0D);
                en6.A01 = c34416FFg;
                C189448aO A0g2 = AbstractC25231BEo.A0g(interfaceC09390do);
                A0g2.A17 = true;
                A0g2.A0U = en6;
                AbstractC31173DnH.A0w(activity2, en6, A0g2);
                return;
            case 2:
                c189478aR = ((C189448aO) this.A02).A00();
                activity = (Activity) this.A01;
                obj = this.A03;
                A00 = (Fragment) obj;
                c189478aR.A02(activity, A00);
                return;
            case 3:
                c189478aR = (C189478aR) this.A02;
                activity = (Activity) this.A01;
                A00 = ((C34726FRp) this.A03).A00();
                c189478aR.A02(activity, A00);
                return;
            case 4:
                C7XU c7xu = (C7XU) this.A02;
                if (c7xu != null) {
                    c7xu.DAy();
                }
                C3DO c3do = C3DN.A00;
                KBU kbu = (KBU) this.A03;
                C3DN A002 = c3do.A00(kbu.getActivity());
                if (A002 != null) {
                    A002.A0Q(null);
                }
                InterfaceC50486MQo interfaceC50486MQo = kbu.A04;
                if (interfaceC50486MQo == null) {
                    return;
                }
                interfaceC50486MQo.DI2(kbu.A01, (InterfaceC88183wS) this.A01);
                return;
            case 5:
                AbstractC167007dF.A0J().post(new GPV((Context) this.A01, (C31727DwY) this.A03, (C7XU) this.A02));
                return;
            default:
                c189478aR = (C189478aR) this.A01;
                activity = ((GBV) this.A03).A00;
                obj = this.A02;
                A00 = (Fragment) obj;
                c189478aR.A02(activity, A00);
                return;
        }
    }

    @Override // X.C7XU
    public final void DB3() {
        switch (this.A00) {
            case 4:
            case 5:
                C7XU c7xu = (C7XU) this.A02;
                if (c7xu == null) {
                    return;
                }
                c7xu.DB3();
                return;
            default:
                return;
        }
    }
}
