package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Bwi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27059Bwi extends AbstractC66412zI {
    public final InterfaceC153546vP A00;
    public final InterfaceC11380iw A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C25936Bdd(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_clips_grid_drafts_header_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String string;
        C27063Bwm c27063Bwm = (C27063Bwm) interfaceC66482zP;
        C25936Bdd c25936Bdd = (C25936Bdd) c3oo;
        AbstractC167017dG.A1N(c27063Bwm, c25936Bdd);
        ViewGroup viewGroup = c25936Bdd.A00;
        Context context = viewGroup.getContext();
        CQ9 cq9 = c27063Bwm.A00;
        int i = cq9.A00;
        Resources resources = context.getResources();
        if (i > 0) {
            string = AbstractC167017dG.A0k(resources, i, R.plurals.clips_profile_tab_drafts_entry_point_title);
        } else {
            string = resources.getString(2131955680);
        }
        C14360o3.A0A(string);
        c25936Bdd.A02.setText(string);
        AbstractC166987dD.A1P(context, c25936Bdd.A01, 2131955679);
        ImageUrl imageUrl = cq9.A01;
        if (imageUrl != null) {
            c25936Bdd.A03.setUrl(imageUrl, this.A01);
        }
        ViewOnClickListenerC28666ClE.A01(viewGroup, 50, this);
    }

    public C27059Bwi(InterfaceC153546vP interfaceC153546vP, InterfaceC11380iw interfaceC11380iw) {
        this.A00 = interfaceC153546vP;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C27063Bwm.class;
    }
}
