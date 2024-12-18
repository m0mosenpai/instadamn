package com.instagram.model.mediasize;

import X.AbstractC06950Ym;
import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37344Gcm;
import X.C14360o3;
import X.C17T;
import X.C37926GmO;
import X.C39305HXw;
import X.IMD;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoImageInfo extends C17T implements ImageInfo {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(42);

    @Override // com.instagram.model.mediasize.ImageInfo
    public final /* synthetic */ IMD AKm() {
        return new IMD(this);
    }

    @Override // com.instagram.model.mediasize.ImageInfo
    public final AdditionalCandidates AZl() {
        return (AdditionalCandidates) A05(-668751256, ImmutablePandoAdditionalCandidates.class);
    }

    @Override // com.instagram.model.mediasize.ImageInfo
    public final SpriteSheetInfoCandidates Abq() {
        return (SpriteSheetInfoCandidates) A05(174361741, ImmutablePandoSpriteSheetInfoCandidates.class);
    }

    @Override // com.instagram.model.mediasize.ImageInfo
    public final List AlQ() {
        ImmutableList A08 = A08(-1411310768, C37926GmO.class);
        if (A08 != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A08, 10));
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                C37926GmO c37926GmO = (C37926GmO) it.next();
                C14360o3.A0A(c37926GmO);
                arrayList.add(new ExtendedImageUrl(c37926GmO));
            }
            return arrayList;
        }
        return null;
    }

    @Override // com.instagram.model.mediasize.ImageInfo
    public final SpriteSheetInfoCandidates Br7() {
        return (SpriteSheetInfoCandidates) A05(1213067069, ImmutablePandoSpriteSheetInfoCandidates.class);
    }

    @Override // com.instagram.model.mediasize.ImageInfo
    public final List BzD() {
        ImmutableList A08 = A08(2102113375, C37926GmO.class);
        if (A08 != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A08, 10));
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                C37926GmO c37926GmO = (C37926GmO) it.next();
                C14360o3.A0A(c37926GmO);
                arrayList.add(new ExtendedImageUrl(c37926GmO));
            }
            return arrayList;
        }
        return null;
    }

    @Override // com.instagram.model.mediasize.ImageInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC37344Gcm.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.mediasize.ImageInfo
    public final ImageInfoImpl F5B() {
        AdditionalCandidatesImpl additionalCandidatesImpl;
        SpriteSheetInfoCandidatesImpl spriteSheetInfoCandidatesImpl;
        AdditionalCandidates AZl = AZl();
        SpriteSheetInfoCandidatesImpl spriteSheetInfoCandidatesImpl2 = null;
        if (AZl != null) {
            additionalCandidatesImpl = AZl.F5A();
        } else {
            additionalCandidatesImpl = null;
        }
        SpriteSheetInfoCandidates Abq = Abq();
        if (Abq != null) {
            spriteSheetInfoCandidatesImpl = Abq.F5C();
        } else {
            spriteSheetInfoCandidatesImpl = null;
        }
        List AlQ = AlQ();
        SpriteSheetInfoCandidates Br7 = Br7();
        if (Br7 != null) {
            spriteSheetInfoCandidatesImpl2 = Br7.F5C();
        }
        return new ImageInfoImpl(additionalCandidatesImpl, spriteSheetInfoCandidatesImpl, spriteSheetInfoCandidatesImpl2, AlQ, BzD());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
