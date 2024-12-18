package com.instagram.model.mediasize;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class ImmutablePandoSpriteSheetInfoCandidates extends C17T implements SpriteSheetInfoCandidates {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(43);

    @Override // com.instagram.model.mediasize.SpriteSheetInfoCandidates
    public final SpritesheetInfo CIq() {
        return (SpritesheetInfo) A05(1544803905, ImmutablePandoSpritesheetInfo.class);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.mediasize.SpriteSheetInfoCandidates
    public final SpriteSheetInfoCandidatesImpl F5C() {
        SpritesheetInfoImpl spritesheetInfoImpl;
        SpritesheetInfo CIq = CIq();
        if (CIq != null) {
            spritesheetInfoImpl = CIq.F5D();
        } else {
            spritesheetInfoImpl = null;
        }
        return new SpriteSheetInfoCandidatesImpl(spritesheetInfoImpl);
    }

    @Override // com.instagram.model.mediasize.SpriteSheetInfoCandidates
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (CIq() != null) {
            SpritesheetInfo CIq = CIq();
            if (CIq != null) {
                treeUpdaterJNI = CIq.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A0X.put(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, treeUpdaterJNI);
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
