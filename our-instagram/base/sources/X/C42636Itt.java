package X;

import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.Itt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42636Itt implements InterfaceC79883hd {
    public final InterfaceC65282xQ A00;
    public final InterfaceC79883hd A01;
    public final C33P A02;

    @Override // X.InterfaceC79883hd
    public final void DRI(C38321qM c38321qM, IgProgressImageView igProgressImageView) {
        C14360o3.A0B(c38321qM, 0);
        this.A01.DRI(c38321qM, igProgressImageView);
    }

    public C42636Itt(InterfaceC65282xQ interfaceC65282xQ, InterfaceC79883hd interfaceC79883hd, C33P c33p) {
        AbstractC167017dG.A1R(interfaceC65282xQ, c33p);
        this.A01 = interfaceC79883hd;
        this.A00 = interfaceC65282xQ;
        this.A02 = c33p;
    }

    @Override // X.InterfaceC79883hd
    public final void DLe(C73083Pj c73083Pj, C38321qM c38321qM, C75113Zb c75113Zb) {
        AbstractC167017dG.A1P(c38321qM, c75113Zb);
        c75113Zb.A0I(c73083Pj);
        if (c73083Pj.A02 != null && !this.A00.CSO() && c38321qM.Cff()) {
            this.A02.A0F.A0D.sendEmptyMessage(0);
        }
    }
}
