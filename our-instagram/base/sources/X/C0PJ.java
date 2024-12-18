package X;

import android.app.Activity;

/* renamed from: X.0PJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0PJ extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ java.util.Set A01;
    public final /* synthetic */ boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PJ(Activity activity, java.util.Set set, boolean z) {
        super(0);
        this.A01 = set;
        this.A02 = z;
        this.A00 = activity;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        for (InterfaceC12850lX interfaceC12850lX : this.A01) {
            String name = interfaceC12850lX.getClass().getName();
            C14360o3.A07(name);
            AbstractC12860lY.A09("onActivityWindowFocusChanged", name, new C0PS(this.A00, interfaceC12850lX, this.A02));
        }
        return C0eB.A00;
    }
}
