package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.List;

/* loaded from: classes7.dex */
public final class HEG extends C7E1 {
    public Reel A00;
    public C41181vS A01;
    public String A02;
    public List A03;
    public final List A04;
    public final C65662y2 A05;
    public final C41951wl A06;
    public final C41891wf A07;
    public final C66266U6k A08;
    public final InterfaceC62602sz A09;
    public final C65842yM A0A;
    public final boolean A0B;
    public final boolean A0C;

    /* JADX WARN: Type inference failed for: r4v0, types: [X.2y2, java.lang.Object] */
    public HEG(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC71989XEc interfaceC71989XEc, InterfaceC62602sz interfaceC62602sz) {
        AbstractC167017dG.A1R(userSession, interfaceC62602sz);
        C66266U6k c66266U6k = new C66266U6k(context, interfaceC11380iw, userSession, interfaceC71989XEc);
        this.A08 = c66266U6k;
        C65842yM c65842yM = new C65842yM(context);
        this.A0A = c65842yM;
        ?? obj = new Object();
        this.A05 = obj;
        this.A09 = interfaceC62602sz;
        this.A04 = AbstractC166987dD.A1E();
        this.A0B = AbstractC31174DnI.A1V(userSession);
        this.A0C = C18U.A06(C06090Tz.A06, userSession, 36312531148539038L);
        this.A06 = C41951wl.A00(userSession);
        C41891wf A01 = C41891wf.A01(userSession);
        C14360o3.A07(A01);
        this.A07 = A01;
        AbstractC37304Gc5.A1N(this, c66266U6k, c65842yM, obj, AbstractC167017dG.A05(context));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r10.A07.A0C(r10.A06, r2) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.HEG r10) {
        /*
            r10.A06()
            X.2y2 r4 = r10.A05
            r3 = 0
            r10.A08(r4, r3)
            boolean r0 = r10.A0C
            r5 = 1
            if (r0 == 0) goto L26
            java.util.List r0 = r10.A03
            if (r0 == 0) goto L26
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L26
            com.instagram.model.reels.Reel r2 = r10.A00
            X.1vS r0 = r10.A01
            X.GsB r1 = new X.GsB
            r1.<init>(r2, r0)
            X.U6k r0 = r10.A08
            r10.A08(r0, r1)
        L26:
            java.util.List r0 = r10.A04
            java.util.Iterator r9 = r0.iterator()
        L2c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r8 = r9.next()
            X.E9W r8 = (X.E9W) r8
            com.instagram.model.reels.Reel r7 = r10.A00
            X.1vS r6 = r10.A01
            com.instagram.user.model.User r2 = r8.A01
            boolean r0 = r10.A0B
            if (r0 == 0) goto L4f
            if (r2 == 0) goto L4f
            X.1wf r1 = r10.A07
            X.1wl r0 = r10.A06
            boolean r1 = r1.A0C(r0, r2)
            r0 = 1
            if (r1 != 0) goto L50
        L4f:
            r0 = 0
        L50:
            X.GsB r1 = new X.GsB
            r1.<init>(r7, r6, r2, r0)
            java.lang.Integer r0 = r8.A04
            if (r0 == 0) goto L5b
            r1.A04 = r0
        L5b:
            java.lang.String r0 = r10.A02
            if (r0 == 0) goto L61
            r1.A06 = r0
        L61:
            X.U6k r0 = r10.A08
            r10.A08(r0, r1)
            goto L2c
        L67:
            X.2sz r1 = r10.A09
            if (r1 == 0) goto L76
            boolean r0 = r1.CLJ()
            if (r0 != r5) goto L76
            X.2yM r0 = r10.A0A
            r10.A08(r0, r1)
        L76:
            r10.A08(r4, r3)
            r10.A07()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HEG.A00(X.HEG):void");
    }
}
