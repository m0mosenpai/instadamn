package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class CKL {
    /* JADX WARN: Type inference failed for: r8v0, types: [boolean] */
    public static final void A00(C5Tl c5Tl, SettingsScreenViewModel settingsScreenViewModel, C26230Biu c26230Biu, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        String str;
        C5UU ASZ;
        int i3;
        ?? A1b = AbstractC25233BEq.A1b(c26230Biu, interfaceC16660sJ, settingsScreenViewModel);
        c5Tl.Enr(2050763057);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c26230Biu) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, settingsScreenViewModel);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1564145521, "com.instagram.settings2.core.view.YourAccountHeader (YourAccountCustomHeader.kt:22)");
            }
            InterfaceC58303Psv interfaceC58303Psv = c26230Biu.A02;
            boolean A1W = AbstractC25233BEq.A1W(c5Tl, settingsScreenViewModel, c26230Biu, -1795306440);
            Object EEc = c5Tl.EEc();
            if (A1W || EEc == C5UI.A00) {
                EEc = new C43171J6q(c26230Biu, settingsScreenViewModel, (InterfaceC23621Ds) null, 26);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C5UX.A04(c5Tl, interfaceC58303Psv, (InterfaceC16620sF) EEc);
            SimpleImageUrl A0t = AbstractC25225BEi.A0t(c26230Biu.A03);
            List list = c26230Biu.A05;
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0q.add(AbstractC25703BXn.A01(c5Tl, (C51759Mti) it.next()));
            }
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it2 = A0q.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                AbstractC25228BEl.A1Q(next, A1E, AbstractC001900j.A0T((String) next) ? 1 : 0);
            }
            if (A1E.size() > A1b) {
                str = AbstractC25226BEj.A1H(" · ", A1E, null);
            } else {
                str = (String) AbstractC001800i.A0J(A1E);
            }
            C51759Mti c51759Mti = c26230Biu.A00;
            String A01 = AbstractC25703BXn.A01(c5Tl, c51759Mti);
            List list2 = (List) c51759Mti.A01;
            if (list2 != null) {
                ArrayList A1E2 = AbstractC166987dD.A1E();
                for (Object obj : list2) {
                    if (obj instanceof C26227Bir) {
                        A1E2.add(obj);
                    }
                }
                C26227Bir c26227Bir = (C26227Bir) AbstractC001800i.A0J(A1E2);
                if (c26227Bir != null) {
                    C5C8 A00 = BY0.A00(c5Tl, c26227Bir, A01);
                    EnumC27362C5r enumC27362C5r = EnumC27362C5r.A03;
                    C26182Bi7 c26182Bi7 = new C26182Bi7(A0t, 96.0f);
                    String A012 = AbstractC25703BXn.A01(c5Tl, c26230Biu.A01);
                    EnumC27363C5s enumC27363C5s = EnumC27363C5s.A02;
                    boolean A1U = AbstractC25228BEl.A1U(c5Tl, c26227Bir, AbstractC25227BEk.A1Y(c5Tl, A00, -1795273109), AbstractC25231BEo.A1L(i2));
                    Object EEc2 = c5Tl.EEc();
                    if (A1U || EEc2 == C5UI.A00) {
                        EEc2 = new C30184DRp(A00, c26227Bir, interfaceC16660sJ, 30);
                        c5Tl.FBy(EEc2);
                    }
                    AbstractC28504Chx.A01(c5Tl, null, c26182Bi7, enumC27362C5r, enumC27363C5s, str, A00, A012, null, null, null, AbstractC25225BEi.A1B(A0K, EEc2, false), 384, 6, 2658, 0L);
                    if (C0fH.A02()) {
                        C0fH.A00(-1202287424);
                    }
                }
            }
            if (C0fH.A02()) {
                C0fH.A00(-1786203627);
            }
            ASZ = c5Tl.ASZ();
            if (ASZ == null) {
                return;
            }
            i3 = 13;
            ASZ.A06 = new C30219DSy(i, i3, settingsScreenViewModel, c26230Biu, interfaceC16660sJ);
        }
        ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            i3 = 12;
            ASZ.A06 = new C30219DSy(i, i3, settingsScreenViewModel, c26230Biu, interfaceC16660sJ);
        }
    }
}
