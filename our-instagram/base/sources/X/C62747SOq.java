package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.SOq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62747SOq {
    public final C5G6 A00;
    public final UserSession A01;
    public final WeakReference A02;

    public final void A00(C61602RqR c61602RqR) {
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        if (c61602RqR != null) {
            c61602RqR.A0I = "PROMPTED_AUTOMATIC_AUTOFILL";
            SZO A00 = c61602RqR.A00();
            WeakReference weakReference = this.A02;
            C58883QEt A0K = AbstractC58318PtA.A0K(weakReference);
            Bundle bundle4 = null;
            if (A0K != null) {
                bundle = A0K.A03();
            } else {
                bundle = null;
            }
            C5G6 c5g6 = this.A00;
            AbstractC63402SjX.A0A(bundle, c5g6, A00);
            c61602RqR.A0I = "ACCEPTED_AUTOMATIC_AUTOFILL";
            SZO A002 = c61602RqR.A00();
            C58883QEt A0K2 = AbstractC58318PtA.A0K(weakReference);
            if (A0K2 != null) {
                bundle2 = A0K2.A03();
            } else {
                bundle2 = null;
            }
            AbstractC63402SjX.A0A(bundle2, c5g6, A002);
            c61602RqR.A01("enabled_automatic_autofill", "true");
            c61602RqR.A0I = "PROMPTED_AUTOFILL";
            SZO A003 = c61602RqR.A00();
            C58883QEt A0K3 = AbstractC58318PtA.A0K(weakReference);
            if (A0K3 != null) {
                bundle3 = A0K3.A03();
            } else {
                bundle3 = null;
            }
            AbstractC63402SjX.A0A(bundle3, c5g6, A003);
            c61602RqR.A0I = "ACCEPTED_AUTOFILL";
            SZO A004 = c61602RqR.A00();
            C58883QEt A0K4 = AbstractC58318PtA.A0K(weakReference);
            if (A0K4 != null) {
                bundle4 = A0K4.A03();
            }
            AbstractC63402SjX.A0A(bundle4, c5g6, A004);
        }
    }

    public final boolean A01() {
        if (!this.A00.A04.A0A(false) || !AbstractC166987dD.A0x(this.A01).getBoolean("contact_autofill_eligible_for_automatic_autofill", false)) {
            return false;
        }
        return true;
    }

    public C62747SOq(C5G6 c5g6, UserSession userSession, WeakReference weakReference) {
        AbstractC167017dG.A1Q(userSession, c5g6);
        this.A02 = weakReference;
        this.A00 = c5g6;
        this.A01 = userSession;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r3 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A02() {
        /*
            r11 = this;
            boolean r0 = r11.A01()
            if (r0 == 0) goto L69
            X.5G6 r0 = r11.A00
            X.SJd r8 = r0.A00
            r0 = 0
            X.C14360o3.A0B(r8, r0)
            java.lang.Integer r10 = X.C05F.A00
            java.lang.Integer r9 = X.C05F.A0C
            r7 = 3
            X.Mtj r0 = new X.Mtj
            r0.<init>(r10, r9, r10, r7)
            boolean r6 = X.AbstractC61720Rsb.A00(r8, r0)
            X.Mtj r3 = new X.Mtj
            r3.<init>(r10, r10, r10, r7)
            X.QIh r5 = r8.A09
            java.lang.String r1 = r5.A01
            if (r1 == 0) goto L40
            X.Mtj r0 = r8.A0L
            java.lang.Object r0 = r0.A02
            java.util.Map r0 = (java.util.Map) r0
            java.util.List r2 = X.AbstractC43592JPx.A12(r1, r0)
            if (r2 == 0) goto L40
            java.lang.Integer r1 = X.C05F.A0N
            X.MWo r0 = new X.MWo
            r0.<init>(r3, r1)
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L64
        L40:
            X.Mtj r4 = new X.Mtj
            r4.<init>(r10, r9, r10, r7)
            r3 = 0
            java.lang.String r1 = r5.A01
            if (r1 == 0) goto L61
            X.Mtj r0 = r8.A0L
            java.lang.Object r0 = r0.A02
            java.util.Map r0 = (java.util.Map) r0
            java.util.List r2 = X.AbstractC43592JPx.A12(r1, r0)
            if (r2 == 0) goto L61
            java.lang.Integer r1 = X.C05F.A0N
            X.MWo r0 = new X.MWo
            r0.<init>(r4, r1)
            boolean r3 = r2.contains(r0)
        L61:
            r0 = 0
            if (r3 == 0) goto L65
        L64:
            r0 = 1
        L65:
            if (r6 == 0) goto L6b
            if (r0 == 0) goto L6b
        L69:
            r0 = 0
            return r0
        L6b:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62747SOq.A02():boolean");
    }
}
