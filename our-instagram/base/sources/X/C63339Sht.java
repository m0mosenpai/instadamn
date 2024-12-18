package X;

import android.os.SystemClock;
import android.util.SparseBooleanArray;
import android.view.View;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.systrace.SystraceMessage;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Sht, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63339Sht {
    public long A00;
    public Object A01;
    public final R3M A02;
    public final C63389Sj5 A03;
    public final C62668SLf A04;
    public final SZN A05;
    public final ComponentCallbacks2C63415Sjt A06;
    public final X9J A07;
    public final int[] A08;
    public volatile boolean A09;

    private void A00(ReactShadowNode reactShadowNode) {
        AbstractC78533fL abstractC78533fL;
        ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) reactShadowNode;
        if (reactShadowNodeImpl.A0I || reactShadowNodeImpl.A0D() || ((abstractC78533fL = reactShadowNodeImpl.A0B) != null && YogaNative.jni_YGNodeIsDirtyJNI(((YogaNodeJNIBase) abstractC78533fL).mNativePointer))) {
            for (int i = 0; i < reactShadowNode.AnZ(); i++) {
                A00(reactShadowNodeImpl.A06(i));
            }
            reactShadowNode.CzE(this.A03);
        }
    }

    public static void A02(ReactShadowNode reactShadowNode, C63339Sht c63339Sht) {
        ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) reactShadowNode;
        ArrayList arrayList = reactShadowNodeImpl.A0G;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((ReactShadowNodeImpl) arrayList.get(size)).A08 = null;
                }
            }
            arrayList.clear();
        }
        C62668SLf c62668SLf = c63339Sht.A04;
        int i = reactShadowNodeImpl.A00;
        c62668SLf.A02.A00();
        if (!c62668SLf.A01.get(i)) {
            c62668SLf.A00.remove(i);
            int AnZ = reactShadowNode.AnZ();
            while (true) {
                AnZ--;
                if (AnZ < 0) {
                    break;
                } else {
                    A02(reactShadowNodeImpl.A06(AnZ), c63339Sht);
                }
            }
            if (reactShadowNodeImpl.AnZ() != 0) {
                int i2 = 0;
                int AnZ2 = reactShadowNodeImpl.AnZ();
                while (true) {
                    AnZ2--;
                    if (AnZ2 >= 0) {
                        AbstractC78533fL abstractC78533fL = reactShadowNodeImpl.A0B;
                        if (abstractC78533fL != null && !reactShadowNodeImpl.A0C()) {
                            abstractC78533fL.removeChildAt(AnZ2);
                        }
                        ReactShadowNodeImpl A06 = reactShadowNodeImpl.A06(AnZ2);
                        A06.A09 = null;
                        i2 += ReactShadowNodeImpl.A02(A06);
                        A06.dispose();
                    } else {
                        ArrayList arrayList2 = reactShadowNodeImpl.A0F;
                        AbstractC05810Sj.A00(arrayList2);
                        arrayList2.clear();
                        reactShadowNodeImpl.A07();
                        reactShadowNodeImpl.A06 -= i2;
                        ReactShadowNodeImpl.A04(reactShadowNodeImpl, -i2);
                        return;
                    }
                }
            }
        } else {
            throw new R3C(AnonymousClass001.A0c("Trying to remove root node ", " without using removeRootNode!", i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ff, code lost:
    
        if (r4 != r5.A02) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(com.facebook.react.uimanager.ReactShadowNode r11, java.util.List r12, float r13, float r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63339Sht.A05(com.facebook.react.uimanager.ReactShadowNode, java.util.List, float, float):void");
    }

    public C63339Sht(R3M r3m, ComponentCallbacks2C63415Sjt componentCallbacks2C63415Sjt, X9J x9j, int i) {
        SZN szn = new SZN(r3m, new C63309ShF(componentCallbacks2C63415Sjt), i);
        this.A01 = AbstractC58318PtA.A0b();
        C62668SLf c62668SLf = new C62668SLf();
        this.A04 = c62668SLf;
        this.A08 = new int[4];
        this.A00 = 0L;
        this.A09 = true;
        this.A02 = r3m;
        this.A06 = componentCallbacks2C63415Sjt;
        this.A05 = szn;
        this.A03 = new C63389Sj5(c62668SLf, szn);
        this.A07 = x9j;
    }

    public static void A01(ReactShadowNode reactShadowNode, C63339Sht c63339Sht) {
        ComponentCallbacks2C63415Sjt componentCallbacks2C63415Sjt = c63339Sht.A06;
        ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) reactShadowNode;
        String str = reactShadowNodeImpl.A0E;
        AbstractC05810Sj.A00(str);
        NativeModule A00 = componentCallbacks2C63415Sjt.A00(str);
        AbstractC05810Sj.A00(A00);
        if (A00 instanceof InterfaceC65358Tim) {
            InterfaceC65358Tim interfaceC65358Tim = (InterfaceC65358Tim) A00;
            if (interfaceC65358Tim != null && interfaceC65358Tim.needsCustomLayoutForChildren()) {
                String str2 = reactShadowNodeImpl.A0E;
                AbstractC05810Sj.A00(str2);
                throw new R3C(AnonymousClass001.A0g("Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it's children (", str2, "). Use measure instead."));
            }
            return;
        }
        String str3 = reactShadowNodeImpl.A0E;
        AbstractC05810Sj.A00(str3);
        throw new R3C(AnonymousClass001.A0g("Trying to use view ", str3, " as a parent, but its Manager doesn't extends ViewGroupManager"));
    }

    public static void A03(C63339Sht c63339Sht) {
        SZN szn = c63339Sht.A05;
        if (szn.A0F.isEmpty() && szn.A0G.isEmpty()) {
            c63339Sht.A04(-1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v64, types: [X.R6C] */
    /* JADX WARN: Type inference failed for: r0v66, types: [X.Sb5] */
    public final void A04(int i) {
        int i2;
        int i3;
        float size;
        InterfaceC09730eq interfaceC09730eq = SystraceMessage.A00;
        AbstractC09720ep A00 = SystraceMessage.A00(interfaceC09730eq, "UIImplementation.dispatchViewUpdates", OdexSchemeArtXdex.STATE_PGO_ATTEMPTED);
        A00.A01("batchId", i);
        A00.A02();
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "UIImplementation.updateViewHierarchy", -2076598530);
            int i4 = 0;
            while (true) {
                try {
                    C62668SLf c62668SLf = this.A04;
                    SKR skr = c62668SLf.A02;
                    skr.A00();
                    SparseBooleanArray sparseBooleanArray = c62668SLf.A01;
                    if (i4 >= sparseBooleanArray.size()) {
                        break;
                    }
                    skr.A00();
                    ReactShadowNode A002 = c62668SLf.A00(sparseBooleanArray.keyAt(i4));
                    if (((ReactShadowNodeImpl) A002).A0D != null && ((ReactShadowNodeImpl) A002).A0C != null) {
                        AbstractC09720ep A003 = SystraceMessage.A00(interfaceC09730eq, "UIImplementation.notifyOnBeforeLayoutRecursive", OdexSchemeArtXdex.STATE_PGO_ATTEMPTED);
                        A003.A01("rootTag", ((ReactShadowNodeImpl) A002).A00);
                        A003.A02();
                        try {
                            A00(A002);
                            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 2053787268);
                            AbstractC09720ep A004 = SystraceMessage.A00(interfaceC09730eq, "cssRoot.calculateLayout", OdexSchemeArtXdex.STATE_PGO_ATTEMPTED);
                            ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) A002;
                            A004.A01("rootTag", reactShadowNodeImpl.A00);
                            A004.A02();
                            long uptimeMillis2 = SystemClock.uptimeMillis();
                            try {
                                int intValue = reactShadowNodeImpl.A0D.intValue();
                                int intValue2 = reactShadowNodeImpl.A0C.intValue();
                                float f = Float.NaN;
                                if (View.MeasureSpec.getMode(intValue) == 0) {
                                    size = Float.NaN;
                                } else {
                                    size = View.MeasureSpec.getSize(intValue);
                                }
                                if (View.MeasureSpec.getMode(intValue2) != 0) {
                                    f = View.MeasureSpec.getSize(intValue2);
                                }
                                reactShadowNodeImpl.A0B.calculateLayout(size, f);
                                C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -1038463381);
                                this.A00 = SystemClock.uptimeMillis() - uptimeMillis2;
                                AbstractC09720ep A005 = SystraceMessage.A00(interfaceC09730eq, "UIImplementation.applyUpdatesRecursive", OdexSchemeArtXdex.STATE_PGO_ATTEMPTED);
                                A005.A01("rootTag", ((ReactShadowNodeImpl) A002).A00);
                                A005.A02();
                            } catch (Throwable th) {
                                C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -1346272845);
                                this.A00 = SystemClock.uptimeMillis() - uptimeMillis2;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            i3 = -2012974344;
                        }
                        try {
                            ArrayList A1E = AbstractC166987dD.A1E();
                            A05(A002, A1E, 0.0f, 0.0f);
                            Iterator it = A1E.iterator();
                            while (it.hasNext()) {
                                ReactShadowNode reactShadowNode = (ReactShadowNode) it.next();
                                X9J x9j = this.A07;
                                ReactShadowNodeImpl reactShadowNodeImpl2 = (ReactShadowNodeImpl) reactShadowNode;
                                int i5 = reactShadowNodeImpl2.A00;
                                int i6 = reactShadowNodeImpl2.A04;
                                int i7 = reactShadowNodeImpl2.A05;
                                int i8 = reactShadowNodeImpl2.A03;
                                int i9 = reactShadowNodeImpl2.A02;
                                R6C r6c = (R6C) R6C.A04.A7H();
                                if (r6c == 0) {
                                    r6c = new Sb5();
                                }
                                r6c.A08(-1, i5);
                                r6c.A02 = i6;
                                r6c.A03 = i7;
                                r6c.A01 = i8;
                                r6c.A00 = i9;
                                x9j.APn(r6c);
                            }
                            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -459719830);
                        } catch (Throwable th3) {
                            th = th3;
                            i3 = 853945950;
                            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, i3);
                            throw th;
                        }
                    }
                    i4++;
                } catch (Throwable th4) {
                    th = th4;
                    i2 = -872687533;
                    C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, i2);
                    throw th;
                }
            }
            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -116617015);
            this.A03.A00.clear();
            SZN szn = this.A05;
            long j = this.A00;
            AbstractC09720ep A006 = SystraceMessage.A00(interfaceC09730eq, "UIViewOperationQueue.dispatchViewUpdates", OdexSchemeArtXdex.STATE_PGO_ATTEMPTED);
            A006.A01("batchId", i);
            A006.A02();
            try {
                long uptimeMillis3 = SystemClock.uptimeMillis();
                long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                ArrayList arrayList = szn.A0G;
                ArrayDeque arrayDeque = null;
                if (!arrayList.isEmpty()) {
                    szn.A0G = AbstractC166987dD.A1E();
                } else {
                    arrayList = null;
                }
                ArrayList arrayList2 = szn.A0F;
                if (!arrayList2.isEmpty()) {
                    szn.A0F = AbstractC166987dD.A1E();
                } else {
                    arrayList2 = null;
                }
                synchronized (szn.A0O) {
                    try {
                        if (!szn.A0D.isEmpty()) {
                            arrayDeque = szn.A0D;
                            szn.A0D = new ArrayDeque();
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                TRT trt = new TRT(szn, arrayDeque, arrayList, arrayList2, i, uptimeMillis, j, uptimeMillis3, currentThreadTimeMillis);
                AbstractC09720ep A007 = SystraceMessage.A00(interfaceC09730eq, "acquiring mDispatchRunnablesLock", OdexSchemeArtXdex.STATE_PGO_ATTEMPTED);
                A007.A01("batchId", i);
                A007.A02();
                synchronized (szn.A0N) {
                    try {
                        C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 477058621);
                        szn.A0E.add(trt);
                    } finally {
                    }
                }
                if (!szn.A0H) {
                    C63255SgD.A01(new R34(szn.A0K, szn));
                }
                C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -1983923452);
                C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 221929086);
            } catch (Throwable th6) {
                th = th6;
                i2 = -226478430;
                C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, i2);
                throw th;
            }
        } catch (Throwable th7) {
            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 916237250);
            throw th7;
        }
    }
}
