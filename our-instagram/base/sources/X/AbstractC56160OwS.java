package X;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.OwS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC56160OwS implements C3PE {
    public AbstractC59962oe A00;
    public C50971Mfe A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final View A07;
    public final TextView A08;
    public final TextView A09;
    public final TextView A0A;
    public final TextView A0B;
    public final ConstraintLayout A0C;
    public final InterfaceC58362lv A0D;
    public final InterfaceC11380iw A0E;
    public final UserSession A0F;
    public final IgImageView A0G;
    public final IgImageView A0H;
    public final C3PX A0I;
    public final InterfaceC09390do A0J;
    public final View A0K;
    public final View A0L;

    @Override // X.C3PE
    public final void DQY(View view) {
        C50971Mfe c50971Mfe;
        C14360o3.A0B(view, 0);
        if (view.equals(this.A08)) {
            if (this instanceof C52829NZm) {
                C50971Mfe c50971Mfe2 = this.A01;
                if ((c50971Mfe2 instanceof C52892Nan) && c50971Mfe2 != null) {
                    AbstractC50523MSb.A1U(c50971Mfe2.A03.A00);
                    return;
                }
                return;
            }
            if (!(this instanceof C52827NZk) || (c50971Mfe = this.A01) == null) {
                return;
            }
            AbstractC50523MSb.A1U(c50971Mfe.A03.A00);
        }
    }

    @Override // X.C3PE
    public final boolean DsE(View view) {
        C50971Mfe c50971Mfe;
        C141796aw A00;
        int i;
        C52892Nan c52892Nan;
        C14360o3.A0B(view, 0);
        if (view.equals(this.A08)) {
            if (this instanceof C52829NZm) {
                C50971Mfe c50971Mfe2 = this.A01;
                if ((c50971Mfe2 instanceof C52892Nan) && (c52892Nan = (C52892Nan) c50971Mfe2) != null) {
                    AbstractC50523MSb.A1U(c52892Nan.A01);
                    return true;
                }
                return true;
            }
            return true;
        }
        if (view.equals(this.A06)) {
            c50971Mfe = this.A01;
            if (c50971Mfe == null) {
                return true;
            }
            A00 = AbstractC141776au.A00(c50971Mfe);
            i = 10;
        } else if (view.equals(this.A04)) {
            c50971Mfe = this.A01;
            if (c50971Mfe == null) {
                return true;
            }
            A00 = AbstractC141776au.A00(c50971Mfe);
            i = 9;
        } else {
            if (!view.equals(this.A02) || (c50971Mfe = this.A01) == null) {
                return true;
            }
            A00 = AbstractC141776au.A00(c50971Mfe);
            i = 7;
        }
        C57164PZi.A03(c50971Mfe, A00, i);
        return true;
    }

    public AbstractC56160OwS(View view, AbstractC59962oe abstractC59962oe, UserSession userSession, C50971Mfe c50971Mfe) {
        this.A0F = userSession;
        this.A05 = view;
        this.A00 = abstractC59962oe;
        this.A01 = c50971Mfe;
        this.A0E = abstractC59962oe;
        View A0S = AbstractC166997dE.A0S(view, R.id.iglive_header_layout);
        this.A03 = A0S;
        this.A0L = AbstractC166997dE.A0S(view, R.id.iglive_header_text_container);
        this.A0K = AbstractC166997dE.A0S(view, R.id.iglive_header_avatar_text_container);
        this.A0G = AbstractC167007dF.A0T(view, R.id.reel_viewer_profile_picture);
        this.A09 = AbstractC167007dF.A0N(view, R.id.iglive_header_main_text);
        this.A0A = AbstractC167007dF.A0N(view, R.id.iglive_header_main_text_marquee);
        this.A0I = C3PW.A00(view, R.id.iglive_header_secondary_text_stub);
        this.A0C = (ConstraintLayout) AbstractC166997dE.A0R(view, R.id.iglive_label_layout);
        this.A0J = C57540PgE.A00(this, 6);
        this.A08 = AbstractC167007dF.A0N(view, R.id.iglive_label);
        this.A06 = AbstractC166997dE.A0S(view, R.id.iglive_view_count_container);
        this.A0H = AbstractC167007dF.A0T(view, R.id.iglive_view_count_avatar);
        this.A07 = AbstractC166997dE.A0S(view, R.id.iglive_view_count_icon);
        this.A0B = AbstractC167007dF.A0N(view, R.id.iglive_view_count);
        this.A04 = AbstractC166997dE.A0S(view, R.id.iglive_header_options);
        this.A02 = AbstractC166997dE.A0S(view, R.id.iglive_header_close);
        this.A0D = new MY1(this, 17);
        Ok4.A00(A0S, 32, this);
        C3P9 A0s = AbstractC166987dD.A0s(this.A08);
        A0s.A04 = this;
        Integer num = C05F.A01;
        A0s.A05 = num;
        A0s.A00();
        C3P9 A0s2 = AbstractC166987dD.A0s(this.A06);
        A0s2.A04 = this;
        A0s2.A05 = num;
        A0s2.A00();
        C3P9 A0s3 = AbstractC166987dD.A0s(this.A04);
        A0s3.A04 = this;
        A0s3.A05 = num;
        A0s3.A00();
        C3P9 A0s4 = AbstractC166987dD.A0s(this.A02);
        A0s4.A04 = this;
        A0s4.A05 = num;
        A0s4.A00();
    }
}
