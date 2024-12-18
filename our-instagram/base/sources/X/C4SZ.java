package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.4SZ, reason: invalid class name */
/* loaded from: classes2.dex */
public class C4SZ extends C30P {
    public C120985dq A00;
    public String A01;
    public final ClipsViewerConfig A02;
    public final UserSession A03;
    public final ILX A04;
    public final String A05;
    public final String A06;
    public final InterfaceC09390do A07;
    public final InterfaceC16820sZ A08;
    public final String A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4SZ(ClipsViewerConfig clipsViewerConfig, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC43589JPu interfaceC43589JPu, ILX ilx, String str, InterfaceC16820sZ interfaceC16820sZ) {
        super(interfaceC60442pS, interfaceC43589JPu.Amq());
        C14360o3.A0B(interfaceC43589JPu, 3);
        this.A03 = userSession;
        this.A09 = str;
        this.A08 = interfaceC16820sZ;
        this.A04 = ilx;
        this.A02 = clipsViewerConfig;
        this.A07 = AbstractC09440dt.A01(new C206879Ds(this, 15));
        this.A06 = interfaceC43589JPu.CGJ();
        this.A05 = interfaceC43589JPu.Amq();
    }

    @Override // X.C30P
    public final String A03(C38321qM c38321qM) {
        C120985dq c120985dq;
        C38321qM c38321qM2;
        if (C18U.A06(C06090Tz.A05, this.A03, 36329148376956962L) && (c120985dq = this.A00) != null && (c38321qM2 = c120985dq.A02) != null) {
            int A00 = this.A04.A00(c120985dq);
            if (c38321qM2.A5M() && A00 != -1) {
                C38321qM A1e = c38321qM2.A1e(A00);
                C38321qM A1e2 = c38321qM2.A1e(0);
                if (A1e != null && A1e2 != null) {
                    c38321qM2.A0p();
                    A1e.BRp();
                    A1e.CFR().A08();
                    String id = A1e.getId();
                    if (id != null) {
                        if (A1e2.getId() == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        return id;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        return super.A03(c38321qM);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
    
        if (X.AbstractC75343a1.A07(r10.A03) == false) goto L31;
     */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.4Sf] */
    @Override // X.C30P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0A(X.C19280xC r11, X.C4SW r12) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4SZ.A0A(X.0xC, X.4SW):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008c, code lost:
    
        if (new java.io.File(r7).exists() == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C4SH A0C(X.C120985dq r46) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4SZ.A0C(X.5dq):X.4SH");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (new java.io.File(r1).exists() == false) goto L6;
     */
    @Override // X.C30P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ X.C4T2 A06(X.C4T2 r17, java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4SZ.A06(X.4T2, java.lang.Object):X.4T2");
    }
}
