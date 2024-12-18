package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.Iterator;

/* renamed from: X.7L9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7L9 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public InterfaceC161707Mf A04;
    public InterfaceC161697Me A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public AnonymousClass988 A0C;
    public final float A0D;
    public final int A0E;
    public final RecyclerView A0F;
    public final C55982hj A0G;
    public final C161157Ka A0H;
    public final C7L8 A0I;
    public final boolean A0J;
    public final float A0K;
    public final Context A0L;
    public final C7LD A0M;
    public final C7LA A0N;

    public static final boolean A01(Integer num, float f, float f2) {
        float f3 = f - f2;
        if (num != C05F.A00 || f3 >= 0.0f) {
            if (num != C05F.A01 || f3 <= 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Fc, X.7LA] */
    public C7L9(RecyclerView recyclerView, C161157Ka c161157Ka, C7L8 c7l8, AnonymousClass988 anonymousClass988, boolean z, boolean z2, boolean z3) {
        this.A0F = recyclerView;
        this.A0C = anonymousClass988;
        this.A07 = z;
        this.A06 = z2;
        this.A08 = z3;
        this.A0H = c161157Ka;
        this.A0I = c7l8;
        Context context = recyclerView.getContext();
        this.A0L = context;
        this.A0E = ViewConfiguration.get(context).getScaledTouchSlop();
        ?? r3 = new AbstractC70653Fc() { // from class: X.7LA
            @Override // X.AbstractC70653Fc
            public final void onDraw(Canvas canvas, RecyclerView recyclerView2, C3F5 c3f5) {
                Integer num;
                C14360o3.A0B(canvas, 0);
                C14360o3.A0B(recyclerView2, 1);
                C14360o3.A0B(c3f5, 2);
                C7L9 c7l9 = C7L9.this;
                InterfaceC161697Me interfaceC161697Me = c7l9.A05;
                if (interfaceC161697Me != null) {
                    float f = c7l9.A00;
                    if (!c7l9.A07 && c7l9.A06) {
                        num = C05F.A01;
                    } else {
                        num = C05F.A00;
                    }
                    interfaceC161697Me.DCG(canvas, num, f);
                }
            }
        };
        this.A0N = r3;
        this.A0K = context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        boolean A02 = AbstractC13620mo.A02(context);
        this.A0J = A02;
        this.A0D = context.getResources().getDimensionPixelSize(R.dimen.avatar_sticker_max_height) * (A02 ? 1.0f : -1.0f);
        C55982hj A022 = AbstractC13560mi.A00().A02();
        A022.A06 = true;
        A022.A0A(new C668630d() { // from class: X.7LB
            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnm(C55982hj c55982hj) {
                InterfaceC161707Mf interfaceC161707Mf;
                C14360o3.A0B(c55982hj, 0);
                float f = (float) c55982hj.A09.A00;
                C7L9 c7l9 = C7L9.this;
                RecyclerView recyclerView2 = c7l9.A0F;
                int childCount = recyclerView2.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    Object A0Y = recyclerView2.A0Y(recyclerView2.getChildAt(i));
                    if ((A0Y instanceof InterfaceC161707Mf) && (interfaceC161707Mf = (InterfaceC161707Mf) A0Y) != null) {
                        interfaceC161707Mf.DBy(f, c7l9.A0D);
                    }
                }
            }
        });
        this.A0G = A022;
        C7LD c7ld = new C7LD() { // from class: X.7LC
            public boolean A00;
            public boolean A01;

            /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
            
                if (java.lang.Math.abs(r13.getY() - r12.A02.A03) > (r3.A0E * 1.0f)) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
            
                if (java.lang.Math.abs(r13.getX() - r12.A02.A02) > (r3.A0E * 1.0f)) goto L20;
             */
            @Override // X.C7LD
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean DMd(android.view.MotionEvent r13, androidx.recyclerview.widget.RecyclerView r14) {
                /*
                    Method dump skipped, instructions count: 285
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C7LC.DMd(android.view.MotionEvent, androidx.recyclerview.widget.RecyclerView):boolean");
            }

            @Override // X.C7LD
            public final void Dfm(boolean z4) {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C7LD
            public final void Du8(MotionEvent motionEvent, RecyclerView recyclerView2) {
                Integer num;
                float max;
                boolean z4;
                C3OO c3oo;
                View view;
                float min;
                Long l;
                String str;
                C14360o3.A0B(motionEvent, 1);
                int actionMasked = motionEvent.getActionMasked();
                C7L9 c7l9 = C7L9.this;
                InterfaceC161707Mf interfaceC161707Mf = c7l9.A04;
                if (interfaceC161707Mf != null && interfaceC161707Mf.Ej5()) {
                    interfaceC161707Mf.APo(motionEvent);
                }
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            return;
                        }
                    } else {
                        if (interfaceC161707Mf == null) {
                            if (c7l9.A05 == null) {
                                if (!c7l9.A08) {
                                    return;
                                }
                                float x = motionEvent.getX() - c7l9.A02;
                                C55982hj c55982hj = c7l9.A0G;
                                float f = (float) c55982hj.A09.A00;
                                boolean z5 = c7l9.A0J;
                                float f2 = c7l9.A0D;
                                float f3 = f2 / 3.0f;
                                if (!z5 ? f < f3 : f > f3) {
                                    if (!c7l9.A0A) {
                                        c7l9.A0A = true;
                                        C161157Ka c161157Ka2 = c7l9.A0H;
                                        C18920wW c18920wW = c161157Ka2.A00;
                                        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "swipe_thread_view_to_timestamp");
                                        if (A00.isSampled()) {
                                            C2ED c2ed = (C2ED) c161157Ka2.A04.invoke();
                                            if (c2ed != null) {
                                                str = c2ed.C7q();
                                            } else {
                                                str = null;
                                            }
                                            A00.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
                                            A00.AAP("swipe_status", "complete");
                                            A00.Cht();
                                        }
                                    }
                                    if (!c7l9.A09) {
                                        c7l9.A09 = true;
                                        C161157Ka c161157Ka3 = c7l9.A0H;
                                        C2EC c2ec = (C2EC) c161157Ka3.A04.invoke();
                                        if (c2ec != null) {
                                            C9EW c9ew = new C9EW(c161157Ka3, 7);
                                            if (c2ec.C7g() == 29 && c2ec.CfH(c161157Ka3.A01.userId) && ((Boolean) c9ew.invoke()).booleanValue()) {
                                                C142846ck c142846ck = c161157Ka3.A02;
                                                int AdZ = c2ec.AdZ();
                                                String C7I = c2ec.C7I();
                                                String C7q = c2ec.C7q();
                                                C25531Mh A0E = C25531Mh.A0E(c142846ck.A03);
                                                if (((AbstractC02600Aj) A0E).A00.isSampled()) {
                                                    A0E.A0g(Long.valueOf(c142846ck.A02));
                                                    A0E.A0k("view_message_seen_count");
                                                    A0E.A0j("swipe");
                                                    A0E.A0o("message_metadata");
                                                    A0E.A0p("thread_view");
                                                    A0E.A0n(AbstractC147806l5.A01(Integer.valueOf(AdZ)));
                                                    A0E.A0r(C7I);
                                                    if (C7q != null) {
                                                        l = AbstractC003100w.A0k(10, C7q);
                                                    } else {
                                                        l = null;
                                                    }
                                                    A0E.A0h(l);
                                                    A0E.A0u(c142846ck.A01);
                                                    A0E.Cht();
                                                }
                                            }
                                        }
                                    }
                                }
                                if (!z5 ? !(f >= f2 || x >= 0.0f) : !(f <= f2 || x <= 0.0f)) {
                                    x *= (float) Math.pow(1.0f - (Math.abs(f - f2) / Math.abs(f2)), 4.0d);
                                }
                                float f4 = f + x;
                                if (z5) {
                                    min = Math.max(f4, 0.0f);
                                } else {
                                    min = Math.min(f4, 0.0f);
                                }
                                c55982hj.A05(min);
                                c7l9.A02 = motionEvent.getX();
                                return;
                            }
                        } else if (!interfaceC161707Mf.Ej5()) {
                            interfaceC161707Mf.APo(motionEvent);
                        }
                        InterfaceC161697Me interfaceC161697Me = c7l9.A05;
                        if (interfaceC161697Me == 0 || !C7L9.A01(interfaceC161697Me.C4a(), motionEvent.getRawX(), c7l9.A02)) {
                            return;
                        }
                        float rawX = (motionEvent.getRawX() - c7l9.A02) * 0.3f;
                        RecyclerView recyclerView3 = c7l9.A0F;
                        recyclerView3.requestDisallowInterceptTouchEvent(true);
                        if (interfaceC161697Me.C4a() == C05F.A01) {
                            max = Math.min(rawX, 0.0f);
                        } else {
                            max = Math.max(rawX, 0.0f);
                        }
                        Iterator it = interfaceC161697Me.CGZ().iterator();
                        while (it.hasNext()) {
                            ((View) it.next()).setTranslationX(max);
                        }
                        C7L9.A00(c7l9, interfaceC161697Me, max);
                        c7l9.A00 = Math.abs(rawX);
                        float rawX2 = motionEvent.getRawX();
                        Integer C4a = interfaceC161697Me.C4a();
                        float f5 = c7l9.A02;
                        if (C7L9.A01(C4a, rawX2, f5) && Math.abs((rawX2 - f5) * 0.3f) >= interfaceC161697Me.C4c()) {
                            if (!c7l9.A0B && (interfaceC161697Me instanceof C3OO) && (c3oo = (C3OO) interfaceC161697Me) != null && (view = c3oo.itemView) != null) {
                                view.performHapticFeedback(3);
                            }
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        c7l9.A0B = z4;
                        recyclerView3.invalidate();
                        return;
                    }
                }
                c7l9.A0A = false;
                c7l9.A0G.A06(0.0d);
                c7l9.A04 = null;
                float x2 = motionEvent.getX();
                InterfaceC161697Me interfaceC161697Me2 = c7l9.A05;
                if (interfaceC161697Me2 != null) {
                    Integer C4a2 = interfaceC161697Me2.C4a();
                    float f6 = c7l9.A02;
                    if (C7L9.A01(C4a2, x2, f6) && Math.abs((x2 - f6) * 0.3f) >= interfaceC161697Me2.C4c()) {
                        if (c7l9.A06 && !c7l9.A07) {
                            num = C05F.A01;
                        } else {
                            num = C05F.A00;
                        }
                        interfaceC161697Me2.Drc(num);
                    }
                    Iterator it2 = interfaceC161697Me2.CGZ().iterator();
                    while (it2.hasNext()) {
                        ((View) it2.next()).setTranslationX(c7l9.A01);
                    }
                    Iterator it3 = interfaceC161697Me2.CGY().iterator();
                    while (it3.hasNext()) {
                        ((View) it3.next()).setAlpha(1.0f);
                    }
                    c7l9.A05 = null;
                    c7l9.A00 = Math.abs(x2 - c7l9.A02);
                    c7l9.A0F.invalidate();
                }
                A00();
            }

            private final void A00() {
                C7L9 c7l9 = C7L9.this;
                c7l9.A05 = null;
                c7l9.A04 = null;
                this.A00 = false;
                this.A01 = false;
                c7l9.A0I.A00.invoke(false);
                c7l9.A0F.requestDisallowInterceptTouchEvent(false);
            }
        };
        this.A0M = c7ld;
        recyclerView.A13(c7ld);
        recyclerView.A12(c7ld);
        recyclerView.A11(r3);
        recyclerView.A10(r3);
    }

    public static final void A00(C7L9 c7l9, InterfaceC161697Me interfaceC161697Me, float f) {
        Iterator it = interfaceC161697Me.CGY().iterator();
        while (it.hasNext()) {
            ((View) it.next()).setAlpha(Math.max(1.0f - (Math.abs(f) / c7l9.A0K), 0.0f));
        }
    }
}
