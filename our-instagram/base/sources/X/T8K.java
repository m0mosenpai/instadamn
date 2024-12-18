package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes10.dex */
public final class T8K implements C2JL {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ InterfaceC02550Ad A02;
    public final /* synthetic */ boolean A03;

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        C14360o3.A0B(th, 0);
        FragmentActivity fragmentActivity = this.A01;
        fragmentActivity.setResult(0, AbstractC58323PtF.A0I(AbstractC31171DnF.A04(), "result_type", "new_token", th));
        if (this.A03) {
            C63295Sgw.A01(fragmentActivity, C05F.A01);
        }
        fragmentActivity.finish();
        C63295Sgw c63295Sgw = C63295Sgw.A00;
        AbstractC58323PtF.A19(this.A00, this.A02, c63295Sgw, C05F.A0j, th);
    }

    public T8K(Bundle bundle, FragmentActivity fragmentActivity, InterfaceC02550Ad interfaceC02550Ad, boolean z) {
        this.A01 = fragmentActivity;
        this.A02 = interfaceC02550Ad;
        this.A00 = bundle;
        this.A03 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    @Override // X.C2JL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r7) {
        /*
            r6 = this;
            X.436 r7 = (X.AnonymousClass436) r7
            r5 = 0
            if (r7 == 0) goto L84
            java.lang.Object r4 = r7.Bos()
            X.TqE r4 = (X.InterfaceC65643TqE) r4
            if (r4 == 0) goto L84
            X.2JS r4 = (X.C2JS) r4
            java.lang.Class<X.QKQ> r2 = X.QKQ.class
            r3 = 0
            java.lang.String r1 = "xfb_amazon_bwp_get_access_token(auth_code:$auth_code,extra_data:$extra_data,state:$state)"
            r0 = -1654316616(0xffffffff9d6521b8, float:-3.032533E-21)
            X.2JS r4 = r4.getOptionalTreeField(r3, r1, r2, r0)
            X.TqD r4 = (X.InterfaceC65642TqD) r4
            if (r4 == 0) goto L85
            r2 = r4
            X.2JS r2 = (X.C2JS) r2
            java.lang.String r0 = "access_token"
            java.lang.String r3 = r2.getOptionalStringField(r3, r0)
            r1 = 1
            java.lang.String r0 = "expiry_time"
            int r0 = r2.getCoercedIntField(r1, r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L34:
            java.lang.String r1 = "new_token"
            java.lang.String r0 = "result_type"
            if (r4 == 0) goto L87
            if (r3 == 0) goto L87
            if (r5 == 0) goto L87
            int r2 = r5.intValue()
            if (r2 == 0) goto L87
            android.content.Intent r1 = X.AbstractC58322PtE.A0F(r0, r1)
            java.lang.String r0 = "access_token"
            android.content.Intent r1 = r1.putExtra(r0, r3)
            java.lang.String r0 = "expiry_time"
            android.content.Intent r2 = r1.putExtra(r0, r2)
            android.os.Bundle r4 = r6.A00
            java.lang.String r1 = "iab_session_id"
            java.lang.String r0 = r4.getString(r1)
            if (r0 != 0) goto L60
            java.lang.String r0 = ""
        L60:
            android.content.Intent r2 = r2.putExtra(r1, r0)
            X.C14360o3.A07(r2)
            androidx.fragment.app.FragmentActivity r1 = r6.A01
            r0 = -1
            r1.setResult(r0, r2)
            boolean r0 = r6.A03
            if (r0 == 0) goto L76
            java.lang.Integer r0 = X.C05F.A0C
            X.C63295Sgw.A01(r1, r0)
        L76:
            r1.finish()
            X.Sgw r3 = X.C63295Sgw.A00
            X.0Ad r2 = r6.A02
            java.lang.Integer r1 = X.C05F.A0N
            r0 = 0
            r3.A02(r4, r2, r1, r0)
            return
        L84:
            r4 = r5
        L85:
            r3 = r5
            goto L34
        L87:
            androidx.fragment.app.FragmentActivity r5 = r6.A01
            r2 = 0
            android.content.Intent r1 = X.AbstractC58322PtE.A0F(r0, r1)
            java.lang.String r0 = "error"
            java.lang.String r4 = "null access token or expiry time"
            android.content.Intent r0 = r1.putExtra(r0, r4)
            r5.setResult(r2, r0)
            X.Sgw r3 = X.C63295Sgw.A00
            X.0Ad r2 = r6.A02
            java.lang.Integer r1 = X.C05F.A0j
            android.os.Bundle r0 = r6.A00
            r3.A02(r0, r2, r1, r4)
            boolean r0 = r6.A03
            if (r0 == 0) goto Lad
            java.lang.Integer r0 = X.C05F.A01
            X.C63295Sgw.A01(r5, r0)
        Lad:
            r5.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T8K.onSuccess(java.lang.Object):void");
    }
}
