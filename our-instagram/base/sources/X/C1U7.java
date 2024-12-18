package X;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1U7, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1U7 {
    public static final AtomicReference A05 = new AtomicReference();
    public final C1R8 A00;
    public final Locale A01;
    public final Context A02;
    public volatile C1U8 A03;
    public volatile C1U8 A04;

    public abstract MappedByteBuffer A01();

    public static C1UU A00(C1U7 c1u7, String str) {
        C1UU c1uu;
        int i;
        AbstractC09800fd.A01("FrscLanguagePackLoaderImpl.loadStrings", 933060308);
        try {
            AbstractC09800fd.A01(str, -93476580);
            try {
                InputStream open = c1u7.A02.getAssets().open(AnonymousClass001.A0g("strings/", str, ".frsc"));
                try {
                    c1uu = new C1UU(new C1US(str, ByteBuffer.wrap(C15V.A00(open))), c1u7.A00, "frsc");
                    if (open != null) {
                        open.close();
                    }
                    AbstractC09800fd.A00(380949576);
                    i = 1406740184;
                } finally {
                }
            } catch (IOException unused) {
                c1uu = null;
                AbstractC09800fd.A00(-2023221351);
                i = -565289211;
            } catch (Throwable th) {
                AbstractC09800fd.A00(-1886043128);
                throw th;
            }
            AbstractC09800fd.A00(i);
            return c1uu;
        } catch (Throwable th2) {
            AbstractC09800fd.A00(1940167426);
            throw th2;
        }
    }

    public C1U7(Context context, C1R8 c1r8, Locale locale) {
        this.A02 = context;
        this.A01 = locale;
        this.A00 = c1r8;
    }
}
