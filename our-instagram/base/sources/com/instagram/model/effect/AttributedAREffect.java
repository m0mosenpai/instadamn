package com.instagram.model.effect;

import X.AbstractC12990ll;
import X.AbstractC167007dF;
import X.AbstractC25651Mw;
import X.C05F;
import X.C25671My;
import X.C55343Oh9;
import X.EnumC223179sw;
import X.EnumC77213d7;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.EffectThumbnailImageDict;
import com.instagram.model.shopping.ProductAREffectContainer;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public class AttributedAREffect extends AREffect {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(80);
    public int A00;
    public ImageUrl A01;
    public ImageUrl A02;
    public EnumC223179sw A03;
    public ProductAREffectContainer A04;
    public EnumC77213d7 A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public List A0E;
    public List A0F;
    public List A0G;

    public AttributedAREffect(ImageUrl imageUrl, ImageUrl imageUrl2, EnumC223179sw enumC223179sw, ProductAREffectContainer productAREffectContainer, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3, int i, boolean z) {
        EnumC77213d7 enumC77213d7;
        this.A09 = str;
        this.A0A = str2;
        this.A02 = imageUrl;
        this.A07 = str3;
        this.A06 = str4;
        this.A01 = imageUrl2;
        this.A00 = i;
        if (z) {
            enumC77213d7 = EnumC77213d7.A04;
        } else {
            enumC77213d7 = EnumC77213d7.A03;
        }
        this.A05 = enumC77213d7;
        this.A0E = list;
        this.A0G = list2;
        this.A0F = list3;
        this.A08 = str5;
        this.A0D = null;
        this.A0B = str6;
        this.A04 = productAREffectContainer;
        this.A0C = str7;
        this.A03 = enumC223179sw;
    }

    @Override // com.instagram.model.effect.AREffect
    public final String A04() {
        return null;
    }

    @Override // com.instagram.model.effect.AREffect
    public final String A06() {
        return "0";
    }

    @Override // com.instagram.model.effect.AREffect
    public final String A07() {
        return null;
    }

    @Override // com.instagram.model.effect.AREffect
    public final List A08() {
        return null;
    }

    @Override // com.instagram.model.effect.AREffect
    public final List A09() {
        return null;
    }

    @Override // com.instagram.model.effect.AREffect
    public final boolean A0C() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.effect.AREffect
    public final ImageUrl A01() {
        EffectThumbnailImageDict effectThumbnailImageDict;
        ImageUrl imageUrl;
        ProductAREffectContainer productAREffectContainer = this.A04;
        if (productAREffectContainer != null && (effectThumbnailImageDict = productAREffectContainer.A00.A00.A02) != null && (imageUrl = effectThumbnailImageDict.A00) != null) {
            return imageUrl;
        }
        return this.A02;
    }

    @Override // com.instagram.model.effect.AREffect
    public final String A02() {
        return this.A06;
    }

    @Override // com.instagram.model.effect.AREffect
    public final String A03() {
        User user;
        ProductAREffectContainer productAREffectContainer = this.A04;
        if (productAREffectContainer != null && (user = productAREffectContainer.A00.A01.A0G) != null) {
            return user.getUsername();
        }
        return this.A07;
    }

    @Override // com.instagram.model.effect.AREffect
    public final String A05() {
        String str;
        ProductAREffectContainer productAREffectContainer = this.A04;
        if (productAREffectContainer != null && (str = productAREffectContainer.A00.A01.A0e) != null) {
            return str;
        }
        return this.A0A;
    }

    @Override // com.instagram.model.effect.AREffect
    public final List A0A() {
        return this.A0E;
    }

    @Override // com.instagram.model.effect.AREffect
    public final List A0B() {
        return this.A0G;
    }

    @Override // X.InterfaceC38391qT
    public final EnumC77213d7 BqJ() {
        return this.A05;
    }

    @Override // X.InterfaceC38391qT
    public final String BqK() {
        String str = this.A09;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC38391qT
    public final Collection BqL() {
        return Collections.EMPTY_LIST;
    }

    @Override // X.InterfaceC38391qT
    public final Integer BqO() {
        return C05F.A0N;
    }

    @Override // X.InterfaceC38391qT
    public final boolean CcN() {
        return AbstractC167007dF.A1X(this.A05, EnumC77213d7.A04);
    }

    @Override // com.instagram.model.effect.AREffect
    public final String getId() {
        return this.A09;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00);
        parcel.writeByte(AbstractC167007dF.A1X(this.A05, EnumC77213d7.A04) ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.A0E);
        parcel.writeStringList(this.A0G);
        parcel.writeString(this.A0C);
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A0B);
        parcel.writeStringList(this.A0F);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0D);
        parcel.writeSerializable(this.A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.8B8, java.lang.Object, X.1vN] */
    @Override // X.InterfaceC38391qT
    public final void AEH(AbstractC12990ll abstractC12990ll) {
        C25671My A00 = AbstractC25651Mw.A00(abstractC12990ll);
        String str = this.A09;
        EnumC77213d7 enumC77213d7 = this.A05;
        ?? obj = new Object();
        obj.A01 = str;
        obj.A00 = enumC77213d7;
        A00.E4s(obj);
    }

    @Override // X.InterfaceC38391qT
    public final void Ed3(EnumC77213d7 enumC77213d7) {
        this.A05 = enumC77213d7;
    }
}
