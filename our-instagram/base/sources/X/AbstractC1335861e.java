package X;

import android.content.Context;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.WeakHashMap;

@Deprecated
/* renamed from: X.61e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1335861e {
    public static final java.util.Set A00 = Collections.newSetFromMap(new WeakHashMap());

    public Context A03() {
        return ((C1335761d) this).A00.A01;
    }

    public Looper A04() {
        return ((C1335761d) this).A00.A02;
    }

    public AbstractC60658RGk A06(AbstractC60658RGk abstractC60658RGk) {
        C61Q.A01(((C1335761d) this).A00, abstractC60658RGk, 0);
        return abstractC60658RGk;
    }

    public AbstractC60658RGk A07(AbstractC60658RGk abstractC60658RGk) {
        C61Q.A01(((C1335761d) this).A00, abstractC60658RGk, 1);
        return abstractC60658RGk;
    }

    public InterfaceC1340663q A05(C61S c61s) {
        throw new UnsupportedOperationException();
    }

    public void A08() {
        throw new UnsupportedOperationException("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    }

    public void A09() {
        throw new UnsupportedOperationException("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    }

    public void A0A() {
        throw new UnsupportedOperationException();
    }

    public void A0B(C69E c69e) {
        throw new UnsupportedOperationException("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    }

    public void A0C(C69E c69e) {
        throw new UnsupportedOperationException("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    }

    public void A0D(C69G c69g) {
        throw new UnsupportedOperationException("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    }

    public boolean A0F() {
        throw new UnsupportedOperationException("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    }

    public boolean A0G(InterfaceC65249Tgf interfaceC65249Tgf) {
        throw new UnsupportedOperationException();
    }

    public void A0E(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        throw C00O.createAndThrow();
    }
}
