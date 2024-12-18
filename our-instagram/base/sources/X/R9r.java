package X;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;

@JacksonStdImpl
/* loaded from: classes10.dex */
public final class R9r extends AbstractC63035SbA implements Serializable {
    public AbstractC910944l A00;
    public AbstractC910944l A01;
    public RBH A02;
    public RBH A03;
    public RBH A04;
    public RBH A05;
    public RBH A06;
    public RBH A07;
    public RBH A08;
    public RBH A09;
    public RBH A0A;
    public RBH A0B;
    public RBH A0C;
    public RBV[] A0D;
    public RBV[] A0E;
    public RBV[] A0F;
    public final Class A0G;
    public final String A0H;

    public static Object A00(AnonymousClass469 anonymousClass469, R9r r9r, RBH rbh, Object obj, RBV[] rbvArr) {
        if (rbh != null) {
            try {
                if (rbvArr == null) {
                    return rbh.A0K(obj);
                }
                int length = rbvArr.length;
                Object[] objArr = new Object[length];
                for (int i = 0; i < length; i++) {
                    RBV rbv = rbvArr[i];
                    if (rbv == null) {
                        objArr[i] = obj;
                    } else {
                        anonymousClass469.A0g(rbv.A0B());
                        throw C00O.createAndThrow();
                    }
                }
                if (rbh instanceof RBK) {
                    return ((RBK) rbh).A01.invoke(null, objArr);
                }
                return ((RBG) rbh).A00.newInstance(objArr);
            } catch (Throwable th) {
                throw r9r.A0P(anonymousClass469, th);
            }
        }
        throw AbstractC31175DnJ.A0V("No delegate constructor for ", r9r.A0H);
    }

    @Override // X.AbstractC63035SbA
    public final Object A04(AnonymousClass469 anonymousClass469) {
        RBH rbh = this.A03;
        if (rbh == null) {
            super.A04(anonymousClass469);
            throw C00O.createAndThrow();
        }
        try {
            return rbh.A0J();
        } catch (Exception e) {
            anonymousClass469.A0f(this.A0G, A0P(anonymousClass469, e));
            throw C00O.createAndThrow();
        }
    }

