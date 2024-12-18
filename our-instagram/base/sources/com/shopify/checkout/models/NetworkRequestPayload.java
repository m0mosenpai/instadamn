package com.shopify.checkout.models;

import X.AbstractC167017dG;
import X.AbstractC25236BEt;
import X.AbstractC43591JPw;
import X.AbstractC68612VXn;
import X.C00O;
import X.C14360o3;
import X.C3R9;
import X.C3RD;
import X.C3RL;
import X.X12;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class NetworkRequestPayload {
    public static final C3R9[] A06;
    public static final Companion Companion = new Object();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final Map A05;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return X12.A00;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.shopify.checkout.models.NetworkRequestPayload$Companion] */
    static {
        C3RD c3rd = C3RD.A01;
        A06 = new C3R9[]{null, null, null, new C3RL(c3rd, c3rd), null, null};
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NetworkRequestPayload) {
                NetworkRequestPayload networkRequestPayload = (NetworkRequestPayload) obj;
                if (!C14360o3.A0K(this.A04, networkRequestPayload.A04) || !C14360o3.A0K(this.A02, networkRequestPayload.A02) || !C14360o3.A0K(this.A00, networkRequestPayload.A00) || !C14360o3.A0K(this.A05, networkRequestPayload.A05) || !C14360o3.A0K(this.A01, networkRequestPayload.A01) || !C14360o3.A0K(this.A03, networkRequestPayload.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ NetworkRequestPayload(String str, String str2, String str3, String str4, String str5, Map map, int i) {
        if (63 != (i & 63)) {
            AbstractC68612VXn.A00(X12.A01, i, 63);
            throw C00O.createAndThrow();
        }
        this.A04 = str;
        this.A02 = str2;
        this.A00 = str3;
        this.A05 = map;
        this.A01 = str4;
        this.A03 = str5;
    }

    public final int hashCode() {
        int i = 0;
        int A0O = ((((((((AbstractC167017dG.A0O(this.A04) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31;
        String str = this.A03;
        if (str != null) {
            i = str.hashCode();
        }
        return A0O + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NetworkRequestPayload(url=");
        sb.append(this.A04);
        sb.append(", method=");
        sb.append(this.A02);
        sb.append(", body=");
        sb.append(this.A00);
        sb.append(AbstractC43591JPw.A00(229));
        sb.append(this.A05);
        sb.append(", initiatorType=");
        sb.append(this.A01);
        sb.append(AbstractC43591JPw.A00(233));
        return AbstractC25236BEt.A0Y(this.A03, sb);
    }
}
