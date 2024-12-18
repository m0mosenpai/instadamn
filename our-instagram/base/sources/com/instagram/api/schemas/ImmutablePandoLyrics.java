package com.instagram.api.schemas;

import X.AbstractC06950Ym;
import X.AbstractC136426Fv;
import X.AbstractC40055Hph;
import X.C14360o3;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ImmutablePandoLyrics extends C17T implements LyricsIntf {
    public static final AbstractC136426Fv CREATOR = new C39307HXy(15);

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    @Override // com.instagram.api.schemas.LyricsIntf
    public final List Bd4() {
        return A0o(-593086246, ImmutablePandoPhrase.class);
    }

    @Override // com.instagram.api.schemas.LyricsIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AbstractC40055Hph.A00(this), this);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.LyricsIntf
    public final Lyrics EwA() {
        List Bd4 = Bd4();
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(Bd4, 10));
        Iterator it = Bd4.iterator();
        while (it.hasNext()) {
            arrayList.add(((PhraseIntf) it.next()).Exz());
        }
        return new Lyrics(arrayList);
    }
}
