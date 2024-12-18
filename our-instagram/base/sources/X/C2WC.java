package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2WC, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2WC {
    public List A00;
    public List A01;
    public Map A02;
    public Map A03;
    public final Integer A04;
    public final List A05;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2WC(java.lang.Integer r2) {
        /*
            r1 = this;
            r0 = 1
            X.C14360o3.A0B(r2, r0)
            X.0sl r0 = X.C16930sl.A00
            r1.<init>(r2, r0, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2WC.<init>(java.lang.Integer):void");
    }

    public void A05() {
    }

    public void A06() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (r7.isEmpty() != false) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A07(android.content.Context r35, X.C3h5 r36, X.C79063gD r37, X.C2WC r38, X.C1LL r39, java.lang.Object r40, java.lang.Object r41, java.lang.Object r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 1318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2WC.A07(android.content.Context, X.3h5, X.3gD, X.2WC, X.1LL, java.lang.Object, java.lang.Object, java.lang.Object, boolean):void");
    }

    public void A08(Context context, C3h5 c3h5, C1LL c1ll, Object obj, Object obj2) {
        C14360o3.A0B(c3h5, 3);
        List list = this.A00;
        if (list != null) {
            boolean isTracing = c1ll.isTracing();
            int size = list.size();
            if (isTracing) {
                c1ll.ADO(AbstractC78293ev.A00(AnonymousClass001.A0R(A04(), ":attach")));
            }
            for (int i = 0; i < size; i++) {
                C77843eC c77843eC = (C77843eC) list.get(i);
                if (isTracing) {
                    c1ll.ADO(AbstractC78293ev.A00(c77843eC.A00.getDescription()));
                }
                InterfaceC77833eB interfaceC77833eB = c77843eC.A00;
                Object ADU = interfaceC77833eB.ADU(context, obj, c77843eC.A01, obj2);
                Class CBk = interfaceC77833eB.CBk();
                C14360o3.A0B(CBk, 1);
                if (ADU != null) {
                    Map map = c3h5.A00;
                    if (map == null) {
                        map = new LinkedHashMap(size);
                    }
                    map.put(CBk, ADU);
                    if (c3h5.A00 == null) {
                        c3h5.A00 = map;
                    }
                }
                if (isTracing) {
                    c1ll.ASb();
                }
            }
            if (isTracing) {
                c1ll.ASb();
            }
        }
    }

    public void A09(Context context, C3h5 c3h5, C1LL c1ll, Object obj, Object obj2) {
        Object obj3;
        C14360o3.A0B(c3h5, 3);
        List list = this.A00;
        if (list != null) {
            boolean isTracing = c1ll.isTracing();
            if (isTracing) {
                c1ll.ADO(AbstractC78293ev.A00(AnonymousClass001.A0R(A04(), ":detach")));
            }
            int size = list.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    Object obj4 = list.get(size);
                    C14360o3.A0C(obj4, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit.DelegateBinder<*, in MOUNT_CONTENT of com.facebook.rendercore.RenderUnit, kotlin.Any>");
                    C77843eC c77843eC = (C77843eC) obj4;
                    if (isTracing) {
                        c1ll.ADO(AbstractC78293ev.A00(c77843eC.A00.getDescription()));
                    }
                    Class CBk = c77843eC.A00.CBk();
                    C14360o3.A0B(CBk, 0);
                    Map map = c3h5.A00;
                    if (map != null) {
                        obj3 = map.remove(CBk);
                    } else {
                        obj3 = null;
                    }
                    c77843eC.A00(context, obj, obj2, obj3);
                    if (isTracing) {
                        c1ll.ASb();
                    }
                    if (i < 0) {
                        break;
                    } else {
                        size = i;
                    }
                }
            }
            if (isTracing) {
                c1ll.ASb();
            }
        }
    }

    public void A0A(Context context, C3h5 c3h5, C1LL c1ll, Object obj, Object obj2) {
        Object[] objArr;
        C14360o3.A0B(obj, 1);
        C14360o3.A0B(c3h5, 3);
        boolean isTracing = c1ll.isTracing();
        List list = this.A05;
        try {
            if (list != null) {
                int size = list.size();
                if (isTracing) {
                    c1ll.ADO(AbstractC78293ev.A00(AnonymousClass001.A0R(A04(), ":mount-fixed")));
                }
                for (int i = 0; i < size; i++) {
                    C77843eC c77843eC = (C77843eC) list.get(i);
                    if (isTracing) {
                        c1ll.ADO(AbstractC78293ev.A00(c77843eC.A00.getDescription()));
                    }
                    try {
                        Object ADU = c77843eC.A00.ADU(context, obj, c77843eC.A01, obj2);
                        if (ADU != null) {
                            Object[] objArr2 = c3h5.A02;
                            if (objArr2 == null) {
                                objArr = new Object[size];
                            } else {
                                objArr = objArr2;
                            }
                            objArr[i] = ADU;
                            if (objArr2 == null) {
                                c3h5.A02 = objArr;
                            }
                        }
                        if (isTracing) {
                            c1ll.ASb();
                        }
                    } catch (Exception e) {
                        throw new X1m(this, AnonymousClass001.A0R("Exception binding fixed mount binder: ", c77843eC.A00.getDescription()), e);
                    }
                }
                if (isTracing) {
                    c1ll.ASb();
                }
            }
            List list2 = this.A01;
            isTracing = c1ll.isTracing();
            if (list2 != null) {
                int size2 = list2.size();
                if (isTracing) {
                    c1ll.ADO(AbstractC78293ev.A00(AnonymousClass001.A0R(A04(), ":mount-optional")));
                }
                for (int i2 = 0; i2 < size2; i2++) {
                    C77843eC c77843eC2 = (C77843eC) list2.get(i2);
                    if (isTracing) {
                        c1ll.ADO(AbstractC78293ev.A00(c77843eC2.A00.getDescription()));
                    }
                    try {
                        Object ADU2 = c77843eC2.A00.ADU(context, obj, c77843eC2.A01, obj2);
                        Class CBk = c77843eC2.A00.CBk();
                        C14360o3.A0B(CBk, 1);
                        if (ADU2 != null) {
                            Map map = c3h5.A01;
                            if (map == null) {
                                map = new LinkedHashMap(size2);
                            }
                            map.put(CBk, ADU2);
                            if (c3h5.A01 == null) {
                                c3h5.A01 = map;
                            }
                        }
                    } catch (Exception e2) {
                        throw new X1m(this, AnonymousClass001.A0R("Exception while mounting optional mount binder: ", c77843eC2.A00.getDescription()), e2);
                    }
                }
                if (isTracing) {
                    c1ll.ASb();
                }
            }
        } finally {
            if (isTracing) {
                c1ll.ASb();
            }
        }
    }

    public void A0B(Context context, C3h5 c3h5, C1LL c1ll, Object obj, Object obj2) {
        Object obj3;
        C14360o3.A0B(c3h5, 3);
        List list = this.A01;
        if (list != null) {
            boolean isTracing = c1ll.isTracing();
            if (isTracing) {
                c1ll.ADO(AbstractC78293ev.A00(AnonymousClass001.A0R(A04(), ":unmount-optional")));
            }
            int size = list.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    Object obj4 = list.get(size);
                    C14360o3.A0C(obj4, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit.DelegateBinder<*, in MOUNT_CONTENT of com.facebook.rendercore.RenderUnit.unmountBinders$lambda$5, kotlin.Any>");
                    C77843eC c77843eC = (C77843eC) obj4;
                    if (isTracing) {
                        c1ll.ADO(AbstractC78293ev.A00(c77843eC.A00.getDescription()));
                    }
                    try {
                        try {
                            Class CBk = c77843eC.A00.CBk();
                            C14360o3.A0B(CBk, 0);
                            Map map = c3h5.A01;
                            if (map != null) {
                                obj3 = map.remove(CBk);
                            } else {
                                obj3 = null;
                            }
                            c77843eC.A00(context, obj, obj2, obj3);
                            if (isTracing) {
                                c1ll.ASb();
                            }
                            if (i < 0) {
                                break;
                            } else {
                                size = i;
                            }
                        } catch (Exception e) {
                            throw new X1m(this, AnonymousClass001.A0u("Exception while unmounting optional binder: [", A04(), "] ", c77843eC.A00.getDescription()), e);
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (!isTracing) {
                            throw th;
                        }
                        c1ll.ASb();
                        throw th;
                    }
                }
            }
            if (isTracing) {
                c1ll.ASb();
            }
        }
        boolean isTracing2 = c1ll.isTracing();
        List list2 = this.A05;
        if (list2 != null) {
            if (isTracing2) {
                c1ll.ADO(AbstractC78293ev.A00(AnonymousClass001.A0R(A04(), ":unmount-fixed")));
            }
            int size2 = list2.size() - 1;
            if (size2 >= 0) {
                while (true) {
                    int i2 = size2 - 1;
                    Object obj5 = list2.get(size2);
                    C14360o3.A0C(obj5, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit.DelegateBinder<*, in MOUNT_CONTENT of com.facebook.rendercore.RenderUnit, kotlin.Any>");
                    C77843eC c77843eC2 = (C77843eC) obj5;
                    if (isTracing2) {
                        c1ll.ADO(AbstractC78293ev.A00(c77843eC2.A00.getDescription()));
                    }
                    try {
                        try {
                            Object[] objArr = c3h5.A02;
                            Object obj6 = null;
                            if (objArr != null) {
                                Object obj7 = objArr[size2];
                                objArr[size2] = null;
                                obj6 = obj7;
                            }
                            c77843eC2.A00(context, obj, obj2, obj6);
                            if (isTracing2) {
                                c1ll.ASb();
                            }
                            if (i2 < 0) {
                                break;
                            } else {
                                size2 = i2;
                            }
                        } catch (Exception e2) {
                            throw new X1m(this, AnonymousClass001.A0R("Exception while unmounting fixed binder: ", c77843eC2.A00.getDescription()), e2);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (!isTracing2) {
                            throw th;
                        }
                        c1ll.ASb();
                        throw th;
                    }
                }
            }
            if (isTracing2) {
                c1ll.ASb();
            }
        }
    }

    public void A0C(C77843eC c77843eC) {
        C14360o3.A0B(c77843eC, 0);
        List list = this.A00;
        if (list == null) {
            list = new ArrayList();
        }
        if (list == null) {
            this.A00 = list;
            if (this.A02 == null) {
                this.A02 = new HashMap();
            } else {
                throw new IllegalStateException("Binder Map and Binder List out of sync!");
            }
        }
        Map map = this.A02;
        if (map != null) {
            AbstractC78293ev.A01(c77843eC, list, map);
        }
    }

    public void A0D(C77843eC c77843eC) {
        C14360o3.A0B(c77843eC, 0);
        List list = this.A01;
        if (list == null) {
            list = new ArrayList();
        }
        if (list == null) {
            this.A01 = list;
            if (this.A03 == null) {
                this.A03 = new HashMap();
            } else {
                throw new IllegalStateException("Binder Map and Binder List out of sync!");
            }
        }
        Map map = this.A03;
        if (map != null) {
            AbstractC78293ev.A01(c77843eC, list, map);
        }
    }

    public boolean A0E() {
        return false;
    }

    public abstract long A0H();

    public abstract InterfaceC50822Vd A0I();

    public InterfaceC77833eB A02(Class cls) {
        C77843eC c77843eC;
        Map map = this.A02;
        if (map != null && (c77843eC = (C77843eC) map.get(C79033gA.class)) != null) {
            return c77843eC.A00;
        }
        return null;
    }

    public boolean A0F(C77843eC c77843eC) {
        Map map = this.A02;
        if (map != null) {
            return map.containsKey(c77843eC.A00.CBk());
        }
        return false;
    }

    public boolean A0G(C77843eC c77843eC) {
        Map map = this.A03;
        if (map != null) {
            return map.containsKey(c77843eC.A00.CBk());
        }
        return false;
    }

    public final Integer Bmh() {
        return this.A04;
    }

    public String A03() {
        return String.valueOf(A0H());
    }

    public String A04() {
        return AbstractC75733ae.A00(getClass());
    }

    public C2WC(Integer num, List list, List list2, List list3) {
        C14360o3.A0B(list2, 3);
        C14360o3.A0B(list3, 4);
        if (list.size() <= 64) {
            this.A04 = num;
            this.A05 = list;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                A0D((C77843eC) list2.get(i));
            }
            int size2 = list3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                A0C((C77843eC) list3.get(i2));
            }
            return;
        }
        throw new IllegalStateException("Too many fixed mount binders. Max is 64");
    }
}
