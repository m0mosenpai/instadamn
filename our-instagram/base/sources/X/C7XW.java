package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.7XW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7XW implements C7XX {
    public RecyclerView A00;
    public C7LE A01;
    public C7LI A02;
    public final AbstractC59962oe A03;
    public final UserSession A04;
    public final InterfaceC16820sZ A05;

    public C7XW(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(abstractC59962oe, 1);
        C14360o3.A0B(interfaceC16820sZ, 3);
        this.A03 = abstractC59962oe;
        this.A04 = userSession;
        this.A05 = interfaceC16820sZ;
    }

    @Override // X.C7XX
    public final void EnH(C7S5 c7s5, MessageIdentifier messageIdentifier, String str) {
        C7LI c7li;
        String str2;
        InterfaceC163557Ts BT6 = ((C7U0) this.A05.invoke()).BT6();
        String str3 = null;
        if (messageIdentifier != null && ((str3 = messageIdentifier.A00()) == null || str3.length() <= 0 || str3.equals("null"))) {
            str3 = messageIdentifier.A01;
        }
        int CNL = BT6.CNL(str3);
        if (CNL != -1) {
            RecyclerView recyclerView = this.A00;
            if (recyclerView == null) {
                str2 = "messageRecyclerView";
            } else {
                Object A0V = recyclerView.A0V(CNL);
                if ((A0V instanceof InterfaceC161737Mi) && (c7li = this.A02) != null) {
                    C7S5 Bkh = ((InterfaceC161737Mi) A0V).Bkh();
                    c7li.setVisibility(0);
                    A7H a7h = new A7H(20, AbstractC68632VYn.A00);
                    C7LE c7le = this.A01;
                    if (c7le == null) {
                        str2 = "emitterAnimationCanvasRenderer";
                    } else {
                        AbstractC22705A0b.A00(c7le, a7h, new WjR(c7s5, Bkh, this), str);
                        return;
                    }
                } else {
                    return;
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
    }
}
