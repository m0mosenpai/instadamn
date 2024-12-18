package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.89b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1828189b extends AbstractC52922bZ {
    public InterfaceC110214xq A00;
    public final Application A01;
    public final UserSession A02;
    public final HashMap A03;
    public final InterfaceC24731Iq A04;
    public final InterfaceC19390xP A05;

    public C1828189b(Application application, UserSession userSession) {
        C14360o3.A0B(application, 1);
        C14360o3.A0B(userSession, 2);
        this.A01 = application;
        this.A02 = userSession;
        this.A03 = new HashMap();
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A04 = c24721Ip;
        this.A05 = AbstractC07080Za.A03(c24721Ip);
    }

    public static final void A00(C1828189b c1828189b) {
        C141796aw A00 = AbstractC141776au.A00(c1828189b);
        AbstractC23641Du.A05(AnonymousClass191.A00, new MBT(c1828189b, null, 14), A00);
        C146106i8 c146106i8 = new C146106i8();
        c146106i8.A06();
        c146106i8.A0D = c1828189b.A01.getApplicationContext().getString(2131955953);
        C41451vu.A01.E4s(new C3KD(c146106i8.A00()));
    }
}
