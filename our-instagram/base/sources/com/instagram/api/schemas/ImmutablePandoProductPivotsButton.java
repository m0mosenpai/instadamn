package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.AbstractC37304Gc5;
import X.C17T;
import X.C39307HXy;
import X.C69420Vn5;
import X.JAX;
import X.JAY;
import android.os.Parcel;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductPivotsButton extends C17T implements ProductPivotsButton {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(51);

    @Override // com.instagram.api.schemas.ProductPivotsButton
    public final /* synthetic */ C69420Vn5 AKS() {
        return new C69420Vn5(this);
    }

    @Override // com.instagram.api.schemas.ProductPivotsButton
    public final ProductPivotsButtonActionType AYO() {
        return (ProductPivotsButtonActionType) A0M(-1422950858, JAX.A00);
    }

    @Override // com.instagram.api.schemas.ProductPivotsButton
    public final ProductPivotsButtonActionType Ax7() {
        return (ProductPivotsButtonActionType) A0N(1205427403, JAY.A00);
    }

    @Override // com.instagram.api.schemas.ProductPivotsButton
    public final User BSW() {
        return null;
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ProductPivotsButton
    public final String Aj7() {
        return AbstractC37304Gc5.A0g(this);
    }

    @Override // com.instagram.api.schemas.ProductPivotsButton
    public final String Ax2() {
        return A0j(912984812);
    }

    @Override // com.instagram.api.schemas.ProductPivotsButton
    public final String Ax4() {
        return A0i(2090789161);
    }

    @Override // com.instagram.api.schemas.ProductPivotsButton
    public final String Ax5() {
        return A0i(-1286928665);
    }

    @Override // com.instagram.api.schemas.ProductPivotsButton
    public final String getText() {
        return A0X();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
