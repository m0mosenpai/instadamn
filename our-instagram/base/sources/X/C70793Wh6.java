package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Wh6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70793Wh6 implements InterfaceC66482zP {
    public final int A00;
    public final VDG A01;
    public final ImageUrl A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public C70793Wh6(VDG vdg, ImageUrl imageUrl, String str, int i, boolean z, boolean z2) {
        this.A03 = str;
        this.A02 = imageUrl;
        this.A01 = vdg;
        this.A05 = z2;
        this.A04 = z;
        this.A00 = i;
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
