package X;

/* renamed from: X.Aah, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23470Aah implements InterfaceC174967qW {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C23470Aah(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.InterfaceC174967qW
    public final void D76(C177447ue c177447ue, C175007qa c175007qa) {
        if (this.A00 != 0) {
            AbstractC175037qd.A01("ConcurrentFrontBackController", "Main camera connected successfully");
            C175407rG c175407rG = (C175407rG) this.A01;
            C175007qa c175007qa2 = c175407rG.A0F;
            hashCode();
            c175007qa2.A0M.A02(this);
            c175407rG.A04.getClass();
            C175007qa c175007qa3 = c175407rG.A04;
            C23470Aah c23470Aah = new C23470Aah(0, c177447ue, this);
            c23470Aah.hashCode();
            c175007qa3.A0M.A01(c23470Aah);
            AbstractC175037qd.A01("ConcurrentFrontBackController", "Calling onResume for the auxiliary camera");
            c175407rG.A04.A0F(false);
            return;
        }
        AbstractC175037qd.A01("ConcurrentFrontBackController", "Auxiliary camera connected successfully");
        C23470Aah c23470Aah2 = (C23470Aah) this.A01;
        C175007qa c175007qa4 = ((C175407rG) c23470Aah2.A01).A04;
        c175007qa4.getClass();
        hashCode();
        c175007qa4.A0M.A02(this);
        C177447ue c177447ue2 = (C177447ue) this.A02;
        c177447ue2.getClass();
        ((AbstractC184688Hj) c23470Aah2.A02).A02(new C177447ue(c177447ue2.A02, c177447ue, c177447ue2.A03, c177447ue2.A01, c177447ue2.A04));
    }

    @Override // X.InterfaceC174967qW
    public final void D7C(C175007qa c175007qa, Exception exc) {
        C23470Aah c23470Aah;
        String str;
        String A0y;
        if (this.A00 != 0) {
            c23470Aah = this;
            C175007qa c175007qa2 = ((C175407rG) this.A01).A0F;
            hashCode();
            c175007qa2.A0M.A02(this);
            str = "ConcurrentFrontBackController";
            A0y = "Failed to connect first camera for concurrent front-back mode";
        } else {
            c23470Aah = (C23470Aah) this.A01;
            C175007qa c175007qa3 = ((C175407rG) c23470Aah.A01).A04;
            c175007qa3.getClass();
            hashCode();
            c175007qa3.A0M.A02(this);
            str = "ConcurrentFrontBackController";
            A0y = AbstractC166997dE.A0y("Failed to connect second camera for concurrent front-back mode: ", exc);
        }
        AbstractC175037qd.A02(str, A0y);
        ((AbstractC184688Hj) c23470Aah.A02).A01(exc);
    }

    @Override // X.InterfaceC174967qW
    public final /* synthetic */ void DAc(C175007qa c175007qa) {
    }

    @Override // X.InterfaceC174967qW
    public final /* synthetic */ void D6q(C177447ue c177447ue, C175007qa c175007qa) {
    }

    @Override // X.InterfaceC174967qW
    public final /* synthetic */ void D7E(C175007qa c175007qa, String str, String str2) {
    }

    @Override // X.InterfaceC174967qW
    public final /* synthetic */ void DAd(C175007qa c175007qa, Exception exc) {
    }
}
