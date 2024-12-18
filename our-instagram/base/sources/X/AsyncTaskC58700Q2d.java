package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import com.facebook.fxcropapp.ig.IgCropActivity;
import java.io.IOException;
import java.net.URLConnection;

/* renamed from: X.Q2d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class AsyncTaskC58700Q2d extends AsyncTask {
    public Drawable A00;
    public SB7 A01;
    public String A02;

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        String str = this.A02;
        if (str == null) {
            return AbstractC166987dD.A15("Failed to load icon");
        }
        try {
            URLConnection A16 = AbstractC58320PtC.A16(str);
            AbstractC09810fe.A02(A16, 1716580836);
            this.A00 = new BitmapDrawable(Resources.getSystem(), BitmapFactory.decodeStream(AbstractC09810fe.A00(A16, -2039668637)));
            return null;
        } catch (IOException e) {
            return e;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Drawable drawable;
        if (obj == null && (drawable = this.A00) != null) {
            SB7 sb7 = this.A01;
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            IgCropActivity igCropActivity = sb7.A00;
            float f = IgCropActivity.A02;
            if (igCropActivity.A01 != null && bitmap != null) {
                int i = (int) IgCropActivity.A02;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(igCropActivity.getResources(), C0fK.A00(bitmap, i, i, false));
                bitmapDrawable.mutate();
                bitmapDrawable.setTint(-1);
                igCropActivity.A01.setCompoundDrawablesWithIntrinsicBounds(bitmapDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
                igCropActivity.A01.invalidate();
            }
        }
    }
}
