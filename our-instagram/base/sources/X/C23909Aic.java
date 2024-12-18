package X;

import android.graphics.drawable.Drawable;
import android.os.Handler;

/* renamed from: X.Aic, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23909Aic implements AnonymousClass760 {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ AnonymousClass983 A01;
    public final /* synthetic */ C189478aR A02;

    @Override // X.AnonymousClass760
    public final void ERs(int i, int i2, int i3, int i4) {
    }

    public C23909Aic(Handler handler, AnonymousClass983 anonymousClass983, C189478aR c189478aR) {
        this.A00 = handler;
        this.A01 = anonymousClass983;
        this.A02 = c189478aR;
    }

    @Override // X.AnonymousClass760
    public final void EQQ(Drawable drawable) {
        this.A00.post(new RunnableC24684AwP(drawable, this.A01));
    }

    @Override // X.AnonymousClass760
    public final void setBackgroundColor(int i) {
        this.A00.post(new RunnableC24792AyE(this.A01, this.A02, i));
    }
}
