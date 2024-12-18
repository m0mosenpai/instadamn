package com.instagram.shopping.interactor.destination.home.state;

import X.AbstractC06930Yk;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC37302Gc3;
import X.AbstractC37304Gc5;
import X.C0T6;
import X.C14360o3;
import X.C16910sj;
import X.C37324GcR;
import X.C38685GzQ;
import X.EnumC77173d3;
import X.EnumC77213d7;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public final class ShoppingHomeState extends C0T6 implements Parcelable {
    public static final C37324GcR CREATOR = C37324GcR.A00(65);
    public final C38685GzQ A00;
    public final HiddenIds A01;
    public final LikeSaveStatus A02;

    /* loaded from: classes7.dex */
    public final class HiddenIds extends C0T6 implements Parcelable {
        public static final Parcelable.Creator CREATOR = C37324GcR.A00(66);
        public final Set A00;
        public final Set A01;
        public final Set A02;
        public final Set A03;
        public final Set A04;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof HiddenIds) {
                    HiddenIds hiddenIds = (HiddenIds) obj;
                    if (!C14360o3.A0K(this.A03, hiddenIds.A03) || !C14360o3.A0K(this.A00, hiddenIds.A00) || !C14360o3.A0K(this.A01, hiddenIds.A01) || !C14360o3.A0K(this.A04, hiddenIds.A04) || !C14360o3.A0K(this.A02, hiddenIds.A02)) {
                    }
                }
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            Iterator A0h = AbstractC37302Gc3.A0h(parcel, this.A03);
            while (A0h.hasNext()) {
                AbstractC37302Gc3.A0p(parcel, A0h);
            }
            Iterator A0h2 = AbstractC37302Gc3.A0h(parcel, this.A00);
            while (A0h2.hasNext()) {
                AbstractC37302Gc3.A0p(parcel, A0h2);
            }
            Iterator A0h3 = AbstractC37302Gc3.A0h(parcel, this.A01);
            while (A0h3.hasNext()) {
                AbstractC37302Gc3.A0p(parcel, A0h3);
            }
            Iterator A0h4 = AbstractC37302Gc3.A0h(parcel, this.A04);
            while (A0h4.hasNext()) {
                AbstractC37302Gc3.A0p(parcel, A0h4);
            }
            Iterator A0h5 = AbstractC37302Gc3.A0h(parcel, this.A02);
            while (A0h5.hasNext()) {
                AbstractC37302Gc3.A0p(parcel, A0h5);
            }
        }

        public final int hashCode() {
            return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0G(this.A03)))));
        }

        public HiddenIds(Set set, Set set2, Set set3, Set set4, Set set5) {
            this.A03 = set;
            this.A00 = set2;
            this.A01 = set3;
            this.A04 = set4;
            this.A02 = set5;
        }

        public final String toString() {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("HiddenIds(hiddenProductIds=");
            A1C.append(this.A03);
            A1C.append(", hiddenAdIds=");
            A1C.append(this.A00);
            A1C.append(", hiddenMediaIds=");
            A1C.append(this.A01);
            A1C.append(", hiddenReelIds=");
            A1C.append(this.A04);
            A1C.append(", hiddenMerchantIds=");
            return AbstractC167017dG.A0o(this.A02, A1C);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public HiddenIds() {
            /*
                r6 = this;
                X.0sj r1 = X.C16910sj.A00
                r0 = r6
                r2 = r1
                r3 = r1
                r4 = r1
                r5 = r1
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.shopping.interactor.destination.home.state.ShoppingHomeState.HiddenIds.<init>():void");
        }
    }

    /* loaded from: classes7.dex */
    public final class LikeSaveStatus extends C0T6 implements Parcelable {
        public static final Parcelable.Creator CREATOR = C37324GcR.A00(67);
        public final Map A00;
        public final Map A01;
        public final Map A02;
        public final Map A03;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof LikeSaveStatus) {
                    LikeSaveStatus likeSaveStatus = (LikeSaveStatus) obj;
                    if (!C14360o3.A0K(this.A01, likeSaveStatus.A01) || !C14360o3.A0K(this.A02, likeSaveStatus.A02) || !C14360o3.A0K(this.A03, likeSaveStatus.A03) || !C14360o3.A0K(this.A00, likeSaveStatus.A00)) {
                    }
                }
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            Iterator A0s = AbstractC167017dG.A0s(parcel, this.A01);
            while (A0s.hasNext()) {
                AbstractC166997dE.A1I(parcel, (EnumC77173d3) AbstractC167027dH.A0O(parcel, A0s));
            }
            Iterator A0s2 = AbstractC167017dG.A0s(parcel, this.A02);
            while (A0s2.hasNext()) {
                AbstractC166997dE.A1I(parcel, (EnumC77213d7) AbstractC167027dH.A0O(parcel, A0s2));
            }
            Iterator A0s3 = AbstractC167017dG.A0s(parcel, this.A03);
            while (A0s3.hasNext()) {
                AbstractC166997dE.A1I(parcel, (EnumC77213d7) AbstractC167027dH.A0O(parcel, A0s3));
            }
            Iterator A0s4 = AbstractC167017dG.A0s(parcel, this.A00);
            while (A0s4.hasNext()) {
                AbstractC166997dE.A1I(parcel, (EnumC77213d7) AbstractC167027dH.A0O(parcel, A0s4));
            }
        }

        public final int hashCode() {
            return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A01))));
        }

        public LikeSaveStatus(Map map, Map map2, Map map3, Map map4) {
            this.A01 = map;
            this.A02 = map2;
            this.A03 = map3;
            this.A00 = map4;
        }

        public final String toString() {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("LikeSaveStatus(mediaLikeStatus=");
            A1C.append(this.A01);
            A1C.append(", mediaSaveStatus=");
            A1C.append(this.A02);
            A1C.append(", productSaveStatus=");
            A1C.append(this.A03);
            A1C.append(", collectionSaveStatus=");
            return AbstractC167017dG.A0o(this.A00, A1C);
        }

        public LikeSaveStatus() {
            this(AbstractC06930Yk.A0E(), AbstractC06930Yk.A0E(), AbstractC06930Yk.A0E(), AbstractC06930Yk.A0E());
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingHomeState) {
                ShoppingHomeState shoppingHomeState = (ShoppingHomeState) obj;
                if (!C14360o3.A0K(this.A00, shoppingHomeState.A00) || !C14360o3.A0K(this.A01, shoppingHomeState.A01) || !C14360o3.A0K(this.A02, shoppingHomeState.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
    }

    public ShoppingHomeState(Parcel parcel) {
        HiddenIds hiddenIds = (HiddenIds) AbstractC37304Gc5.A04(parcel, HiddenIds.class);
        if (hiddenIds == null) {
            C16910sj c16910sj = C16910sj.A00;
            hiddenIds = new HiddenIds(c16910sj, c16910sj, c16910sj, c16910sj, c16910sj);
        }
        LikeSaveStatus likeSaveStatus = (LikeSaveStatus) AbstractC37304Gc5.A04(parcel, LikeSaveStatus.class);
        likeSaveStatus = likeSaveStatus == null ? new LikeSaveStatus(AbstractC06930Yk.A0E(), AbstractC06930Yk.A0E(), AbstractC06930Yk.A0E(), AbstractC06930Yk.A0E()) : likeSaveStatus;
        this.A00 = new C38685GzQ();
        this.A01 = hiddenIds;
        this.A02 = likeSaveStatus;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00)) * 31);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ShoppingHomeState(autoplayItem=");
        A1C.append(this.A00);
        A1C.append(", hiddenIds=");
        A1C.append(this.A01);
        A1C.append(", checkerTileState=");
        A1C.append((Object) null);
        A1C.append(", likeSaveStatus=");
        A1C.append(this.A02);
        A1C.append(", cartUpdatedEvent=");
        return AbstractC167017dG.A0o(null, A1C);
    }

    public ShoppingHomeState() {
        C38685GzQ c38685GzQ = new C38685GzQ();
        C16910sj c16910sj = C16910sj.A00;
        HiddenIds hiddenIds = new HiddenIds(c16910sj, c16910sj, c16910sj, c16910sj, c16910sj);
        LikeSaveStatus likeSaveStatus = new LikeSaveStatus(AbstractC06930Yk.A0E(), AbstractC06930Yk.A0E(), AbstractC06930Yk.A0E(), AbstractC06930Yk.A0E());
        this.A00 = c38685GzQ;
        this.A01 = hiddenIds;
        this.A02 = likeSaveStatus;
    }
}
