package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteEnrollCouponInfo;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class V1O extends AbstractC59962oe implements InterfaceC1119153d {
    public static final String __redex_internal_original_name = "PromoteAbandonmentCouponBottomSheetFragment";
    public C70399WUb A00;
    public C69785VvQ A01;
    public C68722Vay A02;
    public PromoteData A03;
    public UserSession A04;
    public Integer A05 = C05F.A00;

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_abandonment_coupon_bottom_sheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        PromoteEnrollCouponInfo.PromoteEnrollCouponStatus promoteEnrollCouponStatus;
        View.OnClickListener wnp;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        PromoteData promoteData = this.A03;
        PromoteEnrollCouponInfo.PromoteEnrollCouponStatus promoteEnrollCouponStatus2 = null;
        if (promoteData != null) {
            PromoteEnrollCouponInfo promoteEnrollCouponInfo = promoteData.A0t;
            this.A05 = C05F.A00;
            TextView A0N = AbstractC167007dF.A0N(view, R.id.abandonment_coupon_bottom_sheet_title);
            Resources A0N2 = AbstractC166997dE.A0N(this);
            PromoteData promoteData2 = this.A03;
            if (promoteData2 != null) {
                PromoteEnrollCouponInfo promoteEnrollCouponInfo2 = promoteData2.A0t;
                if (promoteEnrollCouponInfo2 != null) {
                    str = promoteEnrollCouponInfo2.A0A;
                } else {
                    str = null;
                }
                MSZ.A11(A0N2, A0N, str, 2131970283);
                AbstractC31173DnH.A19(AbstractC166997dE.A0N(this), AbstractC167007dF.A0N(view, R.id.abandonment_coupon_bottom_sheet_body), 2131970282);
                View A0S = AbstractC166997dE.A0S(view, R.id.abandonment_coupon_discard_button_row);
                TextView A0N3 = AbstractC167007dF.A0N(A0S, R.id.promote_bottom_sheet_button_text);
                AbstractC31173DnH.A19(AbstractC166997dE.A0N(this), A0N3, 2131970281);
                AbstractC166987dD.A1O(requireContext(), A0N3, AbstractC53242c7.A03(getContext()));
                WNT.A00(A0S, 20, this);
                A0S.setClickable(true);
                View A0S2 = AbstractC166997dE.A0S(view, R.id.abandonment_coupon_use_credit_button_row);
                AbstractC31173DnH.A19(AbstractC166997dE.A0N(this), AbstractC167007dF.A0N(A0S2, R.id.promote_bottom_sheet_button_text), 2131970284);
                if (promoteEnrollCouponInfo != null) {
                    promoteEnrollCouponStatus = promoteEnrollCouponInfo.A00();
                } else {
                    promoteEnrollCouponStatus = null;
                }
                if (promoteEnrollCouponStatus == PromoteEnrollCouponInfo.PromoteEnrollCouponStatus.A02) {
                    wnp = new WNX(15, promoteEnrollCouponInfo, this, A0S2);
                } else {
                    if (promoteEnrollCouponInfo != null) {
                        promoteEnrollCouponStatus2 = promoteEnrollCouponInfo.A00();
                    }
                    if (promoteEnrollCouponStatus2 == PromoteEnrollCouponInfo.PromoteEnrollCouponStatus.A06) {
                        wnp = new WNP(4, A0S2, this);
                    }
                    A0S2.setClickable(true);
                    return;
                }
                C0fQ.A00(wnp, A0S2);
                A0S2.setClickable(true);
                return;
            }
        }
        C14360o3.A0F("promoteData");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        int intValue = this.A05.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                AbstractC65702TsY.A0q();
                V0G v0g = new V0G();
                Bundle bundle = new Bundle();
                bundle.putSerializable(OptSvcAnalyticsStore.LOGGING_KEY_STEP, VG4.A17);
                bundle.putBoolean("is_enter_flow_nux", true);
                v0g.setArguments(bundle);
                C68722Vay c68722Vay = this.A02;
                if (c68722Vay != null) {
                    V10 v10 = c68722Vay.A00;
                    if (v10.getActivity() != null) {
                        FragmentActivity requireActivity = v10.requireActivity();
                        PromoteData promoteData = v10.A0A;
                        if (promoteData == null) {
                            C14360o3.A0F("promoteData");
                            throw C00O.createAndThrow();
                        }
                        AbstractC31177DnL.A16(v0g, requireActivity, promoteData.A0y);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new RuntimeException();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        UserSession userSession = this.A04;
        if (userSession != null) {
            return userSession;
        }
        C14360o3.A0F("session");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(878636089);
        super.onCreate(bundle);
        PromoteData A00 = InterfaceC72021XFj.A00(this);
        this.A03 = A00;
        UserSession userSession = A00.A0y;
        this.A04 = userSession;
        if (userSession != null) {
            this.A01 = new C69785VvQ(requireContext(), this, userSession);
            UserSession userSession2 = this.A04;
            if (userSession2 != null) {
                this.A00 = C70399WUb.A00(userSession2);
                C0f9.A09(885827478, A02);
                return;
            }
        }
        C14360o3.A0F("session");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1035887036);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.promote_abandonment_coupon_bottom_sheet_view, false);
        C0f9.A09(831946522, A02);
        return A0R;
    }
}
