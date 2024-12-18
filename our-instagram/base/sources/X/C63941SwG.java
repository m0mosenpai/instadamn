package X;

import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: X.SwG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63941SwG implements InterfaceC58016Po0 {
    public final Bundle A00;
    public final C63305ShB A01;
    public final WeakReference A02;
    public final WeakReference A03;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if (r1 != null) goto L6;
     */
    @Override // X.InterfaceC58016Po0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Di1(com.facebook.browser.lite.extensions.autofill.model.AutofillData r5, boolean r6) {
        /*
            r4 = this;
            java.lang.ref.WeakReference r0 = r4.A02
            X.QEt r1 = X.AbstractC58318PtA.A0K(r0)
            java.lang.ref.WeakReference r0 = r4.A03
            java.lang.Object r0 = r0.get()
            X.QF6 r0 = (X.QF6) r0
            if (r0 == 0) goto L2a
            if (r1 == 0) goto L18
            r1.A0G(r0)
        L15:
            r1.A0B(r5)
        L18:
            X.ShB r3 = r4.A01
            X.SJi r2 = X.S6J.A00
            java.lang.String r1 = "ACCEPTED_SAVE"
            java.lang.String r0 = "CONTACT_AUTOFILL"
            java.util.LinkedHashMap r1 = r2.A00(r1, r0, r6)
            android.os.Bundle r0 = r4.A00
            r3.A07(r0, r1)
            return
        L2a:
            if (r1 == 0) goto L18
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63941SwG.Di1(com.facebook.browser.lite.extensions.autofill.model.AutofillData, boolean):void");
    }

    @Override // X.InterfaceC58016Po0
    public final void onDecline() {
        this.A01.A07(this.A00, S6J.A00.A00("NOT_NOW_CLICK", "CONTACT_AUTOFILL", false));
    }

    public C63941SwG(Bundle bundle, C63305ShB c63305ShB, C58883QEt c58883QEt, QF6 qf6) {
        this.A00 = bundle;
        this.A01 = c63305ShB;
        this.A03 = AbstractC25225BEi.A16(qf6);
        this.A02 = AbstractC25225BEi.A16(c58883QEt);
    }
}
