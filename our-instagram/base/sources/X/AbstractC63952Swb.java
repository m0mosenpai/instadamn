package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import com.facebook.browser.iabcontext.IabCommonTrait;
import com.facebook.browser.lite.webview.SystemWebView;
import com.facebook.iabadscontext.IABAdsContext;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.Swb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63952Swb implements InterfaceC65638Tq1 {
    public C62702SMq A00;
    public String A01;
    public final Intent A02;
    public final Bundle A03;
    public final InterfaceC172717mh A04;
    public final InterfaceC172727mi A05;

    public final void A02(Integer num) {
        EnumC61061Rea enumC61061Rea;
        int i;
        EnumC141996bI enumC141996bI;
        String str;
        SDR sdr = ((QEK) this).A00;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                enumC61061Rea = EnumC61061Rea.A03;
            } else {
                enumC61061Rea = EnumC61061Rea.A02;
            }
        } else {
            enumC61061Rea = EnumC61061Rea.A04;
        }
        C3O0 c3o0 = sdr.A01;
        C146106i8 c146106i8 = new C146106i8();
        Context context = sdr.A00;
        boolean z = enumC61061Rea instanceof QEN;
        if (z) {
            i = R.string.res_0x7f13001a_name_removed;
        } else if (enumC61061Rea instanceof QEM) {
            i = R.string.res_0x7f130019_name_removed;
        } else {
            i = R.string.res_0x7f13001b_name_removed;
        }
        c146106i8.A0D = context.getString(i);
        if (z) {
            enumC141996bI = ((QEN) enumC61061Rea).A00;
        } else if (enumC61061Rea instanceof QEM) {
            enumC141996bI = ((QEM) enumC61061Rea).A00;
        } else {
            enumC141996bI = ((QEL) enumC61061Rea).A00;
        }
        c146106i8.A0C(enumC141996bI);
        if (z) {
            str = "bwi_consent_denial";
        } else if (enumC61061Rea instanceof QEM) {
            str = "bwi_auth_flow_success";
        } else {
            str = "bwi_auth_flow_error";
        }
        c146106i8.A0H = str;
        c3o0.A0A(c146106i8.A00());
    }

    @Override // X.InterfaceC65638Tq1
    public final void AQC(QF6 qf6, String str, boolean z) {
    }

    @Override // X.BCM
    public final void DFB(Context context, Intent intent, View view, InterfaceC172717mh interfaceC172717mh, InterfaceC65594Tnc interfaceC65594Tnc, InterfaceC172727mi interfaceC172727mi) {
        C14360o3.A0B(context, 0);
        AbstractC25233BEq.A0w(1, intent, interfaceC172717mh, interfaceC172727mi);
        if (QEK.A01 == null) {
            QEK.A01 = new QEK(context, intent, interfaceC172717mh, interfaceC172727mi);
        }
    }

    @Override // X.InterfaceC65638Tq1
    public final void DXT(QF6 qf6, String str) {
    }

    @Override // X.InterfaceC65638Tq1
    public final void DXd(String str) {
    }

    @Override // X.InterfaceC65638Tq1
    public final boolean Eit(QF6 qf6, Boolean bool, Boolean bool2, String str) {
        return false;
    }

    @Override // X.InterfaceC65638Tq1
    public final void Ej3(QF6 qf6, Boolean bool, Boolean bool2, String str) {
    }

    @Override // X.BCM
    public final void destroy() {
    }

    public static final void A00(AbstractC63952Swb abstractC63952Swb, String str, String str2, String str3) {
        long j;
        Bundle bundle = abstractC63952Swb.A03;
        String string = bundle.getString("ad_id");
        if (string != null) {
            j = Long.parseLong(string);
        } else {
            j = 0;
        }
        String string2 = bundle.getString("iab_session_id");
        String str4 = "";
        if (string2 == null) {
            string2 = "";
        }
        HashMap A1G = AbstractC166987dD.A1G();
        if (str2.length() > 0) {
            A1G.put("pageLoadSource", str2);
        }
        if (str3.length() > 0) {
            A1G.put("pageCloseReason", str3);
        }
        String string3 = bundle.getString("token_source");
        if (string3 != null) {
            str4 = string3;
        }
        A1G.put("tokenSource", str4);
        C63305ShB.A00().A03(j, str, string2, A1G);
    }

    public final void A01() {
        String str;
        C62965SZi c62965SZi = C62965SZi.A04;
        if (c62965SZi != null) {
            String str2 = C62965SZi.A05;
            if (str2 == null || str2.length() == 0) {
                str2 = String.valueOf(c62965SZi.A01.A06);
            }
            QF6 C9a = this.A04.C9a();
            if (C9a != null && str2 != null && str2.length() != 0) {
                ((SystemWebView) C9a).A04.loadUrl(str2);
                String str3 = this.A01;
                if (str3 == null) {
                    C14360o3.A0F("pageReloadReason");
                    throw C00O.createAndThrow();
                }
                if ("new_access_token".equals(str3)) {
                    str = "PAGE_LOAD_AFTER_AUTH_SUCCESS";
                } else {
                    str = "PAGE_LOAD_AFTER_TOKEN_REFRESH";
                }
                A00(this, "PAGE_LOADED", str, "");
            }
        }
    }

    public AbstractC63952Swb(Intent intent, InterfaceC172717mh interfaceC172717mh, InterfaceC172727mi interfaceC172727mi) {
        IABAdsContext iABAdsContext;
        this.A04 = interfaceC172717mh;
        this.A05 = interfaceC172727mi;
        this.A02 = intent;
        IabCommonTrait iabCommonTrait = (IabCommonTrait) intent.getParcelableExtra("EXTRA_IAB_CONTEXT");
        String str = null;
        if (iabCommonTrait != null && (iabCommonTrait instanceof IABAdsContext) && (iABAdsContext = (IABAdsContext) iabCommonTrait) != null) {
            str = iABAdsContext.A0A;
        }
        String stringExtra = intent.getStringExtra("BrowserLiteIntent.IABLoggingExtras.IAB_SESSION_ID");
        Bundle A0b = AbstractC166987dD.A0b();
        if (str != null) {
            A0b.putString("ad_id", str);
        }
        if (stringExtra != null) {
            A0b.putString("iab_session_id", stringExtra);
            A0b.putString("app_session_id", stringExtra);
        }
        A0b.putString(CacheBehaviorLogger.SOURCE, "JS_BRIDGE");
        A0b.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, AbstractC31172DnG.A16(Locale.ROOT, "AD"));
        C62965SZi c62965SZi = C62965SZi.A04;
        if (c62965SZi != null) {
            SFZ sfz = c62965SZi.A02;
            A0b.putLong("expiry_time", sfz.A00);
            A0b.putString("token_source", AbstractC61706RsN.A00(sfz.A01));
        }
        this.A03 = A0b;
    }
}
