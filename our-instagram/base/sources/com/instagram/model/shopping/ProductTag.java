package com.instagram.model.shopping;

import X.AbstractC37300Gc1;
import X.AbstractC38048Gob;
import X.AnonymousClass182;
import X.C14360o3;
import X.C41856IgA;
import X.EnumC53319Nhv;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.tagging.model.Tag;
import com.instagram.tagging.model.TaggableModel;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;

/* loaded from: classes7.dex */
public class ProductTag extends Tag {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(17);
    public int A00;
    public ProductAutoTagMetadata A01;
    public ProductDetailsProductItemDictIntf A02;
    public String A03;
    public boolean A04;

    @Override // com.instagram.tagging.model.Tag
    public final String A03() {
        return "product_id";
    }

    @Override // com.instagram.tagging.model.Tag
    public final PointF A00() {
        return super.A00;
    }

    @Override // com.instagram.tagging.model.Tag
    public final EnumC53319Nhv A01() {
        return EnumC53319Nhv.A08;
    }

    @Override // com.instagram.tagging.model.Tag
    public final String A04() {
        return this.A02.getName();
    }

    @Override // com.instagram.tagging.model.Tag
    public final /* bridge */ /* synthetic */ void A06(TaggableModel taggableModel) {
        Product product = (Product) taggableModel;
        C14360o3.A0B(product, 0);
        this.A02 = product.A01;
    }

    @Override // com.instagram.tagging.model.Tag
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A02.equals(((ProductTag) obj).A02);
    }

    @Override // com.instagram.tagging.model.Tag
    public final int hashCode() {
        return this.A02.hashCode();
    }

    public ProductTag(Product product) {
        this.A03 = null;
        this.A01 = null;
        C14360o3.A0B(product, 0);
        this.A02 = product.A01;
    }

    @Override // com.instagram.tagging.model.Tag
    public final /* bridge */ /* synthetic */ TaggableModel A02() {
        return AbstractC38048Gob.A00(this);
    }

    @Override // com.instagram.tagging.model.Tag
    public final void A05(AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0S("merchant_id", AbstractC37300Gc1.A0T(AbstractC38048Gob.A00(this)));
        if (AbstractC38048Gob.A00(this).A04 != null && AbstractC38048Gob.A00(this).A04.AaM() != null) {
            anonymousClass182.A0S("affiliate_campaign_id", AbstractC38048Gob.A00(this).A04.AaM());
        }
        if (AbstractC38048Gob.A00(this).A00 != null) {
            anonymousClass182.A0S("waterfall_id", AbstractC38048Gob.A00(this).A00.A01);
            anonymousClass182.A0S("session_instance_id", AbstractC38048Gob.A00(this).A00.A00);
        }
        String str = this.A03;
        if (str != null) {
            anonymousClass182.A0S("creation_method", str);
        }
    }

    @Override // com.instagram.tagging.model.Tag, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
    }

    public ProductTag() {
        this(new Product(null, AbstractC38048Gob.A02()));
    }
}
