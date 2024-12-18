package X;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* loaded from: classes10.dex */
public final class Q24 extends ContentObserver {
    public final /* synthetic */ Q51 A00;

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q24(Q51 q51) {
        super(new Handler());
        this.A00 = q51;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Cursor cursor;
        Q51 q51 = this.A00;
        if (q51.A05 && (cursor = q51.A02) != null && !cursor.isClosed()) {
            q51.A06 = q51.A02.requery();
        }
    }
}
