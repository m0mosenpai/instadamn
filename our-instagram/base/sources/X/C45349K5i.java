package X;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* renamed from: X.K5i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45349K5i extends C1F2 {
    public final Context A00;
    public final boolean A01;

    @Override // X.C1F2, X.C1F3
    public final void AIh() {
        Context context = this.A00;
        if (context != null && this.A01) {
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(android.net.Uri.fromFile(this));
            context.sendBroadcast(intent);
        }
    }

    @Override // X.C1F2, X.C1F3
    public final OutputStream CHy() {
        return new FileOutputStream(this);
    }

    public C45349K5i(Context context, File file, boolean z) {
        super(file.getPath());
        this.A00 = context;
        this.A01 = z;
    }
}
