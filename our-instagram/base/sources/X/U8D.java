package X;

import android.database.DataSetObserver;

/* loaded from: classes11.dex */
public final class U8D extends DataSetObserver {
    public final /* synthetic */ WPW A00;

    public U8D(WPW wpw) {
        this.A00 = wpw;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        WPW wpw = this.A00;
        if (wpw.A09.isShowing()) {
            wpw.show();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.A00.dismiss();
    }
}
