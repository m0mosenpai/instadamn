package X;

import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.Lmp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49063Lmp implements InterfaceC50432MOm {
    public final /* synthetic */ C160577Hr A00;
    public final /* synthetic */ IgProgressImageView A01;

    public C49063Lmp(C160577Hr c160577Hr, IgProgressImageView igProgressImageView) {
        this.A00 = c160577Hr;
        this.A01 = igProgressImageView;
    }

    @Override // X.InterfaceC50432MOm
    public final void D6U(Object obj) {
        C14360o3.A0B(obj, 0);
        C160577Hr c160577Hr = this.A00;
        c160577Hr.A00 = null;
        this.A01.setUrl(AbstractC25225BEi.A0t((String) obj), c160577Hr.A03);
    }
}
