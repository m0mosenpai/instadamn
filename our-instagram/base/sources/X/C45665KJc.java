package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.KJc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45665KJc extends AbstractC66422zJ {
    public final Activity A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44752JrZ(this.A00, AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_inbox_campaign_thread_item, false), this.A01, this.A02);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        Activity activity;
        int i;
        C48313LZm c48313LZm = (C48313LZm) interfaceC66482zP;
        C44752JrZ c44752JrZ = (C44752JrZ) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c48313LZm, c44752JrZ);
        c44752JrZ.A08.setUrl(c48313LZm.A03, c44752JrZ.A02);
        IgTextView igTextView = c44752JrZ.A04;
        igTextView.setText(c48313LZm.A04);
        IgTextView igTextView2 = c44752JrZ.A06;
        igTextView2.setText(c48313LZm.A01);
        if (c48313LZm.A02) {
            igTextView.setTypeface(null, A1R ? 1 : 0);
            igTextView2.setTypeface(null, A1R ? 1 : 0);
            activity = c44752JrZ.A00;
            i = R.attr.igds_color_primary_text;
        } else {
            igTextView.setTypeface(null, 0);
            igTextView2.setTypeface(null, 0);
            activity = c44752JrZ.A00;
            i = R.attr.igds_color_secondary_text;
        }
        AbstractC31177DnL.A0q(activity, igTextView2, i);
        String str = c48313LZm.A00;
        if (str != null && str.length() != 0) {
            c44752JrZ.A05.setVisibility(0);
            IgTextView igTextView3 = c44752JrZ.A07;
            igTextView3.setVisibility(0);
            igTextView3.setText(str);
            igTextView2.setMaxWidth((int) (AbstractC13880nE.A0E(activity).x * 0.6d));
        } else {
            c44752JrZ.A05.setVisibility(8);
            c44752JrZ.A07.setVisibility(8);
        }
        ViewOnClickListenerC48066LPr.A00(c44752JrZ.A01, 57, c48313LZm, c44752JrZ);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C48313LZm.class;
    }

    public C45665KJc(Activity activity, AbstractC59962oe abstractC59962oe, UserSession userSession) {
        this.A01 = abstractC59962oe;
        this.A02 = userSession;
        this.A00 = activity;
    }
}