    @Override // X.AbstractC63035SbA
    public final Object A05(AnonymousClass469 anonymousClass469, double d) {
        RBH rbh;
        RBH rbh2 = this.A08;
        if (rbh2 != null) {
            try {
                return rbh2.A0K(Double.valueOf(d));
            } catch (Throwable th) {
                th = th;
                rbh = this.A08;
            }
        } else if (this.A05 != null) {
            try {
                return this.A05.A0K(BigDecimal.valueOf(d));
            } catch (Throwable th2) {
                th = th2;
                rbh = this.A05;
            }
        } else {
            super.A05(anonymousClass469, d);
            throw C00O.createAndThrow();
        }
        A01(anonymousClass469, this, rbh, th);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC63035SbA
    public final Object A06(AnonymousClass469 anonymousClass469, int i) {
        RBH rbh;
        RBH rbh2 = this.A09;
        if (rbh2 != null) {
            try {
                return rbh2.A0K(Integer.valueOf(i));
            } catch (Throwable th) {
                th = th;
                rbh = this.A09;
            }
        } else {
            RBH rbh3 = this.A0A;
            if (rbh3 != null) {
                try {
                    return rbh3.A0K(AbstractC31171DnF.A0V(i));
                } catch (Throwable th2) {
                    th = th2;
                    rbh = this.A0A;
                }
            } else if (this.A06 != null) {
                try {
                    return this.A06.A0K(BigInteger.valueOf(i));
                } catch (Throwable th3) {
                    th = th3;
                    rbh = this.A06;
                }
            } else {
                super.A06(anonymousClass469, i);
                throw C00O.createAndThrow();
            }
        }
        A01(anonymousClass469, this, rbh, th);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC63035SbA
    public final Object A07(AnonymousClass469 anonymousClass469, long j) {
        RBH rbh;
        RBH rbh2 = this.A0A;
        if (rbh2 != null) {
            try {
                return rbh2.A0K(Long.valueOf(j));
            } catch (Throwable th) {
                th = th;
                rbh = this.A0A;
            }
        } else if (this.A06 != null) {
            try {
                return this.A06.A0K(BigInteger.valueOf(j));
            } catch (Throwable th2) {
                th = th2;
                rbh = this.A06;
            }
        } else {
            super.A07(anonymousClass469, j);
            throw C00O.createAndThrow();
        }
        A01(anonymousClass469, this, rbh, th);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC63035SbA
    public final Object A0A(AnonymousClass469 anonymousClass469, String str) {
        RBH rbh = this.A0B;
        if (rbh != null) {
            try {
                return rbh.A0K(str);
            } catch (Throwable th) {
                A01(anonymousClass469, this, this.A0B, th);
                throw C00O.createAndThrow();
            }
        }
        super.A0A(anonymousClass469, str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC63035SbA
    public final Object A0B(AnonymousClass469 anonymousClass469, BigDecimal bigDecimal) {
        RBH rbh;
        Double valueOf;
        RBH rbh2 = this.A05;
        if (rbh2 != null) {
            try {
                return rbh2.A0K(bigDecimal);
            } catch (Throwable th) {
                th = th;
                rbh = this.A05;
            }
        } else {
            if (this.A08 != null) {
                double doubleValue = bigDecimal.doubleValue();
                if (Double.isInfinite(doubleValue)) {
                    valueOf = null;
                } else {
                    valueOf = Double.valueOf(doubleValue);
                }
                if (valueOf != null) {
                    try {
                        return this.A08.A0K(valueOf);
                    } catch (Throwable th2) {
                        th = th2;
                        rbh = this.A08;
                    }
                }
            }
            super.A0B(anonymousClass469, bigDecimal);
            throw C00O.createAndThrow();
        }
        A01(anonymousClass469, this, rbh, th);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC63035SbA
    public final Object A0C(AnonymousClass469 anonymousClass469, BigInteger bigInteger) {
        RBH rbh = this.A06;
        if (rbh != null) {
            try {
                return rbh.A0K(bigInteger);
            } catch (Throwable th) {
                A01(anonymousClass469, this, this.A06, th);
                throw C00O.createAndThrow();
            }
        }
        super.A0C(anonymousClass469, bigInteger);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC63035SbA
    public final Object A0D(AnonymousClass469 anonymousClass469, boolean z) {
        RBH rbh = this.A07;
        if (rbh == null) {
            super.A0D(anonymousClass469, z);
            throw C00O.createAndThrow();
        }
        try {
            return rbh.A0K(Boolean.valueOf(z));
        } catch (Throwable th) {
            A01(anonymousClass469, this, this.A07, th);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.AbstractC63035SbA
    public final Object A0E(AnonymousClass469 anonymousClass469, Object[] objArr) {
        RBH rbh = this.A0C;
        if (rbh == null) {
            super.A0E(anonymousClass469, objArr);
            throw C00O.createAndThrow();
        }
        try {
            if (rbh instanceof RBK) {
                return ((RBK) rbh).A01.invoke(null, objArr);
            }
            return ((RBG) rbh).A00.newInstance(objArr);
        } catch (Exception e) {
            anonymousClass469.A0f(this.A0G, A0P(anonymousClass469, e));
            throw C00O.createAndThrow();
        }
    }

    public final C102314j6 A0P(AnonymousClass469 anonymousClass469, Throwable th) {
        Throwable cause;
        if (((th instanceof ExceptionInInitializerError) || (th instanceof InvocationTargetException)) && (cause = th.getCause()) != null) {
            th = cause;
        }
        if (th instanceof C102314j6) {
            return (C102314j6) th;
        }
        return anonymousClass469.A0K(this.A0G, th);
    }

    public R9r(AbstractC910944l abstractC910944l) {
        String obj;
        Class<Object> cls;
        if (abstractC910944l == null) {
            obj = "UNKNOWN TYPE";
        } else {
            obj = abstractC910944l.toString();
        }
        this.A0H = obj;
        if (abstractC910944l == null) {
            cls = Object.class;
        } else {
            cls = abstractC910944l.A00;
        }
        this.A0G = cls;
    }

    public static void A01(AnonymousClass469 anonymousClass469, R9r r9r, RBL rbl, Throwable th) {
        anonymousClass469.A0f(rbl.A09(), r9r.A0P(anonymousClass469, th));
        throw C00O.createAndThrow();
    }
}
