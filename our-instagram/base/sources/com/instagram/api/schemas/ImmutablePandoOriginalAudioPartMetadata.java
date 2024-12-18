package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37300Gc1;
import X.AbstractC37303Gc4;
import X.AbstractC40126Hqt;
import X.C17T;
import X.C1DY;
import X.C39307HXy;
import X.JAQ;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoOriginalAudioPartMetadata extends C17T implements OriginalAudioPartMetadataIntf {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(33);
    public User A00;

    @Override // com.instagram.api.schemas.OriginalAudioPartMetadataIntf
    public final List Ado() {
        return A08(1437867975, ImmutablePandoAudioFilterInfo.class);
    }

    @Override // com.instagram.api.schemas.OriginalAudioPartMetadataIntf
    public final MusicCanonicalType Ae6() {
        return (MusicCanonicalType) A0M(1549378051, JAQ.A00);
    }

    @Override // com.instagram.api.schemas.OriginalAudioPartMetadataIntf
    public final User BFU() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.OriginalAudioPartMetadataIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40126Hqt.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.OriginalAudioPartMetadataIntf
    public final int Ae3() {
        return getIntValueByHashCode(-1831842732);
    }

    @Override // com.instagram.api.schemas.OriginalAudioPartMetadataIntf
    public final int BbS() {
        return getIntValueByHashCode(-1517837824);
    }

    @Override // com.instagram.api.schemas.OriginalAudioPartMetadataIntf
    public final ImageUrl C88() {
        return A09(1825632153);
    }

    @Override // com.instagram.api.schemas.OriginalAudioPartMetadataIntf
    public final Boolean CT1() {
        return getOptionalBooleanValueByHashCode(1470663792);
    }

    @Override // com.instagram.api.schemas.OriginalAudioPartMetadataIntf
    public final OriginalAudioPartMetadataIntf E9U(C1DY c1dy) {
        this.A00 = AbstractC37303Gc4.A0J(c1dy, this, -383946360);
        return this;
    }

    @Override // com.instagram.api.schemas.OriginalAudioPartMetadataIntf
    public final OriginalAudioPartMetadata Exg(C1DY c1dy) {
        ArrayList arrayList;
        User A0N;
        List Ado = Ado();
        User user = null;
        if (Ado != null) {
            arrayList = AbstractC167017dG.A0q(Ado);
            Iterator it = Ado.iterator();
            while (it.hasNext()) {
                arrayList.add(((AudioFilterInfoIntf) it.next()).Er1());
            }
        } else {
            arrayList = null;
        }
        int intValueByHashCode = getIntValueByHashCode(-1831842732);
        MusicCanonicalType Ae6 = Ae6();
        String A0h = A0h(1258734948);
        String A0h2 = A0h(-1466137445);
        int intValueByHashCode2 = getIntValueByHashCode(55068821);
        ImmutablePandoUserDict A0K = AbstractC37300Gc1.A0K(this, -383946360);
        if (A0K != null && (A0N = AbstractC37300Gc1.A0N(c1dy, A0K)) != null) {
            user = (User) c1dy.A00(A0N);
        }
        return new OriginalAudioPartMetadata(Ae6, A09(1825632153), user, getOptionalBooleanValueByHashCode(1470663792), A0h, A0h2, A0h(1139251232), arrayList, intValueByHashCode, intValueByHashCode2, getIntValueByHashCode(-1517837824), getBooleanValueByHashCode(1033668234), getBooleanValueByHashCode(1630845353));
    }

    @Override // com.instagram.api.schemas.OriginalAudioPartMetadataIntf
    public final String getDisplayArtist() {
        return A0h(1258734948);
    }

    @Override // com.instagram.api.schemas.OriginalAudioPartMetadataIntf
    public final String getDisplayTitle() {
        return A0h(-1466137445);
    }

    @Override // com.instagram.api.schemas.OriginalAudioPartMetadataIntf
    public final int getDurationInMs() {
        return getIntValueByHashCode(55068821);
    }

    @Override // com.instagram.api.schemas.OriginalAudioPartMetadataIntf
    public final String getMusicCanonicalId() {
        return A0h(1139251232);
    }

    @Override // com.instagram.api.schemas.OriginalAudioPartMetadataIntf
    public final boolean isBookmarked() {
        return getBooleanValueByHashCode(1033668234);
    }

    @Override // com.instagram.api.schemas.OriginalAudioPartMetadataIntf
    public final boolean isExplicit() {
        return getBooleanValueByHashCode(1630845353);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
