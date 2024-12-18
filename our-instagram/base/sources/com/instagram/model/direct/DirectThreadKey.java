package com.instagram.model.direct;

import X.AnonymousClass001;
import X.C17D;
import X.C3o9;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public class DirectThreadKey implements Comparable, Parcelable, C3o9 {
    public static final Parcelable.Creator CREATOR = new C9Ay(3);
    public String A00;
    public String A01;
    public List A02;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DirectThreadKey(java.util.Collection r3) {
        /*
            r2 = this;
            r1 = 0
            if (r3 != 0) goto L8
            r0 = 0
        L4:
            r2.<init>(r1, r0)
            return
        L8:
            java.util.ArrayList r0 = A00(r3)
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.direct.DirectThreadKey.<init>(java.util.Collection):void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectThreadKey)) {
            return false;
        }
        DirectThreadKey directThreadKey = (DirectThreadKey) obj;
        String str2 = this.A00;
        if (str2 != null && (str = directThreadKey.A00) != null) {
            return str2.equals(str);
        }
        List list = this.A02;
        if (list == null || directThreadKey.A02 == null) {
            return str2 == null && directThreadKey.A00 == null && list == null && directThreadKey.A02 == null;
        }
        return new ArrayList(list).equals(new ArrayList(directThreadKey.A02));
    }

    public final String A01() {
        StringBuilder sb = new StringBuilder();
        String str = this.A00;
        if (str != null) {
            return AnonymousClass001.A0R("thread:", str);
        }
        this.A02.getClass();
        sb.append("recipients:");
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) this.A02.get(i));
            sb.append(',');
        }
        return sb.substring(0, sb.length() - 1);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        String str;
        DirectThreadKey directThreadKey = (DirectThreadKey) obj;
        String str2 = this.A00;
        if (str2 != null && (str = directThreadKey.A00) != null) {
            return str2.compareTo(str);
        }
        int i = -1;
        if (str2 != null) {
            return 1;
        }
        if (directThreadKey.A00 == null) {
            List list = this.A02;
            list.getClass();
            int size = list.size();
            List list2 = directThreadKey.A02;
            list2.getClass();
            int size2 = list2.size();
            if (size == size2) {
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    List list3 = this.A02;
                    list3.getClass();
                    String str3 = (String) list3.get(i2);
                    List list4 = directThreadKey.A02;
                    list4.getClass();
                    int compareTo = str3.compareTo((String) list4.get(i2));
                    if (compareTo != 0) {
                        return compareTo;
                    }
                }
            } else if (size >= size2) {
                return 1;
            }
        }
        return i;
    }

    public final int hashCode() {
        String str = this.A00;
        if (str != null) {
            return str.hashCode();
        }
        List list = this.A02;
        list.getClass();
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DirectThreadKey{mThreadId='");
        sb.append(this.A00);
        sb.append('\'');
        sb.append(", mThreadV2Id='");
        sb.append(this.A01);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeStringList(this.A02);
    }

    public static ArrayList A00(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((C17D) it.next()).getId());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (r4 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DirectThreadKey(java.lang.String r3, java.util.List r4) {
        /*
            r2 = this;
            r1 = 0
            r2.<init>()
            if (r3 != 0) goto L9
            r0 = 0
            if (r4 == 0) goto La
        L9:
            r0 = 1
        La:
            X.C18C.A0E(r0)
            r2.A00 = r3
            r2.A02 = r4
            if (r4 == 0) goto L16
            java.util.Collections.sort(r4)
        L16:
            r2.A01 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.direct.DirectThreadKey.<init>(java.lang.String, java.util.List):void");
    }

    public DirectThreadKey(String str) {
        this(str, null);
    }

    public DirectThreadKey() {
    }
}
