package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.api.base.CacheBehaviorLogger;
import java.util.HashMap;

/* renamed from: X.RFu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60644RFu extends AbstractC63157Se6 {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;

    public final String toString() {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.A00);
        A1G.put(CacheBehaviorLogger.SOURCE, this.A02);
        A1G.put("medium", this.A03);
        A1G.put("keyword", this.A04);
        A1G.put("content", this.A05);
        A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.A01);
        A1G.put("adNetworkId", this.A06);
        A1G.put("gclid", this.A07);
        A1G.put("dclid", this.A08);
        return AbstractC63157Se6.A01("aclid", this.A09, A1G);
    }
}
