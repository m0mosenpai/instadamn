package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CwF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29320CwF implements JGD, JGE, InterfaceC81453kF {
    public Integer A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final ConstraintLayout A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final Map A08;
    public final View A09;
    public final UserSession A0A;
    public final Map A0B;

    public C29320CwF(View view, UserSession userSession) {
        C14360o3.A0B(view, 2);
        this.A0A = userSession;
        this.A09 = AbstractC166997dE.A0S(view, R.id.intent_aware_ad_grid_card_top_left);
        this.A03 = AbstractC166997dE.A0S(view, R.id.intent_aware_ad_grid_card_top_right);
        this.A01 = AbstractC166997dE.A0S(view, R.id.intent_aware_ad_grid_card_bottom_left);
        this.A02 = AbstractC166997dE.A0S(view, R.id.intent_aware_ad_grid_card_bottom_right);
        this.A04 = (ConstraintLayout) AbstractC166997dE.A0R(view, R.id.intent_aware_ad_grid_container);
        this.A06 = AbstractC25231BEo.A0d(view, R.id.intent_aware_ad_grid_see_all_button);
        this.A05 = AbstractC25231BEo.A0d(view, R.id.intent_aware_ad_grid_header_title);
        this.A07 = AbstractC25231BEo.A0d(view, R.id.intent_aware_ad_grid_sub_header_label);
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        this.A08 = A1I;
        this.A0B = A1I;
    }

    public final View A00(int i) {
        Integer num = this.A00;
        if (num != null && num.intValue() == 33) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        throw AbstractC166987dD.A14("Invalid position in grid multi ads");
                    }
                    return this.A02;
                }
                return this.A03;
            }
            return this.A09;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw AbstractC166987dD.A14("Invalid position in grid multi ads");
                    }
                    return this.A02;
                }
                return this.A01;
            }
            return this.A03;
        }
        return this.A09;
    }

    @Override // X.InterfaceC81443kE
    public final Object BEG(C38321qM c38321qM) {
        return this.A08.get(c38321qM);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r0.intValue() != 33) goto L6;
     */
    @Override // X.JGE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ekj() {
        /*
            r6 = this;
            java.lang.Integer r0 = r6.A00
            r2 = 33
            if (r0 == 0) goto Ld
            int r0 = r0.intValue()
            r1 = 3
            if (r0 == r2) goto Le
        Ld:
            r1 = 4
        Le:
            int r5 = r1 + (-1)
            if (r5 < 0) goto L48
            r4 = 0
        L13:
            com.instagram.common.session.UserSession r3 = r6.A0A
            java.lang.Integer r2 = r6.A00
            android.view.View r0 = r6.A00(r4)
            X.Cvl r1 = new X.Cvl
            r1.<init>(r0)
            boolean r0 = X.AbstractC28501Chu.A07(r3, r2)
            if (r0 == 0) goto L3c
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.A08
            X.AbstractC47062KrJ.A00(r0)
            com.instagram.common.ui.base.IgFrameLayout r0 = r1.A0A
            X.AbstractC47062KrJ.A00(r0)
            android.widget.Space r0 = r1.A03
        L32:
            android.view.View r0 = (android.view.View) r0
            X.AbstractC47062KrJ.A00(r0)
            if (r4 == r5) goto L48
            int r4 = r4 + 1
            goto L13
        L3c:
            boolean r0 = X.AbstractC28501Chu.A08(r3, r2)
            if (r0 == 0) goto L45
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.A09
            goto L32
        L45:
            com.instagram.common.ui.base.IgTextView r0 = r1.A0H
            goto L32
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29320CwF.Ekj():void");
    }

    @Override // X.InterfaceC81443kE
    public final Map BRm() {
        return this.A0B;
    }

    @Override // X.JGD
    public final void EEp(int i) {
        C28492Chk.A03(A00(i));
    }
}
