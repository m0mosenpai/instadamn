package com.instagram.business.promote.model;

import X.AbstractC009903n;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25228BEl;
import X.C05F;
import X.C14360o3;
import X.C70220WId;
import X.MSZ;
import X.XAF;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.boost.model.BoostFlowType;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class PromoteState implements Parcelable {
    public static final C70220WId CREATOR = new C70220WId(80);
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final Map A0A = Collections.synchronizedMap(new HashMap());

    public static final void A00(PromoteData promoteData) {
        C14360o3.A0B(promoteData, 0);
        PromoteDataSnapshot promoteDataSnapshot = promoteData.A0s;
        if (promoteDataSnapshot == null) {
            promoteDataSnapshot = new PromoteDataSnapshot();
            promoteData.A0s = promoteDataSnapshot;
        }
        promoteDataSnapshot.A07 = promoteData.A0i;
        promoteDataSnapshot.A0A = promoteData.A1I;
        promoteDataSnapshot.A0C = promoteData.A2f;
        promoteDataSnapshot.A05 = promoteData.A0b;
        promoteDataSnapshot.A06 = promoteData.A0e;
        promoteDataSnapshot.A0B = promoteData.A1Z;
        promoteDataSnapshot.A01 = promoteData.A0A;
        promoteDataSnapshot.A00 = promoteData.A07;
        promoteDataSnapshot.A0D.clear();
        PromoteDataSnapshot promoteDataSnapshot2 = promoteData.A0s;
        if (promoteDataSnapshot2 != null) {
            List list = promoteDataSnapshot2.A0D;
            List list2 = promoteData.A21;
            C14360o3.A06(list2);
            list.addAll(list2);
            PromoteDataSnapshot promoteDataSnapshot3 = promoteData.A0s;
            if (promoteDataSnapshot3 != null) {
                promoteDataSnapshot3.A03 = promoteData.A0U;
                promoteDataSnapshot3.A02 = promoteData.A0T;
                promoteDataSnapshot3.A09 = promoteData.A0w;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final boolean A02(PromoteData promoteData) {
        C14360o3.A0B(promoteData, 0);
        BoostFlowType[] boostFlowTypeArr = {BoostFlowType.A05, BoostFlowType.A04};
        C14360o3.A0B(boostFlowTypeArr, 0);
        return AbstractC009903n.A0K(boostFlowTypeArr).contains(promoteData.A0l);
    }

    public final void A04(XIGIGBoostDestination xIGIGBoostDestination, PromoteData promoteData) {
        C14360o3.A0B(promoteData, 0);
        this.A05 = AbstractC167007dF.A1W(xIGIGBoostDestination);
        promoteData.A0i = xIGIGBoostDestination;
        promoteData.A26.add(xIGIGBoostDestination);
        A01(this, C05F.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(com.instagram.api.schemas.XIGIGBoostDestination r5, com.instagram.business.promote.model.PromoteData r6) {
        /*
            r4 = this;
            r3 = 0
            r2 = 1
            int r1 = r5.ordinal()
            if (r1 == r2) goto L3b
            r0 = 12
            if (r1 == r0) goto L40
            r0 = 5
            if (r1 != r0) goto L47
            com.instagram.api.schemas.XIGIGBoostDestination r1 = com.instagram.api.schemas.XIGIGBoostDestination.A04
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.A0G
            com.instagram.api.schemas.XIGIGBoostDestination[] r1 = new com.instagram.api.schemas.XIGIGBoostDestination[]{r1, r0}
        L17:
            java.util.List r0 = java.util.Arrays.asList(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            int r0 = r1.size()
            if (r0 != r2) goto L39
            java.lang.Object r0 = X.AbstractC001800i.A0I(r1)
            com.instagram.api.schemas.XIGIGBoostDestination r0 = (com.instagram.api.schemas.XIGIGBoostDestination) r0
        L2c:
            r6.A0j = r0
            r6.A20 = r1
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            r4.A07 = r0
            return
        L39:
            r0 = 0
            goto L2c
        L3b:
            com.instagram.api.schemas.XIGIGBoostDestination[] r1 = new com.instagram.api.schemas.XIGIGBoostDestination[r2]
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.A04
            goto L44
        L40:
            com.instagram.api.schemas.XIGIGBoostDestination[] r1 = new com.instagram.api.schemas.XIGIGBoostDestination[r2]
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.A0G
        L44:
            r1[r3] = r0
            goto L17
        L47:
            java.lang.String r1 = "The destination should be a messaging ads objective."
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.promote.model.PromoteState.A05(com.instagram.api.schemas.XIGIGBoostDestination, com.instagram.business.promote.model.PromoteData):void");
    }

    public final void A06(PromoteData promoteData) {
        C14360o3.A0B(promoteData, 0);
        PromoteDataSnapshot promoteDataSnapshot = promoteData.A0s;
        if (promoteDataSnapshot != null) {
            A04(promoteDataSnapshot.A07, promoteData);
            PromoteDataSnapshot promoteDataSnapshot2 = promoteData.A0s;
            if (promoteDataSnapshot2 != null) {
                promoteData.A1I = promoteDataSnapshot2.A0A;
                promoteData.A0a = promoteDataSnapshot2.A04;
                promoteData.A0b = promoteDataSnapshot2.A05;
                promoteData.A2f = promoteDataSnapshot2.A0C;
                A09(promoteData, promoteDataSnapshot2.A0B);
                PromoteDataSnapshot promoteDataSnapshot3 = promoteData.A0s;
                if (promoteDataSnapshot3 != null) {
                    A08(promoteData, promoteDataSnapshot3.A01);
                    PromoteDataSnapshot promoteDataSnapshot4 = promoteData.A0s;
                    if (promoteDataSnapshot4 != null) {
                        A07(promoteData, promoteDataSnapshot4.A00);
                        List list = promoteData.A21;
                        list.clear();
                        PromoteDataSnapshot promoteDataSnapshot5 = promoteData.A0s;
                        if (promoteDataSnapshot5 != null) {
                            list.addAll(promoteDataSnapshot5.A0D);
                            PromoteDataSnapshot promoteDataSnapshot6 = promoteData.A0s;
                            if (promoteDataSnapshot6 != null) {
                                promoteData.A0U = promoteDataSnapshot6.A03;
                                promoteData.A0T = promoteDataSnapshot6.A02;
                                promoteData.A0w = promoteDataSnapshot6.A09;
                                return;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A08(PromoteData promoteData, int i) {
        if (i != promoteData.A0A) {
            promoteData.A0A = i;
            this.A06 = AbstractC167007dF.A1O(i);
            promoteData.A0I = promoteData.A07 * i;
            promoteData.A2w = false;
            A01(this, C05F.A0j);
        }
    }

    public final void A09(PromoteData promoteData, String str) {
        boolean z = false;
        C14360o3.A0B(promoteData, 0);
        if (str != null) {
            if (!str.equals(promoteData.A1Z)) {
                z = true;
            } else {
                return;
            }
        }
        this.A02 = z;
        promoteData.A1Z = str;
        A01(this, C05F.A0N);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeByte(this.A05 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A02 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A06 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A03 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A07 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A00 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A01 ? (byte) 1 : (byte) 0);
    }

    public static final void A01(PromoteState promoteState, Integer num) {
        Iterator A16 = AbstractC166997dE.A16(promoteState.A0A);
        while (A16.hasNext()) {
            XAF xaf = (XAF) MSZ.A0n(A16);
            if (xaf != null) {
                xaf.Dc7(promoteState, num);
            }
        }
    }

    public static final boolean A03(PromoteData promoteData) {
        XIGIGBoostDestination xIGIGBoostDestination = promoteData.A0i;
        if (xIGIGBoostDestination != XIGIGBoostDestination.A04 && xIGIGBoostDestination != XIGIGBoostDestination.A0G) {
            return false;
        }
        return true;
    }

    public final void A07(PromoteData promoteData, int i) {
        if (i != promoteData.A07) {
            promoteData.A07 = i;
            this.A03 = AbstractC167007dF.A1O(i);
            if (!promoteData.A2w) {
                i *= promoteData.A0A;
            }
            promoteData.A0I = i;
            A01(this, C05F.A0Y);
        }
    }

    public final void A0A(XAF xaf) {
        Map map = this.A0A;
        if (!map.containsKey(AbstractC25228BEl.A12(xaf))) {
            map.put(AbstractC25228BEl.A12(xaf), new WeakReference(xaf));
        }
    }

    public final void A0B(XAF xaf) {
        Map map = this.A0A;
        if (map.containsKey(AbstractC25228BEl.A12(xaf))) {
            map.remove(AbstractC25228BEl.A12(xaf));
        }
    }

    public final void A0C(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            A01(this, C05F.A01);
        }
    }

    public final void A0D(boolean z) {
        if (this.A01 != z) {
            this.A01 = z;
            A01(this, C05F.A0C);
        }
    }
}
