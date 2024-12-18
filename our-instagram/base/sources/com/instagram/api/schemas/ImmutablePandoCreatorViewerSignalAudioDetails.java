package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37304Gc5;
import X.AbstractC39875HmO;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoCreatorViewerSignalAudioDetails extends C17T implements CreatorViewerSignalAudioDetails {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(49);
    public TrackOrOriginalSoundSchemaIntf A00;

    @Override // com.instagram.api.schemas.CreatorViewerSignalAudioDetails
    public final TrackOrOriginalSoundSchemaIntf Ads() {
        TrackOrOriginalSoundSchemaIntf trackOrOriginalSoundSchemaIntf = this.A00;
        if (trackOrOriginalSoundSchemaIntf == null) {
            return (TrackOrOriginalSoundSchemaIntf) A05(1549039479, ImmutablePandoTrackOrOriginalSoundSchema.class);
        }
        return trackOrOriginalSoundSchemaIntf;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalAudioDetails
    public final FormattedString C3a() {
        return (FormattedString) A05(-2060497896, ImmutablePandoFormattedString.class);
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalAudioDetails
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39875HmO.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalAudioDetails
    public final CreatorViewerSignalAudioDetails E8y(C1DY c1dy) {
        TrackOrOriginalSoundSchemaIntf Ads = Ads();
        if (Ads != null) {
            Ads.EB8(c1dy);
        } else {
            Ads = null;
        }
        this.A00 = Ads;
        return this;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalAudioDetails
    public final CreatorViewerSignalAudioDetailsImpl Esr(C1DY c1dy) {
        TrackOrOriginalSoundSchema trackOrOriginalSoundSchema;
        TrackOrOriginalSoundSchemaIntf Ads = Ads();
        FormattedStringImpl formattedStringImpl = null;
        if (Ads != null) {
            trackOrOriginalSoundSchema = Ads.F3R(c1dy);
        } else {
            trackOrOriginalSoundSchema = null;
        }
        FormattedString C3a = C3a();
        if (C3a != null) {
            formattedStringImpl = C3a.Eth();
        }
        return new CreatorViewerSignalAudioDetailsImpl(formattedStringImpl, trackOrOriginalSoundSchema);
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalAudioDetails
    public final CreatorViewerSignalAudioDetailsImpl Ess(C1DV c1dv) {
        return Esr(AbstractC37304Gc5.A09(c1dv));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
