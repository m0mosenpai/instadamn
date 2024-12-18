package X;

import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.fx.access.sso.FxSsoViewModel;

/* renamed from: X.EUw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32546EUw extends C1P1 {
    public final /* synthetic */ C46h A00;
    public final /* synthetic */ C07270a1 A01;
    public final /* synthetic */ EVQ A02;
    public final /* synthetic */ C6WQ A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public C32546EUw(C46h c46h, C07270a1 c07270a1, EVQ evq, C6WQ c6wq, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.A02 = evq;
        this.A09 = z;
        this.A08 = z2;
        this.A04 = str;
        this.A05 = str2;
        this.A07 = z3;
        this.A01 = c07270a1;
        this.A06 = str3;
        this.A00 = c46h;
        this.A03 = c6wq;
    }

    private void A00() {
        EVQ evq = this.A02;
        CallerContext callerContext = EVQ.A0B;
        FxSsoViewModel fxSsoViewModel = evq.A00;
        if (fxSsoViewModel != null) {
            AbstractC31172DnG.A0F(fxSsoViewModel.A04).A0B(true);
        }
    }

    private void A01(String str, boolean z) {
        EVQ evq = this.A02;
        CallerContext callerContext = EVQ.A0B;
        C07270a1 c07270a1 = evq.A08;
        EnumC31713DwI enumC31713DwI = evq.A09;
        AbstractC34352FCu.A00(c07270a1, AbstractC166997dE.A0b(), enumC31713DwI.A01, this.A05, str, z, this.A08);
        C35037FcA A06 = C1Q9.A1v.A02(c07270a1).A06(EnumC33445EqI.A04, enumC31713DwI);
        if (str != null) {
            A06.A04("error", str);
        }
        A06.A02();
        if (str != null && !str.equals("fb_email_taken")) {
            A00();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0139, code lost:
    
        if ((!r0) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r23.A09 != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0292  */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32546EUw.onSuccess(java.lang.Object):void");
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String str;
        int i;
        int A03 = C0f9.A03(1581441747);
        CallerContext callerContext = EVQ.A0B;
        boolean z = abstractC115105If instanceof C115115Ig;
        if (z && ((C32196ECr) ((C115115Ig) abstractC115105If).A00).A02) {
            EVQ evq = this.A02;
            C32196ECr c32196ECr = (C32196ECr) abstractC115105If.A00();
            evq.A05.post(new RunnableC36944GPn(c32196ECr.A00, c32196ECr.A01, evq));
            i = 1120741147;
        } else {
            if (!z || (str = ((C40781ul) abstractC115105If.A00()).mErrorType) == null) {
                str = "request_failed";
            }
            A01(str, z);
            Throwable A01 = abstractC115105If.A01();
            if (A01 != null) {
                C0w9.A07("facebook_sso_error", A01);
            }
            if (z) {
                EfV efV = (EfV) abstractC115105If.A00();
                if (!efV.isCheckpointRequired()) {
                    this.A02.A0C(efV, this.A04, this.A05, this.A06);
                }
                String str2 = efV.A0D;
                if (str2 != null) {
                    C46h c46h = this.A00;
                    if (c46h instanceof C4JL) {
                        ((TextView) c46h.A03()).setText(str2);
                    }
                }
            } else {
                AbstractC35254Fgn.A01(this.A02.A04);
            }
            i = -595463857;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(1643649854);
        this.A03.dismiss();
        C0f9.A0A(712614049, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(97928716);
        C0fJ.A00(this.A03);
        C0f9.A0A(-672705688, A03);
    }
}
