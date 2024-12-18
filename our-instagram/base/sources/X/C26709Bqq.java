package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Bqq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26709Bqq extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ThreadDetailsCustomEmojiImageFragment";
    public FPE A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public C26709Bqq() {
        C37052GUi c37052GUi = new C37052GUi(this, 30);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37052GUi(new C37052GUi(this, 27), 28));
        this.A02 = AbstractC25225BEi.A0a(new C37052GUi(A00, 29), c37052GUi, new C50170MDx(2, null, A00), AbstractC25225BEi.A1D(C44502Jm8.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1821362321);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30190DRv(this, 40), -196501010);
        C0f9.A09(2117552277, A02);
        return A00;
    }
}
