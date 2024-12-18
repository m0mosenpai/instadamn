package com.instagram.feed.audio;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40637Hzv;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.DirectAudioFallbackUrl;
import com.instagram.api.schemas.DirectAudioFallbackUrlImpl;
import com.instagram.api.schemas.ImmutablePandoDirectAudioFallbackUrl;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoAudio extends C17T implements AudioIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(31);

    @Override // com.instagram.feed.audio.AudioIntf
    public final DirectAudioFallbackUrl B4D() {
        return (DirectAudioFallbackUrl) A05(761243362, ImmutablePandoDirectAudioFallbackUrl.class);
    }

    @Override // com.instagram.feed.audio.AudioIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40637Hzv.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.feed.audio.AudioIntf
    public final String Ae1() {
        return A0i(188526075);
    }

    @Override // com.instagram.feed.audio.AudioIntf
    public final Long Ae2() {
        return A0L(-1148579917);
    }

    @Override // com.instagram.feed.audio.AudioIntf
    public final Long Azh() {
        return A0L(-1992012396);
    }

    @Override // com.instagram.feed.audio.AudioIntf
    public final List CHJ() {
        return A0l(930261868);
    }

    @Override // com.instagram.feed.audio.AudioIntf
    public final Integer CHK() {
        return getOptionalIntValueByHashCode(869042347);
    }

    @Override // com.instagram.feed.audio.AudioIntf
    public final Audio F4S() {
        DirectAudioFallbackUrlImpl directAudioFallbackUrlImpl;
        String A0i = A0i(188526075);
        Long A0L = A0L(-1148579917);
        Long A0L2 = A0L(-1992012396);
        DirectAudioFallbackUrl B4D = B4D();
        if (B4D != null) {
            directAudioFallbackUrlImpl = B4D.Et6();
        } else {
            directAudioFallbackUrlImpl = null;
        }
        return new Audio(directAudioFallbackUrlImpl, getOptionalIntValueByHashCode(869042347), A0L, A0L2, A0i, A0l(930261868));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
