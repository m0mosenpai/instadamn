package X;

import android.content.IntentSender;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsResult;

/* loaded from: classes10.dex */
public final class T57 implements InterfaceC65404Tjb {
    public final /* synthetic */ C60930Rbk A00;

    public T57(C60930Rbk c60930Rbk) {
        this.A00 = c60930Rbk;
    }

    @Override // X.InterfaceC65404Tjb
    public final /* bridge */ /* synthetic */ void Dgz(C61j c61j) {
        Integer num;
        String str;
        Status status = ((LocationSettingsResult) c61j).A00;
        int i = status.A00;
        if (i != 0) {
            if (i != 6) {
                this.A00.A00.A09();
                num = C05F.A0N;
            } else {
                try {
                    C60930Rbk c60930Rbk = this.A00;
                    c60930Rbk.A00.A09();
                    c60930Rbk.A01 = true;
                    status.A00(c60930Rbk.A03, 5005);
                    return;
                } catch (IntentSender.SendIntentException e) {
                    C0K8.A0G("GooglePlayLocationSettingsControllerImpl", "Error starting google play services location dialog", e);
                    num = C05F.A0Y;
                }
            }
        } else {
            this.A00.A00.A09();
            num = C05F.A0C;
        }
        C60930Rbk c60930Rbk2 = this.A00;
        c60930Rbk2.A06.D2r(num);
        SKQ skq = c60930Rbk2.A04;
        String A00 = C60930Rbk.A00(c60930Rbk2);
        switch (num.intValue()) {
            case 2:
                str = "DIALOG_NOT_NEEDED";
                break;
            case 3:
                str = "DIALOG_NOT_POSSIBLE";
                break;
            default:
                str = "UNKNOWN_FAILURE";
                break;
        }
        skq.A00(A00, str);
        c60930Rbk2.A05.A01.clear();
    }
}
