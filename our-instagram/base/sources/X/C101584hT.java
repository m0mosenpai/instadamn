package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.4hT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101584hT {
    public L4E A01;
    public C47573Kzj A02;
    public C101674hc A03;
    public C38321qM A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public String A09;
    public String A0A;
    public List A0B;
    public java.util.Set A0C = Collections.emptySet();
    public C101594hU A04 = null;
    public int A00 = 0;

    public final boolean A00() {
        Long l = this.A07;
        if (l != null && l.longValue() * 1000 < System.currentTimeMillis()) {
            return true;
        }
        return false;
    }
}
