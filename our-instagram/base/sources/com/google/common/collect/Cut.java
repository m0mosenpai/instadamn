package com.google.common.collect;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25230BEn;
import X.AbstractC31175DnJ;
import X.AbstractC58318PtA;
import java.io.Serializable;

/* loaded from: classes10.dex */
public abstract class Cut implements Comparable, Serializable {
    public static final long serialVersionUID = 0;
    public final Comparable endpoint;

    /* loaded from: classes10.dex */
    public final class AboveAll extends Cut {
        public static final AboveAll A00 = new AboveAll();
        public static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Cut
        public final int A00(Cut o) {
            return o == this ? 0 : 1;
        }

        public final String toString() {
            return "+∞";
        }

        public AboveAll() {
            super("");
        }

        private Object readResolve() {
            return A00;
        }

        @Override // com.google.common.collect.Cut
        public final int hashCode() {
            return System.identityHashCode(this);
        }
    }

    /* loaded from: classes10.dex */
    public final class AboveValue extends Cut {
        public static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Object that) {
            return super.A00((Cut) that);
        }

        @Override // com.google.common.collect.Cut
        public final int hashCode() {
            return this.endpoint.hashCode() ^ (-1);
        }

        public final String toString() {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("/");
            A1C.append(this.endpoint);
            return AbstractC166997dE.A0x("\\", A1C);
        }
    }

    /* loaded from: classes10.dex */
    public final class BelowAll extends Cut {
        public static final BelowAll A00 = new BelowAll();
        public static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Cut
        public final int A00(Cut o) {
            return o == this ? 0 : -1;
        }

        public final String toString() {
            return "-∞";
        }

        public BelowAll() {
            super("");
        }

        private Object readResolve() {
            return A00;
        }

        @Override // com.google.common.collect.Cut
        public final int hashCode() {
            return System.identityHashCode(this);
        }
    }

    /* loaded from: classes10.dex */
    public final class BelowValue extends Cut {
        public static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Object that) {
            return super.A00((Cut) that);
        }

        @Override // com.google.common.collect.Cut
        public final int hashCode() {
            return this.endpoint.hashCode();
        }

        public final String toString() {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("\\");
            A1C.append(this.endpoint);
            return AbstractC166997dE.A0x("/", A1C);
        }
    }

    public abstract int hashCode();

    public int A00(Cut that) {
        if (that != BelowAll.A00) {
            if (that == AboveAll.A00) {
                return -1;
            }
            Comparable comparable = this.endpoint;
            Comparable comparable2 = that.endpoint;
            Range range = Range.A00;
            int compareTo = comparable.compareTo(comparable2);
            if (compareTo != 0) {
                return compareTo;
            }
            boolean z = this instanceof AboveValue;
            if (z == (that instanceof AboveValue)) {
                return 0;
            }
            if (!z) {
                return -1;
            }
            return 1;
        }
        return 1;
    }

    public final Comparable A01() {
        if (this instanceof BelowAll) {
            throw AbstractC166987dD.A14("range unbounded on this side");
        }
        if (this instanceof AboveAll) {
            throw AbstractC166987dD.A14("range unbounded on this side");
        }
        return this.endpoint;
    }

    public final void A02(StringBuilder sb) {
        char c;
        if (this instanceof BelowValue) {
            c = '[';
        } else if (this instanceof BelowAll) {
            sb.append("(-∞");
            return;
        } else if (this instanceof AboveValue) {
            c = '(';
        } else {
            throw AbstractC58318PtA.A0V();
        }
        sb.append(c);
        sb.append(this.endpoint);
    }

    public final void A03(StringBuilder sb) {
        char c;
        if (this instanceof BelowValue) {
            sb.append(this.endpoint);
            c = ')';
        } else {
            if (this instanceof BelowAll) {
                throw AbstractC58318PtA.A0V();
            }
            if (this instanceof AboveValue) {
                sb.append(this.endpoint);
                c = ']';
            } else {
                sb.append("+∞)");
                return;
            }
        }
        sb.append(c);
    }

    public final boolean A04(Comparable value) {
        if (this instanceof BelowValue) {
            Comparable comparable = this.endpoint;
            Range range = Range.A00;
            return AbstractC31175DnJ.A1S(comparable.compareTo(value));
        }
        if (this instanceof BelowAll) {
            return true;
        }
        if (this instanceof AboveValue) {
            Comparable comparable2 = this.endpoint;
            Range range2 = Range.A00;
            return AbstractC25230BEn.A1P(comparable2.compareTo(value));
        }
        return false;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object that) {
        int i;
        if (this instanceof BelowAll) {
            i = -1;
        } else {
            i = 1;
        }
        if (that == this) {
            return 0;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Cut)) {
            return false;
        }
        try {
            if (A00((Cut) obj) != 0) {
                return false;
            }
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public Cut(Comparable endpoint) {
        this.endpoint = endpoint;
    }
}
