package X;

import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.PTo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57075PTo implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Bitmap A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ InterfaceC57942Pmm A04;
    public final /* synthetic */ File A05;

    public RunnableC57075PTo(Bitmap bitmap, UserSession userSession, InterfaceC57942Pmm interfaceC57942Pmm, File file, int i, int i2) {
        this.A03 = userSession;
        this.A02 = bitmap;
        this.A01 = i;
        this.A05 = file;
        this.A04 = interfaceC57942Pmm;
        this.A00 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UserSession userSession = this.A03;
        Bitmap bitmap = this.A02;
        int i = this.A01;
        String A00 = AbstractC53948NtL.A00(bitmap, userSession, this.A05, i);
        bitmap.recycle();
        C55186Odr.A01.post(new PTG(this.A04, A00, i, this.A00));
    }
}
