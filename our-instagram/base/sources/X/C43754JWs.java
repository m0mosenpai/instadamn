package X;

import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.JWs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43754JWs implements InterfaceC13050lr {
    public int A00;
    public List A01;
    public List A02;
    public final Map A04 = AbstractC166987dD.A1G();
    public final List A03 = AbstractC166987dD.A1E();

    public static final void A00(C43754JWs c43754JWs) {
        C9CG c9cg;
        Object obj;
        Iterator A15 = AbstractC166997dE.A15(c43754JWs.A04);
        while (A15.hasNext()) {
            Map.Entry entry = (Map.Entry) A15.next();
            List list = c43754JWs.A01;
            Object obj2 = null;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (C14360o3.A0K(((C9CG) obj).A03, entry.getKey())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                c9cg = (C9CG) obj;
                if (c9cg != null) {
                    c9cg.A00 = entry.getValue();
                    A15.remove();
                }
            }
            Iterator it2 = c43754JWs.A03.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (C14360o3.A0K(((C9CG) next).A03, entry.getKey())) {
                    obj2 = next;
                    break;
                }
            }
            c9cg = (C9CG) obj2;
            if (c9cg != null) {
                c9cg.A00 = entry.getValue();
                A15.remove();
            }
        }
    }

    public final void A04(List list) {
        List list2 = this.A01;
        if (list2 == null) {
            list2 = AbstractC166987dD.A1E();
            this.A01 = list2;
        }
        list2.addAll(list);
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        List list = this.A01;
        if (list != null) {
            list.clear();
        }
    }

    public final C9CG A01(int i) {
        List list;
        Object obj;
        A00(this);
        List list2 = this.A03;
        if (AbstractC166987dD.A1b(list2)) {
            if (i < 0) {
                return null;
            }
            if (i < list2.size()) {
                obj = list2.get(i);
                return (C9CG) obj;
            }
            if (i >= AbstractC31172DnG.A02(A03(), list2.size())) {
                return null;
            }
            list = A03();
            i -= list2.size();
        } else {
            list = this.A01;
            if (list == null || i < 0 || i >= list.size()) {
                return null;
            }
        }
        obj = list.get(i);
        return (C9CG) obj;
    }

    public final C9CG A02(C120985dq c120985dq) {
        List list;
        Object obj;
        A00(this);
        List list2 = this.A02;
        if (list2 != null && (list = this.A01) != null) {
            int indexOf = list2.indexOf(c120985dq);
            List list3 = this.A03;
            if (AbstractC166987dD.A1b(list3)) {
                if (indexOf >= 0) {
                    if (indexOf < list3.size()) {
                        obj = list3.get(indexOf);
                        return (C9CG) obj;
                    }
                    indexOf -= list3.size();
                } else {
                    return null;
                }
            } else if (indexOf < 0 || indexOf >= list.size()) {
                return null;
            }
            obj = list.get(indexOf);
            return (C9CG) obj;
        }
        return null;
    }

    public final ImmutableList A03() {
        A00(this);
        List list = this.A01;
        if (list == null) {
            list = AbstractC166987dD.A1E();
            this.A01 = list;
        }
        return AbstractC31173DnH.A0L(list);
    }
}
