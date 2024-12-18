package X;

import com.facebook.common.dextricks.StringTreeSet;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.181, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass181 extends AnonymousClass182 {
    public static final int A04 = (AnonymousClass160.WRITE_NUMBERS_AS_STRINGS.A00 | AnonymousClass160.ESCAPE_NON_ASCII.A00) | AnonymousClass160.STRICT_DUPLICATE_DETECTION.A00;
    public int A00;
    public C44T A01;
    public AnonymousClass184 A02;
    public boolean A03;

    public abstract void A13(String str);

    @Override // X.AnonymousClass182, java.io.Flushable
    public abstract void flush();

    @Override // X.AnonymousClass182
    public AnonymousClass182 A0C(AnonymousClass160 anonymousClass160) {
        this.A00 &= anonymousClass160.A00 ^ (-1);
        return this;
    }

    @Override // X.AnonymousClass182
    public final C44T A0D() {
        return this.A01;
    }

    @Override // X.AnonymousClass182
    public final AnonymousClass184 A0E() {
        return this.A02;
    }

    @Override // X.AnonymousClass182
    public final void A0F(Object obj) {
        AnonymousClass184 anonymousClass184 = this.A02;
        if (anonymousClass184 != null) {
            anonymousClass184.A01 = obj;
        }
    }

    @Override // X.AnonymousClass182
    public final void A0J(Object obj) {
        boolean z;
        long j;
        int i;
        short byteValue;
        if (obj == null) {
            A0b();
            return;
        }
        C44T c44t = this.A01;
        if (c44t != null) {
            c44t.A06(this, obj);
            return;
        }
        if (obj instanceof String) {
            A0u((String) obj);
            return;
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (number instanceof Integer) {
                i = number.intValue();
            } else {
                if (number instanceof Long) {
                    j = number.longValue();
                } else {
                    if (number instanceof Double) {
                        A0f(number.doubleValue());
                        return;
                    }
                    if (number instanceof Float) {
                        A0g(number.floatValue());
                        return;
                    }
                    if (number instanceof Short) {
                        byteValue = number.shortValue();
                    } else if (number instanceof Byte) {
                        byteValue = number.byteValue();
                    } else if (number instanceof BigInteger) {
                        A0w((BigInteger) number);
                        return;
                    } else if (number instanceof BigDecimal) {
                        A0v((BigDecimal) number);
                        return;
                    } else if (number instanceof AtomicInteger) {
                        i = ((AtomicInteger) number).get();
                    } else if (number instanceof AtomicLong) {
                        j = ((AtomicLong) number).get();
                    }
                    A0x(byteValue);
                    return;
                }
                A0i(j);
                return;
            }
            A0h(i);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            A0j(C911944v.A01, bArr, 0, bArr.length);
            return;
        }
        if (obj instanceof Boolean) {
            z = ((Boolean) obj).booleanValue();
        } else if (obj instanceof AtomicBoolean) {
            z = ((AtomicBoolean) obj).get();
        }
        A0y(z);
        return;
        throw new IllegalStateException(AnonymousClass001.A0g("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed ", obj.getClass().getName(), ")"));
    }

    @Override // X.AnonymousClass182
    public final boolean A0X(AnonymousClass160 anonymousClass160) {
        if ((anonymousClass160.A00 & this.A00) == 0) {
            return false;
        }
        return true;
    }

    public final String A11(BigDecimal bigDecimal) {
        if ((this.A00 & AnonymousClass160.WRITE_BIGDECIMAL_AS_PLAIN.A00) != 0) {
            int scale = bigDecimal.scale();
            if (scale >= -9999 && scale <= 9999) {
                return bigDecimal.toPlainString();
            }
            A0L(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(scale), 9999, 9999));
            throw C00O.createAndThrow();
        }
        return bigDecimal.toString();
    }

    public void A12(int i, int i2) {
        C5F1 c5f1;
        if ((A04 & i2) != 0) {
            boolean z = false;
            if ((i & AnonymousClass160.WRITE_NUMBERS_AS_STRINGS.A00) != 0) {
                z = true;
            }
            this.A03 = z;
            int i3 = AnonymousClass160.ESCAPE_NON_ASCII.A00;
            if ((i2 & i3) != 0) {
                int i4 = 0;
                if ((i3 & i) != 0) {
                    i4 = StringTreeSet.MAX_SYMBOL_COUNT;
                }
                A0B(i4);
            }
            int i5 = AnonymousClass160.STRICT_DUPLICATE_DETECTION.A00;
            if ((i2 & i5) != 0) {
                int i6 = i & i5;
                boolean z2 = false;
                if (i6 != 0) {
                    z2 = true;
                }
                AnonymousClass184 anonymousClass184 = this.A02;
                if (z2) {
                    if (anonymousClass184.A00 == null) {
                        c5f1 = new C5F1(this);
                    } else {
                        return;
                    }
                } else {
                    c5f1 = null;
                }
                anonymousClass184.A00 = c5f1;
                this.A02 = anonymousClass184;
            }
        }
    }

    @Override // X.AnonymousClass182
    public final void A0N(String str) {
        A13("write raw value");
        A0t(str);
    }

    @Override // X.AnonymousClass182
    public void A0k(AnonymousClass165 anonymousClass165) {
        A13("write raw value");
        A0m(anonymousClass165);
    }
}
