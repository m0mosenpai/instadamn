package X;

import com.google.common.collect.MapMakerInternalMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.18B, reason: invalid class name */
/* loaded from: classes.dex */
public final class C18B {
    public C18M A02;
    public MapMakerInternalMap.Strength A03;
    public MapMakerInternalMap.Strength A04;
    public boolean A05;
    public int A01 = -1;
    public int A00 = -1;

    public final ConcurrentMap A00() {
        MapMakerInternalMap.Strength strength;
        C18H c18h;
        MapMakerInternalMap.Strength strength2;
        MapMakerInternalMap.Strength strength3;
        if (!this.A05) {
            int i = this.A01;
            if (i == -1) {
                i = 16;
            }
            int i2 = this.A00;
            if (i2 == -1) {
                i2 = 4;
            }
            return new ConcurrentHashMap(i, 0.75f, i2);
        }
        MapMakerInternalMap.Strength strength4 = this.A03;
        MapMakerInternalMap.Strength strength5 = MapMakerInternalMap.Strength.A00;
        if ((strength4 == null || strength4 == strength5) && ((strength = this.A04) == null || strength == strength5)) {
            c18h = T8C.A00;
        } else {
            if (strength4 == null || strength4 == strength5) {
                MapMakerInternalMap.Strength strength6 = this.A04;
                if (strength6 == null) {
                    strength6 = strength5;
                }
                if (strength6 == MapMakerInternalMap.Strength.A01) {
                    c18h = C18G.A00;
                }
            }
            MapMakerInternalMap.Strength strength7 = strength4;
            if (strength4 == null) {
                strength7 = strength5;
            }
            MapMakerInternalMap.Strength strength8 = MapMakerInternalMap.Strength.A01;
            if (strength7 == strength8 && ((strength3 = this.A04) == null || strength3 == strength5)) {
                c18h = C146676j4.A00;
            } else if (strength4 != null && strength4 == strength8 && (strength2 = this.A04) != null && strength2 == strength8) {
                c18h = C682935r.A00;
            } else {
                throw new AssertionError();
            }
        }
        return new MapMakerInternalMap(this, c18h);
    }

    public final void A01() {
        A05(MapMakerInternalMap.Strength.A01);
    }

    public final void A02(int concurrencyLevel) {
        int i = this.A00;
        boolean z = true;
        boolean z2 = false;
        if (i == -1) {
            z2 = true;
        }
        C18C.A0D("concurrency level was already set to %s", i, z2);
        if (concurrencyLevel <= 0) {
            z = false;
        }
        C18C.A0E(z);
        this.A00 = concurrencyLevel;
    }

    public final void A03(int initialCapacity) {
        int i = this.A01;
        boolean z = true;
        boolean z2 = false;
        if (i == -1) {
            z2 = true;
        }
        C18C.A0D("initial capacity was already set to %s", i, z2);
        if (initialCapacity < 0) {
            z = false;
        }
        C18C.A0E(z);
        this.A01 = initialCapacity;
    }

    public final void A04(MapMakerInternalMap.Strength strength) {
        MapMakerInternalMap.Strength strength2 = this.A03;
        boolean z = false;
        if (strength2 == null) {
            z = true;
        }
        C18C.A0B(strength2, "Key strength was already set to %s", z);
        strength.getClass();
        this.A03 = strength;
        if (strength != MapMakerInternalMap.Strength.A00) {
            this.A05 = true;
        }
    }

    public final void A05(MapMakerInternalMap.Strength strength) {
        MapMakerInternalMap.Strength strength2 = this.A04;
        boolean z = false;
        if (strength2 == null) {
            z = true;
        }
        C18C.A0B(strength2, "Value strength was already set to %s", z);
        strength.getClass();
        this.A04 = strength;
        if (strength != MapMakerInternalMap.Strength.A00) {
            this.A05 = true;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, X.L0k] */
    public final String toString() {
        JSR A00 = JSS.A00(this);
        int i = this.A01;
        if (i != -1) {
            A00.A02("initialCapacity", i);
        }
        int i2 = this.A00;
        if (i2 != -1) {
            A00.A02("concurrencyLevel", i2);
        }
        MapMakerInternalMap.Strength strength = this.A03;
        if (strength != null) {
            A00.A01(C4B2.A00(strength.toString()), "keyStrength");
        }
        MapMakerInternalMap.Strength strength2 = this.A04;
        if (strength2 != null) {
            A00.A01(C4B2.A00(strength2.toString()), "valueStrength");
        }
        if (this.A02 != null) {
            ?? obj = new Object();
            A00.A00.A00 = obj;
            A00.A00 = obj;
            obj.A01 = "keyEquivalence";
        }
        return A00.toString();
    }
}
