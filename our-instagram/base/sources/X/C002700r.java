package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.00r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C002700r implements Iterator, Map.Entry {
    public int A00;
    public int A01 = -1;
    public boolean A02;
    public final /* synthetic */ C20030yX A03;

    public C002700r(C20030yX c20030yX) {
        this.A03 = c20030yX;
        this.A00 = c20030yX.size() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.A02) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            C20030yX c20030yX = this.A03;
            if (!C14360o3.A0K(key, c20030yX.A05(this.A01)) || !C14360o3.A0K(entry.getValue(), c20030yX.A06(this.A01))) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.A02) {
            return this.A03.A05(this.A01);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.A02) {
            return this.A03.A06(this.A01);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A01 >= this.A00) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        if (this.A02) {
            C20030yX c20030yX = this.A03;
            Object A05 = c20030yX.A05(this.A01);
            Object A06 = c20030yX.A06(this.A01);
            int i = 0;
            if (A05 == null) {
                hashCode = 0;
            } else {
                hashCode = A05.hashCode();
            }
            if (A06 != null) {
                i = A06.hashCode();
            }
            return hashCode ^ i;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.A02) {
            this.A03.A04(this.A01);
            this.A01--;
            this.A00--;
            this.A02 = false;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.A02) {
            return this.A03.A07(this.A01, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
        sb.append(getValue());
        return sb.toString();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            this.A01++;
            this.A02 = true;
            return this;
        }
        throw new NoSuchElementException();
    }
}
