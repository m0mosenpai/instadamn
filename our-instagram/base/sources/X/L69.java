package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.encryptedbackups.statemanager.model.WrongRecoveryCodeException;
import com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class L69 {
    public final C47227Ku0 A00 = (C47227Ku0) AbstractC47205Kte.A00.getValue();

    public final void A00(Fragment fragment, GoogleAuthController googleAuthController, Exception exc) {
        int i;
        int i2;
        AbstractC46358Kfg k35;
        String message;
        Integer valueOf;
        int i3;
        InterfaceC16820sZ interfaceC16820sZ;
        C14360o3.A0B(exc, 0);
        AbstractC167017dG.A1P(fragment, googleAuthController);
        C47227Ku0 c47227Ku0 = this.A00;
        if (exc instanceof UserRecoverableAuthException) {
            k35 = new K33(((UserRecoverableAuthException) exc).A00());
        } else {
            if (!(exc instanceof C46336KfK) && !(exc instanceof WrongRecoveryCodeException)) {
                if (exc instanceof IOException) {
                    String message2 = exc.getMessage();
                    if (message2 != null && AbstractC001900j.A0a(message2, "storageQuotaExceeded", false)) {
                        AbstractC2056898s abstractC2056898s = c47227Ku0.A00.A00;
                        if (abstractC2056898s != null) {
                            abstractC2056898s.A05("GDRIVE_STORAGE_FULL_ERROR");
                        }
                        k35 = new K34();
                    } else {
                        String message3 = exc.getMessage();
                        if ((message3 == null || !AbstractC001900j.A0a(message3, "rateLimitExceeded", false)) && (message = exc.getMessage()) != null) {
                            AbstractC001900j.A0a(message, "dailyLimitExceeded", false);
                        }
                        String message4 = exc.getMessage();
                        if (message4 != null && AbstractC001900j.A0a(message4, "Bad request: 403", false)) {
                            k35 = new K32(C05F.A00);
                        }
                    }
                }
                i = 2131961250;
                i2 = 2131961249;
            } else {
                i = 2131961236;
                i2 = 2131961235;
            }
            k35 = new K35(i, i2);
        }
        if (k35 instanceof K34) {
            K34 k34 = (K34) k35;
            valueOf = Integer.valueOf(k34.A01);
            i3 = k34.A00;
            interfaceC16820sZ = MFK.A00;
        } else if (k35 instanceof K35) {
            K35 k352 = (K35) k35;
            valueOf = Integer.valueOf(k352.A01);
            i3 = k352.A00;
            interfaceC16820sZ = MFL.A00;
        } else {
            if (k35 instanceof K33) {
                Intent intent = ((K33) k35).A00;
                if (intent == null) {
                    return;
                }
                LRY lry = googleAuthController.A00;
                if (lry != null) {
                    AbstractC166987dD.A1Z(new C57172PZq(lry, fragment, intent, (InterfaceC23621Ds) null, 42), AbstractC25229BEm.A0a(fragment));
                    return;
                } else {
                    C0K8.A0D("GoogleAuthController", "observer is null");
                    return;
                }
            }
            if (k35 instanceof K32) {
                return;
            } else {
                throw B4Z.A00();
            }
        }
        LLQ.A07(fragment, valueOf, interfaceC16820sZ, i3);
    }
}
