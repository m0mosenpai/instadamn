package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.PandoGraphQLRequest;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.spotify.sdk.android.auth.AuthorizationRequest;
import com.spotify.sdk.android.auth.AuthorizationResponse;
import com.spotify.sdk.android.auth.LoginActivity;
import java.util.HashMap;

/* renamed from: X.Oaf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55083Oaf {
    public static final ImmutableList A01;
    public final C40701ud A00;

    public C55083Oaf(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = AbstractC40691uc.A01(userSession);
    }

    public static final void A00(UserSession userSession, Activity activity, String str) {
        AbstractC167007dF.A1K(activity, userSession);
        C06090Tz c06090Tz = C06090Tz.A05;
        String A04 = C18U.A04(c06090Tz, userSession, 36889177753256783L);
        String A042 = C18U.A04(c06090Tz, userSession, 36889177752863565L);
        HashMap A1G = AbstractC166987dD.A1G();
        if (A04.length() != 0) {
            AuthorizationRequest authorizationRequest = new AuthorizationRequest(A042, A04, str, A1G, AbstractC31173DnH.A1b(A01, 0));
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putParcelable("request", authorizationRequest);
            Intent A08 = MSW.A08(activity, LoginActivity.class);
            A08.putExtra("EXTRA_AUTH_REQUEST", A0b);
            A08.addFlags(67108864);
            activity.startActivityForResult(A08, 1361);
            return;
        }
        throw AbstractC166987dD.A12("Redirect URI can't be null or empty");
    }

    public final void A01(Activity activity, Intent intent, InterfaceC58027PoD interfaceC58027PoD, UserSession userSession, int i) {
        AuthorizationResponse authorizationResponse;
        Bundle bundleExtra;
        C14360o3.A0B(activity, 0);
        MSZ.A1O(userSession, interfaceC58027PoD);
        if (i == -1 && intent != null && (bundleExtra = intent.getBundleExtra("EXTRA_AUTH_RESPONSE")) != null && bundleExtra.getParcelable(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE) != null) {
            authorizationResponse = null;
            Bundle bundleExtra2 = intent.getBundleExtra("EXTRA_AUTH_RESPONSE");
            if (bundleExtra2 != null) {
                authorizationResponse = (AuthorizationResponse) bundleExtra2.getParcelable(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            }
        } else {
            authorizationResponse = new AuthorizationResponse(C05F.A0N, null, null, null, null, 0);
        }
        C14360o3.A07(authorizationResponse);
        String A04 = C18U.A04(C06090Tz.A05, userSession, 36889177753256783L);
        Integer num = authorizationResponse.A00;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue == 2) {
                    String str = authorizationResponse.A02;
                    if (str != null && str.equals("AUTHENTICATION_DENIED_BY_USER")) {
                        return;
                    }
                    interfaceC58027PoD.DE4(activity);
                    return;
                }
                return;
            }
            C40701ud A012 = AbstractC40691uc.A01(userSession);
            String str2 = authorizationResponse.A01;
            C14360o3.A07(str2);
            C2JM A0b = AbstractC25225BEi.A0b();
            C2JM A0b2 = AbstractC25225BEi.A0b();
            A0b.A04("auth_code", str2);
            A0b.A05("incremental_scopes", A01);
            A0b.A04(AbstractC58317Pt9.A00(938), A04);
            A012.ATV(new C55656Onh(1, activity, interfaceC58027PoD), new C55665Onq(1, activity, interfaceC58027PoD), new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "AddSpotifyAccountLinkMutation", A0b.getParamsCopy(), A0b2.getParamsCopy(), Qa3.class, true, null, 0, null, "xdt_music_api_upsert_spotify_account_link", AbstractC166987dD.A1E()));
        }
    }

    public final void A02(Activity activity, InterfaceC58109PpY interfaceC58109PpY, String str, String str2) {
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        A0b.A04("audio_cluster_id", str);
        A0b.A04("note_id", str2);
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "SaveSongToSpotifyMutation", A0b.getParamsCopy(), A0b2.getParamsCopy(), Qa5.class, true, null, 0, null, "xdt_music_api_save_song_to_spotify", AbstractC166987dD.A1E());
        this.A00.ATV(new C55656Onh(2, interfaceC58109PpY, activity), new C55665Onq(2, interfaceC58109PpY, activity), pandoGraphQLRequest);
    }

    static {
        ImmutableList of = ImmutableList.of((Object) "user-library-modify", (Object) "user-read-recently-played", (Object) "user-personalized", (Object) "user-library-read", (Object) "user-personalized", (Object) "user-read-currently-playing");
        C14360o3.A07(of);
        A01 = of;
    }
}
