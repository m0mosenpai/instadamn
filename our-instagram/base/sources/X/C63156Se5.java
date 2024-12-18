package X;

import java.util.Iterator;

/* renamed from: X.Se5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63156Se5 {
    public static final EnumC61219RhJ A00(String str) {
        Object obj;
        Iterator<E> it = EnumC61219RhJ.A09.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                String str2 = ((EnumC61219RhJ) obj).A02;
                if (str2 != null && str2.equalsIgnoreCase(str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        EnumC61219RhJ enumC61219RhJ = (EnumC61219RhJ) obj;
        if (enumC61219RhJ == null) {
            return EnumC61219RhJ.A0E;
        }
        return enumC61219RhJ;
    }

    public static final EnumC61219RhJ A01(String str) {
        if (str != null) {
            String A00 = new C11L("[^a-zA-Z]").A00(str, "");
            for (EnumC61219RhJ enumC61219RhJ : EnumC61219RhJ.A09) {
                if (AbstractC002300n.A0g(AbstractC58319PtB.A0s(enumC61219RhJ.name(), "[^a-zA-Z]", ""), A00, true)) {
                    return enumC61219RhJ;
                }
            }
        }
        return EnumC61219RhJ.A0L;
    }

    public final EnumC61219RhJ A02(String str) {
        Object obj;
        Iterator<E> it = EnumC61219RhJ.A09.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC31175DnJ.A1Z(str, ((EnumC61219RhJ) obj).A05)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        EnumC61219RhJ enumC61219RhJ = (EnumC61219RhJ) obj;
        if (enumC61219RhJ == null) {
            enumC61219RhJ = EnumC61219RhJ.A0E;
        }
        EnumC61219RhJ enumC61219RhJ2 = EnumC61219RhJ.A0E;
        if (enumC61219RhJ != enumC61219RhJ2 && enumC61219RhJ != EnumC61219RhJ.A0L) {
            return enumC61219RhJ;
        }
        C14360o3.A0A(str);
        if (str.length() == 0) {
            return enumC61219RhJ2;
        }
        return EnumC61219RhJ.A0L;
    }
}
