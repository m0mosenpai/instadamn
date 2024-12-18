package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.fragment.LocationDetailFragment;

/* loaded from: classes6.dex */
public final class EXZ extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final LocationDetailFragment A02;
    public final C70846WiC A03;

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r20, X.C3OO r21) {
        /*
            r19 = this;
            r10 = r21
            r3 = r20
            X.FyW r3 = (X.C36217FyW) r3
            X.E3f r10 = (X.C31977E3f) r10
            r1 = r19
            com.instagram.common.session.UserSession r15 = r1.A01
            X.0iw r0 = r1.A00
            com.instagram.discovery.mediamap.fragment.LocationDetailFragment r11 = r1.A02
            android.content.Context r14 = X.AbstractC31172DnG.A05(r10)
            com.instagram.user.model.User r12 = r3.A00
            java.lang.String r1 = r3.A01
            X.FOZ r8 = r10.A06
            r2 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r6 = 0
            X.FOT r5 = new X.FOT
            r5.<init>(r0, r15, r11)
            r0 = 1
            r5.A06 = r0
            com.instagram.model.reels.Reel r0 = X.C1OU.A01(r15, r12)
            r5.A00 = r0
            r0 = 44
            float r0 = X.AbstractC13880nE.A04(r14, r0)
            int r9 = java.lang.Math.round(r0)
            r0 = 52
            float r0 = X.AbstractC13880nE.A04(r14, r0)
            int r4 = java.lang.Math.round(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r5.A02 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r5.A03 = r0
            X.AbstractC35187Fff.A03(r12, r8, r5, r7)
            android.view.ViewGroup r0 = r10.A01
            r0.setVisibility(r2)
            android.view.View r0 = r10.A00
            r0.setMinimumHeight(r2)
            r0.setBackground(r6)
            X.17P r0 = r12.A03
            X.4zh r13 = r0.Bxv()
            r9 = 8
            com.instagram.igds.components.button.IgdsButton r0 = r10.A04
            if (r13 == 0) goto Lf5
            X.Fo1 r8 = new X.Fo1
            r8.<init>(r9, r10, r11, r12, r13)
            X.C0fQ.A00(r8, r0)
            r0.setVisibility(r2)
        L75:
            com.instagram.igds.components.button.IgdsButton r4 = r10.A03
            r4.setVisibility(r2)
            X.17P r0 = r12.A03
            java.lang.String r0 = r0.Aqd()
            if (r0 == 0) goto Le0
            r0 = 2131954458(0x7f130b1a, float:1.9545416E38)
            r4.setText(r0)
            r0 = 27
        L8a:
            X.ViewOnClickListenerC35684FpJ.A00(r4, r10, r12, r11, r0)
        L8d:
            if (r13 != 0) goto Lda
            boolean r0 = r3.A02
            if (r0 == 0) goto Lda
            if (r1 == 0) goto Lda
            com.instagram.igds.components.button.IgdsButton r3 = r10.A05
            r18 = 6
            X.Fp8 r13 = new X.Fp8
            r16 = r10
            r17 = r1
            r13.<init>(r14, r15, r16, r17, r18)
            X.C0fQ.A00(r13, r3)
            r3.setVisibility(r2)
            X.WiC r5 = r10.A02
            android.view.View r4 = r10.itemView
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            java.lang.String r0 = "menu_impression_item_"
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r1)
            X.2n8 r1 = X.C59062n7.A00(r1, r2, r0)
            X.V6p r0 = r5.A00
            r1.A00(r0)
            X.2n7 r1 = r1.A01()
            X.2jm r0 = r5.A01
            r0.A05(r4, r1)
        Lc9:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36313888358140193(0x81034a00000921, double:3.0283874497549425E-306)
            boolean r0 = X.C18U.A06(r2, r15, r0)
            if (r0 == 0) goto Ld9
            r3.setVisibility(r9)
        Ld9:
            return
        Lda:
            com.instagram.igds.components.button.IgdsButton r3 = r10.A05
            r3.setVisibility(r9)
            goto Lc9
        Le0:
            X.17P r0 = r12.A03
            java.lang.String r0 = r0.Bj6()
            if (r0 == 0) goto Lf1
            r0 = 2131961706(0x7f13276a, float:1.9560116E38)
            r4.setText(r0)
            r0 = 28
            goto L8a
        Lf1:
            r4.setVisibility(r9)
            goto L8d
        Lf5:
            r0.setVisibility(r9)
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EXZ.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C70846WiC c70846WiC = this.A03;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C31977E3f(AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_business_profile_row), c70846WiC);
    }

    public EXZ(InterfaceC11380iw interfaceC11380iw, UserSession userSession, LocationDetailFragment locationDetailFragment, C70846WiC c70846WiC) {
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A03 = c70846WiC;
        this.A02 = locationDetailFragment;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36217FyW.class;
    }
}
