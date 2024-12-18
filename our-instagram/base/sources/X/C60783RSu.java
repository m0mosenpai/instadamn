package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;

/* renamed from: X.RSu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60783RSu extends EnumC61069Rej {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C60783RSu(int r3) {
        /*
            r2 = this;
            r2.A00 = r3
            switch(r3) {
                case 0: goto Lc;
                case 1: goto L10;
                case 2: goto L14;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = "JAVA9"
            r0 = 3
        L8:
            r2.<init>(r1, r0)
            return
        Lc:
            java.lang.String r1 = "JAVA6"
            r0 = 0
            goto L8
        L10:
            java.lang.String r1 = "JAVA7"
            r0 = 1
            goto L8
        L14:
            java.lang.String r1 = "JAVA8"
            r0 = 2
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60783RSu.<init>(int):void");
    }

    @Override // X.EnumC61069Rej
    public final String A00(Type type) {
        switch (this.A00) {
            case 2:
                try {
                    return (String) AbstractC58323PtF.A0l(type, Type.class, "getTypeName");
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw AbstractC58318PtA.A0f(e);
                } catch (NoSuchMethodException unused) {
                    throw AbstractC58318PtA.A0W("Type.getTypeName should be available in Java 8");
                }
            case 3:
                return EnumC61069Rej.A02.A00(type);
            default:
                return super.A00(type);
        }
    }
}
