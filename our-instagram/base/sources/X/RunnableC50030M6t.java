package X;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: X.M6t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50030M6t implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ EnumC46149Kbn A02;
    public final /* synthetic */ LGY A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ Integer A05;

    public RunnableC50030M6t(Activity activity, Bundle bundle, EnumC46149Kbn enumC46149Kbn, LGY lgy, Integer num, Integer num2) {
        this.A03 = lgy;
        this.A00 = activity;
        this.A05 = num;
        this.A02 = enumC46149Kbn;
        this.A04 = num2;
        this.A01 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LGY lgy = this.A03;
        C48519LdH c48519LdH = lgy.A01;
        C6CF c6cf = (C6CF) lgy.A03.getValue();
        Activity activity = this.A00;
        Integer num = this.A05;
        EnumC46208Kck A00 = LJf.A00(activity, c6cf, c48519LdH, num);
        if (A00 != null) {
            lgy.A01(activity, this.A01, A00, this.A02, num, C05F.A00, this.A04);
        }
    }
}
