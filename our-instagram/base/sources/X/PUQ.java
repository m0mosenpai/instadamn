package X;

import android.content.Context;
import android.util.Pair;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes9.dex */
public final class PUQ implements Callable {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC14020nS A02;
    public final HashMap A03;
    public final List A04;
    public final List A05;
    public final Queue A06;

    public PUQ(Context context, UserSession userSession, List list, List list2, Map map) {
        ArrayList arrayList;
        C14360o3.A0B(map, 3);
        this.A00 = context;
        this.A01 = userSession;
        this.A06 = new LinkedList();
        InterfaceC14020nS A00 = C14120nc.A00();
        C14360o3.A07(A00);
        this.A02 = A00;
        this.A03 = new HashMap(map);
        this.A04 = AbstractC166987dD.A1F(list);
        if (list2 != null) {
            arrayList = AbstractC166987dD.A1F(list2);
        } else {
            arrayList = null;
        }
        this.A05 = arrayList;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        boolean z;
        List list = this.A04;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Medium medium = (Medium) list.get(i);
            C38321qM c38321qM = (C38321qM) this.A03.get(String.valueOf(medium.A05));
            if (c38321qM != null) {
                Context context = this.A00;
                UserSession userSession = this.A01;
                List list2 = this.A05;
                if (list2 != null) {
                    z = AbstractC166987dD.A1a(list2.get(i));
                } else {
                    z = false;
                }
                OUQ A05 = AbstractC50633MWu.A05(context, c38321qM, "gallery", z, false);
                C14160ng c14160ng = new C14160ng(new PUR(context, userSession, A05, A05.A01, A05.A00, -1L, false), 132, 3, false, false);
                this.A06.offer(new Pair(medium, c14160ng));
                this.A02.ATN(c14160ng);
            }
        }
        while (true) {
            Queue queue = this.A06;
            if (!queue.isEmpty()) {
                Object poll = queue.poll();
                if (poll != null) {
                    Pair pair = (Pair) poll;
                    Medium medium2 = (Medium) pair.first;
                    Object obj = pair.second;
                    C14360o3.A06(obj);
                    Object obj2 = ((FutureTask) obj).get();
                    C14360o3.A07(obj2);
                    medium2.A04((File) obj2);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                return list;
            }
        }
    }
}
