package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes7.dex */
public final class HI3 extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A0D = AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.upcoming_event_reminder_text_row_item, false);
        return AbstractC37300Gc1.A03(AbstractC37303Gc4.A0Q(A0D, new C38432GvF(A0D)), "null cannot be cast to non-null type com.instagram.upcomingevents.bottomsheet.adapter.definition.UpcomingEventReminderTextRowItemViewBinder.ViewHolder");
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C42291IoF c42291IoF = (C42291IoF) interfaceC66482zP;
        C38432GvF c38432GvF = (C38432GvF) c3oo;
        AbstractC167017dG.A1N(c42291IoF, c38432GvF);
        IgTextView igTextView = c38432GvF.A00;
        igTextView.setText(BHX.A00(AbstractC166997dE.A0L(igTextView), (C5QE) c42291IoF.A00.A00));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42291IoF.class;
    }
}
