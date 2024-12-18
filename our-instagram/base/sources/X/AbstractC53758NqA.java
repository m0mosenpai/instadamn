package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.NqA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53758NqA {
    public static WDI A00(Context context, File file, boolean z) {
        MYB A02 = AbstractC55147OdA.A02(context, android.net.Uri.fromFile(file).toString(), z);
        if (A02 != null) {
            WDI A00 = WDI.A00(A02, W94.A05, null);
            A00.A01 = (int) A02.A06;
            return A00;
        }
        return null;
    }
}
