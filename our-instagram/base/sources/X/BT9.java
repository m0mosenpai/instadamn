package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import androidx.compose.ui.platform.AndroidComposeView;
import com.facebook.R;

/* loaded from: classes5.dex */
public final class BT9 extends ViewGroup implements C59C, C59D, InterfaceC12520kw {
    public static final InterfaceC16660sJ A0U = C29982DJu.A00;
    public int A00;
    public int A01;
    public Modifier A02;
    public InterfaceC1128957x A03;
    public InterfaceC16820sZ A04;
    public InterfaceC16820sZ A05;
    public InterfaceC16820sZ A06;
    public InterfaceC16660sJ A07;
    public InterfaceC16660sJ A08;
    public InterfaceC16660sJ A09;
    public InterfaceC16660sJ A0A;
    public InterfaceC16660sJ A0B;
    public InterfaceC16660sJ A0C;
    public boolean A0D;
    public boolean A0E;
    public InterfaceC138116Np A0F;
    public C07X A0G;
    public InterfaceC08430c6 A0H;
    public final View A0I;
    public final View A0J;
    public final InterfaceC117845Uu A0K;
    public final NestedScrollDispatcher A0L;
    public final NestedScrollDispatcher A0M;
    public final AnonymousClass599 A0N;
    public final InterfaceC1128457r A0O;
    public final C03K A0P;
    public final String A0Q;
    public final InterfaceC16820sZ A0R;
    public final InterfaceC16820sZ A0S;
    public final int[] A0T;

    public static final void A02(BT9 bt9) {
        bt9.setSavableRegistryEntry(null);
    }

