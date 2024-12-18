package X;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.webkit.WebView;
import androidx.biometric.FingerprintDialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.webview.SystemWebView;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.smartcapture.logging.CancelReason;
import com.facebook.smartcapture.view.IdCaptureBaseActivity;
import com.fbpay.hub.form.params.FormLogEvents;
import com.fbpay.hub.form.params.FormParams;
import com.instagram.business.instantexperiences.ui.InstantExperiencesBrowserChrome;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.LinkedHashMap;

/* renamed from: X.Sjy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class DialogInterfaceOnClickListenerC63420Sjy implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;

    public DialogInterfaceOnClickListenerC63420Sjy(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        FormLogEvents formLogEvents;
        Q8J A00;
        C58252li c58252li;
        int i2;
        REH reh;
        String str;
        FormLogEvents formLogEvents2;
        LinkedHashMap A08;
        C2GC c2gc;
        String str2;
        CharSequence[] menuOptions;
        int i3;
        switch (this.A00) {
            case 0:
                ((FingerprintDialogFragment) this.A01).A04.A04(true);
                return;
            case 1:
                C62956SYy c62956SYy = (C62956SYy) this.A01;
                InterfaceC172717mh interfaceC172717mh = c62956SYy.A04;
                AbstractC10360h2 childFragmentManager = interfaceC172717mh.getChildFragmentManager();
                childFragmentManager.getClass();
                childFragmentManager.A0b();
                interfaceC172717mh.Eg2(0);
                SDS sds = c62956SYy.A03;
                ((SystemWebView) sds.A01).A04.loadUrl(c62956SYy.A02);
                sds.A00.A00 = true;
                InterfaceC65562Tmi interfaceC65562Tmi = c62956SYy.A01;
                if (interfaceC65562Tmi != null) {
                    interfaceC65562Tmi.CmY(c62956SYy.A02);
                }
                C62956SYy.A00(c62956SYy);
                return;
            case 2:
                C58756Q7k c58756Q7k = (C58756Q7k) this.A01;
                BrowserLiteFragment browserLiteFragment = c58756Q7k.A00;
                if (browserLiteFragment != null && c58756Q7k.isResumed()) {
                    QF6 C9a = browserLiteFragment.C9a();
                    if (C9a == null) {
                        return;
                    }
                    boolean booleanExtra = browserLiteFragment.getIntent().getBooleanExtra("BrowserLiteIntent.InstagramExtras.EXTRA_SSL_ERROR_DIALOG_GO_BACK_FIX_ENABLED", false);
                    if (browserLiteFragment.A1O.size() != 1) {
                        return;
                    }
                    if (C9a.A01().A01.size() != 0 && (!booleanExtra || (str = browserLiteFragment.A0m) == null || !str.startsWith("https://l.instagram.com") || C9a.A01().A01.size() != 1)) {
                        return;
                    }
                    c58756Q7k.A00.AIE(2, null);
                    return;
                }
                dialogInterface.cancel();
                return;
            case 3:
                ((XQ3) this.A01).A07.A02("android.permission.CAMERA");
                return;
            case 4:
                Intent A0E = AbstractC58318PtA.A0E("android.settings.APPLICATION_DETAILS_SETTINGS");
                XQ3 xq3 = (XQ3) this.A01;
                A0E.setData(android.net.Uri.fromParts("package", xq3.requireContext().getPackageName(), null));
                xq3.startActivity(A0E);
                xq3.A04 = false;
                return;
            case 5:
                Activity activity = (Activity) this.A01;
                if (activity != null) {
                    activity.finish();
                }
                if (dialogInterface == null) {
                    return;
                }
                dialogInterface.dismiss();
                return;
            case 6:
                IdCaptureBaseActivity idCaptureBaseActivity = (IdCaptureBaseActivity) this.A01;
                idCaptureBaseActivity.setResult(0);
                idCaptureBaseActivity.finish();
                idCaptureBaseActivity.A02().logFlowCancel(CancelReason.PHOTO_SAVE_FAILURE);
                return;
            case 7:
            case 8:
            case Process.SIGTERM /* 15 */:
            default:
                dialogInterface.dismiss();
                return;
            case 9:
                Q8b q8b = (Q8b) this.A01;
                FormParams formParams = q8b.A01;
                if (formParams.A00 == null || (formLogEvents2 = formParams.A02) == null) {
                    return;
                }
                AbstractC58323PtF.A1J(q8b, formLogEvents2.A01);
                return;
            case 10:
                Q8b q8b2 = (Q8b) this.A01;
                FormParams formParams2 = q8b2.A01;
                if (formParams2.A00 != null && (formLogEvents = formParams2.A02) != null) {
                    AbstractC58323PtF.A1J(q8b2, formLogEvents.A02);
                }
                q8b2.A06.A0B(1);
                return;
            case 11:
                REH reh2 = (REH) ((ViewOnClickListenerC63508Sob) this.A01).A01;
                A08 = AbstractC58442PvL.A08(reh2.A01);
                AbstractC58320PtC.A1Q(reh2.A02.A00, A08);
                c2gc = reh2.A04;
                str2 = "fbpay_remove_paypal_cancel";
                c2gc.Chz(str2, A08);
                dialogInterface.dismiss();
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                REH reh3 = (REH) ((ViewOnClickListenerC63508Sob) this.A01).A01;
                LinkedHashMap A082 = AbstractC58442PvL.A08(reh3.A01);
                AbstractC58320PtC.A1Q(reh3.A02.A00, A082);
                reh3.A04.Chz("fbpay_remove_paypal_save", A082);
                SMF smf = reh3.A05;
                A00 = REU.A00(new C63546SpE(reh3.A02.A02, smf, 2), smf.A00);
                reh3.A00 = A00;
                c58252li = ((Q8X) reh3).A03;
                i2 = 18;
                reh = reh3;
                C63627SqZ.A02(A00, c58252li, reh, i2);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                REM rem = (REM) ((ViewOnClickListenerC63508Sob) this.A01).A01;
                A08 = AbstractC58442PvL.A08(rem.A01);
                A08.put("target_name", "remove_shoppay_cancel");
                REM.A01(rem, A08);
                c2gc = rem.A06;
                str2 = "user_remove_credential_exit";
                c2gc.Chz(str2, A08);
                dialogInterface.dismiss();
                return;
            case 14:
                REM rem2 = (REM) ((ViewOnClickListenerC63508Sob) this.A01).A01;
                LinkedHashMap A083 = AbstractC58442PvL.A08(rem2.A01);
                A083.put("target_name", "remove_shoppay_save");
                REM.A01(rem2, A083);
                rem2.A06.Chz("user_remove_credential_submit", A083);
                SMF smf2 = rem2.A07;
                String str3 = rem2.A02.A00;
                String A002 = rem2.A01.A00();
                A002.getClass();
                A00 = REU.A00(new C63549SpH(smf2, str3, A002, 0), smf2.A00);
                c58252li = ((Q8X) rem2).A03;
                i2 = 22;
                reh = rem2;
                C63627SqZ.A02(A00, c58252li, reh, i2);
                return;
            case 16:
                Rb5 rb5 = (Rb5) this.A01;
                Rb5.A00(rb5);
                FragmentActivity requireActivity = rb5.requireActivity();
                Intent intent = rb5.A00;
                if (intent == null) {
                    C14360o3.A0F("resultIntent");
                    throw C00O.createAndThrow();
                }
                requireActivity.setResult(-1, intent);
                AbstractC25226BEj.A1Q(rb5);
                return;
            case 17:
                InstantExperiencesBrowserChrome instantExperiencesBrowserChrome = (InstantExperiencesBrowserChrome) this.A01;
                menuOptions = instantExperiencesBrowserChrome.getMenuOptions();
                CharSequence charSequence = menuOptions[i];
                Context context = instantExperiencesBrowserChrome.getContext();
                if (charSequence.equals(context.getString(2131964564))) {
                    InterfaceC19630xq A0x = AbstractC166987dD.A0x(instantExperiencesBrowserChrome.A09);
                    InterfaceC19610xo ARD = A0x.ARD();
                    ARD.EEj("ix_autofill_name");
                    ARD.apply();
                    InterfaceC19610xo ARD2 = A0x.ARD();
                    ARD2.EEj("ix_autofill_phone");
                    ARD2.apply();
                    InterfaceC19610xo ARD3 = A0x.ARD();
                    ARD3.EEj("ix_autofill_address");
                    ARD3.apply();
                    InterfaceC19610xo ARD4 = A0x.ARD();
                    ARD4.EEj("ix_autofill_email");
                    ARD4.apply();
                    i3 = 2131964563;
                } else {
                    if (menuOptions[i].equals(context.getString(2131964569))) {
                        ((WebView) instantExperiencesBrowserChrome.A08.A0D.peek()).reload();
                        return;
                    }
                    if (menuOptions[i].equals(context.getString(2131964565))) {
                        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Instant Experiences Link URL", C63283Sgi.A01(instantExperiencesBrowserChrome)));
                        i3 = 2131964567;
                    } else {
                        if (!menuOptions[i].equals(context.getString(2131964568))) {
                            return;
                        }
                        Intent A04 = AbstractC31171DnF.A04();
                        A04.setAction("android.intent.action.VIEW");
                        if (instantExperiencesBrowserChrome.A08.A0D.peek() != null && C63283Sgi.A01(instantExperiencesBrowserChrome) != null) {
                            A04.setData(AbstractC08820cl.A03(C63283Sgi.A01(instantExperiencesBrowserChrome)));
                        }
                        C0b3.A00().A0A().A0G(instantExperiencesBrowserChrome.A00, A04);
                        return;
                    }
                }
                C9GR.A07(context, i3);
                return;
        }
    }
}
