package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import java.io.File;

/* renamed from: X.Q2e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class AsyncTaskC58701Q2e extends AsyncTask {
    public Context A00;
    public Bitmap A01;
    public android.net.Uri A02;
    public String A03;
    public boolean A04;
    public boolean A05;

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if ("https".equals(r1) != false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0113 A[Catch: IOException -> 0x012e, TryCatch #6 {IOException -> 0x012e, blocks: (B:2:0x0000, B:4:0x0016, B:7:0x0022, B:9:0x002c, B:20:0x005f, B:22:0x0062, B:23:0x0065, B:78:0x00ce, B:41:0x006f, B:43:0x0072, B:51:0x0077, B:52:0x007a, B:53:0x007e, B:55:0x0084, B:57:0x008a, B:59:0x008f, B:60:0x0094, B:73:0x00c6, B:77:0x00cb, B:84:0x00b1, B:87:0x00d4, B:89:0x00de, B:91:0x00ec, B:93:0x00fa, B:95:0x0113, B:98:0x00f6, B:101:0x011f, B:102:0x0121, B:104:0x0125, B:71:0x00b8), top: B:1:0x0000, inners: #2, #3 }] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r13) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AsyncTaskC58701Q2e.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        InterfaceC65485Tl2 interfaceC65485Tl2;
        Throwable th = (Throwable) obj;
        C63181Seg c63181Seg = C63181Seg.A06;
        Context context = this.A00;
        android.net.Uri uri = this.A02;
        String str = this.A03;
        Bitmap bitmap = this.A01;
        synchronized (c63181Seg.A05) {
            interfaceC65485Tl2 = (InterfaceC65485Tl2) c63181Seg.A03.remove(uri);
        }
        if (interfaceC65485Tl2 != null) {
            if (th == null) {
                if (bitmap == null) {
                    th = new Throwable(AbstractC43591JPw.A00(546));
                } else {
                    interfaceC65485Tl2.Czb(context, bitmap, str);
                    return;
                }
            }
            interfaceC65485Tl2.DPl(str, th);
            return;
        }
        File file = (File) c63181Seg.A02.remove(uri);
        if (file == null) {
            return;
        }
        file.delete();
    }
}
