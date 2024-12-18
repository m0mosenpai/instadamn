package X;

import android.content.Context;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;

/* renamed from: X.Wnf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71083Wnf implements InterfaceC57999Pnj {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ PromoteData A01;
    public final /* synthetic */ PromoteState A02;
    public final /* synthetic */ C66359UCf A03;
    public final /* synthetic */ boolean A04;

    public C71083Wnf(Context context, PromoteData promoteData, PromoteState promoteState, C66359UCf c66359UCf, boolean z) {
        this.A03 = c66359UCf;
        this.A00 = context;
        this.A04 = z;
        this.A01 = promoteData;
        this.A02 = promoteState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r13 == false) goto L22;
     */
    @Override // X.InterfaceC57999Pnj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D2t(android.view.View r12, boolean r13) {
        /*
            r11 = this;
            X.UCf r4 = r11.A03
            android.content.Context r10 = r11.A00
            boolean r5 = r11.A04
            com.instagram.business.promote.model.PromoteData r6 = r11.A01
            com.instagram.business.promote.model.PromoteState r3 = r11.A02
            com.instagram.common.session.UserSession r0 = r6.A0y
            X.C14360o3.A06(r0)
            X.1Ai r1 = X.AbstractC23021Ah.A00(r0)
            if (r13 == 0) goto L37
            if (r5 == 0) goto L37
            boolean r0 = r6.A2N
            if (r0 != 0) goto L37
            X.0xq r9 = r1.A01
            java.lang.String r8 = "preference_default_continuous_tooltip_view_count"
            r7 = 0
            int r1 = r9.getInt(r8, r7)
            r0 = 2
            if (r1 >= r0) goto L37
            X.Wua r2 = new X.Wua
            r2.<init>(r10, r4)
            r0 = 500(0x1f4, double:2.47E-321)
            r4.postDelayed(r2, r0)
            r0 = 1
            r6.A2N = r0
            X.AbstractC50522MSa.A1T(r9, r8, r7)
        L37:
            boolean r0 = r6.A2w
            if (r13 == r0) goto L51
            r6.A2w = r13
            r0 = 1
            r3.A06 = r0
            if (r13 == 0) goto L5b
            r1 = 0
        L43:
            r6.A0A = r1
            int r0 = r6.A07
            if (r13 != 0) goto L4a
            int r0 = r0 * r1
        L4a:
            r6.A0I = r0
            java.lang.Integer r0 = X.C05F.A0j
            com.instagram.business.promote.model.PromoteState.A01(r3, r0)
        L51:
            if (r5 == 0) goto L56
            r0 = 1
            if (r13 != 0) goto L57
        L56:
            r0 = 0
        L57:
            r4.A04(r0)
            return
        L5b:
            int r1 = r6.A09
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71083Wnf.D2t(android.view.View, boolean):void");
    }
}
