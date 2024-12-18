package X;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.06g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C016306g {
    public C06X A00;
    public final ArrayList A01 = new ArrayList();
    public final HashMap A02 = new HashMap();
    public final HashMap A03 = new HashMap();

    public final Fragment A00(String str) {
        C016206f c016206f = (C016206f) this.A02.get(str);
        if (c016206f != null) {
            return c016206f.A02;
        }
        return null;
    }

    public final Fragment A01(String str) {
        Fragment findFragmentByWho;
        for (C016206f c016206f : this.A02.values()) {
            if (c016206f != null && (findFragmentByWho = c016206f.A02.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList A02() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.A02.values()) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final ArrayList A03() {
        Fragment fragment;
        ArrayList arrayList = new ArrayList();
        for (C016206f c016206f : this.A02.values()) {
            if (c016206f != null) {
                fragment = c016206f.A02;
            } else {
                fragment = null;
            }
            arrayList.add(fragment);
        }
        return arrayList;
    }

    public final List A04() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.A01;
        if (arrayList2.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (arrayList2) {
            arrayList = new ArrayList(arrayList2);
        }
        return arrayList;
    }

    public final void A05(Fragment fragment) {
        ArrayList arrayList = this.A01;
        if (!arrayList.contains(fragment)) {
            synchronized (arrayList) {
                arrayList.add(fragment);
            }
            fragment.mAdded = true;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment already added: ");
            sb.append(fragment);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final void A06(C016206f c016206f) {
        Fragment fragment = c016206f.A02;
        String str = fragment.mWho;
        HashMap hashMap = this.A02;
        if (hashMap.get(str) == null) {
            hashMap.put(fragment.mWho, c016206f);
            if (fragment.mRetainInstanceChangedWhileDetached) {
                boolean z = fragment.mRetainInstance;
                C06X c06x = this.A00;
                if (z) {
                    if (!c06x.A01) {
                        HashMap hashMap2 = c06x.A03;
                        if (!hashMap2.containsKey(fragment.mWho)) {
                            hashMap2.put(fragment.mWho, fragment);
                        }
                    }
                    AbstractC10360h2.A0H(2);
                } else {
                    c06x.A01(fragment);
                }
                fragment.mRetainInstanceChangedWhileDetached = false;
            }
            AbstractC10360h2.A0H(2);
        }
    }

    public final void A07(C016206f c016206f) {
        Fragment fragment = c016206f.A02;
        if (fragment.mRetainInstance) {
            this.A00.A01(fragment);
        }
        HashMap hashMap = this.A02;
        if (hashMap.get(fragment.mWho) == c016206f && hashMap.put(fragment.mWho, null) != null) {
            AbstractC10360h2.A0H(2);
        }
    }
}
