package com.facebook.cameracore.ardelivery.model;

import X.AbstractC50102Ry;
import X.AbstractC93184Fu;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public class SparkVisionCapability implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR = new C206149Aw(7);
    public List A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        ImmutableList copyOf;
        ImmutableList copyOf2;
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            SparkVisionCapability sparkVisionCapability = (SparkVisionCapability) obj;
            List list = this.A00;
            if (list == null) {
                copyOf = null;
            } else {
                copyOf = ImmutableList.copyOf((Collection) list);
            }
            List list2 = sparkVisionCapability.A00;
            if (list2 == null) {
                copyOf2 = null;
            } else {
                copyOf2 = ImmutableList.copyOf((Collection) list2);
            }
            return AbstractC50102Ry.A00(copyOf, copyOf2);
        }
        return false;
    }

    public final int hashCode() {
        ImmutableList copyOf;
        List list = this.A00;
        if (list == null) {
            copyOf = null;
        } else {
            copyOf = ImmutableList.copyOf((Collection) list);
        }
        return Arrays.hashCode(new Object[]{copyOf});
    }

    public final String toString() {
        ImmutableList copyOf;
        ImmutableList copyOf2;
        List list = this.A00;
        if (list == null) {
            copyOf = null;
        } else {
            copyOf = ImmutableList.copyOf((Collection) list);
        }
        if (copyOf == null) {
            return "";
        }
        List list2 = this.A00;
        if (list2 == null) {
            copyOf2 = null;
        } else {
            copyOf2 = ImmutableList.copyOf((Collection) list2);
        }
        return AbstractC93184Fu.A00("", copyOf2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ImmutableList immutableList;
        List list;
        List list2 = this.A00;
        if (list2 != null && ImmutableList.copyOf((Collection) list2) != null && (list = this.A00) != null) {
            immutableList = ImmutableList.copyOf((Collection) list);
        } else {
            immutableList = null;
        }
        parcel.writeStringList(immutableList);
    }

    public SparkVisionCapability() {
        this.A00 = null;
        this.A00 = new ArrayList();
    }
}
