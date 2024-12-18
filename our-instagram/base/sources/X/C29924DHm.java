package X;

import android.text.Layout;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: X.DHm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29924DHm extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29924DHm(long j, Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [X.5hI] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.5qj, java.lang.Object] */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float A00;
        float A002;
        C77123cy c77123cy;
        long j;
        Timer timer;
        TimerTask d3v;
        JLM jlm;
        switch (this.A00) {
            case 0:
                InterfaceC1129057z interfaceC1129057z = (InterfaceC1129057z) obj;
                interfaceC1129057z.AQf();
                C114205Dh c114205Dh = (C114205Dh) this.A04;
                float f = c114205Dh.A01;
                float f2 = c114205Dh.A03;
                C15370ps c15370ps = (C15370ps) this.A02;
                long j2 = this.A01;
                C5YV c5yv = (C5YV) this.A03;
                C58A c58a = ((AnonymousClass587) interfaceC1129057z.AzL()).A01;
                c58a.F8X(f, f2);
                try {
                    interfaceC1129057z.AQk(c5yv, (InterfaceC137546La) c15370ps.A00, C119815bf.A00, 1.0f, 3, 1, 0L, j2, 0L, j2);
                    return C0eB.A00;
                } finally {
                    c58a.F8X(-f, -f2);
                }
            case 1:
                C127045oi c127045oi = (C127045oi) obj;
                long j3 = this.A01;
                float[] fArr = (float[]) this.A02;
                C15100pQ c15100pQ = (C15100pQ) this.A03;
                C15080pO c15080pO = (C15080pO) this.A04;
                int i = c127045oi.A05;
                int i2 = i;
                int A01 = C5C2.A01(j3);
                if (i <= A01) {
                    i2 = A01;
                }
                int i3 = c127045oi.A04;
                int A003 = C5C2.A00(j3);
                if (i3 < A003) {
                    A003 = i3;
                }
                long A004 = C60Z.A00(C17s.A03(i2, i, i3) - i, C17s.A03(A003, i, i3) - i);
                InterfaceC122825hI interfaceC122825hI = c127045oi.A06;
                int i4 = c15100pQ.A00;
                C122845hK c122845hK = ((C122815hH) interfaceC122825hI).A01;
                int A012 = C5C2.A01(A004);
                int A005 = C5C2.A00(A004);
                Layout layout = c122845hK.A09;
                int length = layout.getText().length();
                if (A012 >= 0) {
                    if (A012 < length) {
                        if (A005 > A012) {
                            if (A005 <= length) {
                                int i5 = (A005 - A012) * 4;
                                if (fArr.length - i4 >= i5) {
                                    int lineForOffset = layout.getLineForOffset(A012);
                                    int i6 = A005 - 1;
                                    int lineForOffset2 = layout.getLineForOffset(i6);
                                    W2E w2e = new W2E(c122845hK);
                                    if (lineForOffset <= lineForOffset2) {
                                        while (true) {
                                            int lineStart = layout.getLineStart(lineForOffset);
                                            int A05 = c122845hK.A05(lineForOffset);
                                            int max = Math.max(A012, lineStart);
                                            int min = Math.min(A005, A05);
                                            float A02 = c122845hK.A02(lineForOffset);
                                            float A013 = c122845hK.A01(lineForOffset);
                                            int paragraphDirection = layout.getParagraphDirection(lineForOffset);
                                            boolean A1P = AbstractC167007dF.A1P(paragraphDirection, 1);
                                            boolean z = !A1P;
                                            i6 = paragraphDirection;
                                            while (max < min) {
                                                boolean isRtlCharAt = layout.isRtlCharAt(max);
                                                if (A1P) {
                                                    if (!isRtlCharAt) {
                                                        A00 = W2E.A00(w2e, max, false, false, true);
                                                        A002 = W2E.A00(w2e, max + 1, true, true, true);
                                                    } else {
                                                        A002 = W2E.A00(w2e, max, false, false, false);
                                                        A00 = W2E.A00(w2e, max + 1, true, true, false);
                                                    }
                                                } else if (z && isRtlCharAt) {
                                                    A002 = W2E.A00(w2e, max, false, false, true);
                                                    A00 = W2E.A00(w2e, max + 1, true, true, true);
                                                } else {
                                                    A00 = W2E.A00(w2e, max, false, false, false);
                                                    A002 = W2E.A00(w2e, max + 1, true, true, false);
                                                }
                                                fArr[i4] = A00;
                                                fArr[i4 + 1] = A02;
                                                fArr[i4 + 2] = A002;
                                                int i7 = i4 + 3;
                                                fArr[i7] = A013;
                                                i4 += 4;
                                                max++;
                                                i6 = i7;
                                            }
                                            if (lineForOffset != lineForOffset2) {
                                                lineForOffset++;
                                            }
                                        }
                                    }
                                    int i8 = c15100pQ.A00;
                                    int i9 = i8 + i5;
                                    ?? r0 = i6;
                                    while (i8 < i9) {
                                        int i10 = i8 + 1;
                                        float f3 = fArr[i10];
                                        float f4 = c15080pO.A00;
                                        fArr[i10] = f3 + f4;
                                        int i11 = i8 + 3;
                                        float f5 = fArr[i11] + f4;
                                        fArr[i11] = f5;
                                        i8 += 4;
                                        r0 = f5;
                                    }
                                    c15100pQ.A00 = i9;
                                    c15080pO.A00 += r0.BDQ();
                                    return C0eB.A00;
                                }
                                throw AbstractC166987dD.A12("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                            }
                            throw AbstractC166987dD.A12("endOffset must be smaller or equal to text length");
                        }
                        throw AbstractC166987dD.A12("endOffset must be greater than startOffset");
                    }
                    throw AbstractC166987dD.A12("startOffset must be less than text length");
                }
                throw AbstractC166987dD.A12("startOffset must be > 0");
            case 2:
                ?? obj2 = new Object();
                C133255zr c133255zr = (C133255zr) this.A03;
                long j4 = this.A01;
                int i12 = ((C133215zn) this.A02).A00;
                UserSession userSession = ((C47576Kzm) this.A04).A01;
                C14360o3.A0B(c133255zr, 0);
                Object obj3 = new Object();
                obj2.A00(c133255zr, userSession, new C9EL(obj3, 32), i12, j4);
                return obj3;
            case 3:
                c77123cy = (C77123cy) this.A03;
                C26568BoR c26568BoR = (C26568BoR) this.A04;
                InterfaceC89793zL interfaceC89793zL = C26568BoR.A09;
                String A0R = AnonymousClass001.A0R("CyclicSubtitleComponent_", c26568BoR.A04.getId());
                j = this.A01;
                C51762Yz c51762Yz = (C51762Yz) this.A02;
                if (A0R == null) {
                    timer = new Timer(true);
                } else {
                    timer = new Timer(A0R, true);
                }
                d3v = new D3V(c51762Yz, c26568BoR);
                break;
            default:
                C26588Bol c26588Bol = (C26588Bol) this.A04;
                InterfaceC89793zL interfaceC89793zL2 = C26588Bol.A0C;
                C38321qM c38321qM = c26588Bol.A07;
                List At7 = c38321qM.A0C.At7();
                if (At7 != null && AbstractC001800i.A0J(At7) != null) {
                    InterfaceC31137Dmc interfaceC31137Dmc = c26588Bol.A0A;
                    C120985dq c120985dq = c26588Bol.A03;
                    C37644Ghd c37644Ghd = c26588Bol.A05;
                    List At72 = c38321qM.A0C.At7();
                    JMS jms = null;
                    if (At72 != null) {
                        jlm = (JLM) AbstractC001800i.A0O(At72, 0);
                    } else {
                        jlm = null;
                    }
                    List Bl2 = c38321qM.A0C.Bl2();
                    if (Bl2 != null) {
                        jms = (JMS) AbstractC001800i.A0O(Bl2, 0);
                    }
                    interfaceC31137Dmc.EHS(jlm, jms, c120985dq, c37644Ghd, c38321qM);
                }
                c77123cy = (C77123cy) this.A03;
                String A0R2 = AnonymousClass001.A0R("ClipsCyclicContextLineComponent_", c38321qM.getId());
                j = this.A01;
                C51762Yz c51762Yz2 = (C51762Yz) this.A02;
                if (A0R2 == null) {
                    timer = new Timer(true);
                } else {
                    timer = new Timer(A0R2, true);
                }
                d3v = new D3W(c51762Yz2, c26588Bol);
                break;
        }
        timer.scheduleAtFixedRate(d3v, j, j);
        C2XV.A00();
        c77123cy.A00 = timer;
        return C0eB.A00;
    }
}
