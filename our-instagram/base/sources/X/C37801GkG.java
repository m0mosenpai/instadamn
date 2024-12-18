package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.GkG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37801GkG extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final InterfaceC09390do A05 = AbstractC37302Gc3.A0m(this, 13);
    public final int A06;
    public final String A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37801GkG) {
                C37801GkG c37801GkG = (C37801GkG) obj;
                if (this.A02 != c37801GkG.A02 || !C14360o3.A0K(this.A03, c37801GkG.A03) || this.A00 != c37801GkG.A00 || !C14360o3.A0K(this.A04, c37801GkG.A04) || this.A01 != c37801GkG.A01 || !C14360o3.A0K(this.A08, c37801GkG.A08) || this.A06 != c37801GkG.A06 || !C14360o3.A0K(this.A07, c37801GkG.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((AbstractC166997dE.A0K(this.A03, this.A02 * 31) + this.A00) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + this.A01) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + this.A06) * 31) + AbstractC25227BEk.A07(this.A07);
    }

    public C37801GkG(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4) {
        this.A02 = i;
        this.A03 = str;
        this.A00 = i2;
        this.A04 = str2;
        this.A01 = i3;
        this.A08 = str3;
        this.A06 = i4;
        this.A07 = str4;
    }

    public final String A00() {
        StringWriter A0O = AbstractC37300Gc1.A0O();
        try {
            C17z A0S = AbstractC167007dF.A0S(A0O);
            A0S.A0Q("total_num_items", this.A02);
            String str = this.A04;
            if (str != null) {
                A0S.A0r("last_non_organic_item");
                A0S.A0d();
                A0S.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
                A0S.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 2);
                A0S.A0Q("index", this.A01);
                A0S.A0a();
            }
            A0S.A0r("last_organic_item");
            A0S.A0d();
            A0S.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.A03);
            A0S.A0Q("index", this.A00);
            A0S.A0a();
            A0S.A0a();
            A0S.close();
        } catch (IOException e) {
            C0K8.A0F("ClipsApiUtil", "Error writing pagination info to request createPagingTokenString", e);
        }
        return AbstractC166987dD.A19(A0O);
    }

    public final String A01() {
        StringWriter A0O = AbstractC37300Gc1.A0O();
        try {
            C17z A0S = AbstractC167007dF.A0S(A0O);
            A0S.A0Q("total_num_items", this.A02);
            String str = this.A04;
            if (str != null || this.A08 != null) {
                A0S.A0M("last_non_organic_items");
                if (str != null) {
                    A0S.A0d();
                    A0S.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
                    A0S.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 2);
                    A0S.A0Q("index", this.A01);
                    A0S.A0a();
                }
                String str2 = this.A08;
                if (str2 != null) {
                    A0S.A0d();
                    A0S.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2);
                    A0S.A0S("host_media_id", this.A07);
                    A0S.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 5);
                    A0S.A0Q("index", this.A06);
                    A0S.A0a();
                }
                A0S.A0Z();
            }
            A0S.A0r("last_organic_item");
            A0S.A0d();
            A0S.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.A03);
            A0S.A0Q("index", this.A00);
            A0S.A0a();
            A0S.A0a();
            A0S.close();
        } catch (IOException e) {
            C0K8.A0F("ClipsApiUtil", "Error writing pagination info to request createPagingTokenStringV2", e);
        }
        return AbstractC166987dD.A19(A0O);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ClipsPagingTokenInfo(totalNumItems=");
        A1C.append(this.A02);
        A1C.append(", lastOrganicId=");
        A1C.append(this.A03);
        A1C.append(", lastOrganicPosition=");
        A1C.append(this.A00);
        A1C.append(", lastSponsoredId=");
        A1C.append(this.A04);
        A1C.append(AbstractC111324zv.A00(3399));
        A1C.append(this.A01);
        A1C.append(", lastOverlayAdId=");
        A1C.append(this.A08);
        A1C.append(", lastOverlayAdPosition=");
        A1C.append(this.A06);
        A1C.append(", lastOverlayAdHostingMediaId=");
        return AbstractC25236BEt.A0Y(this.A07, A1C);
    }
}
