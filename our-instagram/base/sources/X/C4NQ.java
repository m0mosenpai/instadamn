package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4NQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4NQ {
    public Long A00;
    public String A01;
    public String A02;
    public List A03;
    public List A04;
    public List A05;
    public List A06;
    public List A07;

    public C4NQ(String str, String str2, long j) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        this.A05 = new ArrayList();
        this.A06 = new ArrayList();
        this.A04 = new ArrayList();
        this.A03 = new ArrayList();
        this.A07 = new ArrayList();
        this.A02 = str;
        this.A01 = str2;
        this.A00 = Long.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C14360o3.A0K(getClass(), obj.getClass())) {
                return false;
            }
            C4NQ c4nq = (C4NQ) obj;
            if (!C14360o3.A0K(this.A02, c4nq.A02) || !C14360o3.A0K(this.A01, c4nq.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i;
        String str = this.A02;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.A01;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public C4NQ() {
        this.A05 = new ArrayList();
        this.A06 = new ArrayList();
        this.A04 = new ArrayList();
        this.A03 = new ArrayList();
        this.A07 = new ArrayList();
    }
}
