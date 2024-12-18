package com.facebook.yoga;

import X.AbstractC78513fH;
import X.AbstractC78533fL;
import X.AnonymousClass001;
import X.C05F;
import X.C78633fV;
import X.EnumC77763e0;
import X.EnumC78563fO;
import X.EnumC78643fW;
import X.InterfaceC50872Vi;
import X.InterfaceC65378TjB;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class YogaNodeJNIBase extends AbstractC78533fL implements Cloneable {
    public float[] arr;
    public InterfaceC65378TjB mBaselineFunction;
    public List mChildren;
    public AbstractC78513fH mConfig;
    public Object mData;
    public boolean mHasNewLayout;
    public int mLayoutDirection;
    public InterfaceC50872Vi mMeasureFunction;
    public long mNativePointer;
    public YogaNodeJNIBase mOwner;

    public static C78633fV valueFromLong(long j) {
        Integer num;
        float intBitsToFloat = Float.intBitsToFloat((int) j);
        int i = (int) (j >> 32);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        num = C05F.A0N;
                    } else {
                        throw new IllegalArgumentException(AnonymousClass001.A0O("Unknown enum value: ", i));
                    }
                } else {
                    num = C05F.A0C;
                }
            } else {
                num = C05F.A01;
            }
        } else {
            num = C05F.A00;
        }
        return new C78633fV(num, intBitsToFloat);
    }

    public final long measure(float f, int i, float f2, int i2) {
        EnumC78643fW enumC78643fW;
        EnumC78643fW enumC78643fW2;
        InterfaceC50872Vi interfaceC50872Vi = this.mMeasureFunction;
        if (interfaceC50872Vi != null) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        enumC78643fW = EnumC78643fW.AT_MOST;
                    } else {
                        throw new IllegalArgumentException(AnonymousClass001.A0O("Unknown enum value: ", i));
                    }
                } else {
                    enumC78643fW = EnumC78643fW.EXACTLY;
                }
            } else {
                enumC78643fW = EnumC78643fW.UNDEFINED;
            }
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        enumC78643fW2 = EnumC78643fW.AT_MOST;
                    } else {
                        throw new IllegalArgumentException(AnonymousClass001.A0O("Unknown enum value: ", i2));
                    }
                } else {
                    enumC78643fW2 = EnumC78643fW.EXACTLY;
                }
            } else {
                enumC78643fW2 = EnumC78643fW.UNDEFINED;
            }
            return interfaceC50872Vi.CpA(enumC78643fW, enumC78643fW2, this, f, f2);
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        List list = this.mChildren;
        if (list != null) {
            list.remove(i);
            this.mChildren.add(i, yogaNodeJNIBase);
            yogaNodeJNIBase.mOwner = this;
            return yogaNodeJNIBase.mNativePointer;
        }
        throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
    }

    @Override // X.AbstractC78533fL
    public void addChildAt(AbstractC78533fL abstractC78533fL, int i) {
        if (abstractC78533fL instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) abstractC78533fL;
            if (yogaNodeJNIBase.mOwner == null) {
                List list = this.mChildren;
                if (list == null) {
                    list = new ArrayList(4);
                    this.mChildren = list;
                }
                list.add(i, yogaNodeJNIBase);
                yogaNodeJNIBase.mOwner = this;
                YogaNative.jni_YGNodeInsertChildJNI(this.mNativePointer, yogaNodeJNIBase.mNativePointer, i);
                return;
            }
            throw new IllegalStateException("Child already has a parent, it must be removed first.");
        }
    }

    public final float baseline(float f, float f2) {
        return this.mBaselineFunction.ADG(this, f, f2);
    }

    @Override // X.AbstractC78533fL
    public void calculateLayout(float f, float f2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i = 0; i < arrayList.size(); i++) {
            List list = ((YogaNodeJNIBase) arrayList.get(i)).mChildren;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        int length = yogaNodeJNIBaseArr.length;
        long[] jArr = new long[length];
        for (int i2 = 0; i2 < length; i2++) {
            jArr[i2] = yogaNodeJNIBaseArr[i2].mNativePointer;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.mNativePointer, f, f2, jArr, yogaNodeJNIBaseArr);
    }

    @Override // X.AbstractC78533fL
    public float getLayoutBorder(EnumC77763e0 enumC77763e0) {
        float[] fArr = this.arr;
        if (fArr != null) {
            int i = 0;
            int i2 = (int) fArr[0];
            if ((i2 & 4) == 4) {
                int i3 = 4;
                if ((i2 & 1) == 1) {
                    i3 = 0;
                }
                int i4 = 14 - i3;
                if ((i2 & 2) != 2) {
                    i = 4;
                }
                int i5 = i4 - i;
                switch (enumC77763e0) {
                    case LEFT:
                        break;
                    case TOP:
                        i5++;
                        break;
                    case RIGHT:
                        i5 += 2;
                        break;
                    default:
                        i5 += 3;
                        break;
                }
                return fArr[i5];
            }
            return 0.0f;
        }
        return 0.0f;
    }

    @Override // X.AbstractC78533fL
    public EnumC78563fO getLayoutDirection() {
        int i;
        float[] fArr = this.arr;
        if (fArr != null) {
            i = (int) fArr[5];
        } else {
            i = this.mLayoutDirection;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return EnumC78563fO.RTL;
                }
                throw new IllegalArgumentException(AnonymousClass001.A0O("Unknown enum value: ", i));
            }
            return EnumC78563fO.LTR;
        }
        return EnumC78563fO.INHERIT;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (getLayoutDirection() == X.EnumC78563fO.RTL) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        if (getLayoutDirection() == X.EnumC78563fO.RTL) goto L21;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0019. Please report as an issue. */
    @Override // X.AbstractC78533fL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float getLayoutPadding(X.EnumC77763e0 r6) {
        /*
            r5 = this;
            float[] r4 = r5.arr
            if (r4 == 0) goto L40
            r3 = 0
            r0 = r4[r3]
            int r2 = (int) r0
            r1 = 2
            r0 = r2 & 2
            if (r0 != r1) goto L40
            r1 = 1
            r0 = r2 & 1
            if (r0 == r1) goto L13
            r3 = 4
        L13:
            int r2 = 10 - r3
            int r0 = r6.ordinal()
            switch(r0) {
                case 0: goto L32;
                case 1: goto L24;
                case 2: goto L3d;
                case 3: goto L27;
                case 4: goto L35;
                case 5: goto L2a;
                default: goto L1c;
            }
        L1c:
            java.lang.String r1 = "Cannot get layout paddings of multi-edge shorthands"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L24:
            int r2 = r2 + 1
            goto L32
        L27:
            int r2 = r2 + 3
            goto L32
        L2a:
            X.3fO r1 = r5.getLayoutDirection()
            X.3fO r0 = X.EnumC78563fO.RTL
            if (r1 != r0) goto L3d
        L32:
            r0 = r4[r2]
            return r0
        L35:
            X.3fO r1 = r5.getLayoutDirection()
            X.3fO r0 = X.EnumC78563fO.RTL
            if (r1 != r0) goto L32
        L3d:
            int r2 = r2 + 2
            goto L32
        L40:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.yoga.YogaNodeJNIBase.getLayoutPadding(X.3e0):float");
    }

    @Override // X.AbstractC78533fL
    public /* bridge */ /* synthetic */ AbstractC78533fL removeChildAt(int i) {
        List list = this.mChildren;
        if (list != null) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) list.remove(i);
            yogaNodeJNIBase.mOwner = null;
            YogaNative.jni_YGNodeRemoveChildJNI(this.mNativePointer, yogaNodeJNIBase.mNativePointer);
            return yogaNodeJNIBase;
        }
        throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
    }

    public YogaNodeJNIBase(long j) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.mHasNewLayout = true;
        if (j != 0) {
            this.mNativePointer = j;
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        throw new java.lang.IllegalStateException("YogaNode does not have children");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.facebook.yoga.YogaNodeJNIBase cloneWithChildren() {
        /*
            r6 = this;
            java.lang.Object r5 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L57
            com.facebook.yoga.YogaNodeJNIBase r5 = (com.facebook.yoga.YogaNodeJNIBase) r5     // Catch: java.lang.CloneNotSupportedException -> L57
            java.util.List r1 = r5.mChildren     // Catch: java.lang.CloneNotSupportedException -> L57
            if (r1 == 0) goto L11
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.CloneNotSupportedException -> L57
            r0.<init>(r1)     // Catch: java.lang.CloneNotSupportedException -> L57
            r5.mChildren = r0     // Catch: java.lang.CloneNotSupportedException -> L57
        L11:
            long r0 = r6.mNativePointer     // Catch: java.lang.CloneNotSupportedException -> L57
            long r1 = com.facebook.yoga.YogaNative.jni_YGNodeCloneJNI(r0)     // Catch: java.lang.CloneNotSupportedException -> L57
            r0 = 0
            r5.mOwner = r0     // Catch: java.lang.CloneNotSupportedException -> L57
            r5.mNativePointer = r1     // Catch: java.lang.CloneNotSupportedException -> L57
            r4 = 0
        L1d:
            java.util.List r0 = r5.mChildren     // Catch: java.lang.CloneNotSupportedException -> L57
            if (r0 != 0) goto L22
            goto L27
        L22:
            int r0 = r0.size()     // Catch: java.lang.CloneNotSupportedException -> L57
            goto L28
        L27:
            r0 = 0
        L28:
            if (r4 >= r0) goto L56
            java.util.List r0 = r5.mChildren     // Catch: java.lang.CloneNotSupportedException -> L57
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.CloneNotSupportedException -> L57
            com.facebook.yoga.YogaNodeJNIBase r0 = (com.facebook.yoga.YogaNodeJNIBase) r0     // Catch: java.lang.CloneNotSupportedException -> L57
            com.facebook.yoga.YogaNodeJNIBase r1 = r0.cloneWithChildren()     // Catch: java.lang.CloneNotSupportedException -> L57
            java.util.List r0 = r5.mChildren     // Catch: java.lang.CloneNotSupportedException -> L57
            r0.remove(r4)     // Catch: java.lang.CloneNotSupportedException -> L57
            java.util.List r0 = r5.mChildren     // Catch: java.lang.CloneNotSupportedException -> L57
            r0.add(r4, r1)     // Catch: java.lang.CloneNotSupportedException -> L57
            r1.mOwner = r5     // Catch: java.lang.CloneNotSupportedException -> L57
            long r2 = r5.mNativePointer     // Catch: java.lang.CloneNotSupportedException -> L57
            long r0 = r1.mNativePointer     // Catch: java.lang.CloneNotSupportedException -> L57
            com.facebook.yoga.YogaNative.jni_YGNodeSwapChildJNI(r2, r0, r4)     // Catch: java.lang.CloneNotSupportedException -> L57
            int r4 = r4 + 1
            goto L1d
        L4e:
            java.lang.String r1 = "YogaNode does not have children"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.CloneNotSupportedException -> L57
            r0.<init>(r1)     // Catch: java.lang.CloneNotSupportedException -> L57
            throw r0     // Catch: java.lang.CloneNotSupportedException -> L57
        L56:
            return r5
        L57:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.yoga.YogaNodeJNIBase.cloneWithChildren():com.facebook.yoga.YogaNodeJNIBase");
    }

    @Override // X.AbstractC78533fL
    public /* bridge */ /* synthetic */ AbstractC78533fL cloneWithoutChildren() {
        try {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) super.clone();
            long jni_YGNodeCloneJNI = YogaNative.jni_YGNodeCloneJNI(this.mNativePointer);
            yogaNodeJNIBase.mOwner = null;
            yogaNodeJNIBase.mNativePointer = jni_YGNodeCloneJNI;
            yogaNodeJNIBase.mChildren = null;
            YogaNative.jni_YGNodeRemoveAllChildrenJNI(jni_YGNodeCloneJNI);
            return yogaNodeJNIBase;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }
}
