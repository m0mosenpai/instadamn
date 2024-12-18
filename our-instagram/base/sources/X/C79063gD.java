package X;

import android.graphics.Rect;
import com.facebook.rendercore.RenderTreeNode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;

/* renamed from: X.3gD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79063gD {
    public InterfaceC66812zy A00;
    public C79073gE A01;
    public boolean A02;
    public boolean A03;
    public int A04;
    public final C51092Wf A06;
    public final C1LL A07;
    public final C003501a A05 = new C003501a(10);
    public final List A08 = new ArrayList();
    public final java.util.Set A09 = new HashSet();

    @Deprecated(message = "Only used for Litho's integration. Marked for removal.")
    public final void A07(C2X7 c2x7) {
        C2X7 c2x72;
        List list = this.A08;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                c2x72 = ((C79073gE) it.next()).A01;
                if (c2x72 == c2x7) {
                    it.remove();
                    break;
                }
            } else {
                c2x72 = null;
                break;
            }
        }
        if (c2x72 instanceof C51352Xi) {
            this.A06.A00 = null;
            this.A01 = null;
        }
        if (c2x72 != null) {
            if (c2x72 instanceof C79083gF) {
                this.A03 = false;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (((C79073gE) list.get(i)).A01 instanceof C79083gF) {
                        this.A03 = true;
                    }
                    if (this.A03) {
                        return;
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException(new C57549PgN(c2x7, 0).toString());
    }

    public static final void A00(C79063gD c79063gD, long j) {
        int intValue;
        if (c79063gD.A03) {
            C003501a c003501a = c79063gD.A05;
            Number number = (Number) c003501a.A05(j);
            if (number != null && (intValue = number.intValue()) != 0) {
                c003501a.A09(j, Integer.valueOf(intValue - 1));
                return;
            }
            throw new IllegalStateException("Trying to decrement reference count for an item you don't own.");
        }
    }

    public static final void A01(C79063gD c79063gD, long j) {
        if (c79063gD.A03) {
            C003501a c003501a = c79063gD.A05;
            Number number = (Number) c003501a.A05(j);
            if (number == null) {
                number = 0;
            }
            c003501a.A09(j, Integer.valueOf(number.intValue() + 1));
        }
    }

    public final void A02() {
        if (this.A02) {
            int i = this.A04 - 1;
            this.A04 = i;
            if (i >= 0) {
                if (i == 0) {
                    java.util.Set set = this.A09;
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        AbstractC87343us.A03(this.A07, it.next());
                    }
                    set.clear();
                    return;
                }
                return;
            }
            throw new RuntimeException("notifyVisibleBoundsChangedNestCount should not be decremented below zero!");
        }
    }

    public final void A03() {
        if (this.A02) {
            this.A04++;
        }
    }

    public final boolean A08() {
        List list = this.A08;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C79073gE) list.get(i)).A01 instanceof C79083gF) {
                Object obj = list.get(i);
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.rendercore.extensions.ExtensionState<kotlin.Any>");
                C79183gP c79183gP = (C79183gP) ((C79073gE) obj).A02;
                C50882Vk c50882Vk = c79183gP.A02;
                if (c50882Vk != null) {
                    int size2 = c50882Vk.A0W.size();
                    if (c79183gP.A00 > 0 || c79183gP.A01 < size2) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public C79063gD(C51092Wf c51092Wf, C1LL c1ll) {
        this.A06 = c51092Wf;
        this.A07 = c1ll;
    }

    public final void A04() {
        A03();
        List list = this.A08;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C79073gE c79073gE = (C79073gE) list.get(i);
            c79073gE.A01.A0D(c79073gE);
        }
        A02();
    }

    public final void A05(Rect rect) {
        A03();
        List list = this.A08;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.rendercore.extensions.ExtensionState<kotlin.Any>");
            C79073gE c79073gE = (C79073gE) obj;
            Object obj2 = c79073gE.A01;
            if (obj2 instanceof InterfaceC79103gH) {
                ((InterfaceC79103gH) obj2).E1F(rect, c79073gE);
            }
        }
        A02();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A06(RenderTreeNode renderTreeNode, C1LL c1ll, Object obj, boolean z) {
        A03();
        List list = this.A08;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            C14360o3.A0C(obj2, "null cannot be cast to non-null type com.facebook.rendercore.extensions.ExtensionState<kotlin.Any>");
            C79073gE c79073gE = (C79073gE) obj2;
            C2X7 c2x7 = c79073gE.A01;
            if (c2x7 instanceof C2X8) {
                boolean isTracing = c1ll.isTracing();
                if (isTracing) {
                    c1ll.ADO(AnonymousClass001.A0R("Extension:onBoundsAppliedToItem ", c2x7.A09()));
                }
                ((C2X8) c2x7).D0L(renderTreeNode.A06, c79073gE, obj, renderTreeNode.A07, z);
                if (isTracing) {
                    c1ll.ASb();
                }
            }
        }
        A02();
    }
}
