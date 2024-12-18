package X;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.LinkedListMultimap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.49c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC917849c implements C46g {
    public transient Collection A00;
    public transient Map A01;
    public transient java.util.Set A02;

    public Collection A04() {
        if (this instanceof LinkedListMultimap) {
            return new TZM((LinkedListMultimap) this);
        }
        return new ImmutableMultimap.EntryCollection((ImmutableMultimap) this);
    }

    public Iterator A05() {
        if (this instanceof LinkedListMultimap) {
            throw new AssertionError("should never be called");
        }
        return new RSU((ImmutableMultimap) this);
    }

    public Map A06() {
        if (this instanceof LinkedListMultimap) {
            return new RRx(this);
        }
        throw new AssertionError("should never be called");
    }

    public java.util.Set A07() {
        if (this instanceof LinkedListMultimap) {
            return new RSE((LinkedListMultimap) this);
        }
        throw new AssertionError("unreachable");
    }

    @Override // X.C46g
    public final Map ACe() {
        if (this instanceof ImmutableMultimap) {
            return ((ImmutableMultimap) this).A01;
        }
        Map map = this.A01;
        if (map != null) {
            return map;
        }
        Map A06 = A06();
        this.A01 = A06;
        return A06;
    }

    @Override // X.C46g
    public Collection ASw() {
        Collection collection = this.A00;
        if (collection == null) {
            Collection A04 = A04();
            this.A00 = A04;
            return A04;
        }
        return collection;
    }

    @Override // X.C46g
    public boolean E6z(Object key, Object value) {
        if (this instanceof LinkedListMultimap) {
            LinkedListMultimap.A00(null, (LinkedListMultimap) this, key, value);
            return true;
        }
        if (this instanceof ImmutableMultimap) {
            throw new UnsupportedOperationException();
        }
        return AXV(key).add(value);
    }

    @Override // X.C46g
    public final boolean E74(C46g multimap) {
        if (this instanceof ImmutableMultimap) {
            throw new UnsupportedOperationException();
        }
        boolean z = false;
        for (Map.Entry entry : multimap.ASw()) {
            z |= E6z(entry.getKey(), entry.getValue());
        }
        return z;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof C46g) {
            return ACe().equals(((C46g) object).ACe());
        }
        return false;
    }

    @Override // X.C46g
    public final boolean isEmpty() {
        if (this instanceof LinkedListMultimap) {
            if (((LinkedListMultimap) this).A02 != null) {
                return false;
            }
        } else if (size() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.C46g
    public final java.util.Set keySet() {
        if (this instanceof ImmutableMultimap) {
            return ((ImmutableMultimap) this).A01.keySet();
        }
        java.util.Set set = this.A02;
        if (set != null) {
            return set;
        }
        java.util.Set A07 = A07();
        this.A02 = A07;
        return A07;
    }

    @Override // X.C46g
    public final boolean remove(Object key, Object value) {
        if (this instanceof ImmutableMultimap) {
            throw new UnsupportedOperationException();
        }
        Collection collection = (Collection) ACe().get(key);
        if (collection != null && collection.remove(value)) {
            return true;
        }
        return false;
    }

    @Override // X.C46g
    public final boolean AJj(Object key, Object value) {
        Collection collection = (Collection) ACe().get(key);
        if (collection != null && collection.contains(value)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ACe().hashCode();
    }

    public final String toString() {
        return ACe().toString();
    }
}
