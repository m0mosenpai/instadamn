package X;

import android.app.Activity;

/* renamed from: X.0Pt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05220Pt extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ java.util.Set A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05220Pt(Activity activity, java.util.Set set) {
        super(0);
        this.A01 = set;
        this.A00 = activity;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        for (InterfaceC12850lX interfaceC12850lX : this.A01) {
            String name = interfaceC12850lX.getClass().getName();
            C14360o3.A07(name);
            AbstractC12860lY.A09("onActivityPause", name, new C05230Pu(this.A00, interfaceC12850lX));
        }
        return C0eB.A00;
    }
}
