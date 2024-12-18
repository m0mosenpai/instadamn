package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class V1N extends AbstractC59962oe implements InterfaceC1119153d {
    public static final String __redex_internal_original_name = "PromoteRecommendedInfoBottomSheetFragment";
    public C70399WUb A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC1119153d
    public final /* synthetic */ void Czx() {
    }

    @Override // X.InterfaceC1119153d
    public final /* synthetic */ void D00() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_education_drawer_bottom_sheet_fragment";
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
            r4 = this;
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            super.onViewCreated(r5, r6)
            android.os.Bundle r1 = r4.mArguments
            r3 = 0
            if (r1 == 0) goto Le2
            java.lang.String r0 = "recommended_destination"
            java.lang.String r1 = r1.getString(r0)
        L12:
            X.0do r0 = r4.A01
            X.WUb r0 = X.AbstractC43594JPz.A0N(r0)
            r4.A00 = r0
            r0 = 2131442120(0x7f0b39c8, float:1.850627E38)
            android.widget.TextView r2 = X.AbstractC167007dF.A0N(r5, r0)
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.A0B
            java.lang.String r0 = r0.toString()
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L71
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto L6f
            r0 = 2131968910(0x7f13438e, float:1.9574728E38)
            java.lang.String r0 = r1.getString(r0)
        L3a:
            r2.setText(r0)
            r0 = 2131428837(0x7f0b05e5, float:1.847933E38)
            android.widget.TextView r2 = X.AbstractC167007dF.A0N(r5, r0)
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto L51
            r0 = 2131968909(0x7f13438d, float:1.9574726E38)
            java.lang.String r3 = r1.getString(r0)
        L51:
            r2.setText(r3)
            java.lang.String r2 = "boost_objective_recommendation_bottomsheet_pv"
        L56:
            X.WUb r1 = r4.A00
            if (r1 == 0) goto L5f
            X.VG4 r0 = X.VG4.A17
            r1.A0I(r0, r2)
        L5f:
            X.WUb r2 = r4.A00
            if (r2 == 0) goto L6e
            X.VG4 r0 = X.VG4.A17
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "enter_recommended_drawer"
            r2.A0S(r1, r0)
        L6e:
            return
        L6f:
            r0 = r3
            goto L3a
        L71:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.A0E
            java.lang.String r0 = r0.toString()
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto La9
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto La7
            r0 = 2131968913(0x7f134391, float:1.9574734E38)
            java.lang.String r0 = r1.getString(r0)
        L8a:
            r2.setText(r0)
            r0 = 2131428837(0x7f0b05e5, float:1.847933E38)
            android.widget.TextView r2 = X.AbstractC167007dF.A0N(r5, r0)
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto La1
            r0 = 2131968912(0x7f134390, float:1.9574732E38)
            java.lang.String r3 = r1.getString(r0)
        La1:
            r2.setText(r3)
            java.lang.String r2 = "boost_objective_recommendation_bottomsheet_wv"
            goto L56
        La7:
            r0 = r3
            goto L8a
        La9:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.A04
            java.lang.String r0 = r0.toString()
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L5f
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto Le0
            r0 = 2131968908(0x7f13438c, float:1.9574724E38)
            java.lang.String r0 = r1.getString(r0)
        Lc2:
            r2.setText(r0)
            r0 = 2131428837(0x7f0b05e5, float:1.847933E38)
            android.widget.TextView r2 = X.AbstractC167007dF.A0N(r5, r0)
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto Ld9
            r0 = 2131968907(0x7f13438b, float:1.9574722E38)
            java.lang.String r3 = r1.getString(r0)
        Ld9:
            r2.setText(r3)
            java.lang.String r2 = "boost_objective_recommendation_bottomsheet_ctx"
            goto L56
        Le0:
            r0 = r3
            goto Lc2
        Le2:
            r1 = r3
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V1N.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A01.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1802286857);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_recommended_info_bottom_sheet_fragment, viewGroup, false);
        C0f9.A09(-561365976, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1045906209);
        super.onDestroyView();
        this.A00 = null;
        C0f9.A09(1674852110, A02);
    }
}
