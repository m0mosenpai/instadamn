package com.instagram.creation.capture.quickcapture.analytics.common;

import X.AbstractC001800i;
import X.AbstractC06930Yk;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC31178DnM;
import X.AbstractC31179DnN;
import X.AbstractC37302Gc3;
import X.AbstractC37304Gc5;
import X.AbstractC62267S4m;
import X.C14360o3;
import X.C81W;
import X.C9JF;
import X.LNM;
import X.MSY;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.instagram.api.schemas.ACRType;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.suggestions.model.GallerySuggestionsInfo;
import com.instagram.music.common.model.MusicBrowseCategory;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes9.dex */
public final class ShareMediaLoggingInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(46);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public ACRType A0A;
    public MediaUploadMetadata A0B;
    public MediaTransformation A0C;
    public GallerySuggestionsInfo A0D;
    public MusicBrowseCategory A0E;
    public Integer A0F;
    public Integer A0G;
    public Integer A0H;
    public Integer A0I;
    public Long A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public HashMap A0a;
    public HashMap A0b;
    public HashMap A0c;
    public List A0d;
    public List A0e;
    public List A0f;
    public List A0g;
    public List A0h;
    public List A0i;
    public List A0j;
    public List A0k;
    public List A0l;
    public List A0m;
    public List A0n;
    public List A0o;
    public List A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeStringList(this.A0e);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A03);
        parcel.writeStringList(this.A0g);
        parcel.writeStringList(this.A0h);
        parcel.writeStringList(this.A0f);
        Map map = this.A0a;
        if (map == null) {
            map = AbstractC06930Yk.A0E();
        }
        Bundle bundle = new Bundle(map.size());
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            AbstractC31179DnN.A0o(bundle, A15);
        }
        parcel.writeBundle(bundle);
        parcel.writeStringList(this.A0j);
        parcel.writeString(this.A0V);
        Map map2 = this.A0b;
        if (map2 == null) {
            map2 = AbstractC06930Yk.A0E();
        }
        Bundle bundle2 = new Bundle(map2.size());
        Iterator A152 = AbstractC166997dE.A15(map2);
        while (A152.hasNext()) {
            AbstractC31179DnN.A0o(bundle2, A152);
        }
        parcel.writeBundle(bundle2);
        parcel.writeInt(this.A0v ? 1 : 0);
        parcel.writeInt(this.A06);
        parcel.writeStringList(this.A0l);
        parcel.writeStringList(this.A0m);
        parcel.writeStringList(this.A0n);
        parcel.writeStringList(this.A0o);
        HashMap hashMap = this.A0c;
        Bundle bundle3 = new Bundle(hashMap.size());
        Iterator A153 = AbstractC166997dE.A15(hashMap);
        while (A153.hasNext()) {
            AbstractC31179DnN.A0o(bundle3, A153);
        }
        parcel.writeBundle(bundle3);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0S);
        parcel.writeString(this.A0R);
        parcel.writeSerializable(this.A0G);
        parcel.writeString(this.A0Z);
        parcel.writeInt(AbstractC37302Gc3.A02(this.A0H));
        parcel.writeInt(AbstractC25227BEk.A06(this.A0I, -1));
        parcel.writeString(this.A0N);
        parcel.writeInt(this.A0w ? 1 : 0);
        parcel.writeParcelable(this.A0E, i);
        parcel.writeInt(this.A0x ? 1 : 0);
        parcel.writeLong(this.A09);
        parcel.writeParcelable(this.A0C, i);
        parcel.writeInt(this.A0z ? 1 : 0);
        parcel.writeInt(AbstractC167017dG.A0K(this.A0F));
        parcel.writeInt(this.A0y ? 1 : 0);
        parcel.writeParcelable(this.A0D, i);
        parcel.writeStringList(this.A0d);
        parcel.writeInt(this.A13 ? 1 : 0);
        parcel.writeList(this.A0k);
        parcel.writeList(this.A0p);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A00);
        ACRType aCRType = this.A0A;
        if (aCRType == null || (str = aCRType.A00) == null) {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeString(this.A0O);
        parcel.writeString(this.A0Y);
        parcel.writeInt(this.A0r ? 1 : 0);
        parcel.writeInt(this.A0s ? 1 : 0);
        parcel.writeInt(this.A0t ? 1 : 0);
        parcel.writeInt(this.A0u ? 1 : 0);
        parcel.writeInt(this.A12 ? 1 : 0);
        parcel.writeString(this.A0X);
        parcel.writeString(this.A0W);
        parcel.writeLong(AbstractC31178DnM.A03(this.A0J));
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A10 ? 1 : 0);
        parcel.writeString(this.A0K);
        parcel.writeParcelable(this.A0B, i);
        parcel.writeList(this.A0i);
        parcel.writeString(this.A0U);
        parcel.writeString(this.A0T);
        parcel.writeString(this.A0P);
        parcel.writeInt(this.A11 ? 1 : 0);
        parcel.writeInt(this.A0q ? 1 : 0);
    }

    public ShareMediaLoggingInfo(Parcel parcel) {
        Integer num;
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        ACRType aCRType;
        this.A0e = AbstractC166987dD.A1E();
        this.A0c = AbstractC166987dD.A1G();
        this.A0O = "";
        this.A0B = new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false);
        this.A05 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        parcel.readStringList(this.A0e);
        this.A04 = parcel.readInt();
        this.A03 = parcel.readInt();
        ArrayList A1E = AbstractC166987dD.A1E();
        parcel.readStringList(A1E);
        this.A0g = A1E;
        ArrayList A1E2 = AbstractC166987dD.A1E();
        parcel.readStringList(A1E2);
        this.A0h = A1E2;
        ArrayList A1E3 = AbstractC166987dD.A1E();
        parcel.readStringList(A1E3);
        this.A0f = A1E3;
        Class<?> cls = getClass();
        this.A0a = AbstractC62267S4m.A00(MSY.A08(parcel, cls));
        ArrayList A1E4 = AbstractC166987dD.A1E();
        parcel.readStringList(A1E4);
        this.A0j = A1E4;
        this.A0V = parcel.readString();
        this.A0b = AbstractC62267S4m.A00(MSY.A08(parcel, cls));
        this.A0v = AbstractC167007dF.A1P(parcel.readInt(), 1);
        this.A06 = parcel.readInt();
        ArrayList A1E5 = AbstractC166987dD.A1E();
        parcel.readStringList(A1E5);
        this.A0l = A1E5;
        ArrayList A1E6 = AbstractC166987dD.A1E();
        parcel.readStringList(A1E6);
        this.A0m = A1E6;
        ArrayList A1E7 = AbstractC166987dD.A1E();
        parcel.readStringList(A1E7);
        this.A0n = A1E7;
        ArrayList A1E8 = AbstractC166987dD.A1E();
        parcel.readStringList(A1E8);
        this.A0o = A1E8;
        this.A0c = AbstractC62267S4m.A00(MSY.A08(parcel, cls));
        this.A0L = parcel.readString();
        this.A0M = parcel.readString();
        this.A0S = parcel.readString();
        this.A0R = parcel.readString();
        Serializable readSerializable = parcel.readSerializable();
        if (readSerializable instanceof Integer) {
            num = (Integer) readSerializable;
        } else {
            num = null;
        }
        this.A0G = num;
        this.A0Z = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt == -1) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(readInt);
        }
        this.A0H = valueOf;
        int readInt2 = parcel.readInt();
        if (readInt2 == -1) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(readInt2);
        }
        this.A0I = valueOf2;
        this.A0N = parcel.readString();
        this.A0w = AbstractC167007dF.A1P(parcel.readInt(), 1);
        this.A0E = (MusicBrowseCategory) AbstractC37304Gc5.A04(parcel, MusicBrowseCategory.class);
        this.A0x = AbstractC167007dF.A1P(parcel.readInt(), 1);
        this.A09 = parcel.readLong();
        this.A0C = (MediaTransformation) AbstractC37304Gc5.A04(parcel, MediaTransformation.class);
        this.A0z = AbstractC167007dF.A1P(parcel.readInt(), 1);
        int readInt3 = parcel.readInt();
        if (readInt3 == 0) {
            valueOf3 = null;
        } else {
            valueOf3 = Integer.valueOf(readInt3);
        }
        this.A0F = valueOf3;
        this.A0y = AbstractC167007dF.A1P(parcel.readInt(), 1);
        this.A0D = (GallerySuggestionsInfo) AbstractC37304Gc5.A04(parcel, GallerySuggestionsInfo.class);
        ArrayList A1E9 = AbstractC166987dD.A1E();
        parcel.readStringList(A1E9);
        this.A0d = A1E9;
        this.A13 = AbstractC167007dF.A1P(parcel.readInt(), 1);
        ArrayList A1E10 = AbstractC166987dD.A1E();
        int i = Build.VERSION.SDK_INT;
        ClassLoader classLoader = List.class.getClassLoader();
        if (i >= 33) {
            parcel.readList(A1E10, classLoader, Long.TYPE);
        } else {
            parcel.readList(A1E10, classLoader);
        }
        this.A0k = A1E10;
        ArrayList A1E11 = AbstractC166987dD.A1E();
        ClassLoader classLoader2 = List.class.getClassLoader();
        if (i >= 33) {
            parcel.readList(A1E11, classLoader2, Long.TYPE);
        } else {
            parcel.readList(A1E11, classLoader2);
        }
        this.A0p = A1E11;
        this.A08 = parcel.readInt();
        this.A00 = parcel.readInt();
        String readString = parcel.readString();
        if (readString != null && readString.length() != 0) {
            aCRType = C9JF.A00(readString);
        } else {
            aCRType = null;
        }
        this.A0A = aCRType;
        String readString2 = parcel.readString();
        this.A0O = readString2 != null ? readString2 : "";
        this.A0Y = parcel.readString();
        this.A0r = AbstractC167007dF.A1P(parcel.readInt(), 1);
        this.A0s = AbstractC167007dF.A1P(parcel.readInt(), 1);
        this.A0t = AbstractC167007dF.A1P(parcel.readInt(), 1);
        this.A0u = AbstractC167007dF.A1P(parcel.readInt(), 1);
        this.A12 = AbstractC167007dF.A1P(parcel.readInt(), 1);
        this.A0X = parcel.readString();
        this.A0W = parcel.readString();
        long readLong = parcel.readLong();
        this.A0J = readLong >= 0 ? Long.valueOf(readLong) : null;
        this.A07 = parcel.readInt();
        this.A10 = AbstractC167007dF.A1P(parcel.readInt(), 1);
        this.A0K = parcel.readString();
        MediaUploadMetadata mediaUploadMetadata = (MediaUploadMetadata) AbstractC37304Gc5.A04(parcel, MediaUploadMetadata.class);
        this.A0B = mediaUploadMetadata == null ? new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false) : mediaUploadMetadata;
        ArrayList A1E12 = AbstractC166987dD.A1E();
        ClassLoader classLoader3 = List.class.getClassLoader();
        if (i >= 33) {
            parcel.readList(A1E12, classLoader3, Long.TYPE);
        } else {
            parcel.readList(A1E12, classLoader3);
        }
        this.A0i = A1E12;
        this.A0U = parcel.readString();
        this.A0T = parcel.readString();
        this.A0P = parcel.readString();
        this.A11 = AbstractC167007dF.A1P(parcel.readInt(), 1);
        this.A0q = parcel.readInt() == 1;
    }

    public final Pair A00() {
        Collection collection;
        Collection collection2;
        List list = this.A0o;
        List list2 = this.A0n;
        HashMap hashMap = this.A0c;
        if (hashMap != null && hashMap.size() > 0) {
            Set keySet = hashMap.keySet();
            C14360o3.A07(keySet);
            Collection A0a = AbstractC001800i.A0a(keySet);
            Collection values = hashMap.values();
            C14360o3.A07(values);
            ArrayList A0q = AbstractC167017dG.A0q(values);
            for (Object obj : values) {
                if (obj == null) {
                    obj = "";
                }
                A0q.add(obj);
            }
            collection2 = AbstractC001800i.A0a(A0q);
            collection = A0a;
        } else {
            ArrayList A1E = AbstractC166987dD.A1E();
            if (list2 != null) {
                A1E.addAll(list2);
            }
            ArrayList A1E2 = AbstractC166987dD.A1E();
            collection2 = A1E2;
            collection = A1E;
            if (list != null) {
                A1E2.addAll(list);
                collection2 = A1E2;
                collection = A1E;
            }
        }
        return new Pair(collection, collection2);
    }

    public final ArrayList A01() {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = this.A0e.iterator();
        while (it.hasNext()) {
            A1E.add(C81W.valueOf(AbstractC166987dD.A1B(it)));
        }
        return A1E;
    }

    public ShareMediaLoggingInfo() {
        this.A0e = AbstractC166987dD.A1E();
        this.A0c = AbstractC166987dD.A1G();
        this.A0O = "";
        this.A0B = new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false);
    }
}
