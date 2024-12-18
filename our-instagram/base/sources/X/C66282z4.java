package X;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableSet;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;

/* renamed from: X.2z4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66282z4 implements InterfaceC66172yt {
    @Override // X.InterfaceC66172yt
    public final C5OL ABz(InterfaceC94534Ng interfaceC94534Ng, C49I c49i) {
        C46h c46h;
        String str;
        C65909TwG c65909TwG;
        C65909TwG c65909TwG2;
        C14360o3.A0B(interfaceC94534Ng, 0);
        C14360o3.A0B(c49i, 1);
        ImmutableSet immutableSet = c49i.A04;
        if (!immutableSet.isEmpty()) {
            AbstractC58576Pxu A00 = AbstractC58576Pxu.A00(immutableSet);
            Iterator it = ((Iterable) A00.A00.A05(A00)).iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                c46h = new C4JL(next);
            } else {
                c46h = C4JK.A00;
            }
            Object A04 = c46h.A04();
            A04.getClass();
            C55732hE c55732hE = ((Trigger) A04).A00;
            if (c55732hE != null) {
                java.util.Set keySet = c55732hE.A00.keySet();
                C14360o3.A07(keySet);
                ImmutableSet immutableSet2 = (ImmutableSet) keySet;
                C14360o3.A0B(immutableSet2, 0);
                C94544Nh c94544Nh = ((C94524Nf) interfaceC94534Ng).A03;
                if (c94544Nh != null) {
                    C4NM c4nm = c94544Nh.A00;
                    String str2 = c4nm.A09.A00;
                    if (str2 == null) {
                        str2 = "";
                    }
                    C117095Rs c117095Rs = c4nm.A03;
                    if (c117095Rs != null) {
                        str = c117095Rs.A00;
                        if (str == null) {
                            str = "";
                        }
                    } else {
                        str = null;
                    }
                    Iterator it2 = AbstractC16960so.A1Q(str2, str).iterator();
                    while (it2.hasNext()) {
                        C5OL A002 = A00(immutableSet2, (String) it2.next());
                        if (!A002.A07) {
                            return A002;
                        }
                    }
                    C4NV c4nv = c4nm.A01;
                    if (c4nv != null) {
                        c65909TwG = new C65909TwG(c4nv);
                    } else {
                        c65909TwG = null;
                    }
                    C4NV c4nv2 = c4nm.A02;
                    if (c4nv2 != null) {
                        c65909TwG2 = new C65909TwG(c4nv2);
                    } else {
                        c65909TwG2 = null;
                    }
                    for (X7Y x7y : AbstractC16960so.A1Q(c65909TwG, c65909TwG2)) {
                        if (x7y != null) {
                            C4NV c4nv3 = ((C65909TwG) x7y).A00;
                            String str3 = c4nv3.A00.A00;
                            if (str3 == null) {
                                str3 = "";
                            }
                            Iterator it3 = AbstractC16960so.A1Q(str3, c4nv3.A03).iterator();
                            while (it3.hasNext()) {
                                C5OL A003 = A00(immutableSet2, (String) it3.next());
                                if (!A003.A07) {
                                    return A003;
                                }
                            }
                        }
                    }
                }
                return C5OK.A00();
            }
        }
        C14360o3.A07(RegularImmutableSet.A03);
        return C5OK.A00();
    }

    @Override // X.InterfaceC66172yt
    public final String FE2() {
        return "client_parameters";
    }

    public static final C5OL A00(ImmutableSet immutableSet, String str) {
        C48209LVj c48209LVj;
        String str2;
        if (str != null && str.length() != 0) {
            HashSet hashSet = new HashSet();
            Matcher matcher = STQ.A00.matcher(str);
            while (matcher.find()) {
                hashSet.add(matcher.group(1));
            }
            if (!hashSet.isEmpty()) {
                if (immutableSet.isEmpty()) {
                    c48209LVj = new C48209LVj("failingParameters", hashSet);
                    str2 = "missing_context_to_sub_dynamic_params";
                } else {
                    hashSet.removeAll(immutableSet);
                    if (!hashSet.isEmpty()) {
                        c48209LVj = new C48209LVj("failingParameters", hashSet);
                        str2 = "leftover_dynamic_params_not_subbed";
                    }
                }
                return C5OK.A02(c48209LVj, str2);
            }
        }
        return C5OK.A00();
    }
}
