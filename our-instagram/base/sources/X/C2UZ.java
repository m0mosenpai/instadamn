package X;

import android.content.Context;
import com.google.common.io.Closeables;
import java.io.InputStream;

/* renamed from: X.2UZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2UZ {
    public static C2UZ A02;
    public Context A00;
    public C24261Gv A01;

    public static C24261Gv A00(C2UZ c2uz) {
        C24261Gv c24261Gv = c2uz.A01;
        if (c24261Gv == null) {
            C1N3 A00 = AbstractC25551Ml.A00(c2uz.A00, C1Mk.A06, "subtitle", 10.0f, 5242880L, true);
            C24251Gu c24251Gu = new C24251Gu();
            c24251Gu.A03 = A00.A01;
            c24251Gu.A01 = A00.A00;
            C24261Gv A01 = c24251Gu.A01();
            c2uz.A01 = A01;
            return A01;
        }
        return c24261Gv;
    }

    public final android.net.Uri A01(android.net.Uri uri) {
        C59732oG AXI = A00(this).AXI(Integer.toHexString(uri.toString().hashCode()));
        boolean z = false;
        if (AXI.A00 != null) {
            z = true;
        }
        if (z) {
            try {
                return AbstractC08820cl.A03(((AbstractC60252p8) AXI.A00()).A00());
            } catch (Exception e) {
                C0w9.A06("IgVideoSubtitleCache", "failed to get cache file path", e);
                return null;
            } finally {
                Closeables.A01((InputStream) AXI.A00());
            }
        }
        return null;
    }
}
