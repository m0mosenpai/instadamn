package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EPS extends EPU {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EPS(C012804r c012804r, Integer num, Object obj, String str, int i, int i2) {
        super(c012804r, num, str, i);
        this.A00 = i2;
        this.A01 = obj;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Context requireContext;
        UserSession session;
        C2Fb c2Fb;
        String str;
        if (this.A00 != 0) {
            EKR ekr = (EKR) this.A01;
            requireContext = ekr.requireContext();
            session = AbstractC166987dD.A0r(ekr.A04);
            c2Fb = C2Fb.A1W;
            str = "https://help.instagram.com/179379842258600";
        } else {
            AbstractC32348EMv abstractC32348EMv = (AbstractC32348EMv) this.A01;
            requireContext = abstractC32348EMv.requireContext();
            session = abstractC32348EMv.getSession();
            c2Fb = C2Fb.A1W;
            str = "https://help.instagram.com/477434105621119/?helpref=hc_fnav";
        }
        AbstractC31177DnL.A0u(requireContext, session, c2Fb, str);
    }
}
