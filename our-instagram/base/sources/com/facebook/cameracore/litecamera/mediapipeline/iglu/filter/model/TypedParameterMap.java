package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model;

import X.AbstractC06930Yk;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C14360o3;
import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class TypedParameterMap implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63475SlG(38);
    public Map A00;
    public Map A01;
    public Map A02;
    public Map A03;
    public Map A04;
    public Map A05;
    public Map A06;

    public TypedParameterMap(Map map, Map map2, Map map3, Map map4, Map map5, Map map6, Map map7) {
        AbstractC167027dH.A0a(1, map, map2, map3, map4);
        C14360o3.A0B(map5, 5);
        AbstractC167017dG.A1U(map6, map7);
        this.A02 = map;
        this.A01 = map2;
        this.A03 = map3;
        this.A00 = map4;
        this.A04 = map5;
        this.A05 = map6;
        this.A06 = map7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Iterator A0s = AbstractC167017dG.A0s(parcel, this.A02);
        while (A0s.hasNext()) {
            parcel.writeFloat(AbstractC166987dD.A09(AbstractC167027dH.A0O(parcel, A0s)));
        }
        Iterator A0s2 = AbstractC167017dG.A0s(parcel, this.A01);
        while (A0s2.hasNext()) {
            parcel.writeFloatArray((float[]) AbstractC167027dH.A0O(parcel, A0s2));
        }
        Iterator A0s3 = AbstractC167017dG.A0s(parcel, this.A03);
        while (A0s3.hasNext()) {
            parcel.writeInt(AbstractC166987dD.A0H(AbstractC167027dH.A0O(parcel, A0s3)));
        }
        Iterator A0s4 = AbstractC167017dG.A0s(parcel, this.A00);
        while (A0s4.hasNext()) {
            parcel.writeInt(AbstractC166987dD.A1a(AbstractC167027dH.A0O(parcel, A0s4)) ? 1 : 0);
        }
        Iterator A0s5 = AbstractC167017dG.A0s(parcel, this.A04);
        while (A0s5.hasNext()) {
            parcel.writeString((String) AbstractC167027dH.A0O(parcel, A0s5));
        }
        Iterator A0s6 = AbstractC167017dG.A0s(parcel, this.A05);
        while (A0s6.hasNext()) {
            parcel.writeString((String) AbstractC167027dH.A0O(parcel, A0s6));
        }
        Iterator A0s7 = AbstractC167017dG.A0s(parcel, this.A06);
        while (A0s7.hasNext()) {
            parcel.writeString((String) AbstractC167027dH.A0O(parcel, A0s7));
        }
    }

    public final TypedParameterMap A00() {
        return new TypedParameterMap(AbstractC06930Yk.A03(this.A02), AbstractC06930Yk.A03(this.A01), AbstractC06930Yk.A03(this.A03), AbstractC06930Yk.A03(this.A00), AbstractC06930Yk.A03(this.A04), AbstractC06930Yk.A03(this.A05), AbstractC06930Yk.A03(this.A06));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TypedParameterMap) {
            TypedParameterMap typedParameterMap = (TypedParameterMap) obj;
            if (C14360o3.A0K(this.A02, typedParameterMap.A02)) {
                Map map = this.A01;
                Map map2 = typedParameterMap.A01;
                if (map.size() == map2.size()) {
                    Iterator A15 = AbstractC166997dE.A15(map);
                    while (true) {
                        if (A15.hasNext()) {
                            Map.Entry A1K = AbstractC166987dD.A1K(A15);
                            if (!Arrays.equals((float[]) A1K.getValue(), (float[]) map2.get(A1K.getKey()))) {
                                break;
                            }
                        } else {
                            if (!C14360o3.A0K(this.A03, typedParameterMap.A03) || !C14360o3.A0K(this.A00, typedParameterMap.A00) || !C14360o3.A0K(this.A04, typedParameterMap.A04) || !C14360o3.A0K(this.A05, typedParameterMap.A05) || !C14360o3.A0K(this.A06, typedParameterMap.A06)) {
                                break;
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.A02.hashCode();
        Iterator A15 = AbstractC166997dE.A15(this.A01);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            hashCode = AbstractC166997dE.A0K((String) A1K.getKey(), hashCode * 31) + Arrays.hashCode((float[]) A1K.getValue());
        }
        return AbstractC166987dD.A0I(this.A06, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A03, hashCode * 31)))));
    }

    public TypedParameterMap() {
        this(AbstractC166987dD.A1I(), AbstractC166987dD.A1I(), AbstractC166987dD.A1I(), AbstractC166987dD.A1I(), AbstractC166987dD.A1I(), AbstractC166987dD.A1I(), AbstractC166987dD.A1I());
    }
}
