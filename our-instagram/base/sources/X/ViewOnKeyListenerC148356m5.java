package X;

import android.view.KeyEvent;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;

/* renamed from: X.6m5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnKeyListenerC148356m5 implements View.OnKeyListener {
    public boolean A00;
    public boolean A01;
    public final AbstractC59962oe A02;
    public final UserSession A03;
    public final InterfaceC1119353f A04;
    public final C145826hf A05;
    public final C148176ln A06;
    public final InterfaceC1118853a A07;
    public final C147046jg A08;
    public final InterfaceC147516kc A09;

    public ViewOnKeyListenerC148356m5(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC1119353f interfaceC1119353f, C145826hf c145826hf, C148176ln c148176ln, InterfaceC1118853a interfaceC1118853a, InterfaceC147516kc interfaceC147516kc, C147046jg c147046jg) {
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c148176ln, 3);
        C14360o3.A0B(c147046jg, 4);
        C14360o3.A0B(interfaceC147516kc, 5);
        C14360o3.A0B(c145826hf, 6);
        this.A02 = abstractC59962oe;
        this.A03 = userSession;
        this.A06 = c148176ln;
        this.A08 = c147046jg;
        this.A09 = interfaceC147516kc;
        this.A05 = c145826hf;
        this.A07 = interfaceC1118853a;
        this.A04 = interfaceC1119353f;
        this.A00 = true;
    }

    public final void A00(C45026JwH c45026JwH, C41181vS c41181vS, C41551w4 c41551w4) {
        User user = c41181vS.A0i;
        if (user != null) {
            DirectShareTarget A00 = AbstractC140386Ws.A00(user, false);
            C38321qM c38321qM = c41181vS.A0b;
            if (c38321qM != null) {
                String id = user.getId();
                String str = c41181vS.A0k;
                C14360o3.A07(str);
                C45092JxM c45092JxM = new C45092JxM(c38321qM, A00, id, str, "", "reel", c41551w4.A0B);
                c45092JxM.A00 = c45026JwH.A01;
                c45092JxM.A03 = false;
                C28531Zo.A04.A0D(this.A03, c45092JxM.A00(), "reel", "");
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(keyEvent, 2);
        return this.A09.onKey(view, i, keyEvent);
    }
}
