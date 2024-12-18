package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7X1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7X1 {
    public boolean A00;
    public final InterfaceC08830cm A01;
    public final UserSession A02;
    public final C164357Wy A03;
    public final C163867Va A04;
    public final C7X0 A05;
    public final InterfaceC16820sZ A06;

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0307, code lost:
    
        if (r2 != false) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [X.1ae, X.1bz, X.1OW] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.C44178Jfh r29, int r30) {
        /*
            Method dump skipped, instructions count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7X1.A01(X.Jfh, int):void");
    }

    public final void A00() {
        InterfaceC08830cm interfaceC08830cm = this.A01;
        Object obj = interfaceC08830cm.get();
        C14360o3.A07(obj);
        if (((C7U0) obj).C7r().C7W().A08 == 29) {
            C2056398n A00 = AbstractC2056298m.A00(this.A02);
            Object obj2 = interfaceC08830cm.get();
            C14360o3.A07(obj2);
            String C7I = ((C7U0) obj2).C7r().C7I();
            InterfaceC19630xq interfaceC19630xq = A00.A00;
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            ARD.E7D(AnonymousClass001.A0R("broadcast_channel_reaction_count_", C7I), interfaceC19630xq.getInt(AnonymousClass001.A0R("broadcast_channel_reaction_count_", C7I), 0) + 1);
            ARD.apply();
        }
    }

    public C7X1(UserSession userSession, C164357Wy c164357Wy, C163867Va c163867Va, C7X0 c7x0, InterfaceC08830cm interfaceC08830cm, InterfaceC16820sZ interfaceC16820sZ) {
        this.A02 = userSession;
        this.A04 = c163867Va;
        this.A03 = c164357Wy;
        this.A01 = interfaceC08830cm;
        this.A05 = c7x0;
        this.A06 = interfaceC16820sZ;
    }
}
