package X;

import java.util.NoSuchElementException;

/* renamed from: X.2mK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58612mK extends AbstractC16880sg {
    public int A00;
    public boolean A01;
    public final int A02;
    public final int A03;

    @Override // X.AbstractC16880sg
    public final int A00() {
        int i = this.A00;
        if (i == this.A02) {
            if (this.A01) {
                this.A01 = false;
                return i;
            }
            throw new NoSuchElementException();
        }
        this.A00 = this.A03 + i;
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A01;
    }

    public C58612mK(int i, int i2, int i3) {
        this.A03 = i3;
        this.A02 = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.A01 = z;
        this.A00 = z ? i : i2;
    }
}
