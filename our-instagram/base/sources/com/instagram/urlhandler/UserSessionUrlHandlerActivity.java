package com.instagram.urlhandler;

import X.AbstractC12990ll;
import X.AbstractC16960so;
import X.AbstractC18680vv;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.AbstractC37492GfA;
import X.C0f9;
import X.C14360o3;
import X.C26069Bfx;
import X.C35158Ff0;
import android.app.Activity;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.urlhandlers.media.MediaExternalUrlHandlerActivity;

/* loaded from: classes6.dex */
public abstract class UserSessionUrlHandlerActivity extends BaseFragmentActivity {
    public AbstractC18680vv A00;

    public static String A00(Activity activity, C26069Bfx c26069Bfx, UserSession userSession) {
        String stringExtra = activity.getIntent().getStringExtra("component");
        if (AbstractC16960so.A1Q("activity_feed", "push_notification").contains(c26069Bfx.A00)) {
            C35158Ff0.A00(c26069Bfx, userSession, "tap", "deeplink", stringExtra, null);
        }
        return stringExtra;
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(1684039386);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = 1186046370;
        } else {
            AbstractC18680vv A0V = AbstractC31172DnG.A0V(A07);
            this.A00 = A0V;
            if (A0V instanceof UserSession) {
                A0n(bundle, A07, (UserSession) A0V);
            } else {
                if (this instanceof MediaExternalUrlHandlerActivity) {
                    C14360o3.A0B(A0V, 0);
                    A07.putBoolean("ARGUMENT_SHOW_LOGIN_FOR_CONTENT_DIALOG", true);
                    AbstractC37492GfA.A00(A0V).A02("signed out");
                }
                AbstractC35178FfV.A01(this, A07, A0V);
                finish();
            }
            i = 1549420951;
        }
        C0f9.A07(i, A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:1313:0x159a, code lost:
    
        if (r3.length() != 0) goto L917;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0431, code lost:
    
        if (r10 != null) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x05ca, code lost:
    
        if (X.C18U.A06(r6, r32, 36321086723335313L) == false) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:752:0x0d78, code lost:
    
        if (r8 == null) goto L577;
     */
    /* JADX WARN: Code restructure failed: missing block: B:753:0x0d7e, code lost:
    
        if (r23 == null) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:754:0x0d80, code lost:
    
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:755:0x0d82, code lost:
    
        r2 = r13.equalsIgnoreCase("direct-inbox");
        r14 = X.AbstractC166987dD.A0b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:756:0x0d8c, code lost:
    
        if (r2 == false) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:757:0x0d8e, code lost:
    
        r14.putString(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_ID, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:759:0x0d99, code lost:
    
        if ("direct-inbox".equalsIgnoreCase(r9.getHost()) == false) goto L600;
     */
    /* JADX WARN: Code restructure failed: missing block: B:760:0x0d9b, code lost:
    
        r5 = X.AbstractC31173DnH.A09(X.AbstractC31176DnK.A06(r29), r9);
        r5.putExtra("com.instagram.url.extra.IS_ALREADY_HANDLED", true);
        r3 = r14.getString(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_ID);
     */
    /* JADX WARN: Code restructure failed: missing block: B:761:0x0dac, code lost:
    
        if (r3 == null) goto L1098;
     */
    /* JADX WARN: Code restructure failed: missing block: B:763:0x0db2, code lost:
    
        if (X.AbstractC31172DnG.A1Z(r32, r3) != false) goto L1098;
     */
    /* JADX WARN: Code restructure failed: missing block: B:764:0x0db4, code lost:
    
        r4 = X.C0BQ.A00(r32);
        r3 = r4.BOa(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:765:0x0dbc, code lost:
    
        if (r3 == null) goto L1098;
     */
    /* JADX WARN: Code restructure failed: missing block: B:767:0x0dc2, code lost:
    
        if (r4.AGB(r29, r32, r3) == false) goto L1098;
     */
    /* JADX WARN: Code restructure failed: missing block: B:768:0x0dc4, code lost:
    
        r4.E45(r29, r5, r32, r3, "deep_link");
     */
    /* JADX WARN: Code restructure failed: missing block: B:769:0x0dce, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:770:0x1b05, code lost:
    
        X.C12260kU.A0C(r29, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:771:0x0e09, code lost:
    
        r31.putAll(r14);
        r8 = X.C0BQ.A00(r32);
        r12 = r31.getString(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        r11 = r31.getString("sender_id");
        r2 = (android.content.Intent) r31.getParcelable(X.AbstractC111324zv.A00(210));
     */
    /* JADX WARN: Code restructure failed: missing block: B:772:0x0e24, code lost:
    
        if (r2 == null) goto L626;
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x0e26, code lost:
    
        r4 = r2.getExtras();
     */
    /* JADX WARN: Code restructure failed: missing block: B:774:0x0e2a, code lost:
    
        if (r4 == null) goto L626;
     */
    /* JADX WARN: Code restructure failed: missing block: B:775:0x0e2c, code lost:
    
        r23 = r4.getString("source_application");
     */
    /* JADX WARN: Code restructure failed: missing block: B:776:0x0e32, code lost:
    
        r22 = r31.getString(com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
        r21 = r31.getString("scroll_to_message_id");
        r3 = r31.getString(com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
     */
    /* JADX WARN: Code restructure failed: missing block: B:777:0x0e3e, code lost:
    
        if (r3 == null) goto L609;
     */
    /* JADX WARN: Code restructure failed: missing block: B:778:0x0e40, code lost:
    
        r20 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:779:0x0e48, code lost:
    
        if (r3.equals("click_to_direct") == true) goto L610;
     */
    /* JADX WARN: Code restructure failed: missing block: B:780:0x0e4c, code lost:
    
        r13 = r31.getString("ad_id");
        r7 = r31.getString("welcome_message");
        r6 = r31.getStringArrayList("ice_breakers");
        r4 = r9.getQueryParameter("encrypted_fbconsumer_token");
        r19 = false;
        r3 = X.AbstractC16960so.A1Q(r13, r7, r6, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:781:0x0e70, code lost:
    
        if ((r3 instanceof java.util.Collection) == false) goto L620;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x0e76, code lost:
    
        if (r3.isEmpty() == false) goto L620;
     */
    /* JADX WARN: Code restructure failed: missing block: B:784:0x0e78, code lost:
    
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x0e7a, code lost:
    
        r18 = X.C18U.A06(X.C06090Tz.A05, r32, 36325119697629933L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:786:0x0e8b, code lost:
    
        if (X.AbstractC31171DnF.A1W(r32, r11) == false) goto L627;
     */
    /* JADX WARN: Code restructure failed: missing block: B:788:0x0e9b, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r32, 36329680952902126L) == false) goto L627;
     */
    /* JADX WARN: Code restructure failed: missing block: B:789:0x0e9d, code lost:
    
        r2 = X.C36881nl.A01(r29, com.instagram.urlhandlers.direct.DirectUrlHandlerActivity.A00, r32, "ig_ai_business_agent");
        r1 = com.instagram.pendingmedia.model.recipients.PendingRecipient.A0g;
        X.AbstractC31179DnN.A1Q(r2, new com.instagram.user.model.User(r12, ""));
        r2.A0p = r31.getBoolean("ig_messaging_as_bottom_sheet");
     */
    /* JADX WARN: Code restructure failed: missing block: B:790:0x0ece, code lost:
    
        if (r20 != false) goto L636;
     */
    /* JADX WARN: Code restructure failed: missing block: B:791:0x0ed0, code lost:
    
        if (r19 != false) goto L636;
     */
    /* JADX WARN: Code restructure failed: missing block: B:793:0x0ed6, code lost:
    
        if (X.AbstractC31171DnF.A1W(r32, r11) == false) goto L634;
     */
    /* JADX WARN: Code restructure failed: missing block: B:795:0x0ee0, code lost:
    
        if (X.C14360o3.A0K(r23, "com.instagram.barcelona") == false) goto L634;
     */
    /* JADX WARN: Code restructure failed: missing block: B:796:0x0ee2, code lost:
    
        r2 = X.C36881nl.A01(r29, com.instagram.urlhandlers.direct.DirectUrlHandlerActivity.A00, r32, "threads_app_message");
        r1 = com.instagram.pendingmedia.model.recipients.PendingRecipient.A0g;
        X.AbstractC31179DnN.A1Q(r2, new com.instagram.user.model.User(r12, ""));
     */
    /* JADX WARN: Code restructure failed: missing block: B:797:0x0ef6, code lost:
    
        if (r22 == null) goto L1099;
     */
    /* JADX WARN: Code restructure failed: missing block: B:798:0x0ef8, code lost:
    
        r2 = X.C36881nl.A01(r29, com.instagram.urlhandlers.direct.DirectUrlHandlerActivity.A00, r32, "channel_daily_prompt_xma");
        X.AbstractC31179DnN.A1R(r2, r22);
        r2.A0c = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:800:0x1b17, code lost:
    
        if (X.AbstractC001800i.A0u(((X.C17110t6) r8).BOc(null), r11) == false) goto L1112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x1b19, code lost:
    
        r3 = r8.BOa(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:802:0x1b1d, code lost:
    
        if (r3 == null) goto L1411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:804:0x1b23, code lost:
    
        if (r8.AGB(r29, r32, r3) == false) goto L1412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:805:0x1b25, code lost:
    
        r2 = r31.getString("ad_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:806:0x1b2d, code lost:
    
        if (r18 == false) goto L1111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:807:0x1b2f, code lost:
    
        if (r2 == null) goto L1111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:808:0x1b31, code lost:
    
        r2 = X.C14H.A00().A01(r29);
        X.AbstractC34771FTu.A01(r29, r2, r9, r11, "DirectUrlHandler");
     */
    /* JADX WARN: Code restructure failed: missing block: B:809:0x1b3c, code lost:
    
        X.C14360o3.A07(r2);
        r8.E45(r29, getIntent(), r32, r3, "deep_link");
     */
    /* JADX WARN: Code restructure failed: missing block: B:810:0x1b4c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:811:0x1b4d, code lost:
    
        r2 = com.instagram.pendingmedia.model.recipients.PendingRecipient.A0g;
        r2 = X.AbstractC34770FTt.A01(r29, r11, null, null, "DirectUrlHandler", null, X.AbstractC31175DnJ.A0g(new com.instagram.user.model.User(r12, "")));
     */
    /* JADX WARN: Code restructure failed: missing block: B:812:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:813:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:815:0x1b68, code lost:
    
        if (X.AbstractC35181FfY.A02(r32) == false) goto L1140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:816:0x1b6a, code lost:
    
        r31.putBoolean("IS_ADD_ACCOUNT_FLOW", true);
        X.AbstractC35178FfV.A01(r29, r31, r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:817:0x1b72, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:819:0x0f0b, code lost:
    
        r2 = X.C36881nl.A01(r29, com.instagram.urlhandlers.direct.DirectUrlHandlerActivity.A00, r32, "fbapp_direct_link");
        r3 = com.instagram.pendingmedia.model.recipients.PendingRecipient.A0g;
        X.AbstractC31179DnN.A1Q(r2, new com.instagram.user.model.User(r12, ""));
     */
    /* JADX WARN: Code restructure failed: missing block: B:820:0x0f1d, code lost:
    
        if (r20 != false) goto L641;
     */
    /* JADX WARN: Code restructure failed: missing block: B:821:0x0f1f, code lost:
    
        if (r18 == false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:822:0x0f21, code lost:
    
        r3 = 11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:823:0x0f23, code lost:
    
        X.I0W.A00(r32, r13, r4, r3);
        r2.A0L = r7;
        r2.A0i = r6;
        r2.A0q = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:824:0x0f2e, code lost:
    
        r3 = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:825:0x0eb9, code lost:
    
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:827:0x0ec1, code lost:
    
        if (r3.hasNext() == false) goto L1375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:829:0x0ec7, code lost:
    
        if (r3.next() == null) goto L1376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:833:0x0e4a, code lost:
    
        r20 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:834:0x0eca, code lost:
    
        r23 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:835:0x0dcf, code lost:
    
        if (r16 == false) goto L598;
     */
    /* JADX WARN: Code restructure failed: missing block: B:836:0x0dd1, code lost:
    
        r14.putString(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_ID, r8);
        r14.putString("sender_id", r27);
        X.AbstractC31178DnM.A0q(r9, r14, r13);
        r14.putString("ad_id", r21);
        r14.putString("welcome_message", r4);
        r14.putStringArrayList("ice_breakers", r20);
        r14.putString(com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, r19);
        r14.putBoolean("ig_messaging_as_bottom_sheet", r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:837:0x0dfc, code lost:
    
        if (r17 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:838:0x0dfe, code lost:
    
        r14.putString(com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, r23);
        r14.putString("scroll_to_message_id", r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:840:0x0d7c, code lost:
    
        if (r2 != false) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:882:0x0fb5, code lost:
    
        if (X.AbstractC001900j.A0T(r7) != false) goto L677;
     */
    /* JADX WARN: Code restructure failed: missing block: B:927:0x0fd1, code lost:
    
        if (r11 != false) goto L688;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:1185:0x1951. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1190:0x1978  */
    /* JADX WARN: Removed duplicated region for block: B:1193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x1ebd  */
    /* JADX WARN: Type inference failed for: r2v225, types: [android.content.Context, com.instagram.urlhandlers.brandedcontentad.BrandedContentAdUrlHandlerActivity, androidx.fragment.app.FragmentActivity] */
    /* JADX WARN: Type inference failed for: r2v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v33, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r2v367, types: [android.content.Context, com.instagram.urlhandlers.crossapptagging.XATUrlHandlerActivity, android.app.Activity, com.instagram.urlhandler.UserSessionUrlHandlerActivity, androidx.fragment.app.FragmentActivity] */
    /* JADX WARN: Type inference failed for: r2v501, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r2v503, types: [com.instagram.urlhandlers.directpollmessage.DirectPollMessageUrlHandlerActivity] */
    /* JADX WARN: Type inference failed for: r2v559, types: [android.content.Context, com.instagram.urlhandlers.fbstorytagnotifications.FbStoryTagNotificationsUrlHandlerActivity, android.app.Activity, com.instagram.urlhandler.UserSessionUrlHandlerActivity, androidx.fragment.app.FragmentActivity] */
    /* JADX WARN: Type inference failed for: r2v712, types: [android.content.Context, com.instagram.urlhandlers.stories.StoriesUrlHandlerActivity, androidx.fragment.app.FragmentActivity] */
    /* JADX WARN: Type inference failed for: r3v233, types: [com.instagram.urlhandlers.security.SecurityUrlHandlerActivity, androidx.fragment.app.FragmentActivity] */
    /* JADX WARN: Type inference failed for: r4v112, types: [com.instagram.urlhandlers.securityalerts.SecurityAlertsUrlHandlerActivity, androidx.fragment.app.FragmentActivity] */
    /* JADX WARN: Type inference failed for: r4v118, types: [com.instagram.urlhandlers.sharecollections.ShareCollectionsUrlHandlerActivity, androidx.fragment.app.FragmentActivity] */
    /* JADX WARN: Type inference failed for: r6v72, types: [android.content.Context, com.instagram.urlhandlers.settings.SettingsUrlHandlerActivity, androidx.fragment.app.FragmentActivity] */
    /* JADX WARN: Type inference failed for: r8v13, types: [X.FOi, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0n(android.os.Bundle r30, android.os.Bundle r31, com.instagram.common.session.UserSession r32) {
        /*
            Method dump skipped, instructions count: 8528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandler.UserSessionUrlHandlerActivity.A0n(android.os.Bundle, android.os.Bundle, com.instagram.common.session.UserSession):void");
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
