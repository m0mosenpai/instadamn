package X;

import android.graphics.ImageDecoder;

/* renamed from: X.BxI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27093BxI extends AbstractRunnableC14200nk {
    public final /* synthetic */ android.net.Uri A00;
    public final /* synthetic */ C45358K5r A01;
    public final /* synthetic */ InterfaceC16660sJ A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27093BxI(android.net.Uri uri, C45358K5r c45358K5r, InterfaceC16660sJ interfaceC16660sJ) {
        super(1505345961, 3, false, true);
        this.A01 = c45358K5r;
        this.A00 = uri;
        this.A02 = interfaceC16660sJ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC167007dF.A0J().post(new RunnableC29578D1f(ImageDecoder.decodeBitmap(ImageDecoder.createSource(this.A01.requireContext().getContentResolver(), this.A00)), this.A02));
    }
}
