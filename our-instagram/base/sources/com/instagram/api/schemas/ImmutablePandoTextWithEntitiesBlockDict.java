package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39305HXw;
import X.Hw3;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.textwithentities.model.ImmutablePandoTextWithEntities;
import com.instagram.common.textwithentities.model.TextWithEntities;
import com.instagram.common.textwithentities.model.TextWithEntitiesIntf;

/* loaded from: classes7.dex */
public final class ImmutablePandoTextWithEntitiesBlockDict extends C17T implements TextWithEntitiesBlockDictIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(12);

    @Override // com.instagram.api.schemas.TextWithEntitiesBlockDictIntf
    public final TextWithEntitiesIntf C6r() {
        return (TextWithEntitiesIntf) A05(1854819208, ImmutablePandoTextWithEntities.class);
    }

    @Override // com.instagram.api.schemas.TextWithEntitiesBlockDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, Hw3.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.TextWithEntitiesBlockDictIntf
    public final Integer Awn() {
        return getOptionalIntValueByHashCode(95472323);
    }

    @Override // com.instagram.api.schemas.TextWithEntitiesBlockDictIntf
    public final TextWithEntitiesBlockDict F3K() {
        TextWithEntities textWithEntities;
        String A0i = A0i(1286558636);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(95472323);
        TextWithEntitiesIntf C6r = C6r();
        if (C6r != null) {
            textWithEntities = C6r.F4R();
        } else {
            textWithEntities = null;
        }
        return new TextWithEntitiesBlockDict(textWithEntities, optionalIntValueByHashCode, A0i);
    }

    @Override // com.instagram.api.schemas.TextWithEntitiesBlockDictIntf
    public final String getBlockType() {
        return A0i(1286558636);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
