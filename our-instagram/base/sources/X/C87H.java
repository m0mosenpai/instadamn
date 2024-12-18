package X;

import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* renamed from: X.87H, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C87H {
    public static final C87J A0O = new C87J() { // from class: X.87I
        @Override // X.C87J
        public final int Bdt() {
            return 0;
        }

        @Override // X.C87J
        public final int CFM() {
            return 0;
        }
    };
    public C2GT A00;
    public final C2GT A01;
    public final C58252li A02;
    public final C2GS A03;
    public final C2GS A04;
    public final C2GS A05;
    public final C2GS A06;
    public final C2GS A07;
    public final C2GS A08;
    public final C2GS A09;
    public final C2GS A0A;
    public final C2GS A0B;
    public final C2GS A0C;
    public final C2GS A0D;
    public final C2GS A0E;
    public final C2GS A0F;
    public final C2GS A0G = new C2GT(A0O);
    public final C2GS A0H;
    public final C2GS A0I;
    public final C05A A0J;
    public final C2GS A0K;
    public final C2GS A0L;
    public final C87M A0M;
    public final C05A A0N;

    public final void A05() {
        this.A0D.A0B(true);
    }

    public final void A09(C2GT c2gt) {
        C14360o3.A0B(c2gt, 0);
        C2GT c2gt2 = this.A00;
        if (c2gt2 != null) {
            this.A02.A0D(c2gt2);
        }
        this.A02.A0E(c2gt, new AUK(this));
        this.A00 = c2gt;
    }

    public final void A0B(List list) {
        C14360o3.A0B(list, 0);
        C87M c87m = this.A0M;
        long currentTimeMillis = 100 - (System.currentTimeMillis() - c87m.A00);
        if (c87m.A02) {
            c87m.A03.removeCallbacks(c87m.A05);
        }
        c87m.A01 = list;
        c87m.A02 = true;
        c87m.A03.postDelayed(c87m.A05, Math.max(0L, currentTimeMillis));
    }

    public final int A00() {
        return ((Number) this.A0N.getValue()).intValue();
    }

    public final void A01() {
        this.A09.A0B(new C8A8(false));
    }

    public final void A02() {
        Number number;
        int intValue;
        C09530e4 c09530e4 = (C09530e4) this.A07.A02();
        if (c09530e4 != null && (number = (Number) c09530e4.A00) != null && (intValue = number.intValue()) != -1) {
            A06(intValue);
        }
        A03();
    }

    public final void A03() {
        this.A09.A0B(new C8A8(true));
    }

    public final void A04() {
        this.A07.A0B(new C09530e4(-1, -1));
    }

    public final void A06(int i) {
        this.A0B.A0B(new C8A8(Integer.valueOf(i)));
    }

    public final void A07(int i) {
        this.A0E.A0B(new C8A8(Integer.valueOf(i)));
    }

    public final void A08(int i, int i2) {
        StringBuilder sb;
        String str;
        if (i != -1 && i2 != -1) {
            if (i >= i2) {
                sb = new StringBuilder();
                str = "setLoopStartEndTimeMs failed: ";
            } else {
                this.A07.A0B(new C09530e4(Integer.valueOf(i), Integer.valueOf(i2)));
                return;
            }
        } else {
            sb = new StringBuilder();
            str = "setLoopStartEndTimeMs is UNSET: ";
        }
        sb.append(str);
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        AbstractC12120kG.A07("VideoPlaybackViewModel", sb.toString(), null);
    }

    public final void A0A(C87J c87j) {
        this.A0G.A0B(c87j);
        this.A0N.Egh(Integer.valueOf(c87j.CFM()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2GT, X.2GS] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.2GT, X.2GS] */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.2GT, X.2GS] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.2GT, X.2GS] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.2GT, X.2GS] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.2GT, X.2GS] */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.2GT, X.2GS] */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.2GT, X.2GS] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.2GT, X.2GS] */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.2GT, X.2GS] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.2GT, X.2GS] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.2GT, X.2GS] */
    public C87H() {
        C58252li c58252li = new C58252li();
        this.A02 = c58252li;
        this.A0L = new C2GT(new Object());
        this.A0C = new C2GT(0);
        this.A08 = new C2GT(true);
        this.A0A = new C2GS();
        this.A0B = new C2GS();
        this.A0F = new C2GS();
        C2GS c2gs = new C2GS();
        this.A03 = c2gs;
        this.A09 = new C2GS();
        this.A05 = new C2GT(false);
        this.A0K = new C2GT(true);
        this.A0D = new C2GT(false);
        this.A0H = new C2GT(Float.valueOf(1.0f));
        this.A0I = new C2GT(Float.valueOf(0.0f));
        this.A07 = new C2GT(new C09530e4(-1, -1));
        this.A0N = new C008002u(-1);
        this.A04 = new C2GT(false);
        this.A06 = new C2GT(false);
        this.A0J = new C008002u(false);
        this.A0E = new C2GS();
        this.A01 = c2gs;
        this.A0M = new C87M(new Handler(Looper.getMainLooper()), new C87L(this));
        c58252li.A0B(C193588hd.A00);
    }
}
