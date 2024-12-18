package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;

/* renamed from: X.EKl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32298EKl extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "EffectLicensingFragment";
    public EffectAttribution A00;
    public AbstractC18680vv A01;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(905);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.setTitle(AbstractC166997dE.A0N(this).getString(2131965089));
        AbstractC31176DnK.A1C(new Fp1(this, 5), AbstractC31174DnI.A0K(), interfaceC56362iU);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A01;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC25227BEk.A1B(this);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1124765370);
        super.onCreate(bundle);
        this.A01 = AbstractC31176DnK.A0R(this);
        this.A00 = (EffectAttribution) requireArguments().getParcelable(MSV.A00(924));
        C0f9.A09(-131714806, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-157361744);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.effect_licensing_fragment_layout);
        C0f9.A09(-1337295839, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        EffectAttribution effectAttribution = this.A00;
        if (effectAttribution != null) {
            Bundle requireArguments = requireArguments();
            RecyclerView recyclerView = (RecyclerView) AbstractC31173DnH.A0D(view, R.id.recyclerview);
            Context context = view.getContext();
            AbstractC31174DnI.A16(context, recyclerView, 1, false);
            C50H c50h = new C50H(context, 1);
            c50h.A01(context.getDrawable(R.drawable.effect_licensing_divider));
            recyclerView.A10(c50h);
            recyclerView.setAdapter(new Q9T(requireArguments, effectAttribution, this));
        }
    }
}
