package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;

/* renamed from: X.V0x, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67890V0x extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou, XA8 {
    public static final String __redex_internal_original_name = "PromoteBeneficiaryAndPayerFragment";
    public Drawable A00;
    public Drawable A01;
    public W65 A02;
    public UserSession A03;
    public String A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131970402);
        AbstractC31176DnK.A1C(new WNT(this, 7), AbstractC31176DnK.A0I(), interfaceC56362iU);
        interfaceC56362iU.EkS(true);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_beneficiary_and_payer_view";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0094, code lost:
    
        if (r0 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0096, code lost:
    
        r0 = "checkIcon";
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0098, code lost:
    
        X.C14360o3.A0F(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009f, code lost:
    
        throw X.C00O.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00df, code lost:
    
        if (r0 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e4, code lost:
    
        if (r0 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a4, code lost:
    
        r0 = "errorIcon";
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a2, code lost:
    
        if (r0 == null) goto L17;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67890V0x.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.XA8
    public final void CuW() {
        String str;
        InterfaceC09390do interfaceC09390do = this.A06;
        UFF uff = (UFF) interfaceC09390do.getValue();
        PromoteData promoteData = uff.A02;
        promoteData.A2E = true;
        promoteData.A1C = uff.A00;
        promoteData.A1D = uff.A01;
        AbstractC65702TsY.A0N(this.A05).A0C(VG4.A0L, ((UFF) interfaceC09390do.getValue()).A02);
        String str2 = this.A04;
        if (str2 == null) {
            str = "previousStep";
        } else {
            if (str2.equals(VG4.A1Q.toString())) {
                AbstractC25226BEj.A1P(this);
            }
            AbstractC65702TsY.A0q();
            C67892V0z c67892V0z = new C67892V0z();
            FragmentActivity requireActivity = requireActivity();
            UserSession userSession = this.A03;
            if (userSession != null) {
                C140966Yy A0C = AbstractC31180DnO.A0C(requireActivity, userSession);
                A0C.A0D(c67892V0z);
                A0C.A04();
                return;
            }
            str = "session";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        UserSession userSession = this.A03;
        if (userSession != null) {
            return userSession;
        }
        C14360o3.A0F("session");
        throw C00O.createAndThrow();
    }

    public C67890V0x() {
        X31 x31 = new X31(this, 28);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new X31(new X31(this, 25), 26));
        this.A06 = new C60842q8(new X31(A00, 27), x31, new C57253Pbb(20, null, A00), new C0YZ(UFF.class));
        this.A05 = C1XM.A00(new X31(this, 24));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-2086088463);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            String string = bundle2.getString(OptSvcAnalyticsStore.LOGGING_KEY_STEP);
            if (string != null) {
                this.A04 = string;
            } else {
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A09(1668439938, A02);
                throw A0g;
            }
        }
        this.A03 = ((UFF) this.A06.getValue()).A02.A0y;
        C0f9.A09(1778796137, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(774019845);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_beneficiary_and_payer_view, viewGroup, false);
        C0f9.A09(-776821347, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1871407683);
        super.onDestroyView();
        C0f9.A09(1991881752, A02);
    }
}
