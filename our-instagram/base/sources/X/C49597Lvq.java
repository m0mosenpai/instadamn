package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lvq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49597Lvq implements InterfaceC71960XCm {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C49154LoX A01;

    @Override // X.InterfaceC71960XCm
    public final void DE2() {
    }

    public C49597Lvq(UserSession userSession, C49154LoX c49154LoX) {
        this.A01 = c49154LoX;
        this.A00 = userSession;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.1vN] */
    @Override // X.InterfaceC71960XCm
    public final void DLX(Drawable drawable) {
        this.A01.A08.setImageDrawable(drawable);
        AbstractC25651Mw.A00(this.A00).E4s(new Object());
    }
}
