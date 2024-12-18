package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;
import java.util.ArrayList;

/* renamed from: X.Ek1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33158Ek1 extends AbstractC32289EKc {
    public static final String __redex_internal_original_name = "DataDownloadRequestFragment";
    public EditText A00;
    public UserSession A01;
    public DataDownloadStatusCheckResponse A02;
    public InlineErrorMessageView A03;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "data_download_request";
    }

    public static void A00(C33158Ek1 c33158Ek1) {
        String str;
        DataDownloadStatusCheckResponse dataDownloadStatusCheckResponse = c33158Ek1.A02;
        if (dataDownloadStatusCheckResponse != null) {
            str = dataDownloadStatusCheckResponse.A01;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            ArrayList A01 = AbstractC35100FdB.A01(c33158Ek1.requireContext(), ((AbstractC32289EKc) c33158Ek1).A00);
            if (!A01.isEmpty()) {
                str = (String) AbstractC166997dE.A0k(A01);
            }
        }
        EditText editText = c33158Ek1.A00;
        if (str != null && editText != null && TextUtils.isEmpty(AbstractC167007dF.A0g(editText))) {
            editText.append(str);
        }
    }

    public static void A01(C33158Ek1 c33158Ek1) {
        boolean A0C = AbstractC13670mt.A0C(AbstractC167007dF.A0g(c33158Ek1.A00));
        InlineErrorMessageView inlineErrorMessageView = c33158Ek1.A03;
        if (A0C) {
            inlineErrorMessageView.A03();
            C140966Yy A0r = AbstractC25225BEi.A0r(c33158Ek1.requireActivity(), ((AbstractC32289EKc) c33158Ek1).A00);
            String A0g = AbstractC167007dF.A0g(c33158Ek1.A00);
            AbstractC59962oe abstractC59962oe = new AbstractC59962oe();
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putString("email", A0g);
            AbstractC31176DnK.A1A(A0b, abstractC59962oe, A0r);
            return;
        }
        inlineErrorMessageView.A04(c33158Ek1.getString(2131964633));
    }

    @Override // X.AbstractC32289EKc, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(467452371);
        super.onCreate(bundle);
        UserSession A0S = AbstractC31176DnK.A0S(this);
        this.A01 = A0S;
        C25621Ms A0N = AbstractC31173DnH.A0N(A0S);
        A0N.A0B("dyi/check_data_state/");
        C1ON A0S2 = AbstractC31172DnG.A0S(A0N, DataDownloadStatusCheckResponse.class, FXU.class);
        C31714DwJ.A00(A0S2, this, 1);
        schedule(A0S2);
        C0f9.A09(586726786, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1475376005);
        View inflate = layoutInflater.inflate(R.layout.data_download_request_fragment, viewGroup, false);
        AbstractC166997dE.A0T(inflate, R.id.header_text).setText(2131957503);
        AbstractC166997dE.A0T(inflate, R.id.body_text).setText(2131957501);
        AbstractC31173DnH.A0I(inflate, R.id.header_icon).setImageDrawable(AbstractC166997dE.A0N(this).getDrawable(R.drawable.download_your_data_icon, null));
        AbstractC31173DnH.A0G(inflate, R.id.inline_error_stub).inflate();
        EditText A0H = AbstractC31173DnH.A0H(inflate, R.id.text_field);
        this.A00 = A0H;
        A0H.setHint(2131961706);
        this.A00.setInputType(32);
        this.A00.setImeOptions(6);
        C35754Fqr.A00(this.A00, this, 21);
        this.A03 = (InlineErrorMessageView) inflate.requireViewById(R.id.inline_error);
        ((C64P) inflate.requireViewById(R.id.bottom_button_layout)).setPrimaryActionOnClickListener(ViewOnClickListenerC35689FpO.A00(this, 64));
        View requireViewById = inflate.requireViewById(R.id.scroll_view);
        requireViewById.setVerticalScrollBarEnabled(false);
        ViewOnLayoutChangeListenerC35699FpZ.A00(inflate, 5, requireViewById);
        DataDownloadStatusCheckResponse dataDownloadStatusCheckResponse = this.A02;
        if (dataDownloadStatusCheckResponse == null || dataDownloadStatusCheckResponse.A00 == DataDownloadStatusCheckResponse.JobStatus.NO_VALID_DOWNLOADABLE) {
            A00(this);
        }
        C0f9.A09(-318296173, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(557122421);
        super.onPause();
        Window A0H = AbstractC31174DnI.A0H(this);
        A0H.getClass();
        A0H.setSoftInputMode(0);
        AbstractC31171DnF.A16(this);
        C0f9.A09(1781358446, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(224311025);
        super.onResume();
        Activity rootActivity = getRootActivity();
        rootActivity.getClass();
        AbstractC31180DnO.A0x(rootActivity);
        C0f9.A09(170450405, A02);
    }
}
