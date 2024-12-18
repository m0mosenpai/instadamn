package X;

import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.7dR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167127dR extends C0T6 implements InterfaceC166427cB {
    public final User A00;
    public final InterfaceC37213GaO A01;
    public final String A02;
    public final String A03;
    public final JSONObject A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C167127dR) {
                C167127dR c167127dR = (C167127dR) obj;
                if (!C14360o3.A0K(this.A02, c167127dR.A02) || !C14360o3.A0K(this.A03, c167127dR.A03) || !C14360o3.A0K(this.A00, c167127dR.A00) || !C14360o3.A0K(this.A01, c167127dR.A01) || !C14360o3.A0K(this.A04, c167127dR.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A02.hashCode() * 31;
        String str = this.A03;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.A00.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A04.hashCode();
    }

    public C167127dR(User user, InterfaceC37213GaO interfaceC37213GaO, String str, String str2, JSONObject jSONObject) {
        this.A02 = str;
        this.A03 = str2;
        this.A00 = user;
        this.A01 = interfaceC37213GaO;
        this.A04 = jSONObject;
    }
}
