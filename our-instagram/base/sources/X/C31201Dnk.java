package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.proxygen.TraceEventType;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher;
import com.instagram.friendmap.configs.FriendMapLaunchConfig;
import com.instagram.modal.ModalActivity;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.Dnk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31201Dnk implements InterfaceC37131GXs {
    public final int A00;

    public C31201Dnk(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // X.InterfaceC37131GXs
    public final boolean AQB(Bundle bundle, BaseFragmentActivity baseFragmentActivity, UserSession userSession) {
        ClipsViewerSource clipsViewerSource;
        boolean z;
        String string;
        android.net.Uri uri;
        android.net.Uri uri2;
        String string2;
        List asList;
        String string3;
        C22P c22p;
        switch (this.A00) {
            case 0:
                String string4 = bundle.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                if (string4 == null) {
                    return false;
                }
                AbstractC86593tX.A0c(baseFragmentActivity, userSession, string4);
                return true;
            case 1:
                android.net.Uri A03 = AbstractC08820cl.A03(bundle.getString("uri_string"));
                String queryParameter = A03.getQueryParameter("push_category");
                String queryParameter2 = A03.getQueryParameter("album_type");
                if (C14360o3.A0K(queryParameter, "meta_gallery_meta_quest_media_ready")) {
                    c22p = C22P.A3U;
                } else {
                    c22p = C22P.A5N;
                }
                if (queryParameter2 != null) {
                    FET.A00.A08(baseFragmentActivity, c22p, userSession, "stories", queryParameter2);
                }
                return true;
            case 2:
                android.net.Uri A032 = AbstractC08820cl.A03(bundle.getString("uri_string"));
                String queryParameter3 = A032.getQueryParameter("persona_id");
                String queryParameter4 = A032.getQueryParameter("bot_id");
                String queryParameter5 = A032.getQueryParameter("is_approved");
                C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                if (queryParameter5.equals("True")) {
                    InterfaceC19630xq interfaceC19630xq = A00.A01;
                    if (!AbstractC31172DnG.A1a(interfaceC19630xq, "has_seen_ai_approved_nux")) {
                        AbstractC31177DnL.A1N(interfaceC19630xq, "has_seen_ai_approved_nux", true);
                        AbstractC25228BEl.A1G(baseFragmentActivity, AbstractC31177DnL.A0D("persona_id", queryParameter3, "bot_id", queryParameter4), userSession, ModalActivity.class, "AI_APPROVED");
                        return true;
                    }
                }
                new AiAgentThreadLauncher(userSession).A05(baseFragmentActivity, AbstractC31171DnF.A0D("AppStartupUtil"), AbstractC25225BEi.A0t(""), "", null, queryParameter4, null);
                return true;
            case 3:
                String string5 = bundle.getString("note_pk");
                String string6 = bundle.getString("prompt_id");
                if (string6 != null) {
                    AbstractC46777KmY.A00(baseFragmentActivity, userSession, string6, string5);
                }
                return true;
            case 4:
                C35277FhC.A0J(baseFragmentActivity, bundle, userSession, false);
                return true;
            case 5:
                AbstractC25228BEl.A1G(baseFragmentActivity, bundle, userSession, ModalActivity.class, AbstractC111324zv.A00(5133));
                return true;
            case 6:
                if (AbstractC151756sL.A01() && AbstractC151756sL.A00().A04(userSession) && (string3 = bundle.getString("opal_user_id")) != null && !string3.isEmpty()) {
                    AbstractC31174DnI.A0d().A04(baseFragmentActivity, userSession, null, string3, "profile_notification", true, false);
                    return true;
                }
                return false;
            case 7:
                if (!AbstractC151756sL.A01() || !AbstractC151756sL.A00().A04(userSession) || (string2 = bundle.getString("media_ids")) == null || string2.isEmpty() || (asList = Arrays.asList(string2.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1))) == null || asList.isEmpty()) {
                    return false;
                }
                AbstractC31174DnI.A0d().A06(baseFragmentActivity, userSession, TraceEventType.Push, asList);
                return true;
            case 8:
                InterfaceC28401Zb A002 = C28411Zc.A00();
                AbstractC167017dG.A1N(bundle, userSession);
                String string7 = bundle.getString("wall_uri_to_bundle");
                if (string7 != null) {
                    uri2 = android.net.Uri.parse(string7);
                } else {
                    uri2 = null;
                }
                A002.Cgt(baseFragmentActivity, userSession, AbstractC34361FDd.A00(uri2, userSession));
                return true;
            case 9:
                C28411Zc.A00().Cgh(baseFragmentActivity, userSession);
                return true;
            case 10:
                AbstractC37341oX A003 = C3L9.A00();
                Integer num = C05F.A01;
                C34977Fb4 c34977Fb4 = FriendMapLaunchConfig.A0C;
                AbstractC167017dG.A1N(userSession, bundle);
                String string8 = bundle.getString("friend_map_uri_param");
                String str = null;
                if (string8 != null) {
                    uri = android.net.Uri.parse(string8);
                    if (uri != null) {
                        str = uri.getHost();
                    }
                } else {
                    uri = null;
                }
                A003.A01(baseFragmentActivity, userSession, c34977Fb4.A01(uri, userSession, num, C14360o3.A0K(str, "friend_map_audience_settings")));
                return true;
            case 11:
                String string9 = bundle.getString("quick_snap_media_id");
                if (string9 == null) {
                    string9 = "";
                }
                boolean A1V = AbstractC167007dF.A1V(string9);
                AbstractC54121NwJ.A00(baseFragmentActivity, userSession, string9, A1V);
                return A1V;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                clipsViewerSource = ClipsViewerSource.A1y;
                string = bundle.getString("playlist_title");
                z = false;
                C35277FhC.A0F(bundle, baseFragmentActivity, clipsViewerSource, userSession, string, z);
                return true;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                clipsViewerSource = ClipsViewerSource.A22;
                z = false;
                string = null;
                C35277FhC.A0F(bundle, baseFragmentActivity, clipsViewerSource, userSession, string, z);
                return true;
            case 14:
                User A02 = AnonymousClass189.A00(userSession).A02(userSession.userId);
                if (A02 == null) {
                    C0w9.A03("AppStartupUtil", "invalidNotification: Barcelona notif doesn't contain a user");
                } else {
                    String string10 = bundle.getString("get_app_entrypoint");
                    C35135Fec.A00.A01(baseFragmentActivity, new C35911FtV(baseFragmentActivity, userSession, A02, string10, 0), userSession, A02, string10, bundle.getString("injected_actor_ids"));
                }
                return true;
            default:
                clipsViewerSource = ClipsViewerSource.A22;
                z = true;
                string = null;
                C35277FhC.A0F(bundle, baseFragmentActivity, clipsViewerSource, userSession, string, z);
                return true;
        }
    }
}
