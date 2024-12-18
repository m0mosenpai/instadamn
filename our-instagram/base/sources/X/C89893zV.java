package X;

import android.content.Context;

/* renamed from: X.3zV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89893zV implements InterfaceC89863zS {
    public final float A00;

    public C89893zV(float f) {
        this.A00 = f;
    }

    public static C89893zV A00(Context context, int i) {
        return new C89893zV(context.getResources().getDisplayMetrics().density * i);
    }

    @Override // X.InterfaceC89863zS
    public final float EKB(C107434so c107434so, C42Q c42q) {
        return this.A00 + c42q.Aur(c107434so);
    }
}
