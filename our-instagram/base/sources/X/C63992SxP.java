package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.AsyncTask;
import android.webkit.MimeTypeMap;
import com.facebook.fxcrop.SimpleCropView;
import java.io.File;

/* renamed from: X.SxP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63992SxP implements InterfaceC65485Tl2 {
    public final /* synthetic */ SimpleCropView A00;

    public C63992SxP(SimpleCropView simpleCropView) {
        this.A00 = simpleCropView;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.Q2f, android.os.AsyncTask] */
    @Override // X.InterfaceC65485Tl2
    public final void Czb(Context context, Bitmap bitmap, String str) {
        String fileExtensionFromUrl;
        if ("LOAD_SMALL_BITMAP_FOR_EDITING_PREVIEW".equals(str)) {
            SimpleCropView.A01(bitmap, this.A00);
            return;
        }
        if (!"LOAD_FULL_SIZE_BITMAP_FOR_SAVING".equals(str)) {
            return;
        }
        SimpleCropView simpleCropView = this.A00;
        float f = SimpleCropView.A0C;
        if (simpleCropView.A08 == null) {
            return;
        }
        C54846OMr c54846OMr = new C54846OMr();
        Context context2 = simpleCropView.getContext();
        File cacheDir = context2.getCacheDir();
        android.net.Uri uri = simpleCropView.A08;
        long currentTimeMillis = System.currentTimeMillis();
        if (uri == null) {
            fileExtensionFromUrl = "jpg";
        } else {
            fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
        }
        c54846OMr.A03(EnumC46121KbL.A00.A00(context2), cacheDir, AnonymousClass001.A0r("temp__", ".", fileExtensionFromUrl, currentTimeMillis));
        C53086Ndz A00 = c54846OMr.A00();
        int i = simpleCropView.A02;
        RectF rectF = simpleCropView.A0B;
        int i2 = simpleCropView.A04;
        android.net.Uri fromFile = android.net.Uri.fromFile(A00);
        ?? asyncTask = new AsyncTask();
        asyncTask.A02 = context2;
        asyncTask.A03 = bitmap;
        asyncTask.A00 = i;
        asyncTask.A04 = rectF;
        asyncTask.A01 = i2;
        asyncTask.A05 = fromFile;
        asyncTask.execute(new Void[0]);
    }

    @Override // X.InterfaceC65485Tl2
    public final void DPl(String str, Throwable th) {
        th.printStackTrace();
    }
}
