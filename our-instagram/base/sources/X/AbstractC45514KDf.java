package X;

import android.os.Bundle;
import android.view.View;

/* renamed from: X.KDf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC45514KDf extends AbstractC43842Ja5 {
    public static final String __redex_internal_original_name = "GreenscreenTabBaseFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        getRecyclerView().setNestedScrollingEnabled(false);
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(new C50356MLi(this, 30));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public AbstractC45514KDf() {
        C0YZ A1D = AbstractC25225BEi.A1D(C1825187q.class);
        this.A00 = AbstractC25225BEi.A0a(new C57508Pfi(this, 2), new C57508Pfi(this, 3), new C29897DGl(42, null, this), A1D);
        this.A02 = C1XM.A00(new C57508Pfi(this, 1));
        this.A01 = C1XM.A00(new C57508Pfi(this, 0));
    }
}
