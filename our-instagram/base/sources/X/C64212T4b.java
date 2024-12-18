package X;

import com.google.android.exoplayer2.util.Util;
import java.io.InputStream;

/* renamed from: X.T4b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64212T4b implements InterfaceC92094Ap {
    @Override // X.InterfaceC92094Ap
    public final /* bridge */ /* synthetic */ Object E3N(android.net.Uri uri, InputStream inputStream) {
        return Long.valueOf(Util.A0A(AbstractC58320PtC.A0h(inputStream).readLine()));
    }
}
