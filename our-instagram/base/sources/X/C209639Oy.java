package X;

import android.app.Activity;

/* renamed from: X.9Oy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C209639Oy implements InterfaceC125355lh {
    public final /* synthetic */ C188708Xk A00;
    public final /* synthetic */ String A01;

    public C209639Oy(C188708Xk c188708Xk, String str) {
        this.A00 = c188708Xk;
        this.A01 = str;
    }

    @Override // X.InterfaceC125355lh
    public final void onFinish() {
        C188708Xk c188708Xk = this.A00;
        AbstractC59962oe abstractC59962oe = c188708Xk.A0C;
        AbstractC10360h2 abstractC10360h2 = abstractC59962oe.mFragmentManager;
        if (abstractC10360h2 == null) {
            AbstractC12120kG.A07("createExitAnimationOnFinishListener", "Null fragmentManager", null);
            return;
        }
        C55772hI.A00(c188708Xk.A0D).A0C(abstractC59962oe, this.A01, abstractC10360h2.A0L());
        c188708Xk.A0B.setAlpha(0.0f);
        Activity activity = c188708Xk.A08;
        activity.finish();
        activity.overridePendingTransition(0, 0);
    }
}
