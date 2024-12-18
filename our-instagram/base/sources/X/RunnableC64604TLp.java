package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.TLp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64604TLp implements Runnable {
    public final /* synthetic */ IgReactPurchaseExperienceBridgeModule A00;

    public RunnableC64604TLp(IgReactPurchaseExperienceBridgeModule igReactPurchaseExperienceBridgeModule) {
        this.A00 = igReactPurchaseExperienceBridgeModule;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IgReactPurchaseExperienceBridgeModule igReactPurchaseExperienceBridgeModule = this.A00;
        C3DN A00 = C3DN.A00.A00(AbstractC58321PtD.A0b(igReactPurchaseExperienceBridgeModule).A01());
        if (A00 != null && ((C3DP) A00).A0h) {
            ((BottomSheetFragment) A00.A09()).A02.A08();
            return;
        }
        Activity A01 = AbstractC58321PtD.A0b(igReactPurchaseExperienceBridgeModule).A01();
        if (!(A01 instanceof FragmentActivity) || A01 == null) {
            return;
        }
        A01.finish();
    }
}
