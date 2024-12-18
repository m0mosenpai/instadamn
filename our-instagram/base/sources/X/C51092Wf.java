package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.litho.ComponentHost;
import com.facebook.rendercore.RenderTreeNode;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.2Wf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C51092Wf {
    public C51352Xi A00;
    public C79063gD A01;
    public C79243gV A02;
    public boolean A03;
    public boolean A04;
    public final Context A05;
    public final C003501a A06 = new C003501a(10);
    public final C2WS A07;
    public final C1LL A08;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A05(C51092Wf c51092Wf, long j) {
        boolean z;
        C003501a c003501a = c51092Wf.A06;
        C3h4 c3h4 = (C3h4) c003501a.A05(j);
        if (c3h4 != null) {
            C1LL c1ll = c51092Wf.A08;
            boolean isTracing = c1ll.isTracing();
            RenderTreeNode renderTreeNode = c3h4.A01;
            C2WC c2wc = renderTreeNode.A06;
            C14360o3.A0C(c2wc, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit<kotlin.Any>");
            Object obj = c3h4.A04;
            if (c51092Wf.A00 != null) {
                C79063gD c79063gD = c51092Wf.A01;
                if (c79063gD != null) {
                    C79073gE c79073gE = c79063gD.A01;
                    if (c79073gE != null) {
                        z = ((C79123gJ) c79073gE.A02).A0A.containsKey(c3h4.A01.A06);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                z = false;
            }
            Integer A01 = AbstractC50692Uq.A01("RenderCore.RenderUnit.Unmounted");
            if (A01 != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("renderUnitId", Long.valueOf(j));
                hashMap.put(DevServerEntity.COLUMN_DESCRIPTION, c2wc.A04());
                hashMap.put("bounds", renderTreeNode.A03);
                hashMap.put("rootHostHashCode", Integer.valueOf(c51092Wf.A07.hashCode()));
                hashMap.put("key", c2wc.A03());
                int intValue = A01.intValue();
                C79243gV c79243gV = c51092Wf.A02;
                if (c79243gV != null) {
                    AbstractC50692Uq.A05("RenderCore.RenderUnit.Unmounted", String.valueOf(c79243gV.A00), hashMap, intValue);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            if (isTracing) {
                c1ll.ADO(AnonymousClass001.A0R("UnmountItem: ", c2wc.A04()));
            }
            InterfaceC09390do interfaceC09390do = renderTreeNode.A08;
            if (((List) interfaceC09390do.getValue()).size() > 0) {
                for (int size = ((List) interfaceC09390do.getValue()).size() - 1; -1 < size; size--) {
                    A05(c51092Wf, ((RenderTreeNode) ((List) interfaceC09390do.getValue()).get(size)).A06.A0H());
                }
                if (!z) {
                    C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.rendercore.Host");
                    if (((C2WS) obj).getMountItemCount() > 0) {
                        throw new IllegalStateException("Recursively unmounting items from a ComponentHost, left some items behind maybe because not tracked by its MountState");
                    }
                }
            }
            long A0H = c2wc.A0H();
            if (A0H == 0) {
                C3h4 c3h42 = (C3h4) c003501a.A05(0L);
                if (c3h42 != null) {
                    if (c3h42.A02) {
                        A03(c3h42, c51092Wf);
                    }
                    c003501a.A08(0L);
                    C79243gV c79243gV2 = c51092Wf.A02;
                    if (c79243gV2 != null) {
                        RenderTreeNode renderTreeNode2 = c79243gV2.A03;
                        C2WC c2wc2 = renderTreeNode2.A06;
                        C14360o3.A0C(c2wc2, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit<kotlin.Any>");
                        A00(c3h42.A03, c51092Wf, renderTreeNode2, c2wc2, c3h42.A04);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            } else {
                c003501a.A08(A0H);
                C2WS c2ws = c3h4.A00;
                if (z) {
                    if (c51092Wf.A00 != null) {
                        C79063gD c79063gD2 = c51092Wf.A01;
                        if (c79063gD2 != null) {
                            C79073gE c79073gE2 = c79063gD2.A01;
                            if (c79073gE2 != null) {
                                C79123gJ c79123gJ = (C79123gJ) c79073gE2.A02;
                                C51292Xc c51292Xc = (C51292Xc) c79123gJ.A0A.get(c3h4.A01.A06);
                                C51282Xb c51282Xb = (C51282Xb) c79123gJ.A09.get(c51292Xc.A04);
                                if (c51282Xb != null) {
                                    if (c51282Xb.A01[c51292Xc.A00] != null && c2ws != 0) {
                                        ComponentHost componentHost = (ComponentHost) ((InterfaceC51042Wa) c2ws);
                                        C005101q c005101q = componentHost.A0M;
                                        int A012 = c005101q.A01(c005101q.A02(c3h4));
                                        if (obj instanceof Drawable) {
                                            C51442Xr.A00(componentHost.A0L, componentHost.A03, A012);
                                        } else if (obj instanceof View) {
                                            C51442Xr.A00(componentHost.A0N, componentHost.A05, A012);
                                            componentHost.A0H = true;
                                            ComponentHost.A0H(componentHost, c3h4, A012);
                                        }
                                        C51442Xr.A00(c005101q, componentHost.A04, A012);
                                        ComponentHost.A0E(componentHost);
                                        ArrayList arrayList = componentHost.A0D;
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            componentHost.A0D = arrayList;
                                        }
                                        arrayList.add(c3h4);
                                        c3h4.A00 = null;
                                        c79123gJ.A08.put(c3h4, c2ws);
                                    }
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    if (isTracing) {
                        c1ll.ADO(AnonymousClass001.A0R("UnmountItem:remove: ", c2wc.A04()));
                    }
                    if (c2ws != 0) {
                        c2ws.A0M(c3h4);
                    }
                    if (isTracing) {
                        c1ll.ASb();
                    }
                    if (c3h4.A02) {
                        if (isTracing) {
                            c1ll.ADO(AnonymousClass001.A0R("UnmountItem:unbind: ", c2wc.A04()));
                        }
                        A03(c3h4, c51092Wf);
                        if (isTracing) {
                            c1ll.ASb();
                        }
                    }
                    if (obj instanceof View) {
                        ((View) obj).setPadding(0, 0, 0, 0);
                    }
                    if (isTracing) {
                        c1ll.ADO(AnonymousClass001.A0R("UnmountItem:unmount: ", c2wc.A04()));
                    }
                    A00(c3h4.A03, c51092Wf, renderTreeNode, c2wc, obj);
                    if (isTracing) {
                        c1ll.ASb();
                    }
                    c3h4.A00(c51092Wf.A05);
                }
            }
            if (isTracing) {
                c1ll.ASb();
            }
            if (A01 != null) {
                int intValue2 = A01.intValue();
                C16920sk c16920sk = C16920sk.A00;
                C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                AbstractC50692Uq.A03(intValue2, c16920sk);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if ((r6 instanceof X.C79083gF) != false) goto L12;
     */
    @kotlin.Deprecated(message = "Only used for Litho's integration. Marked for removal.")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C79073gE A09(X.C2X7 r6) {
        /*
            r5 = this;
            r4 = 0
            X.3gD r3 = r5.A01
            if (r3 != 0) goto Le
            X.1LL r0 = r5.A08
            X.3gD r3 = new X.3gD
            r3.<init>(r5, r0)
            r5.A01 = r3
        Le:
            java.lang.Object r0 = r6.A0A()
            X.3gE r2 = new X.3gE
            r2.<init>(r3, r6, r0)
            boolean r0 = r6 instanceof X.C51352Xi
            if (r0 == 0) goto L27
            X.2Wf r1 = r3.A06
            r0 = r6
            X.2Xi r0 = (X.C51352Xi) r0
            X.C14360o3.A0B(r0, r4)
            r1.A00 = r0
            r3.A01 = r2
        L27:
            boolean r0 = r3.A03
            if (r0 != 0) goto L30
            boolean r1 = r6 instanceof X.C79083gF
            r0 = 0
            if (r1 == 0) goto L31
        L30:
            r0 = 1
        L31:
            r3.A03 = r0
            java.util.List r0 = r3.A08
            r0.add(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51092Wf.A09(X.2X7):X.3gE");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v4, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List, java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v8, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public void A0G(RenderTreeNode renderTreeNode) {
        C1LL c1ll;
        boolean isTracing;
        C2WC c2wc;
        C003501a c003501a;
        Object A05;
        C14360o3.A0B(renderTreeNode, 0);
        C2WC c2wc2 = renderTreeNode.A06;
        long A0H = c2wc2.A0H();
        if (A0H == 0) {
            A06(renderTreeNode);
            return;
        }
        String str = "RenderCore.RenderUnit.Mounted";
        java.util.Set set = AbstractC50692Uq.A00;
        if (set.isEmpty()) {
            c1ll = this.A08;
            isTracing = c1ll.isTracing();
            if (isTracing) {
                c1ll.ADO(AnonymousClass001.A0R("MountItem: ", c2wc2.A04()));
            }
            RenderTreeNode renderTreeNode2 = renderTreeNode.A05;
            if (renderTreeNode2 != null) {
                c2wc = renderTreeNode2.A06;
                if (isTracing) {
                    c1ll.ADO(AnonymousClass001.A0R("MountItem:mount-parent ", c2wc.A04()));
                }
                A07(renderTreeNode2, c2wc);
                if (isTracing) {
                    c1ll.ASb();
                }
                c003501a = this.A06;
                A05 = c003501a.A05(c2wc.A0H());
                if (A05 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            ?? r10 = 0;
            for (Object obj : set) {
                String[] strArr = ((AbstractC50682Uo) obj).A00;
                if (AbstractC009903n.A0O("RenderCore.RenderUnit.Mounted", strArr) || AbstractC009903n.A0O("*", strArr)) {
                    if (r10 == 0) {
                        r10 = new ArrayList();
                    }
                    r10.add(obj);
                }
            }
            if (r10 == 0) {
                r10 = C16930sl.A00;
            }
            if (r10.isEmpty()) {
                c1ll = this.A08;
                isTracing = c1ll.isTracing();
                if (isTracing) {
                    c1ll.ADO(AnonymousClass001.A0R("MountItem: ", c2wc2.A04()));
                }
                RenderTreeNode renderTreeNode3 = renderTreeNode.A05;
                if (renderTreeNode3 != null) {
                    c2wc = renderTreeNode3.A06;
                    if (isTracing) {
                        c1ll.ADO(AnonymousClass001.A0R("MountItem:mount-parent ", c2wc.A04()));
                    }
                    A07(renderTreeNode3, c2wc);
                    if (isTracing) {
                        c1ll.ASb();
                    }
                    c003501a = this.A06;
                    A05 = c003501a.A05(c2wc.A0H());
                    if (A05 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                ?? r2 = 0;
                for (Object obj2 : r10) {
                    if (obj2 instanceof C60540R6d) {
                        if (r2 == 0) {
                            r2 = new ArrayList();
                        }
                        r2.add(obj2);
                    }
                }
                if (r2 == 0) {
                    r2 = C16930sl.A00;
                }
                C14360o3.A0C(r2, "null cannot be cast to non-null type kotlin.collections.List<com.facebook.rendercore.debug.TraceListener<kotlin.Any?>>");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("renderUnitId", Long.valueOf(A0H));
                linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, c2wc2.A04());
                linkedHashMap.put("bounds", renderTreeNode.A03);
                linkedHashMap.put("rootHostHashCode", Integer.valueOf(this.A07.hashCode()));
                linkedHashMap.put("key", c2wc2.A03());
                ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(r2, 10));
                Iterator it = r2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C60540R6d) it.next()).A01("RenderCore.RenderUnit.Mounted"));
                }
                long currentTimeMillis = System.currentTimeMillis();
                long nanoTime = System.nanoTime();
                C1LL c1ll2 = this.A08;
                boolean isTracing2 = c1ll2.isTracing();
                if (isTracing2) {
                    c1ll2.ADO(AnonymousClass001.A0R("MountItem: ", c2wc2.A04()));
                }
                RenderTreeNode renderTreeNode4 = renderTreeNode.A05;
                if (renderTreeNode4 != null) {
                    C2WC c2wc3 = renderTreeNode4.A06;
                    if (isTracing2) {
                        c1ll2.ADO(AnonymousClass001.A0R("MountItem:mount-parent ", c2wc3.A04()));
                    }
                    A07(renderTreeNode4, c2wc3);
                    if (isTracing2) {
                        c1ll2.ASb();
                    }
                    C003501a c003501a2 = this.A06;
                    Object A052 = c003501a2.A05(c2wc3.A0H());
                    if (A052 != null) {
                        Object obj3 = ((C3h4) A052).A04;
                        AbstractC79583h9.A00(c2wc2, c2wc3, obj3);
                        C14360o3.A0C(obj3, "null cannot be cast to non-null type com.facebook.rendercore.Host");
                        C2WS c2ws = (C2WS) obj3;
                        if (isTracing2) {
                            c1ll2.ADO(AnonymousClass001.A0R("MountItem:acquire-content ", c2wc2.A04()));
                        }
                        Object A01 = C51382Xl.A01(this.A05, c2wc2.A0I());
                        if (isTracing2) {
                            c1ll2.ASb();
                        }
                        C79063gD c79063gD = this.A01;
                        if (c79063gD != null) {
                            c79063gD.A03();
                        }
                        if (isTracing2) {
                            c1ll2.ADO(AnonymousClass001.A0R("MountItem:mount ", c2wc2.A04()));
                        }
                        C3h4 c3h4 = new C3h4(renderTreeNode, A01);
                        A01(c3h4.A03, renderTreeNode, c2wc2, A01);
                        c003501a2.A09(A0H, c3h4);
                        c2ws.A0N(c3h4, renderTreeNode.A02);
                        if (isTracing2) {
                            c1ll2.ASb();
                            c1ll2.ADO(AnonymousClass001.A0R("MountItem:bind ", c2wc2.A04()));
                        }
                        A02(c3h4);
                        if (isTracing2) {
                            c1ll2.ASb();
                            c1ll2.ADO(AnonymousClass001.A0R("MountItem:applyBounds ", c2wc2.A04()));
                        }
                        Object obj4 = c3h4.A04;
                        boolean A012 = AbstractC79663hH.A01(renderTreeNode, c1ll2, obj4, true);
                        if (isTracing2) {
                            c1ll2.ASb();
                            c1ll2.ADO(AnonymousClass001.A0R("MountItem:after ", c2wc2.A04()));
                        }
                        C79063gD c79063gD2 = this.A01;
                        if (c79063gD2 != null) {
                            c79063gD2.A06(renderTreeNode, c1ll2, obj4, A012);
                        }
                        C79063gD c79063gD3 = this.A01;
                        if (c79063gD3 != null) {
                            c79063gD3.A02();
                        }
                        if (isTracing2) {
                            c1ll2.ASb();
                            c1ll2.ASb();
                        }
                        long nanoTime2 = System.nanoTime();
                        C79243gV c79243gV = this.A02;
                        if (c79243gV != null) {
                            R6Z r6z = new R6Z(str, String.valueOf(c79243gV.A00), linkedHashMap, currentTimeMillis, nanoTime2 - nanoTime);
                            int i = 0;
                            for (Object obj5 : r2) {
                                int i2 = i + 1;
                                if (i < 0) {
                                    AbstractC16960so.A1U();
                                    throw C00O.createAndThrow();
                                }
                                ((C60540R6d) obj5).A02(r6z, arrayList.get(i));
                                i = i2;
                            }
                            Iterator it2 = r10.iterator();
                            while (it2.hasNext()) {
                                ((AbstractC50682Uo) it2.next()).A00(r6z);
                            }
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
        Object obj6 = ((C3h4) A05).A04;
        AbstractC79583h9.A00(c2wc2, c2wc, obj6);
        C14360o3.A0C(obj6, "null cannot be cast to non-null type com.facebook.rendercore.Host");
        C2WS c2ws2 = (C2WS) obj6;
        if (isTracing) {
            c1ll.ADO(AnonymousClass001.A0R("MountItem:acquire-content ", c2wc2.A04()));
        }
        Object A013 = C51382Xl.A01(this.A05, c2wc2.A0I());
        if (isTracing) {
            c1ll.ASb();
        }
        C79063gD c79063gD4 = this.A01;
        if (c79063gD4 != null) {
            c79063gD4.A03();
        }
        if (isTracing) {
            c1ll.ADO(AnonymousClass001.A0R("MountItem:mount ", c2wc2.A04()));
        }
        C3h4 c3h42 = new C3h4(renderTreeNode, A013);
        A01(c3h42.A03, renderTreeNode, c2wc2, A013);
        c003501a.A09(A0H, c3h42);
        c2ws2.A0N(c3h42, renderTreeNode.A02);
        if (isTracing) {
            c1ll.ASb();
            c1ll.ADO(AnonymousClass001.A0R("MountItem:bind ", c2wc2.A04()));
        }
        A02(c3h42);
        if (isTracing) {
            c1ll.ASb();
            StringBuilder sb = new StringBuilder();
            sb.append("MountItem:applyBounds ");
            sb.append(c2wc2.A04());
            c1ll.ADO(sb.toString());
        }
        Object obj7 = c3h42.A04;
        boolean A014 = AbstractC79663hH.A01(renderTreeNode, c1ll, obj7, true);
        if (isTracing) {
            c1ll.ASb();
            c1ll.ADO(AnonymousClass001.A0R("MountItem:after ", c2wc2.A04()));
        }
        C79063gD c79063gD5 = this.A01;
        if (c79063gD5 != null) {
            c79063gD5.A06(renderTreeNode, c1ll, obj7, A014);
        }
        C79063gD c79063gD6 = this.A01;
        if (c79063gD6 != null) {
            c79063gD6.A02();
        }
        if (isTracing) {
            c1ll.ASb();
            c1ll.ASb();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(C3h5 c3h5, C51092Wf c51092Wf, RenderTreeNode renderTreeNode, C2WC c2wc, Object obj) {
        C79063gD c79063gD = c51092Wf.A01;
        if (c79063gD != null) {
            Object obj2 = renderTreeNode.A07;
            C1LL c1ll = c51092Wf.A08;
            c79063gD.A03();
            List list = c79063gD.A08;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj3 = list.get(i);
                C14360o3.A0C(obj3, "null cannot be cast to non-null type com.facebook.rendercore.extensions.ExtensionState<kotlin.Any>");
                C79073gE c79073gE = (C79073gE) obj3;
                C2X7 c2x7 = c79073gE.A01;
                if (c2x7 instanceof C2X8) {
                    boolean isTracing = c1ll.isTracing();
                    if (isTracing) {
                        c1ll.ADO(AnonymousClass001.A0R("Extension:onUnmountItem ", c2x7.A09()));
                    }
                    ((C2X8) c2x7).Dwh(c2wc, c79073gE, obj, obj2);
                    if (isTracing) {
                        c1ll.ASb();
                    }
                }
            }
            c79063gD.A02();
        }
        c2wc.A0B(c51092Wf.A05, c3h5, c51092Wf.A08, obj, renderTreeNode.A07);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void A01(C3h5 c3h5, RenderTreeNode renderTreeNode, C2WC c2wc, Object obj) {
        Integer A01 = AbstractC50692Uq.A01("RenderCore.MountItem.Mount");
        if (A01 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("renderUnitId", Long.valueOf(c2wc.A0H()));
            hashMap.put(DevServerEntity.COLUMN_DESCRIPTION, c2wc.A04());
            hashMap.put("hashCode", Integer.valueOf(obj.hashCode()));
            hashMap.put("bounds", renderTreeNode.A03);
            hashMap.put("key", c2wc.A03());
            int intValue = A01.intValue();
            C79243gV c79243gV = this.A02;
            if (c79243gV != null) {
                AbstractC50692Uq.A05("RenderCore.MountItem.Mount", String.valueOf(c79243gV.A00), hashMap, intValue);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        Context context = this.A05;
        Object obj2 = renderTreeNode.A07;
        C1LL c1ll = this.A08;
        c2wc.A0A(context, c3h5, c1ll, obj, obj2);
        C79063gD c79063gD = this.A01;
        if (c79063gD != null) {
            C14360o3.A0B(obj, 1);
            c79063gD.A03();
            List list = c79063gD.A08;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj3 = list.get(i);
                C14360o3.A0C(obj3, "null cannot be cast to non-null type com.facebook.rendercore.extensions.ExtensionState<kotlin.Any>");
                C79073gE c79073gE = (C79073gE) obj3;
                C2X7 c2x7 = c79073gE.A01;
                if (c2x7 instanceof C2X8) {
                    boolean isTracing = c1ll.isTracing();
                    if (isTracing) {
                        c1ll.ADO(AnonymousClass001.A0R("Extension:onMountItem ", c2x7.A09()));
                    }
                    ((C2X8) c2x7).DTt(c2wc, c79073gE, obj, obj2);
                    if (isTracing) {
                        c1ll.ASb();
                    }
                }
            }
            c79063gD.A02();
        }
        if (A01 != null) {
            int intValue2 = A01.intValue();
            C16920sk c16920sk = C16920sk.A00;
            C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
            AbstractC50692Uq.A03(intValue2, c16920sk);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void A02(C3h4 c3h4) {
        C2WC c2wc = c3h4.A01.A06;
        C14360o3.A0C(c2wc, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit<kotlin.Any>");
        Object obj = c3h4.A04;
        Object obj2 = c3h4.A01.A07;
        Context context = this.A05;
        C3h5 c3h5 = c3h4.A03;
        C1LL c1ll = this.A08;
        c2wc.A08(context, c3h5, c1ll, obj, obj2);
        C79063gD c79063gD = this.A01;
        if (c79063gD != null) {
            c79063gD.A03();
            List list = c79063gD.A08;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj3 = list.get(i);
                C14360o3.A0C(obj3, "null cannot be cast to non-null type com.facebook.rendercore.extensions.ExtensionState<kotlin.Any>");
                C79073gE c79073gE = (C79073gE) obj3;
                C2X7 c2x7 = c79073gE.A01;
                if (c2x7 instanceof C2X8) {
                    boolean isTracing = c1ll.isTracing();
                    if (isTracing) {
                        c1ll.ADO(AnonymousClass001.A0R("Extension:onBindItem ", c2x7.A09()));
                    }
                    ((C2X8) c2x7).CzR(c2wc, c79073gE, obj, obj2);
                    if (isTracing) {
                        c1ll.ASb();
                    }
                }
            }
            c79063gD.A02();
        }
        c3h4.A02 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A03(C3h4 c3h4, C51092Wf c51092Wf) {
        C2WC c2wc = c3h4.A01.A06;
        C14360o3.A0C(c2wc, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit<kotlin.Any>");
        Object obj = c3h4.A04;
        Object obj2 = c3h4.A01.A07;
        C79063gD c79063gD = c51092Wf.A01;
        if (c79063gD != null) {
            C1LL c1ll = c51092Wf.A08;
            c79063gD.A03();
            List list = c79063gD.A08;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj3 = list.get(i);
                C14360o3.A0C(obj3, "null cannot be cast to non-null type com.facebook.rendercore.extensions.ExtensionState<kotlin.Any>");
                C79073gE c79073gE = (C79073gE) obj3;
                C2X7 c2x7 = c79073gE.A01;
                if (c2x7 instanceof C2X8) {
                    boolean isTracing = c1ll.isTracing();
                    if (isTracing) {
                        c1ll.ADO(AnonymousClass001.A0R("Extension:onUnbindItem ", c2x7.A09()));
                    }
                    ((C2X8) c2x7).Dw7(c2wc, c79073gE, obj, obj2);
                    if (isTracing) {
                        c1ll.ASb();
                    }
                }
            }
            c79063gD.A02();
        }
        c2wc.A09(c51092Wf.A05, c3h4.A03, c51092Wf.A08, obj, obj2);
        c3h4.A02 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00dc, code lost:
    
        if (((android.view.View) r14).isLayoutRequested() == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A04(X.C3h4 r18, com.facebook.rendercore.RenderTreeNode r19) {
        /*
            r17 = this;
            r10 = r17
            X.3gD r3 = r10.A01
            X.1LL r2 = r10.A08
            boolean r9 = r2.isTracing()
            r4 = r19
            X.2WC r12 = r4.A06
            java.lang.String r1 = "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit<kotlin.Any>"
            X.C14360o3.A0C(r12, r1)
            java.lang.Object r5 = r4.A07
            r11 = r18
            com.facebook.rendercore.RenderTreeNode r0 = r11.A01
            X.2WC r13 = r0.A06
            X.C14360o3.A0C(r13, r1)
            java.lang.Object r15 = r0.A07
            java.lang.Object r14 = r11.A04
            r11.A01 = r4
            r13.A06()
            if (r3 == 0) goto L2d
            r3.A03()
        L2d:
            boolean r0 = r10.A0I(r13, r12, r15, r5)
            if (r0 == 0) goto Lb4
            java.lang.String r7 = "RenderCore.RenderUnit.Updated"
            java.lang.Integer r8 = X.AbstractC50692Uq.A01(r7)
            if (r8 == 0) goto L8a
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            long r0 = r12.A0H()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "renderUnitId"
            r6.put(r0, r1)
            java.lang.String r1 = r12.A04()
            java.lang.String r0 = "description"
            r6.put(r0, r1)
            android.graphics.Rect r1 = r4.A03
            java.lang.String r0 = "bounds"
            r6.put(r0, r1)
            X.2WS r0 = r10.A07
            int r0 = r0.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "rootHostHashCode"
            r6.put(r0, r1)
            java.lang.String r1 = r12.A03()
            java.lang.String r0 = "key"
            r6.put(r0, r1)
            int r1 = r8.intValue()
            X.3gV r0 = r10.A02
            if (r0 == 0) goto Lf8
            int r0 = r0.A00
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.AbstractC50692Uq.A05(r7, r0, r6, r1)
        L8a:
            if (r9 == 0) goto L99
            java.lang.String r1 = "UpdateItem: "
            java.lang.String r0 = r12.A04()
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)
            r2.ADO(r0)
        L99:
            r16 = r5
            r10.A0E(r11, r12, r13, r14, r15, r16)
            if (r9 == 0) goto La3
            r2.ASb()
        La3:
            if (r8 == 0) goto Lb4
            int r5 = r8.intValue()
            X.0sk r1 = X.C16920sk.A00
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>"
            X.C14360o3.A0C(r1, r0)
            X.AbstractC50692Uq.A03(r5, r1)
        Lb4:
            r0 = 1
            r11.A02 = r0
            if (r9 == 0) goto Lc6
            java.lang.String r1 = "UpdateBounds: "
            java.lang.String r0 = r12.A04()
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)
            r2.ADO(r0)
        Lc6:
            long r7 = r12.A0H()
            r5 = 0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 == 0) goto Lea
            boolean r0 = r14 instanceof android.view.View
            if (r0 == 0) goto Lde
            r0 = r14
            android.view.View r0 = (android.view.View) r0
            boolean r0 = r0.isLayoutRequested()
            r1 = 1
            if (r0 != 0) goto Ldf
        Lde:
            r1 = 0
        Ldf:
            com.facebook.rendercore.RenderTreeNode r0 = r11.A01
            boolean r0 = X.AbstractC79663hH.A01(r0, r2, r14, r1)
            if (r3 == 0) goto Lea
            r3.A06(r4, r2, r14, r0)
        Lea:
            if (r9 == 0) goto Lef
            r2.ASb()
        Lef:
            if (r3 == 0) goto Lf4
            r3.A02()
        Lf4:
            r13.A05()
            return
        Lf8:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51092Wf.A04(X.3h4, com.facebook.rendercore.RenderTreeNode):void");
    }

    private final void A06(RenderTreeNode renderTreeNode) {
        C2WS c2ws = this.A07;
        C3h4 c3h4 = new C3h4(renderTreeNode, c2ws);
        C2WC c2wc = renderTreeNode.A06;
        C14360o3.A0C(c2wc, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit<kotlin.Any>");
        A01(c3h4.A03, renderTreeNode, c2wc, c2ws);
        this.A06.A09(0L, c3h4);
        A02(c3h4);
    }

    public final C3h4 A08(int i) {
        C79243gV c79243gV = this.A02;
        if (c79243gV != null) {
            return (C3h4) this.A06.A05(c79243gV.A05[i].A06.A0H());
        }
        return null;
    }

    public final void A0A() {
        C79243gV c79243gV = this.A02;
        if (c79243gV != null) {
            C1LL c1ll = this.A08;
            boolean isTracing = c1ll.isTracing();
            if (isTracing) {
                c1ll.ADO("MountState.bind");
            }
            for (RenderTreeNode renderTreeNode : c79243gV.A05) {
                C3h4 c3h4 = (C3h4) this.A06.A05(renderTreeNode.A06.A0H());
                if (c3h4 != null && !c3h4.A02) {
                    Object obj = c3h4.A04;
                    A02(c3h4);
                    if ((obj instanceof View) && !(obj instanceof C2WS) && ((View) obj).isLayoutRequested()) {
                        AbstractC79663hH.A01(c3h4.A01, c1ll, obj, true);
                    }
                }
            }
            if (isTracing) {
                c1ll.ASb();
            }
        }
    }

    public final void A0B() {
        C79243gV c79243gV = this.A02;
        if (c79243gV != null) {
            C1LL c1ll = this.A08;
            boolean isTracing = c1ll.isTracing();
            if (isTracing) {
                c1ll.ADO("MountState.unbind");
                c1ll.ADO("MountState.unbindAllContent");
            }
            for (RenderTreeNode renderTreeNode : c79243gV.A05) {
                C3h4 c3h4 = (C3h4) this.A06.A05(renderTreeNode.A06.A0H());
                if (c3h4 != null && c3h4.A02) {
                    A03(c3h4, this);
                }
            }
            if (isTracing) {
                c1ll.ASb();
                c1ll.ADO("MountState.unbindExtensions");
            }
            C79063gD c79063gD = this.A01;
            if (c79063gD != null) {
                c79063gD.A04();
            }
            if (isTracing) {
                c1ll.ASb();
                c1ll.ASb();
            }
        }
    }

    public final void A0C() {
        try {
            C2WS c2ws = this.A07;
            c2ws.A0K();
            if (this.A02 == null) {
                A0D();
            } else {
                C1LL c1ll = this.A08;
                boolean isTracing = c1ll.isTracing();
                if (isTracing) {
                    c1ll.ADO("MountState.unmountAllItems");
                }
                A05(this, 0L);
                A0D();
                if (isTracing) {
                    c1ll.ASb();
                }
                this.A03 = true;
                this.A02 = null;
            }
            c2ws.A0L();
        } catch (Throwable th) {
            this.A07.A0L();
            throw th;
        }
    }

    public final void A0D() {
        C79063gD c79063gD = this.A01;
        if (c79063gD != null) {
            c79063gD.A04();
            c79063gD.A03();
            List list = c79063gD.A08;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C79073gE c79073gE = (C79073gE) list.get(i);
                c79073gE.A01.A0E(c79073gE);
            }
            c79063gD.A02();
            c79063gD.A06.A00 = null;
            c79063gD.A01 = null;
            list.clear();
            c79063gD.A03 = false;
        }
    }

    public void A0E(C3h4 c3h4, C2WC c2wc, C2WC c2wc2, Object obj, Object obj2, Object obj3) {
        Context context = this.A05;
        C79063gD c79063gD = this.A01;
        c2wc.A07(context, c3h4.A03, c79063gD, c2wc2, this.A08, obj, obj2, obj3, c3h4.A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0261 A[Catch: Exception -> 0x0536, all -> 0x0554, TryCatch #1 {Exception -> 0x0536, blocks: (B:35:0x00d5, B:37:0x00db, B:39:0x00e5, B:77:0x018d, B:79:0x0191, B:81:0x0195, B:85:0x019f, B:87:0x01a9, B:89:0x01b0, B:91:0x01c6, B:94:0x01c9, B:95:0x0211, B:99:0x0227, B:101:0x022d, B:102:0x0235, B:104:0x0241, B:108:0x024c, B:109:0x025b, B:111:0x0261, B:114:0x0273, B:116:0x0285, B:120:0x0517, B:121:0x0535, B:125:0x028d, B:126:0x0295, B:129:0x029b, B:131:0x02a1, B:132:0x02a7, B:134:0x02ad, B:136:0x02d4, B:138:0x02da, B:140:0x02de, B:142:0x02e2, B:148:0x0339, B:151:0x0340, B:154:0x02f5, B:156:0x02fb, B:158:0x02ff, B:160:0x030d, B:161:0x0315, B:165:0x031e, B:167:0x0326, B:172:0x0347, B:175:0x034e, B:177:0x032a, B:146:0x0335, B:182:0x0357, B:183:0x035a, B:185:0x0368, B:187:0x036e, B:189:0x0377, B:190:0x037a, B:193:0x0384, B:195:0x038a, B:197:0x0391, B:199:0x039d, B:201:0x03a9, B:203:0x03ba, B:206:0x03bd, B:208:0x03d0, B:212:0x03da, B:215:0x03ea, B:217:0x03ff, B:218:0x03ee, B:221:0x03fc, B:226:0x0403, B:228:0x0407, B:229:0x040f, B:231:0x0413, B:233:0x041f, B:235:0x042d, B:237:0x0432, B:238:0x0435, B:241:0x043d, B:242:0x0442, B:244:0x044d, B:246:0x0455, B:247:0x045d, B:250:0x0465, B:286:0x0372, B:287:0x0507, B:289:0x01cc, B:291:0x01d0, B:293:0x01d4, B:294:0x01db, B:295:0x01e4, B:297:0x01ea, B:300:0x01fa, B:303:0x0209, B:308:0x020f, B:309:0x050f), top: B:34:0x00d5, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x028d A[Catch: Exception -> 0x0536, all -> 0x0554, TryCatch #1 {Exception -> 0x0536, blocks: (B:35:0x00d5, B:37:0x00db, B:39:0x00e5, B:77:0x018d, B:79:0x0191, B:81:0x0195, B:85:0x019f, B:87:0x01a9, B:89:0x01b0, B:91:0x01c6, B:94:0x01c9, B:95:0x0211, B:99:0x0227, B:101:0x022d, B:102:0x0235, B:104:0x0241, B:108:0x024c, B:109:0x025b, B:111:0x0261, B:114:0x0273, B:116:0x0285, B:120:0x0517, B:121:0x0535, B:125:0x028d, B:126:0x0295, B:129:0x029b, B:131:0x02a1, B:132:0x02a7, B:134:0x02ad, B:136:0x02d4, B:138:0x02da, B:140:0x02de, B:142:0x02e2, B:148:0x0339, B:151:0x0340, B:154:0x02f5, B:156:0x02fb, B:158:0x02ff, B:160:0x030d, B:161:0x0315, B:165:0x031e, B:167:0x0326, B:172:0x0347, B:175:0x034e, B:177:0x032a, B:146:0x0335, B:182:0x0357, B:183:0x035a, B:185:0x0368, B:187:0x036e, B:189:0x0377, B:190:0x037a, B:193:0x0384, B:195:0x038a, B:197:0x0391, B:199:0x039d, B:201:0x03a9, B:203:0x03ba, B:206:0x03bd, B:208:0x03d0, B:212:0x03da, B:215:0x03ea, B:217:0x03ff, B:218:0x03ee, B:221:0x03fc, B:226:0x0403, B:228:0x0407, B:229:0x040f, B:231:0x0413, B:233:0x041f, B:235:0x042d, B:237:0x0432, B:238:0x0435, B:241:0x043d, B:242:0x0442, B:244:0x044d, B:246:0x0455, B:247:0x045d, B:250:0x0465, B:286:0x0372, B:287:0x0507, B:289:0x01cc, B:291:0x01d0, B:293:0x01d4, B:294:0x01db, B:295:0x01e4, B:297:0x01ea, B:300:0x01fa, B:303:0x0209, B:308:0x020f, B:309:0x050f), top: B:34:0x00d5, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02a1 A[Catch: Exception -> 0x0536, all -> 0x0554, TryCatch #1 {Exception -> 0x0536, blocks: (B:35:0x00d5, B:37:0x00db, B:39:0x00e5, B:77:0x018d, B:79:0x0191, B:81:0x0195, B:85:0x019f, B:87:0x01a9, B:89:0x01b0, B:91:0x01c6, B:94:0x01c9, B:95:0x0211, B:99:0x0227, B:101:0x022d, B:102:0x0235, B:104:0x0241, B:108:0x024c, B:109:0x025b, B:111:0x0261, B:114:0x0273, B:116:0x0285, B:120:0x0517, B:121:0x0535, B:125:0x028d, B:126:0x0295, B:129:0x029b, B:131:0x02a1, B:132:0x02a7, B:134:0x02ad, B:136:0x02d4, B:138:0x02da, B:140:0x02de, B:142:0x02e2, B:148:0x0339, B:151:0x0340, B:154:0x02f5, B:156:0x02fb, B:158:0x02ff, B:160:0x030d, B:161:0x0315, B:165:0x031e, B:167:0x0326, B:172:0x0347, B:175:0x034e, B:177:0x032a, B:146:0x0335, B:182:0x0357, B:183:0x035a, B:185:0x0368, B:187:0x036e, B:189:0x0377, B:190:0x037a, B:193:0x0384, B:195:0x038a, B:197:0x0391, B:199:0x039d, B:201:0x03a9, B:203:0x03ba, B:206:0x03bd, B:208:0x03d0, B:212:0x03da, B:215:0x03ea, B:217:0x03ff, B:218:0x03ee, B:221:0x03fc, B:226:0x0403, B:228:0x0407, B:229:0x040f, B:231:0x0413, B:233:0x041f, B:235:0x042d, B:237:0x0432, B:238:0x0435, B:241:0x043d, B:242:0x0442, B:244:0x044d, B:246:0x0455, B:247:0x045d, B:250:0x0465, B:286:0x0372, B:287:0x0507, B:289:0x01cc, B:291:0x01d0, B:293:0x01d4, B:294:0x01db, B:295:0x01e4, B:297:0x01ea, B:300:0x01fa, B:303:0x0209, B:308:0x020f, B:309:0x050f), top: B:34:0x00d5, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ad A[Catch: Exception -> 0x0536, all -> 0x0554, TryCatch #1 {Exception -> 0x0536, blocks: (B:35:0x00d5, B:37:0x00db, B:39:0x00e5, B:77:0x018d, B:79:0x0191, B:81:0x0195, B:85:0x019f, B:87:0x01a9, B:89:0x01b0, B:91:0x01c6, B:94:0x01c9, B:95:0x0211, B:99:0x0227, B:101:0x022d, B:102:0x0235, B:104:0x0241, B:108:0x024c, B:109:0x025b, B:111:0x0261, B:114:0x0273, B:116:0x0285, B:120:0x0517, B:121:0x0535, B:125:0x028d, B:126:0x0295, B:129:0x029b, B:131:0x02a1, B:132:0x02a7, B:134:0x02ad, B:136:0x02d4, B:138:0x02da, B:140:0x02de, B:142:0x02e2, B:148:0x0339, B:151:0x0340, B:154:0x02f5, B:156:0x02fb, B:158:0x02ff, B:160:0x030d, B:161:0x0315, B:165:0x031e, B:167:0x0326, B:172:0x0347, B:175:0x034e, B:177:0x032a, B:146:0x0335, B:182:0x0357, B:183:0x035a, B:185:0x0368, B:187:0x036e, B:189:0x0377, B:190:0x037a, B:193:0x0384, B:195:0x038a, B:197:0x0391, B:199:0x039d, B:201:0x03a9, B:203:0x03ba, B:206:0x03bd, B:208:0x03d0, B:212:0x03da, B:215:0x03ea, B:217:0x03ff, B:218:0x03ee, B:221:0x03fc, B:226:0x0403, B:228:0x0407, B:229:0x040f, B:231:0x0413, B:233:0x041f, B:235:0x042d, B:237:0x0432, B:238:0x0435, B:241:0x043d, B:242:0x0442, B:244:0x044d, B:246:0x0455, B:247:0x045d, B:250:0x0465, B:286:0x0372, B:287:0x0507, B:289:0x01cc, B:291:0x01d0, B:293:0x01d4, B:294:0x01db, B:295:0x01e4, B:297:0x01ea, B:300:0x01fa, B:303:0x0209, B:308:0x020f, B:309:0x050f), top: B:34:0x00d5, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0357 A[Catch: Exception -> 0x0536, all -> 0x0554, TryCatch #1 {Exception -> 0x0536, blocks: (B:35:0x00d5, B:37:0x00db, B:39:0x00e5, B:77:0x018d, B:79:0x0191, B:81:0x0195, B:85:0x019f, B:87:0x01a9, B:89:0x01b0, B:91:0x01c6, B:94:0x01c9, B:95:0x0211, B:99:0x0227, B:101:0x022d, B:102:0x0235, B:104:0x0241, B:108:0x024c, B:109:0x025b, B:111:0x0261, B:114:0x0273, B:116:0x0285, B:120:0x0517, B:121:0x0535, B:125:0x028d, B:126:0x0295, B:129:0x029b, B:131:0x02a1, B:132:0x02a7, B:134:0x02ad, B:136:0x02d4, B:138:0x02da, B:140:0x02de, B:142:0x02e2, B:148:0x0339, B:151:0x0340, B:154:0x02f5, B:156:0x02fb, B:158:0x02ff, B:160:0x030d, B:161:0x0315, B:165:0x031e, B:167:0x0326, B:172:0x0347, B:175:0x034e, B:177:0x032a, B:146:0x0335, B:182:0x0357, B:183:0x035a, B:185:0x0368, B:187:0x036e, B:189:0x0377, B:190:0x037a, B:193:0x0384, B:195:0x038a, B:197:0x0391, B:199:0x039d, B:201:0x03a9, B:203:0x03ba, B:206:0x03bd, B:208:0x03d0, B:212:0x03da, B:215:0x03ea, B:217:0x03ff, B:218:0x03ee, B:221:0x03fc, B:226:0x0403, B:228:0x0407, B:229:0x040f, B:231:0x0413, B:233:0x041f, B:235:0x042d, B:237:0x0432, B:238:0x0435, B:241:0x043d, B:242:0x0442, B:244:0x044d, B:246:0x0455, B:247:0x045d, B:250:0x0465, B:286:0x0372, B:287:0x0507, B:289:0x01cc, B:291:0x01d0, B:293:0x01d4, B:294:0x01db, B:295:0x01e4, B:297:0x01ea, B:300:0x01fa, B:303:0x0209, B:308:0x020f, B:309:0x050f), top: B:34:0x00d5, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0368 A[Catch: Exception -> 0x0536, all -> 0x0554, TryCatch #1 {Exception -> 0x0536, blocks: (B:35:0x00d5, B:37:0x00db, B:39:0x00e5, B:77:0x018d, B:79:0x0191, B:81:0x0195, B:85:0x019f, B:87:0x01a9, B:89:0x01b0, B:91:0x01c6, B:94:0x01c9, B:95:0x0211, B:99:0x0227, B:101:0x022d, B:102:0x0235, B:104:0x0241, B:108:0x024c, B:109:0x025b, B:111:0x0261, B:114:0x0273, B:116:0x0285, B:120:0x0517, B:121:0x0535, B:125:0x028d, B:126:0x0295, B:129:0x029b, B:131:0x02a1, B:132:0x02a7, B:134:0x02ad, B:136:0x02d4, B:138:0x02da, B:140:0x02de, B:142:0x02e2, B:148:0x0339, B:151:0x0340, B:154:0x02f5, B:156:0x02fb, B:158:0x02ff, B:160:0x030d, B:161:0x0315, B:165:0x031e, B:167:0x0326, B:172:0x0347, B:175:0x034e, B:177:0x032a, B:146:0x0335, B:182:0x0357, B:183:0x035a, B:185:0x0368, B:187:0x036e, B:189:0x0377, B:190:0x037a, B:193:0x0384, B:195:0x038a, B:197:0x0391, B:199:0x039d, B:201:0x03a9, B:203:0x03ba, B:206:0x03bd, B:208:0x03d0, B:212:0x03da, B:215:0x03ea, B:217:0x03ff, B:218:0x03ee, B:221:0x03fc, B:226:0x0403, B:228:0x0407, B:229:0x040f, B:231:0x0413, B:233:0x041f, B:235:0x042d, B:237:0x0432, B:238:0x0435, B:241:0x043d, B:242:0x0442, B:244:0x044d, B:246:0x0455, B:247:0x045d, B:250:0x0465, B:286:0x0372, B:287:0x0507, B:289:0x01cc, B:291:0x01d0, B:293:0x01d4, B:294:0x01db, B:295:0x01e4, B:297:0x01ea, B:300:0x01fa, B:303:0x0209, B:308:0x020f, B:309:0x050f), top: B:34:0x00d5, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0507 A[Catch: Exception -> 0x0536, all -> 0x0554, TRY_ENTER, TryCatch #1 {Exception -> 0x0536, blocks: (B:35:0x00d5, B:37:0x00db, B:39:0x00e5, B:77:0x018d, B:79:0x0191, B:81:0x0195, B:85:0x019f, B:87:0x01a9, B:89:0x01b0, B:91:0x01c6, B:94:0x01c9, B:95:0x0211, B:99:0x0227, B:101:0x022d, B:102:0x0235, B:104:0x0241, B:108:0x024c, B:109:0x025b, B:111:0x0261, B:114:0x0273, B:116:0x0285, B:120:0x0517, B:121:0x0535, B:125:0x028d, B:126:0x0295, B:129:0x029b, B:131:0x02a1, B:132:0x02a7, B:134:0x02ad, B:136:0x02d4, B:138:0x02da, B:140:0x02de, B:142:0x02e2, B:148:0x0339, B:151:0x0340, B:154:0x02f5, B:156:0x02fb, B:158:0x02ff, B:160:0x030d, B:161:0x0315, B:165:0x031e, B:167:0x0326, B:172:0x0347, B:175:0x034e, B:177:0x032a, B:146:0x0335, B:182:0x0357, B:183:0x035a, B:185:0x0368, B:187:0x036e, B:189:0x0377, B:190:0x037a, B:193:0x0384, B:195:0x038a, B:197:0x0391, B:199:0x039d, B:201:0x03a9, B:203:0x03ba, B:206:0x03bd, B:208:0x03d0, B:212:0x03da, B:215:0x03ea, B:217:0x03ff, B:218:0x03ee, B:221:0x03fc, B:226:0x0403, B:228:0x0407, B:229:0x040f, B:231:0x0413, B:233:0x041f, B:235:0x042d, B:237:0x0432, B:238:0x0435, B:241:0x043d, B:242:0x0442, B:244:0x044d, B:246:0x0455, B:247:0x045d, B:250:0x0465, B:286:0x0372, B:287:0x0507, B:289:0x01cc, B:291:0x01d0, B:293:0x01d4, B:294:0x01db, B:295:0x01e4, B:297:0x01ea, B:300:0x01fa, B:303:0x0209, B:308:0x020f, B:309:0x050f), top: B:34:0x00d5, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x050f A[Catch: Exception -> 0x0536, all -> 0x0554, TryCatch #1 {Exception -> 0x0536, blocks: (B:35:0x00d5, B:37:0x00db, B:39:0x00e5, B:77:0x018d, B:79:0x0191, B:81:0x0195, B:85:0x019f, B:87:0x01a9, B:89:0x01b0, B:91:0x01c6, B:94:0x01c9, B:95:0x0211, B:99:0x0227, B:101:0x022d, B:102:0x0235, B:104:0x0241, B:108:0x024c, B:109:0x025b, B:111:0x0261, B:114:0x0273, B:116:0x0285, B:120:0x0517, B:121:0x0535, B:125:0x028d, B:126:0x0295, B:129:0x029b, B:131:0x02a1, B:132:0x02a7, B:134:0x02ad, B:136:0x02d4, B:138:0x02da, B:140:0x02de, B:142:0x02e2, B:148:0x0339, B:151:0x0340, B:154:0x02f5, B:156:0x02fb, B:158:0x02ff, B:160:0x030d, B:161:0x0315, B:165:0x031e, B:167:0x0326, B:172:0x0347, B:175:0x034e, B:177:0x032a, B:146:0x0335, B:182:0x0357, B:183:0x035a, B:185:0x0368, B:187:0x036e, B:189:0x0377, B:190:0x037a, B:193:0x0384, B:195:0x038a, B:197:0x0391, B:199:0x039d, B:201:0x03a9, B:203:0x03ba, B:206:0x03bd, B:208:0x03d0, B:212:0x03da, B:215:0x03ea, B:217:0x03ff, B:218:0x03ee, B:221:0x03fc, B:226:0x0403, B:228:0x0407, B:229:0x040f, B:231:0x0413, B:233:0x041f, B:235:0x042d, B:237:0x0432, B:238:0x0435, B:241:0x043d, B:242:0x0442, B:244:0x044d, B:246:0x0455, B:247:0x045d, B:250:0x0465, B:286:0x0372, B:287:0x0507, B:289:0x01cc, B:291:0x01d0, B:293:0x01d4, B:294:0x01db, B:295:0x01e4, B:297:0x01ea, B:300:0x01fa, B:303:0x0209, B:308:0x020f, B:309:0x050f), top: B:34:0x00d5, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00db A[Catch: Exception -> 0x0536, all -> 0x0554, TryCatch #1 {Exception -> 0x0536, blocks: (B:35:0x00d5, B:37:0x00db, B:39:0x00e5, B:77:0x018d, B:79:0x0191, B:81:0x0195, B:85:0x019f, B:87:0x01a9, B:89:0x01b0, B:91:0x01c6, B:94:0x01c9, B:95:0x0211, B:99:0x0227, B:101:0x022d, B:102:0x0235, B:104:0x0241, B:108:0x024c, B:109:0x025b, B:111:0x0261, B:114:0x0273, B:116:0x0285, B:120:0x0517, B:121:0x0535, B:125:0x028d, B:126:0x0295, B:129:0x029b, B:131:0x02a1, B:132:0x02a7, B:134:0x02ad, B:136:0x02d4, B:138:0x02da, B:140:0x02de, B:142:0x02e2, B:148:0x0339, B:151:0x0340, B:154:0x02f5, B:156:0x02fb, B:158:0x02ff, B:160:0x030d, B:161:0x0315, B:165:0x031e, B:167:0x0326, B:172:0x0347, B:175:0x034e, B:177:0x032a, B:146:0x0335, B:182:0x0357, B:183:0x035a, B:185:0x0368, B:187:0x036e, B:189:0x0377, B:190:0x037a, B:193:0x0384, B:195:0x038a, B:197:0x0391, B:199:0x039d, B:201:0x03a9, B:203:0x03ba, B:206:0x03bd, B:208:0x03d0, B:212:0x03da, B:215:0x03ea, B:217:0x03ff, B:218:0x03ee, B:221:0x03fc, B:226:0x0403, B:228:0x0407, B:229:0x040f, B:231:0x0413, B:233:0x041f, B:235:0x042d, B:237:0x0432, B:238:0x0435, B:241:0x043d, B:242:0x0442, B:244:0x044d, B:246:0x0455, B:247:0x045d, B:250:0x0465, B:286:0x0372, B:287:0x0507, B:289:0x01cc, B:291:0x01d0, B:293:0x01d4, B:294:0x01db, B:295:0x01e4, B:297:0x01ea, B:300:0x01fa, B:303:0x0209, B:308:0x020f, B:309:0x050f), top: B:34:0x00d5, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0223  */
    /* JADX WARN: Type inference failed for: r24v0, types: [X.3gV, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v35, types: [X.2WS, android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v48, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r2v51, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v49, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r3v52, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v15, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0F(X.C79243gV r24) {
        /*
            Method dump skipped, instructions count: 1539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51092Wf.A0F(X.3gV):void");
    }

    public final void A0H(InterfaceC66812zy interfaceC66812zy) {
        C79063gD c79063gD = this.A01;
        if (c79063gD == null) {
            c79063gD = new C79063gD(this, this.A08);
        }
        c79063gD.A00 = interfaceC66812zy;
        this.A01 = c79063gD;
    }

    public boolean A0I(C2WC c2wc, C2WC c2wc2, Object obj, Object obj2) {
        if (c2wc == c2wc2 && AbstractC78713fd.A04(obj, obj2)) {
            return false;
        }
        return true;
    }

    public C51092Wf(C2WS c2ws, C1LL c1ll) {
        this.A07 = c2ws;
        this.A08 = c1ll;
        Context context = c2ws.getContext();
        C14360o3.A07(context);
        this.A05 = context;
    }

    private final void A07(RenderTreeNode renderTreeNode, C2WC c2wc) {
        if (this.A06.A05(c2wc.A0H()) == null) {
            A0G(renderTreeNode);
        }
    }
}
