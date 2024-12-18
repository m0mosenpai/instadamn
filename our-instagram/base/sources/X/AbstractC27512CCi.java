package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.CCi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27512CCi {
    public static final void A00(C5Tl c5Tl, Integer num, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, int i, boolean z) {
        int i2;
        AbstractC167007dF.A1D(str, 0, interfaceC16660sJ);
        C14360o3.A0B(interfaceC16820sZ, 3);
        c5Tl.Enr(162043467);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, num);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0f(c5Tl, z);
        }
        if ((i2 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1991491412, "com.instagram.aistudio.editor.AiEditPictureComposer (AiEditPictureComposer.kt:43)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 982648751);
            Object obj = C5UI.A00;
            C25338BJh c25338BJh = (C25338BJh) AbstractC25231BEo.A0l(c5Tl, A0q, obj);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C5XO c5xo = (C5XO) AbstractC25234BEr.A0Z(c5Tl, obj, 982650553);
            C117505Tk.A0L(A0K, false);
            Object AJX = c5Tl.AJX(C5V2.A0A);
            Modifier A00 = CB8.A00(AbstractC25225BEi.A0Q(AbstractC118175Wb.A03(AbstractC25230BEn.A0X(Modifier.A00, c25338BJh))), AbstractC25230BEn.A00(z ? 1 : 0));
            C118125Vw A0g = AbstractC25226BEj.A0g(c5Tl);
            C118125Vw c118125Vw = C118125Vw.A03;
            C118125Vw A0D = A0g.A0D(new C118125Vw(null, null, null, 5, 0, 16744446, AbstractC25226BEj.A0G(c5Tl), 0L, 0L, 0L));
            C6L4 c6l4 = new C6L4(AbstractC25226BEj.A0N(c5Tl));
            C28281CdS c28281CdS = new C28281CdS(C28281CdS.A04.A03, 3, 0, -1);
            boolean A1Z = AbstractC25234BEr.A1Z(c5Tl, 982656193, i2);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == obj) {
                EEc = DRW.A00(c5Tl, interfaceC16660sJ, 36);
            }
            AbstractC28411CgH.A01(c5xo, null, c28281CdS, c5Tl, A00, c6l4, A0D, null, str, AbstractC25225BEi.A1B(A0K, EEc, false), null, C5UA.A01(c5Tl, new C30535DcI(1, interfaceC16820sZ, num, z), -1077575608), 3, 1, 805306368 | (i2 & 14) | ((i2 >> 3) & 7168), 199686, 6544, z, false, false);
            Boolean valueOf = Boolean.valueOf(z);
            c5Tl.Eno(982722832);
            boolean AH4 = c5Tl.AH4(AJX) | AbstractC25232BEp.A1R(i2 & 57344);
            Object EEc2 = c5Tl.EEc();
            if (AH4 || EEc2 == obj) {
                EEc2 = new PZO(c25338BJh, AJX, null, 0, z);
                c5Tl.FBy(EEc2);
            }
            if (AbstractC25232BEp.A1V(c5Tl, A0K, EEc2, valueOf, false)) {
                C0fH.A00(-1992070914);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUS(interfaceC16660sJ, interfaceC16820sZ, num, str, i, 0, z);
        }
    }
}
