package com.instagram.feed.media;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC43623JRg;
import X.C14360o3;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoEffectActionSheet extends C17T implements EffectActionSheetIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(34);

    @Override // com.instagram.feed.media.EffectActionSheetIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC43623JRg.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.feed.media.EffectActionSheetIntf
    public final List BgC() {
        ImmutableList stringListByHashCode = getStringListByHashCode(-1909990464);
        C14360o3.A07(stringListByHashCode);
        return stringListByHashCode;
    }

    @Override // com.instagram.feed.media.EffectActionSheetIntf
    public final List BrM() {
        ImmutableList stringListByHashCode = getStringListByHashCode(-157962958);
        C14360o3.A07(stringListByHashCode);
        return stringListByHashCode;
    }

    @Override // com.instagram.feed.media.EffectActionSheetIntf
    public final EffectActionSheet F4Z() {
        return new EffectActionSheet(BgC(), BrM());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
