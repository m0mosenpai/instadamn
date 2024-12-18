package X;

import android.text.TextUtils;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class G29 implements InterfaceC37293Gbu {
    public final /* synthetic */ EVU A00;

    @Override // X.InterfaceC37224GaZ
    public final void DAR(DirectShareTarget directShareTarget) {
    }

    public G29(EVU evu) {
        this.A00 = evu;
    }

    @Override // X.InterfaceC37293Gbu
    public final String BrI() {
        C35151Fet c35151Fet = this.A00.A0B;
        if (c35151Fet == null) {
            return "";
        }
        return c35151Fet.A02.BrI();
    }

    @Override // X.InterfaceC37224GaZ
    public final boolean Cci(DirectShareTarget directShareTarget) {
        return AbstractC31174DnI.A1W(directShareTarget, this.A00.A0r);
    }

    @Override // X.InterfaceC37224GaZ
    public final boolean Ceu(DirectShareTarget directShareTarget) {
        DirectShareTarget directShareTarget2 = this.A00.A0C;
        if (directShareTarget2 != null && directShareTarget2.equals(directShareTarget)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC37224GaZ
    public final void DdG(View view, DirectShareTarget directShareTarget, int i, int i2, int i3) {
        String str;
        if (view != null) {
            EVU evu = this.A00;
            C31600DuS c31600DuS = evu.A0o;
            if (c31600DuS.A03 != null) {
                E9O e9o = new E9O(directShareTarget, directShareTarget.A04(evu.A0g.userId, false), evu.A0L, evu.A0I, EVU.A04(evu), i, i2, i3);
                if (evu.A0A == null) {
                    evu.A0A = new C36305G0a(new C36444G5t(this, 1));
                }
                C32872EdE c32872EdE = c31600DuS.A02;
                if (c32872EdE != null) {
                    str = c32872EdE.A01;
                } else {
                    str = "";
                }
                C59072n8 A00 = C59062n7.A00(e9o, 0, e9o.BKg(str));
                A00.A00(evu.A0A);
                evu.A0h.A05(view, A00.A01());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0244, code lost:
    
        if (r5.A0r.isEmpty() != false) goto L86;
     */
    @Override // X.InterfaceC37224GaZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean DdH(com.instagram.model.direct.DirectShareTarget r40, int r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G29.DdH(com.instagram.model.direct.DirectShareTarget, int, int, int):boolean");
    }

    @Override // X.InterfaceC37224GaZ
    public final boolean DdK(DirectShareTarget directShareTarget) {
        InterfaceC37289Gbq interfaceC37289Gbq = this.A00.A0m;
        String str = directShareTarget.A0J;
        if (str == null) {
            str = "";
        }
        interfaceC37289Gbq.E2S(str, directShareTarget.A0L);
        return true;
    }

    @Override // X.InterfaceC37224GaZ
    public final void DdO(View view) {
        if (view != null) {
            this.A00.A0h.A04(view);
        }
    }

    @Override // X.InterfaceC37224GaZ
    public final void DdP() {
        this.A00.A0m.DdP();
    }

    @Override // X.InterfaceC37293Gbu
    public final void DjF() {
        EVU evu = this.A00;
        C35151Fet c35151Fet = evu.A0B;
        if (c35151Fet != null) {
            String A01 = AbstractC13670mt.A01(c35151Fet.A02.BrI());
            A01.getClass();
            String lowerCase = A01.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                InterfaceC169517hR A02 = EVU.A02(evu);
                if (A02 != null) {
                    A02.Eby(lowerCase);
                    EVU.A0B(evu, C05F.A00);
                    return;
                }
                C65974TxR c65974TxR = null;
                c65974TxR.getClass();
                c65974TxR.A06.BjP(lowerCase);
                EVU.A0B(evu, C05F.A00);
                c65974TxR.A06(lowerCase);
            }
        }
    }

    @Override // X.InterfaceC37293Gbu
    public final void DyO() {
        EVU evu = this.A00;
        C35151Fet c35151Fet = evu.A0B;
        if (c35151Fet != null) {
            C35783FrL c35783FrL = evu.A08;
            FNQ fnq = c35783FrL.A01;
            boolean A1N = AbstractC167007dF.A1N(c35783FrL.A04.BrI().length());
            c35783FrL.A02.CLm();
            List list = fnq.A04;
            int size = list.size();
            List list2 = fnq.A01;
            int A02 = AbstractC31172DnG.A02(list2, size);
            if (!A1N) {
                A02 += AbstractC31172DnG.A02(fnq.A05, AbstractC31172DnG.A02(fnq.A00, fnq.A03.size()));
            }
            ArrayList A17 = AbstractC25225BEi.A17(A02);
            A17.addAll(list2);
            A17.addAll(list);
            if (!A1N) {
                A17.addAll(fnq.A00);
                A17.addAll(fnq.A03);
                A17.addAll(fnq.A05);
            }
            if (!A17.isEmpty()) {
                DirectShareTarget directShareTarget = (DirectShareTarget) AbstractC166997dE.A0k(A17);
                Map map = evu.A0r;
                if (!AbstractC31174DnI.A1W(directShareTarget, map) && (directShareTarget.A0R() || (map.isEmpty() && !evu.A0U))) {
                    c35151Fet.A02.FCm(directShareTarget);
                    return;
                }
            }
            c35151Fet.A02.EK2();
        }
    }

    @Override // X.InterfaceC37224GaZ
    public final boolean EiQ(DirectShareTarget directShareTarget) {
        EVU evu = this.A00;
        if (evu.A0r.isEmpty()) {
            return false;
        }
        if (directShareTarget.A0F()) {
            return true;
        }
        if (EVU.A0K(evu, directShareTarget)) {
            UserSession userSession = evu.A0g;
            InterfaceC37289Gbq interfaceC37289Gbq = evu.A0m;
            EnumC33498ErX enumC33498ErX = evu.A06;
            AbstractC167017dG.A1N(userSession, interfaceC37289Gbq);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC37289Gbq, userSession), "direct_group_creation_unreachable_recipient_row_disabled");
            if (enumC33498ErX == null) {
                enumC33498ErX = EnumC33498ErX.UNKNOWN;
            }
            A0f.A8R(enumC33498ErX, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0f.Cht();
        }
        return EVU.A0K(evu, directShareTarget);
    }
}
