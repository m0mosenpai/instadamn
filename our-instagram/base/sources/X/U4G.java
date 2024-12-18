package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes11.dex */
public final class U4G implements XAJ {
    public static final ViewGroup.MarginLayoutParams A09;
    public C110844yw A00;
    public final C65827Tuk A01;
    public final U4E A02;
    public final C68690VaQ A03;
    public volatile C70623Ez A04;
    public volatile AbstractC61802rh A05;
    public volatile UH9 A06;
    public volatile Integer A07;
    public volatile List A08;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.setMargins(0, 0, 0, 0);
        A09 = marginLayoutParams;
    }

    public U4G(C65827Tuk c65827Tuk, U4E u4e, C68690VaQ c68690VaQ) {
        this.A02 = u4e;
        this.A03 = c68690VaQ;
        this.A01 = c65827Tuk;
    }

    public final void A00(int i, int i2, boolean z) {
        if (AbstractC79383gk.A03()) {
            U4E u4e = this.A02;
            RecyclerView recyclerView = u4e.A07;
            if (recyclerView == null) {
                u4e.A01 = i;
                u4e.A02 = i2;
                u4e.A0B = z;
                return;
            } else if (z) {
                recyclerView.A0t(i, i2);
                return;
            } else {
                recyclerView.scrollBy(i, i2);
                return;
            }
        }
        throw new RuntimeException("Cannot doScrollBy off the main thread!");
    }

    public final void A01(int i, boolean z) {
        if (AbstractC79383gk.A03()) {
            U4E u4e = this.A02;
            RecyclerView recyclerView = u4e.A07;
            if (recyclerView != null) {
                if (z) {
                    recyclerView.A0o(i);
                    return;
                }
                recyclerView.A0n(i);
                C65827Tuk c65827Tuk = this.A01;
                C102884kP c102884kP = c65827Tuk.A00;
                InterfaceC103384lE A0B = c102884kP.A0B(51);
                InterfaceC103384lE A0B2 = c102884kP.A0B(97);
                if (A0B == null && A0B2 == null) {
                    return;
                }
                UHQ.A00(c65827Tuk.A02, c102884kP, i, false);
                return;
            }
            u4e.A00 = i;
            u4e.A0A = z;
            return;
        }
        throw new RuntimeException("Cannot doScrollTo off the main thread!");
    }

    @Override // X.XAJ
    public final boolean isScrolledToTop() {
        if (AbstractC79383gk.A03()) {
            if (this.A02.A07 == null) {
                return true;
            }
            return !r1.canScrollVertically(-1);
        }
        throw new RuntimeException("Cannot isScrolledToTop off the main thread!");
    }
}
