package X;

import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.75o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1575475o {
    public final long A00;
    public final String A01;
    public final java.util.Set A02;
    public final java.util.Set A03 = new HashSet();

    public C1575475o(String str, java.util.Set set, long j) {
        this.A00 = j;
        this.A02 = Collections.unmodifiableSet(set);
        this.A01 = str;
    }
}
