package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class W63 {
    public final int A00;
    public final long A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final Collection A08;
    public final HashMap A09;
    public final Map A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AbstractC167017dG.A1Z(this, obj)) {
                return false;
            }
            W63 w63 = (W63) obj;
            if (this.A01 != w63.A01 || !C14360o3.A0K(this.A05, w63.A05) || !C14360o3.A0K(this.A03, w63.A03) || AbstractC50522MSa.A03(this.A02.intValue()) != AbstractC50522MSa.A03(w63.A02.intValue()) || this.A00 != w63.A00 || !VML.A00(this.A07, w63.A07) || !VML.A00(this.A04, w63.A04) || !VML.A00(this.A09, w63.A09) || !VML.A00(this.A0A, w63.A0A) || !VML.A00(this.A08, w63.A08) || !VML.A00(this.A06, w63.A06)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A05, this.A03, Integer.valueOf(AbstractC50522MSa.A03(this.A02.intValue())), Long.valueOf(this.A01), this.A07, this.A04, this.A09, Integer.valueOf(this.A00), this.A0A, this.A08, this.A06});
    }

    public W63(JSONObject jSONObject) {
        Integer num;
        this.A05 = jSONObject.optString("mSuccessfulResult", "");
        this.A03 = jSONObject.optString("mResponse", "");
        String string = jSONObject.getString("mDedupState");
        C14360o3.A07(string);
        int parseInt = Integer.parseInt(string);
        if (parseInt != 1) {
            if (parseInt != 2) {
                num = C05F.A00;
            } else {
                num = C05F.A0C;
            }
        } else {
            num = C05F.A01;
        }
        this.A02 = num;
        String optString = jSONObject.optString("mUploadId", "");
        this.A07 = AbstractC167007dF.A1N(optString.length()) ? null : optString;
        String optString2 = jSONObject.optString("mStatus", "");
        this.A04 = optString2.length() == 0 ? null : optString2;
        String optString3 = jSONObject.optString("mUploadDomain", "");
        this.A06 = optString3.length() == 0 ? null : optString3;
        C14360o3.A07(jSONObject.getString("mDedupDigestComputeTimeMs"));
        this.A01 = Integer.parseInt(r0);
        this.A09 = null;
        this.A08 = null;
        this.A0A = AbstractC06930Yk.A0E();
        this.A00 = jSONObject.optInt("mStatusCode", 0);
    }

    public final JSONObject A00() {
        JSONObject A0q = AbstractC31171DnF.A0q();
        A0q.put("mSuccessfulResult", this.A05);
        A0q.put("mResponse", this.A03);
        A0q.put("mDedupState", AbstractC50522MSa.A03(this.A02.intValue()));
        A0q.put("mUploadId", this.A07);
        A0q.put("mStatus", this.A04);
        A0q.put("mUploadDomain", this.A06);
        A0q.put("mDedupDigestComputeTimeMs", this.A01);
        A0q.put("mStatusCode", this.A00);
        return A0q;
    }

    public final String toString() {
        String str;
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("mSuccessfulResult", this.A05);
        A1G.put("mResponse", this.A03);
        switch (this.A02.intValue()) {
            case 0:
                str = "NOT_ATTEMPTED";
                break;
            case 1:
                str = "FOUND";
                break;
            default:
                str = "NOT_FOUND";
                break;
        }
        A1G.put("mDedupState", str);
        A1G.put("mUploadId", this.A07);
        A1G.put("mStatus", this.A04);
        HashMap hashMap = this.A09;
        String str2 = null;
        if (hashMap != null) {
            str2 = hashMap.toString();
        }
        A1G.put("xSharingNonces", str2);
        A1G.put("mStatusCode", String.valueOf(this.A00));
        A1G.put("mResponseHeaders", this.A0A.toString());
        return A1G.toString();
    }

    public W63(Integer num, String str, String str2, String str3, String str4, String str5, ArrayList arrayList, HashMap hashMap, Map map, int i, long j) {
        C14360o3.A0B(str, 1);
        this.A05 = str;
        this.A03 = str2;
        this.A02 = num;
        this.A01 = j;
        this.A07 = str3;
        this.A06 = str5;
        this.A04 = str4;
        this.A09 = hashMap;
        this.A08 = arrayList;
        this.A00 = i;
        this.A0A = map;
    }
}
