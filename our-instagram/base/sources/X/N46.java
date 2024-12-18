package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes9.dex */
public final class N46 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "PendingReviewMediaNudgeFragment";
    public O9J A00;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final String A03 = "pending_review_media_nudge_fragment";
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(new C57511Pfl(this, 28));

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A03;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1301271265);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30482DbR(this, 23), -1643125151);
        C0f9.A09(1640519787, A02);
        return A00;
    }
}
