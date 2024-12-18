package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes7.dex */
public final class HI4 extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A0D = AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.upcoming_event_button, false);
        return AbstractC37300Gc1.A03(AbstractC37303Gc4.A0Q(A0D, new C38433GvG(A0D)), "null cannot be cast to non-null type com.instagram.upcomingevents.bottomsheet.adapter.definition.UpcomingEventShareToStoryButtonViewBinder.ViewHolder");
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C42311IoZ c42311IoZ = (C42311IoZ) interfaceC66482zP;
        C38433GvG c38433GvG = (C38433GvG) c3oo;
        AbstractC167017dG.A1N(c42311IoZ, c38433GvG);
        IgdsButton igdsButton = c38433GvG.A00;
        if (c42311IoZ.A01) {
            IA2.A00(igdsButton, R.drawable.instagram_new_story_pano_outline_24);
        }
        igdsButton.setText(igdsButton.getContext().getString(2131976225));
        ViewOnClickListenerC42035Ik4.A01(igdsButton, 46, c42311IoZ);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42311IoZ.class;
    }
}
