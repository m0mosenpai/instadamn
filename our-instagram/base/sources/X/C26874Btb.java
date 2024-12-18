package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Btb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26874Btb extends C53Z {
    public static final String __redex_internal_original_name = "ImproveYourAiFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final String A03;

    public C26874Btb() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A00 = AbstractC09440dt.A00(enumC09460dv, new D61(this));
        this.A01 = AbstractC09440dt.A00(enumC09460dv, new D62(this));
        C29887DGb A00 = C29887DGb.A00(this, 0);
        InterfaceC09390do A002 = AbstractC09440dt.A00(enumC09460dv, new C29908DGw(new C29908DGw(this, 47), 48));
        this.A02 = AbstractC25225BEi.A0a(new C29908DGw(A002, 49), A00, new C50169MDw(1, A002, null), AbstractC25225BEi.A1D(C26902Bu5.class));
        this.A03 = "ig_creator_ai_improve_ai";
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A03;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-649608527);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30190DRv(this, 4), 935327881);
        C0f9.A09(-1648162108, A02);
        return A00;
    }
}
