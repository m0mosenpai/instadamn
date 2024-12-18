package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.BrO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26742BrO extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ProfileMyWeekNuxFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "profile_my_week_nux_fragment";
    }

    public static final void A00(C26742BrO c26742BrO, boolean z) {
        C25826Bbh c25826Bbh = (C25826Bbh) c26742BrO.A03.getValue();
        AbstractC166987dD.A1Z(new PZW(c25826Bbh, (InterfaceC23621Ds) null, 38, z), c25826Bbh.A01);
        AbstractC25233BEq.A14(c26742BrO);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    public C26742BrO() {
        GSv gSv = new GSv(this, 10);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new GSv(new GSv(this, 7), 8));
        this.A03 = AbstractC25225BEi.A0a(new GSv(A00, 9), gSv, new C57257Pbf(2, null, A00), AbstractC25225BEi.A1D(C25826Bbh.class));
        this.A02 = AbstractC60492pY.A02(this);
        this.A00 = C1XM.A00(new GSv(this, 5));
        this.A01 = C1XM.A00(new GSv(this, 6));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(526318934);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30189DRu(this, 15), -118705212);
        C0f9.A09(-1120879924, A02);
        return A00;
    }
}
