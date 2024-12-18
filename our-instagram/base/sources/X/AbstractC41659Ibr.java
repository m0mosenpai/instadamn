package X;

import android.widget.TextView;
import com.instagram.ui.widget.expandingtextview.ExpandingEllipsizingTextView;

/* renamed from: X.Ibr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41659Ibr {
    public static final void A00(C38510GwV c38510GwV, C42329Ior c42329Ior) {
        InterfaceC09390do interfaceC09390do = c38510GwV.A04;
        TextView A06 = AbstractC37302Gc3.A06(interfaceC09390do);
        C38659Gz0 c38659Gz0 = c42329Ior.A00;
        A06.setText(c38659Gz0.A03);
        ((ExpandingEllipsizingTextView) AbstractC166987dD.A17(interfaceC09390do)).setOnExpandedStateChangeListener(new J1A(c42329Ior));
        boolean z = c38659Gz0.A0A;
        ExpandingEllipsizingTextView expandingEllipsizingTextView = (ExpandingEllipsizingTextView) AbstractC166987dD.A17(interfaceC09390do);
        if (z) {
            expandingEllipsizingTextView.A04(false);
        } else {
            expandingEllipsizingTextView.A03(false);
        }
    }

    public static final void A01(C38510GwV c38510GwV, C42329Ior c42329Ior) {
        InterfaceC09390do interfaceC09390do = c38510GwV.A09;
        TextView A06 = AbstractC37302Gc3.A06(interfaceC09390do);
        C38659Gz0 c38659Gz0 = c42329Ior.A00;
        A06.setText(c38659Gz0.A08);
        if (c38659Gz0.A0B) {
            AbstractC167007dF.A0L(interfaceC09390do).setContentDescription(AbstractC167007dF.A0L(interfaceC09390do).getContext().getString(2131968963, c38659Gz0.A06, c38659Gz0.A07));
        }
    }

    public static final void A02(C38510GwV c38510GwV, CharSequence charSequence) {
        if (charSequence == null) {
            AbstractC167007dF.A0L(c38510GwV.A06).setVisibility(8);
            return;
        }
        InterfaceC09390do interfaceC09390do = c38510GwV.A06;
        AbstractC167007dF.A0L(interfaceC09390do).setVisibility(0);
        AbstractC37302Gc3.A06(interfaceC09390do).setText(charSequence);
    }
}
