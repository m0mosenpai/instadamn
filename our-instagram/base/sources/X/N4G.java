package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class N4G extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "IgLiveCopyrightWarningFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A01;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString("live_visibility_mode");
        } else {
            str = null;
        }
        boolean A0K = C14360o3.A0K(str, "fan_club");
        TextView A0e = AbstractC166987dD.A0e(view, R.id.text_title);
        Context context = view.getContext();
        int i = 2131964086;
        if (A0K) {
            i = 2131964087;
        }
        AbstractC166987dD.A1P(context, A0e, i);
        TextView A0e2 = AbstractC166987dD.A0e(view, R.id.text_body);
        int i2 = 2131964084;
        if (A0K) {
            i2 = 2131964085;
        }
        AbstractC166987dD.A1P(context, A0e2, i2);
        C64P c64p = (C64P) view.findViewById(R.id.bottom_buttons);
        c64p.setPrimaryAction(context.getString(2131964110), new Ok4(this, 35));
        c64p.setSecondaryAction(context.getString(2131964107), new Ok4(this, 36));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    public N4G() {
        C57540PgE c57540PgE = new C57540PgE(this, 46);
        InterfaceC09390do A01 = C57540PgE.A01(new C57540PgE(this, 43), EnumC09460dv.A02, 44);
        this.A01 = AbstractC25225BEi.A0a(new C57540PgE(A01, 45), c57540PgE, C57532Pg6.A00(null, A01, 46), AbstractC25225BEi.A1D(C50909Mee.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-212819159);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.iglive_capture_rights_manager_warning_bottom_sheet, viewGroup, false);
        C0f9.A09(1305804238, A02);
        return inflate;
    }
}
