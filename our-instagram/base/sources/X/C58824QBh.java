package X;

import com.facebook.AccessToken;
import java.util.Date;
import org.json.JSONException;

/* renamed from: X.QBh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58824QBh extends AbstractC63252Sg8 {
    public AccessToken A00;
    public Date A01 = new Date(0);
    public final C019707r A02;
    public final C62405SAe A03;

    public C58824QBh(C019707r c019707r, C62405SAe c62405SAe) {
        this.A02 = c019707r;
        this.A03 = c62405SAe;
        String str = c62405SAe.A00;
        C14360o3.A0B(str, 0);
        C17320tT A00 = C1AT.A00(C1AV.A1K, str);
        AccessToken accessToken = null;
        String string = A00.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string != null) {
            try {
                accessToken = AbstractC62765SQc.A00(AbstractC58318PtA.A17(string));
            } catch (JSONException unused) {
            }
        }
        this.A00 = accessToken;
    }
}
