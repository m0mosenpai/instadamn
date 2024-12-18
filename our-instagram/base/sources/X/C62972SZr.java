package X;

import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;

/* renamed from: X.SZr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62972SZr {
    public static final C62972SZr A08;
    public final RqL A00;

    @Deprecated
    public final C58778Q8n A01;
    public final SN6 A02;
    public final SO1 A03;

    @Deprecated
    public final SO1 A04;
    public final SNA A05;
    public final Y1V A06;
    public final String A07;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.Q8n] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.SN6] */
    static {
        ImmutableList.of();
        ImmutableList.of();
        A08 = new C62972SZr(new Object(), new Object(), null, SNA.A00, Y1V.A0W, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62972SZr)) {
            return false;
        }
        C62972SZr c62972SZr = (C62972SZr) obj;
        return Util.A0F(this.A07, c62972SZr.A07) && this.A00.equals(c62972SZr.A00) && Util.A0F(this.A03, c62972SZr.A03) && Util.A0F(this.A02, c62972SZr.A02) && Util.A0F(this.A06, c62972SZr.A06) && Util.A0F(this.A05, c62972SZr.A05);
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A06, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A02, (AbstractC166987dD.A0J(this.A07) + AbstractC25235BEs.A06(this.A03)) * 31)));
    }

    public C62972SZr(C58778Q8n c58778Q8n, SN6 sn6, SO1 so1, SNA sna, Y1V y1v, String str) {
        this.A07 = str;
        this.A03 = so1;
        this.A04 = so1;
        this.A02 = sn6;
        this.A06 = y1v;
        this.A00 = c58778Q8n;
        this.A01 = c58778Q8n;
        this.A05 = sna;
    }
}
