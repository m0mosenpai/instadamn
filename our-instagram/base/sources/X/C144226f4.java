package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;
import java.util.Random;

/* renamed from: X.6f4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144226f4 {
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public IgFrameLayout A04;
    public IgFrameLayout A05;
    public IgSimpleImageView A06;
    public IgSimpleImageView A07;
    public IgTextView A08;
    public C5SW A09;
    public C5SW A0A;
    public boolean A0B;
    public boolean A0C;
    public float A0D;
    public final ValueAnimator A0E;
    public final ValueAnimator A0F;
    public final ValueAnimator A0G;
    public final Context A0H;
    public final Sensor A0I;
    public final SensorEventListener A0J;
    public final SensorManager A0K;
    public final View A0L;
    public final InterfaceC41501vz A0M;
    public final InterfaceC56392iX A0N;
    public final InterfaceC09390do A0P;
    public final InterfaceC09390do A0Q;
    public final InterfaceC09390do A0R;
    public final InterfaceC09390do A0S;
    public final InterfaceC09390do A0U;
    public final Random A0O = new Random();
    public final Handler A0T = new Handler(Looper.getMainLooper());

    public C144226f4(Context context, View view, InterfaceC56392iX interfaceC56392iX) {
        SensorManager sensorManager;
        this.A0H = context;
        this.A0N = interfaceC56392iX;
        this.A0L = view;
        Object systemService = context.getSystemService("sensor");
        if (systemService instanceof SensorManager) {
            sensorManager = (SensorManager) systemService;
        } else {
            sensorManager = null;
        }
        this.A0K = sensorManager;
        this.A0I = sensorManager != null ? sensorManager.getDefaultSensor(1) : null;
        this.A0J = new SensorEventListener() { // from class: X.6f5
            @Override // android.hardware.SensorEventListener
            public final void onAccuracyChanged(Sensor sensor, int i) {
            }

            @Override // android.hardware.SensorEventListener
            public final void onSensorChanged(SensorEvent sensorEvent) {
                float f;
                float[] fArr;
                C144226f4 c144226f4 = C144226f4.this;
                if (sensorEvent != null && (fArr = sensorEvent.values) != null) {
                    f = fArr[0];
                } else {
                    f = 0.0f;
                }
                c144226f4.A00 = f;
            }
        };
        this.A0M = new InterfaceC41501vz() { // from class: X.6f6
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(913210520);
                C141936bC c141936bC = (C141936bC) obj;
                int A032 = C0f9.A03(-997949829);
                C14360o3.A0B(c141936bC, 0);
                EnumC77173d3 enumC77173d3 = c141936bC.A00;
                EnumC77173d3 enumC77173d32 = EnumC77173d3.A02;
                C144226f4 c144226f4 = C144226f4.this;
                if (enumC77173d3 == enumC77173d32) {
                    c144226f4.A0B = true;
                    Rect rect = new Rect();
                    c144226f4.A0L.getGlobalVisibleRect(rect);
                    c144226f4.A02 = (rect.left + rect.right) / 2;
                    IgSimpleImageView igSimpleImageView = c144226f4.A06;
                    if (igSimpleImageView != null) {
                        igSimpleImageView.setTranslationX(r4 - (((Number) c144226f4.A0Q.getValue()).intValue() / 2));
                        IgSimpleImageView igSimpleImageView2 = c144226f4.A06;
                        if (igSimpleImageView2 != null) {
                            igSimpleImageView2.setVisibility(0);
                            c144226f4.A0E.start();
                            c144226f4.A0F.start();
                            C0f9.A0A(-707292730, A032);
                            C0f9.A0A(-1389395610, A03);
                            return;
                        }
                    }
                    C14360o3.A0F("heartView");
                    throw C00O.createAndThrow();
                }
                c144226f4.A0B = false;
                IgSimpleImageView igSimpleImageView3 = c144226f4.A06;
                if (igSimpleImageView3 != null) {
                    igSimpleImageView3.setVisibility(8);
                    c144226f4.A0E.end();
                    c144226f4.A0F.end();
                    C0f9.A0A(-707292730, A032);
                    C0f9.A0A(-1389395610, A03);
                    return;
                }
                C14360o3.A0F("heartView");
                throw C00O.createAndThrow();
            }
        };
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.6f7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Number number;
                C14360o3.A0B(valueAnimator, 0);
                Object animatedValue = valueAnimator.getAnimatedValue();
                if ((animatedValue instanceof Float) && (number = (Number) animatedValue) != null) {
                    float floatValue = number.floatValue();
                    IgSimpleImageView igSimpleImageView = C144226f4.this.A06;
                    if (igSimpleImageView == null) {
                        C14360o3.A0F("heartView");
                        throw C00O.createAndThrow();
                    }
                    igSimpleImageView.setAlpha(floatValue);
                }
            }
        });
        this.A0E = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.9f, 1.1f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.6f8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Number number;
                C14360o3.A0B(valueAnimator, 0);
                Object animatedValue = valueAnimator.getAnimatedValue();
                if ((animatedValue instanceof Float) && (number = (Number) animatedValue) != null) {
                    float floatValue = number.floatValue();
                    C144226f4 c144226f4 = C144226f4.this;
                    IgSimpleImageView igSimpleImageView = c144226f4.A06;
                    if (igSimpleImageView != null) {
                        igSimpleImageView.setScaleX(floatValue);
                        IgSimpleImageView igSimpleImageView2 = c144226f4.A06;
                        if (igSimpleImageView2 != null) {
                            igSimpleImageView2.setScaleY(floatValue);
                            return;
                        }
                    }
                    C14360o3.A0F("heartView");
                    throw C00O.createAndThrow();
                }
            }
        });
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.A0F = ofFloat2;
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.setDuration(1000L);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.6f9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Number number;
                C14360o3.A0B(valueAnimator, 0);
                Object animatedValue = valueAnimator.getAnimatedValue();
                if ((animatedValue instanceof Float) && (number = (Number) animatedValue) != null) {
                    float floatValue = number.floatValue();
                    C144226f4 c144226f4 = C144226f4.this;
                    IgSimpleImageView igSimpleImageView = c144226f4.A06;
                    if (igSimpleImageView != null) {
                        igSimpleImageView.setRotation(360.0f * floatValue);
                        IgSimpleImageView igSimpleImageView2 = c144226f4.A06;
                        if (igSimpleImageView2 != null) {
                            igSimpleImageView2.setTranslationY(((floatValue * floatValue) - floatValue) * 1600.0f);
                            IgSimpleImageView igSimpleImageView3 = c144226f4.A06;
                            if (igSimpleImageView3 != null) {
                                igSimpleImageView3.setTranslationX((c144226f4.A02 - (((Number) c144226f4.A0Q.getValue()).intValue() / 2)) - (50.0f * floatValue));
                                IgSimpleImageView igSimpleImageView4 = c144226f4.A06;
                                if (igSimpleImageView4 != null) {
                                    float f = 1.0f;
                                    if (floatValue >= 0.9f) {
                                        f = (1.0f - floatValue) * 10.0f;
                                    }
                                    igSimpleImageView4.setAlpha(f);
                                    return;
                                }
                            }
                        }
                    }
                    C14360o3.A0F("heartView");
                    throw C00O.createAndThrow();
                }
            }
        });
        this.A0G = ofFloat3;
        this.A0S = AbstractC09440dt.A01(new C9E7(this, 12));
        this.A0U = AbstractC09440dt.A01(new C9E7(this, 11));
        this.A0Q = AbstractC09440dt.A01(new C9E7(this, 9));
        this.A0R = AbstractC09440dt.A01(new C9E7(this, 10));
        this.A0P = AbstractC09440dt.A01(new C9E7(this, 8));
    }

    public final void A04(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        SensorManager sensorManager = this.A0K;
        if (sensorManager != null) {
            C0fX.A00(this.A0J, sensorManager);
        }
        AbstractC25651Mw.A00(userSession).A02(this.A0M, C141936bC.class);
        this.A0N.setVisibility(8);
        C5SW c5sw = this.A0A;
        if (c5sw != null) {
            c5sw.A08(false);
        }
        this.A0A = null;
    }

    public static final int A00(C144226f4 c144226f4) {
        return ((Number) c144226f4.A0U.getValue()).intValue();
    }

    private final void A01() {
        String str;
        this.A0T.removeCallbacksAndMessages(null);
        IgSimpleImageView igSimpleImageView = this.A07;
        if (igSimpleImageView == null) {
            str = "stickerView";
        } else {
            igSimpleImageView.setTranslationX((((Number) this.A0S.getValue()).intValue() / 2) - (A00(this) / 2));
            IgSimpleImageView igSimpleImageView2 = this.A06;
            if (igSimpleImageView2 != null) {
                igSimpleImageView2.setVisibility(8);
                this.A0D = 0.0f;
                this.A0B = false;
                IgSimpleImageView igSimpleImageView3 = this.A06;
                if (igSimpleImageView3 != null) {
                    igSimpleImageView3.setVisibility(8);
                    this.A0E.end();
                    this.A0F.end();
                    return;
                }
            }
            str = "heartView";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x027d, code lost:
    
        r2 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0285, code lost:
    
        if (r2.hasNext() == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0287, code lost:
    
        r1 = (android.view.View) r2.next();
        r0 = r14.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x028f, code lost:
    
        if (r0 == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0291, code lost:
    
        r0.removeView(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(com.instagram.common.session.UserSession r12, X.C24018Akw r13, X.C144226f4 r14) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C144226f4.A02(com.instagram.common.session.UserSession, X.Akw, X.6f4):void");
    }

    public static final void A03(C144226f4 c144226f4) {
        IgSimpleImageView igSimpleImageView = c144226f4.A07;
        if (igSimpleImageView == null) {
            C14360o3.A0F("stickerView");
            throw C00O.createAndThrow();
        }
        igSimpleImageView.performHapticFeedback(1);
    }

    public final void A05(UserSession userSession, C41181vS c41181vS, boolean z, boolean z2) {
        C84823qW c84823qW;
        String str;
        String str2;
        List BlY = c41181vS.BlY(EnumC75383a5.A0e);
        C24018Akw c24018Akw = null;
        if (BlY != null) {
            c84823qW = (C84823qW) AbstractC001800i.A0J(BlY);
            if (c84823qW != null) {
                c24018Akw = c84823qW.A10;
            }
        } else {
            c84823qW = null;
        }
        if (z && !z2 && c84823qW != null && c24018Akw != null) {
            InterfaceC56392iX interfaceC56392iX = this.A0N;
            if (!interfaceC56392iX.CWW()) {
                IgFrameLayout igFrameLayout = (IgFrameLayout) interfaceC56392iX.getView();
                this.A05 = igFrameLayout;
                str = "containerView";
                if (igFrameLayout != null) {
                    this.A07 = (IgSimpleImageView) igFrameLayout.requireViewById(R.id.sticker_view);
                    IgFrameLayout igFrameLayout2 = this.A05;
                    if (igFrameLayout2 != null) {
                        this.A06 = (IgSimpleImageView) igFrameLayout2.requireViewById(R.id.heart_view);
                        IgFrameLayout igFrameLayout3 = this.A05;
                        if (igFrameLayout3 != null) {
                            this.A04 = (IgFrameLayout) igFrameLayout3.requireViewById(R.id.coin_container);
                            IgFrameLayout igFrameLayout4 = this.A05;
                            if (igFrameLayout4 != null) {
                                this.A08 = (IgTextView) igFrameLayout4.requireViewById(R.id.score_view);
                            }
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            SensorManager sensorManager = this.A0K;
            if (sensorManager != null) {
                C0fX.A01(this.A0I, this.A0J, sensorManager, 3);
            }
            AbstractC25651Mw.A00(userSession).A01(this.A0M, C141936bC.class);
            interfaceC56392iX.setVisibility(0);
            IgSimpleImageView igSimpleImageView = this.A07;
            str = "stickerView";
            if (igSimpleImageView != null) {
                Context context = this.A0H;
                igSimpleImageView.setImageDrawable(context.getDrawable(c24018Akw.A00.A00));
                IgSimpleImageView igSimpleImageView2 = this.A07;
                if (igSimpleImageView2 != null) {
                    C0fQ.A00(new ViewOnClickListenerC48048LOu(c24018Akw, this), igSimpleImageView2);
                    C5SW c5sw = this.A0A;
                    if ((c5sw == null || !c5sw.A09()) && (str2 = c24018Akw.A01) != null && str2.length() != 0) {
                        IgFrameLayout igFrameLayout5 = this.A05;
                        if (igFrameLayout5 == null) {
                            str = "containerView";
                        } else {
                            C5SU c5su = new C5SU(context, igFrameLayout5, new C149686oL(str2));
                            IgSimpleImageView igSimpleImageView3 = this.A07;
                            if (igSimpleImageView3 != null) {
                                c5su.A03(igSimpleImageView3);
                                c5su.A02();
                                c5su.A04 = new KYN(this);
                                this.A0A = c5su.A00();
                                IgSimpleImageView igSimpleImageView4 = this.A07;
                                if (igSimpleImageView4 != null) {
                                    igSimpleImageView4.postDelayed(new M2L(this), 500L);
                                }
                            }
                        }
                    }
                    A01();
                    A02(userSession, c24018Akw, this);
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        A04(userSession);
    }
}
