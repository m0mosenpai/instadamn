package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lp8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC49191Lp8 implements InterfaceC50469MPx {
    public final Context A00;
    public final AnonymousClass988 A01;
    public final C7IM A02;
    public final C47763L7j A03;
    public final UserSession A04;
    public final C47762L7i A05;

    @Override // X.InterfaceC50469MPx
    public boolean AFd(C99E c99e, InterfaceC50520MRx interfaceC50520MRx, int i) {
        C14360o3.A0B(interfaceC50520MRx, 0);
        return AbstractC167007dF.A1X(LIQ.A00(c99e, interfaceC50520MRx, i), A00());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        if (X.C14360o3.A0K(java.lang.String.valueOf(r4), r40.BSx(r43)) != false) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0260 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0054  */
    @Override // X.InterfaceC50469MPx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C47908LEc AWs(android.content.Context r35, X.C51760Mtj r36, X.C99E r37, com.instagram.direct.model.messaginguser.MessagingUser r38, X.L8R r39, X.InterfaceC50520MRx r40, java.util.Map r41, java.util.Set r42, int r43, boolean r44) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC49191Lp8.AWs(android.content.Context, X.Mtj, X.99E, com.instagram.direct.model.messaginguser.MessagingUser, X.L8R, X.MRx, java.util.Map, java.util.Set, int, boolean):X.LEc");
    }

    public final C2EY A00() {
        if (this instanceof C45951KVd) {
            return ((C45951KVd) this).A00;
        }
        if (this instanceof C45957KVk) {
            return ((C45957KVk) this).A02;
        }
        if (this instanceof C45956KVj) {
            return ((C45956KVj) this).A02;
        }
        if (this instanceof C45955KVi) {
            return ((C45955KVi) this).A03;
        }
        if (this instanceof C45954KVg) {
            return ((C45954KVg) this).A00;
        }
        if (this instanceof KVh) {
            return ((KVh) this).A02;
        }
        if (this instanceof C45958KVl) {
            return ((C45958KVl) this).A02;
        }
        if (this instanceof C45953KVf) {
            return ((C45953KVf) this).A03;
        }
        if (this instanceof C45950KVc) {
            return ((C45950KVc) this).A00;
        }
        return ((C45952KVe) this).A00;
    }

    public AbstractC49191Lp8(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7IM c7im) {
        this.A00 = context;
        this.A04 = userSession;
        this.A02 = c7im;
        this.A01 = anonymousClass988;
        this.A03 = new C47763L7j(userSession, anonymousClass988, c7im, new L1Z(userSession, anonymousClass988));
        this.A05 = Ko2.A00(context, userSession, anonymousClass988, c7im);
    }
}
