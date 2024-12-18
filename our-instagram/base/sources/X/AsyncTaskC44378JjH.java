package X;

import android.os.AsyncTask;

/* renamed from: X.JjH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class AsyncTaskC44378JjH extends AsyncTask {
    public final /* synthetic */ C65887Tvr A00;
    public final /* synthetic */ InterfaceC50414MNq A01;

    public AsyncTaskC44378JjH(C65887Tvr c65887Tvr, InterfaceC50414MNq interfaceC50414MNq) {
        this.A00 = c65887Tvr;
        this.A01 = interfaceC50414MNq;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        try {
            return this.A00.A00();
        } catch (Exception e) {
            android.util.Log.e("Palette", "Exception thrown during async generate", e);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        this.A01.DJ9((C65888Tvs) obj);
    }
}
