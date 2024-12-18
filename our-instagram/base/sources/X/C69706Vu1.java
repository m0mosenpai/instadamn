package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.Vu1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69706Vu1 {
    public UOT A00;
    public UOX A01;
    public C68664Va0 A02;
    public C68907Ve7 A03;
    public final C69404Vmo A04;

    public final C68664Va0 A00() {
        C68664Va0 c68664Va0 = this.A02;
        if (c68664Va0 == null) {
            UOT uot = this.A00;
            if (uot == null) {
                C69404Vmo c69404Vmo = this.A04;
                uot = new UOT(c69404Vmo.A00, c69404Vmo.A03, c69404Vmo.A05);
                this.A00 = uot;
            }
            C68664Va0 c68664Va02 = new C68664Va0(uot);
            this.A02 = c68664Va02;
            return c68664Va02;
        }
        return c68664Va0;
    }

    public final C68907Ve7 A01() {
        C68907Ve7 c68907Ve7 = this.A03;
        if (c68907Ve7 == null) {
            UOX uox = this.A01;
            if (uox == null) {
                uox = null;
                try {
                    Constructor<?> constructor = Class.forName("com.facebook.imagepipeline.memory.NativeMemoryChunkPool").getConstructor(C1KI.class, Vh3.class, XF3.class);
                    C69404Vmo c69404Vmo = this.A04;
                    UOX uox2 = (UOX) constructor.newInstance(c69404Vmo.A00, c69404Vmo.A02, c69404Vmo.A04);
                    this.A01 = uox2;
                    uox = uox2;
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                    C0I2.A05("PoolFactory", "", e);
                    this.A01 = null;
                }
            }
            String A0O = AnonymousClass001.A0O("failed to get pool for chunk type: ", 0);
            if (uox != null) {
                C68907Ve7 c68907Ve72 = new C68907Ve7(A00(), uox);
                this.A03 = c68907Ve72;
                return c68907Ve72;
            }
            throw new NullPointerException(String.valueOf(A0O));
        }
        return c68907Ve7;
    }

    public C69706Vu1(C69404Vmo c69404Vmo) {
        this.A04 = c69404Vmo;
    }
}
