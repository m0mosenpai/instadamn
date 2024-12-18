package X;

import com.facebook.messaging.lockbox.LockBoxStorageManager;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class LSH implements InterfaceC50417MNt {
    public final /* synthetic */ LK0 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public LSH(LK0 lk0, String str, String str2, String str3) {
        this.A00 = lk0;
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, X.MNy, X.JyX] */
    @Override // X.InterfaceC50417MNt
    public final /* bridge */ /* synthetic */ void run(Object obj) {
        JSONObject jSONObject;
        C47498KyR c47498KyR = (C47498KyR) obj;
        Integer num = null;
        if (c47498KyR != null && c47498KyR.A00 == null && (jSONObject = c47498KyR.A01) != null) {
            try {
                String str = this.A01;
                String A1A = AbstractC166987dD.A1A(str, AbstractC1336861y.A02);
                if (A1A != null) {
                    str = A1A;
                }
                jSONObject.putOpt(str, this.A03);
                String A19 = AbstractC166987dD.A19(jSONObject);
                ?? obj2 = new Object();
                obj2.A00 = A19;
                C1336761w c1336761w = LockBoxStorageManager.backupManager;
                if (c1336761w == null) {
                    C14360o3.A0F("backupManager");
                    throw C00O.createAndThrow();
                }
                LK0.A01(C1336561u.A00(obj2, EnumC46305Keb.A04, c1336761w.A00.A00, this.A02, false), this.A00, 5);
                return;
            } catch (JSONException unused) {
                this.A00.A05(7);
                return;
            }
        }
        LockBoxStorageManager lockBoxStorageManager = LockBoxStorageManager.INSTANCE;
        LK0 lk0 = this.A00;
        if (c47498KyR != null) {
            num = c47498KyR.A00;
        }
        lockBoxStorageManager.nullableComplete(lk0, num);
    }
}
