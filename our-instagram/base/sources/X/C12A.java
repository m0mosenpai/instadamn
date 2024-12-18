package X;

import android.content.Context;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* renamed from: X.12A, reason: invalid class name */
/* loaded from: classes.dex */
public final class C12A extends AbstractC211911v {
    public final Context A00;
    public final C17090t4 A01;
    public final InterfaceC09390do A02;

    public C12A(Context context, C17090t4 c17090t4, InterfaceC09390do interfaceC09390do) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(interfaceC09390do, 3);
        this.A00 = context;
        this.A01 = c17090t4;
        this.A02 = interfaceC09390do;
    }

    @Override // X.AbstractC211911v
    public final String A06() {
        return "StorageInitializer";
    }

    @Override // X.AbstractC211911v
    public final void A07() {
        C23111Aq c23111Aq;
        C18720vz c18720vz = AbstractC12960li.A00;
        C226418s A01 = C226218q.A01(c18720vz);
        A01.A0P(A01.A02, "STORAGE_INIT_START");
        LightweightQuickPerformanceLogger BjG = ((AnonymousClass127) this.A02.getValue()).BjG();
        Context context = this.A00;
        synchronized (C23111Aq.class) {
            c23111Aq = new C23111Aq(context, BjG);
            C23111Aq.A0A = c23111Aq;
        }
        C1B4 c1b4 = new C1B4(c23111Aq);
        C218914p.A03(EnumC220415e.A03, c1b4);
        C1B4.A07 = c1b4;
        C17090t4 c17090t4 = this.A01;
        if (c17090t4 != null) {
            c17090t4.A01(C1BC.A00);
        }
        C226418s A012 = C226218q.A01(c18720vz);
        A012.A0P(A012.A02, "STORAGE_INIT_END");
    }
}
