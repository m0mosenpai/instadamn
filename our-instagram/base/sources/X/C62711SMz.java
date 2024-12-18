package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.Map;

/* renamed from: X.SMz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62711SMz {
    public AlarmManager A00;
    public Context A01;
    public C3VA A02;
    public C4N8 A04;
    public RealtimeSinceBootClock A05;
    public C3UW A06;
    public C62670SLh A07;
    public Map A08;
    public AbstractC64515THi A03 = C60546R6j.A00;
    public final Map A0A = AbstractC58318PtA.A14();
    public final InterfaceC08100bW A09 = new C64154T1f(this, 1);

    public final void A00(String str) {
        PendingIntent pendingIntent = (PendingIntent) this.A08.remove(str);
        if (pendingIntent != null) {
            this.A06.A03(this.A00, pendingIntent);
        }
        C91M ARA = this.A04.ARA();
        ARA.E7E(str, 120000L);
        ARA.AIb("FbnsRegistrarRetry", "PreferencesManager failed to store Registration reset retry");
    }

    public C62711SMz(Context context, C3VA c3va, C74103Uo c74103Uo, RealtimeSinceBootClock realtimeSinceBootClock, C3UW c3uw, C62670SLh c62670SLh) {
        this.A01 = context;
        this.A07 = c62670SLh;
        AbstractC64515THi A00 = c62670SLh.A00(AlarmManager.class, "alarm");
        if (A00 instanceof C60546R6j) {
            throw AbstractC166987dD.A12("Cannot acquire Alarm service");
        }
        this.A00 = (AlarmManager) A00.A01();
        this.A04 = c74103Uo.A00(context, "retry");
        this.A05 = realtimeSinceBootClock;
        this.A02 = c3va;
        this.A06 = c3uw;
        this.A08 = AbstractC166987dD.A1G();
    }
}
