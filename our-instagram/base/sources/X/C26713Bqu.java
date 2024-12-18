package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Bqu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26713Bqu extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "KeywordResponsesFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A04;
    public final String A05 = "keyword_responses_fragment";
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public C26713Bqu() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A01 = DH5.A01(this, "creator_ai_creator_igid", enumC09460dv, 3);
        this.A00 = DH5.A01(this, "creator_ai_creator_fbid", enumC09460dv, 4);
        this.A02 = DH5.A01(this, "creator_ai_entry_point_extra", enumC09460dv, 5);
        this.A04 = AbstractC25225BEi.A0a(C29887DGb.A00(this, 8), C29887DGb.A00(this, 9), new C50169MDw(4, this, null), AbstractC25225BEi.A1D(C26909BuC.class));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A05;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1600405939);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30190DRv(this, 7), 1504161138);
        C0f9.A09(-1054711726, A02);
        return A00;
    }
}
