package X;

import android.content.Context;
import com.facebook.advancedcryptotransport.PlatformStorageProvider;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.60o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1334560o implements InterfaceC16820sZ {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C1334560o(UserSession userSession, String str) {
        this.A01 = str;
        this.A00 = userSession;
    }

    @Override // X.InterfaceC16820sZ
    public final Object invoke() {
        C69405Vmp c69405Vmp;
        String str = this.A01;
        UserSession userSession = this.A00;
        C42201xA c42201xA = C1334460n.A06;
        PlatformStorageProvider.initialize(AbstractC12290kX.A00);
        C41881wd A00 = AbstractC41841wY.A00(userSession);
        EnumC41921wi enumC41921wi = EnumC41921wi.BOOTSTRAP_START;
        A00.A00.accept(enumC41921wi);
        C1334460n.A06.accept(enumC41921wi);
        C14360o3.A0B(userSession, 0);
        C135816Cj A002 = AnonymousClass615.A00((C1334860s) userSession.A01(C1334860s.class, new MHH(userSession, 29)), userSession, str, 0, 1);
        C135826Ck c135826Ck = new C135826Ck(A002.A01);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36328066045787283L)) {
            Context context = AbstractC12290kX.A00;
            C14140ne c14140ne = new C14140ne(1498268459, 3, true, true);
            String A04 = C18U.A04(c06090Tz, userSession, 36891015998931859L);
            long A01 = C18U.A01(c06090Tz, userSession, 36609541022422952L);
            boolean A06 = C18U.A06(c06090Tz, userSession, 36328066045590673L);
            boolean A062 = C18U.A06(c06090Tz, userSession, 36328066045656210L);
            boolean A063 = C18U.A06(c06090Tz, userSession, 36328066045197455L);
            boolean A064 = C18U.A06(c06090Tz, userSession, 36328066045262992L);
            long A012 = C18U.A01(c06090Tz, userSession, 36609541022029733L);
            long A013 = C18U.A01(c06090Tz, userSession, 36609541022095270L);
            long A014 = C18U.A01(c06090Tz, userSession, 36609541022160807L);
            synchronized (VYD.class) {
                C14360o3.A0B(context, 0);
                c69405Vmp = VYD.A00;
                if (c69405Vmp == null) {
                    N28 n28 = new N28();
                    C69518Vqh c69518Vqh = new C69518Vqh(context);
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    c69405Vmp = new C69405Vmp(new C62688SMc(timeUnit.toMillis(A012), A013, A014, A063, A064), c69518Vqh, n28, A04, c14140ne, timeUnit.toNanos(A01), A06, A062);
                    VYD.A00 = c69405Vmp;
                }
            }
            AbstractC128845ry.A00 = new C68748VbR(c69405Vmp);
        }
        return new C1334460n(c135826Ck, userSession, A002);
    }
}
