package X;

import android.app.Dialog;

/* renamed from: X.8J2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8J2 implements C8J3 {
    public final /* synthetic */ C184978Im A00;

    public C8J2(C184978Im c184978Im) {
        this.A00 = c184978Im;
    }

    @Override // X.C8J3
    public final void Dc2(final float f) {
        C176567tE.A00(new Runnable() { // from class: X.AvG
            @Override // java.lang.Runnable
            public final void run() {
                C8J2 c8j2 = C8J2.this;
                float f2 = f;
                InterfaceC09390do interfaceC09390do = c8j2.A00.A09;
                if (((Dialog) interfaceC09390do.getValue()).isShowing()) {
                    ((C9RW) interfaceC09390do.getValue()).A00.setProgress((int) (100.0f * f2));
                }
                if (f2 == 1.0f) {
                    AbstractC167027dH.A17(interfaceC09390do);
                }
            }
        });
    }
}
