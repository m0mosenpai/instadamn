package X;

import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.U6c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66258U6c {
    public final void A00(Object obj) {
        C102884kP c102884kP;
        Object valueOf;
        List list;
        int i;
        List list2;
        String str;
        String str2;
        int i2;
        Object obj2;
        int i3;
        String str3;
        C102884kP c102884kP2;
        Object obj3;
        if (this instanceof C67963V4c) {
            C67963V4c c67963V4c = (C67963V4c) this;
            i2 = c67963V4c.A00;
            obj3 = c67963V4c.A01;
            c102884kP2 = (C102884kP) obj;
        } else {
            if (this instanceof C67962V4b) {
                C67962V4b c67962V4b = (C67962V4b) this;
                C102884kP c102884kP3 = (C102884kP) obj;
                switch (c67962V4b.A00) {
                    case 0:
                        C14360o3.A0B(c102884kP3, 0);
                        obj2 = Integer.valueOf(((View) c67962V4b.A01).getMeasuredHeight());
                        i3 = 1;
                        break;
                    case 1:
                        C14360o3.A0B(c102884kP3, 0);
                        obj2 = c67962V4b.A01;
                        i3 = 38;
                        break;
                    case 2:
                        C14360o3.A0B(c102884kP3, 0);
                        HashSet hashSet = new HashSet();
                        List A0M = c102884kP3.A0M();
                        C14360o3.A0C(A0M, AbstractC111324zv.A00(22));
                        Iterator it = A0M.iterator();
                        while (true) {
                            String str4 = null;
                            if (it.hasNext()) {
                                C102884kP A08 = ((C102884kP) it.next()).A08(132);
                                if (A08 != null) {
                                    str4 = A08.A0E();
                                }
                                hashSet.add(str4);
                            } else {
                                for (C102884kP c102884kP4 : (List) c67962V4b.A01) {
                                    C102884kP A082 = c102884kP4.A08(132);
                                    if (A082 != null) {
                                        str3 = A082.A0E();
                                    } else {
                                        str3 = null;
                                    }
                                    if (!hashSet.contains(str3)) {
                                        c102884kP3.A0M().add(c102884kP4);
                                        hashSet.add(str3);
                                    }
                                }
                                return;
                            }
                        }
                    case 3:
                        i2 = C1LZ.A00().A08.A00(c102884kP3);
                        obj3 = new ArrayList(AbstractC66263U6h.A03(c102884kP3, (List) c67962V4b.A01));
                        c102884kP2 = c102884kP3;
                        break;
                    case 4:
                        i2 = C1LZ.A00().A08.A00(c102884kP3);
                        ArrayList arrayList = new ArrayList(c102884kP3.A0N(i2));
                        arrayList.addAll(0, AbstractC66263U6h.A03(c102884kP3, (List) c67962V4b.A01));
                        obj3 = arrayList;
                        c102884kP2 = c102884kP3;
                        break;
                    default:
                        i2 = C1LZ.A00().A08.A00(c102884kP3);
                        ArrayList arrayList2 = new ArrayList(c102884kP3.A0N(i2));
                        arrayList2.addAll(AbstractC66263U6h.A03(c102884kP3, (List) c67962V4b.A01));
                        obj3 = arrayList2;
                        c102884kP2 = c102884kP3;
                        break;
                }
                c102884kP3.A0Q(i3, obj2);
                return;
            }
            if (this instanceof C67966V4f) {
                C67966V4f c67966V4f = (C67966V4f) this;
                c102884kP = (C102884kP) obj;
                if (c67966V4f.A00 != 0) {
                    Pair A01 = AbstractC66263U6h.A01(c102884kP, (XAK) c67966V4f.A02);
                    i = ((Number) A01.second).intValue();
                    if (i < 0) {
                        str = "ComponentTree";
                        str2 = "replaceChild: No existing child found with specified ID in parent. New children have not been added to parent.";
                        android.util.Log.w(str, str2);
                        return;
                    } else {
                        list = (List) A01.first;
                        list.remove(i);
                        list2 = (List) c67966V4f.A01;
                        list.addAll(i, AbstractC66263U6h.A03(c102884kP, list2));
                        return;
                    }
                }
                valueOf = c67966V4f.A02;
                c102884kP.A0Q(31, valueOf);
                return;
            }
            if (this instanceof C66269U6n) {
                Pair A012 = AbstractC66263U6h.A01((C102884kP) obj, new U5I(((C66269U6n) this).A00));
                int intValue = ((Number) A012.second).intValue();
                if (intValue < 0) {
                    str = "ComponentTreeMutator";
                    str2 = "removeChildById: No existing child found with specified ID in parent. No child has been removed from the parent.";
                } else {
                    ((List) A012.first).remove(intValue);
                    return;
                }
            } else if (this instanceof C67961V4a) {
                C67961V4a c67961V4a = (C67961V4a) this;
                c102884kP = (C102884kP) obj;
                Pair A013 = AbstractC66263U6h.A01(c102884kP, new U5I(c67961V4a.A00));
                int intValue2 = ((Number) A013.second).intValue();
                if (intValue2 < 0) {
                    str = "ComponentTreeMutator";
                    str2 = "replaceChildrenAfter: No existing child found with specified ID in parent. New children have not been added to parent.";
                } else {
                    list = (List) A013.first;
                    int size = list.size();
                    while (true) {
                        size--;
                        if (size <= intValue2) {
                            break;
                        } else {
                            list.remove(size);
                        }
                    }
                    i = intValue2 + 1;
                    list2 = c67961V4a.A01;
                    list.addAll(i, AbstractC66263U6h.A03(c102884kP, list2));
                    return;
                }
            } else if (this instanceof V4X) {
                C102884kP c102884kP5 = (C102884kP) obj;
                C14360o3.A0B(c102884kP5, 0);
                i2 = 31;
                obj3 = Integer.valueOf(((V4X) this).A00);
                c102884kP2 = c102884kP5;
            } else if (this instanceof V4Z) {
                V4Z v4z = (V4Z) this;
                Pair A014 = AbstractC66263U6h.A01((C102884kP) obj, new U5I(v4z.A01));
                List list3 = (List) A014.first;
                int intValue3 = ((Number) A014.second).intValue();
                int A00 = AbstractC66263U6h.A00(new U5I(v4z.A00), list3);
                str = "ComponentTree";
                if (intValue3 == -1) {
                    str2 = "removeChildren: The starting id doesn't exist. No children have been removed.";
                } else if (A00 == -1) {
                    str2 = "removeChildren: The ending id doesn't exist. No children have been removed.";
                } else if (intValue3 > A00) {
                    str2 = "removeChildren: The starting index is larger than the ending index. No children have been removed.";
                } else {
                    Iterator it2 = list3.iterator();
                    int i4 = 0;
                    while (it2.hasNext()) {
                        it2.next();
                        if (i4 > intValue3 && i4 < A00) {
                            it2.remove();
                        }
                        i4++;
                    }
                    return;
                }
            } else if (this instanceof C67965V4e) {
                C67965V4e c67965V4e = (C67965V4e) this;
                c102884kP = (C102884kP) obj;
                Pair A015 = AbstractC66263U6h.A01(c102884kP, new U5I(c67965V4e.A01));
                int intValue4 = ((Number) A015.second).intValue();
                if (intValue4 < 0) {
                    str = "ComponentTree";
                    str2 = "insertChildrenRelativeToId: No existing child found with specified ID in parent. New children have not been added to parent.";
                } else {
                    list = (List) A015.first;
                    i = intValue4 + c67965V4e.A00;
                    list2 = c67965V4e.A02;
                    list.addAll(i, AbstractC66263U6h.A03(c102884kP, list2));
                    return;
                }
            } else {
                if (this instanceof V4Y) {
                    c102884kP = (C102884kP) obj;
                    valueOf = Integer.valueOf(((V4Y) this).A00);
                    c102884kP.A0Q(31, valueOf);
                    return;
                }
                C67964V4d c67964V4d = (C67964V4d) this;
                C102884kP c102884kP6 = (C102884kP) obj;
                int i5 = c67964V4d.A00;
                int i6 = c67964V4d.A01;
                if (i5 < i6) {
                    while (i5 < i6) {
                        int i7 = i5 + 1;
                        Collections.swap(c102884kP6.A0M(), i5, i7);
                        i5 = i7;
                    }
                    return;
                }
                while (i5 > i6) {
                    int i8 = i5 - 1;
                    Collections.swap(c102884kP6.A0M(), i5, i8);
                    i5 = i8;
                }
                return;
            }
            android.util.Log.w(str, str2);
            return;
        }
        c102884kP2.A0Q(i2, obj3);
    }

    public final boolean A01(Object obj) {
        if (this instanceof C67963V4c) {
            C67963V4c c67963V4c = (C67963V4c) this;
            int i = c67963V4c.A00;
            Object obj2 = c67963V4c.A01;
            Object A00 = C102884kP.A00((C102884kP) obj, i);
            if (A00 == obj2) {
                return false;
            }
            if (obj2 instanceof Number) {
                if (A00 instanceof Number) {
                    Number number = (Number) A00;
                    Number number2 = (Number) obj2;
                    if (number.longValue() == number2.longValue() && number.doubleValue() == number2.doubleValue()) {
                        return false;
                    }
                }
            } else {
                return !C6AO.A00(A00, obj2);
            }
        } else if (this instanceof V4X) {
            C102884kP c102884kP = (C102884kP) obj;
            C14360o3.A0B(c102884kP, 0);
            if (c102884kP.A03(31, 0) == ((V4X) this).A00) {
                return false;
            }
        }
        return true;
    }
}
