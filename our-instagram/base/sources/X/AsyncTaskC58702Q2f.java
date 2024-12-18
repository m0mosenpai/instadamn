package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.AsyncTask;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.Q2f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class AsyncTaskC58702Q2f extends AsyncTask {
    public int A00;
    public int A01;
    public Context A02;
    public Bitmap A03;
    public RectF A04;
    public android.net.Uri A05;

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        try {
            this.A03 = AbstractC61774RtU.A00(this.A03, this.A00);
            float width = r0.getWidth() / this.A01;
            RectF rectF = this.A04;
            float f = rectF.left * width;
            float f2 = rectF.top * width;
            float width2 = rectF.width() * width;
            float height = rectF.height() * width;
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if ((f + width2) - 1.0f >= this.A03.getWidth()) {
                width2 = this.A03.getWidth() - f;
            }
            if ((f2 + height) - 1.0f >= this.A03.getHeight()) {
                height = this.A03.getHeight() - f2;
            }
            Bitmap bitmap = this.A03;
            C0fK.A03(bitmap);
            this.A03 = Bitmap.createBitmap(bitmap, (int) f, (int) f2, (int) width2, (int) height);
            OutputStream openOutputStream = this.A02.getContentResolver().openOutputStream(this.A05);
            if (openOutputStream != null) {
                C0fK.A02(Bitmap.CompressFormat.JPEG, this.A03, openOutputStream, 100);
                openOutputStream.close();
            }
            this.A03.recycle();
            return null;
        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
            return e;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Context context;
        Intent A0E;
        Throwable th = (Throwable) obj;
        if (th == null) {
            AbstractC63326Sha.A00 = this.A00;
            RectF rectF = this.A04;
            if (rectF == null) {
                AbstractC63326Sha.A01 = null;
            } else {
                RectF rectF2 = AbstractC63326Sha.A01;
                if (rectF2 == null) {
                    rectF2 = AbstractC166987dD.A0X();
                    AbstractC63326Sha.A01 = rectF2;
                }
                rectF2.set(rectF);
            }
            context = this.A02;
            android.net.Uri uri = this.A05;
            A0E = AbstractC58318PtA.A0E("crop_action_crop_completed");
            A0E.putExtra("extra_uri", uri);
        } else {
            context = this.A02;
            A0E = AbstractC58318PtA.A0E("crop_action_crop_completed");
            A0E.putExtra("extra_error", th);
        }
        C0b3.A00().A06().A0C(context, A0E);
    }
}
