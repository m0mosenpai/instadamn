package X;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* renamed from: X.573, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass573 extends C0YY implements InterfaceC16820sZ {
    public static final AnonymousClass573 A00 = new AnonymousClass573();

    public AnonymousClass573() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Choreographer choreographer;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            choreographer = Choreographer.getInstance();
        } else {
            C12T c12t = C12P.A00;
            choreographer = (Choreographer) C2ST.A00(AnonymousClass131.A00, new GSB(1, null));
        }
        AnonymousClass572 anonymousClass572 = new AnonymousClass572(Handler.createAsync(Looper.getMainLooper()), choreographer);
        return AnonymousClass190.A02(anonymousClass572, anonymousClass572.A06);
    }
}
