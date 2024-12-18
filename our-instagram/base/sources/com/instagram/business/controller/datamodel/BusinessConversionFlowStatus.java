package com.instagram.business.controller.datamodel;

import X.AbstractC166987dD;
import X.AbstractC25231BEo;
import X.AbstractC31172DnG;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public final class BusinessConversionFlowStatus implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(32);
    public final int A00;
    public final ImmutableList A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BusinessConversionFlowStatus)) {
            return false;
        }
        BusinessConversionFlowStatus businessConversionFlowStatus = (BusinessConversionFlowStatus) obj;
        if (businessConversionFlowStatus.A00 == this.A00) {
            return AbstractC25231BEo.A1Z(businessConversionFlowStatus.A01, this.A01, false);
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeList(this.A01);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BusinessConversionStep A00() {
        int i = this.A00;
        if (i > -1) {
            ImmutableList immutableList = this.A01;
            if (i != immutableList.size()) {
                return (BusinessConversionStep) immutableList.get(i);
            }
            return null;
        }
        return null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), this.A01});
    }

    public BusinessConversionFlowStatus(Parcel parcel) {
        this.A00 = parcel.readInt();
        ImmutableList.Builder builder = new ImmutableList.Builder();
        ArrayList A1E = AbstractC166987dD.A1E();
        parcel.readList(A1E, BusinessConversionStep.class.getClassLoader());
        builder.addAll(A1E);
        this.A01 = builder.build();
    }

    public BusinessConversionFlowStatus(List list, int i) {
        C14360o3.A0B(list, 1);
        if (AbstractC166987dD.A1b(list)) {
            ImmutableList.Builder builder = new ImmutableList.Builder();
            builder.addAll(list);
            ImmutableList A0K = AbstractC31172DnG.A0K(builder);
            this.A01 = A0K;
            if (i >= -1 && i <= A0K.size()) {
                this.A00 = i;
                return;
            }
            throw AbstractC31172DnG.A0u();
        }
        throw AbstractC31172DnG.A0u();
    }

    public BusinessConversionFlowStatus(List list) {
        if (AbstractC166987dD.A1b(list)) {
            ImmutableList.Builder builder = new ImmutableList.Builder();
            builder.addAll(list);
            this.A01 = AbstractC31172DnG.A0K(builder);
            this.A00 = -1;
            return;
        }
        throw AbstractC31172DnG.A0u();
    }
}
