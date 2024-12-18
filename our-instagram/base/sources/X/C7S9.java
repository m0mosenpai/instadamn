package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.7S9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7S9 implements C7QD {
    public final UserSession A00;
    public final C57012jc A01;
    public final InterfaceC165597am A02;
    public final InterfaceC09390do A03;

    public C7S9(UserSession userSession, C57012jc c57012jc, InterfaceC165597am interfaceC165597am) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c57012jc, 2);
        C14360o3.A0B(interfaceC165597am, 3);
        this.A00 = userSession;
        this.A01 = c57012jc;
        this.A02 = interfaceC165597am;
        this.A03 = AbstractC09440dt.A01(new C9E8(this, 25));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (r9 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.C7BR r22) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7S9.A00(X.7BR):void");
    }

    @Override // X.C7QD
    public final View BKF() {
        View view;
        C57012jc c57012jc = this.A01;
        if (c57012jc.A00 != null) {
            view = c57012jc.A01();
        } else {
            view = c57012jc.A01;
        }
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
