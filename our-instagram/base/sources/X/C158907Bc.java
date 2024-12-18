package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.text.TightTextView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Bc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158907Bc implements C7QC {
    public final InterfaceC165247aD A01;
    public final AnonymousClass988 A02;
    public final C162907Rb A03;

    @Deprecated
    public boolean A00 = false;
    public final InterfaceC89443yk A05 = new InterfaceC89443yk() { // from class: X.7Bl
        @Override // X.InterfaceC89443yk
        public final void D3U(ClickableSpan clickableSpan, View view, String str) {
            InterfaceC165247aD interfaceC165247aD = C158907Bc.this.A01;
            if (interfaceC165247aD != null) {
                ((InterfaceC165407aT) interfaceC165247aD).CqX(str);
            }
        }
    };
    public final InterfaceC89443yk A07 = new InterfaceC89443yk() { // from class: X.7Bm
        @Override // X.InterfaceC89443yk
        public final void D3U(ClickableSpan clickableSpan, View view, String str) {
            InterfaceC165247aD interfaceC165247aD = C158907Bc.this.A01;
            if (interfaceC165247aD != null) {
                ((InterfaceC165287aH) interfaceC165247aD).Cr4(str);
            }
        }
    };
    public final InterfaceC89443yk A06 = new InterfaceC89443yk() { // from class: X.7Bn
        @Override // X.InterfaceC89443yk
        public final void D3U(ClickableSpan clickableSpan, View view, String str) {
            InterfaceC165247aD interfaceC165247aD = C158907Bc.this.A01;
            if (interfaceC165247aD != null) {
                ((InterfaceC165277aG) interfaceC165247aD).Cqp(str);
            }
        }
    };

    @Deprecated
    public final View.OnClickListener A04 = new View.OnClickListener() { // from class: X.7Bo
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int A05 = C0f9.A05(-1790565388);
            InterfaceC165247aD interfaceC165247aD = C158907Bc.this.A01;
            if (interfaceC165247aD != null) {
                ((InterfaceC165277aG) interfaceC165247aD).Cr1();
            }
            C0f9.A0C(-1415125468, A05);
        }
    };

    @Override // X.C7QC
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void F91(C7BF c7bf) {
        TightTextView tightTextView;
        TextView textView = c7bf.A03;
        CharSequence text = textView.getText();
        if (text instanceof Spannable) {
            C78K.A01((Spannable) text);
        }
        AnonymousClass988 anonymousClass988 = this.A02;
        if (anonymousClass988.A1S && A01(textView, text)) {
            textView.setOnClickListener(null);
            if (anonymousClass988.A1R) {
                textView.clearAnimation();
            }
        }
        if ((textView instanceof TightTextView) && (tightTextView = (TightTextView) textView) != null) {
            tightTextView.A01 = true;
        }
        C7BH c7bh = c7bf.A04;
        c7bh.A01 = null;
        C7BI c7bi = c7bh.A03;
        if (c7bi.A00) {
            c7bi.A01.removeCallbacksAndMessages(null);
            c7bi.A00 = false;
        }
        this.A03.A01(c7bf);
    }

    @Override // X.C7QC
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final void ADy(final C7BF c7bf, final AnonymousClass781 anonymousClass781) {
        final C161367Kx c161367Kx;
        AnonymousClass541 anonymousClass541;
        TightTextView tightTextView;
        long j;
        String str;
        TightTextView tightTextView2;
        InterfaceC89443yk interfaceC89443yk;
        InterfaceC89443yk interfaceC89443yk2;
        InterfaceC89443yk interfaceC89443yk3;
        InterfaceC89443yk interfaceC89443yk4;
        InterfaceC89443yk interfaceC89443yk5;
        AnonymousClass786 anonymousClass786 = new AnonymousClass786() { // from class: X.785
            @Override // X.AnonymousClass786
            public final void DBL() {
                C7BF c7bf2 = C7BF.this;
                AnonymousClass781 anonymousClass7812 = anonymousClass781;
                C7Q8 c7q8 = c7bf2.A00;
                if (c7q8 != null) {
                    c7q8.DBb(anonymousClass7812, c7bf2);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        };
        InterfaceC129525tH interfaceC129525tH = ((AbstractC129515tG) anonymousClass781).A00;
        final String CCL = interfaceC129525tH.CCL();
        CharSequence charSequence = anonymousClass781.A04;
        InterfaceC165247aD interfaceC165247aD = this.A01;
        final InterfaceC89443yk interfaceC89443yk6 = null;
        if (interfaceC165247aD != null) {
            c161367Kx = ((InterfaceC164897Zc) interfaceC165247aD).BfG();
        } else {
            c161367Kx = null;
        }
        if (charSequence instanceof Spannable) {
            if (interfaceC165247aD != null && ((InterfaceC165507ad) interfaceC165247aD).CQu()) {
                C78K.A01((Spannable) charSequence);
            } else {
                if (this.A02.A1V) {
                    interfaceC89443yk6 = new InterfaceC89443yk() { // from class: X.78C
                        @Override // X.InterfaceC89443yk
                        public final void D3U(ClickableSpan clickableSpan, View view, String str2) {
                            C158907Bc c158907Bc = C158907Bc.this;
                            AnonymousClass781 anonymousClass7812 = anonymousClass781;
                            InterfaceC165247aD interfaceC165247aD2 = c158907Bc.A01;
                            if (interfaceC165247aD2 != null) {
                                ((C7Y8) interfaceC165247aD2).Cs6(str2, anonymousClass7812.A06, anonymousClass7812.BSy().A01);
                            }
                        }
                    };
                    if (c161367Kx != null) {
                        interfaceC89443yk6 = new InterfaceC89443yk(c161367Kx, interfaceC89443yk6, CCL) { // from class: X.78G
                            public final C161367Kx A00;
                            public final InterfaceC89443yk A01;
                            public final String A02;

                            {
                                C14360o3.A0B(CCL, 2);
                                C14360o3.A0B(interfaceC89443yk6, 3);
                                this.A00 = c161367Kx;
                                this.A02 = CCL;
                                this.A01 = interfaceC89443yk6;
                            }

                            @Override // X.InterfaceC89443yk
                            public final void D3U(ClickableSpan clickableSpan, View view, String str2) {
                                C14360o3.A0B(str2, 0);
                                C14360o3.A0B(view, 1);
                                C14360o3.A0B(clickableSpan, 2);
                                C161367Kx c161367Kx2 = this.A00;
                                String str3 = this.A02;
                                InterfaceC161277Km interfaceC161277Km = (InterfaceC161277Km) c161367Kx2.A01.get(str3);
                                if (interfaceC161277Km != null && interfaceC161277Km.CRi(str3)) {
                                    c161367Kx2.A02(str3);
                                } else {
                                    this.A01.D3U(clickableSpan, view, str2);
                                }
                            }
                        };
                    }
                }
                final InterfaceC89443yk interfaceC89443yk7 = new InterfaceC89443yk() { // from class: X.78H
                    @Override // X.InterfaceC89443yk
                    public final void D3U(ClickableSpan clickableSpan, View view, String str2) {
                        C158907Bc c158907Bc = C158907Bc.this;
                        AnonymousClass781 anonymousClass7812 = anonymousClass781;
                        InterfaceC165247aD interfaceC165247aD2 = c158907Bc.A01;
                        if (interfaceC165247aD2 != null) {
                            InterfaceC165157a4 interfaceC165157a4 = (InterfaceC165157a4) interfaceC165247aD2;
                            if (!((Boolean) c158907Bc.A02.A0E.getValue()).booleanValue()) {
                                interfaceC165157a4.CrN(str2);
                            } else {
                                interfaceC165157a4.CrO(view, str2, ((AbstractC129515tG) anonymousClass7812).A00.CVC());
                            }
                        }
                    }
                };
                final InterfaceC89443yk interfaceC89443yk8 = new InterfaceC89443yk() { // from class: X.78I
                    @Override // X.InterfaceC89443yk
                    public final void D3U(ClickableSpan clickableSpan, View view, String str2) {
                        C158907Bc c158907Bc = C158907Bc.this;
                        String str3 = CCL;
                        InterfaceC165247aD interfaceC165247aD2 = c158907Bc.A01;
                        if (interfaceC165247aD2 != null) {
                            Context context = view.getContext();
                            AbstractC31265Don.A00();
                            if (context.getString(2131960572).startsWith(str2) && ((Boolean) c158907Bc.A02.A0C.getValue()).booleanValue()) {
                                ((InterfaceC165547ah) interfaceC165247aD2).CxY();
                            } else {
                                ((InterfaceC165067Zv) interfaceC165247aD2).Cs3(str2, true, str3);
                            }
                        }
                    }
                };
                Spannable spannable = (Spannable) charSequence;
                if (c161367Kx != null) {
                    final InterfaceC89443yk interfaceC89443yk9 = this.A05;
                    interfaceC89443yk = new InterfaceC89443yk(c161367Kx, interfaceC89443yk9, CCL) { // from class: X.78G
                        public final C161367Kx A00;
                        public final InterfaceC89443yk A01;
                        public final String A02;

                        {
                            C14360o3.A0B(CCL, 2);
                            C14360o3.A0B(interfaceC89443yk9, 3);
                            this.A00 = c161367Kx;
                            this.A02 = CCL;
                            this.A01 = interfaceC89443yk9;
                        }

                        @Override // X.InterfaceC89443yk
                        public final void D3U(ClickableSpan clickableSpan, View view, String str2) {
                            C14360o3.A0B(str2, 0);
                            C14360o3.A0B(view, 1);
                            C14360o3.A0B(clickableSpan, 2);
                            C161367Kx c161367Kx2 = this.A00;
                            String str3 = this.A02;
                            InterfaceC161277Km interfaceC161277Km = (InterfaceC161277Km) c161367Kx2.A01.get(str3);
                            if (interfaceC161277Km != null && interfaceC161277Km.CRi(str3)) {
                                c161367Kx2.A02(str3);
                            } else {
                                this.A01.D3U(clickableSpan, view, str2);
                            }
                        }
                    };
                    final InterfaceC89443yk interfaceC89443yk10 = this.A07;
                    interfaceC89443yk2 = new InterfaceC89443yk(c161367Kx, interfaceC89443yk10, CCL) { // from class: X.78G
                        public final C161367Kx A00;
                        public final InterfaceC89443yk A01;
                        public final String A02;

                        {
                            C14360o3.A0B(CCL, 2);
                            C14360o3.A0B(interfaceC89443yk10, 3);
                            this.A00 = c161367Kx;
                            this.A02 = CCL;
                            this.A01 = interfaceC89443yk10;
                        }

                        @Override // X.InterfaceC89443yk
                        public final void D3U(ClickableSpan clickableSpan, View view, String str2) {
                            C14360o3.A0B(str2, 0);
                            C14360o3.A0B(view, 1);
                            C14360o3.A0B(clickableSpan, 2);
                            C161367Kx c161367Kx2 = this.A00;
                            String str3 = this.A02;
                            InterfaceC161277Km interfaceC161277Km = (InterfaceC161277Km) c161367Kx2.A01.get(str3);
                            if (interfaceC161277Km != null && interfaceC161277Km.CRi(str3)) {
                                c161367Kx2.A02(str3);
                            } else {
                                this.A01.D3U(clickableSpan, view, str2);
                            }
                        }
                    };
                    interfaceC89443yk3 = new InterfaceC89443yk(c161367Kx, interfaceC89443yk8, CCL) { // from class: X.78G
                        public final C161367Kx A00;
                        public final InterfaceC89443yk A01;
                        public final String A02;

                        {
                            C14360o3.A0B(CCL, 2);
                            C14360o3.A0B(interfaceC89443yk8, 3);
                            this.A00 = c161367Kx;
                            this.A02 = CCL;
                            this.A01 = interfaceC89443yk8;
                        }

                        @Override // X.InterfaceC89443yk
                        public final void D3U(ClickableSpan clickableSpan, View view, String str2) {
                            C14360o3.A0B(str2, 0);
                            C14360o3.A0B(view, 1);
                            C14360o3.A0B(clickableSpan, 2);
                            C161367Kx c161367Kx2 = this.A00;
                            String str3 = this.A02;
                            InterfaceC161277Km interfaceC161277Km = (InterfaceC161277Km) c161367Kx2.A01.get(str3);
                            if (interfaceC161277Km != null && interfaceC161277Km.CRi(str3)) {
                                c161367Kx2.A02(str3);
                            } else {
                                this.A01.D3U(clickableSpan, view, str2);
                            }
                        }
                    };
                    interfaceC89443yk4 = new InterfaceC89443yk(c161367Kx, interfaceC89443yk7, CCL) { // from class: X.78G
                        public final C161367Kx A00;
                        public final InterfaceC89443yk A01;
                        public final String A02;

                        {
                            C14360o3.A0B(CCL, 2);
                            C14360o3.A0B(interfaceC89443yk7, 3);
                            this.A00 = c161367Kx;
                            this.A02 = CCL;
                            this.A01 = interfaceC89443yk7;
                        }

                        @Override // X.InterfaceC89443yk
                        public final void D3U(ClickableSpan clickableSpan, View view, String str2) {
                            C14360o3.A0B(str2, 0);
                            C14360o3.A0B(view, 1);
                            C14360o3.A0B(clickableSpan, 2);
                            C161367Kx c161367Kx2 = this.A00;
                            String str3 = this.A02;
                            InterfaceC161277Km interfaceC161277Km = (InterfaceC161277Km) c161367Kx2.A01.get(str3);
                            if (interfaceC161277Km != null && interfaceC161277Km.CRi(str3)) {
                                c161367Kx2.A02(str3);
                            } else {
                                this.A01.D3U(clickableSpan, view, str2);
                            }
                        }
                    };
                    final InterfaceC89443yk interfaceC89443yk11 = this.A06;
                    interfaceC89443yk5 = new InterfaceC89443yk(c161367Kx, interfaceC89443yk11, CCL) { // from class: X.78G
                        public final C161367Kx A00;
                        public final InterfaceC89443yk A01;
                        public final String A02;

                        {
                            C14360o3.A0B(CCL, 2);
                            C14360o3.A0B(interfaceC89443yk11, 3);
                            this.A00 = c161367Kx;
                            this.A02 = CCL;
                            this.A01 = interfaceC89443yk11;
                        }

                        @Override // X.InterfaceC89443yk
                        public final void D3U(ClickableSpan clickableSpan, View view, String str2) {
                            C14360o3.A0B(str2, 0);
                            C14360o3.A0B(view, 1);
                            C14360o3.A0B(clickableSpan, 2);
                            C161367Kx c161367Kx2 = this.A00;
                            String str3 = this.A02;
                            InterfaceC161277Km interfaceC161277Km = (InterfaceC161277Km) c161367Kx2.A01.get(str3);
                            if (interfaceC161277Km != null && interfaceC161277Km.CRi(str3)) {
                                c161367Kx2.A02(str3);
                            } else {
                                this.A01.D3U(clickableSpan, view, str2);
                            }
                        }
                    };
                } else {
                    interfaceC89443yk = this.A05;
                    interfaceC89443yk2 = this.A07;
                    interfaceC89443yk3 = interfaceC89443yk8;
                    interfaceC89443yk4 = interfaceC89443yk7;
                    interfaceC89443yk5 = this.A06;
                }
                C78K.A02(spannable, interfaceC89443yk, interfaceC89443yk2, interfaceC89443yk3, interfaceC89443yk4, interfaceC89443yk5, interfaceC89443yk6, anonymousClass786);
            }
        }
        final TextView textView = c7bf.A03;
        if (c161367Kx == null) {
            anonymousClass541 = AnonymousClass541.A0J;
        } else {
            anonymousClass541 = anonymousClass781.A00;
        }
        boolean z = anonymousClass781.A0F;
        Context context = textView.getContext();
        C14360o3.A07(context);
        textView.setMaxWidth(C7N9.A00(context, z));
        C78K.A00(c7bf.A02, textView, anonymousClass541, anonymousClass781);
        if (anonymousClass781.A0G) {
            if ((textView instanceof TightTextView) && (tightTextView2 = (TightTextView) textView) != null) {
                tightTextView2.A01 = false;
            }
            C7BH c7bh = c7bf.A04;
            c7bh.A02 = anonymousClass781.A09;
            c7bh.A00 = anonymousClass781.A01;
            String str2 = anonymousClass781.BSy().A01;
            C78P c78p = c7bh.A01;
            if (c78p != null) {
                str = c78p.A03;
            } else {
                str = null;
            }
            if (C14360o3.A0K(str, str2)) {
                c78p.A00(charSequence);
            } else {
                C78P c78p2 = new C78P(c7bh, str2, charSequence.length() - 1);
                c78p2.A00(charSequence);
                c7bh.A01 = c78p2;
            }
            C7BI c7bi = c7bh.A03;
            if (!c7bi.A00) {
                c7bi.run();
            }
            boolean CVC = interfaceC129525tH.CVC();
            int i = 8388611;
            if (CVC) {
                i = 8388613;
            }
            textView.setGravity(i);
        } else {
            if ((textView instanceof TightTextView) && (tightTextView = (TightTextView) textView) != null) {
                tightTextView.A01 = true;
            }
            C7BH c7bh2 = c7bf.A04;
            c7bh2.A01 = null;
            C7BI c7bi2 = c7bh2.A03;
            if (c7bi2.A00) {
                c7bi2.A01.removeCallbacksAndMessages(null);
                c7bi2.A00 = false;
            }
        }
        AnonymousClass988 anonymousClass988 = this.A02;
        if (anonymousClass988.A1S && A01(textView, charSequence)) {
            Object parent = textView.getParent();
            if (parent instanceof View) {
                AbstractC13880nE.A0o(textView, (View) parent, R.dimen.account_discovery_bottom_gap);
            }
            C0fQ.A00(this.A04, textView);
            C23031Ai CE0 = interfaceC165247aD.CE0();
            if (anonymousClass988.A1R && !this.A00 && CE0 != null && !CE0.A01.C2v("barcelona_easter_egg_direct_animation_message_id_set").contains(CCL)) {
                this.A00 = true;
                Handler handler = new Handler(Looper.getMainLooper());
                Runnable runnable = new Runnable() { // from class: X.M5j
                    @Override // java.lang.Runnable
                    public final void run() {
                        C158907Bc c158907Bc = this;
                        TextView textView2 = textView;
                        String str3 = CCL;
                        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.1f, 1.0f, 1.1f, 1, 0.5f, 1, 0.5f);
                        scaleAnimation.setDuration(125L);
                        scaleAnimation.setRepeatCount(1);
                        scaleAnimation.setRepeatMode(2);
                        scaleAnimation.setInterpolator(new AccelerateInterpolator());
                        scaleAnimation.setAnimationListener(new LR6(c158907Bc, str3));
                        textView2.startAnimation(scaleAnimation);
                        C2UY.A01.A03();
                    }
                };
                if (interfaceC129525tH.CVC()) {
                    j = 1000;
                } else {
                    j = 500;
                }
                handler.postDelayed(runnable, j);
            }
        }
        this.A03.A02(c7bf, anonymousClass781);
    }

    public C158907Bc(InterfaceC165247aD interfaceC165247aD, AnonymousClass988 anonymousClass988, List list) {
        this.A01 = interfaceC165247aD;
        this.A02 = anonymousClass988;
        this.A03 = new C162907Rb(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C158907Bc A00(final InterfaceC165247aD interfaceC165247aD, AnonymousClass988 anonymousClass988) {
        final InterfaceC09390do interfaceC09390do = anonymousClass988.A07;
        interfaceC09390do.getClass();
        final InterfaceC16820sZ interfaceC16820sZ = new InterfaceC16820sZ() { // from class: X.7Bd
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return InterfaceC09390do.this.getValue();
            }
        };
        return new C158907Bc(interfaceC165247aD, anonymousClass988, AbstractC16960so.A1Q(new C158977Bj(new C162897Ra(interfaceC165247aD), new C7Q6(interfaceC165247aD, interfaceC16820sZ) { // from class: X.7Be
            public final List A00;

            {
                C49004Lls c49004Lls;
                C14360o3.A0B(interfaceC165247aD, 1);
                C7Q6 c7q6 = new C7Q6(interfaceC165247aD) { // from class: X.7Bf
                    public final Object A00;

                    @Override // X.C7Q6
                    public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
                        InterfaceC164897Zc interfaceC164897Zc;
                        C161367Kx BfG;
                        InterfaceC129525tH interfaceC129525tH = (InterfaceC129525tH) obj;
                        Object obj3 = this.A00;
                        if ((obj3 instanceof InterfaceC164897Zc) && (BfG = (interfaceC164897Zc = (InterfaceC164897Zc) obj3).BfG()) != null && interfaceC129525tH.BfF() != AnonymousClass541.A0J) {
                            boolean A02 = BfG.A02(interfaceC129525tH.CCL());
                            if (interfaceC129525tH.BfF() == AnonymousClass541.A0G) {
                                interfaceC164897Zc.DJX();
                            }
                            return A02;
                        }
                        return false;
                    }

                    {
                        this.A00 = interfaceC165247aD;
                    }
                };
                if (((Boolean) interfaceC16820sZ.invoke()).booleanValue()) {
                    c49004Lls = new C49004Lls(interfaceC165247aD);
                } else {
                    c49004Lls = null;
                }
                this.A00 = AbstractC16960so.A1R(c7q6, c49004Lls, new C158947Bg(interfaceC165247aD), new C7Q6(interfaceC165247aD) { // from class: X.7Bh
                    public final Object A00;

                    @Override // X.C7Q6
                    public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
                        InterfaceC129525tH interfaceC129525tH = (InterfaceC129525tH) obj;
                        Object obj3 = this.A00;
                        if ((obj3 instanceof InterfaceC165827bA) && (interfaceC129525tH instanceof AnonymousClass781)) {
                            AnonymousClass781 anonymousClass781 = (AnonymousClass781) interfaceC129525tH;
                            return ((InterfaceC165827bA) obj3).Cou(anonymousClass781.A04.toString(), String.valueOf(anonymousClass781.A07), String.valueOf(anonymousClass781.A06), "tap");
                        }
                        return false;
                    }

                    {
                        this.A00 = interfaceC165247aD;
                    }
                }, new C7Q6(interfaceC165247aD) { // from class: X.7Bi
                    public final Object A00;

                    @Override // X.C7Q6
                    public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
                        String BxY;
                        InterfaceC129525tH interfaceC129525tH = (InterfaceC129525tH) obj;
                        if (interfaceC129525tH == null || (BxY = interfaceC129525tH.BxY()) == null) {
                            return false;
                        }
                        Object obj3 = this.A00;
                        if (!(obj3 instanceof InterfaceC165677au)) {
                            return false;
                        }
                        return ((InterfaceC165677au) obj3).Cqt(BxY);
                    }

                    {
                        this.A00 = interfaceC165247aD;
                    }
                });
            }

            @Override // X.C7Q6
            public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
                C14360o3.A0B(obj, 0);
                C14360o3.A0B(obj2, 1);
                C14360o3.A0B(motionEvent, 2);
                List list = this.A00;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((C7Q6) it.next()).DT4(motionEvent, obj, obj2)) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }, new C7Q7(interfaceC165247aD), new C7Q9(interfaceC165247aD, anonymousClass988.A1U), interfaceC165247aD, anonymousClass988, R.id.direct_text_message_text_view), new C7QB() { // from class: X.7Bk
            @Override // X.C7QB
            public final /* bridge */ /* synthetic */ void D8a(Object obj) {
            }

            @Override // X.C7QB
            public final /* bridge */ /* synthetic */ void Dw5(Object obj) {
            }

            @Override // X.C7QB
            public final /* bridge */ /* synthetic */ void CzN(Object obj, Object obj2) {
                AnonymousClass781 anonymousClass781 = (AnonymousClass781) obj2;
                CharSequence A00 = anonymousClass781.BSy().A00();
                InterfaceC165077Zw interfaceC165077Zw = InterfaceC165077Zw.this;
                C7W5 c7w5 = (C7W5) interfaceC165077Zw;
                if (A00 == null) {
                    A00 = anonymousClass781.A04;
                }
                InterfaceC129525tH interfaceC129525tH = ((AbstractC129515tG) anonymousClass781).A00;
                c7w5.CkQ(A00, interfaceC129525tH.CVC());
                if (anonymousClass781.A0C) {
                    ((C7ZT) interfaceC165077Zw).AFl(anonymousClass781.BSy().A01, interfaceC129525tH.Ar9().toString(), null, anonymousClass781.A04.toString(), false);
                }
            }
        }));
    }

    @Deprecated
    public static boolean A01(TextView textView, CharSequence charSequence) {
        String charSequence2;
        CharSequence A00 = AbstractC692839o.A00(textView, charSequence);
        if (A00 != null && (charSequence2 = A00.toString()) != null) {
            if (charSequence2.equals("🎫") || charSequence2.equals("🎟️") || charSequence2.equals("🎟") || charSequence2.equals("🧵") || charSequence2.equals("@")) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C7BF c7bf = new C7BF((TextView) layoutInflater.inflate(R.layout.direct_text_message_text_view, viewGroup, false));
        this.A03.A00(c7bf);
        return c7bf;
    }
}
