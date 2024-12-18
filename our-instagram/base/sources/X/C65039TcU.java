package X;

import android.graphics.drawable.Drawable;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.TcU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65039TcU extends C0YY implements InterfaceC16660sJ {
    public static final C65039TcU A00 = new C65039TcU();

    public C65039TcU() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = (InterfaceC59242nQ) obj;
        C14360o3.A0B(obj2, 0);
        if (obj2 instanceof Drawable) {
            Drawable drawable = (Drawable) obj2;
            int A0H = AbstractC166997dE.A0H(drawable);
            return AbstractC58318PtA.A0o(Locale.US, "%dx%d", Arrays.copyOf(AbstractC25228BEl.A1Z(Integer.valueOf(A0H), AbstractC166997dE.A0G(drawable)), 2));
        }
        return "";
    }
}
