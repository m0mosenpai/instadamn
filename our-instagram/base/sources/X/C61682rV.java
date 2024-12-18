package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;

/* renamed from: X.2rV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61682rV extends AbstractC61692rW implements InterfaceC60602pj {
    @Override // X.AbstractC61692rW
    public final void A07(C38321qM c38321qM, boolean z) {
        String id;
        if (c38321qM != null && (id = c38321qM.getId()) != null) {
            String str = this.A01;
            if (str != null && str.equals(id)) {
                C61712rY c61712rY = this.A04;
                String str2 = this.A05;
                Integer num = C05F.A00;
                c61712rY.A01(null, num, C05F.A0N, str2);
                c61712rY.A06(null, num, str2, "is_auto_play", z);
                if (!z) {
                    c61712rY.A02(null, num, str2);
                }
            }
            String str3 = this.A02;
            if (str3 != null && str3.equals(id)) {
                C61712rY c61712rY2 = this.A04;
                String str4 = this.A05;
                Integer num2 = C05F.A0N;
                c61712rY2.A01(null, num2, num2, str4);
                c61712rY2.A06(null, num2, str4, "is_auto_play", z);
                if (!z) {
                    c61712rY2.A02(null, num2, str4);
                }
            }
        }
        super.A07(c38321qM, z);
    }

    @Override // X.AbstractC61692rW
    public final boolean A0A(String str) {
        C14360o3.A0B(str, 0);
        return "feed_timeline".equals(str);
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r13.A5N() != false) goto L9;
     */
    @Override // X.AbstractC61692rW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(X.C38321qM r13) {
        /*
            r12 = this;
            if (r13 == 0) goto L66
            java.lang.String r1 = r13.getId()
            if (r1 == 0) goto L66
            boolean r0 = r13.A5M()
            if (r0 != 0) goto L15
            boolean r0 = r13.A5N()
            r11 = 0
            if (r0 == 0) goto L16
        L15:
            r11 = 1
        L16:
            java.lang.String r0 = r12.A01
            if (r0 == 0) goto L3e
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3e
            X.2rY r2 = r12.A04
            java.lang.String r5 = r12.A05
            java.lang.Integer r4 = X.C05F.A00
            java.lang.Integer r0 = X.C05F.A0C
            r3 = 0
            r2.A01(r3, r4, r0, r5)
            boolean r7 = r13.Cff()
            java.lang.String r6 = "is_video"
            r2.A06(r3, r4, r5, r6, r7)
            java.lang.String r10 = "is_carousel"
            r6 = r2
            r7 = r3
            r8 = r4
            r9 = r5
            r6.A06(r7, r8, r9, r10, r11)
        L3e:
            java.lang.String r0 = r12.A02
            if (r0 == 0) goto L66
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L66
            X.2rY r1 = r12.A04
            java.lang.String r4 = r12.A05
            java.lang.Integer r3 = X.C05F.A0N
            java.lang.Integer r0 = X.C05F.A0C
            r2 = 0
            r1.A01(r2, r3, r0, r4)
            boolean r6 = r13.Cff()
            java.lang.String r5 = "is_video"
            r1.A06(r2, r3, r4, r5, r6)
            java.lang.String r10 = "is_carousel"
            r6 = r1
            r7 = r2
            r8 = r3
            r9 = r4
            r6.A06(r7, r8, r9, r10, r11)
        L66:
            super.A04(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61682rV.A04(X.1qM):void");
    }

    @Override // X.AbstractC61692rW
    public final boolean A09(AnonymousClass341 anonymousClass341) {
        if (anonymousClass341 != AnonymousClass341.A0H) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC60602pj
    public final void onCreate() {
        A08(this.A00, true);
    }

    @Override // X.AbstractC61692rW
    public final void A02(C38321qM c38321qM) {
        String id = c38321qM.getId();
        if (id != null) {
            String str = this.A01;
            if (str != null && str.equals(id)) {
                this.A04.A03(null, C05F.A00, this.A05);
            }
            String str2 = this.A02;
            if (str2 != null && str2.equals(id)) {
                this.A04.A03(null, C05F.A0N, this.A05);
            }
        }
        super.A02(c38321qM);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r13.A5N() != false) goto L10;
     */
    @Override // X.AbstractC61692rW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(X.C38321qM r13) {
        /*
            r12 = this;
            java.lang.String r1 = r13.getId()
            if (r1 == 0) goto L74
            java.util.Set r0 = r12.A06
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L74
            boolean r0 = r13.A5M()
            if (r0 != 0) goto L1b
            boolean r0 = r13.A5N()
            r11 = 0
            if (r0 == 0) goto L1c
        L1b:
            r11 = 1
        L1c:
            java.lang.String r0 = r12.A01
            if (r0 == 0) goto L48
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L48
            boolean r0 = r13.Cff()
            if (r0 != 0) goto L48
            X.2rY r2 = r12.A04
            java.lang.String r5 = r12.A05
            java.lang.Integer r4 = X.C05F.A00
            boolean r7 = r13.Cff()
            r3 = 0
            java.lang.String r6 = "is_video"
            r2.A06(r3, r4, r5, r6, r7)
            java.lang.String r10 = "is_carousel"
            r6 = r2
            r7 = r3
            r8 = r4
            r9 = r5
            r6.A06(r7, r8, r9, r10, r11)
            r2.A02(r3, r4, r5)
        L48:
            java.lang.String r0 = r12.A02
            if (r0 == 0) goto L74
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L74
            boolean r0 = r13.Cff()
            if (r0 != 0) goto L74
            X.2rY r0 = r12.A04
            java.lang.String r3 = r12.A05
            java.lang.Integer r2 = X.C05F.A0N
            boolean r5 = r13.Cff()
            r1 = 0
            java.lang.String r4 = "is_video"
            r0.A06(r1, r2, r3, r4, r5)
            java.lang.String r10 = "is_carousel"
            r6 = r0
            r7 = r1
            r8 = r2
            r9 = r3
            r6.A06(r7, r8, r9, r10, r11)
            r0.A02(r1, r2, r3)
        L74:
            super.A03(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61682rV.A03(X.1qM):void");
    }

    @Override // X.AbstractC61692rW
    public final void A05(C38321qM c38321qM) {
        String id = c38321qM.getId();
        if (id != null) {
            String str = this.A01;
            if (str != null && str.equals(id)) {
                C61712rY c61712rY = this.A04;
                String str2 = this.A05;
                Integer num = C05F.A00;
                c61712rY.A01(null, num, C05F.A0Y, str2);
                c61712rY.A02(null, num, str2);
            }
            String str3 = this.A02;
            if (str3 != null && str3.equals(id)) {
                C61712rY c61712rY2 = this.A04;
                String str4 = this.A05;
                Integer num2 = C05F.A0N;
                c61712rY2.A01(null, num2, C05F.A0Y, str4);
                c61712rY2.A02(null, num2, str4);
            }
        }
        super.A05(c38321qM);
    }
}
