package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.AbF, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23499AbF implements X9U {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C84D A01;
    public final /* synthetic */ C49602Pt A02;

    public C23499AbF(Context context, C84D c84d, C49602Pt c49602Pt) {
        this.A01 = c84d;
        this.A00 = context;
        this.A02 = c49602Pt;
    }

    @Override // X.X9U
    public final File createTempFile(String str, String str2) {
        C14360o3.A0B(str, 0);
        if (C18U.A06(C06090Tz.A05, this.A01.A00, 36312028637430654L)) {
            return File.createTempFile(str, str2, this.A00.getCacheDir());
        }
        File createTempFile = File.createTempFile(str, str2, this.A02.C5c());
        C14360o3.A07(createTempFile);
        return createTempFile;
    }
}
