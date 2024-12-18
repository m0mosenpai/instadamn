package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.ComponentHost;
import com.facebook.rendercore.RenderTreeNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Xi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51352Xi extends C2X7 implements C2X8 {
    public static C51352Xi A01;
    public static final C51352Xi A02 = new C51352Xi(null);
    public final String A00;

    @Override // X.C2X8
    public final void ADI(RenderTreeNode renderTreeNode, C79073gE c79073gE, int i) {
    }

    @Override // X.C2X8
    public final void CzR(C2WC c2wc, C79073gE c79073gE, Object obj, Object obj2) {
    }

    @Override // X.C2X8
    public final void DTt(C2WC c2wc, C79073gE c79073gE, Object obj, Object obj2) {
    }

    @Override // X.C2X8
    public final void Dw7(C2WC c2wc, C79073gE c79073gE, Object obj, Object obj2) {
    }

    @Override // X.C2X8
    public final void Dwh(C2WC c2wc, C79073gE c79073gE, Object obj, Object obj2) {
    }

    @Override // X.C2X8
    public final boolean Ek6(C2WC c2wc, C2WC c2wc2, C79073gE c79073gE, Object obj, Object obj2) {
        return false;
    }

    public static int A00(C50882Vk c50882Vk, int i) {
        List list = c50882Vk.A0Q;
        Object obj = list.get(i);
        int i2 = i + 1;
        int size = list.size();
        loop0: while (true) {
            if (i2 < size) {
                RenderTreeNode renderTreeNode = (RenderTreeNode) list.get(i2);
                do {
                    renderTreeNode = renderTreeNode.A05;
                    if (renderTreeNode != obj) {
                        if (renderTreeNode == null) {
                            break loop0;
                        }
                    }
                } while (renderTreeNode.A05 != null);
            } else {
                i2 = list.size();
                break;
            }
            i2++;
        }
        return i2 - 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00e4, code lost:
    
        if (r3 != null) goto L51;
     */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.3gr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.3gr, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.C50882Vk r11, X.C79073gE r12) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51352Xi.A01(X.2Vk, X.3gE):void");
    }

    public static void A03(C51282Xb c51282Xb, C79073gE c79073gE) {
        C79123gJ c79123gJ = (C79123gJ) c79073gE.A02;
        C51272Xa c51272Xa = ((C51292Xc) c79123gJ.A0A.get(((C3h4) c51282Xb.A02()).A01.A06)).A04;
        C51482Xv c51482Xv = c79123gJ.A04;
        if (c51482Xv != null && c51272Xa != null) {
            c51482Xv.A08(null, c51272Xa);
        }
        short s = c51282Xb.A00;
        for (int i = 0; i < s; i++) {
            A04((C3h4) c51282Xb.A01[c51282Xb.A01(i)], c79073gE, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A04(C3h4 c3h4, C79073gE c79073gE, boolean z) {
        C2WS c2ws;
        C79123gJ c79123gJ = (C79123gJ) c79073gE.A02;
        Object obj = c3h4.A04;
        if (c3h4.A01.A06 instanceof C2WB) {
            if ((obj instanceof InterfaceC51042Wa) && !(obj instanceof InterfaceC51062Wc)) {
                C2WS c2ws2 = (C2WS) obj;
                int mountItemCount = c2ws2.getMountItemCount();
                while (true) {
                    mountItemCount--;
                    if (mountItemCount < 0) {
                        break;
                    }
                    try {
                        A04(c2ws2.A0I(mountItemCount), c79073gE, false);
                    } catch (RuntimeException e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("content: <cls>");
                        sb.append(obj.getClass());
                        sb.append("</cls>\nrenderunit: <cls>");
                        sb.append(c3h4.A01.A06.getClass());
                        sb.append("</cls>");
                        throw new RuntimeException(sb.toString(), e);
                    }
                }
                if (c2ws2.getMountItemCount() > 0) {
                    throw new IllegalStateException("Recursively unmounting items from a Host, left some items behind, this should never happen.");
                }
            }
            if (z) {
                c2ws = (C2WS) c79123gJ.A08.get(c3h4);
            } else {
                c2ws = c3h4.A00;
            }
            if (c2ws != 0) {
                if (z) {
                    ComponentHost componentHost = (ComponentHost) ((InterfaceC51042Wa) c2ws);
                    ArrayList arrayList = componentHost.A0D;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        componentHost.A0D = arrayList;
                    }
                    if (!arrayList.remove(c3h4)) {
                        C51272Xa c51272Xa = ((C51292Xc) c79123gJ.A0A.get(c3h4.A01.A06)).A04;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Tried to remove non-existent disappearing item, transitionId: ");
                        sb2.append(c51272Xa);
                        throw new RuntimeException(sb2.toString());
                    }
                    if (obj instanceof Drawable) {
                        Drawable drawable = (Drawable) obj;
                        C2XV.A00();
                        drawable.setCallback(null);
                        componentHost.invalidate(drawable.getBounds());
                        ComponentHost.A0E(componentHost);
                    } else if (obj instanceof View) {
                        ComponentHost.A0D((View) obj, componentHost);
                        componentHost.A0H = true;
                    }
                    ComponentHost.A0G(componentHost, AbstractC79093gG.A00(c3h4.A01));
                    c79123gJ.A08.remove(c3h4);
                } else {
                    c2ws.A0M(c3h4);
                }
                C51092Wf c51092Wf = c79073gE.A00.A06;
                if (c3h4.A02) {
                    C51092Wf.A03(c3h4, c51092Wf);
                }
                if (obj instanceof View) {
                    ((View) obj).setPadding(0, 0, 0, 0);
                }
                RenderTreeNode renderTreeNode = c3h4.A01;
                C2WC c2wc = renderTreeNode.A06;
                C14360o3.A0C(c2wc, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit<kotlin.Any>");
                C51092Wf.A00(c3h4.A03, c51092Wf, renderTreeNode, c2wc, obj);
                c3h4.A00(c51092Wf.A05);
                c79123gJ.A0A.remove(c3h4.A01.A06);
                return;
            }
            throw new IllegalStateException("Disappearing mountItem has no host, can not be unmounted.");
        }
    }

    public static void A05(C79073gE c79073gE) {
        C79123gJ c79123gJ = (C79123gJ) c79073gE.A02;
        if (c79123gJ.A04 != null) {
            Map map = c79123gJ.A09;
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                A03((C51282Xb) it.next(), c79073gE);
            }
            c79073gE.A00();
            map.clear();
            c79123gJ.A0A.clear();
            c79123gJ.A07.clear();
            C51482Xv c51482Xv = c79123gJ.A04;
            C51492Xw c51492Xw = c51482Xv.A02;
            Map map2 = c51492Xw.A02;
            Iterator it2 = map2.keySet().iterator();
            while (it2.hasNext()) {
                C42R c42r = (C42R) map2.get(it2.next());
                C51482Xv.A04(null, c42r, c51482Xv);
                C51482Xv.A07(c42r);
            }
            c51492Xw.A01.clear();
            c51492Xw.A03.clear();
            c51492Xw.A00.clear();
            map2.clear();
            c51482Xv.A01.A05();
            c51482Xv.A0A.clear();
            ArrayList arrayList = c51482Xv.A09;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((AbstractC107474ss) arrayList.get(size)).A08();
                } else {
                    arrayList.clear();
                    c51482Xv.A00 = null;
                    c51482Xv.A0C.clear();
                    return;
                }
            }
        }
    }

    public static void A06(C79073gE c79073gE, int i) {
        if (c79073gE.A00.A06.A08(i) == null) {
            long A0H = ((RenderTreeNode) ((C79123gJ) c79073gE.A02).A02.A0Q.get(i)).A06.A0H();
            if (c79073gE.A03.contains(Long.valueOf(A0H))) {
                c79073gE.A02(A0H, false);
            }
            c79073gE.A01(A0H, true);
            c79073gE.A02(A0H, false);
        }
    }

    public static void A07(C79073gE c79073gE, int i) {
        RenderTreeNode renderTreeNode;
        RenderTreeNode renderTreeNode2;
        int A00;
        C50882Vk c50882Vk = ((C79123gJ) c79073gE.A02).A02;
        if (c50882Vk != null && i >= 0 && (renderTreeNode = (RenderTreeNode) c50882Vk.A0Q.get(i)) != null && (renderTreeNode2 = renderTreeNode.A05) != null && (A00 = c50882Vk.A00(renderTreeNode2.A06.A0H())) >= 0 && c79073gE.A00.A06.A08(A00) == null) {
            A07(c79073gE, A00);
            A06(c79073gE, A00);
        }
    }

    public static boolean A08(C50882Vk c50882Vk, C79123gJ c79123gJ) {
        C50882Vk c50882Vk2;
        if (c50882Vk != null && (c50882Vk2 = c79123gJ.A01) != null) {
            if (c79123gJ.A00 != c50882Vk.A08) {
                C75793ak c75793ak = c50882Vk2.A0H.A02.A03;
                if (c75793ak != null && c75793ak.A03.CUq()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // X.C2X7
    public final /* bridge */ /* synthetic */ Object A0A() {
        return new C79123gJ(this.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (r0.A03.CUq() == true) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0284  */
    @Override // X.C2X7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void A0B(android.graphics.Rect r26, X.C79073gE r27, java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 1120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51352Xi.A0B(android.graphics.Rect, X.3gE, java.lang.Object):void");
    }

    @Override // X.C2X7
    public final void A0C(C79073gE c79073gE) {
        C79123gJ c79123gJ = (C79123gJ) c79073gE.A02;
        if (c79123gJ.A04 != null) {
            C1LL c1ll = c79123gJ.A01.A0M;
            c1ll.ADO("updateAnimatingMountContent");
            LinkedHashMap linkedHashMap = new LinkedHashMap(c79123gJ.A07.size());
            C51092Wf c51092Wf = c79073gE.A00.A06;
            C79243gV c79243gV = c51092Wf.A02;
            if (c79243gV != null) {
                int length = c79243gV.A05.length;
                for (int i = 0; i < length; i++) {
                    C3h4 A08 = c51092Wf.A08(i);
                    if (A08 != null) {
                        C50882Vk c50882Vk = c79123gJ.A01;
                        C51292Xc c51292Xc = (C51292Xc) c50882Vk.A0E.A05(A08.A01.A06.A0H());
                        C51272Xa c51272Xa = c51292Xc.A04;
                        if (c51272Xa != null) {
                            int i2 = c51292Xc.A00;
                            C51282Xb c51282Xb = (C51282Xb) linkedHashMap.get(c51272Xa);
                            if (c51282Xb == null) {
                                c51282Xb = new C51282Xb();
                                linkedHashMap.put(c51272Xa, c51282Xb);
                            }
                            Object obj = A08.A04;
                            Object[] objArr = c51282Xb.A01;
                            if (objArr[i2] != null) {
                                objArr[i2] = obj;
                            } else {
                                c51282Xb.A03(i2, obj);
                            }
                        }
                    }
                }
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                c79123gJ.A04.A08((C51282Xb) entry.getValue(), (C51272Xa) entry.getKey());
            }
            for (Map.Entry entry2 : c79123gJ.A09.entrySet()) {
                C51282Xb c51282Xb2 = (C51282Xb) entry2.getValue();
                C51282Xb c51282Xb3 = new C51282Xb();
                short s = c51282Xb2.A00;
                for (int i3 = 0; i3 < s; i3++) {
                    c51282Xb3.A03(c51282Xb2.A01(i3), ((C3h4) c51282Xb2.A01[c51282Xb2.A01(i3)]).A04);
                }
                c79123gJ.A04.A08(c51282Xb3, (C51272Xa) entry2.getKey());
            }
            c1ll.ASb();
        }
        if (A08(c79123gJ.A01, c79123gJ) && c79123gJ.A03 != null) {
            C51482Xv c51482Xv = c79123gJ.A04;
            C1LL c1ll2 = c51482Xv.A07;
            c1ll2.ADO("runTransitions");
            Map map = c51482Xv.A0B;
            for (C107434so c107434so : map.keySet()) {
                float floatValue = ((Number) map.get(c107434so)).floatValue();
                C51282Xb c51282Xb4 = ((C42R) c51482Xv.A02.A02.get(c107434so.A00)).A02;
                if (c51282Xb4 != null) {
                    InterfaceC79483gv interfaceC79483gv = c107434so.A01;
                    short s2 = c51282Xb4.A00;
                    for (int i4 = 0; i4 < s2; i4++) {
                        interfaceC79483gv.EOy(c51282Xb4.A01[c51282Xb4.A01(i4)], floatValue);
                    }
                }
            }
            map.clear();
            AbstractC107474ss abstractC107474ss = c51482Xv.A00;
            if (abstractC107474ss != null) {
                abstractC107474ss.A01.add(c51482Xv.A03);
                c51482Xv.A00.A09(c51482Xv.A05);
                c51482Xv.A00 = null;
            }
            c1ll2.ASb();
        }
        C75793ak c75793ak = c79123gJ.A01.A0H.A02.A03;
        if (c75793ak != null) {
            c75793ak.A03.EUa(false);
        }
        C50882Vk c50882Vk2 = c79123gJ.A01;
        c79123gJ.A02 = c50882Vk2;
        c79123gJ.A05 = false;
        c79123gJ.A00 = c50882Vk2.A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C2X8
    public final void D0L(C2WC c2wc, C79073gE c79073gE, Object obj, Object obj2, boolean z) {
        C50882Vk c50882Vk = ((C79123gJ) c79073gE.A02).A01;
        if (c50882Vk != null && c50882Vk.A0H.A02.A02.A01.A0M) {
            long A0H = c2wc.A0H();
            java.util.Set set = c79073gE.A03;
            Long valueOf = Long.valueOf(A0H);
            if (set.contains(valueOf) && c50882Vk.A0Z.contains(valueOf)) {
                AbstractC79383gk.A02(null);
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(obj);
                while (!arrayDeque.isEmpty()) {
                    View view = (View) arrayDeque.pop();
                    if (view instanceof InterfaceC51062Wc) {
                        ((InterfaceC51062Wc) view).Ctc(new Rect(0, 0, view.getWidth(), view.getHeight()), false);
                    } else if (view instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view;
                        int childCount = viewGroup.getChildCount();
                        while (true) {
                            childCount--;
                            if (childCount >= 0) {
                                arrayDeque.push(viewGroup.getChildAt(childCount));
                            }
                        }
                    }
                }
            }
        }
    }

    public C51352Xi(String str) {
        this.A00 = str;
    }

    public static void A02(C50882Vk c50882Vk, C79073gE c79073gE, int i, boolean z) {
        List list;
        int A00 = A00(c50882Vk, i);
        int i2 = i;
        while (true) {
            list = c50882Vk.A0Q;
            if (i2 > A00) {
                break;
            }
            long A0H = ((RenderTreeNode) list.get(i2)).A06.A0H();
            boolean contains = c79073gE.A03.contains(Long.valueOf(A0H));
            if (z) {
                if (!contains) {
                    c79073gE.A01(A0H, false);
                }
            } else if (contains) {
                c79073gE.A02(A0H, false);
            }
            i2++;
        }
        RenderTreeNode renderTreeNode = (RenderTreeNode) list.get(i);
        while (true) {
            renderTreeNode = renderTreeNode.A05;
            if (renderTreeNode != null && renderTreeNode.A05 != null) {
                long A0H2 = renderTreeNode.A06.A0H();
                boolean contains2 = c79073gE.A03.contains(Long.valueOf(A0H2));
                if (z) {
                    if (!contains2) {
                        c79073gE.A01(A0H2, false);
                    }
                } else if (contains2) {
                    c79073gE.A02(A0H2, false);
                }
            } else {
                return;
            }
        }
    }

    @Override // X.C2X7
    public final void A0E(C79073gE c79073gE) {
        A05(c79073gE);
        c79073gE.A00();
        ((C79123gJ) c79073gE.A02).A00 = -1;
    }

    @Override // X.C2X7
    public final void A0D(C79073gE c79073gE) {
        c79073gE.A00();
    }
}
