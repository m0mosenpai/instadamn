package com.instagram.api.schemas;

import X.AbstractC37403Gdj;
import X.C0T6;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes.dex */
public final class MediaReminderImpl extends C0T6 implements Parcelable, MediaReminder {
    public static final Parcelable.Creator CREATOR = new C206159Ax(45);
    public final Boolean A00;
    public final Integer A01;

    @Override // com.instagram.api.schemas.MediaReminder
    public final MediaReminderImpl EwT() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MediaReminderImpl) {
                MediaReminderImpl mediaReminderImpl = (MediaReminderImpl) obj;
                if (!C14360o3.A0K(this.A01, mediaReminderImpl.A01) || !C14360o3.A0K(this.A00, mediaReminderImpl.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A01;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.A00;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Integer num = this.A01;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool = this.A00;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    @Override // com.instagram.api.schemas.MediaReminder
    public final Integer B36() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.MediaReminder
    public final Boolean Cbn() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.MediaReminder
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGAdMediaReminderInfo", AbstractC37403Gdj.A00(this));
    }

    public MediaReminderImpl(Boolean bool, Integer num) {
        this.A01 = num;
        this.A00 = bool;
    }
}
