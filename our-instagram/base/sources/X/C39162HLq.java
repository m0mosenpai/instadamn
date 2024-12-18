package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.HLq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39162HLq extends AbstractC110714yj {
    public final IgTextView A00;
    public final IgTextView A01;

    @Override // X.AbstractC110714yj
    public final void A00(C3CL c3cl) {
    }

    @Override // X.AbstractC110714yj
    public final void A01(C110464yI c110464yI) {
        int i;
        super.A00 = c110464yI;
        boolean A06 = C18U.A06(C06090Tz.A05, c110464yI.A06, 36320786075624340L);
        IgTextView igTextView = this.A00;
        if (A06) {
            C14360o3.A0B(igTextView, 0);
            i = R.style.PrivacyTextStyle;
        } else {
            C14360o3.A0B(igTextView, 0);
            i = R.style.igds_body_1;
        }
        igTextView.setTextAppearance(i);
    }

    @Override // X.AbstractC110714yj
    public final void A02(String str, View.OnClickListener onClickListener) {
    }

    @Override // X.AbstractC110714yj
    public final void A03(String str, View.OnClickListener onClickListener) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r5.length() == 0) goto L6;
     */
    @Override // X.AbstractC110714yj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            com.instagram.common.ui.base.IgTextView r3 = r4.A01
            r3.setText(r5)
            r2 = 0
            if (r5 == 0) goto Lf
            int r1 = r5.length()
            r0 = 0
            if (r1 != 0) goto L11
        Lf:
            r0 = 8
        L11:
            r3.setVisibility(r0)
            com.instagram.common.ui.base.IgTextView r1 = r4.A00
            r1.setText(r6)
            if (r6 == 0) goto L21
            int r0 = r6.length()
            if (r0 != 0) goto L23
        L21:
            r2 = 8
        L23:
            r1.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39162HLq.A04(java.lang.String, java.lang.String):void");
    }

    public C39162HLq(IgTextView igTextView, IgTextView igTextView2) {
        AbstractC167017dG.A1P(igTextView, igTextView2);
        this.A01 = igTextView;
        this.A00 = igTextView2;
    }
}
