package X;

import android.content.Context;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SPP {
    public final Context A00;
    public final C63174SeZ A01;
    public final C62559SGk A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final Map A07;
    public final Map A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SPP) {
                SPP spp = (SPP) obj;
                if (!C14360o3.A0K(this.A00, spp.A00) || !C14360o3.A0K(this.A01, spp.A01) || !C14360o3.A0K(this.A04, spp.A04) || !C14360o3.A0K(this.A05, spp.A05) || !C14360o3.A0K(this.A09, spp.A09) || !C14360o3.A0K(this.A0A, spp.A0A) || !C14360o3.A0K(this.A0B, spp.A0B) || !C14360o3.A0K(this.A06, spp.A06) || !C14360o3.A0K(this.A03, spp.A03) || !C14360o3.A0K(this.A07, spp.A07) || !C14360o3.A0K(this.A08, spp.A08) || !C14360o3.A0K(this.A02, spp.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A02, (AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0K(this.A03, (((((((AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00)))) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31)) + AbstractC167017dG.A0M(this.A08)) * 31);
    }

    public SPP(Context context, C63174SeZ c63174SeZ, C62559SGk c62559SGk, String str, String str2, String str3, String str4, String str5, String str6, List list, Map map, Map map2) {
        AbstractC37302Gc3.A1U(str, str2);
        C14360o3.A0B(str6, 9);
        C14360o3.A0B(map, 10);
        this.A00 = context;
        this.A01 = c63174SeZ;
        this.A04 = str;
        this.A05 = str2;
        this.A09 = str3;
        this.A0A = str4;
        this.A0B = str5;
        this.A06 = list;
        this.A03 = str6;
        this.A07 = map;
        this.A08 = map2;
        this.A02 = c62559SGk;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PttGenerationParams(context=");
        A1C.append(this.A00);
        A1C.append(", pttManager=");
        A1C.append(this.A01);
        A1C.append(", paymentType=");
        A1C.append(this.A04);
        A1C.append(", uplSessionId=");
        A1C.append(this.A05);
        A1C.append(", authTicketClientId=");
        A1C.append(this.A09);
        A1C.append(", certificate=");
        A1C.append(this.A0A);
        A1C.append(", encryptionKeyId=");
        A1C.append(this.A0B);
        A1C.append(", encryptionKeyTrustChain=");
        A1C.append(this.A06);
        A1C.append(", operation=");
        A1C.append(this.A03);
        A1C.append(", payload=");
        A1C.append(this.A07);
        A1C.append(", sensitiveKeyMap=");
        A1C.append(this.A08);
        A1C.append(", pttObserver=");
        A1C.append(this.A02);
        A1C.append(", authTicketType=");
        return AbstractC25236BEt.A0Y(null, A1C);
    }
}
