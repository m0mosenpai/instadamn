package X;

import java.lang.ref.WeakReference;

/* renamed from: X.Aep, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23716Aep implements InterfaceC43071ya {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ WeakReference A02;

    public C23716Aep(String str, String str2, WeakReference weakReference) {
        this.A02 = weakReference;
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        Object obj = this.A02.get();
        if (obj != null) {
            Integer CFq = interfaceC57162jr.CFq(c59062n7);
            C14360o3.A07(CFq);
            if (CFq == C05F.A00) {
                C1KM.A09.A0L(AbstractC166997dE.A0u(obj), this.A00, this.A01);
            }
        }
    }
}
