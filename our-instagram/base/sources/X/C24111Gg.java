package X;

import java.util.LinkedList;

/* renamed from: X.1Gg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24111Gg {
    public final C24101Gf A00;
    public final InterfaceC14020nS A01;
    public final Object A02;
    public final LinkedList A03 = new LinkedList();

    public final C89133yF A00(C89123yE c89123yE, C26511Qg c26511Qg, C1QW c1qw, C1QY c1qy, boolean z) {
        C89133yF c89133yF = new C89133yF(c1qw.A04);
        C89143yG c89143yG = new C89143yG(c89133yF, c26511Qg, c1qw, c1qy);
        LinkedList linkedList = this.A03;
        if (!z) {
            linkedList.addLast(c89143yG);
        } else {
            linkedList.addFirst(c89143yG);
        }
        C24101Gf c24101Gf = this.A00;
        if (c24101Gf != null) {
            c24101Gf.A00.A09.A00.incrementAndGet();
        }
        c89133yF.A00 = new C89153yH(c89123yE, c89143yG, this, c1qw);
        return c89133yF;
    }

    public C24111Gg(C24101Gf c24101Gf, Object obj) {
        this.A02 = obj;
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = "PendingRequestQueue";
        this.A01 = new C18240vB(A00);
        this.A00 = c24101Gf;
    }
}
