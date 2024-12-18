package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import java.util.Iterator;

/* renamed from: X.Tw0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnTouchListenerC65896Tw0 implements View.OnTouchListener, InterfaceC55932he, GestureDetector.OnGestureListener, InterfaceC60152ox {
    public static final double A0e = Math.toRadians(20.0d);
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public MotionEvent A0A;
    public MotionEvent A0B;
    public XBK A0C;
    public C51E A0D;
    public W4O A0E;
    public Integer A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public int A0S;
    public final GestureDetector A0T;
    public final View A0U;
    public final C55982hj A0V;
    public final C3I9 A0W;
    public final InterfaceC189488aT A0X;
    public final C65897Tw1 A0Y;
    public final boolean A0Z;
    public final int A0a;
    public final AbstractC12990ll A0b;
    public final InterfaceC125355lh A0c;
    public final XBL A0d;

    public ViewOnTouchListenerC65896Tw0(View view, AbstractC12990ll abstractC12990ll, InterfaceC189488aT interfaceC189488aT, C65897Tw1 c65897Tw1, XBL xbl) {
        C14360o3.A0B(view, 1);
        C14360o3.A0B(abstractC12990ll, 4);
        this.A0U = view;
        this.A0X = interfaceC189488aT;
        this.A0Y = c65897Tw1;
        this.A0b = abstractC12990ll;
        this.A0d = xbl;
        this.A08 = 1;
        this.A09 = 1;
        Context context = view.getContext();
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.A0T = gestureDetector;
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A06 = true;
        this.A0V = A0R;
        this.A0P = true;
        this.A05 = 2;
        this.A02 = 0.5f;
        this.A0F = C05F.A04;
        this.A0Z = C18U.A06(C06090Tz.A05, abstractC12990ll, 36321241342289146L);
        gestureDetector.setIsLongpressEnabled(false);
        C14360o3.A07(context);
        this.A0a = interfaceC189488aT.Ahd(context);
        this.A0W = C3I7.A01(this, false, true);
        this.A0c = new C71037Wms(this, 5);
        this.A0S = 150;
        int identifier = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            this.A0S = AbstractC166997dE.A04(context, identifier);
        }
    }

    public final float A0E(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return -1.0f;
                    }
                    return A01(this);
                }
                return A00(this);
            }
            return A02(this);
        }
        return 0.0f;
    }

    public final void A0H(Integer num, boolean z) {
        A09(this, 3);
        this.A0F = num;
        if (!z) {
            this.A0V.A08(A00(this), true);
        }
        this.A0V.A06(A00(this));
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        InterfaceC189488aT interfaceC189488aT = this.A0X;
        View C5a = interfaceC189488aT.C5a();
        if (C5a != null) {
            int A05 = A05(this) - ((int) c55982hj.A09.A00);
            C5a.setTranslationY(A05);
            interfaceC189488aT.onBottomSheetPositionChanged(A05, this.A07);
            this.A0Y.A01(A05, this.A07);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        this.A04 = 0.0f;
        this.A0M = true;
        this.A0H = false;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A0O = false;
        this.A00 = motionEvent.getRawX();
        this.A01 = motionEvent.getRawY();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        C14360o3.A0B(motionEvent2, 1);
        C51E c51e = this.A0D;
        if (c51e != null && c51e.doNotFlingWhenDismissLocked()) {
            if (motionEvent != null) {
                f3 = motionEvent.getY();
            } else {
                f3 = Float.MAX_VALUE;
            }
            if (f3 < motionEvent2.getY()) {
                return true;
            }
        }
        this.A04 = f2;
        this.A03 = f;
        this.A0B = motionEvent;
        this.A0A = motionEvent2;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x0284, code lost:
    
        if (r5 != 4) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02b9, code lost:
    
        if (r5 != 3) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02bc, code lost:
    
        if (r11 == 1) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (r21.A01 >= ((1.0f - ((float) X.C18U.A00(X.C06090Tz.A06, r1.A00, 37165962625941915L))) * X.AbstractC13890nF.A00(X.AbstractC166997dE.A0L(r21.A0U)))) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0387, code lost:
    
        if (r0 == 0.0d) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x042b, code lost:
    
        if (r18 != false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x045b, code lost:
    
        if (r0.doNotDismissOnDraggingDown() == true) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00be, code lost:
    
        if (A0F() == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (((float) r2.A09.A00) == ((float) r2.A01)) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x047a  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r22, android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 1247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC65896Tw0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        if (r0.isInMultiWindowMode() != false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float A01(X.ViewOnTouchListenerC65896Tw0 r4) {
        /*
            X.8aT r3 = r4.A0X
            boolean r1 = r3 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            int r0 = A05(r4)
            float r2 = (float) r0
            if (r1 == 0) goto L4f
            r0 = 243(0xf3, float:3.4E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.C14360o3.A0C(r3, r0)
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r3 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r3
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L25
            android.content.res.Configuration r0 = X.AbstractC58319PtB.A08(r0)
            int r1 = r0.orientation
            r0 = 2
            if (r1 == r0) goto L37
        L25:
            boolean r0 = r3.isAdded()
            if (r0 == 0) goto L3e
            android.app.Activity r0 = r3.getRootActivity()
            if (r0 == 0) goto L54
            boolean r0 = r0.isInMultiWindowMode()
            if (r0 == 0) goto L3e
        L37:
            X.8aO r1 = com.instagram.igds.components.bottomsheet.BottomSheetFragment.A00(r3)
            r0 = 0
            r1.A01 = r0
        L3e:
            boolean r0 = com.instagram.igds.components.bottomsheet.BottomSheetFragment.A0K(r3)
            if (r0 == 0) goto L4c
            X.8aO r0 = com.instagram.igds.components.bottomsheet.BottomSheetFragment.A00(r3)
            float r0 = r0.A01
        L4a:
            float r2 = r2 * r0
            return r2
        L4c:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L4a
        L4f:
            float r0 = r3.Cpk()
            goto L4a
        L54:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC65896Tw0.A01(X.Tw0):float");
    }

    private final int A03() {
        InterfaceC189488aT interfaceC189488aT = this.A0X;
        if (interfaceC189488aT instanceof BottomSheetFragment) {
            C14360o3.A0C(interfaceC189488aT, AbstractC111324zv.A00(243));
            int i = BottomSheetFragment.A00((BottomSheetFragment) interfaceC189488aT).A07;
            if (i == 0) {
                if (!A0A() && Math.floor(A00(this)) != Math.floor(A02(this))) {
                    return 3;
                }
                if (!A0B(this)) {
                    return 1;
                }
                return 4;
            }
            return i;
        }
        return 1;
    }

    public static final int A05(ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0) {
        int Abo;
        XBK xbk = viewOnTouchListenerC65896Tw0.A0C;
        if (xbk != null && (Abo = xbk.Abo()) > 0) {
            return Abo;
        }
        View C5a = viewOnTouchListenerC65896Tw0.A0X.C5a();
        if (C5a != null) {
            return C5a.getHeight();
        }
        return 0;
    }

    public static final int A06(ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0) {
        C51E c51e = viewOnTouchListenerC65896Tw0.A0D;
        int C9V = viewOnTouchListenerC65896Tw0.A0X.C9V();
        if (c51e != null) {
            return C9V + c51e.getExtraDragSpace();
        }
        return C9V;
    }

    public static final Integer A07(ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0, Float f) {
        if (f == null) {
            return C05F.A01;
        }
        if (viewOnTouchListenerC65896Tw0.A0J(f.floatValue())) {
            return C05F.A0N;
        }
        return C05F.A0C;
    }

    public static final void A08(MotionEvent motionEvent, ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0) {
        if (!viewOnTouchListenerC65896Tw0.A0H) {
            if (Math.hypot(viewOnTouchListenerC65896Tw0.A00 - motionEvent.getRawX(), viewOnTouchListenerC65896Tw0.A01 - motionEvent.getRawY()) > viewOnTouchListenerC65896Tw0.A0a && Math.atan(Math.abs(r5 / r6)) >= A0e) {
                viewOnTouchListenerC65896Tw0.A0H = true;
            }
        }
    }

    public static final void A09(ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0, int i) {
        int i2 = viewOnTouchListenerC65896Tw0.A09;
        if (i != i2) {
            viewOnTouchListenerC65896Tw0.A08 = i2;
            viewOnTouchListenerC65896Tw0.A09 = i;
            viewOnTouchListenerC65896Tw0.A0Y.A02.A06 = i2;
        }
    }

    private final boolean A0A() {
        InterfaceC189488aT interfaceC189488aT = this.A0X;
        if (interfaceC189488aT instanceof BottomSheetFragment) {
            C14360o3.A0C(interfaceC189488aT, AbstractC111324zv.A00(243));
            if (BottomSheetFragment.A00((BottomSheetFragment) interfaceC189488aT).A0r) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A0B(ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0) {
        InterfaceC189488aT interfaceC189488aT = viewOnTouchListenerC65896Tw0.A0X;
        if (interfaceC189488aT instanceof BottomSheetFragment) {
            C14360o3.A0C(interfaceC189488aT, AbstractC111324zv.A00(243));
            if (BottomSheetFragment.A00((BottomSheetFragment) interfaceC189488aT).A0s) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A0C(ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0) {
        if ((viewOnTouchListenerC65896Tw0.A07 == 0 || viewOnTouchListenerC65896Tw0.A0X.ABC()) && viewOnTouchListenerC65896Tw0.A0X.CQm()) {
            return true;
        }
        return false;
    }

    public final int A0F() {
        View C5a = this.A0X.C5a();
        if (C5a != null) {
            return A05(this) - ((int) C5a.getTranslationY());
        }
        return (int) this.A0V.A09.A00;
    }

    public final void A0G() {
        this.A0V.A0D.clear();
        C3I9 c3i9 = this.A0W;
        c3i9.EFx(this);
        c3i9.onStop();
        InterfaceC189488aT interfaceC189488aT = this.A0X;
        interfaceC189488aT.onBottomSheetClosed();
        if (!this.A0N) {
            View C5a = interfaceC189488aT.C5a();
            if (C5a instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) C5a;
                viewGroup.setVisibility(4);
                if (!C18U.A06(C06090Tz.A05, this.A0b, 36321241342485756L)) {
                    viewGroup.removeAllViews();
                }
            }
        }
        XBL xbl = this.A0d;
        if (xbl != null) {
            xbl.D09();
        }
        A09(this, 1);
    }

    public final boolean A0J(float f) {
        float f2;
        View C5a = this.A0X.C5a();
        if (C5a != null) {
            f2 = C5a.getTranslationY();
        } else {
            f2 = 0.0f;
        }
        return AbstractC31175DnJ.A1S((f > (f2 + A06(this)) ? 1 : (f == (f2 + A06(this)) ? 0 : -1)));
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        InterfaceC125355lh j0j;
        InterfaceC189488aT interfaceC189488aT = this.A0X;
        if (!interfaceC189488aT.Ei2()) {
            this.A07 = i;
            return;
        }
        if (interfaceC189488aT.CQm()) {
            this.A07 = i;
            if (i <= this.A0S) {
                interfaceC189488aT.DOM();
            } else {
                interfaceC189488aT.DON(i);
            }
            View C5a = interfaceC189488aT.C5a();
            if (C5a == null) {
                return;
            }
            C5a.post(new RunnableC65976TxV(this));
            return;
        }
        View view = this.A0U;
        C55942hf c55942hf = C150956qv.A02;
        AbstractC125325le A00 = AbstractC125325le.A00(view);
        A00.A0G();
        if (i == 0) {
            j0j = this.A0c;
        } else {
            j0j = new J0J(i, 1, this);
        }
        A00.A05 = j0j;
        AbstractC125325le A0A = A00.A0A();
        A0A.A0K(-i);
        A0A.A0H();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.A0M) {
            this.A0M = false;
            return true;
        }
        if (!this.A0H || this.A0I) {
            return true;
        }
        C51E c51e = this.A0D;
        if (c51e != null && c51e.doNotDragWhenDismissLocked()) {
            if (((float) Math.min(Math.max(A0F() + f2 + c51e.dragLockBouncePx(), 0.0d), A02(this))) <= A05(this) * this.A0X.Cpk()) {
                return true;
            }
        }
        float A0F = A0F();
        float min = (float) Math.min(Math.max(f2 + A0F, 0.0d), A02(this));
        if (A0F == min) {
            return true;
        }
        if (!this.A0X.ABC()) {
            AbstractC13880nE.A0O(this.A0U);
        }
        this.A0V.A08(min, true);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C3DP c3dp = this.A0Y.A02;
        View.OnClickListener onClickListener = c3dp.A08;
        if (onClickListener != null) {
            onClickListener.onClick(C3DP.A01(c3dp));
            return false;
        }
        return false;
    }

    public static final float A00(ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0) {
        return A05(viewOnTouchListenerC65896Tw0) * viewOnTouchListenerC65896Tw0.A0X.Cpk();
    }

    public static final float A02(ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0) {
        return A05(viewOnTouchListenerC65896Tw0) * viewOnTouchListenerC65896Tw0.A0X.Cnp();
    }

    private final int A04(int i, int i2, boolean z) {
        C51E c51e;
        int A0E = (int) A0E(i);
        int A0E2 = (int) A0E(i2);
        double d = 0.5d;
        if (z && (c51e = this.A0D) != null) {
            d = c51e.getDragUpReleaseRatio();
        }
        return (int) (A0E2 + ((A0E - A0E2) * d));
    }

    public static final boolean A0D(ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0) {
        return AbstractC167007dF.A1N((viewOnTouchListenerC65896Tw0.A0F() > Math.floor(A02(viewOnTouchListenerC65896Tw0)) ? 1 : (viewOnTouchListenerC65896Tw0.A0F() == Math.floor(A02(viewOnTouchListenerC65896Tw0)) ? 0 : -1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0I(boolean r7) {
        /*
            r6 = this;
            boolean r0 = A0C(r6)
            if (r0 == 0) goto L42
            X.2hj r4 = r6.A0V
            X.2hk r0 = r4.A09
            double r2 = r0.A00
            float r0 = A02(r6)
            double r0 = (double) r0
            double r1 = java.lang.Math.min(r2, r0)
            boolean r0 = r4.A0C()
            r4.A08(r1, r0)
            r5 = 2
            r1 = 3
            if (r7 != 0) goto L43
            int r0 = r6.A09
            if (r0 == r1) goto L43
            if (r0 != r5) goto L2e
            float r0 = A02(r6)
        L2a:
            double r0 = (double) r0
            r4.A06(r0)
        L2e:
            double r3 = r4.A01
            float r0 = A02(r6)
            double r1 = (double) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L3f
            boolean r0 = r6.A0G
            r5 = 3
            if (r0 == 0) goto L3f
            r5 = 4
        L3f:
            A09(r6, r5)
        L42:
            return
        L43:
            float r0 = A00(r6)
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC65896Tw0.A0I(boolean):void");
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        int height;
        int height2;
        if (A0F() == 0) {
            this.A0Y.A00();
            if (this.A0P) {
                this.A0V.A0B(this);
            } else {
                AbstractC13880nE.A0O(this.A0U);
            }
        } else if (this.A09 == 3) {
            C65897Tw1 c65897Tw1 = this.A0Y;
            Integer num = this.A0F;
            C14360o3.A0B(num, 0);
            C3DP c3dp = c65897Tw1.A02;
            for (InterfaceC86363t8 interfaceC86363t8 : c3dp.A10) {
                InterfaceC189488aT interfaceC189488aT = c65897Tw1.A01;
                if (interfaceC189488aT.C5a() == null) {
                    height = 0;
                } else {
                    height = (int) (r0.getHeight() * (1.0f - interfaceC189488aT.Cpk()));
                }
                interfaceC86363t8.CwQ(height);
                if (interfaceC189488aT.C5a() == null) {
                    height2 = 0;
                } else {
                    height2 = (int) (r0.getHeight() * (1.0f - interfaceC189488aT.Cpk()));
                }
                interfaceC86363t8.CwR(num, height2);
            }
            C68815VcW c68815VcW = c3dp.A0C;
            if (c68815VcW != null) {
                c68815VcW.A00.FD0(VD2.A04, AbstractC68583VWk.A00(num));
            }
            c3dp.A0D();
        } else if (A0D(this)) {
            C65897Tw1 c65897Tw12 = this.A0Y;
            Integer num2 = this.A0F;
            C14360o3.A0B(num2, 0);
            C3DP c3dp2 = c65897Tw12.A02;
            Iterator it = c3dp2.A10.iterator();
            while (it.hasNext()) {
                ((InterfaceC86363t8) it.next()).DId(num2);
            }
            C68815VcW c68815VcW2 = c3dp2.A0C;
            if (c68815VcW2 != null) {
                c68815VcW2.A00.FD0(VD2.A02, AbstractC68583VWk.A00(num2));
            }
            if (c3dp2.A0O) {
                C3DP.A02(c3dp2).COs(null);
            }
        } else if (this.A09 == 4) {
            this.A0Y.A03(this.A0F);
        }
        this.A0F = C05F.A04;
    }
}
