package X;

import android.view.View;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.G6o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36464G6o implements InterfaceViewOnFocusChangeListenerC37281Gbi {
    public final /* synthetic */ EVU A00;

    public C36464G6o(EVU evu) {
        this.A00 = evu;
    }

    @Override // X.InterfaceViewOnFocusChangeListenerC37281Gbi
    public final void Cyr(View view) {
        this.A00.A0m.Cyq();
    }

    @Override // X.InterfaceViewOnFocusChangeListenerC37281Gbi
    public final void DdF(DirectShareTarget directShareTarget) {
        this.A00.A0l.DdH(directShareTarget, 6, 0, 0);
    }

    @Override // X.InterfaceViewOnFocusChangeListenerC37281Gbi
    public final void DdL(DirectShareTarget directShareTarget) {
        EVU evu = this.A00;
        evu.A0X = true;
        evu.A0l.DdH(directShareTarget, 6, 0, 0);
    }

    @Override // X.InterfaceViewOnFocusChangeListenerC37281Gbi
    public final void DdN(DirectShareTarget directShareTarget) {
        EVU evu = this.A00;
        evu.A0C = directShareTarget;
        evu.A08.A02();
    }

    @Override // X.InterfaceViewOnFocusChangeListenerC37281Gbi
    public final void DjA() {
        this.A00.A0m.DjA();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // X.InterfaceViewOnFocusChangeListenerC37281Gbi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DjT(java.lang.String r7, boolean r8) {
        /*
            r6 = this;
            if (r7 == 0) goto Leb
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto Leb
            java.util.Locale r0 = X.C1Q2.A02()
            java.lang.String r3 = r7.toLowerCase(r0)
        L10:
            X.EVU r5 = r6.A00
            java.lang.String r0 = r5.A0L
            boolean r0 = X.AbstractC13670mt.A0G(r0, r3)
            if (r0 != 0) goto L38
            if (r8 == 0) goto L38
            X.DuS r2 = r5.A0o
            com.instagram.common.session.UserSession r1 = r5.A0g
            X.Gbq r0 = r5.A0m
            r2.A08(r0, r1, r7)
            boolean r0 = r5.A0U
            if (r0 == 0) goto L38
            int r0 = X.EVU.A00(r5)
            if (r0 <= 0) goto L38
            X.2Eg r0 = X.AbstractC47132Ef.A00(r1)
            X.2Ei r0 = r0.A0E
            r0.get()
        L38:
            X.7hR r0 = X.EVU.A02(r5)
            if (r0 == 0) goto Le6
            boolean r0 = X.AbstractC25229BEm.A1Z(r3)
            r5.A0W = r0
            X.7hR r1 = X.EVU.A02(r5)
            boolean r0 = r5.A0W
            if (r0 == 0) goto Lda
            java.lang.String r0 = r5.A0L
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Ld4
            boolean r0 = r5.A0V
            if (r0 != 0) goto Ld4
        L58:
            r5.A0L = r3
            r5.A0Q()
            r5.A0P()
            r1 = 2131431617(0x7f0b10c1, float:1.8484968E38)
            boolean r0 = X.EVU.A0J(r5)
            X.EVU.A08(r5, r1, r0)
            int r1 = X.EVU.A00(r5)
            r0 = 1
            if (r1 < r0) goto Ld3
            android.view.ViewGroup r0 = r5.A04
            if (r0 == 0) goto Ld3
            com.instagram.common.session.UserSession r4 = r5.A0g
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36318887700339456(0x8107d600041b00, double:3.031549053892492E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto Ld3
            boolean r0 = r5.A0T
            if (r0 != 0) goto Ld3
            boolean r0 = r5.A0V
            if (r0 != 0) goto Ld3
            android.view.ViewGroup r1 = r5.A04
            r0 = 2131432154(0x7f0b12da, float:1.8486057E38)
            android.view.View r4 = r1.findViewById(r0)
            android.view.ViewGroup r1 = r5.A04
            r0 = 2131439352(0x7f0b2ef8, float:1.8500657E38)
            android.view.View r2 = r1.findViewById(r0)
            X.Fet r0 = r5.A0B
            if (r0 == 0) goto Lb8
            X.Gah r0 = r0.A02
            boolean r0 = r0.CKx()
            if (r0 != 0) goto Lb8
            X.Fet r1 = r5.A0B
            if (r1 == 0) goto Lb8
            X.Gah r0 = r1.A02
            r0.EJ5()
            X.Gah r0 = r1.A02
            r0.El3()
        Lb8:
            if (r4 == 0) goto Ld3
            if (r2 == 0) goto Ld3
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            int r0 = X.AbstractC167007dF.A05(r0)
            r4.setVisibility(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Ld0
            r1 = 8
        Ld0:
            r2.setVisibility(r1)
        Ld3:
            return
        Ld4:
            boolean r0 = r5.A0V
            if (r0 != 0) goto Le6
            X.7hR r1 = r5.A0E
        Lda:
            if (r1 == 0) goto L58
            r1.Eby(r3)
            java.lang.Integer r0 = X.C05F.A00
            X.EVU.A0B(r5, r0)
            goto L58
        Le6:
            r5.A0O()
            goto L58
        Leb:
            r3 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36464G6o.DjT(java.lang.String, boolean):void");
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        this.A00.A0m.DjC(view, z);
    }
}
