package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.7VI, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7VI {
    public final C7VG A00;

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        if (r5.A0b.size() == 1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(android.view.View r19) {
        /*
            Method dump skipped, instructions count: 1252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7VI.A04(android.view.View):void");
    }

    public final void A05(C07T c07t) {
        C07W c07w;
        if (this instanceof C7UA) {
            c07w = (C7UA) this;
        } else if (this instanceof C159437De) {
            c07w = (C7VK) ((C159437De) this).A0H.getValue();
        } else {
            if (this instanceof C7UK) {
                C7UK c7uk = (C7UK) this;
                if (!((C7TT) c7uk.A01.invoke()).A00()) {
                    return;
                }
                UserSession userSession = ((C7VI) c7uk).A00.A00;
                if (!C18U.A06(C06090Tz.A05, userSession, 36330376738063187L)) {
                    return;
                }
                c07t.A09(new C28882Coq(userSession, (Context) c7uk.A00.invoke()));
                return;
            }
            if (!(this instanceof C7VL)) {
                return;
            } else {
                c07w = (C7VL) this;
            }
        }
        c07t.A09(c07w);
    }

    public final void A06(C07T c07t) {
        C07W c07w;
        if (this instanceof C7U8) {
            C149596oC c149596oC = ((C7U8) this).A01;
            C41761wQ c41761wQ = c149596oC.A00;
            if (c41761wQ != null) {
                c41761wQ.A00.dispose();
                c149596oC.A00 = null;
                return;
            }
            return;
        }
        if (this instanceof C159437De) {
            c07w = (C7VK) ((C159437De) this).A0H.getValue();
        } else if (!(this instanceof C7VL)) {
            return;
        } else {
            c07w = (C7VL) this;
        }
        c07t.A0A(c07w);
    }

    public C7VI(C7VG c7vg) {
        this.A00 = c7vg;
    }
}
