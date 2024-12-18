package X;

import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;

/* loaded from: classes10.dex */
public final class TN5 implements Runnable {
    public final /* synthetic */ InstantExperiencesJSBridgeCall A00;
    public final /* synthetic */ SZU A01;

    public TN5(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall, SZU szu) {
        this.A01 = szu;
        this.A00 = instantExperiencesJSBridgeCall;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SZU.A00(this.A00, this.A01);
    }
}
