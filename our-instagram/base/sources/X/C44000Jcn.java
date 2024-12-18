package X;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;

/* renamed from: X.Jcn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44000Jcn extends AbstractC66422zJ {
    public final Activity A00;
    public final InterfaceC09390do A03 = C1XM.A00(MHJ.A00(this, 33));
    public final InterfaceC09390do A04 = C1XM.A00(MHJ.A00(this, 34));
    public final InterfaceC09390do A02 = C1XM.A00(MHJ.A00(this, 32));
    public final InterfaceC09390do A01 = C1XM.A00(MHJ.A00(this, 31));

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44732JrF(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.partnerships_inbox_row_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        IgSimpleImageView igSimpleImageView;
        InterfaceC09390do interfaceC09390do;
        C45657KIu c45657KIu = (C45657KIu) interfaceC66482zP;
        C44732JrF c44732JrF = (C44732JrF) c3oo;
        AbstractC167007dF.A1K(c45657KIu, c44732JrF);
        ViewOnClickListenerC48062LPn.A00(c44732JrF.A00, 51, c45657KIu);
        c44732JrF.A02.setImageDrawable(AbstractC166987dD.A0a(this.A03));
        boolean z = c45657KIu.A01;
        IgTextView igTextView = c44732JrF.A03;
        if (z) {
            igTextView.setTypeface(Typeface.DEFAULT_BOLD);
            IgView igView = c44732JrF.A04;
            igView.setVisibility(0);
            igView.setBackground(AbstractC166987dD.A0a(this.A04));
            igSimpleImageView = c44732JrF.A01;
            interfaceC09390do = this.A02;
        } else {
            igTextView.setTypeface(Typeface.DEFAULT);
            c44732JrF.A04.setVisibility(8);
            igSimpleImageView = c44732JrF.A01;
            interfaceC09390do = this.A01;
        }
        igSimpleImageView.setImageTintList(ColorStateList.valueOf(AbstractC167027dH.A01(interfaceC09390do)));
        JR2 jr2 = c45657KIu.A00.A00;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0L(jr2.A1L, jr2.A0p()), "ig_branded_content_event");
        if (A0f.isSampled()) {
            AbstractC43593JPy.A1J(A0f, "bc_partnership_inbox_row_impression");
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45657KIu.class;
    }

    public C44000Jcn(Activity activity) {
        this.A00 = activity;
    }
}
