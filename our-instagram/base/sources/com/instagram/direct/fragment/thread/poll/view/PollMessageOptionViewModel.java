package com.instagram.direct.fragment.thread.poll.view;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25231BEo;
import X.AbstractC25233BEq;
import X.AbstractC25235BEs;
import X.C0T6;
import X.C14360o3;
import X.InterfaceC66482zP;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class PollMessageOptionViewModel extends C0T6 implements InterfaceC66482zP, Parcelable {
    public static final Parcelable.Creator CREATOR = LNL.A00(2);
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final boolean A06;

    public PollMessageOptionViewModel(String str, String str2, String str3, List list, int i, long j, boolean z) {
        AbstractC25233BEq.A0w(2, str, str2, str3);
        this.A01 = j;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A06 = z;
        this.A05 = list;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PollMessageOptionViewModel) {
                PollMessageOptionViewModel pollMessageOptionViewModel = (PollMessageOptionViewModel) obj;
                if (this.A01 != pollMessageOptionViewModel.A01 || !C14360o3.A0K(this.A03, pollMessageOptionViewModel.A03) || !C14360o3.A0K(this.A04, pollMessageOptionViewModel.A04) || !C14360o3.A0K(this.A02, pollMessageOptionViewModel.A02) || this.A06 != pollMessageOptionViewModel.A06 || !C14360o3.A0K(this.A05, pollMessageOptionViewModel.A05) || this.A00 != pollMessageOptionViewModel.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A06 ? 1 : 0);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A05);
        while (A0u.hasNext()) {
            ((PollMessageVoterInfoViewModel) A0u.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A00);
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A04;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A05, AbstractC167007dF.A0D(this.A06, AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A03, AbstractC25235BEs.A03(this.A01)))))) + this.A00;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
