package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes8.dex */
public final class KDV extends AbstractC59962oe implements InterfaceC1119153d {
    public static final String __redex_internal_original_name = "FriendMapEmojiSelectorFragment";
    public C47446Kxb A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC1119153d
    public final void Czx() {
    }

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "friend_map_emoji_selector_fragment";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public KDV() {
        C50248MHd A01 = C50248MHd.A01(this, 3);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, C50248MHd.A01(C50248MHd.A01(this, 0), 1));
        this.A02 = AbstractC25225BEi.A0a(C50248MHd.A01(A00, 2), A01, new ME1(31, null, A00), AbstractC25225BEi.A1D(C44497Jm3.class));
        this.A01 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(245639013);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30191DRw(this, 27), 613476410);
        C0f9.A09(-1878437915, A02);
        return A00;
    }
}
