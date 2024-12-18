package X;

/* renamed from: X.5W0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5W0 {
    public static final /* synthetic */ C5W0 A00 = new Object();

    public static final C5W2 A00(final long j) {
        C5W2 c5w2;
        if (j != 16) {
            c5w2 = new C5W2(j) { // from class: X.5WU
                public final long A00;

                @Override // X.C5W2
                public final C6L5 AiZ() {
                    return null;
                }

                public final boolean equals(Object obj) {
                    if (this != obj) {
                        if (obj instanceof C5WU) {
                            long j2 = this.A00;
                            long j3 = ((C5WU) obj).A00;
                            long j4 = C1132359l.A01;
                            if (j2 == j3) {
                            }
                        }
                        return false;
                    }
                    return true;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ColorStyle(value=");
                    sb.append((Object) C1132359l.A06(this.A00));
                    sb.append(')');
                    return sb.toString();
                }

                @Override // X.C5W2
                public final float AbP() {
                    return C1132359l.A00(this.A00);
                }

                @Override // X.C5W2
                public final long ApK() {
                    return this.A00;
                }

                public final int hashCode() {
                    long j2 = this.A00;
                    long j3 = C1132359l.A01;
                    return (int) (j2 ^ (j2 >>> 32));
                }

                {
                    this.A00 = j;
                    if (j != 16) {
                    } else {
                        throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
                    }
                }
            };
        } else {
            c5w2 = C5W1.A00;
        }
        return c5w2;
    }

    public final C5W2 A01(C6L5 c6l5, float f) {
        C5W2 c5ww;
        if (c6l5 == null) {
            c5ww = C5W1.A00;
        } else {
            if (c6l5 instanceof C6L4) {
                long j = ((C6L4) c6l5).A00;
                if (!Float.isNaN(f) && f < 1.0f) {
                    j = C5AC.A02(AbstractC1132459m.A0K[(int) (j & 63)], C1132359l.A03(j), C1132359l.A02(j), C1132359l.A01(j), C1132359l.A00(j) * f);
                }
                return A00(j);
            }
            if (c6l5 instanceof C62Y) {
                c5ww = new C5WW((C62Y) c6l5, f);
            } else {
                throw new RuntimeException();
            }
        }
        return c5ww;
    }
}
