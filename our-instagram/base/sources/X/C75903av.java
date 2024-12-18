package X;

import android.content.Context;
import com.facebook.litho.ComponentsSystrace;
import com.facebook.rendercore.RenderTreeNode;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.3av, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75903av {
    public final int A00;
    public final C18630vq A01;
    public final C2XE A02;
    public final C2VY A03;
    public final Runnable A04 = new Runnable() { // from class: X.3aw
        @Override // java.lang.Runnable
        public final void run() {
            String str;
            String A0H;
            String A0R;
            int i;
            int i2;
            int i3;
            C75903av c75903av = C75903av.this;
            Integer A01 = AbstractC50692Uq.A01("Litho.ComponentTree.MountContent.Preallocated");
            if (A01 != null) {
                AbstractC50692Uq.A05("Litho.ComponentTree.MountContent.Preallocated", String.valueOf(c75903av.A00), new HashMap(), A01.intValue());
            }
            boolean z = c75903av.A07;
            if (z) {
                str = "(avoidRedundantPreAllocations)";
            } else {
                str = "";
            }
            String A0R2 = AnonymousClass001.A0R("preAllocateMountContentForTree", str);
            try {
                if (ComponentsSystrace.A00.isTracing()) {
                    ComponentsSystrace.A02(A0R2);
                }
                List<RenderTreeNode> list = (List) c75903av.A05.invoke();
                if (!list.isEmpty()) {
                    C18630vq c18630vq = AbstractC004101g.A00;
                    C18630vq c18630vq2 = new C18630vq(6);
                    for (RenderTreeNode renderTreeNode : list) {
                        AbstractC50812Vc abstractC50812Vc = AbstractC79093gG.A00(renderTreeNode).A03;
                        try {
                            if (!(abstractC50812Vc instanceof AbstractC50792Va) || !((AbstractC50792Va) abstractC50812Vc).AFr()) {
                                C2WC c2wc = renderTreeNode.A06;
                                if ((c2wc instanceof C78883fu) && ((C78883fu) c2wc).A00.A01.A01.AFr()) {
                                }
                            }
                            if (z) {
                                C18630vq c18630vq3 = c75903av.A01;
                                synchronized (c18630vq3) {
                                    try {
                                        int A03 = c18630vq3.A03(A0H);
                                        if (A03 >= 0) {
                                            i2 = c18630vq3.A02[A03];
                                        } else {
                                            i2 = 0;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                int A032 = c18630vq2.A03(A0H);
                                if (A032 >= 0) {
                                    i3 = c18630vq2.A02[A032];
                                } else {
                                    i3 = 0;
                                }
                                c18630vq2.A06(A0H, i3 + 1);
                                if (i3 < i2) {
                                    continue;
                                }
                            }
                            if (ComponentsSystrace.A00.isTracing()) {
                                ComponentsSystrace.A02(A0R);
                            }
                            InterfaceC16620sF interfaceC16620sF = c75903av.A06;
                            Context context = c75903av.A02.A0C;
                            C14360o3.A07(context);
                            if (((Boolean) interfaceC16620sF.invoke(context, renderTreeNode.A06.A0I())).booleanValue() && z) {
                                C18630vq c18630vq4 = c75903av.A01;
                                synchronized (c18630vq4) {
                                    int A033 = c18630vq4.A03(A0H);
                                    if (A033 >= 0) {
                                        i = c18630vq4.A02[A033];
                                    } else {
                                        i = 0;
                                    }
                                    c18630vq4.A06(A0H, i + 1);
                                }
                            }
                            if (ComponentsSystrace.A00.isTracing()) {
                                ComponentsSystrace.A01();
                            }
                        } catch (Throwable th2) {
                            if (ComponentsSystrace.A00.isTracing()) {
                                ComponentsSystrace.A01();
                                throw th2;
                            }
                            throw th2;
                        }
                        A0H = abstractC50812Vc.A0H();
                        C14360o3.A07(A0H);
                        A0R = AnonymousClass001.A0R("preallocateMount: ", A0H);
                    }
                }
                if (ComponentsSystrace.A00.isTracing()) {
                    ComponentsSystrace.A01();
                }
                if (A01 != null) {
                    AbstractC50692Uq.A03(A01.intValue(), AbstractC06930Yk.A0E());
                }
            } catch (Throwable th3) {
                if (ComponentsSystrace.A00.isTracing()) {
                    ComponentsSystrace.A01();
                }
                throw th3;
            }
        }
    };
    public final InterfaceC16820sZ A05;
    public final InterfaceC16620sF A06;
    public final boolean A07;

    public C75903av(C2XE c2xe, C2VY c2vy, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF, int i, boolean z) {
        this.A00 = i;
        this.A02 = c2xe;
        this.A03 = c2vy;
        this.A07 = z;
        this.A05 = interfaceC16820sZ;
        this.A06 = interfaceC16620sF;
        C18630vq c18630vq = AbstractC004101g.A00;
        this.A01 = new C18630vq(6);
    }
}
