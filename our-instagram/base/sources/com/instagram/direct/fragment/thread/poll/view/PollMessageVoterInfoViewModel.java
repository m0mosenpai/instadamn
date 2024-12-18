package com.instagram.direct.fragment.thread.poll.view;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25233BEq;
import X.C0T6;
import X.C14360o3;
import X.InterfaceC66482zP;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes8.dex */
public final class PollMessageVoterInfoViewModel extends C0T6 implements InterfaceC66482zP, Parcelable {
    public static final Parcelable.Creator CREATOR = LNL.A00(3);
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public PollMessageVoterInfoViewModel(ImageUrl imageUrl, String str, String str2, String str3) {
        AbstractC25233BEq.A0w(1, str, str3, imageUrl);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = imageUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PollMessageVoterInfoViewModel) {
                PollMessageVoterInfoViewModel pollMessageVoterInfoViewModel = (PollMessageVoterInfoViewModel) obj;
                if (!C14360o3.A0K(this.A01, pollMessageVoterInfoViewModel.A01) || !C14360o3.A0K(this.A02, pollMessageVoterInfoViewModel.A02) || !C14360o3.A0K(this.A03, pollMessageVoterInfoViewModel.A03) || !C14360o3.A0K(this.A00, pollMessageVoterInfoViewModel.A00)) {
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
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0K(this.A03, (AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0O(this.A02)) * 31));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
