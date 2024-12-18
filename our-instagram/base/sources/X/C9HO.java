package X;

import java.util.List;

/* renamed from: X.9HO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9HO implements C59D {
    public final int A04;
    public final List A05;
    public Float A02 = null;
    public Float A03 = null;
    public C6OK A00 = null;
    public C6OK A01 = null;

    public C9HO(List list, int i) {
        this.A04 = i;
        this.A05 = list;
    }

    @Override // X.C59D
    public final boolean CfU() {
        return this.A05.contains(this);
    }
}
