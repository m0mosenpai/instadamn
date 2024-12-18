package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7if, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C170267if implements Iterator {
    public int A00;
    public int A01;
    public final List A02;
    public final boolean A03;

    @Override // java.util.Iterator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final synchronized C124005jE next() {
        C124005jE c124005jE;
        if (hasNext()) {
            c124005jE = (C124005jE) this.A02.get(this.A00);
            boolean z = this.A03;
            int i = this.A00;
            int i2 = i + 1;
            if (z) {
                i2 = i - 1;
            }
            this.A00 = i2;
            this.A01--;
        } else {
            c124005jE = null;
        }
        return c124005jE;
    }

    @Override // java.util.Iterator
    public final void remove() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (this.A01 > 0 && (i = this.A00) >= 0) {
            List list = this.A02;
            if (i < list.size()) {
                C124005jE c124005jE = (C124005jE) list.get(this.A00);
                if (c124005jE.A02().EGw() && !c124005jE.A09()) {
                    return true;
                }
                boolean z = this.A03;
                int i2 = this.A00;
                int i3 = i2 + 1;
                if (z) {
                    i3 = i2 - 1;
                }
                this.A00 = i3;
            } else {
                return false;
            }
        }
        return false;
    }

    public C170267if(List list, int i, int i2, boolean z) {
        this.A02 = new ArrayList(list);
        this.A00 = z ? i - 1 : i + 1;
        this.A01 = i2;
        this.A03 = z;
    }
}
