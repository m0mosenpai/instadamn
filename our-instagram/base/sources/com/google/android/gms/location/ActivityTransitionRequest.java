package com.google.android.gms.location;

import X.AbstractC128825rw;
import X.AbstractC167007dF;
import X.AbstractC31177DnL;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.C3U5;
import X.C63471SlC;
import X.SSI;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes10.dex */
public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public final String A00;
    public final List A01;
    public final List A02;
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(69);
    public static final Comparator A03 = new Object();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
                if (!SSI.A01(this.A01, activityTransitionRequest.A01) || !SSI.A01(this.A00, activityTransitionRequest.A00) || !SSI.A01(this.A02, activityTransitionRequest.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.A01.hashCode() * 31) + AbstractC31177DnL.A04(this.A00)) * 31;
        List list = this.A02;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.A01);
        String str = this.A00;
        String valueOf2 = String.valueOf(this.A02);
        StringBuilder A15 = AbstractC58320PtC.A15(valueOf2, AbstractC58319PtB.A05(valueOf) + 61 + AbstractC58319PtB.A05(str));
        A15.append("ActivityTransitionRequest [mTransitions=");
        A15.append(valueOf);
        A15.append(", mTag='");
        AbstractC58319PtB.A1K(A15, str);
        A15.append(", mClients=");
        A15.append(valueOf2);
        return AbstractC58320PtC.A14(A15);
    }

    public ActivityTransitionRequest(List list, List list2, String str) {
        List unmodifiableList;
        C3U5.A03(list, "transitions can't be null");
        C3U5.A08(AbstractC167007dF.A1O(list.size()), "transitions can't be empty.");
        TreeSet treeSet = new TreeSet(A03);
        for (Object obj : list) {
            C3U5.A08(treeSet.add(obj), String.format("Found duplicated transition: %s.", obj));
        }
        this.A01 = Collections.unmodifiableList(list);
        this.A00 = str;
        if (list2 == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list2);
        }
        this.A02 = unmodifiableList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0E(parcel, this.A01, 1, false);
        AbstractC128825rw.A0B(parcel, this.A00);
        AbstractC128825rw.A0E(parcel, this.A02, 3, false);
        AbstractC128825rw.A06(parcel, A04);
    }
}
