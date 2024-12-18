package X;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: X.AGd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23093AGd {
    public static final /* synthetic */ C23093AGd A00 = new Object();

    public final String A00(Context context, int i, int i2, int i3) {
        C14360o3.A0B(context, 0);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j = i2;
        long j2 = i3;
        String string = context.getString(i, Long.valueOf(timeUnit.toMinutes(j)), Long.valueOf(timeUnit.toSeconds(j) % 60), Long.valueOf(timeUnit.toMinutes(j2)), Long.valueOf(timeUnit.toSeconds(j2) % 60));
        C14360o3.A07(string);
        return string;
    }
}
