package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import go.Seq;
import java.util.HashMap;

/* renamed from: X.DGb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29887DGb extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29887DGb(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C29887DGb A00(Object obj, int i) {
        return new C29887DGb(obj, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        InterfaceC09390do interfaceC09390do;
        switch (this.A00) {
            case 0:
                C26874Btb c26874Btb = (C26874Btb) this.A01;
                return new C27030BwA(c26874Btb.getSession(), (Integer) c26874Btb.A00.getValue(), (Integer) c26874Btb.A01.getValue());
            case 1:
                C26733BrE c26733BrE = (C26733BrE) this.A01;
                return new C27031BwB(AbstractC166987dD.A0r(c26733BrE.A04), AbstractC25225BEi.A15(c26733BrE.A02), AbstractC25225BEi.A15(c26733BrE.A01));
            case 2:
            case 8:
                return AbstractC25235BEs.A0U(this.A01);
            case 3:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 17:
            case 21:
            case 28:
            case 34:
            case 45:
                return this.A01;
            case 4:
            case 14:
            case 18:
            case 22:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 35:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return AbstractC25226BEj.A1C(this.A01);
            case 5:
            case Process.SIGTERM /* 15 */:
            case Process.SIGSTOP /* 19 */:
            case 23:
            case 30:
            case 36:
            case 47:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 6:
                C26733BrE c26733BrE2 = (C26733BrE) this.A01;
                return new C27017Bvw(c26733BrE2.mArguments, AbstractC166987dD.A0r(c26733BrE2.A04));
            case 7:
            case 10:
            case 37:
            case 38:
                AbstractC166987dD.A1Y(this.A01);
                return C0eB.A00;
            case 9:
                C26713Bqu c26713Bqu = (C26713Bqu) this.A01;
                return new C27031BwB(AbstractC166987dD.A0r(c26713Bqu.A03), AbstractC25225BEi.A15(c26713Bqu.A01), AbstractC25225BEi.A15(c26713Bqu.A00));
            case 11:
                ((InterfaceC16660sJ) this.A01).invoke(null);
                return C0eB.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new BP5(AbstractC166987dD.A0r(((C26729BrA) this.A01).A02), null);
            case 16:
                C26729BrA c26729BrA = (C26729BrA) this.A01;
                return new C27018Bvx(AbstractC166987dD.A0r(c26729BrA.A02), AbstractC25225BEi.A15(c26729BrA.A01));
            case 20:
                return new C26994BvZ(AbstractC166987dD.A0r(((C45471KBg) this.A01).A01));
            case 24:
                return new C26994BvZ(AbstractC166987dD.A0r(((C26800BsO) this.A01).A02));
            case 25:
                CreatorAgentSuggestedRepliesSettingsRepository creatorAgentSuggestedRepliesSettingsRepository = new CreatorAgentSuggestedRepliesSettingsRepository((UserSession) this.A01);
                creatorAgentSuggestedRepliesSettingsRepository.A00 = AbstractC25226BEj.A1L(new D4v(creatorAgentSuggestedRepliesSettingsRepository, null, 7), ((C4A7) creatorAgentSuggestedRepliesSettingsRepository).A01);
                return creatorAgentSuggestedRepliesSettingsRepository;
            case 26:
                ((C189478aR) this.A01).A07();
                return C0eB.A00;
            case 27:
                return new BP5(AbstractC166987dD.A0r(((C27276C2b) this.A01).A04), null);
            case 31:
                C27276C2b c27276C2b = (C27276C2b) this.A01;
                return new C27041BwL(AbstractC166987dD.A0r(c27276C2b.A04), (User) c27276C2b.A03.getValue(), AbstractC25225BEi.A15(c27276C2b.A05), (HashMap) c27276C2b.A01.getValue());
            case 32:
                return C2JD.A00(((G5Y) this.A01).A00);
            case 33:
                C26722Br3 c26722Br3 = (C26722Br3) this.A01;
                return new C27019Bvy(AbstractC166987dD.A0r(c26722Br3.A01), AbstractC25225BEi.A15(c26722Br3.A02));
            case 39:
                return new BJ7((UserSession) this.A01);
            case 40:
                interfaceC09390do = ((C38925HBx) this.A01).A0A;
                AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
                return AbstractC166997dE.A0c(AbstractC166997dE.A0U(A0o), A0o, 36323908517244602L);
            case Seq.NULL_REFNUM /* 41 */:
                return new C19270xB(AbstractC111324zv.A00(860));
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C38925HBx c38925HBx = (C38925HBx) this.A01;
                C35156Fey.A00(c38925HBx.requireActivity(), C22P.A28, c38925HBx, AbstractC166987dD.A0r(c38925HBx.A0A));
                return C0eB.A00;
            case 43:
                C38925HBx c38925HBx2 = (C38925HBx) this.A01;
                C25846Bc1 c25846Bc1 = (C25846Bc1) c38925HBx2.A0B.getValue();
                C31543DtT c31543DtT = c38925HBx2.A03;
                if (c31543DtT == null) {
                    C14360o3.A0F("paginationHelper");
                    throw C00O.createAndThrow();
                }
                c25846Bc1.A00(c31543DtT.A00);
                return C0eB.A00;
            case 44:
                C38925HBx c38925HBx3 = (C38925HBx) this.A01;
                return new C38E((InterfaceC11380iw) c38925HBx3.A07.getValue(), AbstractC166987dD.A0r(c38925HBx3.A0A), new C38C(c38925HBx3, -1));
            case 48:
                return new C26995Bva(AbstractC166987dD.A0r(((C38925HBx) this.A01).A0A));
            case 49:
                interfaceC09390do = ((C26819Bsh) this.A01).A07;
                AbstractC12990ll A0o2 = AbstractC166987dD.A0o(interfaceC09390do);
                return AbstractC166997dE.A0c(AbstractC166997dE.A0U(A0o2), A0o2, 36323908517244602L);
        }
    }
}
