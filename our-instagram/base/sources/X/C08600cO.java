package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.0cO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08600cO {
    public C03190Dc A01;
    public long A00 = 0;
    public final ArrayList A02 = new ArrayList();
    public final ArrayList A03 = new ArrayList();
    public final Map A04 = new HashMap();

    public final C08610cP A00() {
        if (this.A01 != null && !this.A04.isEmpty()) {
            throw new IllegalArgumentException("TrustedCaller needs to be configured with either a TrustedApp or list of trusted packages");
        }
        Map map = this.A04;
        if (!map.isEmpty()) {
            this.A01 = new C03190Dc(map);
        }
        return new C08610cP(this);
    }

    public final void A01() {
        this.A00 |= 1;
    }

    public final void A02(C0B5 c0b5, String str) {
        java.util.Set set;
        Map map = this.A04;
        if (map.containsKey(c0b5) && (set = (java.util.Set) map.get(c0b5)) != null) {
            set.add(str);
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(str);
        map.put(c0b5, hashSet);
    }

    public final void A03(C0B5 c0b5, java.util.Set set) {
        java.util.Set set2;
        Map map = this.A04;
        if (map.containsKey(c0b5) && (set2 = (java.util.Set) map.get(c0b5)) != null) {
            set2.addAll(set);
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(set);
        map.put(c0b5, hashSet);
    }

    public final void A04(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.A02.add(str);
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void A05(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.A03.add(str);
            return;
        }
        throw new IllegalArgumentException();
    }
}
