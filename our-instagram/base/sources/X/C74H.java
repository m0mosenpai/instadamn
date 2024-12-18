package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.74H, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C74H implements InterfaceC55932he {
    public float A00;
    public List A01;
    public InterfaceC16820sZ A02;
    public boolean A03;
    public final GestureDetector A04;
    public final ViewGroup A05;
    public final C55982hj A06;
    public final C55982hj A07;
    public final C55982hj A08;
    public final C55982hj A09;
    public final C55982hj A0A;
    public final C55942hf A0B;
    public final ProfileCoinFlipView A0C;
    public final InterfaceC16820sZ A0D;
    public final InterfaceC16820sZ A0E;
    public final boolean A0F;
    public final C55942hf A0G;
    public final C55942hf A0H;
    public final InterfaceC16820sZ A0I;

    public C74H(ViewGroup viewGroup, EnumC152426tV enumC152426tV, ProfileCoinFlipView profileCoinFlipView, List list, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, boolean z, boolean z2, final boolean z3) {
        C14360o3.A0B(viewGroup, 1);
        C14360o3.A0B(profileCoinFlipView, 2);
        this.A05 = viewGroup;
        this.A0C = profileCoinFlipView;
        this.A01 = list;
        this.A0F = z;
        this.A0I = interfaceC16820sZ;
        this.A0E = interfaceC16820sZ2;
        this.A02 = interfaceC16820sZ3;
        this.A0D = interfaceC16820sZ4;
        this.A0G = C55942hf.A04(10.0d, 10.0d);
        C55942hf A04 = C55942hf.A04(40.0d, 6.0d);
        this.A0B = A04;
        this.A0H = C55942hf.A04(120.0d, 20.0d);
        C55982hj A02 = AbstractC13560mi.A00().A02();
        A02.A06 = false;
        A02.A0A(this);
        this.A08 = A02;
        this.A04 = new GestureDetector(profileCoinFlipView.getContext(), new InterfaceGestureDetectorOnGestureListenerC149756oS() { // from class: X.74m
            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!z3) {
                    C74H.this.A00 = f;
                    return true;
                }
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
                C74H c74h = C74H.this;
                c74h.A0D.invoke();
                C74H.A02(c74h);
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!z3) {
                    C74H c74h = C74H.this;
                    c74h.A05.requestDisallowInterceptTouchEvent(true);
                    C55982hj c55982hj = c74h.A08;
                    C55992hk c55992hk = c55982hj.A09;
                    if (c55992hk.A00 % 1.0d == 0.0d) {
                        C74H.A00(c74h);
                    }
                    c55982hj.A05(c55992hk.A00 - (f / (c74h.A0C.getWidth() * 3)));
                }
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                C74H c74h = C74H.this;
                c74h.A02.invoke();
                c74h.A03 = true;
                return true;
            }
        });
        C55982hj A022 = AbstractC13560mi.A00().A02();
        A022.A09(C55942hf.A04(180.0d, 20.0d));
        A022.A06 = true;
        A022.A0A(new InterfaceC55932he() { // from class: X.74n
            @Override // X.InterfaceC55932he
            public final void Dnj(C55982hj c55982hj) {
            }

            @Override // X.InterfaceC55932he
            public final void Dnk(C55982hj c55982hj) {
            }

            @Override // X.InterfaceC55932he
            public final void Dnl(C55982hj c55982hj) {
            }

            @Override // X.InterfaceC55932he
            public final void Dnm(C55982hj c55982hj) {
                float f;
                float f2;
                if (c55982hj != null) {
                    f = (float) c55982hj.A09.A00;
                } else {
                    f = 1.0f;
                }
                float f3 = 1.0f - 0.0f;
                float f4 = 0.9f - 1.0f;
                float f5 = 0.0f;
                if (f3 != 0.0f) {
                    f5 = (f - 0.0f) / f3;
                }
                float f6 = (f5 * f4) + 1.0f;
                if (c55982hj != null) {
                    f2 = (float) c55982hj.A09.A00;
                } else {
                    f2 = 1.0f;
                }
                float f7 = 0.0f - 1.0f;
                float f8 = 0.0f;
                if (f3 != 0.0f) {
                    f8 = (f2 - 0.0f) / f3;
                }
                float f9 = (f8 * f7) + 1.0f;
                C74H c74h = C74H.this;
                List<View> list2 = c74h.A01;
                if (list2 != null) {
                    for (View view : list2) {
                        view.setScaleX(Math.signum(c74h.A0C.getScaleX()) * f6);
                        view.setScaleY(f6);
                        view.setAlpha(f9);
                    }
                }
            }
        });
        this.A0A = A022;
        C55982hj A023 = AbstractC13560mi.A00().A02();
        A023.A09(C55942hf.A04(180.0d, 20.0d));
        A023.A06 = true;
        A023.A0A(new InterfaceC55932he() { // from class: X.74o
            @Override // X.InterfaceC55932he
            public final void Dnj(C55982hj c55982hj) {
            }

            @Override // X.InterfaceC55932he
            public final void Dnk(C55982hj c55982hj) {
            }

            @Override // X.InterfaceC55932he
            public final void Dnl(C55982hj c55982hj) {
            }

            @Override // X.InterfaceC55932he
            public final void Dnm(C55982hj c55982hj) {
            }
        });
        this.A06 = A023;
        C55982hj A024 = AbstractC13560mi.A00().A02();
        A024.A09(C55942hf.A04(200.0d, 20.0d));
        A024.A0A(new InterfaceC55932he() { // from class: X.74p
            @Override // X.InterfaceC55932he
            public final void Dnj(C55982hj c55982hj) {
            }

            @Override // X.InterfaceC55932he
            public final void Dnk(C55982hj c55982hj) {
            }

            @Override // X.InterfaceC55932he
            public final void Dnl(C55982hj c55982hj) {
            }

            @Override // X.InterfaceC55932he
            public final void Dnm(C55982hj c55982hj) {
                float f;
                if (c55982hj != null) {
                    f = (float) c55982hj.A09.A00;
                } else {
                    f = 1.0f;
                }
                float f2 = 1.0f - 0.0f;
                float f3 = 0.8f - 1.0f;
                float f4 = 0.0f;
                if (f2 != 0.0f) {
                    f4 = (f - 0.0f) / f2;
                }
                ((AbstractC1569172v) C74H.this.A0C).A01.setAvatarScale((f4 * f3) + 1.0f);
            }
        });
        this.A09 = A024;
        C55982hj A025 = AbstractC13560mi.A00().A02();
        A025.A09(C55942hf.A03(10.0d, 20.0d));
        A025.A06 = false;
        A025.A0A(new InterfaceC55932he() { // from class: X.74q
            @Override // X.InterfaceC55932he
            public final void Dnj(C55982hj c55982hj) {
            }

            @Override // X.InterfaceC55932he
            public final void Dnk(C55982hj c55982hj) {
            }

            @Override // X.InterfaceC55932he
            public final void Dnl(C55982hj c55982hj) {
            }

            @Override // X.InterfaceC55932he
            public final void Dnm(C55982hj c55982hj) {
                float f;
                if (c55982hj != null) {
                    f = (float) c55982hj.A09.A00;
                } else {
                    f = 1.0f;
                }
                ProfileCoinFlipView profileCoinFlipView2 = C74H.this.A0C;
                float f2 = profileCoinFlipView2.A00;
                float f3 = 1.0f - 0.0f;
                float f4 = (0.9f * f2) - f2;
                float f5 = 0.0f;
                if (f3 != 0.0f) {
                    f5 = (f - 0.0f) / f3;
                }
                float f6 = (f5 * f4) + f2;
                profileCoinFlipView2.setScaleX(Math.signum(profileCoinFlipView2.getScaleX()) * f6);
                profileCoinFlipView2.setScaleY(f6);
            }
        });
        this.A07 = A025;
        A02.A09(A04);
        A04(enumC152426tV);
        if (z2) {
            viewGroup.setOnTouchListener(new View.OnTouchListener() { // from class: X.74r
                /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
                
                    if (r5 < 90.0f) goto L31;
                 */
                @Override // android.view.View.OnTouchListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
                    /*
                        r13 = this;
                        int r0 = r15.getAction()
                        if (r0 != 0) goto L2a
                        X.74H r4 = X.C74H.this
                        r0 = 0
                        r4.A00 = r0
                        X.2hj r0 = r4.A07
                        r3 = 1
                        r0.A06 = r3
                        r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                        r0.A06(r1)
                        boolean r0 = r4.A0F
                        if (r0 == 0) goto L20
                        X.2hj r0 = r4.A09
                        r0.A06 = r3
                        r0.A06(r1)
                    L20:
                        X.2hj r0 = r4.A0A
                        r0.A06(r1)
                        X.2hj r0 = r4.A06
                        r0.A06(r1)
                    L2a:
                        X.74H r9 = X.C74H.this
                        android.view.GestureDetector r0 = r9.A04
                        r0.onTouchEvent(r15)
                        int r1 = r15.getAction()
                        r0 = 3
                        r8 = 1
                        if (r1 == r0) goto L3f
                        int r0 = r15.getAction()
                        if (r0 != r8) goto L59
                    L3f:
                        X.2hj r0 = r9.A07
                        r1 = 0
                        r0.A06 = r1
                        r2 = 0
                        r0.A06(r2)
                        boolean r0 = r9.A03
                        if (r0 == 0) goto L5a
                        X.C74H.A01(r9)
                        X.2hj r0 = r9.A09
                        r0.A06 = r8
                        r0.A06(r2)
                        r9.A03 = r1
                    L59:
                        return r8
                    L5a:
                        float r0 = r9.A00
                        float r1 = java.lang.Math.abs(r0)
                        com.instagram.avatars.coinflip.ProfileCoinFlipView r4 = r9.A0C
                        int r0 = r4.getWidth()
                        int r0 = r0 * 3
                        float r0 = (float) r0
                        float r1 = r1 / r0
                        r0 = 1056964608(0x3f000000, float:0.5)
                        int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                        if (r0 <= 0) goto L72
                        r1 = 1056964608(0x3f000000, float:0.5)
                    L72:
                        float r0 = r9.A00
                        float r0 = java.lang.Math.signum(r0)
                        float r1 = r1 * r0
                        X.2hj r10 = r9.A08
                        double r0 = (double) r1
                        r10.A07(r0)
                        float r5 = r4.getRotationY()
                        r4 = 1127481344(0x43340000, float:180.0)
                        float r5 = r5 % r4
                        r4 = 0
                        int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                        if (r4 != 0) goto L8f
                        X.C74H.A01(r9)
                        return r8
                    L8f:
                        int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                        if (r4 > 0) goto Lbf
                        int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                        if (r4 < 0) goto La1
                        r1 = 1119092736(0x42b40000, float:90.0)
                        int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                        if (r0 >= 0) goto Lbf
                        int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                        if (r0 >= 0) goto L59
                    La1:
                        X.C74H.A00(r9)
                        X.2hk r0 = r10.A09
                        double r6 = r0.A00
                        r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                        double r4 = r6 % r11
                        int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                        if (r0 != 0) goto Lba
                        double r6 = r6 - r11
                    Lb1:
                        r10.A06(r6)
                        X.0sZ r0 = r9.A0E
                        r0.invoke()
                        return r8
                    Lba:
                        double r6 = java.lang.Math.floor(r6)
                        goto Lb1
                    Lbf:
                        X.C74H.A00(r9)
                        X.2hk r0 = r10.A09
                        double r6 = r0.A00
                        r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                        double r4 = r6 % r11
                        int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                        if (r0 != 0) goto Ld0
                        double r6 = r6 + r11
                        goto Lb1
                    Ld0:
                        double r6 = java.lang.Math.ceil(r6)
                        goto Lb1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC1573574r.onTouch(android.view.View, android.view.MotionEvent):boolean");
                }
            });
        }
    }

    public final void A04(EnumC152426tV enumC152426tV) {
        C14360o3.A0B(enumC152426tV, 0);
        int ordinal = enumC152426tV.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                this.A08.A02();
                ProfileCoinFlipView profileCoinFlipView = this.A0C;
                profileCoinFlipView.A0E();
                ((AbstractC1569172v) profileCoinFlipView).A01.setAvatarScale(1.0f);
                return;
            }
            throw new RuntimeException();
        }
        this.A08.A05(0.0d);
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    public static final void A00(C74H c74h) {
        C55982hj c55982hj;
        if (c74h.A0C.A01 == EnumC152426tV.A03) {
            List list = c74h.A01;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).setVisibility(4);
                }
            }
            c55982hj = c74h.A0A;
        } else {
            c55982hj = c74h.A06;
        }
        c55982hj.A06(1.0d);
    }

    public static final void A01(C74H c74h) {
        C55982hj c55982hj;
        if (c74h.A0C.A01 == EnumC152426tV.A03) {
            List list = c74h.A01;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).setVisibility(0);
                }
            }
            c55982hj = c74h.A0A;
        } else {
            c55982hj = c74h.A06;
        }
        c55982hj.A06(0.0d);
    }

    public static final void A02(C74H c74h) {
        if (c74h.A0F) {
            ProfileCoinFlipView profileCoinFlipView = c74h.A0C;
            if (profileCoinFlipView.A01 == EnumC152426tV.A02) {
                c74h.A09.A05(1.0d);
                profileCoinFlipView.postDelayed(new RunnableC36802GKb(c74h), 250L);
                List list = c74h.A01;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((View) it.next()).setVisibility(4);
                    }
                }
            }
        }
    }

    public final void A03() {
        this.A08.A00();
        this.A07.A00();
        this.A0A.A00();
        this.A06.A00();
        this.A09.A00();
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        ProfileCoinFlipView profileCoinFlipView = this.A0C;
        if (profileCoinFlipView.A01 == EnumC152426tV.A02) {
            profileCoinFlipView.A0D();
            A02(this);
        }
        A01(this);
        this.A0I.invoke();
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        EnumC152426tV enumC152426tV;
        float scaleX;
        if (c55982hj != null) {
            float f = ((float) c55982hj.A09.A00) * 180.0f;
            ProfileCoinFlipView profileCoinFlipView = this.A0C;
            profileCoinFlipView.setRotationY(f);
            float abs = Math.abs(f) % 360.0f;
            if (abs >= 90.0f && abs <= 270.0f) {
                enumC152426tV = EnumC152426tV.A02;
            } else {
                enumC152426tV = EnumC152426tV.A03;
            }
            if (enumC152426tV.ordinal() == 0 ? profileCoinFlipView.getScaleX() < 0.0f : profileCoinFlipView.getScaleX() > 0.0f) {
                scaleX = -profileCoinFlipView.getScaleX();
            } else {
                scaleX = profileCoinFlipView.getScaleX();
            }
            profileCoinFlipView.setScaleX(scaleX);
            profileCoinFlipView.A0F(enumC152426tV);
        }
    }

    public final void A05(boolean z, boolean z2) {
        C55942hf c55942hf;
        A00(this);
        C55982hj c55982hj = this.A08;
        if (z) {
            c55942hf = this.A0G;
        } else {
            c55942hf = this.A0H;
        }
        c55982hj.A09(c55942hf);
        c55982hj.A0A(new C31430Dra(this));
        double d = c55982hj.A09.A00;
        int i = 1;
        int i2 = -1;
        if (z2) {
            i2 = 1;
        }
        if (z) {
            i = 2;
        }
        c55982hj.A06(d - (i2 * i));
    }
}
