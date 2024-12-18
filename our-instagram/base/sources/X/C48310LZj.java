package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.LZj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48310LZj implements InterfaceC66482zP {
    public final int A00;
    public final VDG A01;
    public final ImageUrl A02;
    public final String A03;
    public final boolean A04;

    public C48310LZj(VDG vdg, ImageUrl imageUrl, String str, int i, boolean z) {
        this.A03 = str;
        this.A02 = imageUrl;
        this.A01 = vdg;
        this.A00 = i;
        this.A04 = z;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return false;
    }
}
