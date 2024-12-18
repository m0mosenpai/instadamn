package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Ld, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48612Ld implements InterfaceC12870lZ, InterfaceC13000lm {
    public UserSession A00;
    public final Context A01;
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final List A03 = new ArrayList();
    public final List A02 = new ArrayList();

    public C48612Ld(Context context, UserSession userSession) {
        this.A01 = context;
        this.A00 = userSession;
    }

    public static void A00(final C48612Ld c48612Ld, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final InterfaceC48652Lj interfaceC48652Lj = (InterfaceC48652Lj) it.next();
            C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.9iy
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(171, 5, false, false);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC48652Lj.report();
                }
            });
        }
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(1984817015);
        InterfaceC19630xq interfaceC19630xq = AbstractC19730y1.A00(AbstractC12960li.A00).A00;
        long j = interfaceC19630xq.getLong("device_info_last_reported_time", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis > j + 43200000) {
            A00(this, this.A02);
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            ARD.E7G("device_info_last_reported_time", currentTimeMillis);
            ARD.apply();
        }
        C0f9.A0A(717072789, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(729820635);
        this.A04.postDelayed(new Runnable() { // from class: X.3Jk
            @Override // java.lang.Runnable
            public final void run() {
                C48612Ld c48612Ld = C48612Ld.this;
                InterfaceC19630xq interfaceC19630xq = AbstractC19730y1.A00(AbstractC12960li.A00).A00;
                long j = interfaceC19630xq.getLong("device_info_last_reported_time_foreground", 0L);
                long currentTimeMillis = System.currentTimeMillis();
                C0K8.A0C("fatal", "runForegroundReporters");
                if (currentTimeMillis > j + 43200000) {
                    C48612Ld.A00(c48612Ld, c48612Ld.A03);
                    InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                    ARD.E7G("device_info_last_reported_time_foreground", currentTimeMillis);
                    ARD.apply();
                }
            }
        }, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        C0f9.A0A(788703209, A03);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C218914p.A06(this);
    }
}
