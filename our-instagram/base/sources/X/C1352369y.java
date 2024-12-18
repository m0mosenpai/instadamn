package X;

import android.content.Context;
import com.facebook.msys.config.infranosqlite.MsysInfraNoSqliteObjectHolder;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.NetworkSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.69y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1352369y implements InterfaceC1352169w {
    @Override // X.InterfaceC1352169w
    public final /* synthetic */ void Epz() {
    }

    @Override // X.InterfaceC1352169w
    public final /* bridge */ /* synthetic */ void EgM(Object obj) {
        C1351969u c1351969u = (C1351969u) obj;
        C14360o3.A0B(c1351969u, 0);
        C42201xA c42201xA = C1334460n.A06;
        NetworkSession A00 = MsysInfraNoSqliteObjectHolder.A00();
        if (A00 != null) {
            if (C18U.A06(C06090Tz.A05, c1351969u.A02, 36328993758265267L)) {
                C62271S4q c62271S4q = SWX.A03;
                SWX swx = SWX.A04;
                if (swx == null) {
                    synchronized (c62271S4q) {
                        swx = SWX.A04;
                        if (swx == null) {
                            swx = new SWX(A00);
                            SWX.A04 = swx;
                        }
                    }
                }
                Context context = c1351969u.A00;
                if (!swx.A02) {
                    C19K A02 = AbstractC24771Iv.A02(-4, 3);
                    GST gst = new GST(context, swx, null, 39);
                    AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, gst, A02);
                    return;
                }
                return;
            }
            C6AA c6aa = C6A9.A03;
            C6A9 c6a9 = C6A9.A04;
            if (c6a9 == null) {
                synchronized (c6aa) {
                    c6a9 = C6A9.A04;
                    if (c6a9 == null) {
                        c6a9 = new C6A9(A00);
                        C6A9.A04 = c6a9;
                    }
                }
            }
            Context context2 = c1351969u.A00;
            AtomicBoolean atomicBoolean = c6a9.A02;
            if (!atomicBoolean.get()) {
                boolean A0F = AbstractC15820qc.A0F(context2);
                synchronized (c6a9) {
                    c6a9.A01.set(A0F);
                    Execution.executeAsync(new C6AB(c6a9, A0F), null, 1);
                }
                C18150uz.A0B.A03(c6a9);
                atomicBoolean.set(true);
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
