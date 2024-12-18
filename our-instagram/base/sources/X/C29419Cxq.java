package X;

import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import java.util.HashMap;

/* renamed from: X.Cxq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29419Cxq implements C8YF {
    public final /* synthetic */ C26616BpD A00;
    public final /* synthetic */ C8YH A01;

    public C29419Cxq(C26616BpD c26616BpD, C8YH c8yh) {
        this.A00 = c26616BpD;
        this.A01 = c8yh;
    }

    @Override // X.C8YF
    public final void DOg() {
        C26616BpD c26616BpD = this.A00;
        C25814BbV c25814BbV = c26616BpD.A00;
        String str = c26616BpD.A06;
        String str2 = c26616BpD.A05;
        C169297h3 c169297h3 = c26616BpD.A03;
        C169287h2 c169287h2 = c26616BpD.A02;
        C8YH c8yh = this.A01;
        AbstractC25233BEq.A0v(0, str, c169297h3, c169287h2);
        C18920wW c18920wW = c25814BbV.A0C.A01;
        String A00 = AbstractC43591JPw.A00(72);
        String str3 = c169287h2.A02;
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("nav_chain", AbstractC25225BEi.A14());
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, AbstractC111324zv.A00(2576));
        A0f.AAP("source_of_action", A00);
        A0f.AAP(MSV.A00(122), str3);
        A0f.A7v(MSV.A00(104), true);
        A0f.A9M("extra_values", A1G);
        A0f.Cht();
        c8yh.A04(c169297h3);
        MediaCommentListRepository mediaCommentListRepository = c25814BbV.A0A;
        AbstractC166987dD.A1Z(new MCF(mediaCommentListRepository, str, null, 12), ((C4A7) mediaCommentListRepository).A01);
        c25814BbV.A0O.Egh(new C167517e7(c169287h2, c169297h3, c8yh, str, str2));
    }

    @Override // X.C8YF
    public final void Dw9() {
        C26616BpD c26616BpD = this.A00;
        c26616BpD.A00.A0S(c26616BpD.A02, c26616BpD.A06, c26616BpD.A05);
    }
}
