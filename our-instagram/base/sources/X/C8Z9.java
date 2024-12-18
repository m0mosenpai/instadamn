package X;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import java.util.EnumMap;

/* renamed from: X.8Z9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8Z9 implements AnonymousClass851 {
    public View A00;
    public C180667zu A01;
    public C180667zu A02;
    public Runnable A03;
    public boolean A04;
    public final EnumMap A05;
    public final Handler A06;
    public final ViewGroup A07;
    public final InterfaceC11380iw A08;
    public final UserSession A09;
    public final C83A A0A;

    public C8Z9(ViewGroup viewGroup, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C83A c83a) {
        C14360o3.A0B(viewGroup, 1);
        C14360o3.A0B(interfaceC11380iw, 2);
        C14360o3.A0B(userSession, 3);
        C14360o3.A0B(c83a, 4);
        this.A07 = viewGroup;
        this.A08 = interfaceC11380iw;
        this.A09 = userSession;
        this.A0A = c83a;
        this.A06 = new Handler(Looper.getMainLooper());
        this.A05 = new EnumMap(C8ZA.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x02a5, code lost:
    
        if (r14 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0279, code lost:
    
        if (r0.getVisibility() != 0) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(final X.C8Z9 r18, X.C180667zu r19) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8Z9.A00(X.8Z9, X.7zu):void");
    }

    public final void A02(final C180667zu c180667zu, long j) {
        C14360o3.A0B(c180667zu, 0);
        C180667zu c180667zu2 = this.A01;
        if (c180667zu2 != null && c180667zu2.A00 < c180667zu.A00) {
            return;
        }
        A01();
        Runnable runnable = new Runnable() { // from class: X.9Oq
            @Override // java.lang.Runnable
            public final void run() {
                C8Z9.A00(C8Z9.this, c180667zu);
            }
        };
        this.A03 = runnable;
        this.A01 = c180667zu;
        this.A06.postDelayed(runnable, j);
    }

    @Override // X.AnonymousClass851
    public final void DJ2(float f, float f2) {
        boolean z = false;
        if (f > 0.0f) {
            z = true;
        }
        if (this.A04 != z) {
            this.A04 = z;
            if (z) {
                this.A02 = this.A01;
                A04(true);
            } else {
                C180667zu c180667zu = this.A02;
                if (c180667zu != null) {
                    A00(this, c180667zu);
                }
                this.A02 = null;
            }
        }
    }

    public final void A01() {
        Runnable runnable = this.A03;
        if (runnable != null) {
            this.A06.removeCallbacks(runnable);
        }
        this.A03 = null;
    }

    public final void A03(C8G5 c8g5) {
        View view = this.A00;
        if (view != null) {
            Object tag = view.getTag();
            if (tag != null) {
                Drawable drawable = ((C209719Ph) tag).A02.getDrawable();
                C14360o3.A0C(drawable, "null cannot be cast to non-null type com.instagram.music.common.ui.MusicPreviewButtonDrawable");
                ((C8G6) drawable).A01(c8g5);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final boolean A05() {
        View view = this.A00;
        if ((view != null && view.getVisibility() == 0) || this.A03 != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r3.getVisibility() != 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(boolean r5) {
        /*
            r4 = this;
            r4.A01()
            X.7zu r0 = r4.A01
            if (r0 == 0) goto L16
            java.util.EnumMap r1 = r4.A05
            X.8ZA r0 = r0.A09
            java.lang.Object r0 = r1.get(r0)
            X.BDe r0 = (X.InterfaceC25206BDe) r0
            if (r0 == 0) goto L16
            r0.Doo()
        L16:
            android.view.View r3 = r4.A00
            if (r3 == 0) goto L2e
            if (r5 == 0) goto L23
            int r0 = r3.getVisibility()
            r2 = 1
            if (r0 == 0) goto L24
        L23:
            r2 = 0
        L24:
            r1 = 8
            X.AmF r0 = new X.AmF
            r0.<init>(r4)
            X.AbstractC125325le.A03(r3, r0, r1, r2)
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8Z9.A04(boolean):void");
    }
}
