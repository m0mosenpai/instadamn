package com.instagram.discovery.filters.intf;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC50102Ry;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
public class FilterConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNL.A00(57);
    public final Map A00;
    public final Map A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterConfig)) {
            return false;
        }
        FilterConfig filterConfig = (FilterConfig) obj;
        return AbstractC50102Ry.A00(this.A00, filterConfig.A00) && AbstractC50102Ry.A00(this.A01, filterConfig.A01);
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.A00);
        parcel.writeMap(this.A01);
    }

    public FilterConfig(Map map) {
        Map map2;
        Object key;
        Object value;
        boolean z;
        this.A00 = AbstractC166987dD.A1G();
        this.A01 = AbstractC166987dD.A1G();
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            if ("true".equalsIgnoreCase((String) A1K.getValue())) {
                map2 = this.A01;
                key = A1K.getKey();
                z = true;
            } else if ("false".equalsIgnoreCase((String) A1K.getValue())) {
                map2 = this.A01;
                key = A1K.getKey();
                z = false;
            } else {
                map2 = this.A00;
                key = A1K.getKey();
                value = A1K.getValue();
                map2.put(key, value);
            }
            value = Boolean.valueOf(z);
            map2.put(key, value);
        }
    }

    public FilterConfig(Parcel parcel) {
        HashMap A1G = AbstractC166987dD.A1G();
        this.A00 = A1G;
        HashMap A1G2 = AbstractC166987dD.A1G();
        this.A01 = A1G2;
        parcel.readMap(A1G, Map.class.getClassLoader());
        parcel.readMap(A1G2, Map.class.getClassLoader());
    }
}
