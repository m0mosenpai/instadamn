package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.Sb4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63032Sb4 {
    public final C005001p A00;
    public final C005001p A01;
    public final C005001p A02;

    public final Q9o A03() {
        Q9o q9o = (Q9o) this;
        Parcel parcel = q9o.A05;
        int dataPosition = parcel.dataPosition();
        int i = q9o.A02;
        if (i == q9o.A04) {
            i = q9o.A03;
        }
        return new Q9o(parcel, ((AbstractC63032Sb4) q9o).A01, ((AbstractC63032Sb4) q9o).A02, ((AbstractC63032Sb4) q9o).A00, AnonymousClass001.A0R(q9o.A07, "  "), dataPosition, i);
    }

    public final InterfaceC175987sE A04() {
        String readString = ((Q9o) this).A05.readString();
        if (readString == null) {
            return null;
        }
        Q9o A03 = A03();
        try {
            C005001p c005001p = this.A01;
            Method method = (Method) c005001p.get(readString);
            if (method == null) {
                method = Class.forName(readString, true, AbstractC63032Sb4.class.getClassLoader()).getDeclaredMethod("read", AbstractC63032Sb4.class);
                c005001p.put(readString, method);
            }
            return (InterfaceC175987sE) method.invoke(null, A03);
        } catch (ClassNotFoundException e) {
            throw AbstractC58318PtA.A0f(e);
        } catch (IllegalAccessException e2) {
            throw AbstractC58318PtA.A0f(e2);
        } catch (NoSuchMethodException e3) {
            throw AbstractC58318PtA.A0f(e3);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw AbstractC58318PtA.A0f(e4);
        }
    }

    public final void A05(int i) {
        Q9o q9o = (Q9o) this;
        int i2 = q9o.A00;
        if (i2 >= 0) {
            int i3 = q9o.A06.get(i2);
            Parcel parcel = q9o.A05;
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        q9o.A00 = i;
        SparseIntArray sparseIntArray = q9o.A06;
        Parcel parcel2 = q9o.A05;
        sparseIntArray.put(i, parcel2.dataPosition());
        parcel2.writeInt(0);
        parcel2.writeInt(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A09(int r6) {
        /*
            r5 = this;
            r4 = r5
            X.Q9o r4 = (X.Q9o) r4
        L3:
            int r3 = r4.A02
            int r2 = r4.A03
            r1 = 1
            int r0 = r4.A01
            if (r3 >= r2) goto L31
            if (r0 == r6) goto L35
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = java.lang.String.valueOf(r6)
            int r0 = r1.compareTo(r0)
            if (r0 > 0) goto L34
            android.os.Parcel r0 = r4.A05
            r0.setDataPosition(r3)
            int r1 = r0.readInt()
            int r0 = r0.readInt()
            r4.A01 = r0
            int r0 = r4.A02
            int r0 = r0 + r1
            r4.A02 = r0
            goto L3
        L31:
            if (r0 != r6) goto L34
            return r1
        L34:
            r1 = 0
        L35:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63032Sb4.A09(int):boolean");
    }

    private Class A00(Class cls) {
        C005001p c005001p = this.A00;
        String name = cls.getName();
        Class cls2 = (Class) c005001p.get(name);
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            c005001p.put(name, cls3);
            return cls3;
        }
        return cls2;
    }

    public final void A08(InterfaceC175987sE interfaceC175987sE) {
        if (interfaceC175987sE == null) {
            ((Q9o) this).A05.writeString(null);
            return;
        }
        try {
            Class<?> cls = interfaceC175987sE.getClass();
            ((Q9o) this).A05.writeString(A00(cls).getName());
            Q9o A03 = A03();
            try {
                C005001p c005001p = this.A02;
                String name = cls.getName();
                Method method = (Method) c005001p.get(name);
                if (method == null) {
                    method = A00(cls).getDeclaredMethod("write", cls, AbstractC63032Sb4.class);
                    c005001p.put(name, method);
                }
                method.invoke(null, interfaceC175987sE, A03);
                int i = A03.A00;
                if (i < 0) {
                    return;
                }
                int i2 = A03.A06.get(i);
                Parcel parcel = A03.A05;
                int dataPosition = parcel.dataPosition();
                parcel.setDataPosition(i2);
                parcel.writeInt(dataPosition - i2);
                parcel.setDataPosition(dataPosition);
            } catch (ClassNotFoundException e) {
                throw AbstractC58318PtA.A0f(e);
            } catch (IllegalAccessException e2) {
                throw AbstractC58318PtA.A0f(e2);
            } catch (NoSuchMethodException e3) {
                throw AbstractC58318PtA.A0f(e3);
            } catch (InvocationTargetException e4) {
                Throwable cause = e4.getCause();
                if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                    throw cause;
                }
                throw AbstractC58318PtA.A0f(e4);
            }
        } catch (ClassNotFoundException e5) {
            throw AbstractC58318PtA.A0e(AnonymousClass001.A0R(AbstractC31173DnH.A0q(interfaceC175987sE), " does not have a Parcelizer"), e5);
        }
    }

    public AbstractC63032Sb4(C005001p c005001p, C005001p c005001p2, C005001p c005001p3) {
        this.A01 = c005001p;
        this.A02 = c005001p2;
        this.A00 = c005001p3;
    }

    public final int A01(int i, int i2) {
        if (A09(i2)) {
            return ((Q9o) this).A05.readInt();
        }
        return i;
    }

    public final Parcelable A02(Parcelable parcelable, int i) {
        if (A09(i)) {
            Q9o q9o = (Q9o) this;
            return AbstractC37304Gc5.A04(q9o.A05, q9o.getClass());
        }
        return parcelable;
    }

    public final void A06(int i, int i2) {
        A05(i2);
        ((Q9o) this).A05.writeInt(i);
    }

    public final void A07(Parcelable parcelable, int i) {
        A05(i);
        ((Q9o) this).A05.writeParcelable(parcelable, 0);
    }
}
