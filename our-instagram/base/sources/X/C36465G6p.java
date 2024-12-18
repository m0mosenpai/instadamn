package X;

import android.view.View;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.G6p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36465G6p implements InterfaceViewOnFocusChangeListenerC37281Gbi {
    public final /* synthetic */ DirectShareSheetFragment A00;

    @Override // X.InterfaceViewOnFocusChangeListenerC37281Gbi
    public final /* synthetic */ void Cyr(View view) {
    }

    @Override // X.InterfaceViewOnFocusChangeListenerC37281Gbi
    public final void DdN(DirectShareTarget directShareTarget) {
    }

    @Override // X.InterfaceViewOnFocusChangeListenerC37281Gbi
    public final /* synthetic */ void DjA() {
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
    }

    public C36465G6p(DirectShareSheetFragment directShareSheetFragment) {
        this.A00 = directShareSheetFragment;
    }

    @Override // X.InterfaceViewOnFocusChangeListenerC37281Gbi
    public final void DdF(DirectShareTarget directShareTarget) {
        DirectShareSheetFragment.A01(this.A00).A0H(directShareTarget, 6);
    }

    @Override // X.InterfaceViewOnFocusChangeListenerC37281Gbi
    public final void DdL(DirectShareTarget directShareTarget) {
        DirectShareSheetFragment.A01(this.A00).A0H(directShareTarget, 6);
    }

    @Override // X.InterfaceViewOnFocusChangeListenerC37281Gbi
    public final void DjT(String str, boolean z) {
        this.A00.DjR(str);
    }
}
