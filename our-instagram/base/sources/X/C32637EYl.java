package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.model.direct.DirectSearchPrompt;

/* renamed from: X.EYl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32637EYl extends AbstractC66422zJ {
    public final Context A00;
    public final FG1 A01;
    public final InterfaceC132405yL A02;
    public final String A03;

    public C32637EYl(Context context, FG1 fg1, InterfaceC132405yL interfaceC132405yL) {
        String A00 = AbstractC111324zv.A00(1000);
        AbstractC167017dG.A1Q(context, interfaceC132405yL);
        this.A00 = context;
        this.A01 = fg1;
        this.A02 = interfaceC132405yL;
        this.A03 = A00;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C36202FyG c36202FyG = (C36202FyG) interfaceC66482zP;
        C31995E3x c31995E3x = (C31995E3x) c3oo;
        AbstractC167017dG.A1N(c36202FyG, c31995E3x);
        Context context = this.A00;
        DirectSearchPrompt directSearchPrompt = c36202FyG.A03;
        int i = c36202FyG.A00;
        int i2 = c36202FyG.A01;
        int i3 = c36202FyG.A02;
        InterfaceC132405yL interfaceC132405yL = this.A02;
        FG1 fg1 = this.A01;
        String str = this.A03;
        AbstractC167007dF.A1H(context, 0, interfaceC132405yL);
        AbstractC167007dF.A1J(fg1, 8, str);
        c31995E3x.A07.setText(directSearchPrompt.A03);
        c31995E3x.A04.setVisibility(8);
        IgSimpleImageView igSimpleImageView = c31995E3x.A06;
        igSimpleImageView.setImageResource(R.drawable.messenger_icons_gen_ai_ring_16);
        igSimpleImageView.setVisibility(0);
        ViewGroup viewGroup = c31995E3x.A00;
        viewGroup.setPaddingRelative(AbstractC31171DnF.A02(context.getResources(), R.dimen.action_bar_item_spacing_right), AbstractC31171DnF.A02(context.getResources(), R.dimen.action_bar_item_spacing_right), 0, (int) AbstractC31173DnH.A00(context, R.dimen.action_bar_item_spacing_right));
        ViewOnClickListenerC35688FpN.A00(viewGroup, directSearchPrompt, fg1, i2, 5);
        c31995E3x.A08.CMM();
        interfaceC132405yL.Dqk(AbstractC31171DnF.A06(c31995E3x), null, directSearchPrompt, str, 41, i, i2, i3, false);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C31995E3x(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_inbox_search_row_layout, false));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36202FyG.class;
    }
}
