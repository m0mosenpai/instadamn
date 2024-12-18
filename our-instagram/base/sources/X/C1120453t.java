package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.53t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1120453t {
    public static final String A09 = C48442Kl.A01("WorkContinuationImpl");
    public boolean A00;
    public InterfaceC49162No A01;
    public final C2L1 A02;
    public final Integer A03;
    public final String A04;
    public final List A05;
    public final List A06;
    public final List A07;
    public final List A08;

    public static HashSet A00(C1120453t continuation) {
        HashSet hashSet = new HashSet();
        List list = continuation.A06;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashSet.addAll(((C1120453t) it.next()).A05);
            }
        }
        return hashSet;
    }

    public static boolean A01(C1120453t continuation, java.util.Set visited) {
        List list = continuation.A05;
        visited.addAll(list);
        HashSet A00 = A00(continuation);
        Iterator it = visited.iterator();
        while (it.hasNext()) {
            if (A00.contains(it.next())) {
                return true;
            }
        }
        List list2 = continuation.A06;
        if (list2 != null && !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (A01((C1120453t) it2.next(), visited)) {
                    return true;
                }
            }
        }
        visited.removeAll(list);
        return false;
    }

    public final InterfaceC49162No A02() {
        if (!this.A00) {
            RunnableC1120553u runnableC1120553u = new RunnableC1120553u(new C49142Nl(), this);
            this.A02.A06.ATa(runnableC1120553u);
            this.A01 = runnableC1120553u.A00;
        } else {
            C48442Kl.A00();
            android.util.Log.w(A09, AnonymousClass001.A0g("Already enqueued work ids (", TextUtils.join(", ", this.A05), ")"));
        }
        return this.A01;
    }

    public C1120453t(C2L1 workManagerImpl, Integer name, String existingWorkPolicy, List work, List parents) {
        this.A02 = workManagerImpl;
        this.A04 = existingWorkPolicy;
        this.A03 = name;
        this.A07 = work;
        this.A06 = parents;
        this.A05 = new ArrayList(work.size());
        this.A08 = new ArrayList();
        if (parents != null) {
            Iterator it = parents.iterator();
            while (it.hasNext()) {
                this.A08.addAll(((C1120453t) it.next()).A08);
            }
        }
        for (int i = 0; i < work.size(); i++) {
            if (name == C05F.A00 && ((C2L0) work.get(i)).A00.A09 != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String obj = ((C2L0) work.get(i)).A02.toString();
            C14360o3.A07(obj);
            this.A05.add(obj);
            this.A08.add(obj);
        }
    }

    public C1120453t() {
    }
}
