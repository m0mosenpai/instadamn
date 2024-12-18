package X;

import android.animation.ValueAnimator;
import android.app.Dialog;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.aistudio.editor.AiSettingsRepository;
import com.instagram.creator.agent.onboarding.repository.CreatorAIAgentCreationRepository;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.schools.management.data.SchoolSettingsRepository;

/* renamed from: X.CpI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28909CpI implements InterfaceC48212Jk {
    public final int A00;
    public final Object A01;

    public C28909CpI(int i, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = interfaceC16660sJ;
        } else {
            this.A01 = interfaceC16660sJ;
        }
    }

    public static void A00(InterfaceC48192Ji interfaceC48192Ji, C1Dk c1Dk, C40701ud c40701ud, Object obj, int i) {
        c40701ud.ATV(new C28909CpI(obj, i), interfaceC48192Ji, c1Dk);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC48212Jk
    public final /* synthetic */ void invoke(Throwable th) {
        InterfaceC16660sJ interfaceC16660sJ;
        Object A0a;
        C29138Ct5 A12;
        String str;
        Object value;
        C26075Bg4 A00;
        switch (this.A00) {
            case 0:
                AbstractC25225BEi.A1U(this.A01, th);
                return;
            case 1:
                C27271C1v c27271C1v = (C27271C1v) this.A01;
                c27271C1v.A06();
                AbstractC166997dE.A1Y(c27271C1v.A0U, true);
                return;
            case 2:
                C1Df c1Df = ((AiSettingsRepository) this.A01).A00;
                if (c1Df == null) {
                    return;
                }
                c1Df.cancel();
                return;
            case 3:
                CreatorAIAgentCreationRepository creatorAIAgentCreationRepository = (CreatorAIAgentCreationRepository) this.A01;
                creatorAIAgentCreationRepository.A05.Egh(Double.valueOf(0.0d));
                C49495Lu8 c49495Lu8 = creatorAIAgentCreationRepository.A01;
                if (c49495Lu8 != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(c49495Lu8.A00, 0);
                    ofInt.setDuration(3000L);
                    ofInt.addUpdateListener(new BFF(c49495Lu8, 11));
                    ofInt.start();
                }
                C1Df c1Df2 = creatorAIAgentCreationRepository.A00;
                if (c1Df2 != null) {
                    c1Df2.cancel();
                }
                creatorAIAgentCreationRepository.A00 = null;
                return;
            case 4:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                A0a = AbstractC166997dE.A0a();
                interfaceC16660sJ.invoke(A0a);
                return;
            case 5:
                AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) this.A01;
                AbstractC166987dD.A1Z(new D4v(abstractC52922bZ, null, 13), AbstractC141776au.A00(abstractC52922bZ));
                return;
            case 6:
                A12 = AbstractC25226BEj.A12(((C27264C1h) this.A01).A01);
                str = "failed to load school eligibility status";
                A12.A07(str);
                return;
            case 7:
            case 9:
            default:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 8:
                C05A c05a = ((C27962CUh) this.A01).A01;
                do {
                    value = c05a.getValue();
                    A00 = C26075Bg4.A00(null, null, null, null, null, EnumC27383C6m.A03, (C26075Bg4) value, null, null, null, null, null, null, null, 126975, false);
                } while (!c05a.AIi(value, A00));
                return;
            case 10:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                A0a = EnumC53310Nhm.NETWORK_ERROR;
                interfaceC16660sJ.invoke(A0a);
                return;
            case 11:
                A12 = SchoolSettingsRepository.A00((SchoolSettingsRepository) this.A01);
                str = "failed to update school banner visibility";
                A12.A07(str);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A12 = SchoolSettingsRepository.A00((SchoolSettingsRepository) this.A01);
                str = "failed to update school banner name";
                A12.A07(str);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C26746BrS c26746BrS = (C26746BrS) this.A01;
                ((Dialog) c26746BrS.A03.getValue()).hide();
                C26746BrS.A00(c26746BrS);
                return;
            case 14:
                C29079Cs6 c29079Cs6 = (C29079Cs6) this.A01;
                AbstractC167007dF.A1C(th);
                InterfaceC24901Jp interfaceC24901Jp = c29079Cs6.A01;
                C194848jk c194848jk = new C194848jk(new C27328C4j(th));
                if (interfaceC24901Jp == null) {
                    return;
                }
                AbstractC25231BEo.A1G(c194848jk, interfaceC24901Jp);
                return;
            case Process.SIGTERM /* 15 */:
                InterfaceC24741Ir interfaceC24741Ir = (InterfaceC24741Ir) this.A01;
                interfaceC24741Ir.F8s(new C194848jk(new C27328C4j(th)));
                interfaceC24741Ir.AID(null);
                return;
        }
    }

    public C28909CpI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
