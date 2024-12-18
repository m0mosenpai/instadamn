package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;

/* renamed from: X.U1p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66148U1p implements InterfaceC43071ya {
    public final C18920wW A00;
    public final InterfaceC71919XAd A01;
    public final java.util.Set A02 = new HashSet();

    public C66148U1p(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC71919XAd interfaceC71919XAd) {
        this.A01 = interfaceC71919XAd;
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        AbstractC167017dG.A1N(c59062n7, interfaceC57162jr);
        if (interfaceC57162jr.CFq(c59062n7) == C05F.A00) {
            Object obj = c59062n7.A03;
            C14360o3.A06(obj);
            C38657Gyy c38657Gyy = (C38657Gyy) obj;
            java.util.Set set = this.A02;
            C14360o3.A0B(c38657Gyy, 0);
            String str = c38657Gyy.A05;
            if (str == null) {
                str = c38657Gyy.A06;
            }
            if (set.add(str)) {
                C18920wW c18920wW = this.A00;
                InterfaceC71919XAd interfaceC71919XAd = this.A01;
                C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "instagram_inform_module_impression"), 295);
                if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                    AbstractC65702TsY.A1G(c25531Mh, c38657Gyy, str);
                    interfaceC71919XAd.ACz(c25531Mh);
                    c25531Mh.Cht();
                }
            }
        }
    }
}
