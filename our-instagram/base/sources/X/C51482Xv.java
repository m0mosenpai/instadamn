package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Xv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51482Xv {
    public AbstractC107474ss A00;
    public final C42L A06;
    public final C1LL A07;
    public final String A08;
    public final Map A0A = new HashMap();
    public final C51492Xw A02 = new C51492Xw();
    public final C005101q A01 = new C005101q();
    public final Map A0B = new HashMap();
    public final ArrayList A09 = new ArrayList();
    public final C42M A04 = new C42M(this);
    public final C42O A03 = new C42N() { // from class: X.42O
        @Override // X.C42N
        public final void DiR(AbstractC107474ss abstractC107474ss) {
        }

        @Override // X.C42N
        public final boolean Ejs(AbstractC107474ss abstractC107474ss) {
            return true;
        }

        @Override // X.C42N
        public final void D1y(AbstractC107474ss abstractC107474ss) {
            C51482Xv.this.A09.remove(abstractC107474ss);
        }

        @Override // X.C42N
        public final void DH4(AbstractC107474ss abstractC107474ss) {
            C51482Xv.this.A09.remove(abstractC107474ss);
        }

        @Override // X.C42N
        public final void E24(AbstractC107474ss abstractC107474ss) {
            C51482Xv.this.A09.add(abstractC107474ss);
        }
    };
    public final C42P A05 = new C42Q() { // from class: X.42P
        @Override // X.C42Q
        public final C107564t1 Abp(C107434so c107434so) {
            return ((C107424sn) ((C42R) C51482Xv.this.A02.A02.get(c107434so.A00)).A07.get(c107434so.A01)).A01;
        }

        @Override // X.C42Q
        public final float Aur(C107434so c107434so) {
            C51282Xb c51282Xb;
            InterfaceC79483gv interfaceC79483gv = c107434so.A01;
            C42R c42r = (C42R) C51482Xv.this.A02.A02.get(c107434so.A00);
            C107424sn c107424sn = (C107424sn) c42r.A07.get(interfaceC79483gv);
            if (c107424sn != null) {
                return ((AbstractC107574t2) c107424sn.A01).A00;
            }
            if (c42r.A00 == 0) {
                c51282Xb = c42r.A03;
            } else {
                c51282Xb = c42r.A01;
            }
            if (c51282Xb != null) {
                return interfaceC79483gv.AX6((C51292Xc) c51282Xb.A02());
            }
            throw new RuntimeException("Both LayoutOutputs were null!");
        }
    };
    public final Map A0C = new LinkedHashMap();

    public static void A05(C51282Xb c51282Xb, C51482Xv c51482Xv, boolean z) {
        Object obj = c51282Xb.A01[3];
        if (obj instanceof View) {
            c51482Xv.A02((View) obj, z);
        }
    }

    public static AbstractC107474ss A00(AbstractC51432Xq abstractC51432Xq, C51482Xv c51482Xv) {
        Object obj;
        Map map;
        C51272Xa c51272Xa;
        C51272Xa c51272Xa2;
        if (abstractC51432Xq instanceof C89883zU) {
            C89883zU c89883zU = (C89883zU) abstractC51432Xq;
            C89873zT c89873zT = c89883zU.A02;
            ArrayList arrayList = new ArrayList();
            C89833zP c89833zP = c89873zT.A00;
            switch (c89833zP.A00.intValue()) {
                case 1:
                    obj = c89833zP.A01;
                    map = (Map) c51482Xv.A02.A03.get(c89883zU.A01);
                    if (map == null) {
                        c51272Xa = null;
                        c51482Xv.A06(c89883zU, c51272Xa, arrayList);
                        break;
                    }
                    c51272Xa = (C51272Xa) map.get(obj);
                    c51482Xv.A06(c89883zU, c51272Xa, arrayList);
                case 2:
                    String[] strArr = (String[]) c89833zP.A01;
                    String str = c89883zU.A01;
                    for (String str2 : strArr) {
                        Map map2 = (Map) c51482Xv.A02.A03.get(str);
                        if (map2 != null && (c51272Xa2 = (C51272Xa) map2.get(str2)) != null) {
                            c51482Xv.A06(c89883zU, c51272Xa2, arrayList);
                        }
                    }
                    break;
                case 3:
                    obj = c89833zP.A01;
                    map = c51482Xv.A02.A01;
                    c51272Xa = (C51272Xa) map.get(obj);
                    c51482Xv.A06(c89883zU, c51272Xa, arrayList);
                    break;
                case 4:
                    for (String str3 : (String[]) c89833zP.A01) {
                        C51272Xa c51272Xa3 = (C51272Xa) c51482Xv.A02.A01.get(str3);
                        if (c51272Xa3 != null) {
                            c51482Xv.A06(c89883zU, c51272Xa3, arrayList);
                        }
                    }
                    break;
                default:
                    Map map3 = c51482Xv.A02.A02;
                    for (C51272Xa c51272Xa4 : map3.keySet()) {
                        if (((C42R) map3.get(c51272Xa4)).A05) {
                            c51482Xv.A06(c89883zU, c51272Xa4, arrayList);
                        }
                    }
                    break;
            }
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    return (AbstractC107474ss) arrayList.get(0);
                }
                return new C107584t3(0, arrayList);
            }
            return null;
        }
        if (abstractC51432Xq instanceof AbstractC51462Xt) {
            AbstractC51462Xt abstractC51462Xt = (AbstractC51462Xt) abstractC51432Xq;
            ArrayList arrayList2 = abstractC51462Xt.A00;
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                AbstractC107474ss A00 = A00((AbstractC51432Xq) arrayList2.get(i), c51482Xv);
                if (A00 != null) {
                    arrayList3.add(A00);
                }
            }
            if (!arrayList3.isEmpty()) {
                return abstractC51462Xt.A03(arrayList3);
            }
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unhandled Transition type: ");
        sb.append(abstractC51432Xq);
        throw new RuntimeException(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        if (r8.A04 != false) goto L16;
     */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.4sn, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private X.AbstractC107464sr A01(X.C89883zU r11, X.C51272Xa r12, X.InterfaceC79483gv r13) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51482Xv.A01(X.3zU, X.2Xa, X.3gv):X.4sr");
    }

    private void A02(View view, boolean z) {
        ViewGroup viewGroup;
        boolean z2;
        if (view instanceof C2WS) {
            Map map = this.A0C;
            boolean containsKey = map.containsKey(view);
            if (z) {
                if (containsKey) {
                    viewGroup = (ViewGroup) view;
                    z2 = ((Boolean) map.remove(view)).booleanValue();
                }
            } else {
                if (!containsKey) {
                    ViewGroup viewGroup2 = (ViewGroup) view;
                    map.put(viewGroup2, Boolean.valueOf(viewGroup2.getClipChildren()));
                }
                viewGroup = (ViewGroup) view;
                z2 = false;
            }
            viewGroup.setClipChildren(z2);
        }
        Object parent = view.getParent();
        if (parent instanceof C2WS) {
            A02((View) parent, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(X.C51282Xb r8, X.C51282Xb r9, X.C51272Xa r10, X.C51482Xv r11) {
        /*
            X.2Xw r4 = r11.A02
            java.util.Map r0 = r4.A02
            java.lang.Object r3 = r0.get(r10)
            X.42R r3 = (X.C42R) r3
            if (r3 != 0) goto L26
            X.42R r3 = new X.42R
            r3.<init>()
            java.lang.Object r0 = r0.put(r10, r3)
            if (r0 != 0) goto L26
            int r1 = r10.A00
            r0 = 1
            if (r1 == r0) goto L47
            r0 = 2
            if (r1 == r0) goto L32
            java.util.Map r0 = r4.A00
        L21:
            java.lang.String r1 = r10.A02
            r0.put(r1, r10)
        L26:
            if (r8 != 0) goto L4a
            if (r9 != 0) goto L4a
            java.lang.String r1 = "Both current and next LayoutOutput groups were null!"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L32:
            java.lang.String r2 = r10.A01
            java.util.Map r1 = r4.A03
            java.lang.Object r0 = r1.get(r2)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L21
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.put(r2, r0)
            goto L21
        L47:
            java.util.Map r0 = r4.A01
            goto L21
        L4a:
            r7 = 1
            if (r8 != 0) goto L8d
            if (r9 == 0) goto L92
            r0 = 0
        L50:
            r3.A00 = r0
        L52:
            r3.A01 = r8
            r3.A03 = r9
            r6 = 0
            if (r9 == 0) goto L8b
            java.lang.Object r5 = r9.A02()
            X.2Xc r5 = (X.C51292Xc) r5
        L5f:
            java.util.Map r4 = r3.A07
            java.util.Set r0 = r4.keySet()
            java.util.Iterator r2 = r0.iterator()
        L69:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La0
            java.lang.Object r0 = r2.next()
            X.3gv r0 = (X.InterfaceC79483gv) r0
            java.lang.Object r1 = r4.get(r0)
            X.4sn r1 = (X.C107424sn) r1
            if (r5 != 0) goto L80
            r1.A03 = r6
            goto L69
        L80:
            float r0 = r0.AX6(r5)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.A03 = r0
            goto L69
        L8b:
            r5 = r6
            goto L5f
        L8d:
            if (r9 == 0) goto L92
            r3.A00 = r7
            goto L52
        L92:
            int r0 = r3.A00
            if (r0 == 0) goto L98
            if (r0 != r7) goto L9e
        L98:
            boolean r0 = r3.A04
            if (r0 != 0) goto L9e
            r3.A06 = r7
        L9e:
            r0 = 2
            goto L50
        La0:
            r3.A05 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51482Xv.A03(X.2Xb, X.2Xb, X.2Xa, X.2Xv):void");
    }

    public static void A04(C51282Xb c51282Xb, C42R c42r, C51482Xv c51482Xv) {
        C51282Xb c51282Xb2 = c42r.A02;
        if (c51282Xb2 == null) {
            if (c51282Xb == null) {
                return;
            }
        } else if (c51282Xb2.equals(c51282Xb)) {
            return;
        }
        Map map = c42r.A07;
        if (c42r.A02 != null) {
            for (InterfaceC79483gv interfaceC79483gv : map.keySet()) {
                C51282Xb c51282Xb3 = c42r.A02;
                short s = c51282Xb3.A00;
                for (int i = 0; i < s; i++) {
                    interfaceC79483gv.EJZ(c51282Xb3.A01[c51282Xb3.A01(i)]);
                }
            }
            A05(c42r.A02, c51482Xv, true);
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            C107564t1 c107564t1 = ((C107424sn) it.next()).A01;
            C107564t1.A00(c51282Xb, c107564t1);
            C107564t1.A01(c107564t1, ((AbstractC107574t2) c107564t1).A00);
        }
        if (c51282Xb != null) {
            A05(c51282Xb, c51482Xv, false);
        }
        c42r.A02 = c51282Xb;
    }

    private void A06(C89883zU c89883zU, C51272Xa c51272Xa, ArrayList arrayList) {
        C89843zQ c89843zQ = c89883zU.A02.A01;
        int intValue = c89843zQ.A00.intValue();
        int i = 0;
        if (intValue != 2) {
            if (intValue != 0) {
                AbstractC107464sr A01 = A01(c89883zU, c51272Xa, (InterfaceC79483gv) c89843zQ.A01);
                if (A01 != null) {
                    arrayList.add(A01);
                    return;
                }
                return;
            }
            InterfaceC79483gv[] interfaceC79483gvArr = (InterfaceC79483gv[]) c89843zQ.A01;
            while (i < interfaceC79483gvArr.length) {
                AbstractC107464sr A012 = A01(c89883zU, c51272Xa, interfaceC79483gvArr[i]);
                if (A012 != null) {
                    arrayList.add(A012);
                }
                i++;
            }
            return;
        }
        while (true) {
            InterfaceC79483gv[] interfaceC79483gvArr2 = AbstractC79463gt.A06;
            if (i >= 4) {
                return;
            }
            AbstractC107464sr A013 = A01(c89883zU, c51272Xa, interfaceC79483gvArr2[i]);
            if (A013 != null) {
                arrayList.add(A013);
            }
            i++;
        }
    }

    public static void A07(C42R c42r) {
        if (c42r.A01 != null) {
            c42r.A01 = null;
        }
        if (c42r.A03 != null) {
            c42r.A03 = null;
        }
    }

    public final void A08(C51282Xb c51282Xb, C51272Xa c51272Xa) {
        C42R c42r = (C42R) this.A02.A02.get(c51272Xa);
        if (c42r != null) {
            A04(c51282Xb, c42r, this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.42O] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.42P] */
    public C51482Xv(C42L c42l, C1LL c1ll, String str) {
        this.A06 = c42l;
        this.A08 = str;
        this.A07 = c1ll;
    }
}
