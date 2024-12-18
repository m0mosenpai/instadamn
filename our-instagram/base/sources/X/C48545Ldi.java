package X;

import android.content.Context;
import android.graphics.Bitmap;

/* renamed from: X.Ldi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48545Ldi implements C3Se {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C44493Jlz A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ InterfaceC16660sJ A03;

    public C48545Ldi(Context context, C44493Jlz c44493Jlz, String str, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = c44493Jlz;
        this.A00 = context;
        this.A02 = str;
        this.A03 = interfaceC16660sJ;
    }

    @Override // X.C3Se
    public final void CzZ(Bitmap bitmap) {
        C44493Jlz c44493Jlz = this.A01;
        AbstractC166987dD.A1Z(new C50112MAl(c44493Jlz, this.A00, bitmap, this.A03, this.A02, null, 1), AbstractC141776au.A00(c44493Jlz));
    }
}
