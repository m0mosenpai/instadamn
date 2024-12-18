package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes9.dex */
public final class MWN {
    public UserSession A00;
    public MWR A01;
    public MWQ A02;
    public O5U A03;
    public C54621OAw A04;
    public C54621OAw A05;
    public C54621OAw A06;
    public C54621OAw A07;
    public C54561O8n A08;
    public C54562O8o A09;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final java.util.Set A0G = new CopyOnWriteArraySet();
    public boolean A0C = false;
    public List A0B = AbstractC166987dD.A1E();
    public Integer A0A = null;

    public static MWN A00(UserSession userSession) {
        return (MWN) userSession.A01(MWN.class, new C57089PUc(userSession, 3));
    }

    public static boolean A02(MWN mwn) {
        if (mwn.A06.A02 && mwn.A05.A02 && mwn.A04.A02) {
            if (mwn.A03() == C05F.A00 || mwn.A07.A02) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final Integer A03() {
        Boolean bool = this.A04.A00;
        if (bool != null && bool.booleanValue()) {
            Boolean bool2 = this.A07.A00;
            if (bool2 != null && bool2.booleanValue()) {
                return C05F.A0C;
            }
            return C05F.A01;
        }
        return C05F.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (r1 == null) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04() {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MWN.A04():void");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.O8n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.MWQ] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.MWR] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.O8o] */
    public MWN(UserSession userSession) {
        this.A00 = userSession;
        this.A03 = new O5U(userSession);
        ?? obj = new Object();
        obj.A00 = userSession;
        obj.A01 = false;
        this.A08 = obj;
        ?? obj2 = new Object();
        obj2.A00 = userSession;
        obj2.A01 = false;
        this.A02 = obj2;
        ?? obj3 = new Object();
        obj3.A00 = userSession;
        obj3.A01 = false;
        this.A01 = obj3;
        ?? obj4 = new Object();
        obj4.A00 = userSession;
        obj4.A01 = false;
        this.A09 = obj4;
        this.A06 = new C54621OAw();
        this.A05 = new C54621OAw();
        this.A04 = new C54621OAw();
        this.A07 = new C54621OAw();
        this.A0D = C18U.A06(C06090Tz.A05, userSession, 36312612752852167L);
        InterfaceC19630xq A03 = C1AT.A01(userSession).A03(C1AV.A1P);
        this.A0F = A03.getBoolean("fbpay_enabled", false);
        this.A0E = A03.getBoolean("fbpay_connected", false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        if (r10.A07.A01 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
    
        if (r1 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01b8, code lost:
    
        if (r1.booleanValue() != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01b0, code lost:
    
        r3 = X.C05F.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01ae, code lost:
    
        if (r1 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f5, code lost:
    
        if (X.C2E7.A01(X.C08730cb.A00(r6).A00()) != false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.MWN r10) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MWN.A01(X.MWN):void");
    }
}
