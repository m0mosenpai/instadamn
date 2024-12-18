package com.facebook.iabadscontext;

import X.AbstractC166987dD;
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
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes10.dex */
public final class IABOrganicContext extends C0T6 implements Parcelable, IabOrganicTrait {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(9);
    public final ImmutableList A00;
    public final Integer A01;
    public final List A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IABOrganicContext) {
                IABOrganicContext iABOrganicContext = (IABOrganicContext) obj;
                if (!C14360o3.A0K(this.A02, iABOrganicContext.A02) || !C14360o3.A0K(this.A00, iABOrganicContext.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeStringList(this.A02);
        parcel.writeSerializable(this.A00);
    }

    @Override // com.facebook.browser.iabcontext.IabCommonTrait
    public final List Anm() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0G(this.A02));
    }

    public final String toString() {
        return AbstractC25232BEp.A1F("eligible_experience_types", this.A00, AbstractC166987dD.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, AbstractC61701RsI.A00(this.A01)), AbstractC166987dD.A1L("click_ids", this.A02)).toString();
    }

    public IABOrganicContext(ImmutableList immutableList, List list) {
        AbstractC167017dG.A1P(list, immutableList);
        this.A02 = list;
        this.A00 = immutableList;
        this.A01 = C05F.A01;
    }
}
