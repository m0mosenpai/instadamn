package X;

import android.content.Context;
import android.os.Handler;
import android.view.Surface;
import androidx.media3.common.util.Util;
import java.util.List;

/* loaded from: classes12.dex */
public final class XQM extends XQN implements YMW {
    public static final int[] A0B = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public int A00;
    public int A01;
    public Surface A02;
    public Y1N A03;
    public C73309Y1m A04;
    public YMV A05;
    public List A06;
    public final Context A07;
    public final C72790XnA A08;
    public final C72707Xlf A09;
    public final boolean A0A;

    public XQM(Context context, Handler handler, YMM ymm, YQC yqc, YMX ymx) {
        super(ymm, yqc, 30.0f, 2);
        Context applicationContext = context.getApplicationContext();
        this.A07 = applicationContext;
        this.A09 = new C72707Xlf(handler, ymx);
        this.A08 = new C72790XnA(applicationContext, this);
        this.A0A = "NVIDIA".equals(Util.A04);
        this.A04 = C73309Y1m.A02;
        this.A03 = Y1N.A01;
        this.A01 = 0;
        this.A00 = -1000;
    }

    @Override // X.XQN, X.AbstractC73334Y8p
    public final void A01() {
        super.A01();
    }

    @Override // X.XQN
    public final void A02() {
        super.A02();
    }
}
