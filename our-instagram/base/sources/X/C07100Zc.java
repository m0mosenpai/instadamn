package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0Zc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07100Zc {
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;
    public final Map A08;
    public final Map A09 = Collections.synchronizedMap(new HashMap());

    public C07100Zc(String str, String str2, String str3, List list, List list2, Map map, int i, int i2, long j) {
        this.A01 = i;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = j;
        this.A00 = i2;
        this.A08 = map;
        this.A06 = list;
        this.A07 = list2;
        this.A05 = str3;
    }
}
