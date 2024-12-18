package X;

import android.view.View;

/* renamed from: X.Piq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57701Piq extends C0YY implements InterfaceC16660sJ {
    public static final C57701Piq A00 = new C57701Piq();

    public C57701Piq() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view = (View) obj;
        C14360o3.A0B(view, 0);
        return Boolean.valueOf(view.postDelayed(new RunnableC56918PNl(view), 1000L));
    }
}
