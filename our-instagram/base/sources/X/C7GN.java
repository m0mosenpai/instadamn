package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Chronometer;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.xapp.messaging.audio.waveforms.VoiceVisualizer;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7GN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7GN extends GestureDetector.SimpleOnGestureListener implements C7GO {
    public int A00;
    public int A01;
    public long A02;
    public RectF A03;
    public RectF A04;
    public RectF A05;
    public GestureDetector A06;
    public View A07;
    public View A08;
    public Chronometer A09;
    public ImageView A0A;
    public ImageView A0B;
    public TextView A0C;
    public VoiceVisualizer A0D;
    public Integer A0E;
    public String A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public InterfaceC09390do A0J;
    public final int A0K;
    public final Context A0L;
    public final UserSession A0O;
    public final C7GT A0P;
    public final C7GL A0Q;
    public final C7GJ A0R;
    public final C7DM A0S;
    public final C125055lB A0T;
    public final Integer A0U;
    public final InterfaceC09390do A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final float A0Z;
    public final InterfaceC83713oG A0b;
    public final Handler A0M = new Handler(Looper.getMainLooper());
    public final View.OnClickListener A0N = new View.OnClickListener() { // from class: X.7GP
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int A05 = C0f9.A05(-148078796);
            C7GN c7gn = C7GN.this;
            InterfaceC09390do interfaceC09390do = c7gn.A0V;
            if (((MRH) interfaceC09390do.getValue()).isRecording()) {
                c7gn.A0Q.E1S();
                ((MRH) interfaceC09390do.getValue()).Eoe(false);
            } else {
                L33 Auq = ((MRH) interfaceC09390do.getValue()).Auq();
                if (Auq != null) {
                    C7GN.A09(c7gn, Auq);
                    Chronometer chronometer = c7gn.A09;
                    if (chronometer != null) {
                        boolean z = false;
                        if (((int) (c7gn.A02 - chronometer.getBase())) < 750) {
                            z = true;
                        }
                        C7GN.A0B(c7gn, z, false);
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException("Required value was null.");
                        C0f9.A0C(1812953616, A05);
                        throw illegalStateException;
                    }
                }
            }
            C0f9.A0C(1391010276, A05);
        }
    };
    public final View.OnTouchListener A0a = new View.OnTouchListener() { // from class: X.7GQ
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                C7GN c7gn = C7GN.this;
                if (!C7GN.A0C(c7gn, motionEvent.getRawX(), motionEvent.getRawY())) {
                    c7gn.A0N.onClick(view);
                    return true;
                }
            }
            return false;
        }
    };
    public final Runnable A0c = new Runnable() { // from class: X.7GR
        @Override // java.lang.Runnable
        public final void run() {
            C7GN c7gn = C7GN.this;
            if (c7gn.A0I) {
                c7gn.A0H = true;
                C7GN.A05(c7gn);
            }
        }
    };

    public static final void A0A(C7GN c7gn, L33 l33) {
        boolean z;
        boolean z2 = false;
        Long l = null;
        String str = null;
        c7gn.A0Q.EOo(l33, c7gn.A0F);
        C7DM c7dm = c7gn.A0S;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(l33.A00);
        InterfaceC83713oG interfaceC83713oG = c7gn.A0b;
        if (interfaceC83713oG == null) {
            z = false;
        } else {
            str = AbstractC92784Dr.A02(interfaceC83713oG);
            l = AbstractC92784Dr.A01(interfaceC83713oG);
            z2 = interfaceC83713oG instanceof InterfaceC2056098k;
            z = true;
        }
        C18920wW c18920wW = c7dm.A00;
        C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "audio_clips_send"), 4);
        if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
            c25531Mh.A0Q("duration", Long.valueOf(seconds));
            c25531Mh.A0O("with_captions", false);
            if (z) {
                c25531Mh.A0R("open_thread_id", str);
                c25531Mh.A0Q("occamadillo_thread_id", l);
                c25531Mh.A0O("is_e2ee", Boolean.valueOf(z2));
            }
            c25531Mh.A0O("has_avatar", false);
            c25531Mh.Cht();
        }
    }

    @Override // X.C7GO
    public final void DdX(boolean z) {
        Integer num;
        if (z) {
            C7GJ c7gj = this.A0R;
            c7gj.A05.A03(0);
            A06(this);
            Chronometer chronometer = this.A09;
            if (chronometer != null) {
                chronometer.setBase(SystemClock.elapsedRealtime());
            }
            Chronometer chronometer2 = this.A09;
            if (chronometer2 != null) {
                chronometer2.start();
            }
            this.A0Q.E1R(this.A0H);
            if (this.A0H) {
                num = C05F.A0C;
            } else {
                num = C05F.A0Y;
            }
            boolean z2 = false;
            if (this.A0E != num) {
                z2 = true;
                this.A0E = num;
            }
            A04(this);
            if (z2 && (c7gj.A04.A00 != null || this.A0W)) {
                A08(this);
            }
            if (!this.A0H) {
                TextView textView = this.A0C;
                if (textView != null) {
                    textView.setText(2131960864);
                }
                A07(this);
                Chronometer chronometer3 = this.A09;
                if (chronometer3 != null) {
                    chronometer3.setKeepScreenOn(true);
                    return;
                }
                return;
            }
            return;
        }
        C9GR.A01(this.A0L, "direct_voice_failed_to_start", 2131960846, 0);
        this.A0E = C05F.A01;
    }

    public static final View A00(C7GN c7gn) {
        View view = c7gn.A0R.A00;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final C161507Ll A01(C7GN c7gn) {
        InterfaceC09390do interfaceC09390do = c7gn.A0J;
        if (interfaceC09390do != null) {
            return (C161507Ll) interfaceC09390do.getValue();
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A02() {
        View view;
        if (!this.A0W && (view = this.A0R.A01) != null) {
            AbstractC125325le A01 = AbstractC125325le.A01(view, 0);
            A01.A0G();
            A01.A04 = 0;
            A01.A0K(-this.A0L.getResources().getDimensionPixelOffset(R.dimen.activation_card_icon_container_width));
            A01.A05 = new C49601Lvu(view, this);
            A01.A0H();
        }
    }

    public static final void A04(C7GN c7gn) {
        View view;
        float f;
        float x;
        View view2;
        RectF rectF = c7gn.A05;
        if (rectF != null && (view = c7gn.A08) != null) {
            A01(c7gn);
            Integer num = C05F.A00;
            AbstractC125325le A01 = AbstractC125325le.A01(view, 0);
            A01.A0G();
            A01.A0U(0.0f, 1.0f, rectF.centerX() / 2.0f);
            A01.A0V(0.9f, 1.0f, view.getHeight() / 2);
            A01.A0F(true).A0H();
            ImageView imageView = c7gn.A0B;
            if (imageView != null) {
                AbstractC125325le A012 = AbstractC125325le.A01(imageView, 0);
                A012.A0G();
                A012.A0U(0.0f, 1.0f, -1.0f);
                A012.A0V(0.0f, 1.0f, -1.0f);
                A012.A0F(true).A0H();
                if (c7gn.A0U == num && (view2 = c7gn.A07) != null) {
                    view2.setAlpha(1.0f);
                }
                if (c7gn.A0E == C05F.A0C) {
                    C7GJ c7gj = c7gn.A0R;
                    View A013 = c7gj.A04.A01();
                    C14360o3.A07(A013);
                    boolean z = c7gn.A0W;
                    if (z) {
                        f = A00(c7gn).getY();
                    } else {
                        f = c7gn.A01;
                    }
                    A013.setY(f);
                    if (z) {
                        x = AbstractC13880nE.A0A(c7gn.A0L) / 2.0f;
                    } else {
                        x = A00(c7gn).getX();
                    }
                    A013.setX(x);
                    AbstractC125325le A014 = AbstractC125325le.A01(A013, 0);
                    A014.A0G();
                    A014.A04 = 0;
                    A014.A0V(0.0f, 0.8f, -1.0f);
                    A014.A0U(0.0f, 0.8f, -1.0f);
                    A014.A0H();
                    if (c7gn.A0Y) {
                        if (c7gj.A01 != null) {
                            c7gn.A02();
                            return;
                        }
                        TextView textView = c7gn.A0C;
                        if (textView == null) {
                            return;
                        }
                        textView.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public static final void A05(C7GN c7gn) {
        Integer num;
        EnumC53362NjD enumC53362NjD;
        if (c7gn.A0E != C05F.A0j && c7gn.A0R.A02.getVisibility() == 0) {
            AbstractC27671Vv A00 = C3ER.A00();
            UserSession userSession = c7gn.A0O;
            Context context = c7gn.A0L;
            if (A00.A02(context, userSession)) {
                C9GR.A07(context, 2131960856);
                return;
            }
            String A002 = AbstractC43591JPw.A00(8);
            if (AbstractC23451Ch.A07(context, A002)) {
                C7DM c7dm = c7gn.A0S;
                if (c7gn.A0H) {
                    num = C05F.A00;
                } else {
                    num = C05F.A0C;
                }
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        enumC53362NjD = EnumC53362NjD.CLICK;
                    } else {
                        enumC53362NjD = EnumC53362NjD.LOCK;
                    }
                } else {
                    enumC53362NjD = EnumC53362NjD.LONG_CLICK;
                }
                C18920wW c18920wW = c7dm.A00;
                InterfaceC02590Ai A003 = c18920wW.A00(c18920wW.A00, "audio_clips_start_recording_click");
                if (A003.isSampled()) {
                    A003.A8R(enumC53362NjD, "source_click_category");
                    A003.Cht();
                }
                ((MRH) c7gn.A0V.getValue()).Cov();
                return;
            }
            Object A004 = AbstractC13320mI.A00(context, Activity.class);
            if (A004 != null) {
                if (AbstractC23451Ch.A05((Activity) A004, A002)) {
                    C193328hC c193328hC = new C193328hC(context);
                    c193328hC.A0A(2131960859);
                    c193328hC.A09(2131960857);
                    c193328hC.A0J(new LMB(c7gn), 2131960858);
                    c193328hC.A0I(DialogInterfaceOnClickListenerC28557Cip.A00, 2131968687);
                    C0fJ.A00(c193328hC.A02());
                    return;
                }
                Object A005 = AbstractC13320mI.A00(context, Activity.class);
                if (A005 != null) {
                    AbstractC23451Ch.A04((Activity) A005, new C48289LYn(c7gn), A002);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public static final void A07(C7GN c7gn) {
        View view = c7gn.A08;
        if (view != null) {
            view.setOnTouchListener(c7gn.A0a);
        }
        ImageView imageView = c7gn.A0A;
        if (imageView != null) {
            AbstractC125325le A01 = AbstractC125325le.A01(imageView, 0);
            A01.A0G();
            A01.A04 = 0;
            A01.A0U(0.0f, 1.0f, -1.0f);
            A01.A0V(0.0f, 1.0f, -1.0f);
            A01.A0H();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0019. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A08(X.C7GN r5) {
        /*
            X.7GJ r0 = r5.A0R
            X.2jc r2 = r0.A04
            android.view.View r4 = r2.A01()
            X.C14360o3.A07(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            X.7Ll r1 = A01(r5)
            java.lang.Integer r0 = r5.A0E
            int r0 = r0.intValue()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            switch(r0) {
                case 0: goto L84;
                case 1: goto L84;
                case 2: goto L49;
                case 3: goto L22;
                case 4: goto L81;
                case 5: goto L84;
                default: goto L1c;
            }
        L1c:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L22:
            r0 = 2131231678(0x7f0803be, float:1.8079444E38)
            r4.setImageResource(r0)
            android.graphics.drawable.Drawable r0 = r1.A05
            r4.setBackground(r0)
            int r0 = r1.A01
            r4.setColorFilter(r0)
            android.widget.TextView r1 = r5.A0C
            if (r1 == 0) goto L3c
            r0 = 2131960861(0x7f13241d, float:1.9558403E38)
            r1.setText(r0)
        L3c:
            r0 = 0
            X.5le r1 = X.AbstractC125325le.A01(r4, r0)
            r1.A0G()
            r1.A04 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L77
        L49:
            r0 = 2131231679(0x7f0803bf, float:1.8079446E38)
            r4.setImageResource(r0)
            android.graphics.drawable.Drawable r0 = r1.A06
            r4.setBackground(r0)
            int r0 = r1.A03
            r4.setColorFilter(r0)
            android.widget.TextView r2 = r5.A0C
            if (r2 == 0) goto L6a
            boolean r1 = r5.A0X
            r0 = 2131960862(0x7f13241e, float:1.9558405E38)
            if (r1 == 0) goto L67
            r0 = 2131960863(0x7f13241f, float:1.9558407E38)
        L67:
            r2.setText(r0)
        L6a:
            r0 = 0
            X.5le r1 = X.AbstractC125325le.A01(r4, r0)
            r1.A0G()
            r1.A04 = r0
            r0 = 1061997773(0x3f4ccccd, float:0.8)
        L77:
            r1.A0P(r0, r3)
            r1.A0Q(r0, r3)
            r1.A0H()
            goto L84
        L81:
            r2.A02()
        L84:
            android.widget.TextView r1 = r5.A0C
            if (r1 == 0) goto L8f
            java.lang.CharSequence r0 = r1.getText()
            r1.announceForAccessibility(r0)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7GN.A08(X.7GN):void");
    }

    public static final void A09(C7GN c7gn, L33 l33) {
        int i;
        String str;
        String str2;
        Integer num;
        C7GT c7gt;
        int i2;
        Chronometer chronometer = c7gn.A09;
        if (chronometer != null && !l33.A03.isEmpty()) {
            i = (int) (c7gn.A02 - chronometer.getBase());
            if (i >= 750) {
                l33.A00 = i;
                if (!c7gn.A0H && (c7gt = c7gn.A0P) != null) {
                    if (C18U.A06(C06090Tz.A05, c7gn.A0T.A00, 36323577804565891L)) {
                        Object A00 = AbstractC13320mI.A00(c7gn.A0L, Activity.class);
                        if (A00 != null) {
                            Activity activity = (Activity) A00;
                            FrameLayout frameLayout = c7gn.A0R.A03;
                            if (frameLayout != null) {
                                i2 = frameLayout.getTop();
                            } else {
                                i2 = 0;
                            }
                            C14360o3.A0B(activity, 0);
                            c7gt.A06 = false;
                            c7gt.A01 = l33.A00;
                            c7gt.A05 = l33;
                            KBY kby = new KBY();
                            c7gt.A03 = kby;
                            UserSession userSession = c7gt.A08;
                            C125055lB c125055lB = c7gt.A0C;
                            C14360o3.A0B(c125055lB, 1);
                            kby.A01 = userSession;
                            kby.A03 = c125055lB;
                            kby.A00 = i2;
                            kby.A02 = c7gt;
                            C189448aO c189448aO = new C189448aO(userSession);
                            c189448aO.A1E = true;
                            c189448aO.A0k = false;
                            c189448aO.A0U = new C49618LwB(c7gt);
                            C189478aR A002 = c189448aO.A00();
                            KBY kby2 = c7gt.A03;
                            if (kby2 != null) {
                                c7gt.A04 = A002.A02(activity, kby2);
                                C18920wW c18920wW = c7gt.A0B.A00;
                                InterfaceC02590Ai A003 = c18920wW.A00(c18920wW.A00, "audio_clips_recording_preview_open");
                                if (A003.isSampled()) {
                                    A003.Cht();
                                }
                                c7gn.A0F = null;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                A0A(c7gn, l33);
                c7gn.A0F = null;
            }
        } else {
            i = 0;
        }
        new File(l33.A01).delete();
        if (i == 0) {
            if (chronometer == null) {
                str = "chronometer not started";
            } else if (l33.A03.isEmpty()) {
                str = "empty waveForm";
            } else {
                str = "chronometer reported 0ms duration";
            }
            String A0S = AnonymousClass001.A0S("Send recording failed because ", str, '.');
            InterfaceC09390do interfaceC09390do = c7gn.A0V;
            if (interfaceC09390do.getValue() instanceof C24201AoO) {
                MRH mrh = (MRH) interfaceC09390do.getValue();
                C14360o3.A0C(mrh, "null cannot be cast to non-null type com.instagram.voice.common.IGDOneCameraVoiceRecorder");
                C24201AoO c24201AoO = (C24201AoO) mrh;
                String A004 = C9LW.A00(c24201AoO.A06.A04.A04);
                AM5 am5 = c24201AoO.A01;
                if (am5 != null && (num = am5.A0F) != null) {
                    switch (num.intValue()) {
                        case 1:
                            str2 = "PREPARED";
                            break;
                        case 2:
                            str2 = "STARTED";
                            break;
                        default:
                            str2 = "STOPPED";
                            break;
                    }
                } else {
                    str2 = null;
                }
                A0S = AnonymousClass001.A0R(A0S, AnonymousClass001.A0u(" RecordingController state: ", A004, " / AudioRecorder state: ", str2));
            }
            IllegalStateException illegalStateException = new IllegalStateException(A0S);
            c7gn.A0S.A01(illegalStateException);
            c7gn.A0Q.E1P(illegalStateException);
        }
        c7gn.A0F = null;
    }

    public static final void A0B(C7GN c7gn, boolean z, boolean z2) {
        TextView textView;
        Chronometer chronometer = c7gn.A09;
        if (chronometer != null) {
            int base = (int) (c7gn.A02 - chronometer.getBase());
            c7gn.A0Q.E1Q(z, base);
            C7GJ c7gj = c7gn.A0R;
            C57012jc c57012jc = c7gj.A05;
            if (c57012jc.A00 != null) {
                VoiceVisualizer voiceVisualizer = c7gn.A0D;
                if (voiceVisualizer != null) {
                    voiceVisualizer.A0E.clear();
                    c57012jc.A01().setVisibility(8);
                    boolean z3 = true;
                    if (!c7gn.A0Y || (textView = c7gn.A0C) == null || textView.getVisibility() != 0 || c7gn.A0U != C05F.A00) {
                        z3 = false;
                    }
                    A06(c7gn);
                    if (z3) {
                        View view = c7gj.A01;
                        if (view != null) {
                            view.setTranslationY(-c7gn.A0L.getResources().getDimensionPixelOffset(R.dimen.activation_card_icon_container_width));
                            AbstractC125325le A01 = AbstractC125325le.A01(view, 0);
                            A01.A0G();
                            A01.A04 = 0;
                            A01.A0K(0.0f);
                            A01.A05 = new C49599Lvs(c7gn);
                            A01.A0H();
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            c7gn.A0G = false;
            Integer num = C05F.A00;
            if (c7gn.A0E != num) {
                c7gn.A0E = num;
            }
            Chronometer chronometer2 = c7gn.A09;
            if (chronometer2 != null) {
                chronometer2.setKeepScreenOn(false);
            }
            if (z) {
                if (base > 0 && !z2) {
                    C7DM c7dm = c7gn.A0S;
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(base);
                    C18920wW c18920wW = c7dm.A00;
                    InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "audio_clips_cancelled_by_user");
                    if (A00.isSampled()) {
                        A00.A9K("duration", Long.valueOf(seconds));
                        A00.Cht();
                    }
                }
                ((MRH) c7gn.A0V.getValue()).AHz();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r8 >= (r5.bottom - r1)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0C(X.C7GN r6, float r7, float r8) {
        /*
            android.graphics.RectF r5 = r6.A03
            r4 = 0
            if (r5 == 0) goto L28
            boolean r0 = r6.A0X
            if (r0 == 0) goto L29
            float r0 = r5.left
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L30
        Lf:
            r3 = 1
        L10:
            float r2 = r5.top
            int r0 = r6.A00
            float r1 = (float) r0
            float r2 = r2 - r1
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 <= 0) goto L22
            float r0 = r5.bottom
            float r0 = r0 - r1
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L23
        L22:
            r0 = 0
        L23:
            if (r3 == 0) goto L28
            if (r0 == 0) goto L28
            r4 = 1
        L28:
            return r4
        L29:
            float r0 = r5.right
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 >= 0) goto L30
            goto Lf
        L30:
            r3 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7GN.A0C(X.7GN, float, float):boolean");
    }

    public final void A0D() {
        InterfaceC09390do interfaceC09390do = this.A0V;
        if (((MRH) interfaceC09390do.getValue()).isRecording()) {
            this.A0Q.E1S();
            ((MRH) interfaceC09390do.getValue()).Eoe(true);
        } else {
            A0B(this, true, false);
        }
    }

    public final void A0E() {
        ((MRH) this.A0V.getValue()).release();
    }

    public final void A0F() {
        ImageView imageView = this.A0B;
        if (imageView != null) {
            RectF A0G = AbstractC13880nE.A0G(imageView);
            A0G.offset(0.0f, this.A00);
            RectF rectF = new RectF(A0G);
            float f = -this.A0Z;
            rectF.inset(f, f);
            if (this.A0X) {
                rectF.left = A0G.left - A0G.width();
            } else {
                rectF.right = A0G.right + A0G.width();
            }
            View view = this.A08;
            if (view != null) {
                view.setPivotX(rectF.centerX() / 2.0f);
            }
            this.A05 = A0G;
            this.A03 = rectF;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A0G(InterfaceC09390do interfaceC09390do) {
        this.A0J = interfaceC09390do;
        this.A01 = A01(this).A04;
        C7GJ c7gj = this.A0R;
        c7gj.A04.A02 = new InterfaceC69513Al() { // from class: X.7Lm
            @Override // X.InterfaceC69513Al
            public final /* bridge */ /* synthetic */ void DLu(View view) {
                IgSimpleImageView igSimpleImageView = (IgSimpleImageView) view;
                if (igSimpleImageView != null) {
                    C7GN c7gn = C7GN.this;
                    igSimpleImageView.setBackground(C7GN.A01(c7gn).A06);
                    C7GN.A01(c7gn);
                    if (((Boolean) AbstractC15930qn.A02.A0E.invoke()).booleanValue()) {
                        C03O.A00(igSimpleImageView, new RunnableC50002M5r(igSimpleImageView, igSimpleImageView, c7gn));
                    } else {
                        igSimpleImageView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC48099LQz(igSimpleImageView, c7gn));
                    }
                }
            }
        };
        c7gj.A05.A02 = new InterfaceC69513Al() { // from class: X.7Ln
            @Override // X.InterfaceC69513Al
            public final void DLu(View view) {
                Drawable drawable;
                if (view != null) {
                    C7GN c7gn = C7GN.this;
                    C161507Ll A01 = C7GN.A01(c7gn);
                    int i = A01.A02;
                    AbstractC13880nE.A0i(view, i, i);
                    AbstractC13880nE.A0Y(view, A01.A00);
                    c7gn.A09 = (Chronometer) view.findViewById(R.id.direct_voice_messaging_composer_chronometer);
                    VoiceVisualizer voiceVisualizer = (VoiceVisualizer) view.requireViewById(R.id.direct_voice_messaging_visualizer);
                    c7gn.A0D = voiceVisualizer;
                    if (voiceVisualizer != null) {
                        voiceVisualizer.A05 = 100;
                    }
                    c7gn.A0B = (ImageView) view.requireViewById(R.id.direct_voice_messaging_composer_trash_can);
                    View requireViewById = view.requireViewById(R.id.direct_voice_messaging_visualizer_container);
                    c7gn.A08 = requireViewById;
                    if (requireViewById != null) {
                        requireViewById.setBackground((Drawable) A01.A0A.getValue());
                    }
                    AbstractC56932jR.A02(c7gn.A08);
                    FrameLayout frameLayout = c7gn.A0R.A03;
                    if (frameLayout != null) {
                        int top = frameLayout.getTop();
                        View view2 = c7gn.A08;
                        if (view2 != null) {
                            drawable = view2.getBackground();
                        } else {
                            drawable = null;
                        }
                        C7MU.A00(drawable, top);
                    }
                    TextView textView = (TextView) view.findViewById(R.id.direct_voice_messaging_instructions_text_view);
                    c7gn.A0C = textView;
                    if (textView != null) {
                        int i2 = 2131960862;
                        if (c7gn.A0X) {
                            i2 = 2131960863;
                        }
                        textView.setText(i2);
                    }
                    ImageView imageView = c7gn.A0B;
                    if (imageView != null) {
                        imageView.setColorFilter(A01.A03);
                    }
                    ImageView imageView2 = c7gn.A0B;
                    if (imageView2 != null) {
                        imageView2.setImageDrawable(A01.A09);
                    }
                    ImageView imageView3 = c7gn.A0B;
                    if (imageView3 != null) {
                        imageView3.setBackground(A01.A07);
                    }
                    ImageView imageView4 = c7gn.A0B;
                    if (imageView4 != null) {
                        C0fQ.A00(new ViewOnClickListenerC23210AQu(c7gn), imageView4);
                    }
                    ImageView imageView5 = c7gn.A0B;
                    if (imageView5 != null) {
                        imageView5.setContentDescription(c7gn.A0L.getString(2131960855));
                    }
                    ImageView imageView6 = (ImageView) view.requireViewById(R.id.direct_voice_messaging_composer_send);
                    c7gn.A0A = imageView6;
                    if (imageView6 != null) {
                        imageView6.setColorFilter(A01.A01);
                    }
                    ImageView imageView7 = c7gn.A0A;
                    if (imageView7 != null) {
                        imageView7.setImageDrawable(A01.A08);
                    }
                    ImageView imageView8 = c7gn.A0A;
                    if (imageView8 != null) {
                        C0fQ.A00(c7gn.A0N, imageView8);
                    }
                    ImageView imageView9 = c7gn.A0A;
                    if (imageView9 != null) {
                        imageView9.setContentDescription(c7gn.A0L.getString(2131960854));
                    }
                    if (c7gn.A0U == C05F.A00) {
                        View requireViewById2 = view.requireViewById(R.id.direct_voice_messaging_composer_background);
                        c7gn.A07 = requireViewById2;
                        if (requireViewById2 != null) {
                            requireViewById2.setBackground((Drawable) C7GN.A01(c7gn).A0A.getValue());
                        }
                    }
                    if (((Boolean) AbstractC15930qn.A02.A0F.invoke()).booleanValue()) {
                        C03O.A00(view, new M4U(view, c7gn));
                    } else {
                        view.getViewTreeObserver().addOnPreDrawListener(new LR0(view, c7gn));
                    }
                }
            }
        };
    }

    @Override // X.C7GO
    public final void DEF(Exception exc) {
        this.A0Q.E1P(exc);
        this.A0S.A01(exc);
        this.A02 = SystemClock.elapsedRealtime();
        Chronometer chronometer = this.A09;
        if (chronometer != null) {
            chronometer.stop();
        }
        A0B(this, true, true);
        this.A0E = C05F.A01;
    }

    @Override // X.C7GO
    public final void DR9() {
        Chronometer chronometer = this.A09;
        if (chronometer != null) {
            chronometer.setBase(SystemClock.elapsedRealtime() - this.A0K);
        }
        this.A0R.A04.A02();
        this.A0M.postDelayed(M7N.A00, 215L);
        TextView textView = this.A0C;
        if (textView != null) {
            textView.setText(2131960847);
        }
        this.A02 = SystemClock.elapsedRealtime();
        Chronometer chronometer2 = this.A09;
        if (chronometer2 != null) {
            chronometer2.stop();
        }
        if (this.A0E == C05F.A0Y) {
            A02();
        }
        TextView textView2 = this.A0C;
        if (textView2 != null) {
            textView2.announceForAccessibility(textView2.getText());
        }
        A07(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r4 == null) goto L16;
     */
    @Override // X.C7GO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DdZ() {
        /*
            r5 = this;
            X.7GL r0 = r5.A0Q
            r0.E1T()
            X.0do r0 = r5.A0V
            java.lang.Object r0 = r0.getValue()
            X.MRH r0 = (X.MRH) r0
            X.L33 r4 = r0.Auq()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r5.A02 = r0
            android.widget.Chronometer r0 = r5.A09
            if (r0 == 0) goto L1e
            r0.stop()
        L1e:
            boolean r0 = r5.A0G
            if (r0 != 0) goto L27
            if (r4 == 0) goto L27
            A09(r5, r4)
        L27:
            android.widget.Chronometer r1 = r5.A09
            boolean r0 = r5.A0G
            if (r0 != 0) goto L3e
            if (r1 == 0) goto L3e
            long r2 = r5.A02
            long r0 = r1.getBase()
            long r2 = r2 - r0
            int r1 = (int) r2
            r0 = 750(0x2ee, float:1.051E-42)
            if (r1 < r0) goto L3e
            r1 = 0
            if (r4 != 0) goto L3f
        L3e:
            r1 = 1
        L3f:
            r0 = 0
            A0B(r5, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7GN.DdZ():void");
    }

    @Override // X.C7GO
    public final void E1s(long j, double d) {
        VoiceVisualizer voiceVisualizer = this.A0D;
        if (voiceVisualizer != null) {
            voiceVisualizer.A02((float) d);
        }
    }

    public C7GN(Context context, UserSession userSession, C7DK c7dk, C7GL c7gl, C7GJ c7gj, InterfaceC83713oG interfaceC83713oG, boolean z, boolean z2) {
        long A01;
        C7GT c7gt;
        this.A0O = userSession;
        this.A0L = context;
        this.A0Y = z;
        this.A0b = interfaceC83713oG;
        this.A0R = c7gj;
        this.A0Q = c7gl;
        this.A0W = z2;
        this.A0X = AbstractC13620mo.A02(context);
        C125055lB c125055lB = new C125055lB(userSession);
        this.A0T = c125055lB;
        if (AbstractC229319v.A00()) {
            A01 = 3000;
        } else {
            A01 = C18U.A01(C06090Tz.A05, c125055lB.A00, 36605052781597897L);
        }
        this.A0K = (int) A01;
        this.A0V = AbstractC09440dt.A00(EnumC09460dv.A02, new C9E1(this, 28));
        Integer num = C05F.A00;
        this.A0E = num;
        C7DM c7dm = new C7DM(userSession);
        this.A0S = c7dm;
        this.A0U = c7gj.A01 == null ? C05F.A01 : num;
        this.A0Z = AbstractC13880nE.A04(context, 16);
        if (c7dk != null) {
            c7gt = new C7GT(userSession, c7dk, new C7GS(this), c7dm, c125055lB);
        } else {
            c7gt = null;
        }
        this.A0P = c7gt;
    }

    public static final void A03(IgSimpleImageView igSimpleImageView, C7GN c7gn) {
        RectF A0G = AbstractC13880nE.A0G(igSimpleImageView);
        c7gn.A04 = A0G;
        float f = -c7gn.A0Z;
        A0G.inset(f, f);
        RectF rectF = c7gn.A04;
        if (rectF != null) {
            rectF.offset(0.0f, c7gn.A00);
        }
    }

    public static final void A06(C7GN c7gn) {
        View view;
        C161507Ll A01 = A01(c7gn);
        ImageView imageView = c7gn.A0B;
        if (imageView != null) {
            imageView.setBackground(A01.A07);
            imageView.setColorFilter(C3DY.A00(A01.A03));
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
            imageView.setRotation(0.0f);
        }
        View view2 = c7gn.A08;
        if (view2 != null) {
            view2.setScaleX(1.0f);
            view2.setScaleY(1.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(view2.getLayoutParams());
            layoutParams.setMargins(0, 0, 0, 0);
            view2.setLayoutParams(layoutParams);
            view2.setOnClickListener(null);
        }
        if (c7gn.A0U == C05F.A00 && (view = c7gn.A07) != null) {
            view.setAlpha(1.0f);
        }
        TextView textView = c7gn.A0C;
        if (textView != null) {
            int i = 2131960862;
            if (c7gn.A0X) {
                i = 2131960863;
            }
            textView.setText(i);
        }
        TextView textView2 = c7gn.A0C;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        ImageView imageView2 = c7gn.A0A;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            C7GJ c7gj = c7gn.A0R;
            View view3 = c7gj.A01;
            if (view3 != null) {
                view3.setTranslationY(0.0f);
            }
            c7gj.A04.A03(8);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        A00(this).postDelayed(this.A0c, ViewConfiguration.getLongPressTimeout());
        this.A0I = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        A00(this).performClick();
        return true;
    }
}
