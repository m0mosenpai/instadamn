package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37403Gdj;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoMediaReminder extends C17T implements MediaReminder {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(18);

    @Override // com.instagram.api.schemas.MediaReminder
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC37403Gdj.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.MediaReminder
    public final Integer B36() {
        return getOptionalIntValueByHashCode(-939987875);
    }

    @Override // com.instagram.api.schemas.MediaReminder
    public final Boolean Cbn() {
        return getOptionalBooleanValueByHashCode(-764824566);
    }

    @Override // com.instagram.api.schemas.MediaReminder
    public final MediaReminderImpl EwT() {
        return new MediaReminderImpl(getOptionalBooleanValueByHashCode(-764824566), getOptionalIntValueByHashCode(-939987875));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
