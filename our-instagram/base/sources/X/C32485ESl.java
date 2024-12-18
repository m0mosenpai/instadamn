package X;

import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.payout.activity.PayoutOnboardingFlowActivity;

/* renamed from: X.ESl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32485ESl extends C1P1 {
    public final /* synthetic */ UserMonetizationProductType A00;
    public final /* synthetic */ PayoutOnboardingFlowActivity A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C32485ESl(UserMonetizationProductType userMonetizationProductType, PayoutOnboardingFlowActivity payoutOnboardingFlowActivity, String str, String str2, String str3) {
        this.A01 = payoutOnboardingFlowActivity;
        this.A00 = userMonetizationProductType;
        this.A04 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0044, code lost:
    
        if (X.C14360o3.A0K(r1, "1869943030133816") == false) goto L11;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 347027203(0x14af3703, float:1.7692183E-26)
            int r2 = X.C0f9.A03(r0)
            X.3DC r12 = (X.C3DC) r12
            r0 = -1651925700(0xffffffff9d899d3c, float:-3.6426175E-21)
            int r3 = X.AbstractC167017dG.A0N(r12, r0)
            boolean r0 = r12.isOk()
            r1 = 1
            if (r0 == 0) goto L46
            java.lang.Object r0 = r12.F7f()
            X.PrL r0 = (X.InterfaceC58215PrL) r0
            X.Mug r0 = (X.C51776Mug) r0
            java.util.List r0 = r0.A02
            int r0 = r0.size()
            if (r0 != r1) goto L46
            java.lang.Object r0 = r12.F7f()
            X.PrL r0 = (X.InterfaceC58215PrL) r0
            X.Mug r0 = (X.C51776Mug) r0
            java.util.List r0 = r0.A02
            java.lang.Object r0 = X.AbstractC001800i.A0J(r0)
            X.Gam r0 = (X.InterfaceC37237Gam) r0
            if (r0 == 0) goto L65
            X.E7g r0 = (X.E7g) r0
            java.lang.String r1 = r0.A02
        L3d:
            java.lang.String r0 = "1869943030133816"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            r10 = 1
            if (r0 != 0) goto L47
        L46:
            r10 = 0
        L47:
            com.instagram.payout.activity.PayoutOnboardingFlowActivity r6 = r11.A01
            com.instagram.common.session.UserSession r5 = X.AbstractC31181DnP.A08(r6)
            com.instagram.api.schemas.UserMonetizationProductType r4 = r11.A00
            java.lang.String r7 = r11.A04
            java.lang.String r8 = r11.A02
            java.lang.String r9 = r11.A03
            com.instagram.payout.activity.PayoutOnboardingFlowActivity.A00(r4, r5, r6, r7, r8, r9, r10)
            r0 = -1523694418(0xffffffffa52e44ae, float:-1.5115364E-16)
            X.C0f9.A0A(r0, r3)
            r0 = 1245522125(0x4a3d28cd, float:3099187.2)
            X.C0f9.A0A(r0, r2)
            return
        L65:
            r1 = 0
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32485ESl.onSuccess(java.lang.Object):void");
    }
}
