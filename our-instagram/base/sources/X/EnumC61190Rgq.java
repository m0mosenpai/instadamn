package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Rgq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class EnumC61190Rgq {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC61190Rgq[] A01;
    public static final EnumC61190Rgq A02;
    public static final EnumC61190Rgq A03;
    public static final EnumC61190Rgq A04;
    public static final EnumC61190Rgq A05;
    public static final EnumC61190Rgq A06;
    public static final EnumC61190Rgq A07;
    public static final EnumC61190Rgq A08;
    public static final EnumC61190Rgq A09;
    public static final EnumC61190Rgq A0A;
    public static final EnumC61190Rgq A0B;
    public static final EnumC61190Rgq A0C;
    public static final EnumC61190Rgq A0D;

    public static EnumC61190Rgq valueOf(String str) {
        return (EnumC61190Rgq) Enum.valueOf(EnumC61190Rgq.class, str);
    }

    public static EnumC61190Rgq[] values() {
        return (EnumC61190Rgq[]) A01.clone();
    }

    static {
        EnumC61190Rgq enumC61190Rgq = new EnumC61190Rgq() { // from class: X.R6J
        };
        A02 = enumC61190Rgq;
        R6Q r6q = new R6Q();
        A09 = r6q;
        R6R r6r = new R6R();
        A0A = r6r;
        R6T r6t = new R6T();
        A0C = r6t;
        R6N r6n = new R6N();
        A06 = r6n;
        R6S r6s = new R6S();
        A0B = r6s;
        R6O r6o = new R6O();
        A07 = r6o;
        R6P r6p = new R6P();
        A08 = r6p;
        R6U r6u = new R6U();
        A0D = r6u;
        R6M r6m = new R6M();
        A05 = r6m;
        R6L r6l = new R6L();
        A04 = r6l;
        R6K r6k = new R6K();
        A03 = r6k;
        EnumC61190Rgq[] enumC61190RgqArr = {enumC61190Rgq, r6q, r6r, r6t, r6n, r6s, r6o, r6p, r6u, r6m, r6l, r6k};
        A01 = enumC61190RgqArr;
        A00 = AbstractC12190kN.A00(enumC61190RgqArr);
    }

    public final int A00() {
        if (this instanceof R6U) {
            return 7;
        }
        if (this instanceof R6T) {
            return 1;
        }
        if (this instanceof R6S) {
            return 4;
        }
        if (this instanceof R6R) {
            return 2;
        }
        if (this instanceof R6Q) {
            return 0;
        }
        if (this instanceof R6P) {
            return 6;
        }
        if (this instanceof R6O) {
            return 5;
        }
        if (this instanceof R6N) {
            return 3;
        }
        if (this instanceof R6M) {
            return 11;
        }
        if (this instanceof R6L) {
            return 10;
        }
        if (this instanceof R6K) {
            return 9;
        }
        return 8;
    }

    public EnumC61190Rgq(String str, int i) {
    }
}
