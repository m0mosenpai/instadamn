package X;

import android.graphics.Rect;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.rendercore.RenderTreeNode;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Map;

/* renamed from: X.2X6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2X6 extends C2X7 implements C2X8 {
    public static final C2X6 A00 = new Object();

    @Override // X.C2X7
    public final void A0C(C79073gE c79073gE) {
        C14360o3.A0B(c79073gE, 0);
        C79143gL c79143gL = (C79143gL) c79073gE.A02;
        c79143gL.A01 = c79143gL.A02;
        c79143gL.A02 = null;
    }

    @Override // X.C2X8
    public final void ADI(RenderTreeNode renderTreeNode, C79073gE c79073gE, int i) {
    }

    @Override // X.C2X8
    public final void D0L(C2WC c2wc, C79073gE c79073gE, Object obj, Object obj2, boolean z) {
    }

    @Override // X.C2X8
    public final void DTt(C2WC c2wc, C79073gE c79073gE, Object obj, Object obj2) {
    }

    @Override // X.C2X8
    public final void Dwh(C2WC c2wc, C79073gE c79073gE, Object obj, Object obj2) {
    }

    @Override // X.C2X8
    public final boolean Ek6(C2WC c2wc, C2WC c2wc2, C79073gE c79073gE, Object obj, Object obj2) {
        return true;
    }

    @Override // X.C2X7
    public final /* bridge */ /* synthetic */ Object A0A() {
        return new C79143gL();
    }

    @Override // X.C2X7
    public final /* bridge */ /* synthetic */ void A0B(Rect rect, C79073gE c79073gE, Object obj) {
        Map map;
        C50882Vk c50882Vk = (C50882Vk) obj;
        C14360o3.A0B(c79073gE, 0);
        C79143gL c79143gL = (C79143gL) c79073gE.A02;
        c79143gL.A02 = c79143gL.A00;
        if (c50882Vk != null) {
            map = c50882Vk.A0V;
        } else {
            map = null;
        }
        c79143gL.A00 = map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if ((r15 instanceof android.view.View) == false) goto L10;
     */
    @Override // X.C2X8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CzR(X.C2WC r13, X.C79073gE r14, java.lang.Object r15, java.lang.Object r16) {
        /*
            r12 = this;
            java.lang.Object r3 = r14.A02
            X.3gL r3 = (X.C79143gL) r3
            java.util.Map r2 = r3.A00
            if (r2 == 0) goto L3e
            long r0 = r13.A0H()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r2.get(r0)
            X.3gI r0 = (X.C79113gI) r0
            if (r0 == 0) goto L3e
            X.2Wh r9 = r3.A03
            X.2Vc r8 = r0.A01
            X.2XE r10 = r0.A02
            android.util.SparseArray r7 = r0.A00
            r11 = 0
            int r0 = r7.size()
            if (r0 == 0) goto L2c
            boolean r0 = r15 instanceof android.view.View
            r1 = 1
            if (r0 != 0) goto L3f
        L2c:
            r1 = 0
            boolean r0 = r8 instanceof X.AbstractC50792Va
            if (r0 == 0) goto L3e
            r0 = r8
            X.2Va r0 = (X.AbstractC50792Va) r0
            X.2XI[] r0 = r0.A1A()
            X.C14360o3.A07(r0)
            int r0 = r0.length
            if (r0 != 0) goto L3f
        L3e:
            return
        L3f:
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r5 = 0
            if (r1 == 0) goto L6f
            int r4 = r7.size()
            r3 = 0
        L4c:
            if (r3 >= r4) goto L6f
            int r2 = r7.keyAt(r3)
            java.lang.Object r1 = r7.valueAt(r3)
            X.2XI r1 = (X.C2XI) r1
            X.C14360o3.A0A(r1)
            r0 = r15
            android.view.View r0 = (android.view.View) r0
            X.C79153gM.A00(r0, r1, r2)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r8, r7)
            X.C51112Wh.A00(r0, r9, r1)
            r6.add(r1)
            int r3 = r3 + 1
            goto L4c
        L6f:
            boolean r0 = r8 instanceof X.AbstractC50792Va
            if (r0 == 0) goto La0
            r0 = r8
            X.2Va r0 = (X.AbstractC50792Va) r0
            X.2XI[] r4 = r0.A1A()
        L7a:
            int r3 = r4.length
        L7b:
            if (r5 >= r3) goto Lae
            r2 = r4[r5]
            r1 = r8
            X.2Va r1 = (X.AbstractC50792Va) r1     // Catch: java.lang.Exception -> L97
            if (r2 == 0) goto L95
            java.lang.Object r0 = r2.A00     // Catch: java.lang.Exception -> L97
        L86:
            r1.A0i(r5, r0, r15)     // Catch: java.lang.Exception -> L97
            android.util.Pair r0 = new android.util.Pair     // Catch: java.lang.Exception -> L97
            r0.<init>(r8, r7)     // Catch: java.lang.Exception -> L97
            X.C51112Wh.A00(r0, r9, r2)     // Catch: java.lang.Exception -> L97
            r6.add(r2)     // Catch: java.lang.Exception -> L97
            goto L9d
        L95:
            r0 = 0
            goto L86
        L97:
            r1 = move-exception
            if (r10 == 0) goto La3
            X.C51372Xk.A03(r10, r1)
        L9d:
            int r5 = r5 + 1
            goto L7b
        La0:
            X.2XI[] r4 = new X.C2XI[r11]
            goto L7a
        La3:
            boolean r0 = r1 instanceof java.lang.RuntimeException
            if (r0 == 0) goto La8
            throw r1
        La8:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        Lae:
            java.util.Map r0 = r9.A00
            r0.put(r8, r6)
            java.util.Map r0 = r9.A01
            r0.put(r8, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2X6.CzR(X.2WC, X.3gE, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.C2X8
    public final void Dw7(C2WC c2wc, C79073gE c79073gE, Object obj, Object obj2) {
        Map map;
        Map map2;
        C79113gI c79113gI;
        C79143gL c79143gL = (C79143gL) c79073gE.A02;
        Map map3 = c79143gL.A02;
        if ((map3 != null && (c79113gI = (C79113gI) map3.get(Long.valueOf(c2wc.A0H()))) != null) || (((map = c79143gL.A00) != null && (c79113gI = (C79113gI) map.get(Long.valueOf(c2wc.A0H()))) != null) || ((map2 = c79143gL.A01) != null && (c79113gI = (C79113gI) map2.get(Long.valueOf(c2wc.A0H()))) != null))) {
            C51112Wh c51112Wh = c79143gL.A03;
            AbstractC50812Vc abstractC50812Vc = c79113gI.A01;
            SparseArray sparseArray = c79113gI.A00;
            if (sparseArray.size() == 0 || !(obj instanceof View)) {
                if (abstractC50812Vc instanceof AbstractC50792Va) {
                    C2XI[] A1A = ((AbstractC50792Va) abstractC50812Vc).A1A();
                    C14360o3.A07(A1A);
                    if (A1A.length == 0) {
                        return;
                    }
                } else {
                    return;
                }
            }
            c51112Wh.A01.remove(abstractC50812Vc);
            Map map4 = c51112Wh.A00;
            java.util.Set<C2XI> set = (java.util.Set) map4.get(abstractC50812Vc);
            if (set != null) {
                for (C2XI c2xi : set) {
                    Pair pair = new Pair(abstractC50812Vc, sparseArray);
                    if (c2xi != null) {
                        Map map5 = c51112Wh.A02;
                        java.util.Set set2 = (java.util.Set) map5.get(c2xi);
                        if (set2 != null) {
                            set2.remove(pair);
                            if (set2.isEmpty()) {
                                map5.remove(c2xi);
                                c2xi.A01.remove(c51112Wh);
                            }
                        }
                    }
                }
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int keyAt = sparseArray.keyAt(i);
                    if (obj instanceof View) {
                        switch (keyAt) {
                            case 1:
                                View view = (View) obj;
                                if (view.getAlpha() != 1.0f) {
                                    view.setAlpha(1.0f);
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                View view2 = (View) obj;
                                if (view2.getTranslationX() != 0.0f) {
                                    view2.setTranslationX(0.0f);
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                View view3 = (View) obj;
                                if (view3.getTranslationY() != 0.0f) {
                                    view3.setTranslationY(0.0f);
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                View view4 = (View) obj;
                                if (view4.getTranslationZ() != 0.0f) {
                                    view4.setTranslationZ(0.0f);
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                View view5 = (View) obj;
                                if (view5.getScaleX() != 1.0f) {
                                    view5.setScaleX(1.0f);
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                View view6 = (View) obj;
                                if (view6.getScaleY() != 1.0f) {
                                    view6.setScaleY(1.0f);
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                View view7 = (View) obj;
                                if (view7.getElevation() != 0.0f) {
                                    view7.setElevation(0.0f);
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                                View view8 = (View) obj;
                                if (view8.getBackground() != null) {
                                    view8.setBackground(null);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                View view9 = (View) obj;
                                if (view9.getRotation() != 0.0f) {
                                    view9.setRotation(0.0f);
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
                                View view10 = (View) obj;
                                if (view10.getRotationX() != 0.0f) {
                                    view10.setRotationX(0.0f);
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                View view11 = (View) obj;
                                if (view11.getRotationY() != 0.0f) {
                                    view11.setRotationY(0.0f);
                                    break;
                                } else {
                                    break;
                                }
                            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                                ((View) obj).getForeground();
                                break;
                        }
                    }
                }
                map4.remove(abstractC50812Vc);
            }
        }
    }

    @Override // X.C2X7
    public final void A0E(C79073gE c79073gE) {
        c79073gE.A00();
        C79143gL c79143gL = (C79143gL) c79073gE.A02;
        c79143gL.A00 = null;
        c79143gL.A02 = null;
        c79143gL.A01 = null;
    }
}
