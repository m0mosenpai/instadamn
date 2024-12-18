package X;

import com.facebook.litho.ComponentsSystrace;
import java.util.List;
import java.util.Map;

/* renamed from: X.3ct, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC77073ct {
    public static final C51762Yz A00(C76223bS c76223bS, InterfaceC16820sZ interfaceC16820sZ) {
        C2XO c2xo;
        C2XO c2xo2;
        Object obj;
        C77083cu c77083cu;
        C2Y6 c2y6;
        C2XO c2xo3;
        C2XO c2xo4;
        C2XE c2xe = c76223bS.A05;
        String A08 = c2xe.A08();
        int i = c76223bS.A01;
        c76223bS.A01 = i + 1;
        C76133bI c76133bI = c76223bS.A02;
        if (c76133bI != null) {
            C75803al c75803al = c76133bI.A00;
            C75793ak c75793ak = c2xe.A03;
            if (c75793ak != null) {
                C2VK c2vk = c75793ak.A03;
                boolean z = c2xe.A0A;
                if (z) {
                    c2xo = c75803al.A04;
                } else {
                    c2xo = c75803al.A05;
                }
                C77083cu c77083cu2 = (C77083cu) c2xo.A08.get(A08);
                if (c77083cu2 != null) {
                    List list = ((C2Y6) c77083cu2.A01).A00;
                    if (list.size() > i) {
                        C2Y5 c2y5 = c2xe.A05;
                        c2y5.getClass();
                        c2y5.A02 = c77083cu2;
                        if (i == 0) {
                            if (z) {
                                c2xo4 = c75803al.A04;
                            } else {
                                c2xo4 = c75803al.A05;
                            }
                            c2xo4.A03.add(A08);
                        }
                        return new C51762Yz(c2xe.A01, c2vk, list.get(i), A08, i, z);
                    }
                }
                C2Y5 c2y52 = c2xe.A05;
                c2y52.getClass();
                String A0H = c2y52.A03.A0H();
                C14360o3.A07(A0H);
                if (z) {
                    c2xo2 = c75803al.A04;
                } else {
                    c2xo2 = c75803al.A05;
                }
                C2XJ c2xj = c2xo2.A00;
                synchronized (c2xj) {
                    Map map = c2xj.A01;
                    obj = map.get(A08);
                    if (obj == null) {
                        obj = new Object();
                        map.put(A08, obj);
                    }
                }
                synchronized (obj) {
                    Map map2 = c2xj.A02;
                    c77083cu = (C77083cu) map2.get(A08);
                    if (c77083cu != null) {
                        c2y6 = (C2Y6) c77083cu.A01;
                        if (c2y6 != null && c2y6.A00.size() > i) {
                        }
                    } else {
                        c2y6 = null;
                    }
                    boolean isTracing = ComponentsSystrace.A00.isTracing();
                    if (isTracing) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("create-initial-state:");
                        sb.append(A0H);
                        sb.append('[');
                        sb.append(i);
                        sb.append(']');
                        ComponentsSystrace.A02(sb.toString());
                    }
                    Object invoke = interfaceC16820sZ.invoke();
                    if (isTracing) {
                        ComponentsSystrace.A01();
                    }
                    C2Y6 c2y62 = new C2Y6(c2y6, invoke);
                    List list2 = c2y62.A00;
                    if (i < list2.size()) {
                        if (c77083cu != null) {
                            c77083cu = new C77083cu(c77083cu.A00, c2y62);
                        } else {
                            c77083cu = new C77083cu(null, c2y62);
                        }
                        map2.put(A08, c77083cu);
                    } else {
                        throw new IllegalStateException(AnonymousClass001.A0n("Unexpected useState hook sequence encountered: ", " (states size: ", "). This usually indicates that the useState hook is being called from within a conditional, loop, or after an early-exit condition. See https://fblitho.com/docs/mainconcepts/hooks-intro/#rules-for-hooks for more information on the Rules of Hooks.", i, list2.size()));
                    }
                }
                if (z) {
                    c2xo3 = c75803al.A04;
                } else {
                    c2xo3 = c75803al.A05;
                }
                synchronized (c2xo3) {
                    c2xo3.A03.add(A08);
                    c2xo3.A08.put(A08, c77083cu);
                }
                C2Y5 c2y53 = c2xe.A05;
                c2y53.getClass();
                c2y53.A02 = c77083cu;
                return new C51762Yz(c2xe.A01, c2vk, ((C2Y6) c77083cu.A01).A00.get(i), A08, i, z);
            }
            throw new IllegalStateException("LithoTree is null");
        }
        throw new IllegalStateException("Cannot create state outside of layout calculation");
    }
}
