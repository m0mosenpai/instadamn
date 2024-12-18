package X;

import java.util.HashSet;

/* renamed from: X.0xD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19290xD implements C0VN {
    @Override // X.C0VN
    public final boolean AT2(HashSet hashSet, String[] strArr) {
        for (String str : strArr) {
            if (!hashSet.contains(str)) {
                return false;
            }
        }
        return true;
    }
}
