package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes10.dex */
public final class Rb5 extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "EditAutofillEntryFragment";
    public Intent A00;
    public ScrollView A01;
    public C62708SMw A02;
    public SpinnerImageView A03;
    public AutofillData A04;
    public boolean A05;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);

    public static boolean A03(Map map) {
        if (Collections.unmodifiableMap(map).size() != 1 || !Collections.unmodifiableMap(map).containsKey(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131956658);
        interfaceC56362iU.AAF(new ViewOnClickListenerC63509Soc(25, this, interfaceC56362iU), 2131972699);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "autofill_entry_edit";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0021. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.Rb5 r8) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Rb5.A01(X.Rb5):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    public static final void A00(Rb5 rb5) {
        rb5.requireContext();
        rb5.A06.getValue();
        Bundle bundle = rb5.mArguments;
        String str = "initialAutofillData";
        if (bundle != null && "multiple_contact_info_fragment".equals(bundle.getString("BrowserLiteIntent.EXTRA_AUTOFILL_EDIT_AUTOFILL_ENTRY_REQUEST_SOURCE"))) {
            AutofillData autofillData = rb5.A04;
            if (autofillData != null) {
                Map map = autofillData.A00;
                String A1A = AbstractC166987dD.A1A(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Collections.unmodifiableMap(map));
                if (A1A != null) {
                    C20J.A00().edit().remove(A1A).apply();
                }
                UserSession userSession = C20J.A03;
                if (userSession != null) {
                    try {
                        Object obj = map.get(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        if (obj == null) {
                            C0w9.A03("AutofillGraphQLRequest", "Error creating delete autofill request for multiple entries");
                            return;
                        }
                        C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, obj, "ent_id");
                        C2JM A0b = AbstractC25225BEi.A0b();
                        AbstractC31173DnH.A1M(A0T, A0b.A00, "request");
                        Sg3.A02(Sg3.A00(new C907442n(A0b, QHO.class, "IABAutofillDeleteDataMultiEntries", true), userSession));
                        return;
                    } catch (IOException e) {
                        C0w9.A06("AutofillGraphQLRequest", "Error creating delete autofill request", e);
                        return;
                    }
                }
                str = "userSession";
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        if (rb5.A04 != null) {
            AbstractC58320PtC.A1E(C20J.A00());
            UserSession userSession2 = C20J.A03;
            if (userSession2 != null) {
                try {
                    C04060Jx c04060Jx = GraphQlCallInput.A02;
                    C0CA A0T2 = AbstractC25227BEk.A0T(c04060Jx, "", "sensitive_string_value");
                    C0CA A02 = c04060Jx.A02();
                    A02.A0E(A0T2, "access_token");
                    C2JM A0b2 = AbstractC25225BEi.A0b();
                    AbstractC31173DnH.A1M(A02, A0b2.A00, "request");
                    Sg3.A02(Sg3.A00(new C907442n(A0b2, QHP.class, "IABAutofillDeleteData", true), userSession2));
                } catch (IOException e2) {
                    C0w9.A06("AutofillGraphQLRequest", "Error creating delete autofill request", e2);
                }
                A02(rb5, "DELETED_AUTOFILL");
                Intent intent = rb5.A00;
                if (intent == null) {
                    str = "resultIntent";
                } else {
                    C14360o3.A0A(intent.putStringArrayListExtra("BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS", C20J.A02()));
                    return;
                }
            }
            str = "userSession";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A02(Rb5 rb5, String str) {
        if (rb5.requireArguments().getBoolean("Tracking.ENABLED", true)) {
            C82713mZ c82713mZ = new C82713mZ(rb5, "iab_autofill_interaction");
            c82713mZ.A4P = str;
            c82713mZ.A7T = "CONTACT_AUTOFILL";
            AbstractC31173DnH.A1S(c82713mZ.A00(), AbstractC166987dD.A0o(rb5.A06));
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0026. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            r0 = -838690933(0xffffffffce02978b, float:-5.477424E8)
            int r2 = X.C0f9.A02(r0)
            androidx.fragment.app.FragmentActivity r0 = r5.requireActivity()
            android.view.Window r1 = r0.getWindow()
            if (r1 == 0) goto Lcc
            r0 = 16
            r1.setSoftInputMode(r0)
            android.os.Bundle r4 = r5.mArguments
            if (r4 == 0) goto Lc5
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_EDIT_AUTOFILL_ENTRY_REQUEST_SOURCE"
            java.lang.String r1 = r4.getString(r0)
            if (r1 == 0) goto Lbe
            int r0 = r1.hashCode()
            switch(r0) {
                case -1312919206: goto L54;
                case -1213125907: goto L57;
                case -816846443: goto L5a;
                case -314094605: goto L5d;
                case -108875093: goto L85;
                default: goto L29;
            }
        L29:
            X.0sk r1 = X.AbstractC06930Yk.A0E()
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = new com.facebook.browser.lite.extensions.autofill.model.AutofillData
            r0.<init>(r1)
            r5.A04 = r0
        L34:
            android.content.Intent r1 = X.AbstractC31171DnF.A04()
            r5.A00 = r1
            android.os.Bundle r0 = r5.requireArguments()
            r1.putExtras(r0)
            androidx.fragment.app.FragmentActivity r3 = r5.requireActivity()
            r1 = -1
            android.content.Intent r0 = r5.A00
            if (r0 != 0) goto La4
            java.lang.String r0 = "resultIntent"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L54:
            java.lang.String r0 = "account_settings_fragment"
            goto L87
        L57:
            java.lang.String r0 = "autofill_request_fragment"
            goto L5f
        L5a:
            java.lang.String r0 = "browser_settings_fragment"
            goto L5f
        L5d:
            java.lang.String r0 = "multiple_contact_info_fragment"
        L5f:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L29
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS"
            java.util.ArrayList r3 = r4.getStringArrayList(r0)
            if (r3 == 0) goto L29
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L29
            r1 = -1
            r0 = 688(0x2b0, float:9.64E-43)
            java.lang.String r0 = X.MSV.A00(r0)
            int r0 = r4.getInt(r0, r1)
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L93
        L85:
            java.lang.String r0 = "save_autofill_request_fragment"
        L87:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L29
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRING"
            java.lang.String r0 = r4.getString(r0)
        L93:
            if (r0 == 0) goto L29
            org.json.JSONObject r1 = X.AbstractC58318PtA.A17(r0)     // Catch: org.json.JSONException -> Lb1
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = new com.facebook.browser.lite.extensions.autofill.model.AutofillData     // Catch: org.json.JSONException -> Lb1
            r0.<init>(r1)     // Catch: org.json.JSONException -> Lb1
            r5.A04 = r0     // Catch: org.json.JSONException -> Lb1
            r0 = 1
            r5.A05 = r0     // Catch: org.json.JSONException -> Lb1
            goto L34
        La4:
            r3.setResult(r1, r0)
            super.onCreate(r6)
            r0 = 1980190961(0x760750f1, float:6.861345E32)
            X.C0f9.A09(r0, r2)
            return
        Lb1:
            java.lang.String r0 = "Illegal JSON for autofill save"
            java.lang.IllegalStateException r1 = X.AbstractC166987dD.A14(r0)
            r0 = -1015802979(0xffffffffc374139d, float:-244.07661)
            X.C0f9.A09(r0, r2)
            throw r1
        Lbe:
            java.lang.String r0 = "No source request fragment provided"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        Lc5:
            java.lang.String r0 = "No arguments provided"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        Lcc:
            java.lang.IllegalStateException r1 = X.AbstractC166997dE.A0g()
            r0 = -607710999(0xffffffffdbc710e9, float:-1.1206423E17)
            X.C0f9.A09(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Rb5.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1565316010);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_edit_autofill_entry, viewGroup, false);
        this.A03 = (SpinnerImageView) inflate.requireViewById(R.id.loading_spinner);
        this.A01 = (ScrollView) inflate.requireViewById(R.id.scrollView);
        this.A02 = new C62708SMw(requireContext(), inflate);
        String string = requireArguments().getString("BrowserLiteIntent.EXTRA_AUTOFILL_EDIT_AUTOFILL_ENTRY_REQUEST_SOURCE");
        if (string != null && !string.equals("save_autofill_request_fragment")) {
            View A0R = AbstractC166997dE.A0R(inflate, R.id.delete_button);
            TextView A0N = AbstractC167007dF.A0N(inflate, R.id.autofill_fbpay_disclosure);
            AbstractC25227BEk.A11(A0N);
            if (this.A05) {
                InterfaceC09390do interfaceC09390do = this.A06;
                if (C18U.A06(C06090Tz.A06, AbstractC166987dD.A0o(interfaceC09390do), 36322800422234771L)) {
                    C23031Ai A00 = AbstractC23021Ah.A00((UserSession) interfaceC09390do.getValue());
                    IgdsListCell igdsListCell = (IgdsListCell) AbstractC166997dE.A0R(inflate, R.id.automatic_autofill_consent);
                    igdsListCell.A0G(EnumC53237Nga.A08, true);
                    igdsListCell.setTitleTextSize(45.0f);
                    InterfaceC19630xq interfaceC19630xq = A00.A01;
                    if (interfaceC19630xq.getBoolean("contact_autofill_eligible_for_automatic_autofill", false)) {
                        igdsListCell.setChecked(true);
                        long j = interfaceC19630xq.getLong("contact_autofill_automatic_autofill_expiry_timestamp", 0L);
                        Locale locale = Locale.getDefault();
                        C14360o3.A07(locale);
                        String format = new SimpleDateFormat("MM/dd/yyyy, hh:mm a", locale).format(new Date(j));
                        C14360o3.A07(format);
                        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(getString(2131956644), format);
                        C14360o3.A07(formatStrLocaleSafe);
                        igdsListCell.A0H(formatStrLocaleSafe);
                    } else {
                        igdsListCell.setChecked(false);
                    }
                    igdsListCell.A0D(new C55518OlC(0, igdsListCell, this));
                    igdsListCell.setVisibility(0);
                }
                A0R.setVisibility(0);
                int i = 2131953417;
                if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36310426616397899L)) {
                    i = 2131953418;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AbstractC25227BEk.A0v(this, i));
                AnonymousClass773.A04(spannableStringBuilder, new Em1(this, requireContext().getColor(AbstractC53242c7.A0C(requireContext()))), AbstractC25227BEk.A0v(this, 2131953419));
                A0N.setText(spannableStringBuilder);
                A0N.setVisibility(0);
            }
            TextView A0N2 = AbstractC167007dF.A0N(inflate, R.id.contact_info_management_disclosure);
            AbstractC25227BEk.A11(A0N2);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(AbstractC25227BEk.A0v(this, 2131956659));
            AnonymousClass773.A04(spannableStringBuilder2, new NY0(this, requireContext().getColor(AbstractC53242c7.A0C(requireContext()))), AbstractC25227BEk.A0v(this, 2131969263));
            A0N2.setText(spannableStringBuilder2);
            ViewOnClickListenerC63508Sob.A01(inflate.requireViewById(R.id.delete_button), 62, this);
        }
        C0f9.A09(406844832, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1250906962);
        super.onPause();
        C62708SMw c62708SMw = this.A02;
        if (c62708SMw == null) {
            C14360o3.A0F("holder");
            throw C00O.createAndThrow();
        }
        this.A04 = c62708SMw.A00();
        C0f9.A09(-2046599562, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        int A02 = C0f9.A02(-1910992425);
        super.onResume();
        C62708SMw c62708SMw = this.A02;
        if (c62708SMw == null) {
            str = "holder";
        } else {
            AutofillData autofillData = this.A04;
            if (autofillData == null) {
                str = "initialAutofillData";
            } else {
                Map A12 = AbstractC58318PtA.A12(autofillData.A00);
                c62708SMw.A07.setText(AbstractC58323PtF.A0r("given-name", A12));
                c62708SMw.A06.setText(AbstractC58323PtF.A0r("family-name", A12));
                c62708SMw.A03.setText(AbstractC58323PtF.A0r("address-line1", A12));
                c62708SMw.A04.setText(AbstractC58323PtF.A0r("address-line2", A12));
                c62708SMw.A01.setText(AbstractC58323PtF.A0r("address-level1", A12));
                c62708SMw.A02.setText(AbstractC58323PtF.A0r("address-level2", A12));
                c62708SMw.A08.setText(AbstractC58323PtF.A0r("postal-code", A12));
                c62708SMw.A05.setText(AbstractC58323PtF.A0r("email", A12));
                c62708SMw.A09.setText(AbstractC58323PtF.A0r("tel", A12));
                c62708SMw.A00 = AbstractC166987dD.A1A(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A12);
                C0f9.A09(890571022, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
