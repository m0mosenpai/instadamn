package X;

import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.CAb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27459CAb {
    public final void A00(C9BH c9bh) {
        if (this instanceof C27218Bzd) {
            ViewOnClickListenerC28666ClE.A01(((C27218Bzd) this).A01, 2, c9bh);
        }
    }

    public final void A01(C9BH c9bh, InterfaceC104934o6 interfaceC104934o6) {
        IgdsButton igdsButton;
        IgdsButton igdsButton2;
        Integer A05;
        Integer A052;
        if (this instanceof C27218Bzd) {
            C27218Bzd c27218Bzd = (C27218Bzd) this;
            igdsButton = c27218Bzd.A02;
            igdsButton2 = c27218Bzd.A03;
        } else {
            C27217Bzc c27217Bzc = (C27217Bzc) this;
            igdsButton = c27217Bzc.A00;
            igdsButton2 = c27217Bzc.A01;
        }
        boolean A1R = AbstractC167007dF.A1R(0, igdsButton, igdsButton2);
        String BWT = interfaceC104934o6.BWT();
        if (BWT != null && (A052 = AbstractC65877Tvg.A05(BWT)) != null) {
            igdsButton.A02(EnumC99774dy.A03, A052.intValue());
            igdsButton.setIconPadding(AbstractC25228BEl.A0M(igdsButton).getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material));
        }
        igdsButton.setText(interfaceC104934o6.BWU());
        ViewOnClickListenerC28666ClE.A01(igdsButton, 0, c9bh);
        String Bel = interfaceC104934o6.Bel();
        if (Bel != null && (A05 = AbstractC65877Tvg.A05(Bel)) != null) {
            igdsButton2.A02(EnumC99774dy.A03, A05.intValue());
            igdsButton2.setIconPadding(AbstractC25228BEl.A0M(igdsButton2).getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material));
        }
        igdsButton2.setText(interfaceC104934o6.Bem());
        ViewOnClickListenerC28666ClE.A01(igdsButton2, A1R ? 1 : 0, c9bh);
    }

    public final void A02(InterfaceC104934o6 interfaceC104934o6) {
        if (this instanceof C27218Bzd) {
            ((C27218Bzd) this).A00.setText(interfaceC104934o6.getText());
        }
    }
}
