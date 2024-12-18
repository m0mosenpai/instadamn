package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* loaded from: classes5.dex */
public final class D3D implements InterfaceC19960yQ {
    public final /* synthetic */ C26800BsO A00;
    public final /* synthetic */ IgdsBottomButtonLayout A01;
    public final /* synthetic */ boolean A02;

    public D3D(C26800BsO c26800BsO, IgdsBottomButtonLayout igdsBottomButtonLayout, boolean z) {
        this.A00 = c26800BsO;
        this.A02 = z;
        this.A01 = igdsBottomButtonLayout;
    }

    @Override // X.InterfaceC19960yQ
    public final /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        String str;
        if (AbstractC166987dD.A1a(obj)) {
            C26800BsO c26800BsO = this.A00;
            CQT cqt = c26800BsO.A00;
            if (cqt == null) {
                str = "logger";
            } else {
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(cqt.A00, "ig_creator_agents_suggested_replies_turn_on_sr_onboard_nux");
                if (A0f.isSampled()) {
                    A0f.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, cqt.A01);
                    A0f.Cht();
                }
                InterfaceC09390do interfaceC09390do = c26800BsO.A02;
                C23031Ai A0l = AbstractC25230BEn.A0l(interfaceC09390do);
                AbstractC167007dF.A1L(A0l, A0l.A1a, C23031Ai.A8c, 387, true);
                if (this.A02) {
                    C140966Yy A0j = AbstractC25233BEq.A0j(c26800BsO, interfaceC09390do);
                    C45471KBg c45471KBg = new C45471KBg();
                    String str2 = c26800BsO.A01;
                    if (str2 == null) {
                        str = "entryPoint";
                    } else {
                        AbstractC25227BEk.A1C(c45471KBg, new C09530e4[]{AbstractC166987dD.A1L("entrypoint", str2)});
                        A0j.A0D(c45471KBg);
                        A0j.A0D = false;
                        A0j.A07();
                    }
                } else {
                    AbstractC25230BEn.A0l(interfaceC09390do).A1K(true);
                    AbstractC25231BEo.A16(c26800BsO);
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        this.A01.setPrimaryActionIsLoading(false);
        return C0eB.A00;
    }
}
