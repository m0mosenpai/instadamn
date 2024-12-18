package X;

import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.8Lr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185728Lr {
    public final TargetViewSizeProvider A00;

    public C185728Lr(TargetViewSizeProvider targetViewSizeProvider) {
        C14360o3.A0B(targetViewSizeProvider, 1);
        this.A00 = targetViewSizeProvider;
    }

    public final C22925A8v A00() {
        InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) this.A00).A0K;
        return new C22925A8v(interfaceC1812882f.getWidth(), interfaceC1812882f.getHeight(), true, true);
    }
}
