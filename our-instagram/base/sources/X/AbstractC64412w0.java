package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2w0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC64412w0 implements InterfaceC43071ya {
    public final C62802tJ A01 = new C62802tJ(0.5f);
    public final long A00 = 500;

    public void A00(Object obj, long j, Object obj2) {
        JI9 ji9;
        if (this instanceof C678634a) {
            C678634a c678634a = (C678634a) this;
            C38321qM c38321qM = (C38321qM) obj;
            C42C c42c = (C42C) obj2;
            C14360o3.A0B(c38321qM, 0);
            C14360o3.A0B(c42c, 1);
            C30W c30w = c678634a.A01;
            InterfaceC60442pS interfaceC60442pS = c678634a.A02;
            int position = c42c.A01.getPosition();
            UserSession userSession = c30w.A00;
            C82713mZ A04 = AbstractC82703mY.A04(c38321qM, interfaceC60442pS, AnonymousClass001.A0R("carousel_", "time_spent"));
            A04.A0G(userSession, c38321qM);
            A04.A09(position);
            A04.A0B(j);
            A04.A03();
            A04.A02();
            C32U.A0F(c678634a.A00, A04, c38321qM, interfaceC60442pS, C05F.A00, c42c.A00, true);
            return;
        }
        if (this instanceof C64402vz) {
            ji9 = ((C64402vz) this).A00;
        } else {
            ji9 = ((C64442w3) this).A00;
        }
        if (ji9 == null) {
            C14360o3.A0F("afiLogger");
            throw C00O.createAndThrow();
        }
        ji9.Cm9(j);
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        Integer CFq = interfaceC57162jr.CFq(c59062n7);
        Integer num = C05F.A0C;
        C62802tJ c62802tJ = this.A01;
        if (CFq == num) {
            String str = c59062n7.A05;
            long A00 = c62802tJ.A00(str, interfaceC57162jr.BmE());
            if (A00 >= this.A00) {
                A00(c59062n7.A03, A00, c59062n7.A04);
            }
            c62802tJ.A01.remove(str);
            return;
        }
        c62802tJ.A01(c59062n7.A05, interfaceC57162jr.CGk(c59062n7), interfaceC57162jr.BmE());
    }

    public AbstractC64412w0(long j, float f) {
    }

    public AbstractC64412w0() {
    }
}
