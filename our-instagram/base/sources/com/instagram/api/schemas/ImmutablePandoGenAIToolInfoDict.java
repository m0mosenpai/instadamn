package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC53774NqQ;
import X.C17T;
import X.C29992DKe;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes5.dex */
public final class ImmutablePandoGenAIToolInfoDict extends C17T implements GenAIToolInfoDictIntf {
    public static final AbstractC136426Fv CREATOR = new C39306HXx(76);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.GenAIToolInfoDictIntf
    public final CameraTool C9G() {
        return (CameraTool) A0M(-415949439, C29992DKe.A00);
    }

    @Override // com.instagram.api.schemas.GenAIToolInfoDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC53774NqQ.A00(this));
    }

    @Override // com.instagram.api.schemas.GenAIToolInfoDictIntf
    public final String Ar1() {
        return A0i(264552097);
    }

    @Override // com.instagram.api.schemas.GenAIToolInfoDictIntf
    public final String Bid() {
        return A0i(-979805852);
    }

    @Override // com.instagram.api.schemas.GenAIToolInfoDictIntf
    public final String Bl1() {
        return A0i(-963237835);
    }

    @Override // com.instagram.api.schemas.GenAIToolInfoDictIntf
    public final String Bo9() {
        return A0i(37109963);
    }

    @Override // com.instagram.api.schemas.GenAIToolInfoDictIntf
    public final String Boj() {
        return A0i(1847552473);
    }

    @Override // com.instagram.api.schemas.GenAIToolInfoDictIntf
    public final String C0j() {
        return A0i(-1061345759);
    }

    @Override // com.instagram.api.schemas.GenAIToolInfoDictIntf
    public final String C9b() {
        return A0i(110546223);
    }

    @Override // com.instagram.api.schemas.GenAIToolInfoDictIntf
    public final GenAIToolInfoDict Etq() {
        return new GenAIToolInfoDict(C9G(), A0i(2036780306), A0i(264552097), A0i(-979805852), A0i(-963237835), A0i(37109963), A0i(1847552473), A0i(-1061345759), A0i(110546223));
    }

    @Override // com.instagram.api.schemas.GenAIToolInfoDictIntf
    public final String getBackgroundColor() {
        return A0i(2036780306);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
