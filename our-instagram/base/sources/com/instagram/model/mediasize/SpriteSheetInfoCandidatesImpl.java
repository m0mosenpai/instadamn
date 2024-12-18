package com.instagram.model.mediasize;

import X.AbstractC06930Yk;
import X.C0T6;
import X.C14360o3;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class SpriteSheetInfoCandidatesImpl extends C0T6 implements Parcelable, SpriteSheetInfoCandidates {
    public static final Parcelable.Creator CREATOR = new C9Ay(18);
    public final SpritesheetInfo A00;

    @Override // com.instagram.model.mediasize.SpriteSheetInfoCandidates
    public final SpriteSheetInfoCandidatesImpl F5C() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof SpriteSheetInfoCandidatesImpl) && C14360o3.A0K(this.A00, ((SpriteSheetInfoCandidatesImpl) obj).A00));
    }

    public final int hashCode() {
        SpritesheetInfo spritesheetInfo = this.A00;
        if (spritesheetInfo == null) {
            return 0;
        }
        return spritesheetInfo.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.model.mediasize.SpriteSheetInfoCandidates
    public final SpritesheetInfo CIq() {
        return this.A00;
    }

    @Override // com.instagram.model.mediasize.SpriteSheetInfoCandidates
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (CIq() != null) {
            SpritesheetInfo CIq = CIq();
            if (CIq != null) {
                treeUpdaterJNI = CIq.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, treeUpdaterJNI);
        }
        return new TreeUpdaterJNI("XDTSpriteSheetInfoCandidates", AbstractC06930Yk.A0B(linkedHashMap));
    }

    public SpriteSheetInfoCandidatesImpl(SpritesheetInfo spritesheetInfo) {
        this.A00 = spritesheetInfo;
    }
}
