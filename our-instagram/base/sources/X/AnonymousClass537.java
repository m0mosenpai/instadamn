package X;

import com.google.common.collect.ImmutableMap;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.537, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class AnonymousClass537 {
    public static final List A00 = AbstractC16960so.A1Q(EnumC54222eY.A0I, EnumC54222eY.A0G, EnumC54222eY.A0f, EnumC54222eY.A0T);

    public static final InterfaceC54232eZ A01(Map map) {
        Object obj = null;
        Iterator it = A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Object obj2 = map.get(next);
            if (obj2 == null) {
                obj2 = 0;
            }
            if (((Number) obj2).intValue() > 0) {
                obj = next;
                break;
            }
        }
        return (InterfaceC54232eZ) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A02(android.content.Context r4, X.InterfaceC54232eZ r5, java.util.Map r6, int r7) {
        /*
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            android.content.res.Resources r3 = r4.getResources()
            java.lang.Object r0 = r6.get(r5)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L58
            int r4 = r0.intValue()
        L14:
            if (r5 == 0) goto L5a
            if (r4 <= 0) goto L5a
            X.2eY r0 = X.EnumC54222eY.A0I
            if (r5 != r0) goto L3e
            r1 = 2131820616(0x7f110048, float:1.9273952E38)
        L1f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = r3.getQuantityString(r1, r4, r0)
        L2b:
            int r7 = r7 - r4
            if (r7 <= 0) goto L3d
            r1 = 2131952965(0x7f130545, float:1.9542388E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            java.lang.String r2 = r3.getString(r1, r0)
        L3d:
            return r2
        L3e:
            X.2eY r0 = X.EnumC54222eY.A0G
            if (r5 != r0) goto L46
            r1 = 2131820622(0x7f11004e, float:1.9273964E38)
            goto L1f
        L46:
            X.2eY r0 = X.EnumC54222eY.A0f
            if (r5 != r0) goto L4e
            r1 = 2131820719(0x7f1100af, float:1.927416E38)
            goto L1f
        L4e:
            X.2eY r0 = X.EnumC54222eY.A0T
            if (r5 != r0) goto L56
            r1 = 2131820775(0x7f1100e7, float:1.9274274E38)
            goto L1f
        L56:
            r2 = 0
            goto L2b
        L58:
            r4 = 0
            goto L14
        L5a:
            r1 = 2131820864(0x7f110140, float:1.9274455E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = r3.getQuantityString(r1, r7, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass537.A02(android.content.Context, X.2eZ, java.util.Map, int):java.lang.String");
    }

    public static final C71933Kq A00(User user) {
        Number number;
        int i;
        if (user != null) {
            ImmutableMap copyOf = ImmutableMap.copyOf(user.A05);
            C14360o3.A07(copyOf);
            if (!copyOf.isEmpty() && (number = (Number) copyOf.get(EnumC54222eY.A0I)) != null) {
                int intValue = number.intValue();
                Number number2 = (Number) copyOf.get(EnumC54222eY.A0K);
                Number number3 = (Number) copyOf.get(EnumC54222eY.A0J);
                int i2 = -1;
                if (number2 != null) {
                    i = number2.intValue();
                } else {
                    i = -1;
                }
                if (number3 != null) {
                    i2 = number3.intValue();
                }
                return new C71933Kq(intValue, i, i2);
            }
        }
        return new C71933Kq(0, -1, -1);
    }
}
