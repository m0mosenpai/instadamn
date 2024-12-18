package X;

import android.view.View;
import com.instagram.clips.intf.ClipsViewerConfig;
import java.util.List;

/* loaded from: classes5.dex */
public final class DI7 extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DI7(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z, boolean z2) {
        super(1);
        this.A00 = i;
        this.A04 = obj;
        this.A01 = obj2;
        this.A06 = z;
        this.A05 = z2;
        this.A02 = obj3;
        this.A03 = obj4;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C5D2 c5d2;
        switch (this.A00) {
            case 0:
                long j = ((C119365at) obj).A00;
                CWQ cwq = (CWQ) this.A04;
                C25338BJh c25338BJh = (C25338BJh) this.A01;
                boolean z = !this.A06;
                InterfaceC74953Yl interfaceC74953Yl = cwq.A0A;
                if (!AbstractC25230BEn.A1X(interfaceC74953Yl)) {
                    c25338BJh.A01();
                } else if (z && (c5d2 = cwq.A0L) != null) {
                    c5d2.show();
                }
                if (AbstractC25230BEn.A1X(interfaceC74953Yl) && this.A05) {
                    InterfaceC74953Yl interfaceC74953Yl2 = cwq.A09;
                    if (interfaceC74953Yl2.getValue() != EnumC27357C5m.Selection) {
                        C28262Cd7 A00 = cwq.A00();
                        if (A00 != null) {
                            InterfaceC31114Dlw interfaceC31114Dlw = (InterfaceC31114Dlw) this.A03;
                            C27945CTe c27945CTe = cwq.A0M;
                            InterfaceC16660sJ interfaceC16660sJ = cwq.A0O;
                            int F8T = interfaceC31114Dlw.F8T(A00.A01(j, true));
                            C5C3 c5c3 = c27945CTe.A01;
                            interfaceC16660sJ.invoke(new C5C3(c5c3.A01, c5c3.A02, C60Z.A00(F8T, F8T)));
                            if (cwq.A01.A02.length() > 0) {
                                interfaceC74953Yl2.Egh(EnumC27357C5m.Cursor);
                                break;
                            }
                        }
                    } else {
                        ((BXF) this.A02).A0C(AbstractC25225BEi.A0R(j));
                        break;
                    }
                }
                break;
            case 1:
                C6Nu A0T = AbstractC25228BEl.A0T(obj);
                List list = (List) this.A04;
                C30115DOx c30115DOx = C30115DOx.A00;
                boolean z2 = this.A05;
                boolean z3 = this.A06;
                InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) this.A02;
                InterfaceC16660sJ interfaceC16660sJ3 = (InterfaceC16660sJ) this.A03;
                AbstractC25227BEk.A15(A0T, new C30729DfR((C27062Bwl) this.A01, list, interfaceC16660sJ2, interfaceC16660sJ3, z2, z3), new C57750Pjd(5, list, (InterfaceC16660sJ) c30115DOx), new C57750Pjd(6, list, (InterfaceC16660sJ) C30116DOy.A00), list.size());
                break;
            case 2:
                C2YJ c2yj = (C2YJ) obj;
                C14360o3.A0B(c2yj, 0);
                if (this.A05) {
                    InterfaceC31159Dn3 interfaceC31159Dn3 = (InterfaceC31159Dn3) this.A04;
                    C120985dq c120985dq = (C120985dq) this.A01;
                    View view = c2yj.A00;
                    C14360o3.A06(view);
                    interfaceC31159Dn3.Dnf(view, c120985dq, AbstractC111324zv.A00(3119), this.A06);
                    break;
                } else {
                    ClipsViewerConfig clipsViewerConfig = (ClipsViewerConfig) this.A03;
                    C120985dq c120985dq2 = (C120985dq) this.A01;
                    C14360o3.A0B(clipsViewerConfig, 0);
                    if (!clipsViewerConfig.A1r && !clipsViewerConfig.A1T) {
                        InterfaceC31159Dn3 interfaceC31159Dn32 = (InterfaceC31159Dn3) this.A04;
                        C37644Ghd c37644Ghd = (C37644Ghd) this.A02;
                        View view2 = c2yj.A00;
                        C14360o3.A06(view2);
                        interfaceC31159Dn32.DP5(view2, c120985dq2, c37644Ghd);
                        break;
                    }
                }
                break;
            default:
                boolean z4 = this.A05;
                InterfaceC31159Dn3 interfaceC31159Dn33 = (InterfaceC31159Dn3) this.A04;
                C120985dq c120985dq3 = (C120985dq) this.A01;
                if (!z4) {
                    interfaceC31159Dn33.DUw(c120985dq3, (C37644Ghd) this.A02, ((C25437BNc) this.A03).A00);
                    break;
                } else {
                    interfaceC31159Dn33.Dnc(c120985dq3, AbstractC111324zv.A00(1273), this.A06);
                    break;
                }
        }
        return C0eB.A00;
    }
}
