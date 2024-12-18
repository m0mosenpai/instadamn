package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Ipr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42390Ipr implements InterfaceC43071ya {
    public IN1 A00;
    public final UserSession A01;
    public final C63622uj A02;
    public final InterfaceC43421JGl A03;
    public final List A04 = AbstractC166987dD.A1E();

    public C42390Ipr(UserSession userSession, C63622uj c63622uj, InterfaceC43421JGl interfaceC43421JGl) {
        this.A01 = userSession;
        this.A02 = c63622uj;
        this.A03 = interfaceC43421JGl;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        AbstractC167017dG.A1N(c59062n7, interfaceC57162jr);
        int A01 = AbstractC37301Gc2.A01(c59062n7, interfaceC57162jr);
        if (A01 != 0) {
            if (A01 == 2) {
                this.A04.remove(c59062n7.A03);
            }
        } else {
            List list = this.A04;
            Object obj = c59062n7.A03;
            C14360o3.A06(obj);
            list.add(obj);
        }
        IN1 in1 = null;
        if (C3Q3.A00(this.A01).A00()) {
            float f = 0.0f;
            for (IN1 in12 : this.A04) {
                float CGk = interfaceC57162jr.CGk(this.A02.A00(in12.A01()));
                float f2 = 0.25f;
                if (0.25f < f) {
                    f2 = f;
                }
                if (CGk > f2) {
                    in1 = in12;
                    f = CGk;
                }
            }
        }
        if (this.A00 != in1) {
            this.A00 = in1;
            this.A03.DKP(in1);
        }
    }
}
