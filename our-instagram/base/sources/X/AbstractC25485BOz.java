package X;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: X.BOz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25485BOz {
    public static Bitmap A00;
    public static final Paint A01;
    public static final Map A02 = new EnumMap(BP0.class);

    static {
        Paint A0P = AbstractC166997dE.A0P();
        AbstractC166997dE.A1D(A0P, PorterDuff.Mode.CLEAR);
        AbstractC166987dD.A1R(A0P);
        A01 = A0P;
    }
}
