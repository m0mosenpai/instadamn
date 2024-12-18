package X;

import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.4W1, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4W1 {
    public final android.net.Uri A00;
    public final C123225hx A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final List A06;

    @Deprecated
    public final List A07;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4W1)) {
            return false;
        }
        C4W1 c4w1 = (C4W1) obj;
        return this.A00.equals(c4w1.A00) && Util.A0I(this.A04, c4w1.A04) && Util.A0I(this.A01, c4w1.A01) && this.A05.equals(c4w1.A05) && Util.A0I(this.A03, c4w1.A03) && this.A06.equals(c4w1.A06) && Util.A0I(this.A02, c4w1.A02);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.A00.hashCode() * 31;
        String str = this.A04;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        C123225hx c123225hx = this.A01;
        if (c123225hx == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c123225hx.hashCode();
        }
        int hashCode5 = (((i2 + hashCode2) * 31 * 31) + this.A05.hashCode()) * 31;
        String str2 = this.A03;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int hashCode6 = (((hashCode5 + hashCode3) * 31) + this.A06.hashCode()) * 31;
        Object obj = this.A02;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode6 + i;
    }

    public C4W1(android.net.Uri uri, C123225hx c123225hx, Object obj, String str, String str2, List list, List list2) {
        this.A00 = uri;
        this.A04 = str;
        this.A01 = c123225hx;
        this.A05 = list;
        this.A03 = str2;
        this.A06 = list2;
        LinkedList linkedList = new LinkedList();
        if (0 < list2.size()) {
            list2.get(0);
            throw new NullPointerException("buildUpon");
        }
        this.A07 = new ArrayList(linkedList);
        this.A02 = obj;
    }
}
