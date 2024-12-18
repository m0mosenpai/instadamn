package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;

/* renamed from: X.VvK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69783VvK {
    public boolean A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final TextView A0A;
    public final TextView A0B;
    public final PromoteData A0C;
    public final W6E A0D;
    public final PromoteState A0E;

    public final void A00() {
        this.A08.setVisibility(8);
        this.A01.setVisibility(8);
        this.A07.setVisibility(8);
        this.A06.setVisibility(8);
        this.A02.setVisibility(8);
    }

    public final void A01() {
        this.A0B.setVisibility(8);
        this.A0A.setVisibility(8);
        this.A09.setVisibility(8);
        this.A04.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r7, 36325978691155498L) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02() {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69783VvK.A02():void");
    }

    public C69783VvK(View view, W6E w6e, PromoteData promoteData, PromoteState promoteState) {
        this.A0C = promoteData;
        this.A0E = promoteState;
        this.A0D = w6e;
        this.A05 = AbstractC166997dE.A0S(view, R.id.reach_estimation_row);
        this.A0B = AbstractC167007dF.A0N(view, R.id.reach_estimation_text_view);
        this.A0A = AbstractC167007dF.A0N(view, R.id.reach_estimation_subtitle_view);
        this.A09 = AbstractC167007dF.A0N(view, R.id.reach_estimation_continuous_ads_subtitle_view);
        this.A04 = AbstractC166997dE.A0S(view, R.id.reach_estimation_progress_bar);
        this.A03 = AbstractC166997dE.A0S(view, R.id.outcome_estimation_row);
        this.A08 = AbstractC167007dF.A0N(view, R.id.outcome_estimation_text_view);
        this.A07 = AbstractC167007dF.A0N(view, R.id.outcome_estimation_subtitle_view);
        this.A06 = AbstractC167007dF.A0N(view, R.id.outcome_estimation_continuous_ads_subtitle_view);
        this.A02 = AbstractC166997dE.A0S(view, R.id.outcome_estimation_progress_bar);
        this.A01 = AbstractC166997dE.A0S(view, R.id.limited_response_warning_icon);
    }
}
