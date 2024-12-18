package X;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Map;

/* renamed from: X.SrF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63649SrF implements InterfaceC48932Mm {
    public static final String A05 = C48442Kl.A01("CommandHandler");
    public final Context A00;
    public final C2N0 A01;
    public final C2L5 A04;
    public final Map A03 = AbstractC166987dD.A1G();
    public final Object A02 = AbstractC58318PtA.A0b();

    public static void A00(Intent intent, C2WP id) {
        intent.putExtra("KEY_WORKSPEC_ID", id.A01);
        intent.putExtra("KEY_WORKSPEC_GENERATION", id.A00);
    }

    @Override // X.InterfaceC48932Mm
    public final void DEk(C2WP id, boolean needsReschedule) {
        synchronized (this.A02) {
            C63651SrH c63651SrH = (C63651SrH) this.A03.remove(id);
            this.A01.A00(id);
            if (c63651SrH != null) {
                C48442Kl.A00();
                C2WP c2wp = c63651SrH.A08;
                C63651SrH.A00(c63651SrH);
                if (needsReschedule) {
                    Intent A08 = MSW.A08(c63651SrH.A04, SystemAlarmService.class);
                    A08.setAction("ACTION_SCHEDULE_WORK");
                    A00(A08, c2wp);
                    RunnableC64725TRh.A00(A08, c63651SrH.A06, c63651SrH.A09, c63651SrH.A03);
                }
                if (c63651SrH.A02) {
                    Intent A082 = MSW.A08(c63651SrH.A04, SystemAlarmService.class);
                    A082.setAction("ACTION_CONSTRAINTS_CHANGED");
                    RunnableC64725TRh.A00(A082, c63651SrH.A06, c63651SrH.A09, c63651SrH.A03);
                }
            }
        }
    }

    public C63649SrF(Context context, C2L5 clock, C2N0 startStopTokens) {
        this.A00 = context;
        this.A04 = clock;
        this.A01 = startStopTokens;
    }
}
