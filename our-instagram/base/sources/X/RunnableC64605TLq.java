package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.react.modules.product.IgReactPurchaseProtectionSheetModule;

/* renamed from: X.TLq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64605TLq implements Runnable {
    public final /* synthetic */ IgReactPurchaseProtectionSheetModule A00;

    public RunnableC64605TLq(IgReactPurchaseProtectionSheetModule igReactPurchaseProtectionSheetModule) {
        this.A00 = igReactPurchaseProtectionSheetModule;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1XJ c1xj = C1XJ.A00;
        IgReactPurchaseProtectionSheetModule igReactPurchaseProtectionSheetModule = this.A00;
        c1xj.A0q((FragmentActivity) AbstractC58321PtD.A0b(igReactPurchaseProtectionSheetModule).A01(), igReactPurchaseProtectionSheetModule.mUserSession);
    }
}
