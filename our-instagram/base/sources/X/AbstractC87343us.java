package X;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.ViewGroup;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3us, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC87343us {
    public static final void A00(C2WS c2ws, C51092Wf c51092Wf) {
        C14360o3.A0B(c51092Wf, 0);
        C79063gD c79063gD = c51092Wf.A01;
        if (c79063gD != null) {
            Rect rect = new Rect();
            c2ws.getLocalVisibleRect(rect);
            c79063gD.A05(rect);
        }
    }

    public static final void A01(C51092Wf c51092Wf) {
        C14360o3.A0B(c51092Wf, 0);
        C79063gD c79063gD = c51092Wf.A01;
        if (c79063gD != null) {
            List list = c79063gD.A08;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C2X7 c2x7 = ((C79073gE) list.get(i)).A01;
                if (c2x7 instanceof C79083gF) {
                    Object obj = list.get(i);
                    C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.rendercore.extensions.ExtensionState<kotlin.Any>");
                    C79073gE c79073gE = (C79073gE) obj;
                    if (((C79083gF) c2x7).A00) {
                        ((C79183gP) c79073gE.A02).A03 = false;
                        RunnableC104034mP A00 = C79083gF.A00(c79073gE);
                        ((java.util.Set) A00.A04.getValue()).remove(c79073gE.A00);
                    }
                }
            }
        }
    }

    public static final void A02(C51092Wf c51092Wf, Long l) {
        C14360o3.A0B(c51092Wf, 0);
        C79063gD c79063gD = c51092Wf.A01;
        if (c79063gD != null) {
            List list = c79063gD.A08;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C2X7 c2x7 = ((C79073gE) list.get(i)).A01;
                if (c2x7 instanceof C79083gF) {
                    Object obj = list.get(i);
                    C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.rendercore.extensions.ExtensionState<kotlin.Any>");
                    C79073gE c79073gE = (C79073gE) obj;
                    if (((C79083gF) c2x7).A00) {
                        ((C79183gP) c79073gE.A02).A03 = true;
                        RunnableC104034mP A00 = C79083gF.A00(c79073gE);
                        ((java.util.Set) A00.A04.getValue()).add(c79073gE.A00);
                        if (l != null) {
                            long nanos = TimeUnit.MILLISECONDS.toNanos(l.longValue());
                            if (nanos > A00.A00) {
                                A00.A00 = nanos;
                            }
                        }
                        if (!A00.A01 && (!((java.util.Set) r10.getValue()).isEmpty())) {
                            A00.A01 = true;
                            A00.A02.post(A00);
                            Choreographer.getInstance().postFrameCallback(A00);
                        }
                    }
                }
            }
        }
    }

    public static final void A03(C1LL c1ll, Object obj) {
        if (c1ll == null) {
            c1ll = C1LN.A01;
        }
        c1ll.ADO("recursivelyNotifyVisibleBoundsChanged");
        if (obj != null) {
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(obj);
            while (!arrayDeque.isEmpty()) {
                Object pop = arrayDeque.pop();
                if (pop instanceof InterfaceC51052Wb) {
                    ((InterfaceC51052Wb) pop).Ctb();
                } else if (pop instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) pop;
                    int childCount = viewGroup.getChildCount();
                    while (true) {
                        childCount--;
                        if (-1 < childCount) {
                            arrayDeque.push(viewGroup.getChildAt(childCount));
                        }
                    }
                }
            }
        }
        c1ll.ASb();
    }
}
