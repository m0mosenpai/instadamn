package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class L9F {
    public BJF A00;
    public C7IM A01;
    public L4G A02;
    public C47654L2n A03;
    public final Context A04;
    public final UserSession A05;
    public final Capabilities A06;
    public final C7WA A07;
    public final C98K A08;
    public final InterfaceC165067Zv A09;
    public final AnonymousClass988 A0A;
    public final AnonymousClass988 A0B;
    public final InterfaceC16820sZ A0C;
    public final InterfaceC16820sZ A0D;

    /* JADX WARN: Type inference failed for: r1v3, types: [X.LDX, java.lang.Object] */
    public final C47654L2n A00() {
        C47654L2n c47654L2n = this.A03;
        if (c47654L2n == null) {
            C17060sy c17060sy = (C17060sy) this.A0D.invoke();
            Context context = this.A04;
            UserSession userSession = this.A05;
            C7IM c7im = this.A01;
            String str = "directMessageThreadTheme";
            if (c7im != null) {
                Capabilities capabilities = this.A06;
                AnonymousClass988 anonymousClass988 = this.A0B;
                BJF bjf = this.A00;
                if (bjf == null) {
                    str = "msysUpdateThreadStateData";
                } else {
                    C98K c98k = this.A08;
                    ArrayList A1E = AbstractC166987dD.A1E();
                    A1E.add(new C49196LpD(context, bjf, userSession, c98k, anonymousClass988, c7im));
                    A1E.add(new C49199LpG(bjf, anonymousClass988, c7im));
                    A1E.add(new C49198LpF(anonymousClass988, c7im));
                    if (capabilities.A00(EnumC2054697t.A13)) {
                        A1E.add(new C49197LpE(anonymousClass988, c7im));
                    }
                    A1E.add(new Object());
                    C47388Kwd c47388Kwd = new C47388Kwd(A1E);
                    C7IM c7im2 = this.A01;
                    if (c7im2 != null) {
                        C47654L2n c47654L2n2 = new C47654L2n(new C47655L2o(capabilities, c7im2.A04, c17060sy, AbstractC09440dt.A01(new MHH(this, 40)), AbstractC09440dt.A01(new MHH(this, 41))), new Object(), new C47386Kwb(c17060sy), c47388Kwd);
                        this.A03 = c47654L2n2;
                        return c47654L2n2;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        return c47654L2n;
    }

    public final void A01(BJF bjf, C7IM c7im) {
        this.A01 = c7im;
        this.A00 = bjf;
        this.A03 = null;
        this.A02 = null;
    }

    public L9F(Context context, UserSession userSession, Capabilities capabilities, C7WA c7wa, C98K c98k, InterfaceC165067Zv interfaceC165067Zv, AnonymousClass988 anonymousClass988, AnonymousClass988 anonymousClass9882, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        this.A04 = context;
        this.A05 = userSession;
        this.A0C = interfaceC16820sZ;
        this.A0D = interfaceC16820sZ2;
        this.A06 = capabilities;
        this.A0B = anonymousClass988;
        this.A0A = anonymousClass9882;
        this.A07 = c7wa;
        this.A09 = interfaceC165067Zv;
        this.A08 = c98k;
    }
}
