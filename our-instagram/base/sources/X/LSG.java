package X;

import com.facebook.messaging.lockbox.LockBoxStorageManager;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class LSG implements InterfaceC50417MNt {
    public final /* synthetic */ LK0 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ C15370ps A03;

    public LSG(LK0 lk0, String str, String str2, C15370ps c15370ps) {
        this.A00 = lk0;
        this.A03 = c15370ps;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // X.InterfaceC50417MNt
    public final /* bridge */ /* synthetic */ void run(Object obj) {
        JSONObject jSONObject;
        LK0 recoveryCodeFromLegacyLocation;
        C47498KyR c47498KyR = (C47498KyR) obj;
        String str = null;
        if (c47498KyR != null && c47498KyR.A00 == null && (jSONObject = c47498KyR.A01) != null && (((str = jSONObject.optString((String) this.A03.A00)) == null || str.length() == 0) && C14360o3.A0K(this.A01, "rc"))) {
            recoveryCodeFromLegacyLocation = LockBoxStorageManager.INSTANCE.getRecoveryCodeFromLegacyLocation(this.A02);
            LK0.A01(recoveryCodeFromLegacyLocation, this.A00, 4);
        } else {
            LockBoxStorageManager.INSTANCE.nullableComplete(this.A00, str);
        }
    }
}
