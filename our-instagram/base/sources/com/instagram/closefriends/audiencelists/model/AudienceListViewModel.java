package com.instagram.closefriends.audiencelists.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25229BEm;
import X.AbstractC25231BEo;
import X.AbstractC25234BEr;
import X.C0T6;
import X.C14360o3;
import X.InterfaceC66482zP;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class AudienceListViewModel extends C0T6 implements InterfaceC66482zP, Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(9);
    public final int A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudienceListViewModel) {
                AudienceListViewModel audienceListViewModel = (AudienceListViewModel) obj;
                if (!C14360o3.A0K(this.A01, audienceListViewModel.A01) || !C14360o3.A0K(this.A02, audienceListViewModel.A02) || this.A00 != audienceListViewModel.A00 || !C14360o3.A0K(this.A03, audienceListViewModel.A03) || this.A05 != audienceListViewModel.A05 || this.A06 != audienceListViewModel.A06 || this.A04 != audienceListViewModel.A04) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A03);
        while (A0u.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0u, i);
        }
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A04, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0J(this.A03, (AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A01)) + this.A00) * 31))));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        AudienceListViewModel audienceListViewModel = (AudienceListViewModel) obj;
        String str2 = this.A01;
        if (audienceListViewModel != null) {
            str = audienceListViewModel.A01;
        } else {
            str = null;
        }
        if (C14360o3.A0K(str2, str) && C14360o3.A0K(this.A02, audienceListViewModel.A02) && this.A00 == audienceListViewModel.A00 && C14360o3.A0K(this.A03, audienceListViewModel.A03) && this.A05 == audienceListViewModel.A05 && this.A06 == audienceListViewModel.A06 && this.A04 == audienceListViewModel.A04) {
            return true;
        }
        return false;
    }

    public AudienceListViewModel(String str, String str2, List list, int i, boolean z, boolean z2, boolean z3) {
        AbstractC25234BEr.A1P(str, str2, list);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
        this.A03 = list;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = z3;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }
}
