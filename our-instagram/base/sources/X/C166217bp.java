package X;

import com.instagram.user.model.User;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.7bp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166217bp {
    public boolean A00;
    public final Deque A01 = new LinkedList();
    public final java.util.Set A02 = new HashSet();
    public final java.util.Set A03 = new HashSet();

    public final void A01(User user) {
        C14360o3.A0B(user, 0);
        java.util.Set set = this.A02;
        if (set.contains(user.getId())) {
            set.remove(user.getId());
            this.A01.remove(user);
            A00();
        }
    }

    public final void A02(InterfaceC37143GYe interfaceC37143GYe) {
        C14360o3.A0B(interfaceC37143GYe, 0);
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            Object obj = ((Reference) it.next()).get();
            if (obj == null || obj == interfaceC37143GYe) {
                it.remove();
            }
        }
    }

    public final void A03(List list) {
        this.A00 = true;
        Deque deque = this.A01;
        deque.clear();
        java.util.Set set = this.A02;
        set.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User user = (User) it.next();
            deque.add(user);
            set.add(user.getId());
        }
        A00();
    }

    public final void A00() {
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            InterfaceC37143GYe interfaceC37143GYe = (InterfaceC37143GYe) ((Reference) it.next()).get();
            if (interfaceC37143GYe != null) {
                interfaceC37143GYe.DyN(new ArrayList(this.A01));
            }
        }
    }
}
