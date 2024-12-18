package X;

import android.os.AsyncTask;

/* renamed from: X.Q2g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractAsyncTaskC58703Q2g extends AsyncTask {
    public final InterfaceC65352Tig A00;

    /* JADX WARN: Removed duplicated region for block: B:50:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A00(java.lang.Object... r14) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractAsyncTaskC58703Q2g.A00(java.lang.Object[]):void");
    }

    public AbstractAsyncTaskC58703Q2g(Q21 q21) {
        InterfaceC65352Tig interfaceC65352Tig = q21.A00;
        if (interfaceC65352Tig == null) {
            interfaceC65352Tig = new T06(q21);
            q21.A00 = interfaceC65352Tig;
        }
        this.A00 = interfaceC65352Tig;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        try {
            A00(objArr);
            return null;
        } catch (RuntimeException e) {
            this.A00.handleException(e);
            return null;
        }
    }
}
