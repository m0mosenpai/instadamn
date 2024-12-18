package X;

import android.graphics.Bitmap;

/* renamed from: X.NGg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52385NGg extends AbstractRunnableC14200nk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ InterfaceC57928PmY A02;
    public final /* synthetic */ String A03;

    @Override // java.lang.Runnable
    public final void run() {
        final Bitmap A0E = C1NC.A0E(this.A03, this.A01, this.A00);
        final InterfaceC57928PmY interfaceC57928PmY = this.A02;
        C11T.A02(new Runnable() { // from class: X.PPp
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC57928PmY.D9Q(A0E);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52385NGg(InterfaceC57928PmY interfaceC57928PmY, String str, int i, int i2) {
        super(574160743);
        this.A03 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = interfaceC57928PmY;
    }
}
