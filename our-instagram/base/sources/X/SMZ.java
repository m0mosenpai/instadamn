package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.spotify.sdk.android.auth.AuthorizationResponse;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class SMZ {
    public InterfaceC65294ThS A00;
    public InterfaceC65554TmX A01;
    public List A02;
    public boolean A03;
    public final Activity A04;

    public final void A00(AuthorizationResponse authorizationResponse) {
        InterfaceC65554TmX interfaceC65554TmX = this.A01;
        this.A03 = false;
        if (interfaceC65554TmX != null) {
            interfaceC65554TmX.stop();
        }
        Object obj = this.A00;
        if (obj != null) {
            Intent A04 = AbstractC31171DnF.A04();
            String.format("Spotify auth completing. The response is in EXTRA with key '%s'", PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putParcelable(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, authorizationResponse);
            A04.putExtra(MSV.A00(748), A0b);
            AbstractC31180DnO.A0y((Activity) obj, A04);
            this.A00 = null;
            return;
        }
        android.util.Log.w("Spotify Auth Client", "Can't deliver the Spotify Auth response. The listener is null");
    }

    public SMZ(Activity activity) {
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A02 = A1E;
        this.A04 = activity;
        A1E.add(new Object());
        A1E.add(new THA());
    }
}
