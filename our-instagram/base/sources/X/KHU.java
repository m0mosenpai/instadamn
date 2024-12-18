package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgCheckBox;
import com.instagram.direct.fragment.thread.poll.view.PollMessageOptionViewModel;
import com.instagram.direct.fragment.thread.poll.view.PollMessageVoterInfoViewModel;
import com.instagram.direct.ui.polls.PollMessageVotersView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class KHU extends AbstractC66412zI {
    public final L6H A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44667JqC(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.poll_message_option_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        PollMessageOptionViewModel pollMessageOptionViewModel = (PollMessageOptionViewModel) interfaceC66482zP;
        C44667JqC c44667JqC = (C44667JqC) c3oo;
        AbstractC167007dF.A1K(pollMessageOptionViewModel, c44667JqC);
        IgCheckBox igCheckBox = c44667JqC.A00;
        igCheckBox.setText(pollMessageOptionViewModel.A04);
        igCheckBox.setChecked(pollMessageOptionViewModel.A06);
        igCheckBox.setOnCheckedChangeListener(new LRF(3, this, pollMessageOptionViewModel));
        List list = pollMessageOptionViewModel.A05;
        if (AbstractC166987dD.A1b(list)) {
            PollMessageVotersView pollMessageVotersView = c44667JqC.A01;
            pollMessageVotersView.setVisibility(0);
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0q.add(((PollMessageVoterInfoViewModel) it.next()).A00);
            }
            int i = pollMessageOptionViewModel.A00;
            if (i == 0) {
                i = list.size();
            }
            pollMessageVotersView.A00(A0q, i);
            ViewOnClickListenerC48066LPr.A00(pollMessageVotersView, 53, pollMessageOptionViewModel, this);
            pollMessageVotersView.setContentDescription(pollMessageOptionViewModel.A02);
            return;
        }
        c44667JqC.A01.setVisibility(8);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return PollMessageOptionViewModel.class;
    }

    public KHU(L6H l6h) {
        this.A00 = l6h;
    }
}
