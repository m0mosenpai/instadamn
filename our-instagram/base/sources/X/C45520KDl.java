package X;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;
import java.util.Collection;

/* renamed from: X.KDl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45520KDl extends AbstractC43842Ja5 implements InterfaceC11380iw, InterfaceC60072op {
    public static final String __redex_internal_original_name = "BrandedContentSelectProjectFragment";
    public View A00;
    public FrameLayout A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "SelectProjectFragment";
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View inflate = AbstractC167007dF.A0M(view, R.id.action_bar).inflate();
        C0fQ.A00(new Fp1(this, 40), inflate.requireViewById(R.id.action_bar_button_back));
        View requireViewById = inflate.requireViewById(R.id.action_bar_button_done);
        this.A00 = requireViewById;
        if (requireViewById != null) {
            C0fQ.A00(new Fp1(this, 41), requireViewById);
        }
        this.A01 = (FrameLayout) view.requireViewById(R.id.empty_state_container);
        updateUi(MXS.A04, C16930sl.A00);
        C57312k6 A0S = AbstractC25235BEs.A0S(this);
        MC3 mc3 = new MC3(this, (InterfaceC23621Ds) null, 29);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, mc3, A0S);
        AbstractC23641Du.A05(anonymousClass191, new MC3(this, (InterfaceC23621Ds) null, 30), AbstractC25235BEs.A0S(this));
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A03);
        AbstractC23641Du.A05(anonymousClass191, new MCC(A0Z, null, 33), AbstractC25235BEs.A0W(A0Z, anonymousClass191, new MC3(A0Z, (InterfaceC23621Ds) null, 31), AbstractC25235BEs.A0S(this)));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.2zI, java.lang.Object] */
    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC16960so.A1Q(new KHL(this), new Object(), new C32609EXj(null));
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(MJJ.A00);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    public C45520KDl() {
        C50163MDq c50163MDq = new C50163MDq(this, 19);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50163MDq(new C50163MDq(this, 16), 17));
        this.A03 = AbstractC25225BEi.A0a(new C50163MDq(A00, 18), c50163MDq, new C57253Pbb(3, null, A00), AbstractC25225BEi.A1D(C44494Jm0.class));
        this.A02 = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC25226BEj.A1P(this);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(-604730092);
        super.onCreate(bundle);
        C44494Jm0 c44494Jm0 = (C44494Jm0) this.A03.getValue();
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString(MSV.A00(1499));
        } else {
            str = null;
        }
        c44494Jm0.A00 = str;
        C0f9.A09(649312749, A02);
    }
}
