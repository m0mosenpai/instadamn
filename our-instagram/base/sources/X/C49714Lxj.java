package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.Lxj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49714Lxj implements InterfaceC42241xE {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public C49714Lxj(int i, Object obj, Object obj2, boolean z) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = z;
        this.A01 = obj2;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.A00) {
            case 0:
                C7T2 c7t2 = (C7T2) obj;
                C14360o3.A0B(c7t2, 0);
                JR2 jr2 = (JR2) this.A02;
                F3R.A00(jr2.A1L, jr2.A0p(), c7t2, (C7T3) this.A01, !this.A03);
                return;
            case 1:
                ImageUrl imageUrl = (ImageUrl) obj;
                C14360o3.A0B(imageUrl, 0);
                C49107Lnk c49107Lnk = (C49107Lnk) this.A02;
                C49152LoV c49152LoV = (C49152LoV) this.A01;
                boolean z = this.A03;
                IgProgressImageView igProgressImageView = c49152LoV.A03;
                igProgressImageView.setUrl(imageUrl, c49107Lnk.A00);
                c49152LoV.A01.setVisibility(0);
                igProgressImageView.setVisibility(0);
                float f = 1.0f;
                if (z) {
                    f = 0.5f;
                }
                igProgressImageView.setAlpha(f);
                return;
            default:
                return;
        }
    }
}
