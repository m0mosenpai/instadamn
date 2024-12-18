package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import java.io.IOException;

/* renamed from: X.WhQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70810WhQ implements InterfaceC13000lm {
    public C69017Vft A00;
    public C69018Vfu A01;
    public InterfaceC17710u8 A02;
    public boolean A03 = false;
    public final InterfaceC14020nS A04;
    public final InterfaceC17700u7 A05;

    public static synchronized C70810WhQ A00(Context context, UserSession userSession) {
        C70810WhQ c70810WhQ;
        synchronized (C70810WhQ.class) {
            c70810WhQ = (C70810WhQ) userSession.A00(C70810WhQ.class);
            if (c70810WhQ == null) {
                C11T.A06("Expects to be created on main thread");
                c70810WhQ = new C70810WhQ(C14120nc.A00(), new C17860uO(new Handler()), new C69017Vft(context, userSession));
                userSession.A04(C70810WhQ.class, c70810WhQ);
            }
        }
        return c70810WhQ;
    }

    public static void A01(C70810WhQ c70810WhQ) {
        if (!c70810WhQ.A03) {
            C69017Vft c69017Vft = c70810WhQ.A00;
            C69018Vfu c69018Vfu = new C69018Vfu();
            String string = c69017Vft.A00.getString("operations", null);
            if (string != null) {
                try {
                    c69018Vfu = AbstractC69964Vyf.parseFromJson(C16V.A00(string));
                } catch (IOException e) {
                    C0w9.A07("ViewStateModStore", e);
                }
            }
            c70810WhQ.A01 = c69018Vfu;
            c70810WhQ.A03 = true;
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        InterfaceC17710u8 interfaceC17710u8 = this.A02;
        interfaceC17710u8.AWP();
        interfaceC17710u8.EfQ(null);
    }

    public C70810WhQ(InterfaceC14020nS interfaceC14020nS, InterfaceC17710u8 interfaceC17710u8, C69017Vft c69017Vft) {
        C70907WkA c70907WkA = new C70907WkA(this);
        this.A05 = c70907WkA;
        this.A04 = interfaceC14020nS;
        this.A02 = interfaceC17710u8;
        interfaceC17710u8.EfQ(c70907WkA);
        this.A00 = c69017Vft;
    }
}
