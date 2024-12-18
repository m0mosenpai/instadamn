package X;

import android.os.Handler;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.JmQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44520JmQ extends AbstractC52922bZ {
    public ListIterator A00;
    public final Handler A01;
    public final Runnable A02;
    public final List A03;
    public final C05A A04;
    public final C0UO A05;

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        this.A01.removeCallbacks(this.A02);
    }

    public C44520JmQ() {
        List A1Q = AbstractC16960so.A1Q(2131965101, 2131965100, 2131965102, 2131965110, 2131965988);
        this.A03 = A1Q;
        C008002u A1H = AbstractC25225BEi.A1H(new C51755Mte((Integer) null, (DefaultConstructorMarker) null, 1, 5));
        this.A04 = A1H;
        this.A01 = AbstractC167007dF.A0J();
        this.A02 = new RunnableC49868M0n(this);
        this.A00 = C0eM.A1H(A1Q).listIterator();
        this.A05 = AbstractC208910l.A02(A1H);
    }
}
