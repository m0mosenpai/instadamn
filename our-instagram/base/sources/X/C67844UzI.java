package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.UzI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67844UzI extends C40781ul {
    public C69665Vt6 A00;
    public Integer A01;

    public final C69665Vt6 A00() {
        C69665Vt6 c69665Vt6 = this.A00;
        if (c69665Vt6 != null) {
            return c69665Vt6;
        }
        C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
        throw C00O.createAndThrow();
    }

    public final Integer A01() {
        Integer num = this.A01;
        if (num != null) {
            return num;
        }
        C14360o3.A0F("payloadType");
        throw C00O.createAndThrow();
    }
}
