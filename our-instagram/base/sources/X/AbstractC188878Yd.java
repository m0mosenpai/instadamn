package X;

import android.content.Context;
import kotlin.Deprecated;

@Deprecated(message = "This class has been deprecated, to access the width and height use the TargetViewSizeProvider\n directly.")
/* renamed from: X.8Yd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC188878Yd {
    public static final int A01(Context context) {
        C14360o3.A0B(context, 0);
        if (C57992lC.A03()) {
            return AbstractC58002lE.A01(context).getWidth();
        }
        AbstractC12120kG.A07(AnonymousClass001.A0R("TargetViewSizeUtil", "#getScreenWidth"), "TargetViewSizeProvider has not been initialized", null);
        return AbstractC13880nE.A0A(context);
    }

    public static final int A00(Context context) {
        if (C57992lC.A03()) {
            return AbstractC58002lE.A01(context).getHeight();
        }
        AbstractC12120kG.A07(AnonymousClass001.A0R("TargetViewSizeUtil", "#getScreenHeight"), "TargetViewSizeProvider has not been initialized", null);
        return AbstractC13880nE.A09(context);
    }
}
