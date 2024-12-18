package X;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.4Uy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C96404Uy {

    @Deprecated
    public static final C96404Uy A0R;
    public static final C96404Uy A0S;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final ImmutableMap A0G;
    public final ImmutableSet A0H;
    public final List A0I;
    public final List A0J;
    public final List A0K;
    public final List A0L;
    public final List A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;

    public C96404Uy(HashMap hashMap, HashSet hashSet, List list, List list2, List list3, List list4, List list5) {
        this.A06 = Integer.MAX_VALUE;
        this.A05 = Integer.MAX_VALUE;
        this.A04 = Integer.MAX_VALUE;
        this.A03 = Integer.MAX_VALUE;
        this.A0A = 0;
        this.A09 = 0;
        this.A08 = 0;
        this.A07 = 0;
        this.A0F = Integer.MAX_VALUE;
        this.A0E = Integer.MAX_VALUE;
        this.A0Q = true;
        this.A0M = list5;
        this.A0D = 0;
        this.A0L = list4;
        this.A0I = list;
        this.A0B = 0;
        this.A02 = Integer.MAX_VALUE;
        this.A01 = Integer.MAX_VALUE;
        this.A0J = list2;
        this.A0K = list3;
        this.A0C = 0;
        this.A00 = 0;
        this.A0P = false;
        this.A0O = false;
        this.A0N = false;
        this.A0G = ImmutableMap.copyOf((Map) hashMap);
        this.A0H = ImmutableSet.A03(hashSet);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C96404Uy c96404Uy = (C96404Uy) obj;
            if (this.A06 != c96404Uy.A06 || this.A05 != c96404Uy.A05 || this.A04 != c96404Uy.A04 || this.A03 != c96404Uy.A03 || this.A0A != c96404Uy.A0A || this.A09 != c96404Uy.A09 || this.A08 != c96404Uy.A08 || this.A07 != c96404Uy.A07 || this.A0Q != c96404Uy.A0Q || this.A0F != c96404Uy.A0F || this.A0E != c96404Uy.A0E || !this.A0M.equals(c96404Uy.A0M) || this.A0D != c96404Uy.A0D || !this.A0L.equals(c96404Uy.A0L) || !this.A0I.equals(c96404Uy.A0I) || this.A0B != c96404Uy.A0B || this.A02 != c96404Uy.A02 || this.A01 != c96404Uy.A01 || !this.A0J.equals(c96404Uy.A0J) || !this.A0K.equals(c96404Uy.A0K) || this.A0C != c96404Uy.A0C || this.A00 != c96404Uy.A00 || this.A0P != c96404Uy.A0P || this.A0O != c96404Uy.A0O || this.A0N != c96404Uy.A0N || !this.A0G.equals(c96404Uy.A0G) || !this.A0H.equals(c96404Uy.A0H)) {
                return false;
            }
        }
        return true;
    }

    static {
        C16930sl c16930sl = C16930sl.A00;
        C96404Uy c96404Uy = new C96404Uy(new HashMap(), new HashSet(), c16930sl, c16930sl, c16930sl, c16930sl, c16930sl);
        A0S = c96404Uy;
        A0R = c96404Uy;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((this.A06 + 31) * 31) + this.A05) * 31) + this.A04) * 31) + this.A03) * 31) + this.A0A) * 31) + this.A09) * 31) + this.A08) * 31) + this.A07) * 31) + (this.A0Q ? 1 : 0)) * 31) + this.A0F) * 31) + this.A0E) * 31) + this.A0M.hashCode()) * 31) + this.A0D) * 31) + this.A0L.hashCode()) * 31) + this.A0I.hashCode()) * 31) + this.A0B) * 31) + this.A02) * 31) + this.A01) * 31) + this.A0J.hashCode()) * 31) + this.A0K.hashCode()) * 31) + this.A0C) * 31) + this.A00) * 31) + (this.A0P ? 1 : 0)) * 31) + (this.A0O ? 1 : 0)) * 31) + (this.A0N ? 1 : 0)) * 31) + this.A0G.hashCode()) * 31) + this.A0H.hashCode();
    }

    public C96404Uy(C4V0 c4v0) {
        this.A06 = c4v0.A06;
        this.A05 = c4v0.A05;
        this.A04 = c4v0.A04;
        this.A03 = c4v0.A03;
        this.A0A = c4v0.A0A;
        this.A09 = c4v0.A09;
        this.A08 = c4v0.A08;
        this.A07 = c4v0.A07;
        this.A0F = c4v0.A0F;
        this.A0E = c4v0.A0E;
        this.A0Q = c4v0.A0Q;
        this.A0M = c4v0.A0M;
        this.A0D = c4v0.A0D;
        this.A0L = c4v0.A0L;
        this.A0I = c4v0.A0I;
        this.A0B = c4v0.A0B;
        this.A02 = c4v0.A02;
        this.A01 = c4v0.A01;
        this.A0J = c4v0.A0J;
        this.A0K = c4v0.A0K;
        this.A0C = c4v0.A0C;
        this.A00 = c4v0.A00;
        this.A0P = c4v0.A0P;
        this.A0O = c4v0.A0O;
        this.A0N = c4v0.A0N;
        this.A0G = ImmutableMap.copyOf((Map) c4v0.A0G);
        this.A0H = ImmutableSet.A03(c4v0.A0H);
    }
}
