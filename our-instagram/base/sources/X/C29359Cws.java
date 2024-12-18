package X;

import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.Cws, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29359Cws implements InterfaceC140616Xp {
    public final /* synthetic */ C114205Dh A00;
    public final /* synthetic */ C26822Bsk A01;
    public final /* synthetic */ Reel A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ C15100pQ A05;

    @Override // X.InterfaceC140616Xp
    public final void onStart() {
    }

    public C29359Cws(C114205Dh c114205Dh, C26822Bsk c26822Bsk, Reel reel, List list, InterfaceC16820sZ interfaceC16820sZ, C15100pQ c15100pQ) {
        this.A04 = interfaceC16820sZ;
        this.A01 = c26822Bsk;
        this.A02 = reel;
        this.A03 = list;
        this.A00 = c114205Dh;
        this.A05 = c15100pQ;
    }

    @Override // X.InterfaceC140616Xp
    public final void DFw(long j) {
        this.A04.invoke();
    }

    @Override // X.InterfaceC140616Xp
    public final void DqK(boolean z, long j) {
        this.A04.invoke();
        C26822Bsk c26822Bsk = this.A01;
        Reel reel = this.A02;
        List list = this.A03;
        C114205Dh c114205Dh = this.A00;
        C15100pQ c15100pQ = this.A05;
        try {
            AbstractC166987dD.A1Z(new JTH(c114205Dh, c26822Bsk, c15100pQ, reel, list, (InterfaceC23621Ds) null, 15), AbstractC25235BEs.A0S(c26822Bsk));
        } catch (Throwable th) {
            new C09540e5(th);
        }
    }

    @Override // X.InterfaceC140616Xp
    public final void onCancel() {
        this.A04.invoke();
    }
}
