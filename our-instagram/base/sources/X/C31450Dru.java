package X;

import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;

/* renamed from: X.Dru, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31450Dru implements InterfaceC55022g1 {
    public final int A00;
    public final Object A01;

    public C31450Dru(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC55022g1
    public final void DXC(C125715mI c125715mI) {
        C64742wY c64742wY;
        switch (this.A00) {
            case 0:
                c64742wY = (C64742wY) ((JR2) this.A01).A2X.getValue();
                c64742wY.A02 = c125715mI;
                return;
            case 1:
                c64742wY = ((C31721DwQ) this.A01).A0q;
                c64742wY.A02 = c125715mI;
                return;
            case 2:
                c64742wY = ((ENX) this.A01).A01;
                if (c64742wY == null) {
                    C14360o3.A0F("quickPromotionTooltipsController");
                    throw C00O.createAndThrow();
                }
                c64742wY.A02 = c125715mI;
                return;
            case 3:
                c64742wY = ((EM6) this.A01).A08;
                c64742wY.A02 = c125715mI;
                return;
            default:
                c64742wY = ((C33232ElR) this.A01).A01;
                if (c64742wY == null) {
                    return;
                }
                c64742wY.A02 = c125715mI;
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC55022g1
    public final void Dtj(C125715mI c125715mI) {
        String str;
        C64742wY c64742wY;
        InterfaceC55362gb interfaceC55362gb;
        String str2;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c125715mI, 0);
                if ("Discover channels you can join.".equals(c125715mI.A02) && !((JR2) this.A01).A1H) {
                    return;
                }
                JR2 jr2 = (JR2) this.A01;
                c64742wY = (C64742wY) jr2.A2X.getValue();
                interfaceC55362gb = (AbstractC55352ga) jr2.A2W.getValue();
                c64742wY.A01(interfaceC55362gb, c125715mI);
                return;
            case 1:
                C31721DwQ c31721DwQ = (C31721DwQ) this.A01;
                c64742wY = c31721DwQ.A0q;
                interfaceC55362gb = c31721DwQ.A0p;
                c64742wY.A01(interfaceC55362gb, c125715mI);
                return;
            case 2:
                C14360o3.A0B(c125715mI, 0);
                ENX enx = (ENX) this.A01;
                c64742wY = enx.A01;
                if (c64742wY == null) {
                    str2 = "quickPromotionTooltipsController";
                } else {
                    interfaceC55362gb = enx.A00;
                    if (interfaceC55362gb == null) {
                        str2 = "quickPromotionDelegate";
                    }
                    c64742wY.A01(interfaceC55362gb, c125715mI);
                    return;
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 3:
                EM6 em6 = (EM6) this.A01;
                em6.A08.A01(em6.A07, c125715mI);
                UserSession userSession = em6.A05;
                String moduleName = em6.getModuleName();
                SavedCollection savedCollection = em6.A0C;
                if (savedCollection != null) {
                    str = AbstractC35089Fd0.A01(savedCollection.A01(em6.A05));
                } else {
                    str = null;
                }
                C14360o3.A0B(userSession, 0);
                AbstractC35088Fcz.A01(userSession, C05F.A0N, moduleName, null, str);
                return;
            default:
                C14360o3.A0B(c125715mI, 0);
                C33232ElR c33232ElR = (C33232ElR) this.A01;
                c64742wY = c33232ElR.A01;
                if (c64742wY != null) {
                    interfaceC55362gb = c33232ElR.A00;
                    c64742wY.A01(interfaceC55362gb, c125715mI);
                    return;
                }
                return;
        }
    }
}
