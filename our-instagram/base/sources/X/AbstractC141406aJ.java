package X;

import android.content.Context;
import com.instagram.feed.media.CreativeConfigIntf;

/* renamed from: X.6aJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC141406aJ {
    public static final boolean A00(Context context, CreativeConfigIntf creativeConfigIntf) {
        boolean z = false;
        if (creativeConfigIntf != null) {
            z = true;
            if (!AbstractC121575f6.A0B(creativeConfigIntf, EnumC138476Pd.A08) || !AnonymousClass820.A01(context)) {
                return AbstractC121575f6.A0B(creativeConfigIntf, EnumC138476Pd.A0B, EnumC138476Pd.A04, EnumC138476Pd.A0F, EnumC138476Pd.A0E, EnumC138476Pd.A09);
            }
        }
        return z;
    }
}
