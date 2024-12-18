package X;

import android.content.Context;
import java.io.File;
import java.util.UUID;

/* renamed from: X.1At, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23141At implements InterfaceC12870lZ {
    public static C23141At A01;
    public static final C23151Au A02 = new Object();
    public final File A00;

    public C23141At(Context context) {
        this.A00 = C23161Av.A00(context).AXd(null, 2096512767);
    }

    public final boolean A00(File file) {
        if (!C218914p.A08() && !C0JK.A01().A09() && !file.isFile()) {
            if (!file.renameTo(new File(this.A00, UUID.randomUUID().toString())) && !AbstractC03440Gx.A02(file)) {
                return false;
            }
            return true;
        }
        return AbstractC03440Gx.A02(file);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(373480272);
        C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.9iR
            {
                super(65, 5, true, false);
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC03440Gx.A01(C23141At.this.A00);
            }
        });
        C0f9.A0A(-964227816, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(-1900303012, C0f9.A03(-1854555647));
    }
}
