package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.Abn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23533Abn implements InterfaceC28041Xi {
    public final /* synthetic */ Class A00;

    public C23533Abn(Class cls) {
        this.A00 = cls;
    }

    @Override // X.InterfaceC28041Xi
    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        Drawable drawable = (Drawable) obj;
        C14360o3.A0B(drawable, 0);
        if ((drawable instanceof C194808jg) && ((C194808jg) drawable).A0E(this.A00)) {
            return true;
        }
        return false;
    }
}
