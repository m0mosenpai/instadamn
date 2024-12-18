package X;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class EJn extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "DirectEditIceBreakerFragment";
    public Intent A00;
    public View A01;
    public View A02;
    public EditText A03;
    public EditText A04;
    public TextView A05;
    public TextView A06;
    public UserSession A07;
    public C34923Fa9 A08;
    public FR9 A09;
    public C36292Fzm A0A;
    public String A0B;
    public View A0C;
    public TextView A0D;
    public TextView A0E;
    public TextView A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public final TextWatcher A0J = new C35469Fl4(this, 6);
    public final InterfaceC37166GZd A0K = new G1Q(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_edit_icebreaker_fragment";
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(X.EJn r7) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EJn.A00(X.EJn):void");
    }

    public static boolean A01(EJn eJn) {
        String A0c;
        EditText editText = eJn.A04;
        if (editText == null) {
            A0c = null;
        } else {
            A0c = AbstractC31177DnL.A0c(editText);
        }
        if (eJn.A09 == null) {
            return AbstractC31171DnF.A1X(A0c);
        }
        if ((!TextUtils.isEmpty(A0c) || !TextUtils.isEmpty(eJn.A09.A03)) && !AbstractC50102Ry.A00(A0c, eJn.A09.A03)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        String str;
        ?? obj = new Object();
        if (this.A09 != null) {
            str = getString(2131959305);
        } else {
            str = null;
        }
        obj.A02 = str;
        this.A02 = C31722DwR.A00(ViewOnClickListenerC35681FpG.A00(this, 49), interfaceC56362iU, obj);
        AbstractC31176DnK.A1C(ViewOnClickListenerC35681FpG.A00(this, 50), AbstractC31174DnI.A0K(), interfaceC56362iU);
        A00(this);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A07;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        FR9 fr9;
        int A02 = C0f9.A02(-1289604720);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A07 = AbstractC31171DnF.A0G(requireArguments);
        this.A0I = !F28.A00(r0);
        this.A0A = (C36292Fzm) C31651DvH.A00(this.A07, C36292Fzm.class, 4);
        String string = requireArguments.getString("DirectEditIceBreakerFragment.icebreaker_id");
        this.A0B = requireArguments.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "business_settings");
        this.A0G = AbstractC31172DnG.A13(requireArguments, "DirectEditIceBreakerFragment.prefill_answer");
        if (string != null) {
            C36292Fzm c36292Fzm = this.A0A;
            synchronized (c36292Fzm) {
                Map map = c36292Fzm.A05;
                if (map != null) {
                    fr9 = (FR9) map.get(string);
                } else {
                    fr9 = null;
                }
            }
            this.A09 = fr9;
            fr9.getClass();
        }
        UserSession userSession = this.A07;
        C14360o3.A0B(userSession, 0);
        this.A08 = new C34923Fa9(this, userSession);
        this.A00 = AbstractC31171DnF.A04();
        C0f9.A09(-1623711885, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Resources resources;
        String str;
        int A02 = C0f9.A02(1619264597);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_edit_icebreaker, viewGroup, false);
        EditText A0H = AbstractC31173DnH.A0H(inflate, R.id.question);
        this.A03 = A0H;
        TextWatcher textWatcher = this.A0J;
        A0H.addTextChangedListener(textWatcher);
        this.A05 = AbstractC166997dE.A0T(inflate, R.id.question_title);
        this.A0D = AbstractC166997dE.A0T(inflate, R.id.direct_edit_faq_add_question_header_title);
        this.A0C = inflate.requireViewById(R.id.direct_icebreaker_response_section);
        this.A0E = AbstractC166997dE.A0T(inflate, R.id.question_description);
        this.A0F = AbstractC166997dE.A0T(inflate, R.id.auto_response_description);
        if (getContext() != null) {
            resources = getContext().getResources();
        } else {
            resources = null;
        }
        FR9 fr9 = this.A09;
        if (fr9 != null) {
            this.A03.setText(fr9.A02);
            View requireViewById = inflate.requireViewById(R.id.delete);
            this.A01 = requireViewById;
            requireViewById.setVisibility(0);
            ViewOnClickListenerC35681FpG.A01(this.A01, 48, this);
            C34923Fa9.A00(this.A08, "icebreaker_settings_edit_question_screen_impression", null, null);
        } else {
            View requireViewById2 = inflate.requireViewById(R.id.direct_add_icebreaker_header);
            TextView A0T = AbstractC166997dE.A0T(inflate, R.id.direct_edit_faq_add_question_header_description);
            int i = 2131959295;
            if (resources != null) {
                i = 2131959306;
                int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.abc_dropdownitem_icon_width);
                AbstractC13880nE.A0Z(requireViewById2, dimensionPixelOffset);
                AbstractC13880nE.A0b(requireViewById2, dimensionPixelOffset);
                this.A0D.setTypeface(null, 1);
            }
            Resources A0N = AbstractC166997dE.A0N(this);
            if (!this.A0I) {
                i = 2131959294;
            }
            AbstractC31173DnH.A19(A0N, A0T, i);
            requireViewById2.setVisibility(0);
            C34923Fa9 c34923Fa9 = this.A08;
            boolean z = !this.A0B.equals("business_settings");
            HashMap A1G = AbstractC166987dD.A1G();
            if (z) {
                str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else {
                str = "0";
            }
            A1G.put("from_qp", str);
            C34923Fa9.A00(c34923Fa9, "icebreaker_settings_add_question_screen_impression", null, A1G);
        }
        if (this.A0I) {
            this.A03.setSingleLine(true);
            this.A03.setImeOptions(5);
            View requireViewById3 = inflate.requireViewById(R.id.direct_icebreaker_response_section);
            requireViewById3.setVisibility(0);
            C34923Fa9 c34923Fa92 = this.A08;
            String str2 = this.A0B;
            C14360o3.A0B(str2, 0);
            C34923Fa9.A00(c34923Fa92, "icebreaker_settings_auto_response_section_impression", null, AbstractC06930Yk.A07(AbstractC25230BEn.A1b(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2)));
            this.A04 = AbstractC31173DnH.A0H(requireViewById3, R.id.auto_response_content);
            this.A06 = AbstractC166997dE.A0T(inflate, R.id.auto_response_title);
            this.A04.addTextChangedListener(textWatcher);
            FR9 fr92 = this.A09;
            if (fr92 != null) {
                EditText editText = this.A04;
                String str3 = fr92.A03;
                if (str3 == null) {
                    str3 = "";
                }
                editText.setText(str3);
            }
            String str4 = this.A0G;
            if (!str4.isEmpty()) {
                this.A04.setText(str4);
            }
        }
        if (resources != null) {
            AbstractC13880nE.A0d(this.A0C, resources.getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material));
            this.A03.setMinimumHeight(resources.getDimensionPixelOffset(R.dimen.add_account_icon_circle_radius));
            this.A0E.setVisibility(8);
            TextView textView = this.A0F;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        C0f9.A09(-985816866, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1463390008);
        super.onPause();
        this.A0A.A02 = null;
        C0f9.A09(-807242883, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-578313496);
        super.onResume();
        if (getRootActivity() != null && getRootActivity().getWindow() != null) {
            getRootActivity().getWindow().setSoftInputMode(16);
        }
        EditText editText = this.A03;
        editText.setSelection(AbstractC167007dF.A0A(AbstractC167007dF.A0g(editText)));
        this.A0A.A02 = this.A0K;
        if (!this.A0H) {
            this.A0H = true;
            this.A03.requestFocus();
            AbstractC13880nE.A0R(this.A03);
        }
        C0f9.A09(2119748687, A02);
    }
}
