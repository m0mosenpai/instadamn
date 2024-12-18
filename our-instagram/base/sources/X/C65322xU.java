package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;

/* renamed from: X.2xU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C65322xU extends AbstractC65332xV {
    public UserSession A00;
    public final java.util.Set A01;
    public final boolean A02;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x001d, code lost:
    
        if (r0 != false) goto L11;
     */
    @Override // X.AbstractC65332xV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.String A03(java.lang.Object r4) {
        /*
            r3 = this;
            X.3XG r4 = (X.C3XG) r4
            X.1qS r0 = r4.A05
            X.1qM r2 = X.C3XH.A02(r0)
            if (r2 != 0) goto Ld
            java.lang.String r0 = r4.A09
            return r0
        Ld:
            com.instagram.common.session.UserSession r1 = r3.A00
            boolean r0 = r3.A02
            if (r1 == 0) goto L1d
            if (r0 != 0) goto L1f
            X.1Ai r0 = X.AbstractC23021Ah.A00(r1)
            boolean r0 = X.AbstractC61652rS.A08(r1, r0)
        L1d:
            if (r0 == 0) goto L30
        L1f:
            boolean r0 = r2.CdW()
            if (r0 == 0) goto L30
            java.lang.String r0 = r2.A2W()
            if (r0 == 0) goto L30
            java.lang.String r0 = r2.A2W()
            return r0
        L30:
            java.lang.String r0 = r2.getId()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65322xU.A03(java.lang.Object):java.lang.String");
    }

    @Override // X.AbstractC65332xV
    public final void A05() {
        this.A01.clear();
    }

    @Override // X.AbstractC65332xV
    public final /* bridge */ /* synthetic */ void A09(Object obj) {
        InterfaceC38381qS interfaceC38381qS = ((C3XG) obj).A05;
        if (interfaceC38381qS instanceof InterfaceC38371qR) {
            java.util.Set set = this.A01;
            C14360o3.A0C(interfaceC38381qS, "null cannot be cast to non-null type com.instagram.feed.media.ModelWithMedia");
            set.add(((InterfaceC38371qR) interfaceC38381qS).BQN());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0010, code lost:
    
        if (r0 != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0F(X.C38321qM r3) {
        /*
            r2 = this;
            com.instagram.common.session.UserSession r1 = r2.A00
            boolean r0 = r2.A02
            if (r1 == 0) goto L10
            if (r0 != 0) goto L12
            X.1Ai r0 = X.AbstractC23021Ah.A00(r1)
            boolean r0 = X.AbstractC61652rS.A08(r1, r0)
        L10:
            if (r0 == 0) goto L2d
        L12:
            boolean r0 = r3.CdW()
            if (r0 == 0) goto L2d
            java.lang.String r0 = r3.A2W()
            if (r0 == 0) goto L2d
            java.lang.String r1 = r3.A2W()
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            java.util.Map r0 = r2.A04
            boolean r0 = r0.containsKey(r1)
            return r0
        L2d:
            java.util.Set r0 = r2.A01
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L4b
            java.lang.String r0 = r3.getId()
            if (r0 == 0) goto L4d
            java.lang.String r1 = r3.getId()
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            java.util.Map r0 = r2.A04
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L4d
        L4b:
            r0 = 1
            return r0
        L4d:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65322xU.A0F(X.1qM):boolean");
    }

    public C65322xU(UserSession userSession) {
        this.A01 = new HashSet();
        this.A02 = C18U.A06(C06090Tz.A05, userSession, 36312866155922778L);
        this.A00 = userSession;
    }

    public C65322xU() {
        this.A01 = new HashSet();
        this.A02 = false;
    }
}
