package com.facebook.react.uimanager;

import X.AbstractC05810Sj;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC25225BEi;
import X.AbstractC25229BEm;
import X.AbstractC31172DnG;
import X.AbstractC78513fH;
import X.AbstractC78533fL;
import X.AnonymousClass001;
import X.C05F;
import X.C14360o3;
import X.C62828STa;
import X.C62829STb;
import X.C63104Sd8;
import X.C63191Set;
import X.C63389Sj5;
import X.C63592Spz;
import X.C78523fJ;
import X.InterfaceC50872Vi;
import X.R3N;
import X.SKS;
import X.SZN;
import com.facebook.catalyst.views.art.ARTVirtualNode;
import com.facebook.react.views.text.ReactRawTextShadowNode;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public class ReactShadowNodeImpl implements ReactShadowNode {
    public static final AbstractC78513fH A0N;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public ReactShadowNodeImpl A07;
    public ReactShadowNodeImpl A08;
    public ReactShadowNodeImpl A09;
    public R3N A0A;
    public AbstractC78533fL A0B;
    public Integer A0C;
    public Integer A0D;
    public String A0E;
    public ArrayList A0F;
    public ArrayList A0G;
    public boolean A0H;
    public boolean A0J;
    public final float[] A0L;
    public boolean A0I = true;
    public int A06 = 0;
    public final boolean[] A0M = new boolean[9];
    public final C63191Set A0K = new C63191Set(0.0f);

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001e, code lost:
    
        if (X.C3e2.A00(r3[r4]) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0020, code lost:
    
        r1 = r6.A0B;
        r5 = X.EnumC77763e0.A00(r4);
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetPaddingJNI(((com.facebook.yoga.YogaNodeJNIBase) r1).mNativePointer, r5.A00, r6.A0K.A03[r4]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0051, code lost:
    
        if (X.C3e2.A00(r3[8]) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
    
        if (X.C3e2.A00(r3[8]) != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(com.facebook.react.uimanager.ReactShadowNodeImpl r6) {
        /*
            r4 = 0
        L1:
            r1 = 8
            if (r4 > r1) goto L90
            if (r4 == 0) goto L54
            r0 = 2
            if (r4 == r0) goto L54
            r0 = 4
            if (r4 == r0) goto L54
            r0 = 5
            if (r4 == r0) goto L54
            r0 = 1
            if (r4 == r0) goto L38
            r0 = 3
            if (r4 == r0) goto L38
            float[] r3 = r6.A0L
            r0 = r3[r4]
            boolean r0 = X.C3e2.A00(r0)
            if (r0 == 0) goto L70
        L20:
            X.3fL r1 = r6.A0B
            X.3e0 r5 = X.EnumC77763e0.A00(r4)
            X.Set r0 = r6.A0K
            float[] r0 = r0.A03
            r3 = r0[r4]
            com.facebook.yoga.YogaNodeJNIBase r1 = (com.facebook.yoga.YogaNodeJNIBase) r1
            long r1 = r1.mNativePointer
            int r0 = r5.A00
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetPaddingJNI(r1, r0, r3)
        L35:
            int r4 = r4 + 1
            goto L1
        L38:
            float[] r3 = r6.A0L
            r0 = r3[r4]
            boolean r0 = X.C3e2.A00(r0)
            if (r0 == 0) goto L70
            r0 = 7
            r0 = r3[r0]
            boolean r0 = X.C3e2.A00(r0)
            if (r0 == 0) goto L70
            r0 = r3[r1]
            boolean r0 = X.C3e2.A00(r0)
            if (r0 == 0) goto L70
            goto L20
        L54:
            float[] r3 = r6.A0L
            r0 = r3[r4]
            boolean r0 = X.C3e2.A00(r0)
            if (r0 == 0) goto L70
            r0 = 6
            r0 = r3[r0]
            boolean r0 = X.C3e2.A00(r0)
            if (r0 == 0) goto L70
            r0 = r3[r1]
            boolean r0 = X.C3e2.A00(r0)
            if (r0 == 0) goto L70
            goto L20
        L70:
            boolean[] r0 = r6.A0M
            boolean r2 = r0[r4]
            X.3fL r1 = r6.A0B
            X.3e0 r0 = X.EnumC77763e0.A00(r4)
            r3 = r3[r4]
            com.facebook.yoga.YogaNodeJNIBase r1 = (com.facebook.yoga.YogaNodeJNIBase) r1
            if (r2 == 0) goto L88
            long r1 = r1.mNativePointer
            int r0 = r0.A00
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(r1, r0, r3)
            goto L35
        L88:
            long r1 = r1.mNativePointer
            int r0 = r0.A00
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetPaddingJNI(r1, r0, r3)
            goto L35
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.ReactShadowNodeImpl.A03(com.facebook.react.uimanager.ReactShadowNodeImpl):void");
    }

    public void A08(SZN szn) {
    }

    public boolean A0A() {
        return false;
    }

    public boolean A0B() {
        return false;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void CnK() {
        AbstractC78533fL abstractC78533fL;
        this.A0I = false;
        if (A0D() && (abstractC78533fL = this.A0B) != null) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) abstractC78533fL;
            float[] fArr = yogaNodeJNIBase.arr;
            if (fArr != null) {
                fArr[0] = ((int) fArr[0]) & (-17);
            }
            yogaNodeJNIBase.mHasNewLayout = false;
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void CzE(C63389Sj5 c63389Sj5) {
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void EYU(Object obj) {
    }

    static {
        Object value = C62828STa.A00.getValue();
        C14360o3.A07(value);
        A0N = (AbstractC78513fH) value;
    }

    public final ReactShadowNodeImpl A06(int i) {
        ArrayList arrayList = this.A0F;
        if (arrayList != null) {
            return (ReactShadowNodeImpl) arrayList.get(i);
        }
        throw new ArrayIndexOutOfBoundsException(AnonymousClass001.A0c("Index ", " out of bounds: node has no children", i));
    }

    public void A07() {
        if (!this.A0I) {
            this.A0I = true;
            ReactShadowNodeImpl reactShadowNodeImpl = this.A09;
            if (reactShadowNodeImpl != null) {
                reactShadowNodeImpl.A07();
            }
        }
    }

    public final void A09(InterfaceC50872Vi interfaceC50872Vi) {
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) this.A0B;
        yogaNodeJNIBase.mMeasureFunction = interfaceC50872Vi;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(yogaNodeJNIBase.mNativePointer, AbstractC167007dF.A1W(interfaceC50872Vi));
    }

    public boolean A0C() {
        return AbstractC167007dF.A1W(((YogaNodeJNIBase) this.A0B).mMeasureFunction);
    }

    public final boolean A0D() {
        AbstractC78533fL abstractC78533fL = this.A0B;
        if (abstractC78533fL != null) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) abstractC78533fL;
            float[] fArr = yogaNodeJNIBase.arr;
            if (fArr != null) {
                if ((((int) fArr[0]) & 16) == 16) {
                    return true;
                }
                return false;
            }
            if (yogaNodeJNIBase.mHasNewLayout) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final /* bridge */ /* synthetic */ void A88(ReactShadowNode reactShadowNode, int i) {
        ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) reactShadowNode;
        ArrayList arrayList = this.A0F;
        if (arrayList == null) {
            arrayList = AbstractC25225BEi.A17(4);
            this.A0F = arrayList;
        }
        arrayList.add(i, reactShadowNodeImpl);
        reactShadowNodeImpl.A09 = this;
        AbstractC78533fL abstractC78533fL = this.A0B;
        if (abstractC78533fL != null && !A0C()) {
            AbstractC78533fL abstractC78533fL2 = reactShadowNodeImpl.A0B;
            if (abstractC78533fL2 != null) {
                abstractC78533fL.addChildAt(abstractC78533fL2, i);
            } else {
                throw AbstractC166987dD.A18(AnonymousClass001.A11("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '", reactShadowNodeImpl.toString(), "' to a '", toString(), "')"));
            }
        }
        A07();
        int A02 = A02(reactShadowNodeImpl);
        this.A06 += A02;
        A04(this, A02);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int AnZ() {
        ArrayList arrayList = this.A0F;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final float BMd() {
        float[] fArr = ((YogaNodeJNIBase) this.A0B).arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final float BMe() {
        float[] fArr = ((YogaNodeJNIBase) this.A0B).arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final /* bridge */ /* synthetic */ int BWC(ReactShadowNode reactShadowNode) {
        ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) reactShadowNode;
        int i = 0;
        for (int i2 = 0; i2 < AnZ(); i2++) {
            ReactShadowNodeImpl A06 = A06(i2);
            if (reactShadowNodeImpl == A06) {
                return i;
            }
            i += A02(A06);
        }
        throw AbstractC166987dD.A18(AnonymousClass001.A02(reactShadowNodeImpl.A00, this.A00, "Child ", " was not a child of "));
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean Cfz() {
        if (!(this instanceof ReactRawTextShadowNode) && !(this instanceof ARTVirtualNode)) {
            return false;
        }
        return true;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final /* bridge */ /* synthetic */ ReactShadowNodeImpl EF7(int i) {
        ArrayList arrayList = this.A0F;
        if (arrayList != null) {
            ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) arrayList.remove(i);
            reactShadowNodeImpl.A09 = null;
            AbstractC78533fL abstractC78533fL = this.A0B;
            if (abstractC78533fL != null && !A0C()) {
                abstractC78533fL.removeChildAt(i);
            }
            A07();
            int A02 = A02(reactShadowNodeImpl);
            this.A06 -= A02;
            A04(this, -A02);
            return reactShadowNodeImpl;
        }
        throw new ArrayIndexOutOfBoundsException(AnonymousClass001.A0c("Index ", " out of bounds: node has no children", i));
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void EWX(boolean z) {
        boolean z2 = true;
        AbstractC05810Sj.A03(AbstractC25229BEm.A1Z(this.A09), "Must remove from no opt parent first");
        AbstractC05810Sj.A03(AbstractC25229BEm.A1Z(this.A08), "Must remove from native parent first");
        ArrayList arrayList = this.A0G;
        if (arrayList != null && arrayList.size() != 0) {
            z2 = false;
        }
        AbstractC05810Sj.A03(z2, "Must remove all native children first");
        this.A0H = z;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void EaQ(int i, float f) {
        this.A0L[i] = f;
        this.A0M[i] = false;
        A03(this);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void dispose() {
        AbstractC78533fL abstractC78533fL = this.A0B;
        if (abstractC78533fL != null) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) abstractC78533fL;
            yogaNodeJNIBase.mMeasureFunction = null;
            yogaNodeJNIBase.mBaselineFunction = null;
            yogaNodeJNIBase.mData = null;
            yogaNodeJNIBase.arr = null;
            yogaNodeJNIBase.mHasNewLayout = true;
            yogaNodeJNIBase.mLayoutDirection = 0;
            YogaNative.jni_YGNodeResetJNI(yogaNodeJNIBase.mNativePointer);
            ((C63592Spz) C62829STb.A00.getValue()).EE6(abstractC78533fL);
        }
    }

    public String toString() {
        return AnonymousClass001.A09(this.A00, "[", this.A0E, " ", "]");
    }

    public ReactShadowNodeImpl() {
        float[] fArr = new float[9];
        this.A0L = fArr;
        if (!Cfz()) {
            AbstractC78533fL abstractC78533fL = (AbstractC78533fL) ((C63592Spz) C62829STb.A00.getValue()).A7H();
            abstractC78533fL = abstractC78533fL == null ? new C78523fJ(A0N) : abstractC78533fL;
            this.A0B = abstractC78533fL;
            ((YogaNodeJNIBase) abstractC78533fL).mData = this;
            Arrays.fill(fArr, Float.NaN);
            return;
        }
        this.A0B = null;
    }

    public static int A02(ReactShadowNodeImpl reactShadowNodeImpl) {
        Integer BWB = reactShadowNodeImpl.BWB();
        if (BWB == C05F.A0C) {
            return reactShadowNodeImpl.A06;
        }
        if (BWB != C05F.A01) {
            return 1;
        }
        return 1 + reactShadowNodeImpl.A06;
    }

    public static void A04(ReactShadowNodeImpl reactShadowNodeImpl, int i) {
        Integer BWB = reactShadowNodeImpl.BWB();
        Integer num = C05F.A00;
        if (BWB != num) {
            for (ReactShadowNodeImpl reactShadowNodeImpl2 = reactShadowNodeImpl.A09; reactShadowNodeImpl2 != null; reactShadowNodeImpl2 = reactShadowNodeImpl2.A09) {
                reactShadowNodeImpl2.A06 += i;
                if (reactShadowNodeImpl2.BWB() == num) {
                    return;
                }
            }
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public Iterable AFA() {
        if (A0B()) {
            return null;
        }
        return this.A0F;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void APL() {
        if (!Cfz()) {
            YogaNative.jni_YGNodeMarkDirtyJNI(((YogaNodeJNIBase) this.A0B).mNativePointer);
            return;
        }
        ReactShadowNodeImpl reactShadowNodeImpl = this.A09;
        if (reactShadowNodeImpl == null) {
            return;
        }
        reactShadowNodeImpl.APL();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final Integer BWB() {
        if (!Cfz() && !this.A0H) {
            if (A0A()) {
                return C05F.A01;
            }
            return C05F.A00;
        }
        return C05F.A0C;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void Eff(R3N r3n) {
        this.A0A = r3n;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void FBr(SKS sks) {
        Class<?> cls = getClass();
        Map map = C63104Sd8.A00;
        ViewManagerPropertyUpdater$ShadowNodeSetter viewManagerPropertyUpdater$ShadowNodeSetter = (ViewManagerPropertyUpdater$ShadowNodeSetter) map.get(cls);
        if (viewManagerPropertyUpdater$ShadowNodeSetter == null) {
            viewManagerPropertyUpdater$ShadowNodeSetter = (ViewManagerPropertyUpdater$ShadowNodeSetter) C63104Sd8.A00(cls);
            if (viewManagerPropertyUpdater$ShadowNodeSetter == null) {
                viewManagerPropertyUpdater$ShadowNodeSetter = new ViewManagerPropertyUpdater$FallbackShadowNodeSetter(cls);
            }
            map.put(cls, viewManagerPropertyUpdater$ShadowNodeSetter);
        }
        Iterator entryIterator = sks.A00.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(entryIterator);
            viewManagerPropertyUpdater$ShadowNodeSetter.Ebo(this, A1K.getValue(), AbstractC31172DnG.A17(A1K));
        }
    }
}
