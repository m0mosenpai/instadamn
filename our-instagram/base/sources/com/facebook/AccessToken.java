package com.facebook;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.AbstractC31171DnF;
import X.AbstractC50523MSb;
import X.AbstractC62766SQd;
import X.JQ0;
import X.Py5;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes10.dex */
public final class AccessToken implements Parcelable {
    public static final Date A08;
    public static final Date A09;
    public static final Date A0A;
    public static final Parcelable.Creator CREATOR;
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final Date A04;
    public final Date A05;
    public final Set A06;
    public final Set A07;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (this.A04.equals(accessToken.A04) && this.A07.equals(accessToken.A07) && this.A06.equals(accessToken.A06) && this.A02.equals(accessToken.A02) && this.A00 == accessToken.A00 && this.A05.equals(accessToken.A05)) {
            String str = this.A01;
            String str2 = accessToken.A01;
            if (str != null ? str.equals(str2) : str2 == null) {
                if (this.A03.equals(accessToken.A03)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int A0K = AbstractC166997dE.A0K(this.A02, (((JQ0.A01(this.A04.hashCode()) + this.A07.hashCode()) * 31) + this.A06.hashCode()) * 31);
        Integer num = this.A00;
        return AbstractC25226BEj.A03(this.A03, (AbstractC166997dE.A0J(this.A05, AbstractC167017dG.A0L(num, AbstractC62766SQd.A01(num), A0K)) + AbstractC167017dG.A0O(this.A01)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A04.getTime());
        parcel.writeStringList(AbstractC166987dD.A1F(this.A07));
        parcel.writeStringList(AbstractC166987dD.A1F(this.A06));
        parcel.writeString(this.A02);
        parcel.writeString(AbstractC62766SQd.A01(this.A00));
        parcel.writeLong(this.A05.getTime());
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
    }

    public AccessToken(Parcel parcel) {
        this.A04 = new Date(parcel.readLong());
        ArrayList A1E = AbstractC166987dD.A1E();
        parcel.readStringList(A1E);
        this.A07 = Collections.unmodifiableSet(AbstractC31171DnF.A0k(A1E));
        A1E.clear();
        parcel.readStringList(A1E);
        this.A06 = Collections.unmodifiableSet(AbstractC31171DnF.A0k(A1E));
        this.A02 = parcel.readString();
        this.A00 = AbstractC62766SQd.A00(parcel.readString());
        this.A05 = new Date(parcel.readLong());
        this.A01 = parcel.readString();
        this.A03 = parcel.readString();
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("{AccessToken");
        A1C.append(" token:");
        if (this.A02 == null) {
            str = "null";
        } else {
            str = "ACCESS_TOKEN_REMOVED";
        }
        A1C.append(str);
        A1C.append(" permissions:");
        Set set = this.A07;
        if (set == null) {
            str2 = "null";
        } else {
            A1C.append("[");
            A1C.append(TextUtils.join(", ", set));
            str2 = "]";
        }
        return AbstractC50523MSb.A0W(str2, A1C);
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        A0A = date;
        A08 = date;
        A09 = new Date();
        CREATOR = Py5.A00(86);
    }

    public AccessToken(Integer num, String str, String str2, String str3, Collection collection, Collection collection2, Date date, Date date2) {
        HashSet A1H;
        HashSet A1H2;
        this.A04 = date == null ? A08 : date;
        if (collection != null) {
            A1H = AbstractC31171DnF.A0k(collection);
        } else {
            A1H = AbstractC166987dD.A1H();
        }
        this.A07 = Collections.unmodifiableSet(A1H);
        if (collection2 != null) {
            A1H2 = AbstractC31171DnF.A0k(collection2);
        } else {
            A1H2 = AbstractC166987dD.A1H();
        }
        this.A06 = Collections.unmodifiableSet(A1H2);
        this.A02 = str;
        this.A00 = num;
        this.A05 = date2 == null ? A09 : date2;
        this.A01 = str2;
        this.A03 = str3;
    }
}
