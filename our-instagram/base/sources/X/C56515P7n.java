package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import java.util.Random;

/* renamed from: X.P7n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56515P7n implements InterfaceC57973PnJ {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final Bitmap A04;
    public final Rect A05;
    public final View A06;
    public final Random A07;

    public C56515P7n(Bitmap bitmap, View view) {
        C14360o3.A0B(view, 1);
        this.A06 = view;
        this.A04 = bitmap;
        Context A0L = AbstractC166997dE.A0L(view);
        this.A02 = AbstractC13690mv.A01(A0L, -350);
        this.A00 = AbstractC13690mv.A01(A0L, -550);
        this.A03 = AbstractC13690mv.A01(A0L, 100);
        this.A01 = AbstractC13690mv.A01(A0L, -200);
        this.A07 = new Random();
        this.A05 = AbstractC166987dD.A0U();
    }

    @Override // X.InterfaceC57973PnJ
    public final void AJH(C54992OUb c54992OUb, int i, int i2, long j) {
        this.A06.post(new RunnableC57044PSj(this, c54992OUb, i));
    }
}
