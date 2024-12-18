package com.instagram.debug.devoptions.section.identitycapture;

import X.AbstractC018607g;
import X.AbstractC10360h2;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC31172DnG;
import X.AbstractC58317Pt9;
import X.AbstractC59962oe;
import X.C0K8;
import X.C0f9;
import X.C12260kU;
import X.C14360o3;
import X.C62436SBp;
import X.GHY;
import X.R7Y;
import X.SN4;
import X.TF9;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.smartcapture.download.IgVoltronAndNmlModulesDownloader;
import com.instagram.challenge.selfiecaptchachallenge.IgSelfieCaptchaChallengeManagerImpl;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.List;

/* loaded from: classes6.dex */
public final class IdentityCaptureOptions implements DeveloperOptionsSection {
    public static final IdentityCaptureOptions INSTANCE = new Object();
    public static final String TAG = "IdentityCaptureOptions";

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public List getItems(final UserSession userSession, final FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        return AbstractC16960so.A1Q(new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.identitycapture.IdentityCaptureOptions$getItems$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(2023498748);
                try {
                    C12260kU.A0C(FragmentActivity.this, new R7Y(FragmentActivity.this, userSession, null, null, null, null).A00());
                } catch (IOException e) {
                    C0K8.A0F(IdentityCaptureOptions.TAG, "Exception when launching ID Capture", e);
                }
                C0f9.A0C(-1306702811, A05);
            }
        }, fragmentActivity.getString(2131958087)), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.identitycapture.IdentityCaptureOptions$getItems$2
            /* JADX WARN: Type inference failed for: r0v2, types: [com.facebook.smartcapture.ui.IdCaptureUi, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3, types: [com.facebook.smartcapture.resources.ResourcesProvider, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-349086121);
                C62436SBp c62436SBp = new C62436SBp();
                UserSession userSession2 = UserSession.this;
                C14360o3.A0B(userSession2, 1);
                SN4 sn4 = new SN4();
                sn4.A09 = new Object();
                sn4.A07 = new Object();
                sn4.A00 = R.style.IgSmartCaptureTheme;
                sn4.A04 = new IgVoltronAndNmlModulesDownloader(userSession2);
                String token = userSession2.getToken();
                C14360o3.A0B(token, 0);
                sn4.A0D = token;
                FragmentActivity fragmentActivity2 = fragmentActivity;
                C14360o3.A0B(fragmentActivity2, 0);
                sn4.A02 = fragmentActivity2;
                sn4.A0E = "IG Internal Settings";
                Certificate certificate = c62436SBp.A00.getCertificate("alias");
                if (certificate != null) {
                    String encodeToString = Base64.encodeToString(certificate.getPublicKey().getEncoded(), 2);
                    C14360o3.A07(encodeToString);
                    sn4.A0F = encodeToString;
                    C12260kU.A0C(fragmentActivity, sn4.A00());
                    C0f9.A0C(-1626921256, A05);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }, fragmentActivity.getString(2131958085)), GHY.A00(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.identitycapture.IdentityCaptureOptions$getItems$3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(1311174543);
                try {
                    Bundle A0b = AbstractC166987dD.A0b();
                    A0b.putString(AbstractC58317Pt9.A00(803), "[1,2,3]");
                    Object newInstance = Class.forName("com.instagram.challenge.selfiecaptchachallenge.IgSelfieCaptchaChallengeManagerImpl").newInstance();
                    C14360o3.A0C(newInstance, "null cannot be cast to non-null type com.instagram.challenge.intf.IgSelfieCaptchaChallengeManager");
                    FragmentActivity fragmentActivity2 = FragmentActivity.this;
                    UserSession userSession2 = userSession;
                    AbstractC10360h2 A0D = AbstractC31172DnG.A0D(fragmentActivity2);
                    UserSession userSession3 = userSession;
                    ((IgSelfieCaptchaChallengeManagerImpl) newInstance).A00(fragmentActivity2, A0b, A0D, userSession2, new TF9(userSession3), "test-challenge", userSession3.userId, null, "ig_selfie_test");
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                    C0K8.A0F(IdentityCaptureOptions.TAG, "Exception when launching Selfie Capture", e);
                }
                C0f9.A0C(300841243, A05);
            }
        }, 2131958088));
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public int getTitleRes() {
        return 2131958086;
    }
}
