package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.Vqn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69523Vqn {
    public final /* synthetic */ C66311U8k A00;

    /* JADX WARN: Multi-variable type inference failed */
    public final void A00(Drawable drawable, EnumC53112NeP enumC53112NeP) {
        InterfaceC58682mR interfaceC58682mR;
        C66311U8k c66311U8k = this.A00;
        if (c66311U8k.A02 == enumC53112NeP && c66311U8k.A01 == null) {
            if (drawable == 0) {
                c66311U8k.A07 = true;
                return;
            }
            c66311U8k.A01 = drawable;
            drawable.setCallback(c66311U8k);
            c66311U8k.A05 = true;
            if (!c66311U8k.A06) {
                return;
            }
            c66311U8k.A06 = false;
            C66311U8k.A01(c66311U8k);
            if ((drawable instanceof InterfaceC58682mR) && (interfaceC58682mR = (InterfaceC58682mR) drawable) != null) {
                interfaceC58682mR.E4S();
            }
            c66311U8k.invalidateSelf();
        }
    }

    public C69523Vqn(C66311U8k c66311U8k) {
        this.A00 = c66311U8k;
    }
}
