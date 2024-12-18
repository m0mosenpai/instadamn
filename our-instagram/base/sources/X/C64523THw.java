package X;

import java.io.Serializable;
import java.util.Collections;

/* renamed from: X.THw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64523THw implements Serializable {
    public final java.util.Set A00;
    public final java.util.Set A01;

    public final boolean A00(Object obj) {
        java.util.Set set = this.A01;
        if ((set == null || set.contains(obj)) && !this.A00.contains(obj)) {
            return false;
        }
        return true;
    }

    public C64523THw(java.util.Set set, java.util.Set set2) {
        this.A00 = set == null ? Collections.emptySet() : set;
        this.A01 = set2;
    }
}
