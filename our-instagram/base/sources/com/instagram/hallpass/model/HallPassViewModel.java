package com.instagram.hallpass.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.AbstractC25229BEm;
import X.AbstractC25231BEo;
import X.C0T6;
import X.C14360o3;
import X.InterfaceC66482zP;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class HallPassViewModel extends C0T6 implements InterfaceC66482zP, Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(99);
    public boolean A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HallPassViewModel) {
                HallPassViewModel hallPassViewModel = (HallPassViewModel) obj;
                if (!C14360o3.A0K(this.A04, hallPassViewModel.A04) || !C14360o3.A0K(this.A05, hallPassViewModel.A05) || !C14360o3.A0K(this.A03, hallPassViewModel.A03) || this.A01 != hallPassViewModel.A01 || this.A02 != hallPassViewModel.A02 || !C14360o3.A0K(this.A06, hallPassViewModel.A06) || this.A00 != hallPassViewModel.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A06);
        while (A0u.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0u, i);
        }
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A00, AbstractC166997dE.A0J(this.A06, (((AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A05, AbstractC166987dD.A0J(this.A04))) + this.A01) * 31) + this.A02) * 31));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        HallPassViewModel hallPassViewModel = (HallPassViewModel) obj;
        String str2 = this.A04;
        if (hallPassViewModel != null) {
            str = hallPassViewModel.A04;
        } else {
            str = null;
        }
        if (C14360o3.A0K(str2, str) && C14360o3.A0K(this.A05, hallPassViewModel.A05) && this.A01 == hallPassViewModel.A01 && this.A02 == hallPassViewModel.A02 && C14360o3.A0K(this.A06, hallPassViewModel.A06) && this.A00 == hallPassViewModel.A00) {
            return true;
        }
        return false;
    }

    public HallPassViewModel(String str, String str2, String str3, List list, int i, int i2, boolean z) {
        AbstractC167027dH.A13(str, str2, str3);
        C14360o3.A0B(list, 6);
        this.A04 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A01 = i;
        this.A02 = i2;
        this.A06 = list;
        this.A00 = z;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A04;
    }
}
