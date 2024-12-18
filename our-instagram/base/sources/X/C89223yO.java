package X;

import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3yO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89223yO implements InterfaceC89213yN, InterfaceC89203yM {
    public C89243yQ A00;
    public final InterfaceC89203yM A01;
    public final ScheduledExecutorService A02;

    public C89223yO(InterfaceC89203yM interfaceC89203yM, ScheduledExecutorService scheduledExecutorService) {
        C14360o3.A0B(scheduledExecutorService, 1);
        this.A02 = scheduledExecutorService;
        this.A01 = interfaceC89203yM;
    }

    @Override // X.InterfaceC89213yN
    public final void DJK(String str, int i, Map map) {
        C89243yQ c89243yQ;
        C14360o3.A0B(str, 0);
        InterfaceC89203yM interfaceC89203yM = this.A01;
        if (interfaceC89203yM.CcH(str)) {
            if (i == 0 && (c89243yQ = this.A00) != null) {
                i = 1;
                if (c89243yQ.A00.hasKey(str)) {
                    i = 2;
                }
            }
            interfaceC89203yM.DJK(str, i, null);
        }
    }

    @Override // X.InterfaceC89213yN
    public final void DMI(final String str, int i, Map map) {
        C14360o3.A0B(str, 0);
        this.A01.DMI(str, i, null);
        final C89243yQ c89243yQ = this.A00;
        if (c89243yQ != null) {
            this.A02.schedule(new Runnable() { // from class: X.4fQ
                @Override // java.lang.Runnable
                public final void run() {
                    C89243yQ c89243yQ2 = C89243yQ.this;
                    String str2 = str;
                    long itemSizeBytes = c89243yQ2.A00.getItemSizeBytes(str2);
                    if (itemSizeBytes > 0) {
                        this.D8x(str2, "__key_size", String.valueOf(itemSizeBytes));
                    }
                }
            }, 30L, TimeUnit.SECONDS);
        }
    }

    @Override // X.InterfaceC89213yN
    public final void Deo(int i, int i2, String str, Map map) {
        C14360o3.A0B(str, 0);
        this.A01.Deo(i, i2, str, null);
    }

    @Override // X.InterfaceC89203yM
    public final void D8x(String str, String str2, String str3) {
        this.A01.D8x(str, "__key_size", str3);
    }

    @Override // X.InterfaceC89203yM
    public final boolean CcH(String str) {
        throw C00O.createAndThrow();
    }
}
