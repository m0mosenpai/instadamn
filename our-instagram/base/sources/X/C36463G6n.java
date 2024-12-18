package X;

import android.view.View;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;

/* renamed from: X.G6n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36463G6n implements InterfaceViewOnFocusChangeListenerC37281Gbi {
    public final /* synthetic */ C34723FRm A00;

    @Override // X.InterfaceViewOnFocusChangeListenerC37281Gbi
    public final /* synthetic */ void Cyr(View view) {
    }

    @Override // X.InterfaceViewOnFocusChangeListenerC37281Gbi
    public final void DdF(DirectShareTarget directShareTarget) {
    }

    @Override // X.InterfaceViewOnFocusChangeListenerC37281Gbi
    public final void DdL(DirectShareTarget directShareTarget) {
        C14360o3.A0B(directShareTarget, 0);
        C34723FRm c34723FRm = this.A00;
        User user = (User) c34723FRm.A06.get(directShareTarget.A0A());
        if (user != null) {
            InterfaceC37206GaH interfaceC37206GaH = c34723FRm.A02;
            if (interfaceC37206GaH == null) {
                C14360o3.A0F("delegate");
                throw C00O.createAndThrow();
            }
            interfaceC37206GaH.FC4(user);
        }
    }

    @Override // X.InterfaceViewOnFocusChangeListenerC37281Gbi
    public final void DdN(DirectShareTarget directShareTarget) {
    }

    @Override // X.InterfaceViewOnFocusChangeListenerC37281Gbi
    public final /* synthetic */ void DjA() {
    }

    @Override // X.InterfaceViewOnFocusChangeListenerC37281Gbi
    public final void DjT(String str, boolean z) {
        C14360o3.A0B(str, 0);
        if (z) {
            InterfaceC37206GaH interfaceC37206GaH = this.A00.A02;
            if (interfaceC37206GaH == null) {
                C14360o3.A0F("delegate");
                throw C00O.createAndThrow();
            }
            interfaceC37206GaH.onSearchTextChanged(str);
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
    }

    public C36463G6n(C34723FRm c34723FRm) {
        this.A00 = c34723FRm;
    }
}
