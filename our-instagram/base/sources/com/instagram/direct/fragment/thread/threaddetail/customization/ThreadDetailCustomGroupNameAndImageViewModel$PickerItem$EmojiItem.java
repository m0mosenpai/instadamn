package com.instagram.direct.fragment.thread.threaddetail.customization;

import X.AbstractC166987dD;
import X.AbstractC25226BEj;
import X.AbstractC25231BEo;
import X.AbstractC27436C9e;
import X.C14360o3;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem extends AbstractC27436C9e implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNL.A00(4);
    public final String A00;
    public final List A01;

    public ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem(List list, String str) {
        C14360o3.A0B(str, 2);
        this.A01 = list;
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem) {
                ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem threadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem = (ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem) obj;
                if (!C14360o3.A0K(this.A01, threadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem.A01) || !C14360o3.A0K(this.A00, threadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A01);
        while (A0u.hasNext()) {
            parcel.writeValue(A0u.next());
        }
        parcel.writeString(this.A00);
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A00, AbstractC166987dD.A0G(this.A01));
    }
}
