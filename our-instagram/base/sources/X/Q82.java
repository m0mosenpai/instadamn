package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class Q82 extends Fragment implements InterfaceC65384TjH, InterfaceC65382TjF {
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f9  */
    @Override // X.InterfaceC65384TjH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean DIB(android.os.Bundle r11, int r12, boolean r13) {
        /*
            r10 = this;
            r9 = 0
            r0 = 1111(0x457, float:1.557E-42)
            if (r12 != r0) goto L6c
            X.0h2 r1 = r10.getChildFragmentManager()
            java.lang.String r0 = "THREE_DS_WEBVIEW_FRAGMENT_TAG"
            androidx.fragment.app.Fragment r1 = r1.A0Q(r0)
            if (r1 == 0) goto L1b
            X.0no r0 = X.AbstractC43593JPy.A0F(r10)
            r0.A03(r1)
            r0.A01()
        L1b:
            r5 = 0
            if (r11 == 0) goto L6f
            java.lang.String r0 = "WEB_VIEW_RESULT_INTERCEPT_URL"
            java.lang.String r2 = r11.getString(r0)
            java.lang.String r0 = "WEB_VIEW_RESULT_ERROR_ENCOUNTERED"
            boolean r1 = r11.getBoolean(r0)
            if (r2 == 0) goto L6d
            int r0 = r2.length()
            if (r0 == 0) goto L6d
            android.net.UrlQuerySanitizer r4 = new android.net.UrlQuerySanitizer
            r4.<init>(r2)
        L37:
            if (r1 != 0) goto L6f
            if (r4 == 0) goto L6f
            java.lang.String r0 = "auth_result"
            java.lang.String r1 = r4.getValue(r0)
            java.lang.String r0 = "Success"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L9e
            java.lang.String r0 = "step_up_complete_token"
            java.lang.String r3 = r4.getValue(r0)
            java.lang.String r1 = "client_load_threeds_success"
            java.lang.String r0 = "complete_redirect_3ds"
            r10.A00(r1, r0, r5, r5)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>(r11)
            java.lang.String r0 = "3ds_token_token"
            r2.putString(r0, r3)
            androidx.fragment.app.Fragment r1 = r10.mParentFragment
            boolean r0 = r1 instanceof X.TmO
            if (r0 == 0) goto L6c
            X.TmO r1 = (X.TmO) r1
            r1.DHb(r2, r5)
        L6c:
            return r9
        L6d:
            r4 = r5
            goto L37
        L6f:
            android.content.Context r1 = r10.requireContext()
            r0 = 2131975563(0x7f135d8b, float:1.9588222E38)
            java.lang.String r7 = X.AbstractC166997dE.A0p(r1, r0)
            android.content.Context r1 = r10.requireContext()
            r0 = 2131975562(0x7f135d8a, float:1.958822E38)
            java.lang.String r8 = X.AbstractC166997dE.A0p(r1, r0)
            android.content.Context r1 = r10.requireContext()
            r0 = 2131975561(0x7f135d89, float:1.9588218E38)
            java.lang.String r1 = X.AbstractC166997dE.A0p(r1, r0)
            X.VFe r0 = X.EnumC68186VFe.DISMISS
            X.VhQ r4 = new X.VhQ
            r4.<init>(r0, r1, r5)
            X.REY r3 = new X.REY
            r6 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9)
            goto Lf3
        L9e:
            java.lang.String r0 = "error_title"
            java.lang.String r3 = r4.getValue(r0)
            X.C14360o3.A07(r3)
            java.lang.String r2 = "_"
            X.11L r0 = new X.11L
            r0.<init>(r2)
            java.lang.String r1 = " "
            java.lang.String r0 = r0.A00(r3, r1)
            java.lang.String r7 = X.AbstractC25228BEl.A1A(r0)
            java.lang.String r0 = "error_message"
            java.lang.String r0 = r4.getValue(r0)
            X.C14360o3.A07(r0)
            java.lang.String r0 = X.AbstractC58319PtB.A0s(r0, r2, r1)
            java.lang.String r8 = X.AbstractC25228BEl.A1A(r0)
            java.lang.String r0 = "cta_type"
            java.lang.String r2 = r4.getValue(r0)
            android.content.Context r1 = r10.requireContext()
            r0 = 2131975561(0x7f135d89, float:1.9588218E38)
            java.lang.String r1 = X.AbstractC166997dE.A0p(r1, r0)
            X.VFe r0 = X.EnumC68186VFe.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.Enum r0 = com.facebook.graphql.enums.EnumHelper.A00(r2, r0)
            X.VFe r0 = (X.EnumC68186VFe) r0
            X.C14360o3.A07(r0)
            X.AbstractC167017dG.A1R(r7, r8)
            X.VhQ r4 = new X.VhQ
            r4.<init>(r0, r1, r5)
            X.REY r3 = new X.REY
            r6 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9)
        Lf3:
            androidx.fragment.app.Fragment r1 = r10.mParentFragment
            boolean r0 = r1 instanceof X.TmO
            if (r0 == 0) goto Lfe
            X.TmO r1 = (X.TmO) r1
            r1.DHc(r3)
        Lfe:
            java.lang.String r1 = "client_load_threeds_fail"
            java.lang.String r0 = "complete_redirect_3ds"
            r10.A00(r1, r0, r5, r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q82.DIB(android.os.Bundle, int, boolean):boolean");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        A00("client_render_threeds_display", "load_3ds_init_url", null, null);
        SQ1 A03 = C2FP.A03();
        Fragment A01 = A03.A04.A01(requireArguments(), "AUTH_THREE_DS_WEB_VIEW");
        C14360o3.A07(A01);
        A01.setTargetFragment(null, 1111);
        C14240no A0F = AbstractC43593JPy.A0F(this);
        A0F.A0C(A01, "THREE_DS_WEBVIEW_FRAGMENT_TAG", R.id.webview_container);
        A0F.A00();
    }

    private final void A00(String str, String str2, String str3, Throwable th) {
        Map A1G;
        HashMap A00 = SSA.A00(requireArguments());
        if (str2 != null && str2.length() != 0) {
            A00.put("auth_view_name_key", str2);
        }
        if (str3 != null && str3.length() != 0) {
            A00.put("auth_target_name_key", str3);
        }
        if (th != null) {
            String A01 = AbstractC63064Sbl.A01(th);
            if (A00.containsKey("AUTH_LOGGING_EXTRA_KEY")) {
                Object obj = A00.get("AUTH_LOGGING_EXTRA_KEY");
                obj.getClass();
                A1G = (Map) obj;
            } else {
                A1G = AbstractC166987dD.A1G();
                A00.put("AUTH_LOGGING_EXTRA_KEY", A1G);
            }
            A1G.put("error_message", A01);
        }
        C2FP.A03().A01.Chz(str, Collections.unmodifiableMap(A00));
    }

    @Override // X.InterfaceC65382TjF
    public final boolean onBackPressed() {
        A00("user_click_threeds_exit", null, "cancel_3ds", null);
        RuntimeException runtimeException = new RuntimeException();
        InterfaceC08430c6 interfaceC08430c6 = this.mParentFragment;
        if (interfaceC08430c6 instanceof InterfaceC65506Tlb) {
            ((InterfaceC65506Tlb) interfaceC08430c6).AVf(null, null, runtimeException);
            return false;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-659800980);
        C14360o3.A0B(layoutInflater, 0);
        Context requireContext = requireContext();
        C2FP.A0A();
        View inflate = AbstractC43593JPy.A0C(requireContext, layoutInflater, R.style.FBPayUIWidget).inflate(R.layout.auth_three_ds_fragment, viewGroup, false);
        C0f9.A09(1737338465, A02);
        return inflate;
    }
}
