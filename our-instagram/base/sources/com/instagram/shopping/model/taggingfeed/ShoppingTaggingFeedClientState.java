package com.instagram.shopping.model.taggingfeed;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25229BEm;
import X.AbstractC25231BEo;
import X.AbstractC25234BEr;
import X.C0T6;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class ShoppingTaggingFeedClientState extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C37324GcR(89);
    public List A00;
    public List A01;
    public List A02;
    public List A03;
    public List A04;
    public List A05;
    public List A06;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingTaggingFeedClientState) {
                ShoppingTaggingFeedClientState shoppingTaggingFeedClientState = (ShoppingTaggingFeedClientState) obj;
                if (!C14360o3.A0K(this.A05, shoppingTaggingFeedClientState.A05) || !C14360o3.A0K(this.A03, shoppingTaggingFeedClientState.A03) || !C14360o3.A0K(this.A04, shoppingTaggingFeedClientState.A04) || !C14360o3.A0K(this.A00, shoppingTaggingFeedClientState.A00) || !C14360o3.A0K(this.A06, shoppingTaggingFeedClientState.A06) || !C14360o3.A0K(this.A02, shoppingTaggingFeedClientState.A02) || !C14360o3.A0K(this.A01, shoppingTaggingFeedClientState.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A05);
        while (A0u.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0u, i);
        }
        parcel.writeStringList(this.A03);
        parcel.writeStringList(this.A04);
        parcel.writeStringList(this.A00);
        parcel.writeStringList(this.A06);
        Iterator A0u2 = AbstractC25231BEo.A0u(parcel, this.A02);
        while (A0u2.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0u2, i);
        }
        parcel.writeStringList(this.A01);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ShoppingTaggingFeedClientState() {
        /*
            r8 = this;
            X.0sl r1 = X.C16930sl.A00
            r0 = r8
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState.<init>():void");
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A06, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0G(this.A05)))))));
    }

    public ShoppingTaggingFeedClientState(List list, List list2, List list3, List list4, List list5, List list6, List list7) {
        AbstractC25234BEr.A0j(2, list2, list3, list4, list5);
        C14360o3.A0B(list7, 7);
        this.A05 = list;
        this.A03 = list2;
        this.A04 = list3;
        this.A00 = list4;
        this.A06 = list5;
        this.A02 = list6;
        this.A01 = list7;
    }
}
