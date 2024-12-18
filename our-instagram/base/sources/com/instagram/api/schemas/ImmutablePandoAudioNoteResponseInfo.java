package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC39758HkU;
import X.C14360o3;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.feed.audio.AudioIntf;
import com.instagram.feed.audio.ImmutablePandoAudio;

/* loaded from: classes3.dex */
public final class ImmutablePandoAudioNoteResponseInfo extends C17T implements AudioNoteResponseInfoIntf {
    public static final AbstractC136426Fv CREATOR = new C39306HXx(14);

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    @Override // com.instagram.api.schemas.AudioNoteResponseInfoIntf
    public final AudioIntf Adt() {
        return (AudioIntf) A04(1549039479, ImmutablePandoAudio.class);
    }

    @Override // com.instagram.api.schemas.AudioNoteResponseInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AbstractC39758HkU.A00(this), this);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.AudioNoteResponseInfoIntf
    public final String BOp() {
        return A0h(642643451);
    }

    @Override // com.instagram.api.schemas.AudioNoteResponseInfoIntf
    public final AudioNoteResponseInfo Er5() {
        return new AudioNoteResponseInfo(Adt().F4S(), A0h(642643451));
    }
}
