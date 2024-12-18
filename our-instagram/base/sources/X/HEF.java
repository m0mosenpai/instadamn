package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.List;

/* loaded from: classes7.dex */
public final class HEF extends C7E1 {
    public Reel A00;
    public C41181vS A01;
    public String A02;
    public final List A03;
    public final C65662y2 A04;
    public final C41951wl A05;
    public final C41891wf A06;
    public final C66266U6k A07;
    public final InterfaceC62602sz A08;
    public final C65842yM A09;
    public final boolean A0A;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.2y2, java.lang.Object] */
    public HEF(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC71989XEc interfaceC71989XEc, InterfaceC62602sz interfaceC62602sz) {
        C66266U6k c66266U6k = new C66266U6k(context, interfaceC11380iw, userSession, interfaceC71989XEc);
        this.A07 = c66266U6k;
        C65842yM c65842yM = new C65842yM(context);
        this.A09 = c65842yM;
        ?? obj = new Object();
        this.A04 = obj;
        this.A08 = interfaceC62602sz;
        this.A03 = AbstractC166987dD.A1E();
        this.A0A = AbstractC31174DnI.A1V(userSession);
        this.A05 = C41951wl.A00(userSession);
        C41891wf A01 = C41891wf.A01(userSession);
        C14360o3.A07(A01);
        this.A06 = A01;
        AbstractC37304Gc5.A1N(this, c66266U6k, c65842yM, obj, AbstractC167017dG.A05(context));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if (r1 == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.HEF r10) {
        /*
            r10.A06()
            X.2y2 r3 = r10.A04
            r2 = 0
            r10.A08(r3, r2)
            java.util.List r0 = r10.A03
            java.util.Iterator r9 = r0.iterator()
        Lf:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L60
            java.lang.Object r8 = r9.next()
            X.H7x r8 = (X.C38826H7x) r8
            com.instagram.model.reels.Reel r7 = r10.A00
            X.1vS r6 = r10.A01
            com.instagram.user.model.User r5 = r8.A00
            boolean r0 = r10.A0A
            java.lang.String r4 = "Required value was null."
            if (r0 == 0) goto L34
            X.1wf r1 = r10.A06
            X.1wl r0 = r10.A05
            if (r5 == 0) goto L5b
            boolean r1 = r1.A0C(r0, r5)
            r0 = 1
            if (r1 != 0) goto L35
        L34:
            r0 = 0
        L35:
            X.GsB r1 = new X.GsB
            r1.<init>(r7, r6, r5, r0)
            java.lang.String r0 = r10.A02
            if (r0 == 0) goto L56
            r1.A0A = r0
            java.lang.Float r0 = r8.A01
            if (r0 == 0) goto L54
            float r0 = r0.floatValue()
        L48:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.A03 = r0
            X.U6k r0 = r10.A07
            r10.A08(r0, r1)
            goto Lf
        L54:
            r0 = 0
            goto L48
        L56:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r4)
            throw r0
        L5b:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r4)
            throw r0
        L60:
            X.2sz r1 = r10.A08
            boolean r0 = r1.CLJ()
            if (r0 == 0) goto L6d
            X.2yM r0 = r10.A09
            r10.A08(r0, r1)
        L6d:
            r10.A08(r3, r2)
            r10.A07()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HEF.A00(X.HEF):void");
    }
}
