package X;

import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.47l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C915547l {
    public int A00;
    public int A01;
    public int A03;
    public long A04;
    public long A05;
    public Integer A06;
    public boolean A0G;
    public java.util.Set A0F = new LinkedHashSet();
    public String A09 = "empty";
    public String A08 = "empty";
    public int A02 = 1;
    public java.util.Set A0D = new CopyOnWriteArraySet();
    public java.util.Set A0E = new CopyOnWriteArraySet();
    public java.util.Set A0C = new CopyOnWriteArraySet();
    public Map A0B = new ConcurrentHashMap();
    public String A07 = "";
    public Map A0A = new ConcurrentHashMap();

    public final synchronized int A00() {
        return this.A00;
    }

    public final synchronized int A01(ShareType shareType) {
        int i;
        C14360o3.A0B(shareType, 0);
        int i2 = this.A02;
        this.A00 = i2;
        this.A0B.put(String.valueOf(i2), shareType);
        i = this.A02;
        this.A02 = i + 1;
        return i;
    }

    public final synchronized Boolean A02(int i, String str) {
        Boolean bool;
        java.util.Set set;
        C14360o3.A0B(str, 0);
        C9BH c9bh = (C9BH) this.A0A.get(str);
        if (c9bh != null && (set = (java.util.Set) c9bh.A00) != null) {
            bool = Boolean.valueOf(set.contains(Integer.valueOf(i)));
        } else {
            bool = null;
        }
        return bool;
    }

    public final synchronized List A03() {
        C01L A1I;
        A1I = C0eM.A1I();
        A1I.addAll(this.A0D);
        A1I.removeAll(this.A0E);
        A1I.removeAll(this.A0C);
        return C0eM.A1J(A1I);
    }
}
