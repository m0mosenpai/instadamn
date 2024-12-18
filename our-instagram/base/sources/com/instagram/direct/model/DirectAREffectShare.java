package com.instagram.direct.model;

import X.AbstractC13670mt;
import X.AbstractC25225BEi;
import X.C37771pE;
import X.C45555KEu;
import X.C47454Kxj;
import X.C47455Kxk;
import X.C47636L1v;
import X.C47697L4e;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.EffectThumbnailImageDict;
import com.instagram.model.shopping.ProductAREffectContainer;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class DirectAREffectShare implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNL.A00(21);
    public ImageUrl A00;
    public ImageUrl A01;
    public C45555KEu A02;
    public C37771pE A03;
    public ProductAREffectContainer A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public List A09 = Collections.emptyList();
    public List A0A = Collections.emptyList();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ImageUrl A00() {
        C47455Kxk c47455Kxk;
        C47697L4e c47697L4e;
        C47454Kxj c47454Kxj;
        EffectThumbnailImageDict effectThumbnailImageDict;
        ProductAREffectContainer productAREffectContainer = this.A04;
        if (productAREffectContainer != null && (effectThumbnailImageDict = productAREffectContainer.A00.A00.A02) != null) {
            return effectThumbnailImageDict.A00;
        }
        ImageUrl imageUrl = this.A01;
        if (imageUrl != null) {
            return imageUrl;
        }
        C45555KEu c45555KEu = this.A02;
        if (c45555KEu == null || (c47455Kxk = c45555KEu.A00) == null || (c47697L4e = c47455Kxk.A00) == null || (c47454Kxj = c47697L4e.A03) == null || AbstractC13670mt.A0B(c47454Kxj.A00)) {
            return null;
        }
        return AbstractC25225BEi.A0t(c47454Kxj.A00);
    }

    public final String A01() {
        C47455Kxk c47455Kxk;
        C47697L4e c47697L4e;
        User user;
        ProductAREffectContainer productAREffectContainer = this.A04;
        if (productAREffectContainer != null && (user = productAREffectContainer.A00.A01.A0G) != null) {
            return user.getUsername();
        }
        String str = this.A06;
        if (str != null) {
            return str;
        }
        C45555KEu c45555KEu = this.A02;
        if (c45555KEu != null && (c47455Kxk = c45555KEu.A00) != null && (c47697L4e = c47455Kxk.A00) != null) {
            C47636L1v c47636L1v = c47697L4e.A00;
            if (c47636L1v == null) {
                return "Instagram";
            }
            String str2 = c47636L1v.A02;
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }

    public final String A02() {
        C47455Kxk c47455Kxk;
        C47697L4e c47697L4e;
        String str;
        String str2 = this.A07;
        if (str2 == null) {
            C45555KEu c45555KEu = this.A02;
            str2 = "";
            if (c45555KEu != null && (c47455Kxk = c45555KEu.A00) != null && (c47697L4e = c47455Kxk.A00) != null && (str = c47697L4e.A05) != null) {
                return str;
            }
        }
        return str2;
    }

    public final String A03() {
        String str;
        C47455Kxk c47455Kxk;
        C47697L4e c47697L4e;
        String str2;
        ProductAREffectContainer productAREffectContainer = this.A04;
        if ((productAREffectContainer == null || (str = productAREffectContainer.A00.A01.A0e) == null) && (str = this.A08) == null) {
            C45555KEu c45555KEu = this.A02;
            str = "";
            if (c45555KEu != null && (c47455Kxk = c45555KEu.A00) != null && (c47697L4e = c47455Kxk.A00) != null && (str2 = c47697L4e.A06) != null) {
                return str2;
            }
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A00, i);
    }
}
