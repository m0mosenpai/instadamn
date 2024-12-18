package com.google.android.gms.auth.api.signin;

import X.AbstractC128825rw;
import X.AbstractC166987dD;
import X.AbstractC31171DnF;
import X.AbstractC58319PtB;
import X.C63474SlF;
import X.C64233T5i;
import X.InterfaceC65253Tgj;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Deprecated
/* loaded from: classes10.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public String A00;
    public final int A01;
    public final long A02;
    public final Uri A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final Set A0C = AbstractC166987dD.A1H();
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(18);
    public static final InterfaceC65253Tgj A0D = C64233T5i.A00;

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj != this) {
                if (obj instanceof GoogleSignInAccount) {
                    GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
                    if (googleSignInAccount.A08.equals(this.A08)) {
                        HashSet A0k = AbstractC31171DnF.A0k(googleSignInAccount.A0B);
                        A0k.addAll(googleSignInAccount.A0C);
                        HashSet A0k2 = AbstractC31171DnF.A0k(this.A0B);
                        A0k2.addAll(this.A0C);
                        if (A0k.equals(A0k2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.A08.hashCode() + 527;
        HashSet A0k = AbstractC31171DnF.A0k(this.A0B);
        A0k.addAll(this.A0C);
        return (hashCode * 31) + A0k.hashCode();
    }

    public GoogleSignInAccount(Uri uri, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i, long j) {
        this.A01 = i;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A03 = uri;
        this.A00 = str5;
        this.A02 = j;
        this.A08 = str6;
        this.A0B = list;
        this.A09 = str7;
        this.A0A = str8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A05(parcel, this.A01);
        AbstractC128825rw.A0B(parcel, this.A04);
        AbstractC128825rw.A0C(parcel, this.A05, 3, false);
        AbstractC128825rw.A0C(parcel, this.A06, 4, false);
        AbstractC128825rw.A0C(parcel, this.A07, 5, false);
        AbstractC128825rw.A0A(parcel, this.A03, 6, i, false);
        AbstractC128825rw.A0C(parcel, this.A00, 7, false);
        AbstractC128825rw.A08(parcel, 8, this.A02);
        AbstractC128825rw.A0C(parcel, this.A08, 9, false);
        AbstractC128825rw.A0E(parcel, this.A0B, 10, false);
        AbstractC128825rw.A0C(parcel, this.A09, 11, false);
        AbstractC128825rw.A0C(parcel, this.A0A, 12, false);
        AbstractC128825rw.A06(parcel, A04);
    }
}
