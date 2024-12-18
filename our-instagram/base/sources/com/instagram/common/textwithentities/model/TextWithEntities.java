package com.instagram.common.textwithentities.model;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25229BEm;
import X.AbstractC31179DnN;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.AbstractC40570Hyq;
import X.C0T6;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.LinkAction;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class TextWithEntities extends C0T6 implements Parcelable, TextWithEntitiesIntf {
    public static final Parcelable.Creator CREATOR = new LNM(18);
    public final LinkAction A00;
    public final Long A01;
    public final String A02;
    public final List A03;
    public final List A04;
    public final List A05;

    @Override // com.instagram.common.textwithentities.model.TextWithEntitiesIntf
    public final TextWithEntities F4R() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextWithEntities) {
                TextWithEntities textWithEntities = (TextWithEntities) obj;
                if (!C14360o3.A0K(this.A03, textWithEntities.A03) || !C14360o3.A0K(this.A04, textWithEntities.A04) || this.A00 != textWithEntities.A00 || !C14360o3.A0K(this.A05, textWithEntities.A05) || !C14360o3.A0K(this.A02, textWithEntities.A02) || !C14360o3.A0K(this.A01, textWithEntities.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        List list = this.A03;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator A0l = AbstractC37304Gc5.A0l(parcel, list);
            while (A0l.hasNext()) {
                AbstractC25229BEm.A15(parcel, A0l, i);
            }
        }
        List list2 = this.A04;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator A0l2 = AbstractC37304Gc5.A0l(parcel, list2);
            while (A0l2.hasNext()) {
                AbstractC25229BEm.A15(parcel, A0l2, i);
            }
        }
        parcel.writeParcelable(this.A00, i);
        List list3 = this.A05;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator A0l3 = AbstractC37304Gc5.A0l(parcel, list3);
            while (A0l3.hasNext()) {
                AbstractC25229BEm.A15(parcel, A0l3, i);
            }
        }
        parcel.writeString(this.A02);
        AbstractC31179DnN.A0q(parcel, this.A01);
    }

    @Override // com.instagram.common.textwithentities.model.TextWithEntitiesIntf
    public final List ApN() {
        return this.A03;
    }

    @Override // com.instagram.common.textwithentities.model.TextWithEntitiesIntf
    public final List BHs() {
        return this.A04;
    }

    @Override // com.instagram.common.textwithentities.model.TextWithEntitiesIntf
    public final LinkAction BNM() {
        return this.A00;
    }

    @Override // com.instagram.common.textwithentities.model.TextWithEntitiesIntf
    public final List Bk5() {
        return this.A05;
    }

    @Override // com.instagram.common.textwithentities.model.TextWithEntitiesIntf
    public final Long C8e() {
        return this.A01;
    }

    @Override // com.instagram.common.textwithentities.model.TextWithEntitiesIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTTextWithEntitiesDict", AbstractC40570Hyq.A00(this));
    }

    @Override // com.instagram.common.textwithentities.model.TextWithEntitiesIntf
    public final String getText() {
        return this.A02;
    }

    public final int hashCode() {
        return (((((((((AbstractC167017dG.A0M(this.A03) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public TextWithEntities(LinkAction linkAction, Long l, String str, List list, List list2, List list3) {
        this.A03 = list;
        this.A04 = list2;
        this.A00 = linkAction;
        this.A05 = list3;
        this.A02 = str;
        this.A01 = l;
    }
}
