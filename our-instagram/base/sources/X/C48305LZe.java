package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.LZe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48305LZe implements InterfaceC66482zP {
    public final int A00;
    public final VDG A01;
    public final ImageUrl A02;
    public final String A03;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return false;
    }

    public C48305LZe(L2R l2r) {
        this.A03 = l2r.A03;
        this.A02 = l2r.A02;
        this.A01 = l2r.A01;
        this.A00 = l2r.A00;
    }
}
