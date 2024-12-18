package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes8.dex */
public final class KBD extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "FeedDraftsFragment";
    public final InterfaceC09390do A04 = AbstractC25225BEi.A0a(new C50166MDt(this, 9), new C50166MDt(this, 12), new C57256Pbe(44, null, this), AbstractC25225BEi.A1D(MXI.class));
    public final InterfaceC09390do A02 = AbstractC25225BEi.A0a(new C50166MDt(this, 10), new C50166MDt(this, 8), new C57256Pbe(45, null, this), AbstractC25225BEi.A1D(C43904JbF.class));
    public final InterfaceC09390do A01 = AbstractC25225BEi.A0a(new C50166MDt(this, 11), new C50166MDt(this, 7), new C57256Pbe(46, null, this), AbstractC25225BEi.A1D(C44454JlM.class));
    public final InterfaceC09390do A00 = C1XM.A00(new C50166MDt(this, 6));
    public final InterfaceC09390do A06 = C1XM.A00(new C50166MDt(this, 5));
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);
    public final String A05 = "feed_drafts";

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A05;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1846400910);
        super.onCreate(bundle);
        ((C44454JlM) this.A01.getValue()).A0E();
        C0f9.A09(-1011189188, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1537966524);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30192DRx(this, 37), -1500200581);
        C0f9.A09(-209789445, A02);
        return A00;
    }
}
