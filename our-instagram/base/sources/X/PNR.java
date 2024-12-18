package X;

import android.app.Activity;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;

/* loaded from: classes9.dex */
public final class PNR implements Runnable {
    public final /* synthetic */ HandlerC50756MbM A00;

    public PNR(HandlerC50756MbM handlerC50756MbM) {
        this.A00 = handlerC50756MbM;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HandlerC50756MbM handlerC50756MbM = this.A00;
        AbstractC59962oe abstractC59962oe = handlerC50756MbM.A01;
        if (abstractC59962oe.isResumed() && AbstractC53604NnB.A01 != null) {
            Activity activity = handlerC50756MbM.A00;
            if (activity instanceof BaseFragmentActivity) {
                C60930Rbk c60930Rbk = AbstractC53604NnB.A01;
                C14360o3.A0A(c60930Rbk);
                ((IgFragmentActivity) activity).registerOnActivityResultListener(c60930Rbk);
                return;
            }
            abstractC59962oe.registerLifecycleListener(AbstractC53604NnB.A01);
        }
    }
}
