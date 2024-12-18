package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import com.instagram.appreciation.analytics.creator.CreatorLoggingData;
import java.util.Collection;

/* renamed from: X.KDg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45515KDg extends AbstractC43842Ja5 {
    public static final String __redex_internal_original_name = "AppreciationCreatorInsightsInfoBottomSheetFragment";
    public final InterfaceC09390do A00 = AbstractC09440dt.A01(new C50157MDk(this, 48));
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        CreatorLoggingData A00 = AbstractC46602Kjf.A00(requireArguments());
        ((LLN) this.A00.getValue()).A0A(Boolean.valueOf(A00.A01), Boolean.valueOf(A00.A02), C05F.A1I, A00.A00);
        String A0v = AbstractC25227BEk.A0v(this, 2131953030);
        String A0v2 = AbstractC25227BEk.A0v(this, 2131953031);
        String A0w = AbstractC31174DnI.A0w(this, A0v, 2131953029);
        C14360o3.A07(A0w);
        A0B(AbstractC16960so.A1Q(new C45198Jze(A0v2, A0w, AbstractC166987dD.A1J(new MUW(C2Fb.A1K, A0v, new C29897DGl(30, A00, this)))), new H7I(null, null, AbstractC166997dE.A0n(), R.dimen.add_account_icon_circle_radius)));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2zI, java.lang.Object] */
    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC16960so.A1Q(new KI3(requireActivity(), AbstractC166987dD.A0r(this.A01)), new Object());
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(MJ8.A00);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }
}
