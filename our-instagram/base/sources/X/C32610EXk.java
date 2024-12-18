package X;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgView;

/* renamed from: X.EXk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32610EXk extends AbstractC66412zI {
    public C43768JXh A00;
    public final InterfaceC11380iw A01;
    public final FFJ A02;

    public C32610EXk(InterfaceC11380iw interfaceC11380iw, FFJ ffj) {
        C14360o3.A0B(ffj, 2);
        this.A01 = interfaceC11380iw;
        this.A02 = ffj;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C31960E2o(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_broadcast_chat_activity_feed_v2_row_item, false));
    }

    public static final void A00(C31960E2o c31960E2o, C32097E8v c32097E8v) {
        IgView igView;
        int i;
        if (c32097E8v.A02 == C05F.A01 && c32097E8v.A00) {
            TextView textView = c31960E2o.A01;
            Typeface typeface = Typeface.DEFAULT_BOLD;
            textView.setTypeface(typeface);
            c31960E2o.A00.setTypeface(typeface);
            igView = c31960E2o.A02;
            i = 0;
        } else {
            TextView textView2 = c31960E2o.A01;
            Typeface typeface2 = Typeface.DEFAULT;
            textView2.setTypeface(typeface2);
            c31960E2o.A00.setTypeface(typeface2);
            igView = c31960E2o.A02;
            i = 8;
        }
        igView.setVisibility(i);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String str;
        String str2;
        C32097E8v c32097E8v = (C32097E8v) interfaceC66482zP;
        C31960E2o c31960E2o = (C31960E2o) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c32097E8v, c31960E2o);
        Context A0L = AbstractC166997dE.A0L(c31960E2o.itemView);
        if (this.A00 == null) {
            this.A00 = new C43768JXh(A0L);
            int A09 = AbstractC167007dF.A09(A0L, R.attr.igds_color_list_badge);
            C43768JXh c43768JXh = this.A00;
            str2 = "threadStateIndicatorDrawable";
            if (c43768JXh != null) {
                c43768JXh.A00 = A09;
                c43768JXh.A01 = A09;
                c43768JXh.A02 = A1R;
                c43768JXh.A03 = false;
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
        TextView textView = c31960E2o.A01;
        String str3 = c32097E8v.A07;
        int i = c32097E8v.A01;
        E72 e72 = null;
        if (i == 2) {
            e72 = new E72(C05F.A00);
        }
        AbstractC31326Dpo.A00(textView, e72, str3, false);
        TextView textView2 = c31960E2o.A00;
        textView2.setText(F2G.A00(AbstractC166997dE.A0L(textView2), c32097E8v.A05, c32097E8v.A03, c32097E8v.A08));
        c31960E2o.A03.setUrl(AbstractC25225BEi.A0t(c32097E8v.A04), this.A01);
        ViewOnClickListenerC35684FpJ.A00(c31960E2o.itemView, c31960E2o, this, c32097E8v, 15);
        IgView igView = c31960E2o.A02;
        C43768JXh c43768JXh2 = this.A00;
        if (c43768JXh2 == null) {
            str2 = "threadStateIndicatorDrawable";
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
        igView.setBackground(c43768JXh2);
        A00(c31960E2o, c32097E8v);
        FFJ ffj = this.A02;
        String str4 = c32097E8v.A06;
        int absoluteAdapterPosition = c31960E2o.getAbsoluteAdapterPosition();
        boolean z = c32097E8v.A00;
        C14360o3.A0B(str4, 0);
        EOC eoc = ffj.A00;
        if (eoc.A00.add(str4)) {
            C34584FLt c34584FLt = (C34584FLt) eoc.A02.getValue();
            boolean A1P = AbstractC167007dF.A1P(i, 2);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c34584FLt.A00, "igd_channels_client_actions");
            if (A0f.isSampled()) {
                A0f.AAP("user_igid", c34584FLt.A02);
                AbstractC31171DnF.A1B(A0f, "channel_invitation_impression");
                AbstractC31171DnF.A1E(A0f, "activity_feed");
                AbstractC31177DnL.A1F(A0f, "channel_invite_item");
                AbstractC31178DnM.A1A(A0f, str4, absoluteAdapterPosition);
                AbstractC31172DnG.A1P(A0f, c34584FLt.A01);
                if (A1P) {
                    str = "subscriber_broadcast";
                } else {
                    str = "broadcast";
                }
                A0f.AAP("channel_type", str);
                AbstractC31174DnI.A1F(A0f, AbstractC167007dF.A0n("read", String.valueOf(!z)));
            }
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32097E8v.class;
    }
}
