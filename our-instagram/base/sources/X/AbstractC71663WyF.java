package X;

import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.WyF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC71663WyF implements Map.Entry {
    public int A00 = -1;
    public int A01;
    public int A02;
    public final /* synthetic */ C71665WyH A03;

    public AbstractC71663WyF(C71665WyH c71665WyH) {
        this.A03 = c71665WyH;
        this.A01 = c71665WyH.A00;
        this.A02 = c71665WyH.A04(-1);
    }

    private void A00() {
        if (this.A00 >= 0) {
        } else {
            throw new IllegalStateException("Iterator not pointing to any element.");
        }
    }

    public final void A01() {
        int i = this.A01;
        C71665WyH c71665WyH = this.A03;
        if (i == c71665WyH.A00) {
            int i2 = this.A02;
            if (i2 >= 0) {
                this.A00 = i2;
                this.A02 = c71665WyH.A04(i2);
                return;
            }
            throw new NoSuchElementException();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object key2 = getKey();
        if (key == null) {
            if (key2 != null) {
                return false;
            }
        } else if (!key.equals(key2)) {
            return false;
        }
        Object value = entry.getValue();
        Object value2 = getValue();
        if (value == null) {
            if (value2 != null) {
                return false;
            }
        } else if (!value.equals(value2)) {
            return false;
        }
        return true;
    }

    public final boolean hasNext() {
        return MSY.A1R(this.A02);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        A00();
        return this.A03.A05(this.A00);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        A00();
        return this.A03.A06(this.A00);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        int i = 0;
        int A0M = AbstractC167017dG.A0M(key);
        if (value != null) {
            i = value.hashCode();
        }
        return A0M ^ i;
    }

    public final void remove() {
        A00();
        int i = this.A01;
        C71665WyH c71665WyH = this.A03;
        if (i == c71665WyH.A00) {
            this.A01 = i + 1;
            c71665WyH.remove(c71665WyH.A05(this.A00));
            Object[] objArr = c71665WyH.A03;
            int i2 = this.A00;
            if (objArr[i2 << 1] != null) {
                this.A02 = i2;
            }
            this.A00 = -1;
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        A00();
        int i = (this.A00 << 1) + 1;
        Object[] objArr = this.A03.A03;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }
}
