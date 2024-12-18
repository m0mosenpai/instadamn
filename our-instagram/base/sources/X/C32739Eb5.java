package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Eb5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32739Eb5 extends G2R {
    public String A00;
    public final C41761wQ A01;
    public final FFV A02;
    public final FP9 A03;
    public final String A04;
    public final List A05;
    public final UserSession A06;
    public final String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32739Eb5(UserSession userSession, FFV ffv, FP9 fp9, String str, String str2, String str3, List list) {
        super(ffv);
        AbstractC167027dH.A0a(1, userSession, str, str2, str3);
        this.A06 = userSession;
        this.A00 = str;
        this.A07 = str2;
        this.A04 = str3;
        this.A05 = list;
        this.A02 = ffv;
        this.A03 = fp9;
        this.A01 = AbstractC31174DnI.A0S();
    }

    @Override // X.G2R, X.InterfaceC37194Ga5
    public final void Cha() {
        super.Cha();
        C137756Lx A01 = C137756Lx.A03.A01(this.A06, EnumC132075xi.A0R);
        C41761wQ c41761wQ = this.A01;
        C137766Ly c137766Ly = A01.A01;
        final String str = this.A00;
        final long parseLong = Long.parseLong(this.A07);
        final long j = super.A01;
        GKK.A00(c137766Ly.A06.A0L(new C6D2() { // from class: X.Laa
            @Override // X.C6D2
            public final Object apply(Object obj) {
                final String str2 = str;
                final long j2 = parseLong;
                final long j3 = j;
                final K3D k3d = (K3D) obj;
                C137766Ly c137766Ly2 = C137766Ly.A0L;
                return C42221xC.A07(new InterfaceC1345866i() { // from class: X.Lc3
                    @Override // X.InterfaceC1345866i
                    public final void EpD(C1346766r c1346766r) {
                        K3D k3d2 = K3D.this;
                        String str3 = str2;
                        long j4 = j2;
                        long j5 = j3;
                        C137766Ly c137766Ly3 = C137766Ly.A0L;
                        Long valueOf = Long.valueOf(j4);
                        C35856FsW c35856FsW = new C35856FsW(c1346766r, 5);
                        InterfaceExecutorC135866Co A0C = AbstractC43592JPx.A0C(k3d2, 0);
                        MailboxFutureImpl A0I = AbstractC43593JPy.A0I(A0C, c35856FsW);
                        AbstractC25231BEo.A1C(A0C, new LUI(k3d2, A0I, valueOf, str3, j5), A0I);
                    }
                }, AbstractC137146It.A00("load_fts_messages"));
            }
        }).A0G(), c41761wQ, this, 1);
    }
}
