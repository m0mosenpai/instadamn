package com.facebook.iabbwpextension;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25232BEp;
import X.AbstractC61701RsI;
import X.C05F;
import X.C0T6;
import X.C14360o3;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.iabcontext.IabCommonTrait;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes10.dex */
public final class IABBwPContext extends C0T6 implements Parcelable, IabCommonTrait {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(19);
    public final IABBwPExtension A00;
    public final ImmutableList A01;
    public final Integer A02;
    public final List A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IABBwPContext) {
                IABBwPContext iABBwPContext = (IABBwPContext) obj;
                if (!C14360o3.A0K(this.A03, iABBwPContext.A03) || !C14360o3.A0K(this.A01, iABBwPContext.A01) || !C14360o3.A0K(this.A00, iABBwPContext.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeStringList(this.A03);
        parcel.writeSerializable(this.A01);
        IABBwPExtension iABBwPExtension = this.A00;
        if (iABBwPExtension == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iABBwPExtension.writeToParcel(parcel, i);
        }
    }

    @Override // com.facebook.browser.iabcontext.IabCommonTrait
    public final List Anm() {
        return this.A03;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A03)) + AbstractC167017dG.A0M(this.A00);
    }

    public final String toString() {
        return AbstractC25232BEp.A1F("eligible_experience_type", this.A01, AbstractC166987dD.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, AbstractC61701RsI.A00(this.A02)), AbstractC166987dD.A1L("click_ids", this.A03)).toString();
    }

    public IABBwPContext(IABBwPExtension iABBwPExtension, ImmutableList immutableList, List list) {
        AbstractC167017dG.A1P(list, immutableList);
        this.A03 = list;
        this.A01 = immutableList;
        this.A00 = iABBwPExtension;
        this.A02 = C05F.A0N;
    }
}
