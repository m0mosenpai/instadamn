package X;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class RO8 extends AbstractC64251T6a {
    public static final Map zzb = AbstractC58318PtA.A14();
    public int zzd = -1;
    public C63372Sid zzc = C63372Sid.A00();

    public static RO8 A01(C63270SgU c63270SgU, RO8 ro8, byte[] bArr) {
        RO8 A02 = A02(c63270SgU, ro8, bArr, bArr.length);
        if (A02.A0R()) {
            return A02;
        }
        C61035Re7 A00 = new C64861TXm().A00();
        A00.A06(A02);
        throw A00;
    }

    public final ROQ A0L() {
        return (ROQ) A0N(5, null, null);
    }

    public final RO8 A0M() {
        return (RO8) A0N(4, null, null);
    }

    public abstract Object A0N(int i, Object obj, Object obj2);

    public final void A0P() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void A0Q() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean A0R() {
        byte byteValue = ((Number) A0N(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean FGl = C63168SeS.A00().A01(getClass()).FGl(this);
        RO8 ro8 = this;
        if (true != FGl) {
            ro8 = null;
        }
        A0N(2, ro8, null);
        return FGl;
    }

    @Override // X.InterfaceC65421Tjs
    public final /* synthetic */ InterfaceC65665Tqv FGJ() {
        return (AbstractC64251T6a) A0N(6, null, null);
    }

    @Override // X.InterfaceC65665Tqv
    public final /* synthetic */ ROQ FGs() {
        return (ROQ) A0N(5, null, null);
    }

    public static RO8 A03(Class cls) {
        Map map = zzb;
        RO8 ro8 = (RO8) map.get(cls);
        if (ro8 == null) {
            try {
                AbstractC58320PtC.A1K(cls);
                ro8 = (RO8) map.get(cls);
                if (ro8 == null) {
                    ro8 = (RO8) ((RO8) C63409Sjj.A05(cls)).A0N(6, null, null);
                    if (ro8 != null) {
                        map.put(cls, ro8);
                    } else {
                        throw AbstractC58318PtA.A0Z();
                    }
                }
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        return ro8;
    }

    public static T6W A07(InterfaceC65665Tqv interfaceC65665Tqv, String str, Object[] objArr) {
        return new T6W(interfaceC65665Tqv, str, objArr);
    }

    public final boolean A0S() {
        return AbstractC167007dF.A1M(this.zzd & Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null || (cls = getClass()) != obj.getClass()) {
            return false;
        }
        return C63168SeS.A00().A01(cls).FGh(this, obj);
    }

    private final int A00() {
        return AbstractC58320PtC.A0c(this).FFX(this);
    }

    public static RO8 A02(C63270SgU c63270SgU, RO8 ro8, byte[] bArr, int i) {
        C61035Re7 e;
        RO8 A0M = ro8.A0M();
        try {
            InterfaceC65591TnW A0c = AbstractC58320PtC.A0c(A0M);
            A0c.FGa(new C62905SWm(c63270SgU), A0M, bArr, 0, i);
            A0c.FGM(A0M);
            return A0M;
        } catch (C61035Re7 e2) {
            e = e2;
            e.A06(A0M);
            throw e;
        } catch (C64861TXm e3) {
            e = e3.A00();
            e.A06(A0M);
            throw e;
        } catch (IOException e4) {
            if (e4.getCause() instanceof C61035Re7) {
                throw e4.getCause();
            }
            e = new C61035Re7(e4);
            e.A06(A0M);
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            e = C61035Re7.A05();
            e.A06(A0M);
            throw e;
        }
    }

    public static RO9 A04() {
        return RO9.A00();
    }

    public static InterfaceC65693TsF A05(InterfaceC65693TsF interfaceC65693TsF) {
        int size = interfaceC65693TsF.size();
        int i = size + size;
        if (size == 0) {
            i = 10;
        }
        return interfaceC65693TsF.FG7(i);
    }

    public static ROB A06() {
        return ROB.A00();
    }

    public static Object A08(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw AbstractC58318PtA.A0e("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (!(cause instanceof Error)) {
                    throw AbstractC58318PtA.A0e("Unexpected exception thrown by generated accessor method.", cause);
                }
                throw cause;
            }
            throw cause;
        }
    }

    public static void A09(RO8 ro8, Class cls) {
        ro8.A0P();
        zzb.put(cls, ro8);
    }

    @Override // X.AbstractC64251T6a
    public final int A0I(InterfaceC65591TnW interfaceC65591TnW) {
        int FFX;
        if (A0S()) {
            FFX = interfaceC65591TnW.FFX(this);
            if (FFX < 0) {
                throw AbstractC31175DnJ.A0U("serialized size must be non-negative, was ", FFX);
            }
        } else {
            int i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                FFX = interfaceC65591TnW.FFX(this);
                if (FFX >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | FFX;
                } else {
                    throw AbstractC31175DnJ.A0U("serialized size must be non-negative, was ", FFX);
                }
            } else {
                return i;
            }
        }
        return FFX;
    }

    public final int A0K() {
        return AbstractC58320PtC.A0c(this).FFn(this);
    }

    public final void A0O() {
        AbstractC58320PtC.A0c(this).FGM(this);
        A0P();
    }

    @Override // X.InterfaceC65665Tqv
    public final int FGP() {
        int i;
        if (A0S()) {
            i = A00();
            if (i < 0) {
                throw AbstractC31175DnJ.A0U("serialized size must be non-negative, was ", i);
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                int A00 = A00();
                if (A00 >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | A00;
                    return A00;
                }
                throw AbstractC31175DnJ.A0U("serialized size must be non-negative, was ", A00);
            }
        }
        return i;
    }

    @Override // X.InterfaceC65665Tqv
    public final void FH0(ROC roc) {
        AbstractC58320PtC.A0c(this).FGe(C64256T6f.A01(roc), this);
    }

    public final int hashCode() {
        if (!A0S()) {
            int i = this.zza;
            if (i == 0) {
                int A0K = A0K();
                this.zza = A0K;
                return A0K;
            }
            return i;
        }
        return A0K();
    }

    public final String toString() {
        return AbstractC63321ShV.A00(this, super.toString());
    }
}
