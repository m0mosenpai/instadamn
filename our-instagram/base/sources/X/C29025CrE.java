package X;

import android.view.KeyEvent;
import android.view.View;
import com.facebook.litho.ComponentHost;

/* renamed from: X.CrE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29025CrE implements InterfaceC78033eV {
    public final /* synthetic */ C09530e4 A00;

    public C29025CrE(C09530e4 c09530e4) {
        this.A00 = c09530e4;
    }

    @Override // X.InterfaceC78033eV
    public final C79773hS ADT(C2YO c2yo, Object obj, Object obj2) {
        C14360o3.A0B(c2yo, 1);
        KeyEvent.Callback callback = (View) obj;
        C14360o3.A0B(callback, 1);
        if (callback instanceof C2WZ) {
            C09530e4 c09530e4 = this.A00;
            float A09 = AbstractC166987dD.A09(c09530e4.A00);
            float A092 = AbstractC166987dD.A09(c09530e4.A01);
            ComponentHost componentHost = (ComponentHost) ((C2WZ) callback);
            componentHost.A00 = A09;
            componentHost.A01 = A092;
            ComponentHost.A0F(componentHost);
            return AbstractC25225BEi.A0q(AbstractC25225BEi.A1E(callback, 30));
        }
        throw AbstractC166987dD.A14("Setting transform pivot is only supported on Views that implement SupportsPivotTransform. If it isn't possible to add this interface to the View in question, wrap this Component in a Row or Column and apply the transform and pivot there instead.");
    }

    @Override // X.InterfaceC78033eV
    public final boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        return !AbstractC78713fd.A02(obj, obj2);
    }

    @Override // X.InterfaceC78033eV
    public final String getDescription() {
        return AbstractC25228BEl.A1B(this);
    }
}
