package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Lr6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49312Lr6 implements MQ5 {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C48503Lcu A03;
    public final DirectShareTarget A04;
    public final C211689Zc A05;
    public final String A06;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r15.A11() != false) goto L6;
     */
    @Override // X.MQ5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AJ9(X.C47Z r15) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49312Lr6.AJ9(X.47Z):void");
    }

    public /* synthetic */ C49312Lr6(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, DirectShareTarget directShareTarget, C211689Zc c211689Zc, String str) {
        C48503Lcu c48503Lcu = (C48503Lcu) userSession.A01(C48503Lcu.class, C50223MGe.A00);
        AbstractC37302Gc3.A1U(str, directShareTarget);
        C14360o3.A0B(c48503Lcu, 7);
        this.A00 = context;
        this.A02 = userSession;
        this.A06 = str;
        this.A04 = directShareTarget;
        this.A05 = c211689Zc;
        this.A01 = interfaceC11380iw;
        this.A03 = c48503Lcu;
    }

    @Override // X.MQ5
    public final String BcD() {
        return this.A06;
    }
}
