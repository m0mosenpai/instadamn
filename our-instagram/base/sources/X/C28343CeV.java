package X;

import android.os.Build;

/* renamed from: X.CeV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28343CeV {
    public static final /* synthetic */ C28343CeV A00 = new Object();

    public static final InterfaceC31112Dlu A00() {
        InterfaceC31112Dlu interfaceC31112Dlu;
        if (Build.VERSION.SDK_INT == 28) {
            interfaceC31112Dlu = C28722CmE.A00;
        } else {
            interfaceC31112Dlu = C28723CmF.A00;
        }
        return interfaceC31112Dlu;
    }
}
