package X;

import android.view.View;

/* renamed from: X.YEf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73462YEf implements InterfaceC189758au {
    public int A00;
    public Runnable A01;
    public boolean A02;
    public final View A03;
    public final C8ON A04;
    public final C87P A05;

    @Override // X.InterfaceC189768av
    public final int B8c() {
        int A00 = this.A05.A00();
        if (A00 < 0) {
            return -1;
        }
        return A00;
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
    public final int getDurationInMs() {
        int i;
        C87P c87p = this.A05;
        if (c87p.A03 && (i = c87p.A01) >= 0) {
            return i;
        }
        return -1;
    }

    @Override // X.InterfaceC189758au
    public final void onDestroyView() {
        this.A04.A00.A0B(C8ON.A01);
        Eoi();
    }

    public C73462YEf(View view, C87P c87p, C8ON c8on) {
        AbstractC167017dG.A1P(view, c87p);
        C14360o3.A0B(c8on, 3);
        this.A03 = view;
        this.A05 = c87p;
        this.A04 = c8on;
        this.A00 = -1;
        this.A01 = new YGW(this);
    }

    @Override // X.C87J
    public final /* synthetic */ int Bdt() {
        return 0;
    }

    @Override // X.C87J
    public final /* synthetic */ int CFM() {
        return 0;
    }
}
