package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;

/* renamed from: X.3W5, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3W5 implements C33R {
    public int A00;
    public TextView A02;
    public C41F A03;
    public C75113Zb A04;
    public Runnable A05;
    public Runnable A06;
    public boolean A07;
    public final ViewStub A09;
    public final UserSession A0A;
    public ViewGroup A01 = null;
    public final Handler A08 = new Handler(Looper.getMainLooper());

    public C3W5(ViewStub viewStub, UserSession userSession) {
        this.A09 = viewStub;
        this.A0A = userSession;
        ViewGroup viewGroup = this.A01;
        if (viewGroup != null) {
            A00(viewGroup, this);
        } else {
            if (viewStub == null) {
                return;
            }
            viewStub.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: X.3W6
                @Override // android.view.ViewStub.OnInflateListener
                public final void onInflate(ViewStub viewStub2, View view) {
                    C3W5 c3w5 = C3W5.this;
                    C14360o3.A0C(view, "null cannot be cast to non-null type android.view.ViewGroup");
                    C3W5.A00((ViewGroup) view, c3w5);
                }
            });
        }
    }

    @Override // X.C33R
    public final void DSJ(C75113Zb c75113Zb, int i) {
        Integer num;
        C14360o3.A0B(c75113Zb, 0);
        if (c75113Zb == this.A04) {
            if (i != 4) {
                if (i == 10) {
                    A05();
                    if (c75113Zb.A1y) {
                        num = C05F.A01;
                        A02(this, num);
                        return;
                    }
                } else {
                    switch (i) {
                        case 16:
                            A05();
                            this.A07 = true;
                            if (c75113Zb.A0i != C3VZ.A03) {
                                return;
                            }
                            break;
                        case 17:
                            A05();
                            if (!c75113Zb.A22) {
                                return;
                            }
                            break;
                        case 18:
                            if (!c75113Zb.A1v) {
                                this.A07 = false;
                                A05();
                                num = C05F.A00;
                                break;
                            } else {
                                this.A07 = true;
                                return;
                            }
                        default:
                            return;
                    }
                    A02(this, num);
                    return;
                }
            } else {
                A05();
                c75113Zb.A14 = C05F.A00;
                A06();
            }
            A04();
        }
    }

    public static final void A01(final C3W5 c3w5) {
        if (c3w5.A06 == null && c3w5.A05 == null) {
            Runnable runnable = new Runnable() { // from class: X.4gX
                @Override // java.lang.Runnable
                public final void run() {
                    Integer num;
                    C3W5 c3w52 = C3W5.this;
                    C75113Zb c75113Zb = c3w52.A04;
                    if (c75113Zb != null && !C3W5.A03(c3w52, c75113Zb)) {
                        C75113Zb c75113Zb2 = c3w52.A04;
                        if (c75113Zb2 != null) {
                            num = c75113Zb2.A14;
                        } else {
                            num = null;
                        }
                        if (num == C05F.A00) {
                            C3W5.A02(c3w52, C05F.A01);
                        }
                    }
                    Runnable runnable2 = c3w52.A05;
                    if (runnable2 != null) {
                        c3w52.A08.removeCallbacks(runnable2);
                    }
                    c3w52.A05 = null;
                }
            };
            c3w5.A05 = runnable;
            c3w5.A08.postDelayed(runnable, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public static final void A02(C3W5 c3w5, Integer num) {
        Integer num2;
        View view;
        ViewGroup viewGroup = c3w5.A01;
        if (viewGroup == null) {
            ViewStub viewStub = c3w5.A09;
            if (viewStub != null) {
                view = viewStub.inflate();
            } else {
                view = null;
            }
            C14360o3.A0C(view, "null cannot be cast to non-null type android.view.ViewGroup");
            viewGroup = (ViewGroup) view;
            c3w5.A01 = viewGroup;
        }
        C75113Zb c75113Zb = c3w5.A04;
        if (c75113Zb != null) {
            num2 = c75113Zb.A14;
        } else {
            num2 = null;
        }
        if (num2 != num) {
            if (viewGroup != null) {
                if (AbstractC125325le.A01(viewGroup, 1).A0W()) {
                    ViewGroup viewGroup2 = c3w5.A01;
                    if (viewGroup2 != null) {
                        AbstractC125325le.A01(viewGroup2, 1).A0G();
                        c3w5.A06();
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                C75113Zb c75113Zb2 = c3w5.A04;
                if (c75113Zb2 != null) {
                    c75113Zb2.A14 = num;
                }
                Integer num3 = C05F.A01;
                if (num2 == num3 && num == C05F.A00) {
                    ViewGroup viewGroup3 = c3w5.A01;
                    if (viewGroup3 != null) {
                        AbstractC80603ip.A01(viewGroup3);
                        C75113Zb c75113Zb3 = c3w5.A04;
                        if (c75113Zb3 != null) {
                            c75113Zb3.A36 = true;
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                if (num2 != C05F.A00 || num != num3) {
                    return;
                }
                ViewGroup viewGroup4 = c3w5.A01;
                if (viewGroup4 != null) {
                    AbstractC80603ip.A02(viewGroup4);
                    C75113Zb c75113Zb4 = c3w5.A04;
                    if (c75113Zb4 == null) {
                        return;
                    }
                    c75113Zb4.A36 = false;
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public static final boolean A03(C3W5 c3w5, C75113Zb c75113Zb) {
        if (c75113Zb.A22 && !c75113Zb.A1y) {
            if (c3w5.A07) {
                if (C18U.A06(C06090Tz.A05, c3w5.A0A, 36330668795511767L)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void A04() {
        C75113Zb c75113Zb;
        C75113Zb c75113Zb2 = this.A04;
        if (c75113Zb2 != null && !A03(this, c75113Zb2) && (c75113Zb = this.A04) != null) {
            if (c75113Zb.A14.intValue() != 1) {
                A01(this);
                return;
            }
            if (C18U.A06(C06090Tz.A05, this.A0A, 36330668795511767L)) {
                return;
            }
            if (this.A06 == null && this.A05 == null) {
                RunnableC24469Aso runnableC24469Aso = new RunnableC24469Aso(this);
                this.A06 = runnableC24469Aso;
                this.A08.postDelayed(runnableC24469Aso, 1000L);
                return;
            }
            throw new IllegalStateException("Check failed.");
        }
    }

    public final void A05() {
        Runnable runnable = this.A06;
        if (runnable != null) {
            this.A08.removeCallbacks(runnable);
        }
        this.A06 = null;
        Runnable runnable2 = this.A05;
        if (runnable2 != null) {
            this.A08.removeCallbacks(runnable2);
        }
        this.A05 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0114, code lost:
    
        if (r1 != (r9.A00 - 1)) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06() {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3W5.A06():void");
    }

    public static final void A00(ViewGroup viewGroup, C3W5 c3w5) {
        Context context = viewGroup.getContext();
        TextView textView = (TextView) viewGroup.requireViewById(R.id.carousel_index_indicator_text_view);
        c3w5.A02 = textView;
        if (textView != null) {
            int paddingLeft = textView.getPaddingLeft() + context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
            textView.setPadding(paddingLeft, textView.getPaddingTop(), paddingLeft, textView.getPaddingBottom());
            textView.setBackground(AbstractC80603ip.A00(context, textView.getLineHeight()));
            viewGroup.setImportantForAccessibility(4);
            AbstractC77703du.A05(textView, EnumC77673dr.A08);
        }
    }
}
