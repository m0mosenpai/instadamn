package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC31179DnN;
import X.AbstractC37300Gc1;
import X.C0T6;
import X.C14360o3;
import X.C41858IgC;
import X.VON;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class GroupMetadataImpl extends C0T6 implements GroupMetadata, Parcelable {
    public static final Parcelable.Creator CREATOR = C41858IgC.A00(2);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final RingSpec A08;
    public final Boolean A09;
    public final Long A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final List A0F;
    public final List A0G;
    public final List A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;

    @Override // com.instagram.api.schemas.GroupMetadata
    public final GroupMetadataImpl Etw() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GroupMetadataImpl) {
                GroupMetadataImpl groupMetadataImpl = (GroupMetadataImpl) obj;
                if (!C14360o3.A0K(this.A0F, groupMetadataImpl.A0F) || !C14360o3.A0K(this.A0G, groupMetadataImpl.A0G) || this.A0I != groupMetadataImpl.A0I || !C14360o3.A0K(this.A0B, groupMetadataImpl.A0B) || !C14360o3.A0K(this.A0C, groupMetadataImpl.A0C) || !C14360o3.A0K(this.A0D, groupMetadataImpl.A0D) || !C14360o3.A0K(this.A0E, groupMetadataImpl.A0E) || this.A0J != groupMetadataImpl.A0J || this.A0K != groupMetadataImpl.A0K || !C14360o3.A0K(this.A09, groupMetadataImpl.A09) || this.A0L != groupMetadataImpl.A0L || this.A0M != groupMetadataImpl.A0M || this.A0N != groupMetadataImpl.A0N || this.A0O != groupMetadataImpl.A0O || this.A0P != groupMetadataImpl.A0P || this.A0Q != groupMetadataImpl.A0Q || this.A0R != groupMetadataImpl.A0R || !C14360o3.A0K(this.A0A, groupMetadataImpl.A0A) || this.A00 != groupMetadataImpl.A00 || this.A01 != groupMetadataImpl.A01 || this.A02 != groupMetadataImpl.A02 || this.A03 != groupMetadataImpl.A03 || this.A04 != groupMetadataImpl.A04 || this.A05 != groupMetadataImpl.A05 || this.A06 != groupMetadataImpl.A06 || this.A07 != groupMetadataImpl.A07 || !C14360o3.A0K(this.A0H, groupMetadataImpl.A0H) || !C14360o3.A0K(this.A08, groupMetadataImpl.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeStringList(this.A0F);
        parcel.writeStringList(this.A0G);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0K ? 1 : 0);
        AbstractC31179DnN.A0p(parcel, this.A09);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeInt(this.A0Q ? 1 : 0);
        parcel.writeInt(this.A0R ? 1 : 0);
        AbstractC31179DnN.A0q(parcel, this.A0A);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A07);
        parcel.writeStringList(this.A0H);
        parcel.writeParcelable(this.A08, i);
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final List Aa2() {
        return this.A0F;
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final List AgL() {
        return this.A0G;
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final boolean Aka() {
        return this.A0I;
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final String Amy() {
        return this.A0B;
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final String AnK() {
        return this.A0C;
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final String BAU() {
        return this.A0D;
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final String BAf() {
        return this.A0E;
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final boolean BAh() {
        return this.A0J;
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final boolean BCM() {
        return this.A0K;
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final Boolean BDc() {
        return this.A09;
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final Long BPY() {
        return this.A0A;
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final int BXZ() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final int BXc() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final int BXp() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final int BXq() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final int BXr() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final int BXs() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final int BXt() {
        return this.A06;
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final int BXu() {
        return this.A07;
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final List BcA() {
        return this.A0H;
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final RingSpec BpS() {
        return this.A08;
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final boolean CVQ() {
        return this.A0L;
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final boolean CVS() {
        return this.A0M;
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final boolean CVW() {
        return this.A0N;
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final boolean Cbd() {
        return this.A0O;
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final boolean Cfp() {
        return this.A0P;
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final boolean Cft() {
        return this.A0Q;
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final boolean Cfu() {
        return this.A0R;
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTGroupMetadata", VON.A00(this));
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A0H, (((((((((((((((((AbstractC167007dF.A0D(this.A0R, AbstractC167007dF.A0D(this.A0Q, AbstractC167007dF.A0D(this.A0P, AbstractC167007dF.A0D(this.A0O, AbstractC167007dF.A0D(this.A0N, AbstractC167007dF.A0D(this.A0M, AbstractC167007dF.A0D(this.A0L, (AbstractC167007dF.A0D(this.A0K, AbstractC167007dF.A0D(this.A0J, AbstractC166997dE.A0K(this.A0E, AbstractC166997dE.A0K(this.A0D, (((AbstractC167007dF.A0D(this.A0I, AbstractC166997dE.A0J(this.A0G, AbstractC166987dD.A0G(this.A0F))) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0O(this.A0C)) * 31)))) + AbstractC167017dG.A0M(this.A09)) * 31))))))) + AbstractC167017dG.A0M(this.A0A)) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31) + this.A04) * 31) + this.A05) * 31) + this.A06) * 31) + this.A07) * 31) + AbstractC166997dE.A0I(this.A08);
    }

    public GroupMetadataImpl(RingSpec ringSpec, Boolean bool, Long l, String str, String str2, String str3, String str4, List list, List list2, List list3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        AbstractC167017dG.A1P(list, list2);
        AbstractC167017dG.A1U(str3, str4);
        C14360o3.A0B(list3, 27);
        this.A0F = list;
        this.A0G = list2;
        this.A0I = z;
        this.A0B = str;
        this.A0C = str2;
        this.A0D = str3;
        this.A0E = str4;
        this.A0J = z2;
        this.A0K = z3;
        this.A09 = bool;
        this.A0L = z4;
        this.A0M = z5;
        this.A0N = z6;
        this.A0O = z7;
        this.A0P = z8;
        this.A0Q = z9;
        this.A0R = z10;
        this.A0A = l;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A04 = i5;
        this.A05 = i6;
        this.A06 = i7;
        this.A07 = i8;
        this.A0H = list3;
        this.A08 = ringSpec;
    }
}
