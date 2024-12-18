package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.ARt, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC23235ARt implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AAU A01;

    public ViewOnClickListenerC23235ARt(AAU aau, int i) {
        this.A01 = aau;
        this.A00 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1720166881);
        AAU aau = this.A01;
        int i = this.A00;
        AbstractC59962oe abstractC59962oe = aau.A05;
        if (abstractC59962oe.mFragmentManager != null) {
            UserSession userSession = aau.A06;
            Bundle A0b = AbstractC166987dD.A0b();
            AbstractC03240Dh.A00(A0b, userSession);
            A0b.putInt(MSV.A00(948), i);
            N4O n4o = new N4O();
            n4o.setArguments(A0b);
            C189448aO c189448aO = new C189448aO(userSession);
            c189448aO.A0d = aau.A03.getString(2131967974);
            c189448aO.A0U = new C24116An1(aau, 4);
            aau.A01 = c189448aO.A00();
            aau.A02 = true;
            aau.A08.A00.A0G();
            C189478aR c189478aR = aau.A01;
            if (c189478aR != null) {
                c189478aR.A0D(abstractC59962oe.requireActivity(), n4o);
            }
        }
        C0f9.A0C(-1802378675, A05);
    }
}
