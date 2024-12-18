package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;

/* renamed from: X.5MJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5MJ {
    public static final C5MK A03 = new Object();
    public int A00;
    public boolean A01;
    public final UserSession A02;

    public final void A00(C38321qM c38321qM, String str) {
        String CAR;
        if (str != null && (CAR = c38321qM.CAR()) != null) {
            Handler handler = new Handler(Looper.getMainLooper());
            handler.postDelayed(new TR9(handler, this, c38321qM, CAR, str), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        }
    }

    public C5MJ(UserSession userSession) {
        this.A02 = userSession;
    }
}
