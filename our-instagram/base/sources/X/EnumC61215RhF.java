package X;

/* renamed from: X.RhF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC61215RhF {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    public final String A00;

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    EnumC61215RhF(String str) {
        this.A00 = str;
    }
}
