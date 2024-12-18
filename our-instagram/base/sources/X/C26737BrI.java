package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.BrI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26737BrI extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "CreatorAIDeletionConfirmationBottomSheetFragment";
    public C26749BrW A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A06;
    public final String A07 = "creator_ai_deletion_confirmation_fragment";
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    public C26737BrI() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A03 = DH6.A01(this, "creator_ai_entry_point_extra", enumC09460dv, 46);
        this.A02 = DH6.A01(this, "creator_ai_creator_igid", enumC09460dv, 47);
        this.A04 = C29908DGw.A00(this, 26);
        C29908DGw c29908DGw = new C29908DGw(this, 30);
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C29908DGw(new C29908DGw(this, 27), 28));
        this.A06 = AbstractC25225BEi.A0a(new C29908DGw(A00, 29), c29908DGw, new C29894DGi(41, A00, null), AbstractC25225BEi.A1D(C25869BcQ.class));
        this.A01 = C29908DGw.A00(this, 23);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A07;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1918005708);
        ComposeView A00 = AbstractC25319BIo.A00(this, C30481DbQ.A00(this, 48), -1158913817);
        C0f9.A09(1605453837, A02);
        return A00;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1140546686);
        super.onResume();
        ((C25869BcQ) this.A06.getValue()).A00(AbstractC167027dH.A01(this.A04));
        C0f9.A09(-1692179493, A02);
    }
}
