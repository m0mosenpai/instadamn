package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.igds.components.button.IgdsRadioButton;
import java.util.List;

/* loaded from: classes6.dex */
public final class E05 extends C2UU {
    public static final List A00 = AbstractC166987dD.A1E();

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        AbstractC33545EsJ abstractC33545EsJ = EnumC33383EpG.values()[getItemViewType(i)].A00;
        List list = A00;
        if (abstractC33545EsJ instanceof C32825EcT) {
            boolean A1Y = AbstractC25229BEm.A1Y(list);
            Object obj = list.get(i);
            C14360o3.A0C(obj, AbstractC111324zv.A00(1145));
            AbstractC35093Fd4.A02((C31335Dq0) obj, (E1F) c3oo, A1Y, A1Y);
            return;
        }
        if (!(abstractC33545EsJ instanceof C32824EcS)) {
            return;
        }
        Object obj2 = list.get(i);
        C31966E2u c31966E2u = (C31966E2u) c3oo;
        C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.direct.inbox.professional.DirectInboxFilterOptionsAdapter.FilterOptionModel");
        C33611EtN c33611EtN = (C33611EtN) obj2;
        View view = c31966E2u.A00;
        TextView textView = c31966E2u.A01;
        IgdsRadioButton igdsRadioButton = c31966E2u.A03;
        IgSimpleImageView igSimpleImageView = c31966E2u.A02;
        textView.setText(c33611EtN.A02);
        igdsRadioButton.setChecked(c33611EtN.A03);
        FpQ.A01(view, 38, c33611EtN, igdsRadioButton);
        Integer num = c33611EtN.A01;
        if (num == null) {
            return;
        }
        igSimpleImageView.setImageResource(num.intValue());
        igSimpleImageView.setVisibility(0);
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        AbstractC33545EsJ abstractC33545EsJ = EnumC33383EpG.values()[i].A00;
        if (abstractC33545EsJ instanceof C32825EcT) {
            return AbstractC35093Fd4.A00(viewGroup.getContext(), viewGroup, false);
        }
        boolean z = abstractC33545EsJ instanceof C32824EcS;
        LayoutInflater A0P = AbstractC25228BEl.A0P(viewGroup);
        if (z) {
            return new C31966E2u(AbstractC25227BEk.A0D(A0P, viewGroup, R.layout.direct_inbox_filter_option, false));
        }
        View A0D = AbstractC25227BEk.A0D(A0P, viewGroup, R.layout.direct_inbox_filter_option_divider, false);
        C14360o3.A0B(A0D, 1);
        return new C3OO(A0D);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1089690152);
        int size = A00.size();
        C0f9.A0A(-1596386284, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        EnumC33383EpG enumC33383EpG;
        int A03 = C0f9.A03(1256367146);
        Object obj = A00.get(i);
        C14360o3.A0B(obj, 0);
        if (obj instanceof C33611EtN) {
            enumC33383EpG = EnumC33383EpG.A05;
        } else if (obj instanceof C31335Dq0) {
            enumC33383EpG = EnumC33383EpG.A04;
        } else if (obj instanceof F3Z) {
            enumC33383EpG = EnumC33383EpG.A03;
        } else {
            throw AbstractC166987dD.A12(MSV.A00(18));
        }
        int ordinal = enumC33383EpG.ordinal();
        C0f9.A0A(-347869597, A03);
        return ordinal;
    }
}
