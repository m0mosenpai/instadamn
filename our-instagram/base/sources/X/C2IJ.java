package X;

import com.instagram.common.session.UserSession;
import com.instagram.fbpay.w3c.ipc.FBPaymentServiceImpl;
import com.instagram.fbpay.w3c.ipc.IsReadyToPayServiceImpl;
import com.instagram.fbpay.w3c.views.PaymentActivity;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2IJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2IJ {
    public final UserSession A00;
    public static final C2IL A01 = new Object();
    public static final AtomicInteger A03 = new AtomicInteger(-1);
    public static final List A02 = AbstractC16960so.A1Q(IsReadyToPayServiceImpl.class, FBPaymentServiceImpl.class, PaymentActivity.class);

    public C2IJ(UserSession userSession) {
        this.A00 = userSession;
    }
}
