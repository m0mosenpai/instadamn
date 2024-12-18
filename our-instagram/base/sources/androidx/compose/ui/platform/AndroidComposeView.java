package androidx.compose.ui.platform;

import X.AbstractC010103p;
import X.AbstractC06960Yn;
import X.AbstractC09790fc;
import X.AbstractC113765Bo;
import X.AbstractC114335Dx;
import X.AbstractC119015aI;
import X.AbstractC119035aK;
import X.AbstractC119395aw;
import X.AbstractC130985vm;
import X.AbstractC25332BJb;
import X.AbstractC27749CLq;
import X.AbstractC28289Cdb;
import X.AbstractC28290Cdc;
import X.AbstractC28485Chd;
import X.AbstractC46526KiR;
import X.AbstractC55832hO;
import X.AbstractC55842hQ;
import X.AbstractC58317Pt9;
import X.AbstractC63123SdR;
import X.AbstractC74873Yc;
import X.AbstractC74903Yf;
import X.AnonymousClass001;
import X.AnonymousClass014;
import X.AnonymousClass583;
import X.AnonymousClass590;
import X.AnonymousClass591;
import X.AnonymousClass593;
import X.AnonymousClass595;
import X.AnonymousClass596;
import X.AnonymousClass598;
import X.AnonymousClass599;
import X.B6B;
import X.BIB;
import X.BIL;
import X.BJR;
import X.BJY;
import X.BJZ;
import X.C00O;
import X.C07T;
import X.C07X;
import X.C0eB;
import X.C0f9;
import X.C1128757v;
import X.C1129758g;
import X.C1131158z;
import X.C113385Aa;
import X.C113425Ae;
import X.C113455Ah;
import X.C113675Bf;
import X.C113685Bg;
import X.C113735Bl;
import X.C113775Bp;
import X.C113835Bv;
import X.C114185Df;
import X.C114205Dh;
import X.C114215Dj;
import X.C119225ae;
import X.C119345ar;
import X.C119365at;
import X.C119455b2;
import X.C119465b3;
import X.C121635fE;
import X.C12W;
import X.C137456Kq;
import X.C141786av;
import X.C14360o3;
import X.C18590vm;
import X.C18630vq;
import X.C206789Dj;
import X.C206999Ee;
import X.C207669Gu;
import X.C25085B8h;
import X.C25254BFs;
import X.C25255BFt;
import X.C28456Ch6;
import X.C3Z5;
import X.C57S;
import X.C58B;
import X.C58G;
import X.C58H;
import X.C58I;
import X.C58J;
import X.C58Q;
import X.C58R;
import X.C58S;
import X.C58T;
import X.C58U;
import X.C58W;
import X.C58X;
import X.C58Z;
import X.C58p;
import X.C59J;
import X.C59S;
import X.C59W;
import X.C5AJ;
import X.C5AW;
import X.C5AY;
import X.C5AZ;
import X.C5BA;
import X.C5BB;
import X.C5BE;
import X.C5BF;
import X.C5BH;
import X.C5BI;
import X.C5BJ;
import X.C5BK;
import X.C5BM;
import X.C5BQ;
import X.C5BR;
import X.C5BS;
import X.C5BT;
import X.C5BU;
import X.C5BV;
import X.C5BW;
import X.C5BX;
import X.C5D0;
import X.C5D2;
import X.C5D4;
import X.C5D8;
import X.C5DA;
import X.C5DD;
import X.C5DO;
import X.C5DP;
import X.C5DQ;
import X.C5DR;
import X.C5DS;
import X.C5DT;
import X.C5EK;
import X.C5EL;
import X.C5EO;
import X.C5U5;
import X.C5U6;
import X.C5U9;
import X.C9EV;
import X.DH1;
import X.InterfaceC08430c6;
import X.InterfaceC09390do;
import X.InterfaceC1127157b;
import X.InterfaceC1128457r;
import X.InterfaceC1128557s;
import X.InterfaceC1128657u;
import X.InterfaceC1128957x;
import X.InterfaceC1130458r;
import X.InterfaceC113845Bw;
import X.InterfaceC114195Dg;
import X.InterfaceC114245Dn;
import X.InterfaceC119265ai;
import X.InterfaceC16620sF;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import X.InterfaceC65626Tpm;
import X.InterfaceC74953Yl;
import X.InterfaceC74963Ym;
import X.RunnableC114225Dk;
import X.SI1;
import X.ViewOnDragListenerC1130358q;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Point;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.os.Build;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.key.KeyInputElement;
import androidx.compose.ui.input.rotary.RotaryInputElement;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.compose.ui.text.font.AndroidFontLoader;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.unit.Constraints;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* loaded from: classes3.dex */
public final class AndroidComposeView extends ViewGroup implements InterfaceC1128457r, InterfaceC1128557s, InterfaceC65626Tpm, ViewRootForTest {
    public static Class A1H;
    public static Method A1I;
    public long A00;
    public long A01;
    public long A02;
    public MotionEvent A03;
    public AndroidContentCaptureManager A04;
    public C12W A05;
    public InterfaceC16660sJ A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public int A0C;
    public long A0D;
    public long A0E;
    public C137456Kq A0F;
    public BIL A0G;
    public Constraints A0H;
    public List A0I;
    public InterfaceC16660sJ A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public final C5BR A0P;
    public final C5BI A0Q;
    public final InterfaceC1130458r A0R;
    public final C58X A0S;
    public final C5BH A0T;
    public final C5DP A0U;
    public final C5DQ A0V;
    public final C5EO A0W;
    public final C5DT A0X;
    public final AnonymousClass599 A0Y;
    public final C1128757v A0Z;
    public final C113675Bf A0a;
    public final C5BV A0b;
    public final C5BE A0c;
    public final C5BT A0d;
    public final RunnableC114225Dk A0e;
    public final AndroidComposeViewAccessibilityDelegateCompat A0f;
    public final InterfaceC114245Dn A0g;
    public final C5D2 A0h;
    public final InterfaceC114195Dg A0i;
    public final C59J A0j;
    public final C1131158z A0k;
    public final C113455Ah A0l;
    public final C5D4 A0m;
    public final C5D0 A0n;
    public final float[] A0o;
    public final float[] A0p;
    public final float[] A0q;
    public final ViewTreeObserver.OnGlobalLayoutListener A0r;
    public final ViewTreeObserver.OnScrollChangedListener A0s;
    public final ViewTreeObserver.OnTouchModeChangeListener A0t;
    public final InterfaceC74953Yl A0u;
    public final InterfaceC74953Yl A0v;
    public final InterfaceC74953Yl A0w;
    public final InterfaceC74953Yl A0x;
    public final InterfaceC74963Ym A0y;
    public final C57S A0z;
    public final Modifier A10;
    public final Modifier A11;
    public final AnonymousClass595 A12;
    public final C5BJ A13;
    public final C5BK A14;
    public final InterfaceC1128657u A15;
    public final ViewOnDragListenerC1130358q A16;
    public final C114215Dj A17;
    public final C5EL A18;
    public final EmptySemanticsElement A19;
    public final C58I A1A;
    public final C113835Bv A1B;
    public final Runnable A1C;
    public final List A1D;
    public final AtomicReference A1E;
    public final InterfaceC16820sZ A1F;
    public final int[] A1G;

