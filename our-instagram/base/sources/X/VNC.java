package X;

import android.text.Spannable;
import android.text.Spanned;
import android.text.style.ImageSpan;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class VNC {
    public static final boolean A00(AbstractC46363Kfl abstractC46363Kfl, CharSequence charSequence) {
        String str;
        String str2;
        String str3;
        VIQ viq;
        Spanned spanned;
        Object obj;
        String str4;
        int intValue;
        Integer num;
        Integer num2;
        int length;
        C67640Utv c67640Utv = (C67640Utv) abstractC46363Kfl;
        List list = c67640Utv.A01;
        List list2 = c67640Utv.A00;
        if (list != null && !list.isEmpty()) {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C67642Utx c67642Utx = (C67642Utx) ((VIQ) it.next());
                    Integer num3 = c67642Utx.A01;
                    Integer num4 = c67642Utx.A00;
                    if (num3 == null || num3.intValue() < 0 || num4 == null || num4.intValue() <= 0 || (str = c67642Utx.A02) == null || AbstractC001900j.A0T(str)) {
                        return false;
                    }
                }
            }
            if (list2 != null && !list2.isEmpty()) {
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        C67641Utw c67641Utw = (C67641Utw) ((VIP) it2.next());
                        String str5 = c67641Utw.A02;
                        if (str5 == null || AbstractC001900j.A0T(str5) || (str2 = c67641Utw.A00) == null || AbstractC001900j.A0T(str2) || (str3 = c67641Utw.A01) == null || AbstractC001900j.A0T(str3)) {
                            return false;
                        }
                    }
                }
                Iterator it3 = list.iterator();
                do {
                    if (it3.hasNext()) {
                        VIQ viq2 = (VIQ) it3.next();
                        Iterator it4 = list2.iterator();
                        Object obj2 = null;
                        Object obj3 = null;
                        boolean z = false;
                        while (true) {
                            if (it4.hasNext()) {
                                Object next = it4.next();
                                if (C14360o3.A0K(((C67641Utw) ((VIP) next)).A02, ((C67642Utx) viq2).A02)) {
                                    if (z) {
                                        break;
                                    }
                                    obj3 = next;
                                    z = true;
                                }
                            } else if (z) {
                                obj2 = obj3;
                            }
                        }
                        VIP vip = (VIP) obj2;
                        if (vip != null) {
                            num2 = ((C67642Utx) viq2).A00;
                            String str6 = ((C67641Utw) vip).A00;
                            if (str6 != null) {
                                length = str6.length();
                                if (num2 != null) {
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    } else {
                        List A0g = AbstractC001800i.A0g(list, new C65903Tw9(7));
                        int size = A0g.size() - 1;
                        int i = 0;
                        while (i < size) {
                            Integer num5 = ((C67642Utx) ((VIQ) A0g.get(i))).A01;
                            if (num5 != null) {
                                int intValue2 = num5.intValue();
                                Integer num6 = ((C67642Utx) ((VIQ) A0g.get(i))).A00;
                                if (num6 != null) {
                                    int intValue3 = intValue2 + num6.intValue();
                                    i++;
                                    Integer num7 = ((C67642Utx) ((VIQ) A0g.get(i))).A01;
                                    if (num7 != null) {
                                        if (intValue3 > num7.intValue()) {
                                            return false;
                                        }
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        List A0g2 = AbstractC001800i.A0g(list, new C65903Tw9(6));
                        if (A0g2 != null && (viq = (VIQ) AbstractC001800i.A0L(A0g2)) != null) {
                            C67642Utx c67642Utx2 = (C67642Utx) viq;
                            Integer num8 = c67642Utx2.A01;
                            if (num8 != null) {
                                int intValue4 = num8.intValue();
                                Integer num9 = c67642Utx2.A00;
                                if (num9 != null) {
                                    if (intValue4 + num9.intValue() <= charSequence.length()) {
                                        Iterator it5 = list.iterator();
                                        do {
                                            if (it5.hasNext()) {
                                                VIQ viq3 = (VIQ) it5.next();
                                                Iterator it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        obj = it6.next();
                                                        if (C14360o3.A0K(((C67641Utw) ((VIP) obj)).A02, ((C67642Utx) viq3).A02)) {
                                                            break;
                                                        }
                                                    } else {
                                                        obj = null;
                                                        break;
                                                    }
                                                }
                                                VIP vip2 = (VIP) obj;
                                                if (vip2 != null) {
                                                    str4 = ((C67641Utw) vip2).A00;
                                                    C67642Utx c67642Utx3 = (C67642Utx) viq3;
                                                    Integer num10 = c67642Utx3.A01;
                                                    if (num10 != null) {
                                                        intValue = num10.intValue();
                                                        num = c67642Utx3.A00;
                                                        if (num == null) {
                                                            throw new IllegalStateException("Required value was null.");
                                                        }
                                                    } else {
                                                        throw new IllegalStateException("Required value was null.");
                                                    }
                                                }
                                            } else {
                                                if ((charSequence instanceof Spannable) && (spanned = (Spanned) charSequence) != null) {
                                                    Iterator it7 = list.iterator();
                                                    while (it7.hasNext()) {
                                                        C67642Utx c67642Utx4 = (C67642Utx) ((VIQ) it7.next());
                                                        Integer num11 = c67642Utx4.A01;
                                                        if (num11 != null) {
                                                            int intValue5 = num11.intValue();
                                                            Integer num12 = c67642Utx4.A00;
                                                            if (num12 != null) {
                                                                ImageSpan[] imageSpanArr = (ImageSpan[]) spanned.getSpans(intValue5, num12.intValue(), ImageSpan.class);
                                                                C14360o3.A0A(imageSpanArr);
                                                                if (imageSpanArr.length == 0) {
                                                                }
                                                            } else {
                                                                throw new IllegalStateException("Required value was null.");
                                                            }
                                                        } else {
                                                            throw new IllegalStateException("Required value was null.");
                                                        }
                                                    }
                                                }
                                                return true;
                                            }
                                        } while (C14360o3.A0K(str4, charSequence.subSequence(intValue, num.intValue() + intValue).toString()));
                                        return false;
                                    }
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    }
                } while (num2.intValue() == length);
                return false;
            }
        }
        return false;
    }
}
