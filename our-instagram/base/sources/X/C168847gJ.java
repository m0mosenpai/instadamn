package X;

import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import java.util.List;

/* renamed from: X.7gJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C168847gJ extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ MediaCommentListRepository A00;
    public final /* synthetic */ C168827gH A01;
    public final /* synthetic */ EnumC166477cG A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C168847gJ(MediaCommentListRepository mediaCommentListRepository, C168827gH c168827gH, EnumC166477cG enumC166477cG, boolean z, boolean z2) {
        super(1);
        this.A03 = z;
        this.A02 = enumC166477cG;
        this.A00 = mediaCommentListRepository;
        this.A01 = c168827gH;
        this.A04 = z2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C84923qg c84923qg;
        InterfaceC38371qR interfaceC38371qR = (InterfaceC38371qR) obj;
        C14360o3.A0B(interfaceC38371qR, 0);
        if (this.A03 && this.A02 == EnumC166477cG.A04) {
            interfaceC38371qR.BQN().A0d.A0B.A01();
        }
        C1DU A00 = C1DS.A00(this.A00.A0B);
        C38321qM BQN = interfaceC38371qR.BQN();
        C168827gH c168827gH = this.A01;
        List A01 = AbstractC168857gK.A01(A00, c168827gH.A0D);
        List A012 = AbstractC168857gK.A01(A00, c168827gH.A0E);
        C38891rO c38891rO = c168827gH.A02;
        if (c38891rO != null) {
            AbstractC168857gK.A00(A00, c38891rO);
        }
        int i = c168827gH.A01;
        boolean z = c168827gH.A0G;
        boolean z2 = this.A04;
        EnumC166477cG enumC166477cG = this.A02;
        String str = c168827gH.A0B;
        String str2 = c168827gH.A0C;
        boolean z3 = c168827gH.A0J;
        C38891rO c38891rO2 = c168827gH.A03;
        if (c38891rO2 != null) {
            c84923qg = AbstractC168857gK.A00(A00, c38891rO2);
        } else {
            c84923qg = null;
        }
        BQN.A49(c84923qg, enumC166477cG, c168827gH.A09, str, str2, A01, A012, i, z, z2, false, z3);
        return C0eB.A00;
    }
}
