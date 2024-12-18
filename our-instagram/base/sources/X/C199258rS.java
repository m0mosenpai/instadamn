package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.8rS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199258rS implements InterfaceC189758au {
    public int A00;
    public Runnable A01;
    public boolean A02;
    public final View A03;
    public final C87H A04;
    public final C89F A05;
    public final AnonymousClass840 A06;
    public final AnonymousClass877 A07;
    public final C87P A08;
    public final InterfaceC08830cm A09;

    public C199258rS(View view, FragmentActivity fragmentActivity, C89F c89f, AnonymousClass840 anonymousClass840, AnonymousClass877 anonymousClass877, C87P c87p, InterfaceC08830cm interfaceC08830cm) {
        C14360o3.A0B(view, 1);
        C14360o3.A0B(c87p, 2);
        C14360o3.A0B(c89f, 3);
        C14360o3.A0B(anonymousClass877, 4);
        C14360o3.A0B(anonymousClass840, 5);
        C14360o3.A0B(interfaceC08830cm, 6);
        C14360o3.A0B(fragmentActivity, 7);
        this.A03 = view;
        this.A08 = c87p;
        this.A05 = c89f;
        this.A07 = anonymousClass877;
        this.A06 = anonymousClass840;
        this.A09 = interfaceC08830cm;
        this.A00 = -1;
        C87H A00 = ((C87G) new C52942bb(fragmentActivity).A00(C87G.class)).A00("post_capture");
        this.A04 = A00;
        this.A01 = new Runnable() { // from class: X.8rT
            @Override // java.lang.Runnable
            public final void run() {
                C199258rS c199258rS = C199258rS.this;
                if (c199258rS.A02) {
                    int CFM = c199258rS.CFM();
                    if (CFM >= 0 && c199258rS.A00 != CFM) {
                        c199258rS.A04.A0A(c199258rS);
                        c199258rS.A00 = CFM;
                    }
                    View view2 = c199258rS.A03;
                    Runnable runnable = c199258rS.A01;
                    if (runnable == null) {
                        C14360o3.A0F("timeRunnable");
                        throw C00O.createAndThrow();
                    }
                    view2.postOnAnimation(runnable);
                }
            }
        };
        A00.A0A.A06(fragmentActivity, new C199278rU(new C9EL(this, 7)));
    }

    @Override // X.InterfaceC189768av
    public final /* synthetic */ int B8c() {
        return 0;
    }

    @Override // X.C87J
    public final int Bdt() {
        int A0E;
        C4QW c4qw;
        int i;
        int BVm;
        C1816783z c1816783z = this.A06.A02;
        if (c1816783z.A01() == EnumC198268pb.A07) {
            C195868lW A04 = c1816783z.A01.A04();
            if (A04 != null) {
                int i2 = A04.A0H;
                if (i2 > 0) {
                    A0E = A04.A06 - i2;
                } else {
                    A0E = ((C185948Mo) this.A09.get()).A0E();
                }
                if (A0E >= 0 || ((c4qw = this.A05.A0P.A01) != null && (A0E = c4qw.Azm()) >= 0)) {
                    return A0E;
                }
                AnonymousClass879 A02 = this.A07.A02();
                if (A02.CLN() && (BVm = A02.BVm()) >= 0) {
                    return BVm;
                }
                C87P c87p = this.A08;
                if (c87p.A03 && (i = c87p.A01) >= 0) {
                    return i;
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return -1;
    }

    @Override // X.C87J
    public final int CFM() {
        int i;
        int i2;
        int BVh;
        int currentPositionMs;
        C9KW c9kw;
        C1816783z c1816783z = this.A06.A02;
        if (c1816783z.A01() == EnumC198268pb.A07) {
            C195868lW A04 = c1816783z.A01.A04();
            if (A04 != null) {
                i = A04.A0H;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            i = 0;
        }
        C9KJ c9kj = ((C185948Mo) this.A09.get()).A0B;
        if (c9kj != null && (c9kw = c9kj.A08) != null) {
            i2 = c9kw.A07();
        } else {
            i2 = -1;
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            C4QW c4qw = this.A05.A0P.A01;
            if (c4qw != null && (currentPositionMs = c4qw.getCurrentPositionMs()) >= 0) {
                return currentPositionMs;
            }
            AnonymousClass879 A02 = this.A07.A02();
            i3 = -1;
            if (A02.CLN() && (BVh = A02.BVh() - A02.BVn()) >= 0) {
                return BVh;
            }
            int A00 = this.A08.A00();
            if (A00 >= 0) {
                return A00;
            }
        }
        return i3;
    }

    @Override // X.InterfaceC189758au
    public final void Eo3() {
        if (!this.A02) {
            this.A02 = true;
            View view = this.A03;
            Runnable runnable = this.A01;
            if (runnable == null) {
                C14360o3.A0F("timeRunnable");
                throw C00O.createAndThrow();
            }
            view.postOnAnimation(runnable);
        }
    }

    @Override // X.InterfaceC189758au
    public final void Eoi() {
        if (this.A02) {
            this.A02 = false;
            View view = this.A03;
            Runnable runnable = this.A01;
            if (runnable == null) {
                C14360o3.A0F("timeRunnable");
                throw C00O.createAndThrow();
            }
            view.removeCallbacks(runnable);
        }
    }

    @Override // X.InterfaceC189768av
    public final /* synthetic */ int getDurationInMs() {
        return 0;
    }

    @Override // X.InterfaceC189758au
    public final void onDestroyView() {
        this.A04.A0G.A0B(C87H.A0O);
        Eoi();
    }
}
