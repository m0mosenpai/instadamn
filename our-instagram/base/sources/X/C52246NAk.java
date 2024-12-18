package X;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.NAk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52246NAk extends AbstractC70118W4q {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ File A04;

    @Override // X.AbstractC70118W4q
    public final void A03(Exception exc) {
        C14360o3.A0B(exc, 0);
        C0K8.A0F("VideoFrameSaver", "bitmap capture error", exc);
        C0w9.A07("bitmap_capture_error", exc);
    }

    public C52246NAk(File file, int i, int i2, int i3, long j) {
        this.A04 = file;
        this.A01 = i;
        this.A03 = j;
        this.A02 = i2;
        this.A00 = i3;
    }

    @Override // X.AbstractC70118W4q
    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C14360o3.A0B(bitmap, 0);
        try {
            FileOutputStream A0x = MSW.A0x(this.A04);
            try {
                C0K8.A0O("VideoFrameSaver", "saving bitmap on frame %s, ptsUs %s, %s X %s", Integer.valueOf(this.A01), Long.valueOf(this.A03), Integer.valueOf(this.A02), Integer.valueOf(this.A00));
                C0fK.A02(Bitmap.CompressFormat.PNG, bitmap, A0x, 100);
                bitmap.recycle();
                A0x.close();
            } finally {
            }
        } catch (IOException e) {
            C0K8.A0F("VideoFrameSaver", "bitmap disk save error", e);
            C0w9.A07("bitmap_disk_save_error", e);
        }
    }
}
