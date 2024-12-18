package X;

import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: X.Sst, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63739Sst implements InterfaceC65470Tkn {
    public final C63360SiJ A00;

    @Override // X.InterfaceC65470Tkn
    public final /* bridge */ /* synthetic */ InterfaceC65558Tme ANo(C63729Ssj c63729Ssj, Object obj, int i, int i2) {
        C63360SiJ c63360SiJ = this.A00;
        List list = c63360SiJ.A04;
        return C63360SiJ.A01(c63729Ssj, C63360SiJ.A0A, c63360SiJ, new C63853Sul(c63360SiJ.A02, (ByteBuffer) obj, list), i, i2);
    }

    @Override // X.InterfaceC65470Tkn
    public final /* bridge */ /* synthetic */ boolean CKc(C63729Ssj c63729Ssj, Object obj) {
        C62997SaL c62997SaL = C63360SiJ.A05;
        return true;
    }

    public C63739Sst(C63360SiJ c63360SiJ) {
        this.A00 = c63360SiJ;
    }
}
