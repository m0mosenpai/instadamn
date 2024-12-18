package X;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.reels.question.constants.QuestionStickerType;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1OU, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1OU {
    public static final C1OU $redex_init_class = null;

    public static final C1ON A00(UserSession userSession, String str) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(userSession, 1);
        return C25401Lu.A03(userSession, C05F.A00, str);
    }

    public static final Reel A01(UserSession userSession, User user) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(user, 1);
        return C75653aW.A02(userSession, user);
    }

    public static final C64012vM A02(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        return new C64012vM(interfaceC11380iw, userSession, str, null, null);
    }

    public static final C140626Xq A03(Context context, UserSession userSession, Reel reel, InterfaceC140616Xp interfaceC140616Xp, C82013lN c82013lN, String str, int i) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(c82013lN, 1);
        C14360o3.A0B(reel, 2);
        C14360o3.A0B(userSession, 3);
        C14360o3.A0B(str, 5);
        return new C140626Xq(context, userSession, reel, interfaceC140616Xp, c82013lN, str, i);
    }

    public static final ReelStore A04(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        ReelStore A03 = ReelStore.A03(userSession);
        C14360o3.A07(A03);
        return A03;
    }

    public static final C3M4 A05(Activity activity) {
        C14360o3.A0B(activity, 0);
        return C3M4.A05(activity);
    }

    public static final C3M4 A06(Activity activity, UserSession userSession) {
        C14360o3.A0B(activity, 0);
        C14360o3.A0B(userSession, 1);
        Map map = C3M4.A13;
        while (activity.getParent() != null) {
            activity = activity.getParent();
        }
        View findViewById = activity.findViewById(R.id.content);
        findViewById.getClass();
        return C3M4.A06(activity, (ViewGroup) findViewById, userSession);
    }

    public static final void A07(Activity activity, Fragment fragment, UserSession userSession, C38321qM c38321qM, String str, boolean z) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(activity, 1);
        C14360o3.A0B(fragment, 2);
        C14360o3.A0B(c38321qM, 3);
        AbstractC34836FWt.A01(activity, fragment, userSession, c38321qM, str, null, z);
    }

    public static final void A08(Activity activity, C22P c22p, UserSession userSession, AlC alC, User user) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(activity, 1);
        Bundle bundle = new Bundle();
        try {
            URL url = alC.A00;
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            AbstractC69879Vx4.A00(A0A, url, true);
            A0A.close();
            bundle.putString("ReelCountdownShareConstants.ARGUMENTS_KEY_COUNTDOWN_STICKER_MODEL_JSON", stringWriter.toString());
            bundle.putSerializable("ReelCountdownShareConstants.ARGUMENTS_KEY_CAMERA_ENTRY_POINT", c22p);
            if (user != null) {
                bundle.putString("ReelCountdownShareConstants.ARGUMENTS_KEY_COUNTDOWN_STICKER_CREATOR_USER_ID", user.getId());
            }
            C6XJ.A02(activity, bundle, userSession, TransparentModalActivity.class, "reel_countdown_reshare").A0C(activity);
        } catch (IOException unused) {
            C0w9.A03("ReelCountdownShareHelper", "Could not parse json CountdownStickerModel for countdown re-share.");
        }
    }

    static {
        try {
            ArrayList arrayList = new ArrayList();
            C1OZ c1oz = C1OV.A0B;
            C25981Of c25981Of = new C25981Of(c1oz, new C25951Oc(new InterfaceC25941Ob() { // from class: X.1Oa
                @Override // X.InterfaceC25941Ob
                public final /* bridge */ /* synthetic */ C1ON AES(UserSession userSession, C1OW c1ow) {
                    C1OV c1ov = (C1OV) c1ow;
                    String str = c1ov.A04;
                    String str2 = c1ov.A05;
                    Integer num = c1ov.A02;
                    num.getClass();
                    int intValue = num.intValue();
                    String str3 = c1ov.A06;
                    String str4 = c1ov.A07;
                    String str5 = c1ov.A03;
                    String str6 = c1ov.A08;
                    int i = c1ov.A00;
                    boolean z = c1ov.A09;
                    C25621Ms c25621Ms = new C25621Ms(userSession);
                    c25621Ms.A09(C05F.A01);
                    c25621Ms.A0L("media/%s/%s/story_poll_vote/", str, str2);
                    c25621Ms.A9s("vote", String.valueOf(intValue));
                    c25621Ms.A0I("allow_vote_change", z);
                    c25621Ms.A9s("radio_type", str3);
                    c25621Ms.A9s("container_module", str4);
                    c25621Ms.A9s("delivery_class", str5);
                    c25621Ms.A9s("tray_session_id", str6);
                    c25621Ms.A0D("tray_position", i);
                    c25621Ms.A9s("nav_chain", C1QM.A00.A02.A00);
                    c25621Ms.A0S(EAS.class, C34753FSs.class);
                    c25621Ms.A0R = true;
                    return c25621Ms.A0N();
                }
            }), new C0t0(new C25961Od("reels_send_poll_vote")), "reels_send_poll_vote");
            c25981Of.A04 = new C0KV() { // from class: X.1Oh
                @Override // X.C0KV
                public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                    int A03 = C0f9.A03(-1780929622);
                    int A032 = C0f9.A03(487247191);
                    C49237Lps c49237Lps = new C49237Lps(new C29619D2u(userSession));
                    C0f9.A0A(1452073436, A032);
                    C0f9.A0A(1327375191, A03);
                    return c49237Lps;
                }
            };
            arrayList.add(new C25991Og(c25981Of));
            C25981Of c25981Of2 = new C25981Of(c1oz, new C25951Oc(new InterfaceC25941Ob() { // from class: X.1Oj
                @Override // X.InterfaceC25941Ob
                public final /* bridge */ /* synthetic */ C1ON AES(UserSession userSession, C1OW c1ow) {
                    String str = ((C1OV) c1ow).A05;
                    C25621Ms c25621Ms = new C25621Ms(userSession);
                    c25621Ms.A05();
                    c25621Ms.A0L("media/%s/async_delete_story_poll_reply/", str);
                    c25621Ms.A0S(C32125E9y.class, FS6.class);
                    return c25621Ms.A0N();
                }
            }), new C0t0(new C25961Od("reels_send_poll_vote")), "poll_vote_deletion");
            c25981Of2.A04 = new C0KV() { // from class: X.1Oh
                @Override // X.C0KV
                public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                    int A03 = C0f9.A03(-1780929622);
                    int A032 = C0f9.A03(487247191);
                    C49237Lps c49237Lps = new C49237Lps(new C29619D2u(userSession));
                    C0f9.A0A(1452073436, A032);
                    C0f9.A0A(1327375191, A03);
                    return c49237Lps;
                }
            };
            arrayList.add(new C25991Og(c25981Of2));
            C25981Of c25981Of3 = new C25981Of(C26031Ok.A08, new C25951Oc(new InterfaceC25941Ob() { // from class: X.1Om
                @Override // X.InterfaceC25941Ob
                public final /* bridge */ /* synthetic */ C1ON AES(UserSession userSession, C1OW c1ow) {
                    C26031Ok c26031Ok = (C26031Ok) c1ow;
                    String str = c26031Ok.A02;
                    String str2 = c26031Ok.A03;
                    String str3 = c26031Ok.A05;
                    String str4 = ((C1OW) c26031Ok).A05;
                    C25621Ms A00 = AbstractC41336IRh.A00(userSession, str, str2, QuestionStickerType.A08.A00, str4, str4, c26031Ok.A04, c26031Ok.A01, c26031Ok.A06, c26031Ok.A00, c26031Ok.A07);
                    A00.A9s(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, str3);
                    return A00.A0N();
                }
            }), new C0t0(new C25961Od("reels_send_question_text_response")), "reels_send_question_text_response");
            C0KV c0kv = AbstractC26061On.A00;
            c25981Of3.A02 = c0kv;
            C25991Og c25991Og = new C25991Og(c25981Of3);
            C25981Of c25981Of4 = new C25981Of(C26081Op.A06, new C25951Oc(new InterfaceC25941Ob() { // from class: X.1Or
                @Override // X.InterfaceC25941Ob
                public final /* bridge */ /* synthetic */ C1ON AES(UserSession userSession, C1OW c1ow) {
                    C26081Op c26081Op = (C26081Op) c1ow;
                    String str = c26081Op.A00;
                    String str2 = c26081Op.A03;
                    String str3 = c26081Op.A01;
                    String str4 = c26081Op.A02;
                    String str5 = c26081Op.A04;
                    String str6 = ((C1OW) c26081Op).A05;
                    C25621Ms A00 = AbstractC41336IRh.A00(userSession, str, str2, QuestionResponseType.A06.A00, str6, str6, null, null, c26081Op.A05, -1, false);
                    A00.A9s("music_browse_session_id", str3);
                    if (str4 != null) {
                        A00.A9s("audio_asset_id", str4);
                    } else {
                        A00.A9s(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, str5);
                    }
                    return A00.A0N();
                }
            }), new C0t0(new C25961Od("reels_send_question_music_response")), "reels_send_question_music_response");
            c25981Of4.A02 = c0kv;
            C25991Og c25991Og2 = new C25991Og(c25981Of4);
            C25981Of c25981Of5 = new C25981Of(C26111Os.A0A, new C25951Oc(new InterfaceC25941Ob() { // from class: X.1Ou
                @Override // X.InterfaceC25941Ob
                public final /* bridge */ /* synthetic */ C1ON AES(UserSession userSession, C1OW c1ow) {
                    C26111Os c26111Os = (C26111Os) c1ow;
                    String str = c26111Os.A03;
                    String str2 = c26111Os.A04;
                    String str3 = QuestionStickerType.A08.A00;
                    String str4 = c26111Os.A08;
                    int i = c26111Os.A00;
                    String str5 = c26111Os.A06;
                    String str6 = ((C1OW) c26111Os).A05;
                    C25621Ms A00 = AbstractC41336IRh.A00(userSession, str, str2, str3, str6, str6, c26111Os.A05, c26111Os.A02, c26111Os.A07, c26111Os.A01, false);
                    A00.A9s("upload_id", str4);
                    A00.A0D("media_type", i);
                    A00.A9s("response_type", str5);
                    return A00.A0N();
                }
            }), new C0t0(new C25961Od("reels_send_question_photo_video_response")), "reels_send_question_photo_video_response");
            c25981Of5.A02 = c0kv;
            List asList = Arrays.asList(c25991Og, c25991Og2, new C25991Og(c25981Of5));
            C14360o3.A07(asList);
            arrayList.addAll(asList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C26141Ov.A02((C25991Og) it.next());
            }
        } catch (C90123zt e) {
            C0K8.A0J("ReelsPluginImpl", "initialized more than once", e);
        }
    }

    public static final boolean A09(Reel reel, C140626Xq c140626Xq) {
        if (c140626Xq != null && c140626Xq.A07 && C14360o3.A0K(c140626Xq.A0D, reel)) {
            return false;
        }
        return true;
    }
}
