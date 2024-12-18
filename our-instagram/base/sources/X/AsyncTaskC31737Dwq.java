package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import com.facebook.R;

/* renamed from: X.Dwq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class AsyncTaskC31737Dwq extends AsyncTask {
    public boolean A00;
    public final int A01;
    public final android.net.Uri A02;
    public final /* synthetic */ C36325G0u A03;

    public AsyncTaskC31737Dwq(android.net.Uri uri, C36325G0u c36325G0u, int i) {
        this.A03 = c36325G0u;
        this.A01 = i;
        this.A02 = uri;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r4.getHeight() >= 150) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (X.VPW.A00(r3.A07) == false) goto L8;
     */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r8) {
        /*
            r7 = this;
            X.G0u r3 = r7.A03
            X.ELT r2 = r3.A02
            r6 = 0
            if (r2 == 0) goto L1a
            int r5 = r7.A01
            if (r5 != 0) goto L14
            com.instagram.common.session.UserSession r0 = r3.A07
            boolean r1 = X.VPW.A00(r0)
            r0 = 1
            if (r1 != 0) goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L1b
            r0 = 1
            r7.A00 = r0
        L1a:
            return r6
        L1b:
            android.content.Context r2 = r2.requireContext()     // Catch: java.lang.Exception -> L5b
            com.instagram.common.session.UserSession r1 = r3.A07     // Catch: java.lang.Exception -> L5b
            android.net.Uri r0 = r7.A02     // Catch: java.lang.Exception -> L5b
            android.graphics.Bitmap r4 = X.C55620On5.A00(r2, r0, r1, r5)     // Catch: java.lang.Exception -> L5b
            if (r4 == 0) goto L1a
            r3 = 0
            android.graphics.Bitmap r0 = X.C1NC.A06(r4)     // Catch: java.lang.Exception -> L5b
            if (r4 == r0) goto L31
            r3 = r0
        L31:
            int r0 = r4.getWidth()     // Catch: java.lang.Exception -> L5b
            r2 = 1
            r1 = 1080(0x438, float:1.513E-42)
            if (r0 > r1) goto L4e
            int r0 = r4.getHeight()     // Catch: java.lang.Exception -> L5b
            if (r0 > r1) goto L4e
            int r0 = r4.getWidth()     // Catch: java.lang.Exception -> L5b
            r1 = 150(0x96, float:2.1E-43)
            if (r0 < r1) goto L4e
            int r0 = r4.getHeight()     // Catch: java.lang.Exception -> L5b
            if (r0 >= r1) goto L52
        L4e:
            android.graphics.Bitmap r3 = X.C0fK.A00(r4, r1, r1, r2)     // Catch: java.lang.Exception -> L5b
        L52:
            if (r3 == 0) goto L5a
            if (r5 == 0) goto L59
            r4.recycle()     // Catch: java.lang.Exception -> L5b
        L59:
            return r3
        L5a:
            return r4
        L5b:
            r2 = move-exception
            java.lang.String r1 = "AddAvatarHelper"
            java.lang.String r0 = "An error occurred fetching your image"
            X.C0K8.A0F(r1, r0, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AsyncTaskC31737Dwq.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C36325G0u c36325G0u = this.A03;
        ELT elt = c36325G0u.A02;
        if (elt != null && elt.mView != null) {
            if (bitmap != null) {
                FIF fif = new FIF(bitmap, this.A02, this.A01);
                elt.A03(fif.A00);
                c36325G0u.A00 = fif;
            } else if (this.A00) {
                c36325G0u.A00 = null;
                Drawable drawable = elt.requireContext().getDrawable(R.drawable.profile_anonymous_user);
                if (drawable != null) {
                    elt.A00 = null;
                    elt.A03.A00 = null;
                    elt.A03(((BitmapDrawable) drawable).getBitmap());
                } else {
                    throw AbstractC25227BEk.A0n();
                }
            } else {
                C193328hC A00 = AbstractC35254Fgn.A00(elt.requireContext());
                A00.A09(2131970236);
                AbstractC166987dD.A1W(A00);
            }
        }
        super.onPostExecute(bitmap);
    }
}
