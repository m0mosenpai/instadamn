package com.instagram.hallpass.model;

import X.AbstractC166987dD;
import X.C0T6;
import X.C14360o3;
import X.InterfaceC66482zP;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class HallPassMemberViewModel extends C0T6 implements InterfaceC66482zP, Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(98);
    public final User A00;
    public final boolean A01;

    public HallPassMemberViewModel(User user, boolean z) {
        C14360o3.A0B(user, 1);
        this.A00 = user;
        this.A01 = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HallPassMemberViewModel) {
                HallPassMemberViewModel hallPassMemberViewModel = (HallPassMemberViewModel) obj;
                if (!C14360o3.A0K(this.A00, hallPassMemberViewModel.A00) || this.A01 != hallPassMemberViewModel.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.getId();
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        User user;
        HallPassMemberViewModel hallPassMemberViewModel = (HallPassMemberViewModel) obj;
        String id = this.A00.getId();
        if (hallPassMemberViewModel != null && (user = hallPassMemberViewModel.A00) != null) {
            str = user.getId();
        } else {
            str = null;
        }
        if (C14360o3.A0K(id, str) && this.A01 == hallPassMemberViewModel.A01) {
            return true;
        }
        return false;
    }
}
