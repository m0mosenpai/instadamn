package X;

import android.content.Context;
import com.facebook.R;
import java.util.List;

/* renamed from: X.6ZB, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6ZB {
    public static final int A01(Context context, int i) {
        C14360o3.A0B(context, 0);
        if (i != context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_sticker_background))) {
            return context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_button_disabled_panavision));
        }
        return AbstractC13950nL.A05(i);
    }

    public static final C84823qW A02(InterfaceC41201vU interfaceC41201vU) {
        List BlY;
        if (!interfaceC41201vU.CY4() || (BlY = interfaceC41201vU.BlY(EnumC75383a5.A14)) == null) {
            return null;
        }
        return (C84823qW) AbstractC001800i.A0O(BlY, 0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.AlD] */
    public static final AlD A03(InterfaceC41201vU interfaceC41201vU) {
        URE ure;
        C14360o3.A0B(interfaceC41201vU, 0);
        C84823qW A02 = A02(interfaceC41201vU);
        if (A02 != null && (ure = A02.A0O) != null) {
            ?? obj = new Object();
            obj.A00 = ure;
            return obj;
        }
        return null;
    }

    public static final int A00(Context context, int i) {
        int i2;
        if (i != context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_sticker_background))) {
            i2 = AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text_on_media);
        } else if (C14640oc.A0H()) {
            i2 = R.color.igds_secondary_text;
        } else {
            return -6710887;
        }
        return context.getColor(i2);
    }
}
