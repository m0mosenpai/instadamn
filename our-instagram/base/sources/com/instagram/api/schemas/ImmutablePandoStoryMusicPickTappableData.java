package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37303Gc4;
import X.AbstractC37304Gc5;
import X.AbstractC40301Hu5;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C39307HXy;
import X.JBP;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoStoryMusicPickTappableData extends C17T implements StoryMusicPickTappableDataIntf {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(86);
    public OriginalSoundDataIntf A00;
    public List A01;

    @Override // com.instagram.api.schemas.StoryMusicPickTappableDataIntf
    public final TrackData Adc() {
        return (TrackData) A05(93166550, ImmutablePandoTrackData.class);
    }

    @Override // com.instagram.api.schemas.StoryMusicPickTappableDataIntf
    public final StoryPromptDisablementState Ay6() {
        return (StoryPromptDisablementState) A0M(186507096, JBP.A00);
    }

    @Override // com.instagram.api.schemas.StoryMusicPickTappableDataIntf
    public final List B48() {
        List list = this.A01;
        if (list != null) {
            return list;
        }
        throw AbstractC166987dD.A1D("Please call reconciledWithStore() first to access the 'facepileTopParticipants' field.");
    }

    @Override // com.instagram.api.schemas.StoryMusicPickTappableDataIntf
    public final OriginalSoundDataIntf BZw() {
        OriginalSoundDataIntf originalSoundDataIntf = this.A00;
        if (originalSoundDataIntf == null) {
            return (OriginalSoundDataIntf) A05(1082512652, ImmutablePandoOriginalSoundData.class);
        }
        return originalSoundDataIntf;
    }

    @Override // com.instagram.api.schemas.StoryMusicPickTappableDataIntf
    public final StoryTemplateAssetDictIntf C5d() {
        return (StoryTemplateAssetDictIntf) A04(-1303161109, ImmutablePandoStoryTemplateAssetDict.class);
    }

    @Override // com.instagram.api.schemas.StoryMusicPickTappableDataIntf
    public final StoryMusicPickTappableDataIntf EAP(C1DY c1dy) {
        List A0o = A0o(-1167125638, ImmutablePandoUserDict.class);
        ArrayList A0q = AbstractC167017dG.A0q(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            AbstractC37304Gc5.A1I(c1dy, A0q, it);
        }
        this.A01 = A0q;
        OriginalSoundDataIntf BZw = BZw();
        if (BZw != null) {
            BZw.E9V(c1dy);
        } else {
            BZw = null;
        }
        this.A00 = BZw;
        return this;
    }

    @Override // com.instagram.api.schemas.StoryMusicPickTappableDataIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40301Hu5.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.StoryMusicPickTappableDataIntf
    public final String AeC() {
        return A0k(107936827);
    }

    @Override // com.instagram.api.schemas.StoryMusicPickTappableDataIntf
    public final int BbW() {
        return getIntValueByHashCode(1324364035);
    }

    @Override // com.instagram.api.schemas.StoryMusicPickTappableDataIntf
    public final String Bfc() {
        return A0i(163224144);
    }

    @Override // com.instagram.api.schemas.StoryMusicPickTappableDataIntf
    public final StoryMusicPickTappableData F0z(C1DY c1dy) {
        TrackDataImpl trackDataImpl;
        TrackData Adc = Adc();
        OriginalSoundData originalSoundData = null;
        if (Adc != null) {
            trackDataImpl = Adc.F3P();
        } else {
            trackDataImpl = null;
        }
        String A0k = A0k(107936827);
        StoryPromptDisablementState Ay6 = Ay6();
        List A0o = A0o(-1167125638, ImmutablePandoUserDict.class);
        ArrayList A0q = AbstractC167017dG.A0q(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            AbstractC37304Gc5.A1I(c1dy, A0q, it);
        }
        ArrayList A0q2 = AbstractC167017dG.A0q(A0q);
        Iterator it2 = A0q.iterator();
        while (it2.hasNext()) {
            AbstractC37303Gc4.A18(c1dy, A0q2, it2);
        }
        String A0g = A0g();
        String A0k2 = A0k(-900774058);
        OriginalSoundDataIntf BZw = BZw();
        if (BZw != null) {
            originalSoundData = BZw.Exi(c1dy);
        }
        return new StoryMusicPickTappableData(originalSoundData, Ay6, C5d().F1z(), trackDataImpl, A0k, A0g, A0k2, A0i(163224144), A0q2, getIntValueByHashCode(1324364035));
    }

    @Override // com.instagram.api.schemas.StoryMusicPickTappableDataIntf
    public final StoryMusicPickTappableData F10(C1DV c1dv) {
        return F0z(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // com.instagram.api.schemas.StoryMusicPickTappableDataIntf
    public final String getId() {
        return A0g();
    }

    @Override // com.instagram.api.schemas.StoryMusicPickTappableDataIntf
    public final String getMediaId() {
        return A0k(-900774058);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
