package X;

import java.util.HashSet;

/* renamed from: X.5F1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5F1 {
    public String A00;
    public String A01;
    public HashSet A02;
    public final Object A03;

    public final boolean A00(String str) {
        String str2 = this.A00;
        if (str2 == null) {
            this.A00 = str;
            return false;
        }
        if (!str.equals(str2)) {
            String str3 = this.A01;
            if (str3 == null) {
                this.A01 = str;
                return false;
            }
            if (!str.equals(str3)) {
                if (this.A02 == null) {
                    HashSet hashSet = new HashSet(16);
                    this.A02 = hashSet;
                    hashSet.add(this.A00);
                    this.A02.add(this.A01);
                }
                return !this.A02.add(str);
            }
        }
        return true;
    }

    public C5F1(Object obj) {
        this.A03 = obj;
    }
}
