package X;

import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ao4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24181Ao4 implements BD5 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ BD6 A01;

    public C24181Ao4(UserSession userSession, BD6 bd6) {
        this.A00 = userSession;
        this.A01 = bd6;
    }

    @Override // X.BD5
    public final void DKi(Exception exc) {
        String message = exc.getMessage();
        if (message == null) {
            message = "decoding high quality bitmap can be null in HighQualityBitmapManager";
        }
        C0w9.A04(MSV.A00(811), message, 1);
        this.A01.DYT(exc);
    }

    @Override // X.BD5
    public final void DKj(final Bitmap bitmap, final C206409Bx c206409Bx, final int i, final boolean z) {
        InterfaceC14020nS A00 = C14120nc.A00();
        final UserSession userSession = this.A00;
        final BD6 bd6 = this.A01;
        A00.ATO(new AbstractRunnableC14200nk() { // from class: X.9jQ
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(118, 2, false, false);
            }

            @Override // java.lang.Runnable
            public final void run() {
                UserSession userSession2 = userSession;
                bd6.DYU(AbstractC209669Pc.A03(bitmap, c206409Bx, userSession2, C50472Tr.A01(), AbstractC917048o.A04("direct_temp_photo", ".jpg"), i, z));
            }
        });
    }
}
