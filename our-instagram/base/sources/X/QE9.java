package X;

import android.content.DialogInterface;
import com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class QE9 extends QEF {
    public int A00;
    public long A01;
    public DialogInterface.OnDismissListener A02;
    public AutofillSharedJSBridgeProxy A03;
    public C5G6 A04;
    public C58883QEt A05;
    public C43031yW A06;
    public AutofillData A07;
    public AutofillData A08;
    public RequestAutofillJSBridgeCall A09;
    public String A0A;
    public List A0B;
    public final SOY A0E;
    public boolean A0D = false;
    public boolean A0C = false;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
    
        if (r0 != false) goto L10;
     */
    @Override // X.C0SG, android.content.DialogInterface.OnCancelListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCancel(android.content.DialogInterface r11) {
        /*
            r10 = this;
            int r1 = r10.A00
            r3 = 1
            if (r1 != r3) goto La2
            X.QEt r0 = r10.A05
            if (r0 == 0) goto L9d
            boolean r1 = r10.A0D
            boolean r0 = r10.A0C
            if (r1 == 0) goto L12
            r9 = 1
            if (r0 == 0) goto L13
        L12:
            r9 = 0
        L13:
            r2 = 0
            if (r9 == 0) goto L23
            X.5G6 r0 = r10.A04
            if (r0 == 0) goto L23
            X.1yW r0 = r0.A04
            boolean r0 = X.AbstractC61724Rsf.A00(r0, r3)
            if (r0 == 0) goto L23
            r9 = 0
        L23:
            X.SOY r1 = r10.A0E
            java.lang.String r0 = "DECLINED_SAVE"
            X.RqR r4 = r1.A00(r0, r2)
            X.5G6 r0 = r10.A04
            r3 = 0
            if (r0 == 0) goto La0
            X.SJd r0 = r0.A00
            X.QIl r0 = r0.A00
            java.lang.String r0 = r0.A00
        L36:
            X.AbstractC63402SjX.A0E(r10, r4, r0)
            long r5 = r10.A01
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L9e
            long r1 = X.AbstractC37300Gc1.A00(r5)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L9e
            long r1 = X.AbstractC37300Gc1.A00(r5)
            int r0 = (int) r1
        L4e:
            r4.A01 = r0
            java.lang.String r0 = r10.A0A
            r4.A08 = r0
            r0 = 0
            if (r9 == 0) goto L58
            r0 = 1
        L58:
            r4.A0P = r0
            X.1yW r0 = r10.A06
            if (r0 == 0) goto L61
            X.AbstractC63402SjX.A0D(r10, r4)
        L61:
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = r10.A08
            com.facebook.browser.lite.extensions.autofill.model.AutofillData[] r0 = new com.facebook.browser.lite.extensions.autofill.model.AutofillData[]{r0}
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.String r0 = X.AbstractC63402SjX.A01(r0)
            r4.A07 = r0
            X.SZO r2 = r4.A00()
            X.QEt r0 = r10.A05
            android.os.Bundle r1 = r0.A03()
            X.5G6 r0 = r10.A04
            X.AbstractC63402SjX.A0A(r1, r0, r2)
            r10.A02 = r3
            X.QEt r1 = r10.A05
            X.7mi r0 = r1.A04
            if (r0 == 0) goto L9d
            X.QF6 r0 = r0.C9a()
            if (r0 == 0) goto L9d
            boolean r0 = r1.A0I()
            if (r0 == 0) goto L9d
            X.7mi r0 = r1.A04
            X.QF6 r0 = r0.C9a()
            r0.A08()
        L9d:
            return
        L9e:
            r0 = 0
            goto L4e
        La0:
            r0 = r3
            goto L36
        La2:
            java.lang.String r0 = "Invalid reason for opening save autofill bottom sheet: "
            java.lang.IllegalArgumentException r0 = X.AbstractC25230BEn.A0n(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QE9.onCancel(android.content.DialogInterface):void");
    }

    public QE9(SOY soy) {
        this.A0E = soy;
    }

    @Override // X.C0SG, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.A01 = 0L;
        DialogInterface.OnDismissListener onDismissListener = this.A02;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    @Override // X.Q7i, X.C0SG, androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-134069482);
        this.A01 = System.currentTimeMillis();
        super.onStart();
        C0f9.A09(494675307, A02);
    }
}
