package X;

import com.facebook.messaging.lockbox.LockBoxStorageManager;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class LSA implements InterfaceC50417MNt {
    public final /* synthetic */ LK0 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ C15370ps A02;

    public LSA(LK0 lk0, String str, C15370ps c15370ps) {
        this.A00 = lk0;
        this.A02 = c15370ps;
        this.A01 = str;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, X.MNy, X.JyX] */
    @Override // X.InterfaceC50417MNt
    public final /* bridge */ /* synthetic */ void run(Object obj) {
        JSONObject jSONObject;
        C47498KyR c47498KyR = (C47498KyR) obj;
        Integer num = null;
        if (c47498KyR != null) {
            num = c47498KyR.A00;
        }
        if (num == null && c47498KyR != null && (jSONObject = c47498KyR.A01) != null) {
            C15370ps c15370ps = this.A02;
            if (jSONObject.has((String) c15370ps.A00)) {
                jSONObject.remove((String) c15370ps.A00);
                String A19 = AbstractC166987dD.A19(jSONObject);
                ?? obj2 = new Object();
                obj2.A00 = A19;
                C1336761w c1336761w = LockBoxStorageManager.backupManager;
                if (c1336761w == null) {
                    C14360o3.A0F("backupManager");
                    throw C00O.createAndThrow();
                }
                LK0.A01(C1336561u.A00(obj2, EnumC46305Keb.A04, c1336761w.A00.A00, this.A01, false), this.A00, 3);
                return;
            }
        }
        this.A00.A05(false);
    }
}
