package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GeD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC37433GeD implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C33P A02;
    public final /* synthetic */ C3FQ A03;

    public RunnableC37433GeD(C33P c33p, C3FQ c3fq, int i, int i2) {
        this.A02 = c33p;
        this.A03 = c3fq;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC65282xQ interfaceC65282xQ;
        C38321qM A00;
        C75113Zb BRZ;
        EnumC75203Zn enumC75203Zn;
        int BDJ;
        C3Y7 A09;
        C33P c33p = this.A02;
        C3FQ c3fq = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        C3FQ c3fq2 = c33p.A03;
        if (c3fq2 != null) {
            int i4 = i2 + i;
            while (i < i4) {
                if (C81203jp.A04(null, c3fq, i) != null && (A00 = C3Q5.A00((interfaceC65282xQ = c33p.A0D), c3fq2, i)) != null) {
                    UserSession userSession = c33p.A0A;
                    if (C3Q5.A04(userSession, interfaceC65282xQ, A00) && C76173bM.A04.A01(userSession, A00, interfaceC65282xQ.BRZ(A00), c33p.A0C.getModuleName()) && (((enumC75203Zn = (BRZ = interfaceC65282xQ.BRZ(A00)).A0l) == EnumC75203Zn.A06 || enumC75203Zn == EnumC75203Zn.A03) && (A09 = C81203jp.A09(null, c3fq, (BDJ = i - c3fq2.BDJ()))) != null)) {
                        if (c33p.A0F.A0B(A09.BQt(), A00, BDJ, true)) {
                            BRZ.A0K(EnumC75203Zn.A05);
                        }
                    }
                }
                i++;
            }
        }
    }
}
