package com.shopify.checkout.models;

import X.AbstractC167017dG;
import X.AbstractC25236BEt;
import X.AbstractC58317Pt9;
import X.C14360o3;
import X.C3R9;
import X.C71747X0m;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class Address {
    public static final Companion Companion = new Object();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C71747X0m.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Address) {
                Address address = (Address) obj;
                if (!C14360o3.A0K(this.A09, address.A09) || !C14360o3.A0K(this.A06, address.A06) || !C14360o3.A0K(this.A04, address.A04) || !C14360o3.A0K(this.A05, address.A05) || !C14360o3.A0K(this.A08, address.A08) || !C14360o3.A0K(this.A00, address.A00) || !C14360o3.A0K(this.A01, address.A01) || !C14360o3.A0K(this.A02, address.A02) || !C14360o3.A0K(this.A03, address.A03) || !C14360o3.A0K(this.A0A, address.A0A) || !C14360o3.A0K(this.A07, address.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0O = ((((((((((((((((((AbstractC167017dG.A0O(this.A09) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31;
        String str = this.A07;
        if (str != null) {
            i = str.hashCode();
        }
        return A0O + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address(referenceId=");
        sb.append(this.A09);
        sb.append(", name=");
        sb.append(this.A06);
        sb.append(AbstractC58317Pt9.A00(431));
        sb.append(this.A04);
        sb.append(", lastName=");
        sb.append(this.A05);
        sb.append(", postalCode=");
        sb.append(this.A08);
        sb.append(", address1=");
        sb.append(this.A00);
        sb.append(", address2=");
        sb.append(this.A01);
        sb.append(", city=");
        sb.append(this.A02);
        sb.append(", countryCode=");
        sb.append(this.A03);
        sb.append(", zoneCode=");
        sb.append(this.A0A);
        sb.append(", phone=");
        return AbstractC25236BEt.A0Y(this.A07, sb);
    }

    public /* synthetic */ Address(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i) {
        if ((i & 1) == 0) {
            this.A09 = null;
        } else {
            this.A09 = str;
        }
        if ((i & 2) == 0) {
            this.A06 = null;
        } else {
            this.A06 = str2;
        }
        if ((i & 4) == 0) {
            this.A04 = null;
        } else {
            this.A04 = str3;
        }
        if ((i & 8) == 0) {
            this.A05 = null;
        } else {
            this.A05 = str4;
        }
        if ((i & 16) == 0) {
            this.A08 = null;
        } else {
            this.A08 = str5;
        }
        if ((i & 32) == 0) {
            this.A00 = null;
        } else {
            this.A00 = str6;
        }
        if ((i & 64) == 0) {
            this.A01 = null;
        } else {
            this.A01 = str7;
        }
        if ((i & 128) == 0) {
            this.A02 = null;
        } else {
            this.A02 = str8;
        }
        if ((i & 256) == 0) {
            this.A03 = null;
        } else {
            this.A03 = str9;
        }
        if ((i & 512) == 0) {
            this.A0A = null;
        } else {
            this.A0A = str10;
        }
        if ((i & 1024) == 0) {
            this.A07 = null;
        } else {
            this.A07 = str11;
        }
    }

    public Address(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.A09 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A08 = str5;
        this.A00 = str6;
        this.A01 = str7;
        this.A02 = str8;
        this.A03 = str9;
        this.A0A = str10;
        this.A07 = str11;
    }

    public Address() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }
}
