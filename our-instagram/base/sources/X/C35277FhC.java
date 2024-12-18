package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceEventType;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.comments.model.ChannelRepliesNotifData;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.model.mediatype.ProductType;
import com.instagram.newsfeed.fragment.NewsfeedFragment;
import java.util.Arrays;

/* renamed from: X.FhC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35277FhC {
    public static C35277FhC A1m;
    public static final java.util.Set A1n = AbstractC31171DnF.A0k(Arrays.asList("story_fullscreen", "userid", "peoplefeed", "barcelona_bottom_sheet"));
    public final C34558FKs A00;
    public final C34558FKs A01;
    public final C34558FKs A02;
    public final C34558FKs A03;
    public final C34558FKs A04;
    public final C34558FKs A05;
    public final C34558FKs A06;
    public final C34558FKs A07;
    public final C34558FKs A08;
    public final C34558FKs A09;
    public final C34558FKs A0A;
    public final C34558FKs A0B;
    public final C34558FKs A0C;
    public final C34558FKs A0D;
    public final C34558FKs A0E;
    public final C34558FKs A0F;
    public final C34558FKs A0G;
    public final C34558FKs A0H;
    public final C34558FKs A0I;
    public final C34558FKs A0J;
    public final C34558FKs A0K;
    public final C34558FKs A0L;
    public final C34558FKs A0M;
    public final C34558FKs A0N;
    public final C34558FKs A0O;
    public final C34558FKs A0P;
    public final C34558FKs A0Q;
    public final C34558FKs A0R;
    public final C34558FKs A0S;
    public final C34558FKs A0T;
    public final C34558FKs A0U;
    public final C34558FKs A0V;
    public final C34558FKs A0W;
    public final C34558FKs A0X;
    public final C34558FKs A0Y;
    public final C34558FKs A0Z;
    public final C34558FKs A0a;
    public final C34558FKs A0b;
    public final C34558FKs A0c;
    public final C34558FKs A0d;
    public final C34558FKs A0e;
    public final C34558FKs A0f;
    public final C34558FKs A0g;
    public final C34558FKs A0h;
    public final C34558FKs A0i;
    public final C34558FKs A0j;
    public final C34558FKs A0k;
    public final C34558FKs A0l;
    public final C34558FKs A0m;

    @Deprecated
    public final C34558FKs A0n;
    public final C34558FKs A0o;
    public final C34558FKs A0p;
    public final C34558FKs A0q;
    public final C34558FKs A0r;
    public final C34558FKs A0s;
    public final C34558FKs A0t;
    public final C34558FKs A0u;
    public final C34558FKs A0v;
    public final C34558FKs A0w;
    public final C34558FKs A0x;
    public final C34558FKs A0y;
    public final C34558FKs A0z;
    public final C34558FKs A10;
    public final C34558FKs A11;
    public final C34558FKs A12;
    public final C34558FKs A13;
    public final C34558FKs A14;
    public final C34558FKs A15;
    public final C34558FKs A16;
    public final C34558FKs A17;
    public final C34558FKs A18;
    public final C34558FKs A19;
    public final C34558FKs A1A;
    public final C34558FKs A1B;
    public final C34558FKs A1C;
    public final C34558FKs A1D;
    public final C34558FKs A1E;
    public final C34558FKs A1F;
    public final C34558FKs A1G;
    public final C34558FKs A1H;
    public final C34558FKs A1I;
    public final C34558FKs A1J;
    public final C34558FKs A1K;
    public final C34558FKs A1L;
    public final C34558FKs A1M;
    public final C34558FKs A1N;
    public final C34558FKs A1O;
    public final C34558FKs A1P;
    public final C34558FKs A1Q;
    public final C34558FKs A1R;
    public final C34558FKs A1S;
    public final C34558FKs A1T;
    public final C34558FKs A1U;
    public final C34558FKs A1V;
    public final C34558FKs A1W;
    public final C34558FKs A1X;
    public final C34558FKs A1Y;
    public final C34558FKs A1Z;
    public final C34558FKs A1a;
    public final C34558FKs A1b;
    public final C34558FKs A1c;
    public final C34558FKs A1d;
    public final C34558FKs A1e;
    public final C34558FKs A1f;
    public final C34558FKs A1g;
    public final C34558FKs A1h;
    public final C34558FKs A1i;
    public final C34558FKs A1j;
    public final C34558FKs A1k;
    public final C34558FKs A1l;

    public C35277FhC() {
        C34558FKs A04;
        C34558FKs A03 = A03(this, 36);
        A0I(this, A03, 18);
        this.A01 = A03;
        C34558FKs A01 = A01(15);
        A0I(this, A01, 0);
        this.A0x = A01;
        C34558FKs A032 = A03(this, 53);
        A0I(this, A032, 27);
        this.A1g = A032;
        C34558FKs A033 = A03(this, 65);
        A0I(this, A033, 34);
        this.A1h = A033;
        C34558FKs c34558FKs = new C34558FKs(new C36533G9f(this, 6));
        A0I(this, c34558FKs, 38);
        this.A1i = c34558FKs;
        this.A00 = A06(this, 9, 6);
        C34558FKs A012 = A01(8);
        A012.A00 = new C31201Dnk(4);
        this.A0Y = A012;
        C34558FKs A013 = A01(20);
        A013.A00 = new C31201Dnk(12);
        this.A0P = A013;
        C34558FKs A014 = A01(26);
        A014.A00 = new C31201Dnk(13);
        this.A0O = A014;
        C34558FKs A015 = A01(27);
        A015.A00 = new InterfaceC37131GXs() { // from class: X.G9b
            @Override // X.InterfaceC37131GXs
            public final boolean AQB(Bundle bundle, BaseFragmentActivity baseFragmentActivity, UserSession userSession) {
                C35277FhC.A0F(bundle, baseFragmentActivity, ClipsViewerSource.A0G, userSession, baseFragmentActivity.getString(2131955393), false);
                return true;
            }
        };
        this.A0M = A015;
        C34558FKs A016 = A01(22);
        A016.A00 = new C31201Dnk(14);
        this.A08 = A016;
        this.A0n = A02(28, 15);
        this.A0p = A04(this, 25, 12);
        this.A0v = A04(this, 27, 15);
        C34558FKs A034 = A03(this, 28);
        A0I(this, A034, 16);
        this.A17 = A034;
        C34558FKs A035 = A03(this, 29);
        A0I(this, A035, 17);
        this.A1d = A035;
        C34558FKs A036 = A03(this, 30);
        A0I(this, A036, 19);
        this.A0w = A036;
        this.A05 = A04(this, 31, 20);
        C34558FKs A037 = A03(this, 32);
        A037.A01 = new C36532G9e(this, false);
        this.A1X = A037;
        C34558FKs A038 = A03(this, 33);
        A038.A01 = new C36532G9e(this, false);
        this.A1W = A038;
        C34558FKs A039 = A03(this, 34);
        A039.A01 = new C36532G9e(this, false);
        this.A1Z = A039;
        C34558FKs A0310 = A03(this, 35);
        A0I(this, A0310, 21);
        this.A0h = A0310;
        this.A0I = A03(this, 37);
        this.A0H = A04(this, 38, 22);
        C34558FKs A0311 = A03(this, 39);
        A0I(this, A0311, 23);
        this.A0F = A0311;
        C34558FKs A0312 = A03(this, 40);
        A0I(this, A0312, 24);
        this.A0t = A0312;
        this.A0u = A01(29);
        this.A0E = A04(this, 41, 25);
        this.A0G = A04(this, 42, 26);
        this.A0J = A06(this, 43, 16);
        this.A1J = A06(this, 44, 17);
        this.A1K = A06(this, 45, 18);
        this.A0e = A03(this, 46);
        this.A1Q = A03(this, 47);
        this.A11 = A04(this, 48, 28);
        this.A1A = A03(this, 49);
        this.A1B = A04(this, 50, 29);
        this.A0L = A06(this, 51, 19);
        this.A1C = A04(this, 52, 30);
        this.A10 = A06(this, 54, 20);
        this.A1N = A02(30, 0);
        C34558FKs A017 = A01(0);
        A017.A00 = new C31201Dnk(1);
        this.A0y = A017;
        C34558FKs A018 = A01(1);
        A018.A01 = new C36531G9d(0);
        this.A03 = A018;
        C34558FKs A019 = A01(2);
        A019.A01 = new InterfaceC37132GXt() { // from class: X.G9c
            @Override // X.InterfaceC37132GXt
            public final void E4C(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession) {
                String A0R;
                android.net.Uri A0313 = AbstractC08820cl.A03(bundle.getString("uri_string"));
                C14360o3.A0B(A0313, 0);
                String queryParameter = A0313.getQueryParameter("media_id");
                String queryParameter2 = A0313.getQueryParameter("product_type");
                String queryParameter3 = A0313.getQueryParameter("achievement_id");
                String A12 = AbstractC31172DnG.A12(A0313);
                if (queryParameter != null && queryParameter2 != null && queryParameter3 != null) {
                    if (!queryParameter2.equals(ProductType.FEED.A00) && !queryParameter2.equals(ProductType.FEED_CAROUSEL.A00)) {
                        if (queryParameter2.equals(ProductType.CLIPS.A00)) {
                            if (!fragmentActivity.getSupportFragmentManager().A11()) {
                                C35227FgK.A00.A03(fragmentActivity, userSession, queryParameter);
                            } else {
                                A0R = "Cannot launch Reels viewer";
                            }
                        } else if (queryParameter2.equals(ProductType.STORY.A00)) {
                            String queryParameter4 = A0313.getQueryParameter(MSV.A00(270));
                            if (queryParameter4 == null) {
                                A0R = "Deeplink missing: story_reel_id";
                            } else {
                                C35227FgK.A00.A04(fragmentActivity, userSession, queryParameter4, queryParameter, A12, AbstractC166987dD.A1J(queryParameter3));
                                return;
                            }
                        } else {
                            A0R = AnonymousClass001.A0R("product_type not recognized: ", queryParameter2);
                        }
                        C28458ChA.A00.A03(userSession, (ProductType) ProductType.A01.get(queryParameter2), "activity_feed", "url_handler_input_validation", A12, queryParameter, A0R, AbstractC166987dD.A1J(queryParameter3), null, null, null, null);
                        C9GR.A0B(fragmentActivity.getApplicationContext(), "something_went_wrong");
                        return;
                    }
                    C35227FgK.A02(fragmentActivity, userSession, queryParameter);
                    F1A.A00().A04(fragmentActivity, userSession, queryParameter, A12, AbstractC166987dD.A1J(queryParameter3));
                }
            }
        };
        this.A02 = A019;
        this.A1e = A02(3, 2);
        this.A1S = A06(this, 55, 21);
        this.A1b = A04(this, 56, 31);
        this.A0b = A06(this, 57, 22);
        this.A0c = A04(this, 58, 32);
        boolean A1W = AbstractC167007dF.A1W(C37001nx.A02);
        if (!A1W) {
            A04 = null;
        } else {
            A04 = A04(this, 59, 33);
        }
        this.A16 = A04;
        this.A0g = A1W ? A04(this, 60, 35) : null;
        this.A0T = A06(this, 61, 23);
        this.A0N = A01(4);
        this.A1Y = A01(5);
        this.A0U = A01(6);
        C34558FKs A0313 = A03(this, 62);
        A0313.A01 = new C36532G9e(this, true);
        this.A1a = A0313;
        this.A0X = A03(this, 63);
        C34558FKs A0110 = A01(7);
        A0110.A00 = new C31197Dng(this, 0);
        this.A0Z = A0110;
        this.A0a = A02(9, 3);
        this.A0W = A03(this, 64);
        this.A07 = A06(this, 66, 24);
        this.A0K = A04(this, 67, 36);
        this.A0R = A04(this, 68, 37);
        this.A1V = A06(this, 69, 25);
        this.A0V = A03(this, 70);
        this.A0S = A05(this, 0, 26);
        C34558FKs c34558FKs2 = new C34558FKs(new C36533G9f(this, 1));
        A0I(this, c34558FKs2, 39);
        this.A1T = c34558FKs2;
        C34558FKs c34558FKs3 = new C34558FKs(new C36533G9f(this, 2));
        A0I(this, c34558FKs3, 40);
        this.A1U = c34558FKs3;
        this.A14 = A05(this, 3, 27);
        this.A19 = A05(this, 4, 28);
        this.A18 = A05(this, 5, 29);
        this.A0r = A06(this, 0, 1);
        this.A1f = A06(this, 1, 2);
        this.A0B = A06(this, 2, 3);
        this.A0m = A06(this, 3, 4);
        this.A15 = A06(this, 4, 5);
        C34558FKs c34558FKs4 = new C34558FKs(new C36533G9f(new InterfaceC16600sD() { // from class: X.GRu
            @Override // X.InterfaceC16600sD
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                C35277FhC.A0A((android.net.Uri) obj, (UserSession) obj4, (C34972Fax) obj3);
                return C0eB.A00;
            }
        }, 7));
        c34558FKs4.A00 = new C31197Dng(this, 7);
        this.A1L = c34558FKs4;
        this.A1M = A06(this, 5, 8);
        this.A0j = A04(this, 6, 2);
        this.A0l = A06(this, 7, 9);
        this.A0Q = A04(this, 8, 3);
        C34558FKs A0314 = A03(this, 10);
        A0314.A00 = new C31197Dng(this, 10);
        this.A1j = A0314;
        C34558FKs A0315 = A03(this, 11);
        A0315.A00 = new C31197Dng(this, 11);
        this.A06 = A0315;
        this.A0A = A04(this, 12, 4);
        C34558FKs A0111 = A01(10);
        A0111.A01 = new C36531G9d(1);
        this.A0C = A0111;
        this.A09 = A06(this, 13, 12);
        this.A0f = A04(this, 14, 5);
        this.A1P = A04(this, 15, 6);
        this.A1G = A04(this, 16, 7);
        this.A1O = A04(this, 17, 8);
        this.A04 = A04(this, 18, 9);
        this.A1D = A04(this, 19, 10);
        C34558FKs A0112 = A01(11);
        A0112.A01 = new C36531G9d(2);
        this.A0z = A0112;
        C34558FKs A0113 = A01(12);
        A0113.A01 = new C36531G9d(3);
        this.A0D = A0113;
        this.A0q = A04(this, 20, 11);
        this.A1c = A06(this, 21, 13);
        this.A0s = A06(this, 22, 14);
        this.A0k = A04(this, 23, 13);
        this.A0o = A06(this, 24, 15);
        this.A1R = A04(this, 26, 14);
        this.A1F = A02(13, 5);
        C34558FKs A0114 = A01(14);
        A0I(this, A0114, 1);
        this.A1E = A0114;
        C34558FKs A0115 = A01(16);
        A0115.A01 = new C36531G9d(4);
        this.A0d = A0115;
        this.A13 = A02(17, 6);
        this.A12 = A02(18, 7);
        this.A1k = A02(19, 8);
        this.A1l = A02(21, 9);
        this.A0i = A02(23, 10);
        this.A1H = A02(24, 11);
        this.A1I = A01(25);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cf, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r10, 36311560486126171L) == false) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C36881nl A00(android.app.Activity r7, android.os.Bundle r8, X.InterfaceC11380iw r9, com.instagram.common.session.UserSession r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35277FhC.A00(android.app.Activity, android.os.Bundle, X.0iw, com.instagram.common.session.UserSession, boolean):X.1nl");
    }

    public static C34558FKs A01(int i) {
        return new C34558FKs(new C31196Dnf(i));
    }

    public static C34558FKs A02(int i, int i2) {
        C34558FKs c34558FKs = new C34558FKs(new C31196Dnf(i));
        c34558FKs.A00 = new C31201Dnk(i2);
        return c34558FKs;
    }

    public static C34558FKs A03(C35277FhC c35277FhC, int i) {
        return new C34558FKs(new C31191Dna(c35277FhC, i));
    }

    public static C34558FKs A04(C35277FhC c35277FhC, int i, int i2) {
        C34558FKs c34558FKs = new C34558FKs(new C31191Dna(c35277FhC, i));
        c34558FKs.A01 = new C31195Dne(c35277FhC, i2);
        return c34558FKs;
    }

    public static C34558FKs A05(C35277FhC c35277FhC, int i, int i2) {
        C34558FKs c34558FKs = new C34558FKs(new C36533G9f(c35277FhC, i));
        c34558FKs.A00 = new C31197Dng(c35277FhC, i2);
        return c34558FKs;
    }

    public static C34558FKs A06(C35277FhC c35277FhC, int i, int i2) {
        C34558FKs c34558FKs = new C34558FKs(new C31191Dna(c35277FhC, i));
        c34558FKs.A00 = new C31197Dng(c35277FhC, i2);
        return c34558FKs;
    }

    public static C34972Fax A08(Intent intent, UserSession userSession) {
        AbstractC09800fd.A01("AppStartupUtil.parseIgDirectUri", -356996260);
        try {
            android.net.Uri data = intent.getData();
            C34972Fax c34972Fax = new C34972Fax();
            A0B(data, userSession, c34972Fax);
            AbstractC09800fd.A00(881611428);
            return c34972Fax;
        } catch (Throwable th) {
            AbstractC09800fd.A00(-1184925929);
            throw th;
        }
    }

    public static void A09(Intent intent, C34972Fax c34972Fax, String str) {
        String stringExtra;
        if (str != null) {
            if ((str.equals("share_profile") || str.equals("contact_import_prompt") || str.equals("draft_post_capture_page") || str.equals("draft_share_sheet_page")) && (stringExtra = intent.getStringExtra("current_tab")) != null) {
                try {
                    C1QO valueOf = C1QO.valueOf(stringExtra);
                    if (valueOf != null) {
                        c34972Fax.A05 = valueOf;
                    }
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public static void A0B(android.net.Uri uri, UserSession userSession, C34972Fax c34972Fax) {
        String queryParameter;
        AbstractC09800fd.A01("AppStartupUtil.mDirectActionHandlerParseAndFillParameters", -718665300);
        try {
            String queryParameter2 = uri.getQueryParameter("t");
            c34972Fax.A0L = true;
            c34972Fax.A0M = true;
            Bundle bundle = c34972Fax.A0P;
            bundle.putString("current_user_id", userSession.userId);
            bundle.putString("screen", uri.getHost());
            if (uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID) != null) {
                queryParameter = uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            } else {
                queryParameter = uri.getQueryParameter(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
            }
            bundle.putString(PublicKeyCredentialControllerUtility.JSON_KEY_ID, queryParameter);
            bundle.putString("mid", uri.getQueryParameter("x"));
            bundle.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SCROLL_TO_MESSAGE_ID", uri.getQueryParameter("scroll_to_message_id"));
            bundle.putString("deeplinking_type", queryParameter2);
            AbstractC31173DnH.A1A(uri, bundle, TraceFieldType.TransportType);
            c34972Fax.A06 = "direct_push_notification";
            AbstractC31173DnH.A1A(uri, bundle, "recipients");
            c34972Fax.A08 = uri.getQueryParameter("filter_type");
            AbstractC31178DnM.A0r(uri, bundle, "jl_hash", "di_id");
            AbstractC31178DnM.A0r(uri, bundle, "mctid", "occam_id");
            AbstractC31178DnM.A0r(uri, bundle, "media_id", "target_comment_id");
            AbstractC31178DnM.A0r(uri, bundle, "media_owner_id", "media_owner_profile_pic_url");
            AbstractC09800fd.A00(-2065816328);
        } catch (Throwable th) {
            AbstractC09800fd.A00(1340001485);
            throw th;
        }
    }

    public static void A0C(android.net.Uri uri, UserSession userSession, C34972Fax c34972Fax, String str) {
        AbstractC09800fd.A01("AppStartupUtil.handleDirectNavigation", -1743954164);
        try {
            A0A(uri, userSession, c34972Fax);
            c34972Fax.A06 = str;
            c34972Fax.A08 = uri.getQueryParameter("filter_type");
            c34972Fax.A09 = uri.getQueryParameter("DIRECT_SOURCE_MODULE_NAME");
            Bundle A0b = AbstractC166987dD.A0b();
            c34972Fax.A01 = A0b;
            AbstractC31173DnH.A1A(uri, A0b, "filter_type");
            AbstractC09800fd.A00(1491205376);
        } catch (Throwable th) {
            AbstractC09800fd.A00(-1973604009);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (r1.equals("new_story_pog_notification") == false) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.1vN] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0E(android.net.Uri r15, com.instagram.common.session.UserSession r16, X.C34972Fax r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35277FhC.A0E(android.net.Uri, com.instagram.common.session.UserSession, X.Fax, boolean, boolean):void");
    }

    public static void A0F(Bundle bundle, BaseFragmentActivity baseFragmentActivity, ClipsViewerSource clipsViewerSource, UserSession userSession, String str, boolean z) {
        String string = bundle.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        String string2 = bundle.getString("short_url");
        String string3 = bundle.getString("CommentThreadFragment.TARGET_COMMENT_ID");
        String string4 = bundle.getString("gift_action_type");
        String string5 = bundle.getString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_PUSH_NOTIF_TYPE");
        String string6 = bundle.getString("CommentThreadFragment.INTENT_EXTRA_SORT_ORDER");
        boolean z2 = bundle.getBoolean("highlight_original_media", false);
        boolean z3 = bundle.getBoolean("should_open_save_collections_bottomsheet", false);
        boolean z4 = bundle.getBoolean(AbstractC111324zv.A00(81), false);
        String string7 = bundle.getString("intent_extra_trial_notification_type");
        if (string == null && string2 == null) {
            C0w9.A03("invalidNotification: Clips notif doesn't contain media or shortUrl", AnonymousClass001.A0R("isClipsEnabled: true, notifBundle: ", bundle.toString()));
            return;
        }
        C116875Qr c116875Qr = new C116875Qr(clipsViewerSource, userSession);
        if (string != null) {
            c116875Qr.A1D = string;
        } else if (string2 != null) {
            c116875Qr.A17 = string2;
        }
        if (str != null) {
            c116875Qr.A0o = str;
        }
        if (string3 != null) {
            c116875Qr.A1I = string3;
            c116875Qr.A09 = EnumC120785dO.NOTIFICATIONS;
        }
        if (string4 != null) {
            c116875Qr.A0f = string4;
            c116875Qr.A0e = TraceEventType.Push;
        }
        if ("clips_view_count_milestone".equals(string5) && C18U.A06(C06090Tz.A05, userSession, 36320171895300213L)) {
            c116875Qr.A0W = 1;
        }
        if (string6 != null) {
            c116875Qr.A0Y = AbstractC169187gr.A00(string6);
        }
        c116875Qr.A1R = z2;
        c116875Qr.A1l = z3;
        c116875Qr.A1q = z4;
        c116875Qr.A1L = string7;
        if (z) {
            AbstractC41751IeQ.A01(baseFragmentActivity, c116875Qr, userSession, false);
        } else {
            AbstractC31173DnH.A1J(baseFragmentActivity, c116875Qr, userSession);
        }
    }

    public static void A0I(C35277FhC c35277FhC, C34558FKs c34558FKs, int i) {
        c34558FKs.A01 = new C31195Dne(c35277FhC, i);
    }

    public static boolean A0J(Activity activity, Bundle bundle, UserSession userSession, boolean z) {
        int i;
        AbstractC09800fd.A01("AppStartupUtil.directActionHandlerStartActivity", 721019077);
        try {
            String string = bundle.getString("deeplinking_type");
            String string2 = bundle.getString("jl_hash");
            String string3 = bundle.getString("di_id");
            C36881nl A00 = A00(activity, bundle, new InterfaceC11380iw() { // from class: X.Fu8
                public static final String __redex_internal_original_name = "AppStartupUtil$$ExternalSyntheticLambda61";

                @Override // X.InterfaceC11380iw
                public final String getModuleName() {
                    return "AppStartupUtil";
                }
            }, userSession, z);
            if (A00 == null) {
                if ("p".equals(string)) {
                    C46493Khs A002 = AbstractC46782Kmd.A00(userSession);
                    EnumC46220Kcw enumC46220Kcw = EnumC46220Kcw.A06;
                    C14360o3.A0B(enumC46220Kcw, 0);
                    A002.A00 = enumC46220Kcw;
                    C14360o3.A0B(userSession, 0);
                    new LAH(userSession).A05(enumC46220Kcw.A01);
                    AbstractC31178DnM.A0j(activity, bundle, userSession, ModalActivity.class, AbstractC111324zv.A00(391));
                } else if (string2 != null && string3 != null && C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36320382349484451L)) {
                    C6XJ A0L = AbstractC31171DnF.A0L(activity, bundle, userSession, ModalActivity.class, "direct_inbox");
                    activity.getIntent().addFlags(AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
                    A0L.A0C(activity);
                    activity.finish();
                }
                i = -2141498603;
            } else {
                if (bundle.getBoolean("action_call_back")) {
                    C7T3 c7t3 = C7T3.A0L;
                    InterfaceC83713oG interfaceC83713oG = A00.A0B;
                    C18C.A07(interfaceC83713oG, "Missing ThreadTarget");
                    A00.A0C = c7t3;
                    C36881nl.A03(A00, interfaceC83713oG, 3);
                } else {
                    if (bundle.getString("media_id") != null) {
                        A00.A04 = new ChannelRepliesNotifData(bundle.getString("media_id"), bundle.getString("target_comment_id"), bundle.getString("media_owner_id"), bundle.getString("media_owner_profile_pic_url"));
                        A00.A0X = bundle.getString("mid");
                    }
                    if (bundle.getString("collection_id") != null) {
                        A00.A0M = bundle.getString("collection_id");
                    }
                    A00.A06();
                }
                i = -1103235743;
            }
            AbstractC09800fd.A00(i);
            return true;
        } catch (Throwable th) {
            AbstractC09800fd.A00(58227883);
            throw th;
        }
    }

    public final void A0K(Bundle bundle, BaseFragmentActivity baseFragmentActivity, UserSession userSession) {
        InterfaceC37132GXt interfaceC37132GXt;
        AbstractC09800fd.A01("AppStartupUtil.handleStartingArgumentsBundle", -59198087);
        try {
            String string = bundle.getString("screen");
            C34558FKs A07 = A07(this, string);
            if (A07 != null) {
                InterfaceC37131GXs interfaceC37131GXs = A07.A00;
                if ((interfaceC37131GXs == null || !interfaceC37131GXs.AQB(bundle, baseFragmentActivity, userSession)) && (interfaceC37132GXt = A07.A01) != null) {
                    interfaceC37132GXt.E4C(bundle, baseFragmentActivity, userSession);
                }
                AbstractC09800fd.A00(-407454607);
                return;
            }
            throw new RuntimeException(AnonymousClass001.A0R("Received unknown starting bundle type. NEW_FRAGMENT_SCREEN_ARGUMENT value from bundle: ", string));
        } catch (Throwable th) {
            AbstractC09800fd.A00(-1692342087);
            throw th;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:297:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:389:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:408:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:410:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C34558FKs A07(X.C35277FhC r1, java.lang.String r2) {
        /*
            Method dump skipped, instructions count: 1750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35277FhC.A07(X.FhC, java.lang.String):X.FKs");
    }

    public static void A0A(android.net.Uri uri, UserSession userSession, C34972Fax c34972Fax) {
        if (AbstractC54792fc.A04(userSession)) {
            c34972Fax.A05 = C1QO.A0B;
            if (AbstractC54792fc.A07(userSession)) {
                c34972Fax.A00 = 1.0f;
            }
        } else {
            c34972Fax.A00 = 1.0f;
            c34972Fax.A05 = C1QO.A0C;
        }
        AbstractC46972Dl A00 = AbstractC43928Jbd.A00(uri.getQueryParameter("folder"));
        if (A00 != null) {
            c34972Fax.A0A = A00.A04;
        }
    }

    public static void A0D(android.net.Uri uri, UserSession userSession, C34972Fax c34972Fax, String str, boolean z, boolean z2) {
        Bundle A00 = C34972Fax.A00(c34972Fax);
        AbstractC31175DnJ.A0q(uri, A00);
        A00.putString("current_user_id", userSession.userId);
        A00.putString(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        A00.putBoolean("highlight_original_media", z);
        A00.putBoolean("should_open_save_collections_bottomsheet", z2);
    }

    public static void A0G(UserSession userSession, FragmentActivity fragmentActivity) {
        if (AbstractC54792fc.A02(userSession)) {
            C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
            A0r.A0E(new NewsfeedFragment());
            A0r.A04();
        }
    }

    public static void A0H(UserSession userSession, C34972Fax c34972Fax) {
        C1QO c1qo;
        if (AbstractC54792fc.A02(userSession)) {
            c1qo = C1QO.A0C;
        } else {
            c1qo = C1QO.A0D;
        }
        c34972Fax.A05 = c1qo;
    }
}
