package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39307HXy;
import X.CDP;
import X.JAM;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoNoteCustomTheme extends C17T implements NoteCustomTheme {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(26);

    @Override // com.instagram.api.schemas.NoteCustomTheme
    public final NoteActivationType AYn() {
        return (NoteActivationType) A0N(1287259331, JAM.A00);
    }

    @Override // com.instagram.api.schemas.NoteCustomTheme
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, CDP.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.NoteCustomTheme
    public final String Aev() {
        return A0i(-1604143506);
    }

    @Override // com.instagram.api.schemas.NoteCustomTheme
    public final String AvG() {
        return A0i(717313528);
    }

    @Override // com.instagram.api.schemas.NoteCustomTheme
    public final String C31() {
        return A0i(-259686756);
    }

    @Override // com.instagram.api.schemas.NoteCustomTheme
    public final String C6B() {
        return A0i(-1569721427);
    }

    @Override // com.instagram.api.schemas.NoteCustomTheme
    public final NoteCustomThemeImpl ExJ() {
        return new NoteCustomThemeImpl(AYn(), A0i(-1604143506), A0i(717313528), A0i(-259686756), A0i(-1569721427));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
