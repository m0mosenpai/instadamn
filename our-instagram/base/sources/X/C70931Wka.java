package X;

import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.Wka, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70931Wka implements GZ9 {
    public final /* synthetic */ C66481UJf A00;
    public final /* synthetic */ C66423UGs A01;
    public final /* synthetic */ FOC A02;

    public C70931Wka(C66481UJf c66481UJf, C66423UGs c66423UGs, FOC foc) {
        this.A01 = c66423UGs;
        this.A00 = c66481UJf;
        this.A02 = foc;
    }

    @Override // X.GZ9
    public final void D3r(Hashtag hashtag) {
        if (this.A00.getBindingAdapterPosition() != -1) {
            C66423UGs c66423UGs = this.A01;
            InterfaceC63842v5 interfaceC63842v5 = c66423UGs.A02;
            interfaceC63842v5.getClass();
            FOC foc = this.A02;
            C47K c47k = c66423UGs.A01;
            c47k.getClass();
            int A00 = c47k.A00(foc);
            C47K c47k2 = c66423UGs.A01;
            c47k2.getClass();
            int i = c47k2.A01;
            C47K c47k3 = c66423UGs.A01;
            c47k3.getClass();
            String str = c47k3.A0C;
            C47K c47k4 = c66423UGs.A01;
            c47k4.getClass();
            interfaceC63842v5.DMi(foc, str, "preview", c47k4.getId(), A00, i);
            c66423UGs.A0A.run();
        }
    }

    @Override // X.GZ9
    public final void D4c(Hashtag hashtag) {
        if (this.A00.getBindingAdapterPosition() != -1) {
            C66423UGs c66423UGs = this.A01;
            InterfaceC63842v5 interfaceC63842v5 = c66423UGs.A02;
            interfaceC63842v5.getClass();
            FOC foc = this.A02;
            C47K c47k = c66423UGs.A01;
            c47k.getClass();
            int A00 = c47k.A00(foc);
            C47K c47k2 = c66423UGs.A01;
            c47k2.getClass();
            interfaceC63842v5.DMl(foc, A00, c47k2.A01, c66423UGs.A00);
        }
    }
}
