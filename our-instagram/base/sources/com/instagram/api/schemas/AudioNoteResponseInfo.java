package com.instagram.api.schemas;

import X.AbstractC39758HkU;
import X.C0T6;
import X.C14360o3;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.feed.audio.Audio;
import com.instagram.feed.audio.AudioIntf;

/* loaded from: classes3.dex */
public final class AudioNoteResponseInfo extends C0T6 implements Parcelable, AudioNoteResponseInfoIntf {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(64);
    public final Audio A00;
    public final String A01;

    public AudioNoteResponseInfo(Audio audio, String str) {
        C14360o3.A0B(audio, 1);
        C14360o3.A0B(str, 2);
        this.A00 = audio;
        this.A01 = str;
    }

    @Override // com.instagram.api.schemas.AudioNoteResponseInfoIntf
    public final AudioNoteResponseInfo Er5() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudioNoteResponseInfo) {
                AudioNoteResponseInfo audioNoteResponseInfo = (AudioNoteResponseInfo) obj;
                if (!C14360o3.A0K(this.A00, audioNoteResponseInfo.A00) || !C14360o3.A0K(this.A01, audioNoteResponseInfo.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }

    @Override // com.instagram.api.schemas.AudioNoteResponseInfoIntf
    public final /* bridge */ /* synthetic */ AudioIntf Adt() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.AudioNoteResponseInfoIntf
    public final String BOp() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.AudioNoteResponseInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAudioNoteResponseInfo", AbstractC39758HkU.A00(this));
    }
}
