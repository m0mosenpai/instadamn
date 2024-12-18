package X;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: X.Stx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63803Stx implements InterfaceC65476Tkt {
    public final /* synthetic */ C63825SuJ A00;

    public C63803Stx(C63825SuJ c63825SuJ) {
        this.A00 = c63825SuJ;
    }

    @Override // X.InterfaceC65476Tkt
    public final /* bridge */ /* synthetic */ Object AK3(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }

    @Override // X.InterfaceC65476Tkt
    public final Class Avg() {
        return InputStream.class;
    }
}
