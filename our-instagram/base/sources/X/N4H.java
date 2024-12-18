package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class N4H extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "UserPayCMPViolationBottomSheet";
    public final InterfaceC09390do A00 = C57517Pfr.A00(this, 30);
    public final InterfaceC09390do A01;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.description);
        Context context = A0T.getContext();
        String A0p = AbstractC166997dE.A0p(context, 2131965575);
        SpannableStringBuilder A05 = AbstractC31175DnJ.A05(context, 2131965583);
        AnonymousClass773.A04(A05, new NY0(this, AbstractC31174DnI.A02(context)), A0p);
        AbstractC31176DnK.A1G(A0T, A05);
        C64P c64p = (C64P) view.requireViewById(R.id.bottom_button);
        Context context2 = view.getContext();
        c64p.setPrimaryAction(context2.getString(2131965590), new ViewOnClickListenerC55463OkI(this, 2));
        c64p.setSecondaryAction(context2.getString(2131965591), new ViewOnClickListenerC55463OkI(this, 3));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    public N4H() {
        C57517Pfr c57517Pfr = new C57517Pfr(this, 31);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57517Pfr(new C57517Pfr(this, 27), 28));
        this.A01 = AbstractC25225BEi.A0a(new C57517Pfr(A00, 29), c57517Pfr, C57530Pg4.A00(null, A00, 48), AbstractC25225BEi.A1D(C50909Mee.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(44764704);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.iglive_user_pay_cmp_violation_bottom_sheet, viewGroup, false);
        C0f9.A09(-3668211, A02);
        return inflate;
    }
}