    @Override // X.InterfaceC17990uc
    public final boolean Do4(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region != null) {
            int[] iArr = this.A0T;
            getLocationInWindow(iArr);
            int i = iArr[0];
            region.op(i, iArr[1], i + getWidth(), iArr[1] + getHeight(), Region.Op.DIFFERENCE);
        }
        return true;
    }

    public /* synthetic */ C5TM getSubCompositionView() {
        return null;
    }

    public View getViewRoot() {
        return this;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (this.A0J.isNestedScrollingEnabled()) {
            long A00 = AbstractC25248BFh.A00(f * (-1.0f), f2 * (-1.0f));
            C19L c19l = (C19L) this.A0M.A01.invoke();
            if (c19l != null) {
                AbstractC166987dD.A1Z(new MBs(this, (InterfaceC23621Ds) null, 3, A00), c19l);
            } else {
                throw AbstractC166987dD.A14(AbstractC111324zv.A00(2528));
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public static final int A00(int i, int i2, int i3) {
        if (i3 < 0 && i != i2) {
            if (i3 == -2) {
                if (i2 != Integer.MAX_VALUE) {
                    return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
                }
            } else if (i3 == -1 && i2 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i2, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
            }
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        return View.MeasureSpec.makeMeasureSpec(C17s.A03(i3, i, i2), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
    }

    private final void setSavableRegistryEntry(InterfaceC138116Np interfaceC138116Np) {
        InterfaceC138116Np interfaceC138116Np2 = this.A0F;
        if (interfaceC138116Np2 != null) {
            interfaceC138116Np2.F9T();
        }
        this.A0F = interfaceC138116Np;
    }

    @Override // X.C59C
    public final void D9L() {
        this.A05.invoke();
        removeAllViewsInLayout();
    }

    @Override // X.InterfaceC17990uc
    public final void DVE(View view, int[] iArr, int i, int i2, int i3) {
        long j;
        if (this.A0J.isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.A0M;
            long A00 = AbstractC119395aw.A00(i * (-1.0f), i2 * (-1.0f));
            int i4 = 2;
            if (i3 == 0) {
                i4 = 1;
            }
            NestedScrollNode A002 = nestedScrollDispatcher.A00();
            if (A002 != null) {
                j = A002.DaA(A00, i4);
            } else {
                j = 0;
            }
            iArr[0] = BHJ.A00(C119365at.A01(j));
            iArr[1] = BHJ.A00(C119365at.A02(j));
        }
    }

    @Override // X.InterfaceC17990uc
    public final void DVF(View view, int i, int i2, int i3, int i4, int i5) {
        if (this.A0J.isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.A0M;
            long A00 = AbstractC119395aw.A00(i * (-1.0f), i2 * (-1.0f));
            long A002 = AbstractC119395aw.A00(i3 * (-1.0f), i4 * (-1.0f));
            int i6 = 2;
            if (i5 == 0) {
                i6 = 1;
            }
            NestedScrollNode A003 = nestedScrollDispatcher.A00();
            if (A003 != null) {
                A003.Da2(A00, A002, i6);
            }
        }
    }

    @Override // X.InterfaceC12520kw
    public final void DVG(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        long j;
        if (this.A0J.isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.A0M;
            long A00 = AbstractC119395aw.A00(i * (-1.0f), i2 * (-1.0f));
            long A002 = AbstractC119395aw.A00(i3 * (-1.0f), i4 * (-1.0f));
            int i6 = 2;
            if (i5 == 0) {
                i6 = 1;
            }
            NestedScrollNode A003 = nestedScrollDispatcher.A00();
            if (A003 != null) {
                j = A003.Da2(A00, A002, i6);
            } else {
                j = 0;
            }
            iArr[0] = BHJ.A00(C119365at.A01(j));
            iArr[1] = BHJ.A00(C119365at.A02(j));
        }
    }

    @Override // X.InterfaceC17990uc
    public final void DVH(View view, View view2, int i, int i2) {
        C03K c03k = this.A0P;
        if (i2 == 1) {
            c03k.A00 = i;
        } else {
            c03k.A01 = i;
        }
    }

    @Override // X.C59C
    public final void DeW() {
        this.A04.invoke();
    }

    @Override // X.C59C
    public final void DhJ() {
        View view = this.A0J;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.A05.invoke();
        }
    }

    @Override // X.InterfaceC17990uc
    public final void Dow(View view, int i) {
        C03K c03k = this.A0P;
        if (i == 1) {
            c03k.A00 = 0;
        } else {
            c03k.A01 = 0;
        }
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.A0J.getLayoutParams();
        if (layoutParams == null) {
            return new ViewGroup.LayoutParams(-1, -1);
        }
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C03K c03k = this.A0P;
        return c03k.A01 | c03k.A00;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.A0J.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A0J.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.A0J;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (this.A0J.isNestedScrollingEnabled()) {
            long A00 = AbstractC25248BFh.A00(f * (-1.0f), f2 * (-1.0f));
            C19L c19l = (C19L) this.A0M.A01.invoke();
            if (c19l != null) {
                AbstractC166987dD.A1Z(new MBW(this, null, A00, z), c19l);
            } else {
                throw AbstractC166987dD.A14(AbstractC111324zv.A00(2528));
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        InterfaceC16660sJ interfaceC16660sJ = this.A09;
        if (interfaceC16660sJ != null) {
            AbstractC25227BEk.A1Q(interfaceC16660sJ, z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(InterfaceC1128957x interfaceC1128957x) {
        if (interfaceC1128957x != this.A03) {
            this.A03 = interfaceC1128957x;
            InterfaceC16660sJ interfaceC16660sJ = this.A07;
            if (interfaceC16660sJ != null) {
                interfaceC16660sJ.invoke(interfaceC1128957x);
            }
        }
    }

    public final void setLifecycleOwner(C07X c07x) {
        if (c07x != this.A0G) {
            this.A0G = c07x;
            AbstractC55832hO.A01(this, c07x);
        }
    }

    public final void setModifier(Modifier modifier) {
        if (modifier != this.A02) {
            this.A02 = modifier;
            InterfaceC16660sJ interfaceC16660sJ = this.A08;
            if (interfaceC16660sJ != null) {
                interfaceC16660sJ.invoke(modifier);
            }
        }
    }

    public final void setReleaseBlock(InterfaceC16660sJ interfaceC16660sJ) {
        this.A0A = interfaceC16660sJ;
        this.A04 = new C57514Pfo(this, 8);
    }

    public final void setResetBlock(InterfaceC16660sJ interfaceC16660sJ) {
        this.A0B = interfaceC16660sJ;
        this.A05 = new C57514Pfo(this, 9);
    }

    public final void setSavedStateRegistryOwner(InterfaceC08430c6 interfaceC08430c6) {
        if (interfaceC08430c6 != this.A0H) {
            this.A0H = interfaceC08430c6;
            AbstractC55842hQ.A01(this, interfaceC08430c6);
        }
    }

    public final void setUpdate(InterfaceC16820sZ interfaceC16820sZ) {
        this.A06 = interfaceC16820sZ;
        this.A0D = true;
        this.A0S.invoke();
    }

    public final void setUpdateBlock(InterfaceC16660sJ interfaceC16660sJ) {
        this.A0C = interfaceC16660sJ;
        setUpdate(new C57514Pfo(this, 10));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.03K] */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.5Yr, java.lang.Object, X.0sJ] */
    public BT9(Context context, C57I c57i, InterfaceC117845Uu interfaceC117845Uu, InterfaceC1128457r interfaceC1128457r, InterfaceC16660sJ interfaceC16660sJ, int i) {
        super(context);
        SparseArray<Parcelable> sparseArray;
        View view = (View) interfaceC16660sJ.invoke(context);
        NestedScrollDispatcher nestedScrollDispatcher = new NestedScrollDispatcher();
        this.A0M = nestedScrollDispatcher;
        this.A0J = view;
        this.A0O = interfaceC1128457r;
        setTag(R.id.androidx_compose_ui_view_composition_context, c57i);
        setSaveFromParentEnabled(false);
        addView(view);
        this.A06 = D9m.A00;
        this.A05 = D9l.A00;
        this.A04 = D9k.A00;
        C1130158n c1130158n = Modifier.A00;
        this.A02 = c1130158n;
        this.A03 = new AnonymousClass582(1.0f, 1.0f);
        this.A0S = new C57514Pfo(this, 6);
        this.A0R = new C57514Pfo(this, 5);
        this.A0T = new int[2];
        this.A01 = Integer.MIN_VALUE;
        this.A00 = Integer.MIN_VALUE;
        this.A0P = new Object();
        AnonymousClass599 anonymousClass599 = new AnonymousClass599(false, AnonymousClass598.A00.addAndGet(1));
        anonymousClass599.A0E = this;
        Modifier A00 = AnonymousClass598.A00(AbstractC25229BEm.A0V(c1130158n, BUK.A00, this.A0M), C29984DJw.A00, true);
        C118735Ys c118735Ys = new C118735Ys();
        c118735Ys.A01 = DRU.A00(this, 32);
        ?? obj = new Object();
        C118725Yr c118725Yr = c118735Ys.A00;
        if (c118725Yr != null) {
            c118725Yr.A00 = null;
        }
        c118735Ys.A00 = obj;
        obj.A00 = c118735Ys;
        this.A09 = obj;
        Modifier A0X = AbstractC25229BEm.A0X(AbstractC119675bQ.A00(A00.Eq3(c118735Ys), new DHZ(13, anonymousClass599, this, this)), new C65076Td9(7, this, anonymousClass599));
        anonymousClass599.EZG(this.A02.Eq3(A0X));
        this.A08 = new C65076Td9(4, anonymousClass599, A0X);
        anonymousClass599.ETE(this.A03);
        this.A07 = DRU.A00(anonymousClass599, 41);
        anonymousClass599.A0G = new C65076Td9(5, this, anonymousClass599);
        anonymousClass599.A0H = DRU.A00(this, 42);
        anonymousClass599.EYi(new C28832Co2(0, anonymousClass599, this));
        this.A0N = anonymousClass599;
        this.A0I = view;
        this.A0L = nestedScrollDispatcher;
        this.A0K = interfaceC117845Uu;
        setClipChildren(false);
        String valueOf = String.valueOf(i);
        this.A0Q = valueOf;
        Object AJe = interfaceC117845Uu != null ? interfaceC117845Uu.AJe(valueOf) : null;
        if ((AJe instanceof SparseArray) && (sparseArray = (SparseArray) AJe) != null) {
            view.restoreHierarchyState(sparseArray);
        }
        InterfaceC117845Uu interfaceC117845Uu2 = this.A0K;
        if (interfaceC117845Uu2 != null) {
            setSavableRegistryEntry(interfaceC117845Uu2.EDf(this.A0Q, new C57514Pfo(this, 7)));
        }
        InterfaceC16660sJ interfaceC16660sJ2 = AbstractC28450Cgz.A00;
        this.A0C = interfaceC16660sJ2;
        this.A0B = interfaceC16660sJ2;
        this.A0A = interfaceC16660sJ2;
    }

    public static final /* synthetic */ C5BV A01(BT9 bt9) {
        return bt9.getSnapshotObserver();
    }

    public final C5BV getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            AbstractC28290Cdc.A01("Expected AndroidViewHolder to be attached when observing reads.");
            throw C00O.createAndThrow();
        }
        return ((AndroidComposeView) this.A0O).A0b;
    }

    @Override // X.C59D
    public final boolean CfU() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final InterfaceC1128957x getDensity() {
        return this.A03;
    }

    public final NestedScrollDispatcher getDispatcher() {
        return this.A0L;
    }

    public final View getInteropView() {
        return this.A0J;
    }

    public final AnonymousClass599 getLayoutNode() {
        return this.A0N;
    }

    public final C07X getLifecycleOwner() {
        return this.A0G;
    }

    public final Modifier getModifier() {
        return this.A02;
    }

    public final InterfaceC16660sJ getOnDensityChanged$ui_release() {
        return this.A07;
    }

    public final InterfaceC16660sJ getOnModifierChanged$ui_release() {
        return this.A08;
    }

    public final InterfaceC16660sJ getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.A09;
    }

    public final InterfaceC16820sZ getRelease() {
        return this.A04;
    }

    public final InterfaceC16660sJ getReleaseBlock() {
        return this.A0A;
    }

    public final InterfaceC16820sZ getReset() {
        return this.A05;
    }

    public final InterfaceC16660sJ getResetBlock() {
        return this.A0B;
    }

    public final InterfaceC08430c6 getSavedStateRegistryOwner() {
        return this.A0H;
    }

    public final InterfaceC16820sZ getUpdate() {
        return this.A06;
    }

    public final InterfaceC16660sJ getUpdateBlock() {
        return this.A0C;
    }

    public final View getView() {
        return this.A0J;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (this.A0E) {
            this.A0J.postOnAnimation(new RunnableC29565D0s(this.A0R));
            return null;
        }
        this.A0N.A0J();
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-49646196);
        super.onAttachedToWindow();
        this.A0S.invoke();
        C0f9.A0D(612489332, A06);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (this.A0E) {
            this.A0J.postOnAnimation(new RunnableC29565D0s(this.A0R));
        } else {
            this.A0N.A0J();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(580764336);
        super.onDetachedFromWindow();
        C57S c57s = getSnapshotObserver().A00.A05;
        synchronized (c57s) {
            int i = c57s.A00;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                C5BX c5bx = (C5BX) c57s.A02[i3];
                C18630vq c18630vq = (C18630vq) c5bx.A04.A07(this);
                if (c18630vq != null) {
                    Object[] objArr = c18630vq.A04;
                    long[] jArr = c18630vq.A03;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i4 = 0;
                        while (true) {
                            long j = jArr[i4];
                            if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i5 = 8 - (((i4 - length) ^ (-1)) >>> 31);
                                for (int i6 = 0; i6 < i5; i6++) {
                                    if ((255 & j) < 128) {
                                        C5BX.A01(c5bx, this, objArr[(i4 << 3) + i6]);
                                    }
                                    j >>= 8;
                                }
                                if (i5 != 8) {
                                    break;
                                }
                            }
                            if (i4 == length) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                    }
                }
                if (c5bx.A04.A01 != 0) {
                    if (i2 > 0) {
                        Object[] objArr2 = c57s.A02;
                        objArr2[i3 - i2] = objArr2[i3];
                    }
                } else {
                    i2++;
                }
            }
            int i7 = i - i2;
            AbstractC06960Yn.A0V(c57s.A02, i7, i);
            c57s.A00 = i7;
        }
        C0f9.A0D(-1556579525, A06);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        int A06 = C0f9.A06(-162848620);
        super.onWindowVisibilityChanged(i);
        C0f9.A0D(46239234, A06);
    }

    public final void setOnDensityChanged$ui_release(InterfaceC16660sJ interfaceC16660sJ) {
        this.A07 = interfaceC16660sJ;
    }

    public final void setOnModifierChanged$ui_release(InterfaceC16660sJ interfaceC16660sJ) {
        this.A08 = interfaceC16660sJ;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(InterfaceC16660sJ interfaceC16660sJ) {
        this.A09 = interfaceC16660sJ;
    }

    public final void setRelease(InterfaceC16820sZ interfaceC16820sZ) {
        this.A04 = interfaceC16820sZ;
    }

    public final void setReset(InterfaceC16820sZ interfaceC16820sZ) {
        this.A05 = interfaceC16820sZ;
    }
}
