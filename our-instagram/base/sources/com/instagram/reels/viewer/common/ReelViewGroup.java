package com.instagram.reels.viewer.common;

import X.AbstractC09440dt;
import X.AbstractC13880nE;
import X.AbstractC138846Qp;
import X.AbstractC16960so;
import X.AbstractC52812bN;
import X.AnonymousClass001;
import X.C00O;
import X.C01T;
import X.C06090Tz;
import X.C0f9;
import X.C141626af;
import X.C141636ag;
import X.C141646ah;
import X.C14360o3;
import X.C143726eF;
import X.C147676ks;
import X.C17280tP;
import X.C18U;
import X.C19700xy;
import X.C1H4;
import X.C38081GpA;
import X.C84823qW;
import X.C9F7;
import X.EnumC09460dv;
import X.HandlerC50755MbL;
import X.InterfaceC09390do;
import X.InterfaceC144616fh;
import X.InterfaceC147526kd;
import X.InterfaceGestureDetectorOnGestureListenerC149756oS;
import X.O4L;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.reels.viewer.common.ReelViewGroup;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class ReelViewGroup extends FrameLayout implements InterfaceC147526kd {
    public float A00;
    public float A01;
    public C141636ag A02;
    public HandlerC50755MbL A03;
    public boolean A04;
    public boolean A05;
    public float A06;
    public UserSession A07;
    public IgProgressImageView A08;
    public final Paint A09;
    public final Paint A0A;
    public final InterfaceGestureDetectorOnGestureListenerC149756oS A0B;
    public final List A0C;
    public final Paint A0D;
    public final Paint A0E;
    public final Rect A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReelViewGroup(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int width;
        boolean A07;
        C14360o3.A0B(canvas, 0);
        super.dispatchDraw(canvas);
        if (A04()) {
            if (AbstractC52812bN.A00) {
                IgProgressImageView igProgressImageView = this.A08;
                if (igProgressImageView != null) {
                    width = igProgressImageView.getWidth();
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                width = getWidth();
            }
            if (A05()) {
                A03(canvas, new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER), width);
                if (A07() || A06()) {
                    List list = this.A0C;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        int ordinal = ((C84823qW) obj).A12.ordinal();
                        if (ordinal != 21) {
                            if (ordinal == 23 || ordinal == 24) {
                                A07 = A06();
                            }
                        } else {
                            A07 = A07();
                        }
                        if (A07) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        A02(canvas, this.A09, (C84823qW) it.next(), width);
                    }
                }
                A03(canvas, new PorterDuffXfermode(PorterDuff.Mode.DARKEN), width);
                return;
            }
            C19700xy c19700xy = C17280tP.A4E;
            Context context = getContext();
            C14360o3.A07(context);
            C17280tP A01 = c19700xy.A01(context);
            if (((Boolean) A01.A2x.CES(A01, C17280tP.A4G[3])).booleanValue()) {
                Iterator it2 = this.A0C.iterator();
                while (it2.hasNext()) {
                    A02(canvas, this.A0A, (C84823qW) it2.next(), width);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        return getSwipeController().A00.onTouchEvent(motionEvent);
    }

    public final void setUserSession(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        this.A07 = userSession;
        if (A04()) {
            invalidate();
        }
    }

    private final void A03(Canvas canvas, PorterDuffXfermode porterDuffXfermode, int i) {
        C19700xy c19700xy = C17280tP.A4E;
        Context context = getContext();
        C14360o3.A07(context);
        C17280tP A01 = c19700xy.A01(context);
        if (((Boolean) A01.A2J.CES(A01, C17280tP.A4G[41])).booleanValue()) {
            Paint paint = this.A0D;
            paint.setXfermode(porterDuffXfermode);
            UserSession userSession = this.A07;
            Rect rect = this.A0F;
            Paint paint2 = this.A0E;
            int containerHeight = getContainerHeight();
            int horizontalMarginWidth = getHorizontalMarginWidth();
            C14360o3.A0B(rect, 2);
            C14360o3.A0B(paint2, 4);
            if (userSession != null) {
                canvas.save();
                int i2 = 0;
                C06090Tz c06090Tz = C06090Tz.A06;
                float A00 = (float) C18U.A00(c06090Tz, userSession, 37167903950569934L);
                if (A00 < 0.0f) {
                    A00 = 0.0f;
                } else if (A00 > 1.0f) {
                    A00 = 1.0f;
                }
                float A002 = (float) C18U.A00(c06090Tz, userSession, 37167903950504397L);
                if (A002 < 0.0f) {
                    A002 = 0.0f;
                } else if (A002 > 1.0f) {
                    A002 = 1.0f;
                }
                float A003 = (float) C18U.A00(c06090Tz, userSession, 37167903950438860L);
                if (A003 < 0.0f) {
                    A003 = 0.0f;
                } else if (A003 > 1.0f) {
                    A003 = 1.0f;
                }
                float A004 = (float) C18U.A00(c06090Tz, userSession, 37167903950373323L);
                if (A004 < 0.0f) {
                    A004 = 0.0f;
                } else if (A004 > 1.0f) {
                    A004 = 1.0f;
                }
                float f = i;
                int A012 = C1H4.A01(A00 * f);
                float f2 = containerHeight;
                int A013 = C1H4.A01(A002 * f2);
                rect.set(0, 0, C1H4.A01(f * A003), C1H4.A01(f2 * A004));
                rect.offset(A012 + horizontalMarginWidth, A013);
                canvas.drawRect(rect, paint);
                for (Object obj : AbstractC16960so.A1Q(AnonymousClass001.A0N(" h = ", A004), AnonymousClass001.A0N(" w = ", A003), AnonymousClass001.A0N(" y = ", A002), AnonymousClass001.A0N(" x = ", A00), " TAA")) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC16960so.A1U();
                        throw C00O.createAndThrow();
                    }
                    canvas.drawText((String) obj, rect.left, rect.bottom - (i3 * paint2.getTextSize()), paint2);
                    i2 = i3;
                }
                canvas.restore();
            }
        }
    }

    private final boolean A04() {
        C19700xy c19700xy = C17280tP.A4E;
        Context context = getContext();
        C14360o3.A07(context);
        C17280tP A01 = c19700xy.A01(context);
        if (!((Boolean) A01.A2x.CES(A01, C17280tP.A4G[3])).booleanValue() && !A05()) {
            return false;
        }
        return true;
    }

    private final boolean A05() {
        C19700xy c19700xy = C17280tP.A4E;
        Context context = getContext();
        C14360o3.A07(context);
        C17280tP A01 = c19700xy.A01(context);
        if (!((Boolean) A01.A2J.CES(A01, C17280tP.A4G[41])).booleanValue() && !A07() && !A06()) {
            return false;
        }
        return true;
    }

    private final boolean A06() {
        C19700xy c19700xy = C17280tP.A4E;
        Context context = getContext();
        C14360o3.A07(context);
        C17280tP A01 = c19700xy.A01(context);
        return ((Boolean) A01.A2H.CES(A01, C17280tP.A4G[43])).booleanValue();
    }

    private final boolean A07() {
        C19700xy c19700xy = C17280tP.A4E;
        Context context = getContext();
        C14360o3.A07(context);
        C17280tP A01 = c19700xy.A01(context);
        return ((Boolean) A01.A2I.CES(A01, C17280tP.A4G[42])).booleanValue();
    }

    private final int getContainerHeight() {
        IgProgressImageView igProgressImageView = this.A08;
        if (igProgressImageView != null) {
            return igProgressImageView.getHeight();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final C141626af getOrchestratorListener() {
        return (C141626af) this.A0G.getValue();
    }

    public final C38081GpA getSwipeController() {
        return (C38081GpA) this.A0H.getValue();
    }

    private final GestureDetector getTapDetector() {
        return (GestureDetector) this.A0I.getValue();
    }

    public final void A08(List list, float f) {
        this.A06 = f;
        List list2 = this.A0C;
        list2.clear();
        if (list != null) {
            list2.addAll(list);
        }
        C01T.A1D(list2, new Comparator(C141646ah.A00) { // from class: X.6ai
            public final /* synthetic */ InterfaceC16620sF A00;

            {
                C14360o3.A0B(r2, 1);
                this.A00 = r2;
            }

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return ((Number) this.A00.invoke(obj, obj2)).intValue();
            }
        });
        if (A04()) {
            invalidate();
        }
    }

    public final void A09(boolean z) {
        this.A05 = z;
        if (z && this.A03 == null) {
            HandlerC50755MbL handlerC50755MbL = new HandlerC50755MbL();
            this.A03 = handlerC50755MbL;
            handlerC50755MbL.A00 = new O4L(this);
        }
        getTapDetector().setIsLongpressEnabled(!this.A05);
    }

    public static final /* synthetic */ C141626af A01(ReelViewGroup reelViewGroup) {
        return reelViewGroup.getOrchestratorListener();
    }

    private final void A02(Canvas canvas, Paint paint, C84823qW c84823qW, int i) {
        int containerHeight = getContainerHeight();
        float f = this.A06;
        Rect rect = this.A0F;
        AbstractC138846Qp.A02(rect, c84823qW, f, i, containerHeight, getHorizontalMarginWidth());
        canvas.save();
        canvas.rotate(c84823qW.A01 * 360.0f, rect.centerX(), rect.centerY());
        canvas.drawRect(rect, paint);
        canvas.restore();
    }

    private final int getHorizontalMarginWidth() {
        Context context = getContext();
        C14360o3.A07(context);
        if (C143726eF.A0C(context)) {
            return C143726eF.A01(context);
        }
        return 0;
    }

    @Override // X.InterfaceC147526kd
    public final void A97(InterfaceC144616fh interfaceC144616fh) {
        getOrchestratorListener().A00.add(interfaceC144616fh);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        int A06 = C0f9.A06(-1786698181);
        super.onFinishInflate();
        this.A08 = (IgProgressImageView) findViewById(R.id.reel_viewer_image_view);
        C0f9.A0D(797628635, A06);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(-758948095);
        C14360o3.A0B(motionEvent, 0);
        boolean onTouchEvent = getTapDetector().onTouchEvent(motionEvent);
        if (this.A05 && this.A04) {
            getOrchestratorListener().DQr(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            C141636ag c141636ag = this.A02;
            if (c141636ag != null) {
                MotionEvent motionEvent2 = c141636ag.A00;
                if (motionEvent2 != null) {
                    long eventTime = motionEvent.getEventTime() - motionEvent2.getEventTime();
                    float rawX = motionEvent2.getRawX() - motionEvent.getRawX();
                    float rawY = motionEvent2.getRawY() - motionEvent.getRawY();
                    Context context = c141636ag.A01;
                    float A01 = AbstractC13880nE.A01(context, rawX);
                    float A012 = AbstractC13880nE.A01(context, rawY);
                    if (rawY >= 0.0f && A012 >= ((float) ((Number) c141636ag.A05.getValue()).longValue())) {
                        float f = (float) eventTime;
                        float abs = Math.abs((A01 / f) * 100.0f);
                        float abs2 = Math.abs((A012 / f) * 100.0f);
                        if (abs <= abs2 && abs2 >= ((Number) c141636ag.A06.getValue()).doubleValue()) {
                            double abs3 = Math.abs(90.0d - Math.toDegrees(Math.atan2(rawY, rawX)));
                            if (((Number) c141636ag.A04.getValue()).intValue() <= 0 || abs3 <= ((Number) r1.getValue()).intValue()) {
                                c141636ag.A03.Drb(motionEvent2, motionEvent, 0.0f, 0.0f);
                            }
                        }
                    }
                }
                MotionEvent motionEvent3 = c141636ag.A00;
                if (motionEvent3 != null) {
                    motionEvent3.recycle();
                    c141636ag.A00 = null;
                }
            }
            getOrchestratorListener().Dwo(onTouchEvent);
            if (this.A05) {
                HandlerC50755MbL handlerC50755MbL = this.A03;
                if (handlerC50755MbL != null) {
                    handlerC50755MbL.removeCallbacksAndMessages(null);
                }
                this.A04 = false;
            }
        }
        C0f9.A0C(1255483052, A05);
        return onTouchEvent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReelViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A0B = new InterfaceGestureDetectorOnGestureListenerC149756oS() { // from class: X.6kq
            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                C141626af orchestratorListener;
                C14360o3.A0B(motionEvent, 0);
                ReelViewGroup reelViewGroup = ReelViewGroup.this;
                if (reelViewGroup.A05) {
                    reelViewGroup.A04 = false;
                    reelViewGroup.A00 = motionEvent.getX();
                    reelViewGroup.A01 = motionEvent.getY();
                    HandlerC50755MbL handlerC50755MbL = reelViewGroup.A03;
                    if (handlerC50755MbL != null) {
                        handlerC50755MbL.removeCallbacksAndMessages(null);
                        handlerC50755MbL.sendEmptyMessageDelayed(1, ViewConfiguration.getLongPressTimeout());
                    }
                }
                C141636ag c141636ag = reelViewGroup.A02;
                if (c141636ag != null) {
                    c141636ag.A00 = MotionEvent.obtain(motionEvent);
                }
                orchestratorListener = reelViewGroup.getOrchestratorListener();
                orchestratorListener.DBc(motionEvent.getX());
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                C38081GpA swipeController;
                MotionEvent motionEvent3;
                HandlerC50755MbL handlerC50755MbL;
                C14360o3.A0B(motionEvent2, 1);
                ReelViewGroup reelViewGroup = ReelViewGroup.this;
                if (reelViewGroup.A05 && (handlerC50755MbL = reelViewGroup.A03) != null) {
                    handlerC50755MbL.removeCallbacksAndMessages(null);
                }
                C141636ag c141636ag = reelViewGroup.A02;
                if (c141636ag != null && (motionEvent3 = c141636ag.A00) != null) {
                    motionEvent3.recycle();
                    c141636ag.A00 = null;
                }
                swipeController = reelViewGroup.getSwipeController();
                return swipeController.onFling(motionEvent, motionEvent2, f, f2);
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
                C141626af orchestratorListener;
                MotionEvent motionEvent2;
                C14360o3.A0B(motionEvent, 0);
                ReelViewGroup reelViewGroup = ReelViewGroup.this;
                C141636ag c141636ag = reelViewGroup.A02;
                if (c141636ag != null && (motionEvent2 = c141636ag.A00) != null) {
                    motionEvent2.recycle();
                    c141636ag.A00 = null;
                }
                orchestratorListener = reelViewGroup.getOrchestratorListener();
                orchestratorListener.DQV(motionEvent.getX(), motionEvent.getY());
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                C141626af orchestratorListener;
                HandlerC50755MbL handlerC50755MbL;
                C14360o3.A0B(motionEvent, 0);
                ReelViewGroup reelViewGroup = ReelViewGroup.this;
                if (reelViewGroup.A05 && (handlerC50755MbL = reelViewGroup.A03) != null) {
                    handlerC50755MbL.removeCallbacksAndMessages(null);
                }
                if (reelViewGroup.A04) {
                    return false;
                }
                orchestratorListener = reelViewGroup.getOrchestratorListener();
                orchestratorListener.DsB(motionEvent.getX(), motionEvent.getY());
                return true;
            }
        };
        this.A0C = new ArrayList();
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(Color.argb(150, 0, 0, 0));
        this.A0A = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        paint2.setColor(Color.argb(150, 25, 184, 223));
        this.A0D = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(style);
        paint3.setColor(Color.argb(150, 231, 226, 45));
        this.A09 = paint3;
        Paint paint4 = new Paint();
        paint4.setStyle(style);
        paint4.setColor(Color.argb(255, 255, 255, 255));
        paint4.setTextSize(TypedValue.applyDimension(2, 9.0f, context.getResources().getDisplayMetrics()));
        paint4.setTypeface(Typeface.MONOSPACE);
        paint4.setTextAlign(Paint.Align.LEFT);
        paint4.setFakeBoldText(true);
        this.A0E = paint4;
        this.A0F = new Rect();
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A0H = AbstractC09440dt.A00(enumC09460dv, new C9F7(22, context, this));
        this.A0G = AbstractC09440dt.A00(enumC09460dv, C147676ks.A00);
        this.A0I = AbstractC09440dt.A00(enumC09460dv, new C9F7(23, context, this));
    }

    public /* synthetic */ ReelViewGroup(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReelViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
