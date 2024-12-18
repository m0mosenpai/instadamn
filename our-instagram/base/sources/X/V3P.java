package X;

import android.content.Context;
import android.view.LayoutInflater;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class V3P extends AbstractC168697g3 {
    public final Context A00;
    public final LayoutInflater A01;
    public final UserSession A02;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public V3P(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = LayoutInflater.from(context);
        this.A02 = userSession;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r1 == false) goto L8;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r8, android.view.View r9, android.view.ViewGroup r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r7 = this;
            r0 = -612029647(0xffffffffdb852b31, float:-7.496732E16)
            int r3 = X.C0f9.A03(r0)
            if (r9 != 0) goto L2f
            android.view.LayoutInflater r6 = r7.A01
            com.instagram.common.session.UserSession r5 = r7.A02
            r4 = 0
            if (r5 == 0) goto L20
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36328894973886296(0x8110f000003f58, double:3.0378776939795695E-306)
            boolean r1 = X.C18U.A06(r2, r5, r0)
            r0 = 2131629001(0x7f0e13c9, float:1.888531E38)
            if (r1 != 0) goto L23
        L20:
            r0 = 2131629000(0x7f0e13c8, float:1.8885309E38)
        L23:
            android.view.View r9 = r6.inflate(r0, r4)
            X.VgP r0 = new X.VgP
            r0.<init>(r9)
            r9.setTag(r0)
        L2f:
            android.content.Context r0 = r7.A00
            java.lang.Object r4 = X.AbstractC31172DnG.A0x(r9)
            X.VgP r4 = (X.VgP) r4
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            X.VlK r12 = (X.C69312VlK) r12
            android.content.res.Resources r5 = r0.getResources()
            android.view.View r6 = r4.A00
            java.lang.Integer r0 = r12.A03
            if (r0 == 0) goto L8a
            int r0 = r0.intValue()
        L49:
            int r1 = r5.getDimensionPixelSize(r0)
            java.lang.Integer r0 = r12.A00
            if (r0 == 0) goto L87
            int r0 = r0.intValue()
        L55:
            int r0 = r5.getDimensionPixelSize(r0)
            r2 = 0
            r6.setPadding(r2, r1, r2, r0)
            java.lang.Integer r0 = r12.A01
            if (r0 == 0) goto L6f
            android.widget.TextView r1 = r4.A01
            int r0 = r0.intValue()
            int r0 = r5.getDimensionPixelSize(r0)
            float r0 = (float) r0
            r1.setTextSize(r2, r0)
        L6f:
            android.widget.TextView r1 = r4.A01
            r1.setText(r11)
            boolean r0 = r12.A04
            if (r0 == 0) goto L7a
            r2 = 17
        L7a:
            r1.setGravity(r2)
            X.AbstractC25227BEk.A11(r1)
            r0 = 249587423(0xee066df, float:5.5319325E-30)
            X.C0f9.A0A(r0, r3)
            return r9
        L87:
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            goto L55
        L8a:
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V3P.getView(int, android.view.View, android.view.ViewGroup, java.lang.Object, java.lang.Object):android.view.View");
    }
}
