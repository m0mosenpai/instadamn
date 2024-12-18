package X;

import android.content.Context;
import android.content.ServiceConnection;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public final class UST extends AbstractC69781VvI {
    public final Context A00;
    public final ServiceConnection A01;
    public final C70011VzW A02;
    public final C68682VaI A03;
    public final C69406Vmq A04;
    public final XD3 A05;
    public final AtomicReference A06;

    public static final void A00(UST ust) {
        ust.A04(EnumC68128VCm.A04, VDE.A06, "FAILED_INSTALL", VHi.ERROR_SERVICE_UNAVAILABLE.toString());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UST(Context context, C69406Vmq c69406Vmq) {
        super(context, c69406Vmq, "digital_turbine_store");
        String packageName = context.getPackageName();
        C14360o3.A07(packageName);
        C68831Vcm c68831Vcm = c69406Vmq.A04;
        C70011VzW c70011VzW = C70011VzW.A00;
        USR usr = new USR(c70011VzW, c68831Vcm, packageName);
        C14360o3.A0B(c70011VzW, 4);
        this.A00 = context;
        this.A04 = c69406Vmq;
        this.A05 = usr;
        this.A02 = c70011VzW;
        super.A00 = 0;
        this.A03 = new C68682VaI(this);
        this.A06 = new AtomicReference();
        this.A01 = new WIJ(this, 1);
    }
}
