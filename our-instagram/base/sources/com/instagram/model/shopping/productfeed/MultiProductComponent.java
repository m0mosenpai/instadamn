package com.instagram.model.shopping.productfeed;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC31174DnI;
import X.AbstractC31177DnL;
import X.AbstractC37304Gc5;
import X.AbstractC50102Ry;
import X.C41856IgA;
import X.C42726IvM;
import X.EnumC39570Hdg;
import X.EnumC39620HeU;
import X.EnumC39622HeW;
import X.InterfaceC99144cb;
import X.JI4;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.ProductCardSubtitleType;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.reels.ProductCollectionLink;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
public final class MultiProductComponent implements InterfaceC99144cb, Parcelable {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(41);
    public int A00;
    public EnumC39570Hdg A01;
    public EnumC39620HeU A02;
    public ProductFeedResponse A03;
    public EnumC39622HeW A04;
    public ProductCollectionLink A05;
    public String A06;
    public String A07;
    public String A08;
    public final Map A09;

    @Override // X.InterfaceC99144cb
    public final String Byk() {
        return null;
    }

    @Override // X.InterfaceC99144cb
    public final String Byo() {
        return null;
    }

    @Override // X.InterfaceC99144cb
    public final String C3N() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiProductComponent)) {
            return false;
        }
        MultiProductComponent multiProductComponent = (MultiProductComponent) obj;
        return AbstractC50102Ry.A00(this.A04, multiProductComponent.A04) && AbstractC50102Ry.A00(this.A06, multiProductComponent.A06) && AbstractC50102Ry.A00(this.A07, multiProductComponent.A07) && AbstractC50102Ry.A00(this.A08, multiProductComponent.A08) && this.A02 == multiProductComponent.A02 && this.A01 == multiProductComponent.A01 && this.A00 == multiProductComponent.A00 && AbstractC50102Ry.A00(this.A03, multiProductComponent.A03) && AbstractC50102Ry.A00(this.A05, multiProductComponent.A05);
    }

    public final void A01() {
        Iterator A13 = AbstractC31174DnI.A13(this.A03.A03);
        while (A13.hasNext()) {
            ProductFeedItem productFeedItem = (ProductFeedItem) A13.next();
            this.A09.put(productFeedItem.getId(), productFeedItem);
        }
    }

    public final void A02(ProductFeedItem productFeedItem) {
        Map map = this.A09;
        if (!map.containsKey(productFeedItem.getId())) {
            this.A03.A03.add(0, productFeedItem);
            map.put(productFeedItem.getId(), productFeedItem);
            this.A00++;
        }
    }

    public final boolean A03(String str) {
        Map map = this.A09;
        ProductFeedItem productFeedItem = (ProductFeedItem) map.get(str);
        if (productFeedItem != null) {
            ProductFeedResponse productFeedResponse = this.A03;
            String id = productFeedItem.getId();
            Iterator it = productFeedResponse.A03.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (((ProductFeedItem) it.next()).getId().equals(id)) {
                    it.remove();
                    z = true;
                }
            }
            if (z) {
                map.remove(str);
                this.A00--;
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.JI4, java.lang.Object] */
    @Override // X.InterfaceC99144cb
    public final JI4 Aiv() {
        ProductCollectionLink productCollectionLink = this.A05;
        if (productCollectionLink != null) {
            return new C42726IvM(productCollectionLink);
        }
        return new Object();
    }

    @Override // X.InterfaceC99144cb
    public final EnumC39622HeW B60() {
        return this.A04;
    }

    @Override // X.InterfaceC99144cb
    public final ProductCardSubtitleType Bgq() {
        return ProductCardSubtitleType.A0E;
    }

    @Override // X.InterfaceC99144cb
    public final ProductFeedResponse Bgy() {
        return this.A03;
    }

    @Override // X.InterfaceC99144cb
    public final boolean EjL(UserSession userSession) {
        return AbstractC167007dF.A1W(this.A05);
    }

    @Override // X.InterfaceC99144cb
    public final String getId() {
        return this.A06;
    }

    @Override // X.InterfaceC99144cb
    public final String getTitle() {
        return this.A07;
    }

    public final int hashCode() {
        int i = 0;
        int A0J = AbstractC166997dE.A0J(this.A03, (((AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A02, (AbstractC166997dE.A0K(this.A06, AbstractC166987dD.A0G(this.A04)) + AbstractC31177DnL.A04(this.A07)) * 31)) + AbstractC31177DnL.A04(this.A08)) * 31) + this.A00) * 31);
        ProductCollectionLink productCollectionLink = this.A05;
        if (productCollectionLink != null) {
            i = productCollectionLink.hashCode();
        }
        return A0J + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.A04);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeSerializable(this.A02);
        parcel.writeString(this.A01.A00);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A05, i);
    }

    public MultiProductComponent(Parcel parcel) {
        this.A02 = EnumC39620HeU.A04;
        EnumC39570Hdg enumC39570Hdg = EnumC39570Hdg.A04;
        this.A01 = enumC39570Hdg;
        this.A09 = AbstractC166987dD.A1G();
        Serializable readSerializable = parcel.readSerializable();
        readSerializable.getClass();
        this.A04 = (EnumC39622HeW) readSerializable;
        String readString = parcel.readString();
        readString.getClass();
        this.A06 = readString;
        this.A07 = parcel.readString();
        String readString2 = parcel.readString();
        readString2.getClass();
        this.A08 = readString2;
        Serializable readSerializable2 = parcel.readSerializable();
        readSerializable2.getClass();
        this.A02 = (EnumC39620HeU) readSerializable2;
        EnumC39570Hdg enumC39570Hdg2 = (EnumC39570Hdg) EnumC39570Hdg.A01.get(parcel.readString());
        this.A01 = enumC39570Hdg2 == null ? enumC39570Hdg : enumC39570Hdg2;
        this.A00 = parcel.readInt();
        Parcelable A04 = AbstractC37304Gc5.A04(parcel, ProductFeedResponse.class);
        A04.getClass();
        this.A03 = (ProductFeedResponse) A04;
        this.A05 = (ProductCollectionLink) AbstractC37304Gc5.A04(parcel, ProductCollectionLink.class);
        A01();
    }

    public final String A00() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(this.A04);
        A1C.append("_");
        return AbstractC166997dE.A0v(this.A02, A1C);
    }

    public MultiProductComponent() {
        this.A02 = EnumC39620HeU.A04;
        this.A01 = EnumC39570Hdg.A04;
        this.A09 = AbstractC166987dD.A1G();
    }
}
