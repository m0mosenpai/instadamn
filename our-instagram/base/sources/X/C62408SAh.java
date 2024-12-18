package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.SAh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62408SAh {
    public final File A00;

    public C62408SAh(Context context, String str) {
        C14360o3.A0B(context, 1);
        File A00 = C0eS.A00(context, 344748284);
        A00.mkdirs();
        this.A00 = AbstractC58322PtE.A0f("libs_", str, A00);
    }
}
