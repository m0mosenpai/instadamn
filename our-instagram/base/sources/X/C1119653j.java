package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.53j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1119653j extends AbstractRunnableC14200nk {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1119653j(Context context, UserSession userSession) {
        super(1927308600, 3, false, false);
        this.A01 = userSession;
        this.A00 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            UserSession userSession = this.A01;
            C54742OFt c54742OFt = (C54742OFt) userSession.A01(C54742OFt.class, new C57254Pbc(13, this.A00, userSession));
            C4QF c4qf = c54742OFt.A07;
            InterfaceC09390do interfaceC09390do = c54742OFt.A0A;
            Object value = interfaceC09390do.getValue();
            C14360o3.A07(value);
            InterfaceC09390do interfaceC09390do2 = c54742OFt.A08;
            if (C4QG.A00((C0JM) value, c4qf, ((C3RT) interfaceC09390do2.getValue()).A00())) {
                ((C73693Rv) c54742OFt.A09.getValue()).A00(null);
                if (((C3RT) interfaceC09390do2.getValue()).A00() > 0) {
                    Object value2 = interfaceC09390do.getValue();
                    C14360o3.A07(value2);
                    c4qf.A05("last_warm_up_ts", ((C0JM) value2).now());
                }
            }
        } catch (Exception e) {
            C0f5 AEp = C18950wb.A01.AEp("Error while warming up features", 1011495295);
            AEp.ERI(e);
            AEp.report();
        }
    }
}
