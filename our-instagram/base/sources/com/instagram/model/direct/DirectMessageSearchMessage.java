package com.instagram.model.direct;

import X.AbstractC167007dF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class DirectMessageSearchMessage implements DirectSearchResult {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(61);
    public long A00;
    public long A01;
    public long A02;
    public ImmutableList A03;
    public ImmutableList A04;
    public ImageUrl A05;
    public ImageUrl A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;

    public DirectMessageSearchMessage(ImmutableList immutableList, ImmutableList immutableList2, ImageUrl imageUrl, ImageUrl imageUrl2, String str, String str2, String str3, String str4, String str5, long j, long j2, long j3) {
        AbstractC167007dF.A1H(str3, 3, str4);
        C14360o3.A0B(immutableList, 9);
        C14360o3.A0B(immutableList2, 10);
        this.A07 = str;
        this.A08 = str2;
        this.A0B = str3;
        this.A05 = imageUrl;
        this.A06 = imageUrl2;
        this.A02 = j;
        this.A09 = str4;
        this.A0A = str5;
        this.A03 = immutableList;
        this.A04 = immutableList2;
        this.A01 = j2;
        this.A00 = j3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0B);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A06, i);
        parcel.writeLong(this.A02);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeList(this.A03);
        parcel.writeList(this.A04);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }

    public final boolean A00() {
        ImmutableList immutableList = this.A04;
        if ((immutableList instanceof Collection) && immutableList.isEmpty()) {
            return false;
        }
        Iterator<E> it = immutableList.iterator();
        while (it.hasNext()) {
            PendingRecipient A0p = AbstractC31172DnG.A0p(it);
            C14360o3.A0A(A0p);
            if (A0p.A02 == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // com.instagram.model.direct.DirectSearchResult
    public final String AEL() {
        return AbstractC31173DnH.A0r("| %-30s | name: %-50s | thread id: %-60s|", "DirectMessageSearchMessage", this.A0B, this.A09);
    }
}
