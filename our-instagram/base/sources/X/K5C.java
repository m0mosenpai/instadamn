package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class K5C extends K5Q implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "IgSelfiePermissionsFragment";
    public UserSession A00;
    public String A01;
    public AbstractC12990ll A02;
    public String A03;
    public String A04;
    public boolean A05;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "selfie_permissions";
    }

    @Override // X.K5Q, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A00 = AbstractC47961LGz.A00(view, R.id.divider);
        Context A0L = AbstractC166997dE.A0L(view);
        AbstractC31174DnI.A1C(A00, AbstractC47994LKy.A01(A0L, R.attr.sc_divider));
        AbstractC47994LKy.A04(A0L, AbstractC47961LGz.A02(view, R.id.tv_permissions_title), R.attr.sc_primary_text);
        AbstractC47994LKy.A05((Button) AbstractC47961LGz.A00(view, R.id.btn_camera_access_allow));
        MRQ mrq = ((AbstractC44444JlB) this).A00;
        if (mrq != null) {
            AbstractC47961LGz.A01(view, R.id.iv_image).setImageDrawable(mrq.BcW(A0L));
        }
        C023409i.A0A.A04(requireArguments());
        if (this.A05 && this.A00 == null) {
            throw AbstractC166997dE.A0g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0051, code lost:
    
        if (r4.A00 == null) goto L11;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            r0 = -1405372627(0xffffffffac3bb72d, float:-2.6675981E-12)
            int r3 = X.C0f9.A02(r0)
            super.onCreate(r5)
            android.os.Bundle r2 = r4.requireArguments()
            X.09Y r0 = X.C023409i.A0A
            X.0vv r1 = r0.A04(r2)
            r4.A02 = r1
            boolean r0 = r1 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L70
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
        L1c:
            r4.A00 = r1
            java.lang.String r0 = "challenge_id"
            java.lang.String r0 = r2.getString(r0)
            r4.A03 = r0
            java.lang.String r0 = "challenge_use_case"
            java.lang.String r0 = r2.getString(r0)
            r4.A04 = r0
            java.lang.String r0 = "av_session_id"
            r2.getString(r0)
            java.lang.String r0 = "flow_id"
            r2.getString(r0)
            java.lang.String r0 = "product_surface"
            java.lang.String r0 = r2.getString(r0)
            r4.A01 = r0
            java.lang.String r1 = r4.A04
            java.lang.String r0 = "ig_age_verification"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L53
            java.lang.String r0 = r4.A03
            if (r0 == 0) goto L53
            com.instagram.common.session.UserSession r1 = r4.A00
            r0 = 1
            if (r1 != 0) goto L54
        L53:
            r0 = 0
        L54:
            r4.A05 = r0
            if (r0 == 0) goto L69
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            X.00M r2 = r0.getOnBackPressedDispatcher()
            r1 = 1
            X.Jl3 r0 = new X.Jl3
            r0.<init>(r4, r1)
            r2.A03(r0)
        L69:
            r0 = -279001294(0xffffffffef5ec732, float:-6.8946485E28)
            X.C0f9.A09(r0, r3)
            return
        L70:
            r1 = 0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K5C.onCreate(android.os.Bundle):void");
    }

    @Override // X.K5Q, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-112205976);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.sc_ig_permission_fragment, viewGroup, false);
        C0f9.A09(-492767129, A02);
        return inflate;
    }
}
