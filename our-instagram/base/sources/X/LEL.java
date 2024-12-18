package X;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class LEL {
    public File A00;
    public final AtomicBoolean A01 = AbstractC166997dE.A17();

    public LEL(File file) {
        this.A00 = file;
    }

    public static final Object A00(String str, InterfaceC16820sZ interfaceC16820sZ) {
        try {
            return interfaceC16820sZ.invoke();
        } catch (IOException e) {
            C0K8.A0F("IgMsysLogcatDumper", AnonymousClass001.A0R("Failed to ", str), e);
            return null;
        }
    }
}
