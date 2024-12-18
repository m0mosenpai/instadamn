package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.R;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;

/* renamed from: X.3YD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3YD implements C33R {
    public int A00;
    public int A01;
    public C75113Zb A02;
    public C3YE A03;
    public C3t9 A04;
    public InterfaceC86283sz A05;
    public C80593io A06;
    public Runnable A07;
    public Runnable A08;
    public Runnable A09;
    public Runnable A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final Context A0F;
    public final Handler A0G;
    public final UserSession A0H;
    public final C57012jc A0I;
    public final View A0J;

    public final void A0G(Integer num) {
        Integer num2;
        View view;
        if (this.A02 != null && !this.A0E) {
            A07(this);
            C80593io c80593io = this.A06;
            if (c80593io != null && (num2 = A00(this).A00) != num) {
                A02();
                A00(this).A00 = num;
                View view2 = c80593io.A00;
                AbstractC13880nE.A0g(view2, -2);
                int intValue = num2.intValue();
                ImageView imageView = c80593io.A02;
                if (intValue != 0) {
                    imageView.setVisibility(0);
                    if (intValue != 1) {
                        TextView textView = c80593io.A03;
                        textView.setVisibility(0);
                        View view3 = c80593io.A01;
                        view3.setVisibility(0);
                        if (num == C05F.A01) {
                            this.A0B = false;
                            InterfaceC86283sz interfaceC86283sz = this.A05;
                            if (interfaceC86283sz != null) {
                                interfaceC86283sz.Ds1();
                            }
                            AbstractC80603ip.A02(textView);
                            int i = -this.A01;
                            AbstractC125325le A01 = AbstractC125325le.A01(view2, 1);
                            if (A01.A0W()) {
                                A01.A05 = new J0K(view2, A01, i);
                                return;
                            } else {
                                AbstractC80603ip.A03(view2, i);
                                return;
                            }
                        }
                        if (num != C05F.A00) {
                            return;
                        }
                        this.A0B = false;
                        InterfaceC86283sz interfaceC86283sz2 = this.A05;
                        if (interfaceC86283sz2 != null) {
                            interfaceC86283sz2.Ds1();
                        }
                        AbstractC80603ip.A02(view3);
                        return;
                    }
                    view = c80593io.A03;
                    view.setVisibility(8);
                    View view4 = c80593io.A01;
                    view4.setVisibility(0);
                    if (num == C05F.A0C) {
                        this.A0B = true;
                        int i2 = this.A01;
                        AbstractC125325le A012 = AbstractC125325le.A01(view2, 1);
                        if (A012.A0W()) {
                            A012.A05 = new J0K(view2, A012, i2);
                        } else {
                            AbstractC80603ip.A03(view2, i2);
                        }
                    } else {
                        if (num != C05F.A00) {
                            return;
                        }
                        this.A0B = false;
                        AbstractC80603ip.A02(view4);
                        InterfaceC86283sz interfaceC86283sz3 = this.A05;
                        if (interfaceC86283sz3 == null) {
                            return;
                        }
                        interfaceC86283sz3.Ds3();
                        return;
                    }
                } else {
                    imageView.setVisibility(0);
                    view = c80593io.A01;
                    view.setVisibility(8);
                    if (num == C05F.A01) {
                        this.A0B = false;
                        c80593io.A03.setVisibility(8);
                        AbstractC80603ip.A01(view);
                        InterfaceC86283sz interfaceC86283sz4 = this.A05;
                        if (interfaceC86283sz4 == null) {
                            return;
                        }
                        interfaceC86283sz4.Ds4();
                        return;
                    }
                    if (num != C05F.A0C) {
                        return;
                    }
                    this.A0B = true;
                    c80593io.A03.setVisibility(0);
                }
                AbstractC80603ip.A01(view);
                InterfaceC86283sz interfaceC86283sz5 = this.A05;
                if (interfaceC86283sz5 != null) {
                    interfaceC86283sz5.Ds2();
                }
                A00(this).A03 = true;
                A00(this).A05 = true;
            }
        }
    }

    public final void A0H(String str) {
        C14360o3.A0B(str, 0);
        A07(this);
        C80593io c80593io = this.A06;
        if (c80593io != null) {
            if (str.length() == 0) {
                c80593io.A03.setText("");
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.setSpan(new CharacterStyle(), 0, spannableStringBuilder.length(), 33);
            c80593io.A03.setText(spannableStringBuilder);
            int dimensionPixelSize = this.A0F.getResources().getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size);
            C80593io c80593io2 = this.A06;
            if (c80593io2 == null) {
                return;
            }
            c80593io2.A03.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
            this.A01 = c80593io2.A03.getMeasuredWidth();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0083, code lost:
    
        if (r6.A1z != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0110, code lost:
    
        if (r6.A1w != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011d, code lost:
    
        if (r6.A2F != false) goto L86;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0024. Please report as an issue. */
    @Override // X.C33R
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DSJ(X.C75113Zb r6, int r7) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3YD.DSJ(X.3Zb, int):void");
    }

    public static final C86393tC A00(C3YD c3yd) {
        C75113Zb c75113Zb = c3yd.A02;
        if (c75113Zb != null) {
            return c75113Zb.A07(c3yd.A00, c3yd.A03.ordinal());
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A01() {
        if (this.A0A == null && this.A08 == null && this.A07 == null && this.A09 == null) {
        } else {
            throw new IllegalStateException("Check failed.");
        }
    }

    private final void A02() {
        C80593io c80593io = this.A06;
        if (c80593io != null) {
            if (AbstractC125325le.A01(c80593io.A01, 1).A0W() || AbstractC125325le.A01(c80593io.A03, 1).A0W() || AbstractC125325le.A01(c80593io.A00, 1).A0W()) {
                AbstractC125325le.A01(c80593io.A01, 1).A0G();
                AbstractC125325le.A01(c80593io.A03, 1).A0G();
                AbstractC125325le.A01(c80593io.A00, 1).A0G();
                A0D();
            }
        }
    }

    public static final void A03(View view, C3YD c3yd) {
        C80593io c80593io = new C80593io(view);
        c3yd.A06 = c80593io;
        int lineHeight = c80593io.A03.getLineHeight();
        Context context = c3yd.A0F;
        int dimensionPixelSize = (lineHeight - context.getResources().getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size)) / 2;
        c80593io.A00.setBackground(AbstractC80603ip.A00(context, lineHeight));
        ImageView imageView = c80593io.A02;
        AbstractC13880nE.A0g(imageView, lineHeight);
        AbstractC13880nE.A0W(imageView, lineHeight);
        imageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        AbstractC010103p.A0B(c80593io.A01, new C02V() { // from class: X.3iq
            @Override // X.C02V
            public final void A0Y(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                C14360o3.A0B(view2, 0);
                C14360o3.A0B(accessibilityNodeInfoCompat, 1);
                super.A0Y(view2, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setClassName("android.widget.Button");
            }
        });
    }

    public static final void A05(C3YD c3yd) {
        long j;
        C3YE c3ye = c3yd.A03;
        if (c3ye != C3YE.A0E) {
            if (c3ye == C3YE.A0A) {
                j = 0;
            } else {
                j = 1000;
            }
            c3yd.A01();
            A07(c3yd);
            RunnableC73500YGe runnableC73500YGe = new RunnableC73500YGe(c3yd);
            c3yd.A08 = runnableC73500YGe;
            c3yd.A0G.postDelayed(runnableC73500YGe, j);
        }
    }

    public static final void A07(C3YD c3yd) {
        C57012jc c57012jc = c3yd.A0I;
        if (c57012jc.A00 == null) {
            c57012jc.A01();
        }
    }

    public static final boolean A08(C3YD c3yd) {
        C3t9 c3t9;
        C75113Zb c75113Zb = c3yd.A02;
        if (c75113Zb == null || (c3t9 = c3yd.A04) == null || c3yd.A0C || !c75113Zb.A22 || c3yd.A00 != c75113Zb.A03 || c75113Zb.A0i != C3VZ.A03 || c75113Zb.A1z || c75113Zb.A2F || c75113Zb.A1y || c3t9.A08 || c3t9.A0A || c3t9.A0B) {
            return true;
        }
        return false;
    }

    public final View A09() {
        View view;
        View findViewById;
        if (this.A06 == null || (view = this.A0J) == null || ((findViewById = view.findViewById(R.id.media_group)) == null && (findViewById = view.findViewById(R.id.carousel_image_media_group)) == null && (findViewById = view.findViewById(R.id.carousel_video_media_group)) == null)) {
            return null;
        }
        return findViewById;
    }

    public final void A0A() {
        C80593io c80593io;
        if (this.A0I.A00 != null && (c80593io = this.A06) != null) {
            c80593io.A01.setVisibility(8);
        }
    }

    public final void A0C() {
        Runnable runnable = this.A0A;
        if (runnable != null) {
            this.A0G.removeCallbacks(runnable);
            this.A0A = null;
        }
        Runnable runnable2 = this.A08;
        if (runnable2 != null) {
            this.A0G.removeCallbacks(runnable2);
            this.A08 = null;
        }
        Runnable runnable3 = this.A07;
        if (runnable3 != null) {
            this.A0G.removeCallbacks(runnable3);
            this.A07 = null;
        }
        Runnable runnable4 = this.A09;
        if (runnable4 != null) {
            this.A0G.removeCallbacks(runnable4);
            this.A09 = null;
        }
    }

    public final void A0E(int i, float f) {
        View view = this.A0J;
        if (view != null) {
            float A02 = C17s.A02(1.0f - (view.getX() / (i * f)), 0.0f, 1.0f);
            C80593io c80593io = this.A06;
            if (c80593io != null) {
                c80593io.A01.setAlpha(A02);
            }
        }
    }

    public C3YD(Context context, View view, UserSession userSession, C57012jc c57012jc) {
        this.A0J = view;
        this.A0F = context;
        this.A0H = userSession;
        this.A0I = c57012jc;
        this.A0G = new Handler(Looper.getMainLooper());
        this.A03 = C3YE.A09;
        this.A00 = -1;
        this.A0D = true;
        if (c57012jc.A00 != null) {
            View A01 = c57012jc.A01();
            C14360o3.A07(A01);
            A03(A01, this);
            return;
        }
        c57012jc.A02 = new InterfaceC69513Al() { // from class: X.3YF
            @Override // X.InterfaceC69513Al
            public final void DLu(View view2) {
                C3YD c3yd = C3YD.this;
                C14360o3.A0A(view2);
                C3YD.A03(view2, c3yd);
            }
        };
    }

    public static final void A04(C3YD c3yd) {
        c3yd.A01();
        A07(c3yd);
        RunnableC73499YGd runnableC73499YGd = new RunnableC73499YGd(c3yd);
        c3yd.A07 = runnableC73499YGd;
        c3yd.A0G.postDelayed(runnableC73499YGd, 4000L);
    }

    public static final void A06(final C3YD c3yd) {
        c3yd.A01();
        A07(c3yd);
        Runnable runnable = new Runnable() { // from class: X.4iD
            @Override // java.lang.Runnable
            public final void run() {
                C3YD c3yd2 = C3YD.this;
                if (!C3YD.A08(c3yd2) && C3YD.A00(c3yd2).A00 == C05F.A01) {
                    c3yd2.A0G(C05F.A00);
                }
                Runnable runnable2 = c3yd2.A09;
                if (runnable2 != null) {
                    c3yd2.A0G.removeCallbacks(runnable2);
                    c3yd2.A09 = null;
                }
            }
        };
        c3yd.A09 = runnable;
        c3yd.A0G.postDelayed(runnable, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4.A0H, 36326846274484386L) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0B() {
        /*
            r4 = this;
            boolean r0 = A08(r4)
            if (r0 != 0) goto L24
            A07(r4)
            X.3tC r0 = A00(r4)
            java.lang.Integer r0 = r0.A00
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L5b
            r0 = 1
            if (r1 == r0) goto L25
            X.3tC r0 = A00(r4)
            boolean r0 = r0.A06
            if (r0 != 0) goto L24
            A04(r4)
        L24:
            return
        L25:
            X.3tC r0 = A00(r4)
            boolean r0 = r0.A03
            if (r0 != 0) goto L4f
            X.3t9 r0 = r4.A04
            if (r0 == 0) goto L39
            boolean r0 = r0.A0D
            if (r0 != 0) goto L39
        L35:
            A05(r4)
            return
        L39:
            X.3YE r1 = r4.A03
            X.3YE r0 = X.C3YE.A0H
            if (r1 != r0) goto L4f
            com.instagram.common.session.UserSession r3 = r4.A0H
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36326846274484386(0x810f13000038a2, double:3.036582088228351E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L4f
            goto L35
        L4f:
            X.3tC r0 = A00(r4)
            boolean r0 = r0.A02
            if (r0 != 0) goto L24
            A06(r4)
            return
        L5b:
            r4.A01()
            A07(r4)
            X.YGf r3 = new X.YGf
            r3.<init>(r4)
            r4.A0A = r3
            android.os.Handler r2 = r4.A0G
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.postDelayed(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3YD.A0B():void");
    }

    public final void A0D() {
        C80593io c80593io;
        A07(this);
        if (this.A02 != null && (c80593io = this.A06) != null) {
            AbstractC13880nE.A0g(c80593io.A00, -2);
            View view = c80593io.A01;
            view.setAlpha(1.0f);
            TextView textView = c80593io.A03;
            textView.setAlpha(1.0f);
            if (!this.A0D) {
                AbstractC56932jR.A04(view, 4);
            }
            int intValue = A00(this).A00.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    this.A0B = true;
                    view.setVisibility(0);
                    c80593io.A02.setVisibility(0);
                    textView.setVisibility(0);
                    A00(this).A03 = true;
                    A00(this).A05 = true;
                    return;
                }
                this.A0B = false;
                c80593io.A02.setVisibility(0);
                textView.setVisibility(8);
                view.setVisibility(0);
                return;
            }
            this.A0B = false;
            view.setVisibility(8);
        }
    }

    public final void A0F(Drawable drawable) {
        A07(this);
        C80593io c80593io = this.A06;
        if (c80593io != null) {
            c80593io.A02.setImageDrawable(drawable);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3YD(android.view.View r4, com.instagram.common.session.UserSession r5, int r6) {
        /*
            r3 = this;
            android.content.Context r2 = r4.getContext()
            X.C14360o3.A07(r2)
            android.view.View r1 = r4.findViewById(r6)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L1a
            android.view.ViewStub r1 = (android.view.ViewStub) r1
        L11:
            X.2jc r0 = new X.2jc
            r0.<init>(r1)
            r3.<init>(r2, r4, r5, r0)
            return
        L1a:
            r1 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3YD.<init>(android.view.View, com.instagram.common.session.UserSession, int):void");
    }
}
