package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes7.dex */
public final class HIG extends AbstractC66412zI {
    public final UserSession A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A0D = AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.upcoming_event_button, false);
        return AbstractC37300Gc1.A03(AbstractC37303Gc4.A0Q(A0D, new C38430GvD(A0D)), "null cannot be cast to non-null type com.instagram.upcomingevents.bottomsheet.adapter.definition.UpcomingEventReminderButtonViewBinder.ViewHolder");
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        int i;
        C42340Ip2 c42340Ip2 = (C42340Ip2) interfaceC66482zP;
        C38430GvD c38430GvD = (C38430GvD) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c42340Ip2, c38430GvD);
        IgdsButton igdsButton = c38430GvD.A00;
        C51758Mth c51758Mth = c42340Ip2.A00;
        if (c51758Mth.A01 && !C14640oc.A00()) {
            igdsButton.setOverridePrismVariant(C1QL.A03);
        }
        C40985IDg c40985IDg = c42340Ip2.A01;
        int A0H = AbstractC166987dD.A0H(c51758Mth.A00);
        if (A0H != 0) {
            if (A0H == A1R) {
                if (c42340Ip2.A02) {
                    IA2.A00(igdsButton, R.drawable.instagram_alert_pano_outline_24);
                }
                igdsButton.setStyle(EnumC99704do.A03);
                igdsButton.setText(igdsButton.getContext().getString(2131976237));
                i = 45;
            } else {
                throw B4Z.A00();
            }
        } else {
            if (c42340Ip2.A02) {
                IA2.A00(igdsButton, R.drawable.instagram_alert_check_pano_filled_24);
            }
            igdsButton.setStyle(EnumC99704do.A06);
            igdsButton.setText(igdsButton.getContext().getString(2131976238));
            i = 44;
        }
        ViewOnClickListenerC42035Ik4.A01(igdsButton, i, c40985IDg);
        c40985IDg.A00.A08(igdsButton);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42340Ip2.class;
    }

    public HIG(UserSession userSession) {
        this.A00 = userSession;
    }
}
