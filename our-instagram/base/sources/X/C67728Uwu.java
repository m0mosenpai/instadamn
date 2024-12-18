package X;

import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.Uwu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67728Uwu extends AbstractC66388UEw implements InterfaceC65384TjH {
    public ContextThemeWrapper A00;

    @Override // X.AbstractC66388UEw, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Object obj = requireArguments().get("ECP_CONTAINER_FRAGMENT_TYPE");
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Bundle bundle2 = new Bundle();
        if (C14360o3.A0K(str, "web_view_fragment")) {
            Object obj2 = requireArguments().get(AbstractC58317Pt9.A00(177));
            C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = requireArguments().get(AbstractC58317Pt9.A00(176));
            C14360o3.A0C(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            bundle2.putString(AbstractC58317Pt9.A00(651), (String) obj2);
            bundle2.putStringArray(AbstractC58317Pt9.A00(647), (String[]) obj3);
            bundle2.putBoolean(AbstractC58317Pt9.A00(648), true);
            Fragment A01 = C2FP.A01().A01(bundle2, str);
            C14240no A0F = AbstractC43593JPy.A0F(this);
            A01.setTargetFragment(null, 1111);
            A0F.A0D(A01, "CHILD_FRAGMENT_TAG", R.id.ecp_container_view);
            A0F.A00();
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC65384TjH
    public final boolean DIB(Bundle bundle, int i, boolean z) {
        String str;
        if (i == 1111) {
            Fragment A0Q = getChildFragmentManager().A0Q("CHILD_FRAGMENT_TAG");
            if (A0Q != null) {
                C14240no A0F = AbstractC43593JPy.A0F(this);
                A0F.A03(A0Q);
                A0F.A01();
            }
            String str2 = null;
            if (bundle != null) {
                str = bundle.getString(AbstractC58317Pt9.A00(650));
                str2 = bundle.getString(AbstractC58317Pt9.A00(649));
            } else {
                str = null;
            }
            Object obj = requireArguments().get("ECP_CONTAINER_FRAGMENT_TYPE");
            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.String");
            if (C14360o3.A0K(obj, "web_view_fragment")) {
                Bundle bundle2 = new Bundle();
                String string = requireArguments().getString("ECP_CONTENT_FRAGMENT_REQUEST_KEY");
                if (string != null) {
                    int i2 = 0;
                    if ((str2 == null || str2.length() == 0) && str != null && str.length() != 0) {
                        UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer(str);
                        if (C14360o3.A0K(urlQuerySanitizer.getValue("cancel"), RealtimeSubscription.GRAPHQL_MQTT_VERSION)) {
                            i2 = 2;
                        } else {
                            String value = urlQuerySanitizer.getValue("ba_token");
                            if (value != null) {
                                bundle2.putString(AbstractC111324zv.A00(3701), value);
                            }
                        }
                        bundle2.putInt(AbstractC111324zv.A00(324), i2);
                        C06C.A00(bundle2, this, string);
                        InterfaceC08430c6 interfaceC08430c6 = this.mParentFragment;
                        C14360o3.A0C(interfaceC08430c6, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.BottomSheetDialogController");
                        ((InterfaceC72028XFq) interfaceC08430c6).D7Z();
                        return false;
                    }
                    bundle2.putString(AbstractC111324zv.A00(323), str2);
                    i2 = 1;
                    bundle2.putInt(AbstractC111324zv.A00(324), i2);
                    C06C.A00(bundle2, this, string);
                    InterfaceC08430c6 interfaceC08430c62 = this.mParentFragment;
                    C14360o3.A0C(interfaceC08430c62, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.BottomSheetDialogController");
                    ((InterfaceC72028XFq) interfaceC08430c62).D7Z();
                    return false;
                }
                throw AbstractC166997dE.A0g();
            }
            throw new UnsupportedOperationException();
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1022478174);
        super.onCreate(bundle);
        C0f9.A09(1915641427, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(857650437);
        ContextThemeWrapper A00 = AbstractC66388UEw.A00(this, layoutInflater);
        this.A00 = A00;
        View inflate = layoutInflater.cloneInContext(A00).inflate(R.layout.ecp_container_fragment, viewGroup, false);
        C0f9.A09(451865946, A02);
        return inflate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        if (X.WGr.A0L(r3) != true) goto L8;
     */
    @Override // X.AbstractC66388UEw, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            r12 = this;
            r0 = 1507775862(0x59ded576, float:7.8402685E15)
            int r2 = X.C0f9.A02(r0)
            r4 = r12
            super.onResume()
            android.os.Bundle r1 = r12.requireArguments()
            r0 = 175(0xaf, float:2.45E-43)
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            java.lang.String r6 = r1.getString(r0)
            android.os.Bundle r1 = r12.requireArguments()
            java.lang.String r0 = "ECP_LAUNCH_PARAMS"
            android.os.Parcelable r3 = r1.getParcelable(r0)
            boolean r0 = r3 instanceof com.facebookpay.expresscheckout.models.ECPPaymentRequest
            if (r0 == 0) goto L33
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r3 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r3
            r1 = 1
            if (r3 == 0) goto L33
            boolean r0 = X.WGr.A0L(r3)
            r11 = 1
            if (r0 == r1) goto L34
        L33:
            r11 = 0
        L34:
            android.view.ContextThemeWrapper r3 = r12.A00
            if (r3 != 0) goto L42
            java.lang.String r0 = "viewContext"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L42:
            android.os.Bundle r1 = r12.requireArguments()
            r0 = 174(0xae, float:2.44E-43)
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            java.lang.Object r5 = r1.get(r0)
            if (r5 == 0) goto L68
            X.VEY r5 = (X.VEY) r5
            r0 = 2
            X.X2w r8 = new X.X2w
            r8.<init>(r12, r0)
            r7 = 0
            X.X4E r9 = X.X4E.A00
            r10 = 0
            X.AbstractC68346VNg.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = -729183365(0xffffffffd4898b7b, float:-4.726005E12)
            X.C0f9.A09(r0, r2)
            return
        L68:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67728Uwu.onResume():void");
    }
}
