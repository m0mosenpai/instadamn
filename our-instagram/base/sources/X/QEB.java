package X;

import android.os.Bundle;
import com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class QEB extends QEF {
    public AutofillSharedJSBridgeProxy A00;
    public SOY A01;
    public C5G6 A02;
    public C58883QEt A03;
    public C43031yW A04;
    public String A05;
    public String A06;
    public List A07 = Collections.emptyList();
    public boolean A08;
    public boolean A09;
    public boolean A0A;

    public final void A0H(C61602RqR c61602RqR) {
        C58883QEt c58883QEt;
        C62747SOq c62747SOq;
        if (A0I(false) && (c58883QEt = this.A03) != null && (c62747SOq = c58883QEt.A07) != null) {
            c61602RqR.A01("automatic_autofill_consent_toggle_status_on", String.valueOf(c62747SOq.A00.A00.A01.A01));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        if (r4.isEmpty() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003b, code lost:
    
        if (r1 != false) goto L8;
     */
    @Override // X.C0SG, android.content.DialogInterface.OnCancelListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCancel(android.content.DialogInterface r7) {
        /*
            r6 = this;
            r4 = 0
            X.C14360o3.A0B(r7, r4)
            java.lang.String r1 = "DECLINED_AUTOFILL"
            X.SOY r0 = r6.A01
            r3 = 0
            if (r0 == 0) goto L95
            X.RqR r5 = r0.A00(r1, r4)
            java.lang.String r0 = r6.A06
            r5.A0A = r0
            r2 = 1
            java.util.List r1 = r6.A07
            int r0 = r1.size()
            int r0 = java.lang.Math.min(r0, r2)
            java.util.List r0 = r1.subList(r4, r0)
            java.lang.String r0 = X.AbstractC63402SjX.A01(r0)
            r5.A07 = r0
            java.util.List r0 = r6.A07
            int r0 = r0.size()
            r5.A00 = r0
            java.lang.String r0 = r6.A05
            r5.A08 = r0
            boolean r0 = r6.A09
            boolean r1 = r6.A08
            if (r0 == 0) goto L3d
            r0 = 1
            if (r1 == 0) goto L3e
        L3d:
            r0 = 0
        L3e:
            r5.A0P = r0
            X.5G6 r0 = r6.A02
            if (r0 == 0) goto La1
            X.SJd r0 = r0.A00
            X.QIl r0 = r0.A00
            java.util.Set r4 = r0.A04
            java.util.Set r2 = r0.A07
            java.lang.String r0 = r0.A00
        L4e:
            r5.A0G = r0
            if (r4 == 0) goto L59
            boolean r1 = r4.isEmpty()
            r0 = 0
            if (r1 == 0) goto L5a
        L59:
            r0 = 1
        L5a:
            java.lang.String r1 = ""
            if (r0 != 0) goto L9f
            java.lang.String r0 = X.AbstractC61723Rse.A00(r4)
        L62:
            r5.A06 = r0
            if (r2 == 0) goto L70
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L70
            java.lang.String r1 = X.AbstractC61723Rse.A00(r2)
        L70:
            r5.A0F = r1
            java.util.List r0 = r6.A07
            int r0 = r0.size()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "num_contact_entries"
            r5.A01(r0, r1)
            r6.A0H(r5)
            X.SZO r2 = r5.A00()
            X.QEt r0 = r6.A03
            if (r0 == 0) goto L9d
            android.os.Bundle r1 = r0.A03()
        L90:
            X.5G6 r0 = r6.A02
            X.AbstractC63402SjX.A0A(r1, r0, r2)
        L95:
            X.QEt r0 = r6.A03
            if (r0 == 0) goto L9c
            r0.A0C(r3)
        L9c:
            return
        L9d:
            r1 = r3
            goto L90
        L9f:
            r0 = r1
            goto L62
        La1:
            r4 = r3
            r2 = r3
            r0 = r3
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QEB.onCancel(android.content.DialogInterface):void");
    }

    public final boolean A0I(boolean z) {
        C62747SOq c62747SOq;
        C58883QEt c58883QEt = this.A03;
        if (c58883QEt != null && (c62747SOq = c58883QEt.A07) != null && !AbstractC166987dD.A0x(c62747SOq.A01).getBoolean("contact_autofill_eligible_for_automatic_autofill", false) && c62747SOq.A00.A04.A0A(z)) {
            return true;
        }
        return false;
    }

    @Override // X.QEF, X.C0SG, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(141682383);
        if (bundle != null) {
            A07();
        }
        super.onCreate(bundle);
        C0f9.A09(-858990404, A02);
    }
}
