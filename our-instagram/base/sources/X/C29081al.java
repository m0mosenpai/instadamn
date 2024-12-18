package X;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: X.1al, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29081al implements InterfaceC29101an {
    public boolean A00;
    public final Context A01;
    public final AbstractC28901aT A02;
    public final String A03;
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(new C9EV(this, 42));
    public final boolean A05;
    public final boolean A06;

    @Override // X.InterfaceC29101an
    public final InterfaceC37481ol CHx() {
        return ((C30521dD) this.A04.getValue()).A00();
    }

    @Override // X.InterfaceC29101an
    public final void EhP(boolean z) {
        InterfaceC09390do interfaceC09390do = this.A04;
        if (interfaceC09390do.CWa()) {
            SQLiteOpenHelper sQLiteOpenHelper = (SQLiteOpenHelper) interfaceC09390do.getValue();
            C14360o3.A0B(sQLiteOpenHelper, 0);
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z);
        }
        this.A00 = z;
    }

    @Override // X.InterfaceC29101an, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC09390do interfaceC09390do = this.A04;
        if (interfaceC09390do.CWa()) {
            ((C30521dD) interfaceC09390do.getValue()).close();
        }
    }

    public C29081al(Context context, AbstractC28901aT abstractC28901aT, String str, boolean z, boolean z2) {
        this.A01 = context;
        this.A03 = str;
        this.A02 = abstractC28901aT;
        this.A06 = z;
        this.A05 = z2;
    }
}
