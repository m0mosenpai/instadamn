package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.06R, reason: invalid class name */
/* loaded from: classes.dex */
public final class C06R extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ List A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06R(List list) {
        super(2);
        this.A00 = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.String] */
    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        Object next;
        CharSequence charSequence = (CharSequence) obj;
        int intValue = ((Number) obj2).intValue();
        C14360o3.A0B(charSequence, 0);
        List list = this.A00;
        if (list.size() == 1) {
            next = (String) AbstractC001800i.A0D(list);
            i = AbstractC001900j.A08(charSequence, next, intValue, false);
            if (i < 0) {
                return null;
            }
        } else {
            if (intValue < 0) {
                intValue = 0;
            }
            C17u c17u = new C17u(intValue, charSequence.length());
            boolean z = charSequence instanceof String;
            i = c17u.A00;
            int i2 = c17u.A01;
            int i3 = c17u.A02;
            if (z) {
                if (i3 > 0) {
                    if (i > i2) {
                        return null;
                    }
                } else if (i3 >= 0 || i2 > i) {
                    return null;
                }
                while (true) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        next = it.next();
                        String str = (String) next;
                        String str2 = (String) charSequence;
                        int length = str.length();
                        C14360o3.A0B(str2, 2);
                        if (str.regionMatches(0, str2, i, length)) {
                            if (next != 0) {
                                break;
                            }
                        }
                    }
                    if (i == i2) {
                        return null;
                    }
                    i += i3;
                }
            } else {
                if (i3 > 0) {
                    if (i > i2) {
                        return null;
                    }
                } else if (i3 >= 0 || i2 > i) {
                    return null;
                }
                while (true) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        next = it2.next();
                        String str3 = (String) next;
                        if (AbstractC001900j.A0Z(str3, charSequence, 0, i, str3.length(), false)) {
                            if (next != 0) {
                                break;
                            }
                        }
                    }
                    if (i == i2) {
                        return null;
                    }
                    i += i3;
                }
            }
        }
        C09530e4 c09530e4 = new C09530e4(Integer.valueOf(i), next);
        return new C09530e4(c09530e4.A00, Integer.valueOf(((String) c09530e4.A01).length()));
    }
}
