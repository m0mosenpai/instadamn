package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.D8u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29724D8u extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29724D8u(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i) {
        super(0);
        this.A00 = i;
        this.A04 = obj;
        this.A06 = str;
        this.A02 = obj2;
        this.A01 = obj3;
        this.A05 = str2;
        this.A03 = obj4;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                AnonymousClass389.A02((AnonymousClass389) this.A04);
                C38321qM c38321qM = (C38321qM) this.A03;
                String str = this.A05;
                if (c38321qM.A5M()) {
                    C14360o3.A0A(c38321qM.A1h(str));
                }
                ((InterfaceC31040Dke) this.A02).Dfp();
                break;
            case 1:
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A04;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), AbstractC111324zv.A00(1878));
                if (A0f.isSampled()) {
                    A0f.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, this.A06);
                    A0f.A7v(AbstractC43591JPw.A00(1119), AbstractC166997dE.A0a());
                    A0f.Cht();
                }
                ((CWZ) this.A02).A03(new ME8(this.A01, abstractC12990ll, this.A03, this.A05, 23));
                break;
            default:
                CWI cwi = (CWI) this.A04;
                CWZ cwz = cwi.A02;
                C27987CVk c27987CVk = (C27987CVk) this.A03;
                Object obj = new Object();
                C28371CfX c28371CfX = (C28371CfX) this.A01;
                cwz.A02(c27987CVk, obj, C30170DRa.A00(this.A02, c28371CfX, 10));
                cwi.A04.addLast(new C27992CVp(c28371CfX, this.A06, this.A05));
                break;
        }
        return C0eB.A00;
    }
}
