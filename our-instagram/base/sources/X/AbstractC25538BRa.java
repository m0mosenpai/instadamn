package X;

import android.content.Context;

/* renamed from: X.BRa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25538BRa {
    public static final EnumC25546BRi A00(Context context, String str) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(context, 1);
        EnumC25546BRi enumC25546BRi = EnumC25546BRi.A07;
        if (!str.equals("VIDEO_LAYOUT")) {
            enumC25546BRi = EnumC25546BRi.A08;
            if (!str.equals("DUAL") || !AnonymousClass820.A01(context)) {
                return null;
            }
        }
        return enumC25546BRi;
    }
}
