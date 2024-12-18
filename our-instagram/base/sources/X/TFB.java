package X;

import android.content.ContentResolver;

/* loaded from: classes10.dex */
public final class TFB implements InterfaceC23811Eo {
    public final long A00;
    public final ContentResolver A01;
    public final android.net.Uri A02;
    public final String A03;
    public final String A04;

    @Override // X.InterfaceC23811Eo
    public final boolean isStreaming() {
        return true;
    }

    @Override // X.InterfaceC23811Eo
    public final void AAc(C58613Pyh c58613Pyh, String str) {
        c58613Pyh.A00(new TFL(this.A01, this.A02, this.A04, this.A03, this.A00), str);
    }

    public TFB(ContentResolver contentResolver, android.net.Uri uri, String str, String str2, long j) {
        this.A01 = contentResolver;
        this.A02 = uri;
        this.A04 = str;
        this.A03 = str2;
        this.A00 = j;
    }
}
