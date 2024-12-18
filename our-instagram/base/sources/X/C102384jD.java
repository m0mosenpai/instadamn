package X;

import java.io.Serializable;

/* renamed from: X.4jD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102384jD extends C102394jE implements Serializable {
    public static AbstractC910944l A00(AbstractC910944l abstractC910944l, Class cls) {
        AbstractC910944l A0B = abstractC910944l.A0B(cls);
        if (A0B != null) {
            return A0B;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Strange ");
        sb.append(cls.getName());
        sb.append(" sub-type, ");
        sb.append(abstractC910944l);
        sb.append(", can not find type parameters");
        throw new IllegalArgumentException(sb.toString());
    }
}
