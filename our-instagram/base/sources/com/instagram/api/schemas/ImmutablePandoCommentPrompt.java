package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC33675EuP;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes6.dex */
public final class ImmutablePandoCommentPrompt extends C17T implements CommentPrompt {
    public static final AbstractC136426Fv CREATOR = new C39306HXx(41);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.CommentPrompt
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC33675EuP.A00(this));
    }

    @Override // com.instagram.api.schemas.CommentPrompt
    public final String BbH() {
        return A0j(1376653744);
    }

    @Override // com.instagram.api.schemas.CommentPrompt
    public final Integer BnC() {
        return getOptionalIntValueByHashCode(139882362);
    }

    @Override // com.instagram.api.schemas.CommentPrompt
    public final CommentPromptImpl EsS() {
        return new CommentPromptImpl(A0j(1376653744), getOptionalIntValueByHashCode(139882362));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
