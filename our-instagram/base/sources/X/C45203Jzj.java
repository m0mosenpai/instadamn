package X;

import com.instagram.model.direct.stickerstore.DirectStoreSticker;

/* renamed from: X.Jzj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45203Jzj extends C0T6 implements InterfaceC66482zP {
    public boolean A00;
    public final C51751Mta A01;
    public final DirectStoreSticker A02;

    public C45203Jzj(C51751Mta c51751Mta, DirectStoreSticker directStoreSticker) {
        C14360o3.A0B(directStoreSticker, 1);
        this.A02 = directStoreSticker;
        this.A01 = c51751Mta;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45203Jzj) {
                C45203Jzj c45203Jzj = (C45203Jzj) obj;
                if (!C14360o3.A0K(this.A02, c45203Jzj.A02) || !C14360o3.A0K(this.A01, c45203Jzj.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02.A04;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A02) + AbstractC167017dG.A0M(this.A01);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
