package X;

import android.media.MediaFormat;

/* renamed from: X.5PA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5PA implements C4Ws, InterfaceC96064Tp, C5PB {
    public C4Ws A00;
    public C5PB A01;

    @Override // X.InterfaceC96064Tp
    public final void CK0(int i, Object obj) {
        if (i != 7) {
            if (i == 8) {
                this.A01 = (C5PB) obj;
                return;
            }
            return;
        }
        this.A00 = (C4Ws) obj;
    }

    @Override // X.C4Ws
    public final void Dz6(MediaFormat mediaFormat, C4B6 c4b6, long j, long j2) {
        C4Ws c4Ws = this.A00;
        if (c4Ws != null) {
            c4Ws.Dz6(mediaFormat, c4b6, j, j2);
        }
    }
}
