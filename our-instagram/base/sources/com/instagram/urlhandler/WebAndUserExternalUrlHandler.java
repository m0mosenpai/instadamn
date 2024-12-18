package com.instagram.urlhandler;

import X.AbstractC111324zv;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC31171DnF;
import X.AbstractC31175DnJ;
import X.AbstractC35275FhA;
import X.AbstractC37492GfA;
import X.AnonymousClass292;
import X.C06090Tz;
import X.C12260kU;
import X.C14360o3;
import X.C14H;
import X.C18U;
import X.C2Fb;
import X.C31374Dqe;
import X.C36012FvA;
import X.C36013FvB;
import X.C455127l;
import X.C461329x;
import X.EnumC456327x;
import X.GIC;
import X.InterfaceC08100bW;
import X.InterfaceC223716s;
import X.InterfaceC37185GZw;
import X.SUK;
import android.net.Uri;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class WebAndUserExternalUrlHandler implements InterfaceC37185GZw {
    public final C36012FvA A00;
    public final GIC A01;
    public final C36013FvB A02;
    public static final Set A05 = AbstractC31171DnF.A0k(Arrays.asList("about", "about-ads", "account", "accounts", "blog", "business", "client_error", "community", "componentexplorer", "developer", "developers", "download", "getapp", "help", "instameets", "invites", "nametag", "press", "research", "security", "support", "terms", "xwoiynko", "accounts_center"));
    public static final Set A06 = AbstractC31171DnF.A0k(Arrays.asList("ads", "android", "dyi", "emails", "enoozer", "internal", "legal", "media", "mixi", "oauth", "threads", "weibo", "aymh", "b"));
    public static final Set A04 = AbstractC31171DnF.A0k(Arrays.asList("donate"));
    public static final Pattern A07 = Pattern.compile("[a-zA-Z0-9_]+(\\.[a-zA-Z0-9_]+)*");
    public static final InterfaceC08100bW A03 = AbstractC31175DnJ.A0B();

    @Override // X.InterfaceC37185GZw
    public final boolean EJT() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0219, code lost:
    
        if ("r".equalsIgnoreCase(r2) == false) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f3  */
    @Override // X.InterfaceC37185GZw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle AFg(X.AbstractC18680vv r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandler.WebAndUserExternalUrlHandler.AFg(X.0vv, java.lang.String):android.os.Bundle");
    }

    @Override // X.InterfaceC37185GZw
    public final void CJ9(Bundle bundle, FragmentActivity fragmentActivity, AbstractC18680vv abstractC18680vv) {
        String str;
        InterfaceC223716s C45;
        Boolean CbU;
        if (abstractC18680vv instanceof UserSession) {
            UserSession userSession = (UserSession) abstractC18680vv;
            if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36328297973431740L) && (C45 = AbstractC166997dE.A0Y(userSession).A03.C45()) != null && (CbU = C45.CbU()) != null && !CbU.booleanValue() && AnonymousClass292.A02(userSession) != null) {
                C455127l A032 = C455127l.A03(userSession);
                EnumC456327x enumC456327x = EnumC456327x.A09;
                C461329x.A08(userSession, "scheduled_break", A032.A0P());
                A032.A0W(fragmentActivity, enumC456327x, null);
                return;
            }
        }
        Uri uri = (Uri) bundle.getParcelable("uri");
        C31374Dqe A00 = AbstractC37492GfA.A00(abstractC18680vv);
        if (uri != null && bundle.getBoolean("should_land_on_web")) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, abstractC18680vv, 36318591347923275L)) {
                C12260kU.A0C(fragmentActivity, C14H.A00().A01(fragmentActivity));
            }
            String string = bundle.getString(AbstractC111324zv.A00(373));
            if (string == null) {
                string = "url_handler";
            }
            if (C18U.A06(c06090Tz, abstractC18680vv, 36318591347726666L)) {
                AbstractC35275FhA.A04(fragmentActivity, abstractC18680vv, C2Fb.A1T, uri.toString(), string);
            } else if (!SUK.A00(fragmentActivity, uri, abstractC18680vv)) {
                AbstractC35275FhA.A02(fragmentActivity, uri, abstractC18680vv, string);
            }
            fragmentActivity.finish();
            A00.A00.A0K("launch_browser", true);
        } else {
            if (uri == null) {
                AbstractC35275FhA.A0A(bundle, fragmentActivity, abstractC18680vv);
                str = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
            } else if (bundle.containsKey("EXTRA_VIDEO_CALL")) {
                this.A02.CJ9(bundle, fragmentActivity, abstractC18680vv);
                str = "video_call";
            } else {
                if (bundle.containsKey("EXTRA_AD_CAMERA")) {
                    this.A00.CJ9(bundle, fragmentActivity, abstractC18680vv);
                    C14360o3.A0B("ad_camera", 1);
                    A00.A00.A0J("destination", "ad_camera");
                    A00.A01();
                }
                if (bundle.containsKey("EXTRA_STORY_CAMERA")) {
                    this.A01.CJ9(bundle, fragmentActivity, abstractC18680vv);
                    C14360o3.A0B("story_camera", 1);
                    A00.A00.A0J("destination", "story_camera");
                    A00.A01();
                }
                if (!bundle.containsKey("InstagramUrlLaunchConstants.EXTRA_USER_NAME") && !bundle.containsKey("InstagramUrlLaunchConstants.EXTRA_USER_ID")) {
                    AbstractC35275FhA.A03(fragmentActivity, bundle);
                } else {
                    AbstractC35275FhA.A0A(bundle, fragmentActivity, abstractC18680vv);
                }
            }
            A00.A00.A0J("destination", str);
        }
        A00.A01();
    }

    public WebAndUserExternalUrlHandler(C36012FvA c36012FvA, GIC gic, C36013FvB c36013FvB) {
        this.A01 = gic;
        this.A02 = c36013FvB;
        this.A00 = c36012FvA;
    }
}
