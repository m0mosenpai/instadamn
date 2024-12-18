package com.instagram.save.model;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25229BEm;
import X.AbstractC50102Ry;
import X.C05F;
import X.C1DW;
import X.C37324GcR;
import X.C38321qM;
import X.C40781ul;
import X.EnumC33380EpD;
import X.EnumC33416Epn;
import android.os.Parcelable;
import com.instagram.api.schemas.CollectionPrivacyModeEnum;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class SavedCollection extends C40781ul implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C37324GcR(51);
    public CollectionPrivacyModeEnum A00;
    public ImageUrl A01;
    public ImageUrl A02;
    public MediaMapPin A03;
    public C38321qM A04;
    public CollaborativeCollectionMetadata A05;
    public EnumC33380EpD A06;
    public EnumC33416Epn A07;
    public User A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Integer A0D;
    public Integer A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public List A0J;
    public List A0K;
    public List A0L;
    public List A0M;
    public boolean A0N;

    public SavedCollection(EnumC33416Epn enumC33416Epn, String str, String str2) {
        this.A07 = EnumC33416Epn.A0A;
        this.A0L = AbstractC166987dD.A1E();
        this.A0M = AbstractC166987dD.A1E();
        this.A06 = null;
        this.A0B = false;
        this.A0K = AbstractC166987dD.A1E();
        this.A02 = null;
        this.A0I = null;
        this.A0N = false;
        this.A0F = str;
        this.A0G = str2;
        this.A07 = enumC33416Epn;
        this.A06 = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int A00() {
        return AbstractC167017dG.A0K(this.A0E);
    }

    public final Integer A01(UserSession userSession) {
        if (userSession == null) {
            return C05F.A0N;
        }
        if (A07(userSession.userId)) {
            return C05F.A00;
        }
        if (this.A05 != null) {
            return C05F.A0C;
        }
        return C05F.A01;
    }

    public final boolean A05() {
        Boolean bool = this.A09;
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean A06() {
        CollectionPrivacyModeEnum collectionPrivacyModeEnum = this.A00;
        if (collectionPrivacyModeEnum != null && collectionPrivacyModeEnum == CollectionPrivacyModeEnum.A06) {
            return true;
        }
        return false;
    }

    public final boolean A07(String str) {
        User user = this.A08;
        if (user == null) {
            return true;
        }
        return user.getId().equals(str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SavedCollection)) {
            return false;
        }
        SavedCollection savedCollection = (SavedCollection) obj;
        if (!AbstractC50102Ry.A00(this.A0F, savedCollection.A0F) || !AbstractC50102Ry.A00(this.A0G, savedCollection.A0G) || !AbstractC50102Ry.A00(this.A04, savedCollection.A04) || !AbstractC50102Ry.A00(this.A07, savedCollection.A07) || !AbstractC50102Ry.A00(this.A0L, Collections.unmodifiableList(savedCollection.A0L)) || !AbstractC50102Ry.A00(this.A0C, savedCollection.A0C) || !AbstractC50102Ry.A00(this.A0A, savedCollection.A0A) || !AbstractC50102Ry.A00(Boolean.valueOf(A05()), Boolean.valueOf(savedCollection.A05())) || !AbstractC50102Ry.A00(this.A00, savedCollection.A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A0F, this.A0G, this.A04, this.A07, this.A0L, this.A0C, this.A0A, this.A09, this.A00});
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (r1 == false) goto L6;
     */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(android.os.Parcel r4, int r5) {
        /*
            r3 = this;
            java.lang.String r0 = r3.A0F
            r4.writeString(r0)
            java.lang.String r0 = r3.A0G
            r4.writeString(r0)
            java.lang.String r0 = r3.A0H
            r4.writeString(r0)
            X.Epn r0 = r3.A07
            java.lang.String r0 = r0.A01
            r4.writeString(r0)
            java.util.List r0 = r3.A0K
            r4.writeStringList(r0)
            java.lang.Boolean r0 = r3.A09
            r2 = 1
            if (r0 == 0) goto L27
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L28
        L27:
            r0 = 0
        L28:
            r4.writeInt(r0)
            java.lang.Boolean r0 = r3.A0C
            if (r0 == 0) goto L4d
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4d
        L35:
            r4.writeInt(r2)
            com.instagram.save.model.CollaborativeCollectionMetadata r0 = r3.A05
            r4.writeParcelable(r0, r5)
            com.instagram.api.schemas.CollectionPrivacyModeEnum r0 = r3.A00
            r4.writeParcelable(r0, r5)
            com.instagram.common.typedurl.ImageUrl r0 = r3.A02
            r4.writeParcelable(r0, r5)
            java.lang.String r0 = r3.A0I
            r4.writeString(r0)
            return
        L4d:
            r2 = 0
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.save.model.SavedCollection.writeToParcel(android.os.Parcel, int):void");
    }

    public final String A02() {
        if (A06()) {
            return "public";
        }
        if (this.A05 != null) {
            return "collaborative";
        }
        return "private";
    }

    public final void A03(UserSession userSession) {
        this.A04 = C1DW.A00(userSession).A02(this.A0H);
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator it = this.A0K.iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            C38321qM A0h = AbstractC25229BEm.A0h(userSession, A1B);
            if (A0h != null) {
                A1E.add(A1B);
                A1E2.add(A0h);
            }
        }
        this.A0K = A1E;
        this.A0L = A1E2;
    }

    public final void A04(List list) {
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(((ProductImageContainer) it.next()).F6D());
        }
        this.A0M = A0q;
    }

    public SavedCollection() {
        this.A07 = EnumC33416Epn.A0A;
        this.A0L = AbstractC166987dD.A1E();
        this.A0M = AbstractC166987dD.A1E();
        this.A06 = null;
        this.A0B = false;
        this.A0K = AbstractC166987dD.A1E();
        this.A02 = null;
        this.A0I = null;
        this.A0N = false;
    }
}
