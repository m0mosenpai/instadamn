package X;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.4PN, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4PN {
    public static final C4PO A02;
    public InputStream A00;
    public OutputStream A01;

    public final void A00(byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            InputStream inputStream = this.A00;
            if (inputStream != null) {
                try {
                    int read = inputStream.read(bArr, i2, i3);
                    if (read >= 0) {
                        if (read > 0) {
                            i2 += read;
                        } else {
                            throw new RuntimeException(AnonymousClass001.A0n("Cannot read. Remote side has closed. Tried to read ", " bytes, but only got ", " bytes.", i, i2));
                        }
                    } else {
                        throw new RuntimeException();
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new RuntimeException("Cannot read from null inputStream");
            }
        }
    }

    public final void A01(byte[] bArr, int i) {
        OutputStream outputStream = this.A01;
        if (outputStream != null) {
            try {
                outputStream.write(bArr, 0, i);
                return;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        throw new RuntimeException("Cannot write to null outputStream");
    }

    static {
        InterfaceC95004Pj interfaceC95004Pj;
        InterfaceC95004Pj interfaceC95004Pj2;
        try {
            Object invoke = C4PO.A02.invoke(null, C4PN.class.getName());
            Class<?> cls = invoke.getClass();
            Method declaredMethod = cls.getDeclaredMethod("error", String.class);
            Method declaredMethod2 = cls.getDeclaredMethod("warn", String.class);
            interfaceC95004Pj = new YCC(invoke, declaredMethod);
            interfaceC95004Pj2 = new YCD(invoke, declaredMethod2);
        } catch (ExceptionInInitializerError | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | NullPointerException | InvocationTargetException unused) {
            interfaceC95004Pj = new InterfaceC95004Pj() { // from class: X.4Pi
            };
            interfaceC95004Pj2 = new InterfaceC95004Pj() { // from class: X.4Pk
            };
        }
        A02 = new C4PO(interfaceC95004Pj, interfaceC95004Pj2);
    }

    public C4PN(InputStream inputStream) {
        this.A01 = null;
        this.A00 = inputStream;
    }

    public C4PN(OutputStream outputStream) {
        this.A00 = null;
        this.A01 = outputStream;
    }

    public C4PN() {
        this.A00 = null;
        this.A01 = null;
    }
}
