package X;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/* renamed from: X.5S5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5S5 {
    public static C5S5 A02;
    public static final C5S6 A03 = new Object();
    public final C5S7 A01 = new C5S7();
    public final C25301Lk A00 = new C25301Lk(AbstractC12290kX.A00.getApplicationContext(), new InterfaceC25281Li() { // from class: X.5S9
        @Override // X.InterfaceC25281Li
        public final /* bridge */ /* synthetic */ Object E3T(String str) {
            C14360o3.A0B(str, 0);
            C5S7 parseFromJson = AbstractC68572VVz.parseFromJson(C16V.A00(str));
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.InterfaceC25281Li
        public final /* bridge */ /* synthetic */ String EOt(Object obj) {
            C5S7 c5s7 = (C5S7) obj;
            C14360o3.A0B(c5s7, 0);
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0d();
            if (c5s7.A00 != null) {
                C16V.A03(A0A, "states");
                for (C4NQ c4nq : c5s7.A00) {
                    if (c4nq != null) {
                        C4NX.A00(A0A, c4nq);
                    }
                }
                A0A.A0Z();
            }
            A0A.A0a();
            A0A.close();
            String obj2 = stringWriter.toString();
            C14360o3.A07(obj2);
            return obj2;
        }
    }, 1863054121);

    public final C4NQ A00(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        return (C4NQ) this.A01.A01.get(AnonymousClass001.A0R(str, str2));
    }

    public C5S5() {
        C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.5SA
            {
                super(177, 4, false, false);
            }

            @Override // java.lang.Runnable
            public final void run() {
                Object A022;
                C5S5 c5s5 = C5S5.this;
                C25301Lk c25301Lk = c5s5.A00;
                synchronized (c25301Lk) {
                    A022 = c25301Lk.A02("state-v1", false);
                }
                C5S7 c5s7 = c5s5.A01;
                C5S7 c5s72 = (C5S7) A022;
                synchronized (c5s7) {
                    if (c5s72 != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        synchronized (c5s72) {
                            List<C4NQ> list = c5s72.A00;
                            C14360o3.A0A(list);
                            for (C4NQ c4nq : list) {
                                String A00 = C5S8.A00(c4nq);
                                C4NQ c4nq2 = (C4NQ) c5s7.A01.get(A00);
                                if (c4nq2 != null) {
                                    synchronized (c4nq2) {
                                        try {
                                            C14360o3.A0B(c4nq, 0);
                                            synchronized (c4nq) {
                                                List list2 = c4nq2.A05;
                                                List list3 = c4nq.A05;
                                                TreeSet treeSet = new TreeSet(list2);
                                                if (list3 != null) {
                                                    treeSet.addAll(list3);
                                                }
                                                c4nq2.A05 = new ArrayList(treeSet);
                                                List list4 = c4nq2.A06;
                                                List list5 = c4nq.A06;
                                                TreeSet treeSet2 = new TreeSet(list4);
                                                if (list5 != null) {
                                                    treeSet2.addAll(list5);
                                                }
                                                c4nq2.A06 = new ArrayList(treeSet2);
                                                List list6 = c4nq2.A04;
                                                List list7 = c4nq.A04;
                                                TreeSet treeSet3 = new TreeSet(list6);
                                                if (list7 != null) {
                                                    treeSet3.addAll(list7);
                                                }
                                                c4nq2.A04 = new ArrayList(treeSet3);
                                                Long l = c4nq2.A00;
                                                if (l != null && l.longValue() == 0) {
                                                    c4nq2.A00 = c4nq.A00;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                } else {
                                    Long l2 = c4nq.A00;
                                    if (l2 != null) {
                                        if (l2.longValue() < currentTimeMillis) {
                                            C5S7.A00(c4nq, c5s7, A00);
                                        }
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        });
    }
}
