package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: X.PuE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58374PuE extends AbstractC58375PuF {
    public static Map defaultInstanceMap = AbstractC58318PtA.A14();
    public C58373PuD unknownFields = C58373PuD.A05;
    public int memoizedSerializedSize = -1;

    public abstract Object A03(Integer num, Object obj, Object obj2);

    public static final boolean A02(AbstractC58374PuE abstractC58374PuE) {
        byte byteValue = ((Number) abstractC58374PuE.A03(C05F.A00, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean CWb = C58378PuI.A02.A00(abstractC58374PuE.getClass()).CWb(abstractC58374PuE);
        Integer num = C05F.A01;
        Object obj = null;
        if (CWb) {
            obj = abstractC58374PuE;
        }
        abstractC58374PuE.A03(num, obj, null);
        return CWb;
    }

    @Override // X.InterfaceC65300ThY
    public final /* bridge */ /* synthetic */ AbstractC58374PuE AwG() {
        return (AbstractC58374PuE) A03(C05F.A0j, null, null);
    }

    @Override // X.InterfaceC65625Tpl
    public final int BtU() {
        int i = this.memoizedSerializedSize;
        if (i == -1) {
            int BtW = C58378PuI.A02.A00(getClass()).BtW(this);
            this.memoizedSerializedSize = BtW;
            return BtW;
        }
        return i;
    }

    @Override // X.InterfaceC65625Tpl
    public final void FEn(Q7P q7p) {
        InterfaceC65588TnS A00 = C58378PuI.A02.A00(getClass());
        C63603SqB c63603SqB = q7p.A00;
        if (c63603SqB == null) {
            c63603SqB = new C63603SqB(q7p);
        }
        A00.FEq(c63603SqB, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!A03(C05F.A0j, null, null).getClass().isInstance(obj)) {
            return false;
        }
        return C58378PuI.A02.A00(getClass()).AT0(this, obj);
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i == 0) {
            int CME = C58378PuI.A02.A00(getClass()).CME(this);
            this.memoizedHashCode = CME;
            return CME;
        }
        return i;
    }

    public static Object A01(Object obj, Method method, Object... objArr) {
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

    public final String toString() {
        StringBuilder A0u = AbstractC58323PtF.A0u(super.toString());
        SQS.A00(this, A0u, 0);
        return A0u.toString();
    }
}
