package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/* renamed from: X.Pte, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58343Pte {
    public static final C58343Pte A00 = new Object();
    public static final Map A02 = AbstractC166987dD.A1G();
    public static final Map A01 = AbstractC166987dD.A1G();

    public static final InterfaceC09670ek A01(final Object obj) {
        InterfaceC09670ek interfaceC09670ek;
        InterfaceC65626Tpm interfaceC65626Tpm;
        InterfaceC09670ek interfaceC09670ek2;
        boolean z = obj instanceof InterfaceC65626Tpm;
        if (obj instanceof InterfaceC09670ek) {
            if (z) {
                interfaceC65626Tpm = (InterfaceC65626Tpm) obj;
                interfaceC09670ek2 = (InterfaceC09670ek) obj;
                interfaceC09670ek = new C58344Ptf(interfaceC65626Tpm, interfaceC09670ek2);
            }
            return (InterfaceC09670ek) obj;
        }
        if (z) {
            interfaceC65626Tpm = (InterfaceC65626Tpm) obj;
            interfaceC09670ek2 = null;
            interfaceC09670ek = new C58344Ptf(interfaceC65626Tpm, interfaceC09670ek2);
        } else {
            Class<?> cls = obj.getClass();
            if (A00.A00(cls) == 2) {
                Object obj2 = A01.get(cls);
                C14360o3.A0A(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    A02(obj, (Constructor) list.get(0));
                    C14360o3.A0B(null, 1);
                    throw C00O.createAndThrow();
                }
                int size = list.size();
                YM3[] ym3Arr = new YM3[size];
                for (int i = 0; i < size; i++) {
                    A02(obj, (Constructor) list.get(i));
                    ym3Arr[i] = null;
                }
                obj = new C63608SqG(ym3Arr);
                return (InterfaceC09670ek) obj;
            }
            interfaceC09670ek = new InterfaceC09670ek(obj) { // from class: X.6ss
                public final C152056sq A00;
                public final Object A01;

                @Override // X.InterfaceC09670ek
                public final void DoQ(C07R c07r, C07X c07x) {
                    C152056sq c152056sq = this.A00;
                    Object obj3 = this.A01;
                    Map map = c152056sq.A00;
                    C152056sq.A00(c07r, c07x, obj3, (List) map.get(c07r));
                    C152056sq.A00(c07r, c07x, obj3, (List) map.get(C07R.ON_ANY));
                }

                {
                    this.A01 = obj;
                    C152046so c152046so = C152046so.A02;
                    Class<?> cls2 = obj.getClass();
                    C152056sq c152056sq = (C152056sq) c152046so.A00.get(cls2);
                    this.A00 = c152056sq == null ? C152046so.A00(c152046so, cls2, null) : c152056sq;
                }
            };
        }
        return interfaceC09670ek;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
    
        if (r0.booleanValue() != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int A00(java.lang.Class r11) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58343Pte.A00(java.lang.Class):int");
    }

    public static final void A02(Object obj, Constructor constructor) {
        try {
            C14360o3.A07(constructor.newInstance(obj));
        } catch (IllegalAccessException e) {
            throw AbstractC58318PtA.A0f(e);
        } catch (InstantiationException e2) {
            throw AbstractC58318PtA.A0f(e2);
        } catch (InvocationTargetException e3) {
            throw AbstractC58318PtA.A0f(e3);
        }
    }
}
