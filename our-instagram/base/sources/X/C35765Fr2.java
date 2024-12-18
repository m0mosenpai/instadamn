package X;

import android.content.Context;
import android.view.ViewStub;
import android.widget.CompoundButton;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.Fr2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35765Fr2 implements InterfaceC58362lv, CompoundButton.OnCheckedChangeListener {
    public final Context A00;
    public final AbstractC018607g A01;
    public final InterfaceC11380iw A02;
    public final Reel A03;
    public final IFK A04;
    public final C41220IMj A05;

    public C35765Fr2(Context context, ViewStub viewStub, C07X c07x, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Reel reel) {
        AbstractC167007dF.A1H(userSession, 3, viewStub);
        C41220IMj A0V = C1XJ.A00.A0V(userSession);
        C14360o3.A07(A0V);
        IFK ifk = new IFK(viewStub);
        this.A00 = context;
        this.A02 = interfaceC11380iw;
        this.A01 = abstractC018607g;
        this.A05 = A0V;
        this.A04 = ifk;
        this.A03 = reel;
        AbstractC31172DnG.A0F(A0V.A01).A06(c07x, this);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.A05.A00(this.A00, this.A01, this.A02, null, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r1 == com.instagram.model.reels.ReelType.A0d) goto L11;
     */
    @Override // X.InterfaceC58362lv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onChanged(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r6 = X.AbstractC166987dD.A1a(r9)
            X.IFK r7 = r8.A04
            com.instagram.model.reels.Reel r4 = r8.A03
            r1 = 0
            if (r4 == 0) goto L66
            com.instagram.model.reels.ReelType r2 = r4.A0P
        Ld:
            com.instagram.model.reels.ReelType r0 = com.instagram.model.reels.ReelType.A0b
            r3 = 0
            if (r2 == r0) goto L1b
            if (r4 == 0) goto L16
            com.instagram.model.reels.ReelType r1 = r4.A0P
        L16:
            com.instagram.model.reels.ReelType r0 = com.instagram.model.reels.ReelType.A0d
            r2 = 0
            if (r1 != r0) goto L1c
        L1b:
            r2 = 1
        L1c:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0 = 2131973926(0x7f135726, float:1.9584902E38)
            X.BHS r5 = X.BHS.A00(r1, r0)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0 = 2131973925(0x7f135725, float:1.95849E38)
            X.BHS r4 = X.BHS.A00(r1, r0)
            X.C14360o3.A0B(r7, r3)
            if (r2 == 0) goto L68
            X.2iX r0 = r7.A00
            r0.setVisibility(r3)
            X.0do r1 = r7.A01
            android.view.View r0 = X.AbstractC166987dD.A0d(r1)
            java.lang.Object r3 = r0.getTag()
            boolean r0 = r3 instanceof X.C31981E3j
            if (r0 == 0) goto L65
            X.E3j r3 = (X.C31981E3j) r3
            if (r3 == 0) goto L65
            android.view.View r0 = X.AbstractC166987dD.A0d(r1)
            android.content.Context r2 = X.AbstractC166997dE.A0L(r0)
            java.lang.CharSequence r0 = X.BHX.A00(r2, r5)
            X.GHa r1 = new X.GHa
            r1.<init>(r8, r0, r6)
            java.lang.CharSequence r0 = X.BHX.A00(r2, r4)
            r1.A0A = r0
            r0 = 0
            X.FC1.A00(r0, r3, r0, r1)
        L65:
            return
        L66:
            r2 = r1
            goto Ld
        L68:
            X.2iX r1 = r7.A00
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35765Fr2.onChanged(java.lang.Object):void");
    }
}
