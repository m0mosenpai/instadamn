package X;

import android.os.SystemClock;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Deprecated;

/* renamed from: X.7w8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178347w8 {
    public static final C178347w8 A00 = new Object();

    @Deprecated(message = "Only for Lite Camera and legacy")
    public static final InterfaceC178407wE A00(UserSession userSession, String str, String str2) {
        InterfaceC178407wE c178377wB;
        C14360o3.A0B(userSession, 3);
        if (C18U.A06(C06090Tz.A05, userSession, 36316315014729964L)) {
            c178377wB = new C201438vY();
        } else {
            c178377wB = new C178377wB(new AZ1(AbstractC09440dt.A01(new C57545PgJ(userSession, 39)), AbstractC09440dt.A01(new C57254Pbc(27, new C19270xB("OneCamera"), userSession))), str, str2);
        }
        return c178377wB;
    }

    public final InterfaceC178407wE A01(InterfaceC178207vu interfaceC178207vu) {
        InterfaceC178407wE c178377wB;
        C14360o3.A0B(interfaceC178207vu, 0);
        C178037vc c178037vc = InterfaceC178047vd.A00;
        AbstractC12990ll abstractC12990ll = (AbstractC12990ll) interfaceC178207vu.AqG(c178037vc);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, abstractC12990ll, 36316315014729964L)) {
            c178377wB = new C201438vY(interfaceC178207vu);
        } else {
            SystemClock.elapsedRealtimeNanos();
            final C17050sx A01 = AbstractC09440dt.A01(new C9F8(14, new C19270xB("OneCamera"), interfaceC178207vu));
            final C17050sx A012 = AbstractC09440dt.A01(new C206979Ec(interfaceC178207vu, 21));
            InterfaceC178367wA interfaceC178367wA = new InterfaceC178367wA() { // from class: X.7w9
                @Override // X.InterfaceC178367wA
                public final QuickPerformanceLogger BjH() {
                    Object value = InterfaceC09390do.this.getValue();
                    C14360o3.A07(value);
                    return (QuickPerformanceLogger) value;
                }

                @Override // X.InterfaceC178367wA
                public final InterfaceC02550Ad CC6() {
                    return (InterfaceC02550Ad) A01.getValue();
                }
            };
            AtomicLong atomicLong = C178377wB.A03;
            c178377wB = new C178377wB(interfaceC178207vu, interfaceC178367wA, C18U.A06(c06090Tz, (AbstractC12990ll) interfaceC178207vu.AqG(c178037vc), 36315662181731812L), C18U.A06(c06090Tz, (AbstractC12990ll) interfaceC178207vu.AqG(c178037vc), 36315662182059497L));
            SystemClock.elapsedRealtimeNanos();
        }
        return c178377wB;
    }
}
