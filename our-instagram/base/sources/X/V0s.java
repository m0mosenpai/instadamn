package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.business.promote.model.PromoteButtonActionType;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.common.session.UserSession;
import com.instagram.url.UrlHandlerActivity;

/* loaded from: classes11.dex */
public final class V0s extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PromotePromotionInformationFragment";
    public InterfaceC56362iU A00;
    public W6I A01;
    public String A02;
    public String A03;
    public String A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        this.A00 = interfaceC56362iU;
        C3LO c3lo = new C3LO();
        c3lo.A00();
        AbstractC31176DnK.A1C(new WNO(this, 10), c3lo, interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_promotion_information_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0S = AbstractC166997dE.A0S(view, R.id.thumbnail_image);
        View A0S2 = AbstractC166997dE.A0S(view, R.id.display_title);
        View A0S3 = AbstractC166997dE.A0S(view, R.id.display_body);
        BusinessNavBar businessNavBar = (BusinessNavBar) AbstractC166997dE.A0S(view, R.id.bottom_bar);
        businessNavBar.A01.setVisibility(8);
        businessNavBar.A02(false);
        View A0S4 = AbstractC166997dE.A0S(view, R.id.loading_spinner);
        AbstractC31180DnO.A1F(getViewLifecycleOwner(), ((UFH) this.A06.getValue()).A00, new C43752JWo(3, this, A0S2, A0S4, A0S, businessNavBar, A0S3), 49);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A05.getValue();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        W6I w6i = this.A01;
        if (w6i == null) {
            C14360o3.A0F("adsManagerLogger");
            throw C00O.createAndThrow();
        }
        w6i.A01(VG4.A1F.toString());
        return false;
    }

    public V0s() {
        X2v x2v = new X2v(this, 22);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new X2v(new X2v(this, 19), 20));
        this.A06 = new C60842q8(new X2v(A00, 21), x2v, new C57253Pbb(34, null, A00), new C0YZ(UFH.class));
        this.A05 = AbstractC60492pY.A02(this);
    }

    public static final void A00(V0s v0s, PromoteButtonActionType promoteButtonActionType, String str) {
        C14J A00;
        Context context;
        int ordinal = promoteButtonActionType.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C14K c14k = C14J.A04;
                if ((c14k.A00() != null && (context = v0s.getContext()) != null && str != null && AbstractC35278FhD.A0G(context, str) != null) || ((A00 = c14k.A00()) != null && A00.A00((AbstractC18680vv) v0s.A05.getValue(), str) != null)) {
                    Intent intent = new Intent(v0s.requireContext(), (Class<?>) UrlHandlerActivity.class);
                    intent.setData(AbstractC08820cl.A03(str));
                    intent.putExtra(AbstractC111324zv.A00(193), true);
                    v0s.startActivityForResult(intent, 0);
                    return;
                }
                return;
            }
            throw new RuntimeException();
        }
        C63397SjR c63397SjR = new C63397SjR(v0s.requireActivity(), (UserSession) v0s.A05.getValue(), C2Fb.A35, str, false);
        c63397SjR.A0S = "promote_promotion_information_fragment";
        c63397SjR.A0A();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (JQ0.A04(1, i) == 0) {
            AbstractC25226BEj.A1P(this);
            WGU.A06((UserSession) this.A05.getValue());
            return;
        }
        throw new RuntimeException();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalArgumentException illegalArgumentException;
        int i;
        String string;
        String string2;
        String str;
        int A02 = C0f9.A02(-1758730481);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (string = bundle2.getString("media_id")) != null) {
            this.A04 = string;
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null && (string2 = bundle3.getString("access_token")) != null) {
                this.A02 = string2;
                Bundle bundle4 = this.mArguments;
                if (bundle4 == null || (str = bundle4.getString("ad_account_id")) == null) {
                    str = "";
                }
                this.A03 = str;
                this.A01 = VRC.A00((UserSession) this.A05.getValue());
                C0f9.A09(305352961, A02);
                return;
            }
            illegalArgumentException = new IllegalArgumentException("PromotePromotionInformationViewModel requires a non-null ACCESS_TOKEN");
            i = -904396863;
        } else {
            illegalArgumentException = new IllegalArgumentException("PromotePromotionInformationViewModel requires a non-null MEDIA_ID");
            i = -2078845827;
        }
        C0f9.A09(i, A02);
        throw illegalArgumentException;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = C0f9.A02(7888720);
        C14360o3.A0B(layoutInflater, 0);
        W6I w6i = this.A01;
        if (w6i == null) {
            str = "adsManagerLogger";
        } else {
            String obj = VG4.A1F.toString();
            String str2 = this.A04;
            if (str2 == null) {
                str = "mediaId";
            } else {
                w6i.A03(obj, str2);
                View inflate = layoutInflater.inflate(R.layout.promote_promotion_information_fragment, viewGroup, false);
                C0f9.A09(153266945, A02);
                return inflate;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