    public static final void A06(MotionEvent motionEvent, AndroidComposeView androidComposeView, int i, long j, boolean z) {
        int buttonState;
        long downTime;
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int i3 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i3 = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            i3 = 0;
        }
        int pointerCount = motionEvent.getPointerCount();
        int i4 = 0;
        if (i3 >= 0) {
            i4 = 1;
        }
        int i5 = pointerCount - i4;
        if (i5 != 0) {
            MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                pointerPropertiesArr[i6] = new MotionEvent.PointerProperties();
            }
            MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[i5];
            for (int i7 = 0; i7 < i5; i7++) {
                pointerCoordsArr[i7] = new MotionEvent.PointerCoords();
            }
            for (int i8 = 0; i8 < i5; i8++) {
                if (i3 >= 0) {
                    i2 = 1;
                    if (i8 >= i3) {
                        int i9 = i2 + i8;
                        motionEvent.getPointerProperties(i9, pointerPropertiesArr[i8]);
                        MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i8];
                        motionEvent.getPointerCoords(i9, pointerCoords);
                        long Cho = androidComposeView.Cho(AbstractC119395aw.A00(pointerCoords.x, pointerCoords.y));
                        pointerCoords.x = C119365at.A01(Cho);
                        pointerCoords.y = C119365at.A02(Cho);
                    }
                }
                i2 = 0;
                int i92 = i2 + i8;
                motionEvent.getPointerProperties(i92, pointerPropertiesArr[i8]);
                MotionEvent.PointerCoords pointerCoords2 = pointerCoordsArr[i8];
                motionEvent.getPointerCoords(i92, pointerCoords2);
                long Cho2 = androidComposeView.Cho(AbstractC119395aw.A00(pointerCoords2.x, pointerCoords2.y));
                pointerCoords2.x = C119365at.A01(Cho2);
                pointerCoords2.y = C119365at.A02(Cho2);
            }
            if (z) {
                buttonState = 0;
            } else {
                buttonState = motionEvent.getButtonState();
            }
            if (motionEvent.getDownTime() == motionEvent.getEventTime()) {
                downTime = j;
            } else {
                downTime = motionEvent.getDownTime();
            }
            MotionEvent obtain = MotionEvent.obtain(downTime, j, i, i5, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), buttonState, motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
            C25255BFt A00 = androidComposeView.A13.A00(obtain, androidComposeView);
            C14360o3.A0A(A00);
            androidComposeView.A14.A00(A00, androidComposeView, true);
            obtain.recycle();
        }
    }

    @Deprecated(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @ReplaceWith(expression = "fontFamilyResolver", imports = {}))
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.BIL, android.view.View] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.view.View, androidx.compose.ui.platform.AndroidComposeView] */
    @Override // X.InterfaceC1128457r
    public final InterfaceC119265ai AMT(GraphicsLayer graphicsLayer, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF) {
        Object obj;
        InterfaceC119265ai c119455b2;
        ?? r2;
        if (graphicsLayer != null) {
            return new C119345ar(null, graphicsLayer, this, interfaceC16820sZ, interfaceC16620sF);
        }
        C114215Dj c114215Dj = this.A17;
        while (true) {
            Reference poll = c114215Dj.A01.poll();
            if (poll == null) {
                break;
            }
            c114215Dj.A00.A0B(poll);
        }
        while (true) {
            C57S c57s = c114215Dj.A00;
            int i = c57s.A00;
            if (i != 0) {
                obj = ((Reference) c57s.A00(i - 1)).get();
                if (obj != null) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        InterfaceC119265ai interfaceC119265ai = (InterfaceC119265ai) obj;
        if (interfaceC119265ai != null) {
            interfaceC119265ai.EKy(interfaceC16820sZ, interfaceC16620sF);
            return interfaceC119265ai;
        }
        if (isHardwareAccelerated() && Build.VERSION.SDK_INT != 28) {
            C5BH c5bh = this.A0T;
            c119455b2 = new C119345ar(c5bh, c5bh.AMJ(), this, interfaceC16820sZ, interfaceC16620sF);
        } else {
            if (isHardwareAccelerated() && this.A0M) {
                try {
                    return new BJR(this, interfaceC16820sZ, interfaceC16620sF);
                } catch (Throwable unused) {
                    this.A0M = false;
                }
            }
            if (this.A0G == null) {
                C119465b3 c119465b3 = C119455b2.A0K;
                if (!C119455b2.A0H) {
                    c119465b3.A00(new View(getContext()));
                }
                boolean z = C119455b2.A0I;
                Context context = getContext();
                if (z) {
                    ViewGroup viewGroup = new ViewGroup(context);
                    viewGroup.setClipChildren(false);
                    viewGroup.setTag(R.id.hide_in_inspector_tag, true);
                    r2 = viewGroup;
                } else {
                    ViewGroup viewGroup2 = new ViewGroup(context);
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setTag(R.id.hide_in_inspector_tag, true);
                    r2 = viewGroup2;
                }
                this.A0G = r2;
                addView(r2, -1);
            }
            boolean z2 = C119455b2.A0H;
            BIL bil = this.A0G;
            C14360o3.A0A(bil);
            c119455b2 = new C119455b2(this, bil, interfaceC16820sZ, interfaceC16620sF);
        }
        return c119455b2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // X.InterfaceC1128457r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1JX Eq2(X.InterfaceC23621Ds r12, X.InterfaceC16620sF r13) {
        /*
            r11 = this;
            r10 = 4
            boolean r0 = X.C9CW.A00(r12, r10)
            if (r0 == 0) goto L28
            r4 = r12
            X.9CW r4 = (X.C9CW) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r3 = r4.A01
            X.1JX r2 = X.C1JX.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L30
            if (r1 == r0) goto L4a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L28:
            r0 = 42
            X.9CW r4 = new X.9CW
            r4.<init>(r11, r12, r10, r0)
            goto L15
        L30:
            X.AbstractC09560e7.A00(r3)
            java.util.concurrent.atomic.AtomicReference r7 = r11.A1E
            X.9Ee r8 = new X.9Ee
            r8.<init>(r11, r10)
            r4.A00 = r0
            r9 = 0
            X.MCP r5 = new X.MCP
            r6 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r0 = X.AnonymousClass194.A00(r4, r5)
            if (r0 != r2) goto L4d
            return r2
        L4a:
            X.AbstractC09560e7.A00(r3)
        L4d:
            X.PW2 r0 = new X.PW2
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.Eq2(X.1Ds, X.0sF):X.1JX");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = Class.forName("android.view.View").getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(this, Integer.valueOf(i));
                if (invoke instanceof View) {
                    return (View) invoke;
                }
                return null;
            }
            return A03(this, i);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onCreate(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onDestroy(C07X c07x) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onPause(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStart(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStop(C07X c07x) {
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0141, code lost:
    
        if (r4 != r1) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0060, code lost:
    
        if (r8.getToolType(0) != 3) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int A00(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.A00(android.view.MotionEvent):int");
    }

    public static final int A01(MotionEvent motionEvent, AndroidComposeView androidComposeView) {
        Object obj;
        if (androidComposeView.A0N) {
            androidComposeView.A0N = false;
            C1131158z.A01.Egh(new AnonymousClass591(motionEvent.getMetaState()));
        }
        C5BJ c5bj = androidComposeView.A13;
        C25255BFt A00 = c5bj.A00(motionEvent, androidComposeView);
        if (A00 != null) {
            List list = A00.A01;
            int size = list.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    obj = list.get(size);
                    if (!((C25254BFs) obj).A0A) {
                        if (i < 0) {
                            break;
                        }
                        size = i;
                    } else {
                        break;
                    }
                }
            }
            obj = null;
            C25254BFs c25254BFs = (C25254BFs) obj;
            if (c25254BFs != null) {
                androidComposeView.A0E = c25254BFs.A04;
            }
            int A002 = androidComposeView.A14.A00(A00, androidComposeView, androidComposeView.A0F(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 0 || actionMasked == 5) && (A002 & 1) == 0) {
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                c5bj.A03.delete(pointerId);
                c5bj.A04.delete(pointerId);
            }
            return A002;
        }
        C5BK c5bk = androidComposeView.A14;
        if (!c5bk.A00) {
            c5bk.A02.A00.A07();
            C5BM c5bm = c5bk.A01.A01;
            c5bm.A00();
            c5bm.A00.A01();
            return 0;
        }
        return 0;
    }

    private final View A03(View view, int i) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = Class.forName("android.view.View").getDeclaredMethod("getAccessibilityViewId", new Class[0]);
            declaredMethod.setAccessible(true);
            if (C14360o3.A0K(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View A03 = A03(viewGroup.getChildAt(i2), i);
                    if (A03 != null) {
                        return A03;
                    }
                }
            }
        }
        return null;
    }

    private final void A09(AnonymousClass599 anonymousClass599) {
        int i = 0;
        this.A0a.A0C(anonymousClass599, false);
        C57S A0A = anonymousClass599.A0A();
        int i2 = A0A.A00;
        if (i2 > 0) {
            Object[] objArr = A0A.A02;
            do {
                A09((AnonymousClass599) objArr[i]);
                i++;
            } while (i < i2);
        }
    }

    public static final void A0C(AndroidComposeView androidComposeView) {
        if (!androidComposeView.A0K) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != androidComposeView.A00) {
                androidComposeView.A00 = currentAnimationTimeMillis;
                InterfaceC114245Dn interfaceC114245Dn = androidComposeView.A0g;
                float[] fArr = androidComposeView.A0p;
                interfaceC114245Dn.AFD(androidComposeView, fArr);
                AbstractC130985vm.A00(fArr, androidComposeView.A0q);
                ViewParent parent = androidComposeView.getParent();
                View view = androidComposeView;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = view.getParent();
                }
                int[] iArr = androidComposeView.A1G;
                view.getLocationOnScreen(iArr);
                float f = iArr[0];
                float f2 = iArr[1];
                view.getLocationInWindow(iArr);
                androidComposeView.A02 = AbstractC119395aw.A00(f - iArr[0], f2 - iArr[1]);
            }
        }
    }

    public static final void A0D(AndroidComposeView androidComposeView) {
        int[] iArr = androidComposeView.A1G;
        androidComposeView.getLocationOnScreen(iArr);
        long j = androidComposeView.A0D;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        boolean z = false;
        int i3 = iArr[0];
        if (i != i3 || i2 != iArr[1]) {
            androidComposeView.A0D = AbstractC113765Bo.A00(i3, iArr[1]);
            if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
                androidComposeView.A0Y.A0U.A0J.A0M();
                z = true;
            }
        }
        C113675Bf c113675Bf = androidComposeView.A0a;
        if (z) {
            C113735Bl c113735Bl = c113675Bf.A06;
            AnonymousClass599 anonymousClass599 = c113675Bf.A05;
            C57S c57s = c113735Bl.A01;
            c57s.A01();
            c57s.A09(anonymousClass599);
            anonymousClass599.A0M = true;
        }
        c113675Bf.A06.A01();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C5U5 get_viewTreeOwners() {
        return (C5U5) this.A0u.getValue();
    }

    private void setDensity(InterfaceC1128957x interfaceC1128957x) {
        this.A0v.Egh(interfaceC1128957x);
    }

    private void setFontFamilyResolver(C5DD c5dd) {
        this.A0w.Egh(c5dd);
    }

    private void setLayoutDirection(AnonymousClass583 anonymousClass583) {
        this.A0x.Egh(anonymousClass583);
    }

    private final void set_viewTreeOwners(C5U5 c5u5) {
        this.A0u.Egh(c5u5);
    }

    public final void A0J(InterfaceC119265ai interfaceC119265ai) {
        if (this.A0G != null) {
            boolean z = C119455b2.A0H;
        }
        C114215Dj c114215Dj = this.A17;
        while (true) {
            ReferenceQueue referenceQueue = c114215Dj.A01;
            Reference poll = referenceQueue.poll();
            if (poll != null) {
                c114215Dj.A00.A0B(poll);
            } else {
                c114215Dj.A00.A09(new WeakReference(interfaceC119265ai, referenceQueue));
                return;
            }
        }
    }

    public final void A0K(InterfaceC119265ai interfaceC119265ai, boolean z) {
        List list;
        boolean z2 = this.A0L;
        if (!z) {
            if (!z2) {
                this.A1D.remove(interfaceC119265ai);
                List list2 = this.A0I;
                if (list2 != null) {
                    list2.remove(interfaceC119265ai);
                    return;
                }
                return;
            }
            return;
        }
        if (!z2) {
            list = this.A1D;
        } else {
            list = this.A0I;
            if (list == null) {
                list = new ArrayList();
                this.A0I = list;
            }
        }
        list.add(interfaceC119265ai);
    }

    @Override // X.InterfaceC1128457r
    public final void CpG(boolean z) {
        C113675Bf c113675Bf = this.A0a;
        if ((!c113675Bf.A04.A01()) || c113675Bf.A06.A01.A00 != 0) {
            AbstractC09790fc.A01("AndroidOwner:measureAndLayout", 767398991);
            InterfaceC16820sZ interfaceC16820sZ = null;
            if (z) {
                try {
                    interfaceC16820sZ = this.A1F;
                } catch (Throwable th) {
                    AbstractC09790fc.A00(1535746549);
                    throw th;
                }
            }
            if (c113675Bf.A0D(interfaceC16820sZ)) {
                requestLayout();
            }
            c113675Bf.A06.A01();
            if (this.A08) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.A08 = false;
            }
            AbstractC09790fc.A00(-969295948);
        }
    }

    @Override // X.InterfaceC1128457r
    public final void CpH(AnonymousClass599 anonymousClass599, long j) {
        String str;
        AbstractC09790fc.A01("AndroidOwner:measureAndLayout", 1618529064);
        try {
            C113675Bf c113675Bf = this.A0a;
            if (!anonymousClass599.A0L) {
                AnonymousClass599 anonymousClass5992 = c113675Bf.A05;
                if (!(!anonymousClass599.equals(anonymousClass5992))) {
                    str = "measureAndLayout called on root";
                } else if (anonymousClass5992.A0A != null) {
                    if (!anonymousClass5992.A0U.A0J.A0F) {
                        str = "performMeasureAndLayout called with unplaced root";
                    } else if (!(!c113675Bf.A02)) {
                        str = "performMeasureAndLayout called during measure layout";
                    } else {
                        if (c113675Bf.A00 != null) {
                            c113675Bf.A02 = true;
                            c113675Bf.A01 = false;
                            try {
                                C113685Bg c113685Bg = c113675Bf.A04;
                                c113685Bg.A00.A00(anonymousClass599);
                                c113685Bg.A01.A00(anonymousClass599);
                                if ((C113675Bf.A08(anonymousClass599, new Constraints(j)) || anonymousClass599.A0U.A0E) && C14360o3.A0K(anonymousClass599.A0D(), true)) {
                                    anonymousClass599.A0N();
                                }
                                C113675Bf.A00(anonymousClass599, c113675Bf);
                                C113675Bf.A09(anonymousClass599, new Constraints(j));
                                C5AZ c5az = anonymousClass599.A0U;
                                if (c5az.A0A && c5az.A0J.A0F) {
                                    anonymousClass599.A0Q();
                                    c113675Bf.A06.A01.A09(anonymousClass599);
                                    anonymousClass599.A0M = true;
                                }
                                C113675Bf.A05(c113675Bf);
                                c113675Bf.A02 = false;
                                c113675Bf.A01 = false;
                            } catch (Throwable th) {
                                c113675Bf.A02 = false;
                                c113675Bf.A01 = false;
                                throw th;
                            }
                        }
                        C113675Bf.A04(c113675Bf);
                    }
                } else {
                    str = "performMeasureAndLayout called with unattached root";
                }
                AbstractC28290Cdc.A00(str);
                throw C00O.createAndThrow();
            }
            if (!(!c113675Bf.A04.A01())) {
                c113675Bf.A06.A01();
                if (this.A08) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.A08 = false;
                }
            }
            AbstractC09790fc.A00(642791449);
        } catch (Throwable th2) {
            AbstractC09790fc.A00(-1499958399);
            throw th2;
        }
    }

    @Override // X.InterfaceC1128457r
    public final void DDZ() {
        if (this.A09) {
            C5BW c5bw = this.A0b.A00;
            C207669Gu c207669Gu = C207669Gu.A00;
            C57S c57s = c5bw.A05;
            synchronized (c57s) {
                int i = c57s.A00;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    C5BX c5bx = (C5BX) c57s.A02[i3];
                    C18590vm c18590vm = c5bx.A04;
                    long[] jArr = c18590vm.A02;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i4 = 0;
                        while (true) {
                            long j = jArr[i4];
                            if ((((j ^ (-1)) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i5 = 8 - (((i4 - length) ^ (-1)) >>> 31);
                                for (int i6 = 0; i6 < i5; i6++) {
                                    if ((j & 255) < 128) {
                                        int i7 = (i4 << 3) + i6;
                                        Object obj = c18590vm.A03[i7];
                                        C18630vq c18630vq = (C18630vq) c18590vm.A04[i7];
                                        boolean booleanValue = ((Boolean) c207669Gu.invoke(obj)).booleanValue();
                                        if (booleanValue) {
                                            Object[] objArr = c18630vq.A04;
                                            long[] jArr2 = c18630vq.A03;
                                            int length2 = jArr2.length - 2;
                                            if (length2 >= 0) {
                                                int i8 = 0;
                                                while (true) {
                                                    long j2 = jArr2[i8];
                                                    if ((j2 & ((j2 ^ (-1)) << 7) & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i9 = 8 - (((i8 - length2) ^ (-1)) >>> 31);
                                                        for (int i10 = 0; i10 < i9; i10++) {
                                                            if ((j2 & 255) < 128) {
                                                                C5BX.A01(c5bx, obj, objArr[(i8 << 3) + i10]);
                                                            }
                                                            j2 >>= 8;
                                                        }
                                                        if (i9 != 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i8 == length2) {
                                                        break;
                                                    } else {
                                                        i8++;
                                                    }
                                                }
                                            }
                                        }
                                        if (booleanValue) {
                                            c18590vm.A06(i7);
                                        }
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
                    if (c5bx.A04.A01 != 0) {
                        if (i2 > 0) {
                            Object[] objArr2 = c57s.A02;
                            objArr2[i3 - i2] = objArr2[i3];
                        }
                    } else {
                        i2++;
                    }
                }
                int i11 = i - i2;
                AbstractC06960Yn.A0V(c57s.A02, i11, i);
                c57s.A00 = i11;
            }
            this.A09 = false;
        }
        C137456Kq c137456Kq = this.A0F;
        if (c137456Kq != null) {
            A07(c137456Kq);
        }
        while (true) {
            C57S c57s2 = this.A0z;
            int i12 = c57s2.A00;
            if (i12 != 0) {
                for (int i13 = 0; i13 < i12; i13++) {
                    Object[] objArr3 = c57s2.A02;
                    InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) objArr3[i13];
                    objArr3[i13] = null;
                    if (interfaceC16820sZ != null) {
                        interfaceC16820sZ.invoke();
                    }
                }
                c57s2.A03(0, i12);
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC1128457r
    public final void DOd(AnonymousClass599 anonymousClass599) {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.A0f;
        androidComposeViewAccessibilityDelegateCompat.A0G = true;
        if (androidComposeViewAccessibilityDelegateCompat.A0b()) {
            AndroidComposeViewAccessibilityDelegateCompat.A0F(anonymousClass599, androidComposeViewAccessibilityDelegateCompat);
        }
        AndroidContentCaptureManager androidContentCaptureManager = this.A04;
        androidContentCaptureManager.A06 = true;
        if (androidContentCaptureManager.A03 != null && androidContentCaptureManager.A0A.add(anonymousClass599)) {
            androidContentCaptureManager.A0F.F8s(C0eB.A00);
        }
    }

    @Override // X.InterfaceC1128457r
    public final void DkU() {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.A0f;
        androidComposeViewAccessibilityDelegateCompat.A0G = true;
        if (androidComposeViewAccessibilityDelegateCompat.A0b() && !androidComposeViewAccessibilityDelegateCompat.A0F) {
            androidComposeViewAccessibilityDelegateCompat.A0F = true;
            androidComposeViewAccessibilityDelegateCompat.A0L.post(androidComposeViewAccessibilityDelegateCompat.A0T);
        }
        AndroidContentCaptureManager androidContentCaptureManager = this.A04;
        androidContentCaptureManager.A06 = true;
        if (androidContentCaptureManager.A03 != null && !androidContentCaptureManager.A05) {
            androidContentCaptureManager.A05 = true;
            androidContentCaptureManager.A09.post(androidContentCaptureManager.A0E);
        }
    }

    @Override // X.InterfaceC1128457r
    public final void EDX(InterfaceC16820sZ interfaceC16820sZ) {
        C57S c57s = this.A0z;
        if (!c57s.A0A(interfaceC16820sZ)) {
            c57s.A09(interfaceC16820sZ);
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        C5BR c5br = this.A0P;
        if (c5br != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(keyAt);
                if (autofillValue.isText()) {
                    C5BI c5bi = c5br.A02;
                    autofillValue.getTextValue().toString();
                    c5bi.A00.get(Integer.valueOf(keyAt));
                } else {
                    boolean isDate = autofillValue.isDate();
                    String A00 = AbstractC58317Pt9.A00(32);
                    if (!isDate) {
                        if (!autofillValue.isList()) {
                            if (autofillValue.isToggle()) {
                                throw new C141786av(AnonymousClass001.A0R(A00, "b/138604541:  Add onFill() callback for toggle"));
                            }
                        } else {
                            throw new C141786av(AnonymousClass001.A0R(A00, "b/138604541: Add onFill() callback for list"));
                        }
                    } else {
                        throw new C141786av(AnonymousClass001.A0R(A00, "b/138604541: Add onFill() callback for date"));
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.A0f.A0c(this.A0E, i, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.A0f.A0c(this.A0E, i, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[LOOP:2: B:29:0x0095->B:57:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r4v31, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r7v30, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f9, code lost:
    
        if (r5 == r7) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (this.A07) {
            Runnable runnable = this.A1C;
            removeCallbacks(runnable);
            MotionEvent motionEvent2 = this.A03;
            C14360o3.A0A(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.A07 = false;
            } else {
                runnable.run();
            }
        }
        if (!A0H(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || A0G(motionEvent))) {
            int A00 = A00(motionEvent);
            if ((A00 & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            z = true;
            if ((A00 & 1) == 0) {
                return false;
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        int i2;
        if (view != null) {
            int[] iArr = AbstractC27749CLq.A00;
            view.getLocationInWindow(iArr);
            float f = iArr[0];
            C114205Dh c114205Dh = new C114205Dh(f, iArr[1], f + view.getWidth(), iArr[1] + view.getHeight());
            BJY A00 = AbstractC25332BJb.A00(i);
            if (A00 != null) {
                i2 = A00.A00;
            } else {
                i2 = 6;
            }
            if (C14360o3.A0K(this.A0S.AWI(c114205Dh, C25085B8h.A00, i2), true)) {
                return this;
            }
        }
        return super.focusSearch(view, i);
    }

    /* renamed from: getAccessibilityManager, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ C5BF m0getAccessibilityManager() {
        return this.A0c;
    }

    public final C137456Kq getAndroidViewsHandler$ui_release() {
        if (this.A0F == null) {
            C137456Kq c137456Kq = new C137456Kq(getContext());
            this.A0F = c137456Kq;
            addView(c137456Kq, -1);
            requestLayout();
        }
        C137456Kq c137456Kq2 = this.A0F;
        C14360o3.A0A(c137456Kq2);
        return c137456Kq2;
    }

    public C5BS getAutofill() {
        return this.A0P;
    }

    public C5BI getAutofillTree() {
        return this.A0Q;
    }

    /* renamed from: getClipboardManager, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ C5BU m1getClipboardManager() {
        return this.A0d;
    }

    public final InterfaceC16660sJ getConfigurationChangeObserver() {
        return this.A06;
    }

    public final AndroidContentCaptureManager getContentCaptureManager$ui_release() {
        return this.A04;
    }

    public C12W getCoroutineContext() {
        return this.A05;
    }

    @Override // X.InterfaceC1128457r
    public InterfaceC1128957x getDensity() {
        return (InterfaceC1128957x) this.A0v.getValue();
    }

    public InterfaceC1130458r getDragAndDropManager() {
        return this.A0R;
    }

    public C58X getFocusOwner() {
        return this.A0S;
    }

    @Override // X.InterfaceC1128457r
    public C5DD getFontFamilyResolver() {
        return (C5DD) this.A0w.getValue();
    }

    public C5D4 getFontLoader() {
        return this.A0m;
    }

    public C5BH getGraphicsContext() {
        return this.A0T;
    }

    public C5DP getHapticFeedBack() {
        return this.A0U;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return !this.A0a.A04.A01();
    }

    public C5DR getInputModeManager() {
        return this.A0V;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.A00;
    }

    @Override // android.view.View, android.view.ViewParent, X.InterfaceC1128457r
    public AnonymousClass583 getLayoutDirection() {
        return (AnonymousClass583) this.A0x.getValue();
    }

    public long getMeasureIteration() {
        if (!this.A0a.A02) {
            AbstractC28290Cdc.A00("measureIteration should be only used during the measure/layout pass");
            throw C00O.createAndThrow();
        }
        return 1L;
    }

    public C5DT getModifierLocalManager() {
        return this.A0X;
    }

    public C5AW getPlacementScope() {
        return new C119225ae(this);
    }

    public C5EO getPointerIconService() {
        return this.A0W;
    }

    public AnonymousClass599 getRoot() {
        return this.A0Y;
    }

    public InterfaceC1128657u getRootForTest() {
        return this.A15;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        C5EL c5el;
        if (Build.VERSION.SDK_INT < 31 || (c5el = this.A18) == null) {
            return false;
        }
        return c5el.A01();
    }

    public C113455Ah getSemanticsOwner() {
        return this.A0l;
    }

    public C1128757v getSharedDrawScope() {
        return this.A0Z;
    }

    public boolean getShowLayoutBounds() {
        return this.A0A;
    }

    public C5BV getSnapshotObserver() {
        return this.A0b;
    }

    public C5D2 getSoftwareKeyboardController() {
        return this.A0h;
    }

    public C5D0 getTextInputService() {
        return this.A0n;
    }

    public InterfaceC114195Dg getTextToolbar() {
        return this.A0i;
    }

    public View getView() {
        return this;
    }

    public C59J getViewConfiguration() {
        return this.A0j;
    }

    public final C5U5 getViewTreeOwners() {
        return (C5U5) this.A0y.getValue();
    }

    public AnonymousClass590 getWindowInfo() {
        return this.A0k;
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        Object obj;
        Object obj2;
        C121635fE c121635fE = (C121635fE) this.A1E.get();
        if (c121635fE != null) {
            obj = c121635fE.A00;
        } else {
            obj = null;
        }
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) obj;
        if (androidPlatformTextInputSession == null) {
            return this.A1B.A06;
        }
        C121635fE c121635fE2 = (C121635fE) androidPlatformTextInputSession.A02.get();
        if (c121635fE2 != null) {
            obj2 = c121635fE2.A00;
        } else {
            obj2 = null;
        }
        if (((SI1) obj2) != null && (!r0.A01)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01d4 A[Catch: all -> 0x0284, TryCatch #0 {, blocks: (B:82:0x0115, B:88:0x011b, B:93:0x0135, B:96:0x015d, B:99:0x01a1, B:103:0x01aa, B:106:0x01c3, B:108:0x01c9, B:110:0x01cd, B:112:0x01d4, B:113:0x01db, B:115:0x01df, B:117:0x01e3, B:118:0x01f1, B:119:0x01f3, B:121:0x01f7, B:124:0x01e9, B:127:0x01ef, B:128:0x01fd, B:130:0x021b, B:132:0x021f, B:133:0x0226, B:134:0x022e, B:136:0x0232, B:137:0x0239, B:138:0x026f, B:140:0x0274, B:141:0x027b, B:149:0x016b, B:150:0x017a, B:152:0x0180, B:154:0x018c, B:170:0x0155, B:171:0x015c), top: B:81:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01df A[Catch: all -> 0x0284, TryCatch #0 {, blocks: (B:82:0x0115, B:88:0x011b, B:93:0x0135, B:96:0x015d, B:99:0x01a1, B:103:0x01aa, B:106:0x01c3, B:108:0x01c9, B:110:0x01cd, B:112:0x01d4, B:113:0x01db, B:115:0x01df, B:117:0x01e3, B:118:0x01f1, B:119:0x01f3, B:121:0x01f7, B:124:0x01e9, B:127:0x01ef, B:128:0x01fd, B:130:0x021b, B:132:0x021f, B:133:0x0226, B:134:0x022e, B:136:0x0232, B:137:0x0239, B:138:0x026f, B:140:0x0274, B:141:0x027b, B:149:0x016b, B:150:0x017a, B:152:0x0180, B:154:0x018c, B:170:0x0155, B:171:0x015c), top: B:81:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01f7 A[Catch: all -> 0x0284, TryCatch #0 {, blocks: (B:82:0x0115, B:88:0x011b, B:93:0x0135, B:96:0x015d, B:99:0x01a1, B:103:0x01aa, B:106:0x01c3, B:108:0x01c9, B:110:0x01cd, B:112:0x01d4, B:113:0x01db, B:115:0x01df, B:117:0x01e3, B:118:0x01f1, B:119:0x01f3, B:121:0x01f7, B:124:0x01e9, B:127:0x01ef, B:128:0x01fd, B:130:0x021b, B:132:0x021f, B:133:0x0226, B:134:0x022e, B:136:0x0232, B:137:0x0239, B:138:0x026f, B:140:0x0274, B:141:0x027b, B:149:0x016b, B:150:0x017a, B:152:0x0180, B:154:0x018c, B:170:0x0155, B:171:0x015c), top: B:81:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x021b A[Catch: all -> 0x0284, TryCatch #0 {, blocks: (B:82:0x0115, B:88:0x011b, B:93:0x0135, B:96:0x015d, B:99:0x01a1, B:103:0x01aa, B:106:0x01c3, B:108:0x01c9, B:110:0x01cd, B:112:0x01d4, B:113:0x01db, B:115:0x01df, B:117:0x01e3, B:118:0x01f1, B:119:0x01f3, B:121:0x01f7, B:124:0x01e9, B:127:0x01ef, B:128:0x01fd, B:130:0x021b, B:132:0x021f, B:133:0x0226, B:134:0x022e, B:136:0x0232, B:137:0x0239, B:138:0x026f, B:140:0x0274, B:141:0x027b, B:149:0x016b, B:150:0x017a, B:152:0x0180, B:154:0x018c, B:170:0x0155, B:171:0x015c), top: B:81:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0232 A[Catch: all -> 0x0284, TryCatch #0 {, blocks: (B:82:0x0115, B:88:0x011b, B:93:0x0135, B:96:0x015d, B:99:0x01a1, B:103:0x01aa, B:106:0x01c3, B:108:0x01c9, B:110:0x01cd, B:112:0x01d4, B:113:0x01db, B:115:0x01df, B:117:0x01e3, B:118:0x01f1, B:119:0x01f3, B:121:0x01f7, B:124:0x01e9, B:127:0x01ef, B:128:0x01fd, B:130:0x021b, B:132:0x021f, B:133:0x0226, B:134:0x022e, B:136:0x0232, B:137:0x0239, B:138:0x026f, B:140:0x0274, B:141:0x027b, B:149:0x016b, B:150:0x017a, B:152:0x0180, B:154:0x018c, B:170:0x0155, B:171:0x015c), top: B:81:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x026f A[Catch: all -> 0x0284, TryCatch #0 {, blocks: (B:82:0x0115, B:88:0x011b, B:93:0x0135, B:96:0x015d, B:99:0x01a1, B:103:0x01aa, B:106:0x01c3, B:108:0x01c9, B:110:0x01cd, B:112:0x01d4, B:113:0x01db, B:115:0x01df, B:117:0x01e3, B:118:0x01f1, B:119:0x01f3, B:121:0x01f7, B:124:0x01e9, B:127:0x01ef, B:128:0x01fd, B:130:0x021b, B:132:0x021f, B:133:0x0226, B:134:0x022e, B:136:0x0232, B:137:0x0239, B:138:0x026f, B:140:0x0274, B:141:0x027b, B:149:0x016b, B:150:0x017a, B:152:0x0180, B:154:0x018c, B:170:0x0155, B:171:0x015c), top: B:81:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r15) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        C28456Ch6.A02(this.A04, consumer, jArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A0a.A0D(this.A1F);
        this.A0H = null;
        A0D(this);
        if (this.A0F != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        String str;
        AbstractC09790fc.A01("AndroidOwner:onMeasure", 1325845068);
        try {
            if (!isAttachedToWindow()) {
                A09(this.A0Y);
            }
            long A02 = A02(i);
            long A022 = A02(i2);
            long A03 = AbstractC119035aK.A03((int) (A02 >>> 32), (int) (A02 & 4294967295L), (int) (A022 >>> 32), (int) (4294967295L & A022));
            Constraints constraints = this.A0H;
            if (constraints == null) {
                this.A0H = new Constraints(A03);
                this.A0B = false;
            } else if (constraints.A00 != A03) {
                this.A0B = true;
            }
            C113675Bf c113675Bf = this.A0a;
            Constraints constraints2 = c113675Bf.A00;
            boolean z = false;
            if (constraints2 == null || constraints2.A00 != A03) {
                if (!(!c113675Bf.A02)) {
                    str = "updateRootConstraints called while measuring";
                    AbstractC28290Cdc.A00(str);
                    throw C00O.createAndThrow();
                }
                c113675Bf.A00 = new Constraints(A03);
                AnonymousClass599 anonymousClass599 = c113675Bf.A05;
                AnonymousClass599 anonymousClass5992 = anonymousClass599.A08;
                if (anonymousClass5992 != null) {
                    anonymousClass599.A0U.A0G = true;
                }
                anonymousClass599.A0U.A0H = true;
                C113685Bg c113685Bg = c113675Bf.A04;
                if (anonymousClass5992 != null) {
                    z = true;
                }
                c113685Bg.A00(anonymousClass599, z);
            }
            C113685Bg c113685Bg2 = c113675Bf.A04;
            if (!c113685Bg2.A01()) {
                AnonymousClass599 anonymousClass5993 = c113675Bf.A05;
                if (anonymousClass5993.A0A != null) {
                    if (!anonymousClass5993.A0U.A0J.A0F) {
                        str = "performMeasureAndLayout called with unplaced root";
                    } else if (!(!c113675Bf.A02)) {
                        str = "performMeasureAndLayout called during measure layout";
                    } else if (c113675Bf.A00 != null) {
                        c113675Bf.A02 = true;
                        c113675Bf.A01 = false;
                        try {
                            if (!c113685Bg2.A00.A00.isEmpty()) {
                                if (anonymousClass5993.A08 != null) {
                                    if (!anonymousClass5993.A0L) {
                                        Constraints constraints3 = c113675Bf.A00;
                                        C14360o3.A0A(constraints3);
                                        C113675Bf.A08(anonymousClass5993, constraints3);
                                    }
                                } else {
                                    C113675Bf.A01(anonymousClass5993, c113675Bf);
                                }
                            }
                            if (!anonymousClass5993.A0L) {
                                Constraints constraints4 = c113675Bf.A00;
                                C14360o3.A0A(constraints4);
                                C113675Bf.A09(anonymousClass5993, constraints4);
                            }
                            c113675Bf.A02 = false;
                            c113675Bf.A01 = false;
                        } catch (Throwable th) {
                            c113675Bf.A02 = false;
                            c113675Bf.A01 = false;
                            throw th;
                        }
                    }
                } else {
                    str = "performMeasureAndLayout called with unattached root";
                }
                AbstractC28290Cdc.A00(str);
                throw C00O.createAndThrow();
            }
            C113385Aa c113385Aa = this.A0Y.A0U.A0J;
            setMeasuredDimension(((C59W) c113385Aa).A01, ((C59W) c113385Aa).A00);
            if (this.A0F != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(((C59W) c113385Aa).A01, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(((C59W) c113385Aa).A00, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
            }
            AbstractC09790fc.A00(134025815);
        } catch (Throwable th2) {
            AbstractC09790fc.A00(-1463227767);
            throw th2;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        C5BR c5br;
        if (viewStructure != null && (c5br = this.A0P) != null) {
            Map map = c5br.A02.A00;
            int addChildCount = viewStructure.addChildCount(map.size());
            for (Map.Entry entry : map.entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                entry.getValue();
                ViewStructure newChild = viewStructure.newChild(addChildCount);
                if (newChild != null) {
                    AutofillId autofillId = viewStructure.getAutofillId();
                    C14360o3.A0A(autofillId);
                    newChild.setAutofillId(autofillId, intValue);
                    newChild.setId(intValue, c5br.A00.getContext().getPackageName(), null, null);
                    newChild.setAutofillType(1);
                    throw new NullPointerException("getAutofillTypes");
                }
                addChildCount++;
            }
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        AnonymousClass583 anonymousClass583;
        if (this.A0O) {
            if (i != 0 && i == 1) {
                anonymousClass583 = AnonymousClass583.Rtl;
            } else {
                anonymousClass583 = AnonymousClass583.Ltr;
            }
            setLayoutDirection(anonymousClass583);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        C5EL c5el;
        if (Build.VERSION.SDK_INT >= 31 && (c5el = this.A18) != null) {
            c5el.A00(this, this.A0l, consumer, this.A05);
        }
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        C28456Ch6.A00.A03(longSparseArray, this.A04);
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.A0f.A03 = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if ((r11.A00 & 16) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if ((r11.A01 & 16) == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        r10 = r11;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if ((r10 instanceof X.C5DX) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        r10 = (X.C5DX) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if ((r10 instanceof X.C6KM) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        ((X.C6KM) r10).EJp();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        r10 = X.AbstractC114335Dx.A00(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r10 == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        if ((r10.A01 & 16) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        if ((r10 instanceof X.C5AY) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        r7 = r10.A00;
        r6 = 0;
        r9 = r9;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        if (r7 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        if ((r7.A01 & 16) == 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        r6 = r6 + 1;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0077, code lost:
    
        if (r6 != 1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0079, code lost:
    
        r10 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007a, code lost:
    
        r7 = r7.A02;
        r9 = r9;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007d, code lost:
    
        if (r9 != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007f, code lost:
    
        r9 = new X.C57S(new X.C58J[16]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0086, code lost:
    
        if (r10 == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        r9.A09(r10);
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008c, code lost:
    
        r9.A09(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0090, code lost:
    
        if (r6 != 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0093, code lost:
    
        r11 = r11.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0095, code lost:
    
        if (r11 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0098, code lost:
    
        r5 = r0.A0A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009e, code lost:
    
        if (r5.A00 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a0, code lost:
    
        r0 = r3.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a1, code lost:
    
        if (r2 < r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a3, code lost:
    
        r3 = java.util.Arrays.copyOf(r3, r0 * 2);
        X.C14360o3.A07(r3);
        r1 = java.util.Arrays.copyOf(r1, r1.length * 2);
        X.C14360o3.A07(r1);
        r1 = (X.C57S[]) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b8, code lost:
    
        r3[r2] = r5.A00 - 1;
        r1[r2] = r5;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c3, code lost:
    
        if (r2 <= 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c5, code lost:
    
        r7 = r2 - 1;
        r6 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c9, code lost:
    
        if (r6 < 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cb, code lost:
    
        r5 = r1[r7];
        X.C14360o3.A0A(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d0, code lost:
    
        if (r6 <= 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d2, code lost:
    
        r3[r7] = r3[r7] - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d8, code lost:
    
        r0 = (X.AnonymousClass599) r5.A02[r6];
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e1, code lost:
    
        r1[r7] = null;
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.58J, X.58K] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setCoroutineContext(X.C12W r14) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.setCoroutineContext(X.12W):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.5BE] */
    /* JADX WARN: Type inference failed for: r0v62, types: [X.5Dk] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.58J, X.58I] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.DefaultConstructorMarker, X.580] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public AndroidComposeView(final Context context, C12W c12w) {
        super(context);
        int i;
        AnonymousClass583 anonymousClass583;
        InterfaceC114245Dn interfaceC114245Dn;
        this.A0E = 9205357640488583168L;
        this.A0O = true;
        C5EL c5el = 0;
        c5el = 0;
        this.A0Z = new C1128757v(c5el, c5el, 1);
        C58G A00 = C58B.A00(context);
        C58H c58h = C58H.A00;
        C14360o3.A0C(c58h, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A0v = new ParcelableSnapshotMutableState(c58h, A00);
        ?? c58j = new C58J();
        this.A1A = c58j;
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(c58j);
        this.A19 = emptySemanticsElement;
        this.A0S = new C58W(new C58T(this), new C58U(this), new AnonymousClass014(this) { // from class: X.58V
            @Override // X.InterfaceC016806n
            public final Object get() {
                return ((AndroidComposeView) this.receiver).getLayoutDirection();
            }
        }, new C58Q(this), new C58S(this), new C58R(this));
        ViewOnDragListenerC1130358q viewOnDragListenerC1130358q = new ViewOnDragListenerC1130358q(new C58p(this));
        this.A16 = viewOnDragListenerC1130358q;
        this.A05 = c12w;
        this.A0R = viewOnDragListenerC1130358q;
        this.A0k = new C1131158z();
        KeyInputElement keyInputElement = new KeyInputElement(new C206999Ee(this, 2), null);
        this.A10 = keyInputElement;
        RotaryInputElement rotaryInputElement = new RotaryInputElement(AnonymousClass593.A00);
        this.A11 = rotaryInputElement;
        this.A12 = new AnonymousClass595();
        AnonymousClass599 anonymousClass599 = new AnonymousClass599(false, AnonymousClass598.A00.addAndGet(1));
        anonymousClass599.EYi(C113425Ae.A00);
        anonymousClass599.ETE(getDensity());
        anonymousClass599.EZG(emptySemanticsElement.Eq3(rotaryInputElement).Eq3(keyInputElement).Eq3(((C58W) this.A0S).A02).Eq3(viewOnDragListenerC1130358q.A01));
        this.A0Y = anonymousClass599;
        this.A15 = this;
        this.A0l = new C113455Ah(anonymousClass599, c58j);
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.A0f = androidComposeViewAccessibilityDelegateCompat;
        this.A04 = new AndroidContentCaptureManager(this, new C5BA(this));
        this.A0c = new C5BF(context) { // from class: X.5BE
            public final AccessibilityManager A00;

            {
                Object systemService = context.getSystemService("accessibility");
                C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
                this.A00 = (AccessibilityManager) systemService;
            }
        };
        this.A0T = new C5BH(this) { // from class: X.5BG
            public static boolean A03 = true;
            public C25736BYx A00;
            public final ViewGroup A01;
            public final Object A02 = new Object();

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v2, types: [X.BYx, android.view.View, android.view.ViewGroup] */
            /* JADX WARN: Type inference failed for: r2v5, types: [X.BYx, android.view.View, android.view.ViewGroup] */
            @Override // X.C5BH
            public final GraphicsLayer AMJ() {
                InterfaceC119295al c28810Cng;
                GraphicsLayer graphicsLayer;
                synchronized (this.A02) {
                    ViewGroup viewGroup = this.A01;
                    if (Build.VERSION.SDK_INT >= 29) {
                        AbstractC119275aj.A00(viewGroup);
                        c28810Cng = new InterfaceC119295al() { // from class: X.5ak
                            public float A00;
                            public float A01;
                            public float A02;
                            public float A03;
                            public int A04;
                            public int A05;
                            public long A06;
                            public long A07;
                            public long A08;
                            public AbstractC27458CAa A09;
                            public boolean A0A;
                            public float A0B;
                            public float A0C;
                            public float A0D;
                            public float A0E;
                            public float A0F;
                            public float A0G;
                            public Matrix A0H;
                            public boolean A0I;
                            public boolean A0J;
                            public boolean A0K;
                            public final RenderNode A0L;
                            public final AnonymousClass595 A0M;
                            public final AnonymousClass580 A0N;

                            {
                                AnonymousClass595 anonymousClass595 = new AnonymousClass595();
                                AnonymousClass580 anonymousClass580 = new AnonymousClass580();
                                this.A0M = anonymousClass595;
                                this.A0N = anonymousClass580;
                                RenderNode renderNode = new RenderNode("graphicsLayer");
                                this.A0L = renderNode;
                                this.A07 = 0L;
                                renderNode.setClipToBounds(false);
                                renderNode.setUseCompositingLayer(false, null);
                                renderNode.setHasOverlappingRendering(true);
                                this.A00 = 1.0f;
                                this.A04 = 3;
                                this.A02 = 1.0f;
                                this.A03 = 1.0f;
                                long j = C1132359l.A01;
                                this.A06 = j;
                                this.A08 = j;
                                this.A01 = 8.0f;
                                this.A05 = 0;
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
                            
                                if (r2 == r4.A0J) goto L18;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
                            
                                r4.A0J = r2;
                                r4.A0L.setClipToOutline(r2);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
                            
                                return;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
                            
                                return;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
                            
                                r2 = false;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:18:0x000b, code lost:
                            
                                if (r3 != false) goto L8;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
                            
                                if (r4.A0K != false) goto L6;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
                            
                                if (r4.A0K == false) goto L17;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
                            
                                if (r1 == r4.A0I) goto L13;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
                            
                                r4.A0I = r1;
                                r4.A0L.setClipToBounds(r1);
                             */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            private final void A00() {
                                /*
                                    r4 = this;
                                    boolean r3 = r4.A0A
                                    r2 = 1
                                    if (r3 == 0) goto La
                                    boolean r0 = r4.A0K
                                    r1 = 1
                                    if (r0 == 0) goto Ld
                                La:
                                    r1 = 0
                                    if (r3 == 0) goto L28
                                Ld:
                                    boolean r0 = r4.A0K
                                    if (r0 == 0) goto L28
                                L11:
                                    boolean r0 = r4.A0I
                                    if (r1 == r0) goto L1c
                                    r4.A0I = r1
                                    android.graphics.RenderNode r0 = r4.A0L
                                    r0.setClipToBounds(r1)
                                L1c:
                                    boolean r0 = r4.A0J
                                    if (r2 == r0) goto L27
                                    r4.A0J = r2
                                    android.graphics.RenderNode r0 = r4.A0L
                                    r0.setClipToOutline(r2)
                                L27:
                                    return
                                L28:
                                    r2 = 0
                                    goto L11
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C119285ak.A00():void");
                            }

                            @Override // X.InterfaceC119295al
                            public final Matrix AFC() {
                                Matrix matrix = this.A0H;
                                if (matrix == null) {
                                    matrix = new Matrix();
                                    this.A0H = matrix;
                                }
                                this.A0L.getMatrix(matrix);
                                return matrix;
                            }

                            @Override // X.InterfaceC119295al
                            public final void APb() {
                                this.A0L.discardDisplayList();
                            }

                            @Override // X.InterfaceC119295al
                            public final float AbP() {
                                return this.A00;
                            }

                            @Override // X.InterfaceC119295al
                            public final long AbW() {
                                return this.A06;
                            }

                            @Override // X.InterfaceC119295al
                            public final int AgG() {
                                return 3;
                            }

                            @Override // X.InterfaceC119295al
                            public final float Ajz() {
                                return this.A01;
                            }

                            @Override // X.InterfaceC119295al
                            public final boolean Ao4() {
                                return this.A0A;
                            }

                            @Override // X.InterfaceC119295al
                            public final C5YV ApL() {
                                return null;
                            }

                            @Override // X.InterfaceC119295al
                            public final int Aq5() {
                                return this.A05;
                            }

                            @Override // X.InterfaceC119295al
                            public final boolean BBU() {
                                return this.A0L.hasDisplayList();
                            }

                            @Override // X.InterfaceC119295al
                            public final AbstractC27458CAa Bmc() {
                                return this.A09;
                            }

                            @Override // X.InterfaceC119295al
                            public final float Bpe() {
                                return this.A0B;
                            }

                            @Override // X.InterfaceC119295al
                            public final float Bpf() {
                                return this.A0C;
                            }

                            @Override // X.InterfaceC119295al
                            public final float Bpg() {
                                return this.A0D;
                            }

                            @Override // X.InterfaceC119295al
                            public final float BqS() {
                                return this.A02;
                            }

                            @Override // X.InterfaceC119295al
                            public final float BqT() {
                                return this.A03;
                            }

                            @Override // X.InterfaceC119295al
                            public final float Bu4() {
                                return this.A0E;
                            }

                            @Override // X.InterfaceC119295al
                            public final long BzN() {
                                return this.A08;
                            }

                            @Override // X.InterfaceC119295al
                            public final float CAi() {
                                return this.A0F;
                            }

                            @Override // X.InterfaceC119295al
                            public final float CAj() {
                                return this.A0G;
                            }

                            @Override // X.InterfaceC119295al
                            public final void ECN(InterfaceC1128957x interfaceC1128957x, AnonymousClass583 anonymousClass5832, GraphicsLayer graphicsLayer2, InterfaceC16660sJ interfaceC16660sJ) {
                                RenderNode renderNode = this.A0L;
                                RecordingCanvas beginRecording = renderNode.beginRecording();
                                try {
                                    AnonymousClass596 anonymousClass596 = this.A0M.A00;
                                    Canvas canvas = anonymousClass596.A00;
                                    anonymousClass596.A00 = beginRecording;
                                    AnonymousClass580 anonymousClass580 = this.A0N;
                                    AnonymousClass588 anonymousClass588 = anonymousClass580.A03;
                                    anonymousClass588.ETE(interfaceC1128957x);
                                    anonymousClass588.EY4(anonymousClass5832);
                                    ((AnonymousClass587) anonymousClass588).A00 = graphicsLayer2;
                                    anonymousClass588.EeS(this.A07);
                                    anonymousClass588.ERA(anonymousClass596);
                                    interfaceC16660sJ.invoke(anonymousClass580);
                                    anonymousClass596.A00 = canvas;
                                } finally {
                                    renderNode.endRecording();
                                }
                            }

                            @Override // X.InterfaceC119295al
                            public final void EPa(float f) {
                                this.A00 = f;
                                this.A0L.setAlpha(f);
                            }

                            @Override // X.InterfaceC119295al
                            public final void EPf(long j) {
                                this.A06 = j;
                                this.A0L.setAmbientShadowColor(C5AC.A00(j));
                            }

                            @Override // X.InterfaceC119295al
                            public final void EQp(float f) {
                                this.A01 = f;
                                this.A0L.setCameraDistance(f);
                            }

                            @Override // X.InterfaceC119295al
                            public final void ERU(boolean z) {
                                this.A0A = z;
                                A00();
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
                            
                                if (r4.A09 != null) goto L6;
                             */
                            @Override // X.InterfaceC119295al
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void ERt(int r5) {
                                /*
                                    r4 = this;
                                    r4.A05 = r5
                                    r0 = 1
                                    if (r5 == r0) goto La
                                    X.CAa r0 = r4.A09
                                    r1 = 0
                                    if (r0 == 0) goto Lb
                                La:
                                    r1 = 1
                                Lb:
                                    android.graphics.RenderNode r3 = r4.A0L
                                    if (r1 == 0) goto L10
                                    r5 = 1
                                L10:
                                    r2 = 1
                                    if (r5 != r2) goto L1b
                                    r0 = 0
                                    r3.setUseCompositingLayer(r2, r0)
                                L17:
                                    r3.setHasOverlappingRendering(r2)
                                    return
                                L1b:
                                    r1 = 0
                                    r0 = 0
                                    r3.setUseCompositingLayer(r1, r0)
                                    goto L17
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C119285ak.ERt(int):void");
                            }

                            @Override // X.InterfaceC119295al
                            public final void EaL(Outline outline) {
                                this.A0L.setOutline(outline);
                                boolean z = false;
                                if (outline != null) {
                                    z = true;
                                }
                                this.A0K = z;
                                A00();
                            }

                            @Override // X.InterfaceC119295al
                            public final void Eb9(int i2, int i3, long j) {
                                this.A0L.setPosition(i2, i3, ((int) (j >> 32)) + i2, C119055aN.A00(j) + i3);
                                this.A07 = AbstractC119215ad.A01(j);
                            }

                            @Override // X.InterfaceC119295al
                            public final void EcY(AbstractC27458CAa abstractC27458CAa) {
                                this.A09 = abstractC27458CAa;
                                if (Build.VERSION.SDK_INT >= 31) {
                                    CBH.A00(this.A0L, abstractC27458CAa);
                                }
                            }

                            @Override // X.InterfaceC119295al
                            public final void Ecv(float f) {
                                this.A0B = f;
                                this.A0L.setRotationX(f);
                            }

                            @Override // X.InterfaceC119295al
                            public final void Ecw(float f) {
                                this.A0C = f;
                                this.A0L.setRotationY(f);
                            }

                            @Override // X.InterfaceC119295al
                            public final void Ecx(float f) {
                                this.A0D = f;
                                this.A0L.setRotationZ(f);
                            }

                            @Override // X.InterfaceC119295al
                            public final void Ed7(float f) {
                                this.A02 = f;
                                this.A0L.setScaleX(f);
                            }

                            @Override // X.InterfaceC119295al
                            public final void Ed8(float f) {
                                this.A03 = f;
                                this.A0L.setScaleY(f);
                            }

                            @Override // X.InterfaceC119295al
                            public final void Edo(float f) {
                                this.A0E = f;
                                this.A0L.setElevation(f);
                            }

                            @Override // X.InterfaceC119295al
                            public final void Eeg(long j) {
                                this.A08 = j;
                                this.A0L.setSpotShadowColor(C5AC.A00(j));
                            }

                            @Override // X.InterfaceC119295al
                            public final void EgF(float f) {
                                this.A0F = f;
                                this.A0L.setTranslationX(f);
                            }

                            @Override // X.InterfaceC119295al
                            public final void EgG(float f) {
                                this.A0G = f;
                                this.A0L.setTranslationY(f);
                            }

                            @Override // X.InterfaceC119295al
                            public final void AQU(AnonymousClass585 anonymousClass585) {
                                AnonymousClass597.A00(anonymousClass585).drawRenderNode(this.A0L);
                            }

                            @Override // X.InterfaceC119295al
                            public final void Eap(long j) {
                                if ((j & 9223372034707292159L) == 9205357640488583168L) {
                                    this.A0L.resetPivot();
                                    return;
                                }
                                RenderNode renderNode = this.A0L;
                                renderNode.setPivotX(C119365at.A01(j));
                                renderNode.setPivotY(C119365at.A02(j));
                            }
                        };
                    } else if (A03) {
                        try {
                            c28810Cng = new C72076XMu(viewGroup);
                        } catch (Throwable unused) {
                            A03 = false;
                            Canvas canvas = C28810Cng.A0O;
                            C25736BYx c25736BYx = this.A00;
                            C25736BYx c25736BYx2 = c25736BYx;
                            if (c25736BYx == null) {
                                ?? viewGroup2 = new ViewGroup(viewGroup.getContext());
                                viewGroup2.setClipChildren(false);
                                viewGroup2.setClipToPadding(false);
                                viewGroup2.setTag(R.id.hide_graphics_layer_in_inspector_tag, true);
                                viewGroup.addView(viewGroup2);
                                this.A00 = viewGroup2;
                                c25736BYx2 = viewGroup2;
                            }
                            c28810Cng = new C28810Cng(c25736BYx2);
                        }
                    } else {
                        Canvas canvas2 = C28810Cng.A0O;
                        C25736BYx c25736BYx3 = this.A00;
                        C25736BYx c25736BYx4 = c25736BYx3;
                        if (c25736BYx3 == null) {
                            ?? viewGroup3 = new ViewGroup(viewGroup.getContext());
                            viewGroup3.setClipChildren(false);
                            viewGroup3.setClipToPadding(false);
                            viewGroup3.setTag(R.id.hide_graphics_layer_in_inspector_tag, true);
                            viewGroup.addView(viewGroup3);
                            this.A00 = viewGroup3;
                            c25736BYx4 = viewGroup3;
                        }
                        c28810Cng = new C28810Cng(c25736BYx4);
                    }
                    graphicsLayer = new GraphicsLayer(c28810Cng);
                }
                return graphicsLayer;
            }

            @Override // X.C5BH
            public final void EEH(GraphicsLayer graphicsLayer) {
                synchronized (this.A02) {
                    if (!graphicsLayer.A0E) {
                        graphicsLayer.A0E = true;
                        GraphicsLayer.A01(graphicsLayer);
                    }
                }
            }

            {
                this.A01 = this;
            }
        };
        this.A0Q = new C5BI();
        this.A1D = new ArrayList();
        this.A13 = new C5BJ();
        this.A14 = new C5BK(this.A0Y);
        this.A06 = C5BQ.A00;
        this.A0P = new C5BR(this, this.A0Q);
        this.A0d = new C5BT(context);
        this.A0b = new C5BV(new C206999Ee(this, 3));
        this.A0a = new C113675Bf(this.A0Y);
        final ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.A0j = new C59J(viewConfiguration) { // from class: X.5Bn
            public final ViewConfiguration A00;

            @Override // X.C59J
            public final long Az7() {
                return 40L;
            }

            @Override // X.C59J
            public final float BAw() {
                if (Build.VERSION.SDK_INT >= 34) {
                    return AD1.A00(this.A00);
                }
                return 16.0f;
            }

            @Override // X.C59J
            public final float BAx() {
                if (Build.VERSION.SDK_INT >= 34) {
                    return AD1.A01(this.A00);
                }
                return 2.0f;
            }

            @Override // X.C59J
            public final float BQG() {
                return this.A00.getScaledMaximumFlingVelocity();
            }

            @Override // X.C59J
            public final /* synthetic */ long BUC() {
                long floatToRawIntBits = Float.floatToRawIntBits(48.0f);
                return (floatToRawIntBits & 4294967295L) | (floatToRawIntBits << 32);
            }

            @Override // X.C59J
            public final float CA3() {
                return this.A00.getScaledTouchSlop();
            }

            {
                this.A00 = viewConfiguration;
            }

            @Override // X.C59J
            public final long Az8() {
                return ViewConfiguration.getDoubleTapTimeout();
            }

            @Override // X.C59J
            public final long BPB() {
                return ViewConfiguration.getLongPressTimeout();
            }
        };
        this.A0D = AbstractC113765Bo.A00(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.A1G = new int[]{0, 0};
        float[] A06 = C5AJ.A06();
        this.A0o = A06;
        this.A0p = C5AJ.A06();
        this.A0q = C5AJ.A06();
        this.A00 = -1L;
        this.A02 = 9187343241974906880L;
        this.A0M = true;
        this.A0u = new ParcelableSnapshotMutableState(AbstractC74873Yc.A00(), null);
        this.A0y = new C113775Bp(null, new C9EV(this, 31));
        this.A0r = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.5Bs
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AndroidComposeView.A0D(AndroidComposeView.this);
            }
        };
        this.A0s = new ViewTreeObserver.OnScrollChangedListener() { // from class: X.5Bt
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AndroidComposeView.A0D(AndroidComposeView.this);
            }
        };
        this.A0t = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: X.5Bu
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z) {
                C5DQ c5dq = AndroidComposeView.this.A0V;
                int i2 = 2;
                if (z) {
                    i2 = 1;
                }
                c5dq.A00.Egh(new C5DS(i2));
            }
        };
        C113835Bv c113835Bv = new C113835Bv(this, this);
        this.A1B = c113835Bv;
        this.A0n = new C5D0((InterfaceC113845Bw) C5BB.A00.invoke(c113835Bv));
        this.A1E = new AtomicReference(null);
        final C5D0 c5d0 = this.A0n;
        this.A0h = new C5D2(c5d0) { // from class: X.5D1
            public final C5D0 A00;

            @Override // X.C5D2
            public final void hide() {
                this.A00.A00.CMy();
            }

            @Override // X.C5D2
            public final void show() {
                C5D0 c5d02 = this.A00;
                if (c5d02.A01.get() != null) {
                    c5d02.A00.Ele();
                }
            }

            {
                this.A00 = c5d0;
            }
        };
        this.A0m = new C5D4(context) { // from class: X.5D3
            public final Context A00;

            {
                this.A00 = context;
            }
        };
        FontFamilyResolverImpl fontFamilyResolverImpl = new FontFamilyResolverImpl(new AndroidFontLoader(context), new C5DA(C5D8.A00(context)));
        C14360o3.A0C(c58h, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
        this.A0w = new ParcelableSnapshotMutableState(c58h, fontFamilyResolverImpl);
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            i = configuration.fontWeightAdjustment;
        } else {
            i = 0;
        }
        this.A0C = i;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        if (layoutDirection != 0) {
            if (layoutDirection != 1) {
                anonymousClass583 = AnonymousClass583.Ltr;
            } else {
                anonymousClass583 = AnonymousClass583.Rtl;
            }
        } else {
            anonymousClass583 = AnonymousClass583.Ltr;
        }
        this.A0x = new ParcelableSnapshotMutableState(AbstractC74873Yc.A00(), anonymousClass583);
        this.A0U = new C5DO(this);
        this.A0V = new C5DQ(isInTouchMode() ? 1 : 2, new C206999Ee(this, 1));
        this.A0X = new C5DT(this);
        this.A0i = new C114185Df(this);
        this.A17 = new C114215Dj();
        this.A0z = new C57S(new InterfaceC16820sZ[16]);
        this.A0e = new Runnable() { // from class: X.5Dk
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
            
                if (r1 == 9) goto L16;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r10 = this;
                    androidx.compose.ui.platform.AndroidComposeView r5 = androidx.compose.ui.platform.AndroidComposeView.this
                    r5.removeCallbacks(r10)
                    android.view.MotionEvent r4 = r5.A03
                    if (r4 == 0) goto L2e
                    r9 = 0
                    int r3 = r4.getToolType(r9)
                    r1 = 3
                    r2 = 1
                    r0 = 0
                    if (r3 != r1) goto L14
                    r0 = 1
                L14:
                    int r1 = r4.getActionMasked()
                    if (r0 == 0) goto L1e
                    r0 = 10
                    if (r1 == r0) goto L2e
                L1e:
                    if (r1 == r2) goto L2e
                    r0 = 7
                    if (r1 == r0) goto L28
                    r0 = 9
                    r6 = 2
                    if (r1 != r0) goto L29
                L28:
                    r6 = 7
                L29:
                    long r7 = r5.A01
                    androidx.compose.ui.platform.AndroidComposeView.A06(r4, r5, r6, r7, r9)
                L2e:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC114225Dk.run():void");
            }
        };
        this.A1C = new Runnable() { // from class: X.5Dl
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView androidComposeView = AndroidComposeView.this;
                androidComposeView.A07 = false;
                MotionEvent motionEvent = androidComposeView.A03;
                C14360o3.A0A(motionEvent);
                if (motionEvent.getActionMasked() == 10) {
                    AndroidComposeView.A01(motionEvent, androidComposeView);
                    return;
                }
                throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
            }
        };
        this.A1F = new C9EV(this, 30);
        if (i2 < 29) {
            interfaceC114245Dn = new BIB(A06);
        } else {
            interfaceC114245Dn = new InterfaceC114245Dn() { // from class: X.5Dm
                public final Matrix A00 = new Matrix();
                public final int[] A01 = new int[2];

                @Override // X.InterfaceC114245Dn
                public final void AFD(View view, float[] fArr) {
                    Matrix matrix = this.A00;
                    matrix.reset();
                    view.transformMatrixToGlobal(matrix);
                    while (true) {
                        Object parent = view.getParent();
                        if (parent instanceof View) {
                            view = (View) parent;
                        } else {
                            int[] iArr = this.A01;
                            view.getLocationOnScreen(iArr);
                            int i3 = iArr[0];
                            int i4 = iArr[1];
                            view.getLocationInWindow(iArr);
                            matrix.postTranslate(iArr[0] - i3, iArr[1] - i4);
                            AbstractC130975vl.A01(matrix, fArr);
                            return;
                        }
                    }
                }
            };
        }
        this.A0g = interfaceC114245Dn;
        addOnAttachStateChangeListener(this.A04);
        setWillNotDraw(false);
        setFocusable(true);
        setFocusable(1);
        setDefaultFocusHighlightEnabled(false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        AbstractC010103p.A0B(this, androidComposeViewAccessibilityDelegateCompat);
        setOnDragListener(viewOnDragListenerC1130358q);
        this.A0Y.A0W(this);
        if (i2 >= 29) {
            C5EK.A00(this);
            if (i2 >= 31) {
                c5el = new C5EL();
            }
        }
        this.A18 = c5el;
        this.A0W = new C5EO() { // from class: X.5EN
            public C5ES A00 = C5EP.A00;

            @Override // X.C5EO
            public final void EVt(C5ES c5es) {
                int i3;
                if (c5es == null) {
                    c5es = C5EP.A00;
                }
                this.A00 = c5es;
                AndroidComposeView androidComposeView = AndroidComposeView.this;
                boolean z = c5es instanceof C5ER;
                Context context2 = androidComposeView.getContext();
                if (z) {
                    i3 = ((C5ER) c5es).A00;
                } else {
                    i3 = 1000;
                }
                PointerIcon systemIcon = PointerIcon.getSystemIcon(context2, i3);
                if (!C14360o3.A0K(androidComposeView.getPointerIcon(), systemIcon)) {
                    androidComposeView.setPointerIcon(systemIcon);
                }
            }
        };
    }

    private final long A02(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    long j = size;
                    return j | (j << 32);
                }
                throw new IllegalStateException();
            }
            size = Integer.MAX_VALUE;
        }
        return size | (0 << 32);
    }

    public static final C114205Dh A04(AndroidComposeView androidComposeView) {
        if (androidComposeView.isFocused()) {
            C58Z A00 = BJZ.A00(((C58W) androidComposeView.A0S).A01);
            if (A00 != null) {
                return BJZ.A02(A00);
            }
            return null;
        }
        View findFocus = androidComposeView.findFocus();
        if (findFocus != null) {
            int[] iArr = AbstractC27749CLq.A00;
            findFocus.getLocationInWindow(iArr);
            float f = iArr[0];
            return new C114205Dh(f, iArr[1], f + findFocus.getWidth(), iArr[1] + findFocus.getHeight());
        }
        return null;
    }

    private final void A07(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).DDZ();
            } else if (childAt instanceof ViewGroup) {
                A07((ViewGroup) childAt);
            }
        }
    }

    private final void A08(AnonymousClass599 anonymousClass599) {
        anonymousClass599.A0K();
        C57S A0A = anonymousClass599.A0A();
        int i = A0A.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0A.A02;
            do {
                A08((AnonymousClass599) objArr[i2]);
                i2++;
            } while (i2 < i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        r0 = r3.A0B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r0 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        r1 = ((X.C59W) r0.A0W.A06).A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (androidx.compose.ui.unit.Constraints.A09(r1) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (androidx.compose.ui.unit.Constraints.A08(r1) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        if (r3 != r4.A0Y) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        r4.requestLayout();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
    
        r3 = r3.A0B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
    
        if (r3 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        if (r4.getWidth() == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004d, code lost:
    
        if (r4.getHeight() == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004f, code lost:
    
        r4.invalidate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0052, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        if (r3 != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r3.A0U.A0J.A09 != X.C05F.A00) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r4.A0B != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0A(X.AnonymousClass599 r3, androidx.compose.ui.platform.AndroidComposeView r4) {
        /*
            boolean r0 = r4.isLayoutRequested()
            if (r0 != 0) goto L3b
            boolean r0 = r4.isAttachedToWindow()
            if (r0 == 0) goto L3b
            if (r3 == 0) goto L43
        Le:
            X.5AZ r0 = r3.A0U
            X.5Aa r0 = r0.A0J
            java.lang.Integer r1 = r0.A09
            java.lang.Integer r0 = X.C05F.A00
            if (r1 != r0) goto L34
            boolean r0 = r4.A0B
            if (r0 != 0) goto L3c
            X.599 r0 = r3.A0B()
            if (r0 == 0) goto L34
            X.59S r0 = r0.A0W
            X.59T r0 = r0.A06
            long r1 = r0.A04
            boolean r0 = androidx.compose.ui.unit.Constraints.A09(r1)
            if (r0 == 0) goto L3c
            boolean r0 = androidx.compose.ui.unit.Constraints.A08(r1)
            if (r0 == 0) goto L3c
        L34:
            X.599 r0 = r4.A0Y
            if (r3 != r0) goto L43
        L38:
            r4.requestLayout()
        L3b:
            return
        L3c:
            X.599 r3 = r3.A0B()
            if (r3 == 0) goto L34
            goto Le
        L43:
            int r0 = r4.getWidth()
            if (r0 == 0) goto L38
            int r0 = r4.getHeight()
            if (r0 == 0) goto L38
            r4.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.A0A(X.599, androidx.compose.ui.platform.AndroidComposeView):void");
    }

    public static final void A0B(AndroidComposeView androidComposeView) {
        if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
            super.clearFocus();
        }
    }

    private final boolean A0F(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (0.0f <= x && x <= getWidth() && 0.0f <= y && y <= getHeight()) {
            return true;
        }
        return false;
    }

    private final boolean A0G(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.A03) == null || motionEvent2.getPointerCount() != motionEvent.getPointerCount() || motionEvent.getRawX() != motionEvent2.getRawX() || motionEvent.getRawY() != motionEvent2.getRawY()) {
            return true;
        }
        return false;
    }

    public static final boolean A0H(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        if (!Float.isInfinite(x) && !Float.isNaN(x)) {
            float y = motionEvent.getY();
            if (!Float.isInfinite(y) && !Float.isNaN(y)) {
                float rawX = motionEvent.getRawX();
                if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
                    float rawY = motionEvent.getRawY();
                    if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
                        int pointerCount = motionEvent.getPointerCount();
                        for (int i = 1; i < pointerCount; i++) {
                            float x2 = motionEvent.getX(i);
                            if (!Float.isInfinite(x2) && !Float.isNaN(x2)) {
                                float y2 = motionEvent.getY(i);
                                if (!Float.isInfinite(y2) && !Float.isNaN(y2) && (Build.VERSION.SDK_INT < 29 || AbstractC46526KiR.A00(motionEvent, i))) {
                                }
                            }
                        }
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static final boolean A0I(BJY bjy, C114205Dh c114205Dh, AndroidComposeView androidComposeView) {
        int i;
        Rect rect;
        Integer A01;
        if (!androidComposeView.isFocused() && !androidComposeView.hasFocus()) {
            if (bjy != null && (A01 = AbstractC25332BJb.A01(bjy.A00)) != null) {
                i = A01.intValue();
            } else {
                i = 130;
            }
            if (c114205Dh != null) {
                rect = AbstractC28289Cdb.A00(c114205Dh);
            } else {
                rect = null;
            }
            return super.requestFocus(i, rect);
        }
        return true;
    }

    @Override // X.InterfaceC1128557s
    public final long Cho(long j) {
        A0C(this);
        long A00 = C5AJ.A00(this.A0p, j);
        float A01 = C119365at.A01(A00);
        long j2 = this.A02;
        return AbstractC119395aw.A00(A01 + C119365at.A01(j2), C119365at.A02(A00) + C119365at.A02(j2));
    }

    @Override // X.InterfaceC1128557s
    public final long EM9(long j) {
        A0C(this);
        float A01 = C119365at.A01(j);
        long j2 = this.A02;
        return C5AJ.A00(this.A0q, AbstractC119395aw.A00(A01 - C119365at.A01(j2), C119365at.A02(j) - C119365at.A02(j2)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            A08(this.A0Y);
        }
        CpG(true);
        C3Z5.A05();
        this.A0L = true;
        AnonymousClass596 anonymousClass596 = this.A12.A00;
        Canvas canvas2 = anonymousClass596.A00;
        anonymousClass596.A00 = canvas;
        this.A0Y.A0W.A04.A0e(anonymousClass596, null);
        anonymousClass596.A00 = canvas2;
        List list = this.A1D;
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC119265ai) list.get(i)).FAl();
            }
        }
        if (C119455b2.A0I) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        list.clear();
        this.A0L = false;
        List list2 = this.A0I;
        if (list2 != null) {
            list.addAll(list2);
            list2.clear();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (isFocused()) {
            C1131158z.A01.Egh(new AnonymousClass591(keyEvent.getMetaState()));
            if (!this.A0S.APp(keyEvent, B6B.A00) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }
        return this.A0S.APp(keyEvent, new DH1(20, keyEvent, this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (isFocused()) {
            C58W c58w = (C58W) this.A0S;
            if (!c58w.A03.A01()) {
                C58Z A00 = BJZ.A00(c58w.A01);
                if (A00 != null) {
                    C58J c58j = A00.A03;
                    if (c58j.A08) {
                        AnonymousClass599 A02 = AbstractC114335Dx.A02(A00);
                        if (A02 != null) {
                            while (true) {
                                if ((A02.A0W.A02.A00 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
                                    while (c58j != null) {
                                        if ((c58j.A01 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
                                            C57S c57s = null;
                                            C58J c58j2 = c58j;
                                            do {
                                                if ((c58j2.A01 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0 && (c58j2 instanceof C5AY)) {
                                                    int i = 0;
                                                    for (C58J c58j3 = ((C5AY) c58j2).A00; c58j3 != null; c58j3 = c58j3.A02) {
                                                        if ((c58j3.A01 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
                                                            i++;
                                                            if (i == 1) {
                                                                c58j2 = c58j3;
                                                            } else {
                                                                if (c57s == null) {
                                                                    c57s = new C57S(new C58J[16]);
                                                                }
                                                                if (c58j2 != null) {
                                                                    c57s.A09(c58j2);
                                                                    c58j2 = null;
                                                                }
                                                                c57s.A09(c58j3);
                                                            }
                                                        }
                                                    }
                                                    if (i == 1) {
                                                    }
                                                }
                                                c58j2 = AbstractC114335Dx.A00(c57s);
                                            } while (c58j2 != null);
                                        }
                                        c58j = c58j.A04;
                                    }
                                }
                                A02 = A02.A0B();
                                if (A02 == null) {
                                    break;
                                }
                                C59S c59s = A02.A0W;
                                if (c59s != null) {
                                    c58j = c59s.A05;
                                } else {
                                    c58j = null;
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("visitAncestors called on an unattached node");
                    }
                }
            } else {
                throw new IllegalStateException("Dispatching intercepted soft keyboard event while focus system is invalidated.");
            }
        }
        if (!super.dispatchKeyEventPreIme(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        C114205Dh A04 = A04(this);
        if (A04 != null) {
            rect.left = Math.round(A04.A01);
            rect.top = Math.round(A04.A03);
            rect.right = Math.round(A04.A02);
            rect.bottom = Math.round(A04.A00);
            return;
        }
        super.getFocusedRect(rect);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        IllegalStateException illegalStateException;
        int i;
        C07T lifecycle;
        C07T lifecycle2;
        C07X c07x;
        int A06 = C0f9.A06(-1959921902);
        super.onAttachedToWindow();
        this.A0k.A00.Egh(Boolean.valueOf(hasWindowFocus()));
        AnonymousClass599 anonymousClass599 = this.A0Y;
        A09(anonymousClass599);
        A08(anonymousClass599);
        C5BW c5bw = this.A0b.A00;
        c5bw.A00 = C3Z5.A01(c5bw.A08);
        C5BR c5br = this.A0P;
        if (c5br != null) {
            c5br.A01.registerCallback(C5U6.A00);
        }
        C07X A00 = AbstractC55832hO.A00(this);
        InterfaceC08430c6 A002 = AbstractC55842hQ.A00(this);
        C5U5 viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (A00 != null && A002 != null && (A00 != (c07x = viewTreeOwners.A00) || A002 != c07x))) {
            if (A00 != null) {
                if (A002 != null) {
                    if (viewTreeOwners != null && (lifecycle = viewTreeOwners.A00.getLifecycle()) != null) {
                        lifecycle.A0A(this);
                    }
                    A00.getLifecycle().A09(this);
                    C5U5 c5u5 = new C5U5(A00, A002);
                    set_viewTreeOwners(c5u5);
                    InterfaceC16660sJ interfaceC16660sJ = this.A0J;
                    if (interfaceC16660sJ != null) {
                        interfaceC16660sJ.invoke(c5u5);
                    }
                    this.A0J = null;
                } else {
                    illegalStateException = new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                    i = -1768683960;
                }
            } else {
                illegalStateException = new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                i = 300320207;
            }
            C0f9.A0D(i, A06);
            throw illegalStateException;
        }
        C5DQ c5dq = this.A0V;
        int i2 = 2;
        if (isInTouchMode()) {
            i2 = 1;
        }
        c5dq.A00.Egh(new C5DS(i2));
        C5U5 viewTreeOwners2 = getViewTreeOwners();
        if (viewTreeOwners2 != null && (lifecycle2 = viewTreeOwners2.A00.getLifecycle()) != null) {
            lifecycle2.A09(this);
            lifecycle2.A09(this.A04);
            getViewTreeObserver().addOnGlobalLayoutListener(this.A0r);
            getViewTreeObserver().addOnScrollChangedListener(this.A0s);
            getViewTreeObserver().addOnTouchModeChangeListener(this.A0t);
            if (Build.VERSION.SDK_INT >= 31) {
                AbstractC119015aI.A01(this);
            }
            C0f9.A0D(-1067590519, A06);
            return;
        }
        AbstractC28290Cdc.A02("No lifecycle owner exists");
        throw C00O.createAndThrow();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        setDensity(C58B.A00(context));
        if (Build.VERSION.SDK_INT >= 31) {
            i = configuration.fontWeightAdjustment;
        } else {
            i = 0;
        }
        if (i != this.A0C) {
            this.A0C = i;
            setFontFamilyResolver(new FontFamilyResolverImpl(new AndroidFontLoader(context), new C5DA(C5D8.A00(context))));
        }
        this.A06.invoke(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C07T lifecycle;
        int A06 = C0f9.A06(-1116022190);
        super.onDetachedFromWindow();
        C5BW c5bw = this.A0b.A00;
        InterfaceC1127157b interfaceC1127157b = c5bw.A00;
        if (interfaceC1127157b != null) {
            interfaceC1127157b.dispose();
        }
        c5bw.A01();
        C5U5 viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (lifecycle = viewTreeOwners.A00.getLifecycle()) != null) {
            lifecycle.A0A(this.A04);
            lifecycle.A0A(this);
            C5BR c5br = this.A0P;
            if (c5br != null) {
                c5br.A01.unregisterCallback(C5U6.A00);
            }
            getViewTreeObserver().removeOnGlobalLayoutListener(this.A0r);
            getViewTreeObserver().removeOnScrollChangedListener(this.A0s);
            getViewTreeObserver().removeOnTouchModeChangeListener(this.A0t);
            if (Build.VERSION.SDK_INT >= 31) {
                AbstractC119015aI.A00(this);
            }
            C0f9.A0D(-1851654044, A06);
            return;
        }
        AbstractC28290Cdc.A02("No lifecycle owner exists");
        throw C00O.createAndThrow();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int A06 = C0f9.A06(-860137054);
        super.onFocusChanged(z, i, rect);
        if (!z && !hasFocus()) {
            C58W c58w = (C58W) this.A0S;
            C1129758g c1129758g = c58w.A04;
            if (c1129758g.A00) {
                AbstractC28485Chd.A07(c58w.A01, true);
            } else {
                try {
                    c1129758g.A00 = true;
                    AbstractC28485Chd.A07(c58w.A01, true);
                } finally {
                    C1129758g.A01(c1129758g);
                }
            }
        }
        C0f9.A0D(977271201, A06);
    }

    @Override // X.InterfaceC65626Tpm
    public final void onResume(C07X c07x) {
        this.A0A = C5U9.A00();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean A00;
        int A06 = C0f9.A06(-1134802228);
        this.A0k.A00.Egh(Boolean.valueOf(z));
        this.A0N = true;
        super.onWindowFocusChanged(z);
        if (z && this.A0A != (A00 = C5U9.A00())) {
            this.A0A = A00;
            A08(this.A0Y);
        }
        C0f9.A0D(-192035441, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        int i2;
        C114205Dh c114205Dh;
        if (isFocused()) {
            return true;
        }
        C58X c58x = this.A0S;
        if (((C58W) c58x).A01.A0G().BBj()) {
            return super.requestFocus(i, rect);
        }
        BJY A00 = AbstractC25332BJb.A00(i);
        if (A00 != null) {
            i2 = A00.A00;
        } else {
            i2 = 7;
        }
        if (rect != null) {
            c114205Dh = new C114205Dh(rect.left, rect.top, rect.right, rect.bottom);
        } else {
            c114205Dh = null;
        }
        Boolean AWI = c58x.AWI(c114205Dh, new C206789Dj(i2, 0), i2);
        if (AWI != null) {
            return AWI.booleanValue();
        }
        return false;
    }

    public final void setOnViewTreeOwnersAvailable(InterfaceC16660sJ interfaceC16660sJ) {
        C5U5 viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            interfaceC16660sJ.invoke(viewTreeOwners);
        }
        if (!isAttachedToWindow()) {
            this.A0J = interfaceC16660sJ;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        super.dispatchProvideStructure(viewStructure);
    }

    public final void setConfigurationChangeObserver(InterfaceC16660sJ interfaceC16660sJ) {
        this.A06 = interfaceC16660sJ;
    }

    public final void setContentCaptureManager$ui_release(AndroidContentCaptureManager androidContentCaptureManager) {
        this.A04 = androidContentCaptureManager;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.A00 = j;
    }

    public void setShowLayoutBounds(boolean z) {
        this.A0A = z;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i;
        generateDefaultLayoutParams.height = i2;
        addView(view, -1, generateDefaultLayoutParams);
    }

    public C5BE getAccessibilityManager() {
        return this.A0c;
    }

    public C5BT getClipboardManager() {
        return this.A0d;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addView(view, -1, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        C14360o3.A0A(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(view, i, layoutParams);
    }
}
