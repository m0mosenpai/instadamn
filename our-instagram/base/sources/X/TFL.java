package X;

import android.content.ContentResolver;
import java.io.InputStream;

/* loaded from: classes10.dex */
public final class TFL implements InterfaceC65673Tr3 {
    public long A00;
    public final ContentResolver A01;
    public final android.net.Uri A02;
    public final String A03;
    public final String A04;

    @Override // X.InterfaceC65527Tlw
    public final long Ch9() {
        return this.A00;
    }

    @Override // X.InterfaceC65527Tlw
    public final InputStream E2i() {
        return this.A01.openInputStream(this.A02);
    }

    @Override // X.InterfaceC65673Tr3
    public final String getContentType() {
        return this.A03;
    }

    @Override // X.InterfaceC65673Tr3
    public final String getName() {
        return this.A04;
    }

    public TFL(ContentResolver contentResolver, android.net.Uri uri, String str, String str2, long j) {
        AbstractC167017dG.A1P(contentResolver, uri);
        this.A01 = contentResolver;
        this.A02 = uri;
        this.A04 = str;
        this.A03 = str2;
        this.A00 = -1L;
        this.A00 = j;
    }
}
