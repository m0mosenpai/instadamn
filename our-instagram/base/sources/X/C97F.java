package X;

import android.text.SpannableStringBuilder;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteWhatsAppAccountType;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.97F, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C97F {
    public static final A9M A01(C9CN c9cn, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (A9M) ((C97Q) C97M.A00(userSession).A02.getValue()).AuS(c9cn);
    }

    public static final void A03(FragmentActivity fragmentActivity, final InterfaceC25164BBk interfaceC25164BBk, UserSession userSession, String str, String str2) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 3);
        HashMap hashMap = new HashMap();
        hashMap.put("entrypoint", str2);
        hashMap.put("back_stack_tag", str);
        C66277U6x A01 = C66277U6x.A01(AbstractC111324zv.A00(46), hashMap);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
        igBloksScreenConfig.A0U = fragmentActivity.getString(2131977068);
        igBloksScreenConfig.A03 = new C69503VpY() { // from class: X.9fc
            @Override // X.C69503VpY
            public final void A00(UserSession userSession2) {
                InterfaceC25164BBk.this.Czp();
            }
        };
        C72743Nv A02 = W6d.A02(igBloksScreenConfig, A01);
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        c140966Yy.A0A = str;
        c140966Yy.A08();
        c140966Yy.A0D(A02);
        c140966Yy.A04();
    }

    public final SpannableStringBuilder A05(FragmentActivity fragmentActivity, PromoteData promoteData, UserSession userSession) {
        String string;
        C14360o3.A0B(userSession, 2);
        String string2 = fragmentActivity.getString(2131970567);
        C14360o3.A07(string2);
        String string3 = fragmentActivity.getString(2131970574);
        C14360o3.A07(string3);
        if (promoteData.A2Y) {
            string = fragmentActivity.getString(2131970569, string3);
        } else {
            string = fragmentActivity.getString(2131970571);
        }
        C14360o3.A0A(string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (promoteData.A2v) {
            spannableStringBuilder.append((CharSequence) "\n");
            spannableStringBuilder.append((CharSequence) string2);
        }
        if (promoteData.A2p) {
            spannableStringBuilder.append((CharSequence) "\n");
            spannableStringBuilder.append((CharSequence) string);
            if (promoteData.A2Y) {
                A02(spannableStringBuilder, fragmentActivity, userSession, string3, AbstractC111324zv.A00(2464));
            }
        }
        return spannableStringBuilder;
    }

    public final SpannableStringBuilder A06(FragmentActivity fragmentActivity, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        String string = fragmentActivity.getString(2131970506);
        C14360o3.A07(string);
        String string2 = fragmentActivity.getString(2131970505);
        C14360o3.A07(string2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        A02(spannableStringBuilder, fragmentActivity, userSession, string2, "https://www.facebook.com/business/help/128066880933676");
        return spannableStringBuilder;
    }

    public final SpannableStringBuilder A07(FragmentActivity fragmentActivity, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        String string = fragmentActivity.getString(2131970577);
        C14360o3.A07(string);
        String string2 = fragmentActivity.getString(2131970578, string);
        C14360o3.A07(string2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
        A02(spannableStringBuilder, fragmentActivity, userSession, string, "https://www.facebook.com/privacy/policy");
        return spannableStringBuilder;
    }

    public final SpannableStringBuilder A08(FragmentActivity fragmentActivity, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        String string = fragmentActivity.getString(2131970576);
        C14360o3.A07(string);
        String string2 = fragmentActivity.getString(2131970579);
        C14360o3.A07(string2);
        String string3 = fragmentActivity.getString(2131970575, string, string2);
        C14360o3.A07(string3);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string3);
        A02(spannableStringBuilder, fragmentActivity, userSession, string, AbstractC111324zv.A00(119));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        A02(spannableStringBuilder2, fragmentActivity, userSession, string2, "https://www.whatsapp.com/legal/commerce-policy/");
        return spannableStringBuilder2;
    }

    public final void A09(final UserSession userSession, Class cls) {
        C14360o3.A0B(userSession, 0);
        final C9CN A00 = A00(cls);
        ((C97Q) C97M.A00(userSession).A02.getValue()).AV3(A00, C97J.A00, new C97X() { // from class: X.97W
            @Override // X.C97X
            public final void onError(Throwable th) {
            }

            /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
            
                if (r1 == 0) goto L8;
             */
            @Override // X.C97X
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r5) {
                /*
                    r4 = this;
                    X.A9M r5 = (X.A9M) r5
                    r0 = 0
                    X.C14360o3.A0B(r5, r0)
                    X.0cb r0 = X.C17060sy.A01
                    com.instagram.common.session.UserSession r3 = r2
                    com.instagram.user.model.User r2 = r0.A01(r3)
                    X.9Im r1 = r5.A00
                    if (r1 == 0) goto L21
                    X.9CN r0 = r1
                    java.lang.String r0 = r1.A00(r0, r3)
                    if (r0 == 0) goto L21
                    int r1 = r0.length()
                    r0 = 0
                    if (r1 != 0) goto L22
                L21:
                    r0 = 1
                L22:
                    r0 = r0 ^ 1
                    X.17P r1 = r2.A03
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    r1.EhN(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C97W.onSuccess(java.lang.Object):void");
            }
        });
    }

    public static final boolean A04(PromoteData promoteData) {
        UserSession userSession = promoteData.A0y;
        C14360o3.A06(userSession);
        if (C08730cb.A00(userSession).A00().A1a() && PromoteWhatsAppAccountType.A03.equals(promoteData.A0x)) {
            return true;
        }
        return false;
    }

    public static final C9CN A00(Class cls) {
        return new C9CN(CallerContext.A00(cls), "ig_android_whatsapp_asset_ig_to_fb_crossposting", PublicKeyCredentialControllerUtility.JSON_KEY_USER, "correctnessTest", "hasWhatsappNumber");
    }

    public static final void A02(SpannableStringBuilder spannableStringBuilder, FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        AnonymousClass773.A05(spannableStringBuilder, new C33247Elh(fragmentActivity, userSession, str2, fragmentActivity.getColor(AbstractC53242c7.A06(fragmentActivity))), str);
    }
}
