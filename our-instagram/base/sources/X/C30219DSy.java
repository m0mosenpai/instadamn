package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.JITProfilePQR;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.DSy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30219DSy extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30219DSy(int i, int i2, Object obj, Object obj2, Object obj3) {
        super(2);
        this.A00 = i2;
        this.A03 = obj;
        this.A04 = obj2;
        this.A02 = obj3;
        this.A01 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                AbstractC28319Ce7.A02(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A03, (List) this.A02, (InterfaceC16660sJ) this.A04, AbstractC25225BEi.A04(this.A01));
                return C0eB.A00;
            case 1:
                AbstractC28500Cht.A05(AbstractC25226BEj.A0S(obj, obj2), (C6V) this.A02, (C26218Bii) this.A03, (C45994KXi) this.A04, AbstractC25225BEi.A04(this.A01));
                return C0eB.A00;
            case 2:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                C45292K2u c45292K2u = (C45292K2u) this.A04;
                AbstractC28396Cg2.A01(A0S, (LLR) this.A03, (C47447Kxc) this.A02, c45292K2u, AbstractC25225BEi.A04(this.A01));
                return C0eB.A00;
            case 3:
                BG8.A07(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A03, (AbstractC27441C9j) this.A02, (InterfaceC16660sJ) this.A04, AbstractC25225BEi.A04(this.A01));
                return C0eB.A00;
            case 4:
                BG8.A06(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A03, (BJ3) this.A02, (InterfaceC16660sJ) this.A04, AbstractC25225BEi.A04(this.A01));
                return C0eB.A00;
            case 5:
                AbstractC28498Chr.A01((LazyListState) this.A04, AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A03, (InterfaceC16660sJ) this.A02, AbstractC25225BEi.A04(this.A01));
                return C0eB.A00;
            case 6:
                C5Tl c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0C(obj2) == 2 && c5Tl.Bxj()) {
                    c5Tl.Em9();
                } else {
                    if (C0fH.A02()) {
                        C0fH.A01(2134158277, "com.instagram.partnerprogram.fragment.CategoryListComponent.<anonymous> (PublisherControlBlockedCategoriesComposeFragment.kt:191)");
                    }
                    C1130158n c1130158n = Modifier.A00;
                    Modifier A02 = AbstractC28285CdX.A02(c5Tl, c1130158n);
                    IGRevShareProductType iGRevShareProductType = (IGRevShareProductType) this.A04;
                    int i = this.A01;
                    InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A03;
                    List list = (List) this.A02;
                    InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
                    int A00 = C5X2.A00(c5Tl);
                    C117505Tk c117505Tk = (C117505Tk) c5Tl;
                    C59P A04 = C117505Tk.A04(c117505Tk);
                    Modifier A01 = C5X3.A01(c5Tl, A02);
                    AbstractC25233BEq.A11(c5Tl, c117505Tk);
                    AbstractC25231BEo.A12(c5Tl, A0Y, A04);
                    InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                    if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
                    }
                    AbstractC25225BEi.A1K(c5Tl, A01);
                    int ordinal = iGRevShareProductType.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 0) {
                                c5Tl.Eno(105283950);
                            } else {
                                throw AbstractC25231BEo.A0v(c5Tl, c117505Tk, 105274627, false);
                            }
                        } else {
                            c5Tl.Eno(105280706);
                            AbstractC28398Cg4.A02(c5Tl, interfaceC16660sJ, i, 0);
                        }
                    } else {
                        c5Tl.Eno(105276866);
                        AbstractC28398Cg4.A03(c5Tl, interfaceC16660sJ, i, 0);
                    }
                    C117505Tk.A0L(c117505Tk, false);
                    Iterator A0x = AbstractC25227BEk.A0x(c5Tl, list, 105285482);
                    int i2 = 0;
                    while (A0x.hasNext()) {
                        Object next = A0x.next();
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            AbstractC16960so.A1U();
                            throw C00O.createAndThrow();
                        }
                        C51722Msz c51722Msz = (C51722Msz) next;
                        AbstractC25705BXp.A0M(c5Tl, c1130158n, new C29196Cu1(new C30171DRb(i2, 7, c51722Msz, interfaceC16660sJ), c51722Msz.A03), c51722Msz.A02, c51722Msz.A04);
                        i2 = i3;
                    }
                    if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                        C0fH.A00(-1223309046);
                    }
                }
                return C0eB.A00;
            case 7:
                AbstractC28468ChK.A03(AbstractC25226BEj.A0S(obj, obj2), (C26060Bfn) this.A04, (InterfaceC16820sZ) this.A02, (InterfaceC16820sZ) this.A03, AbstractC25225BEi.A04(this.A01));
                return C0eB.A00;
            case 8:
                AbstractC28468ChK.A05(AbstractC25226BEj.A0S(obj, obj2), (C26060Bfn) this.A04, (InterfaceC16820sZ) this.A02, (InterfaceC16660sJ) this.A03, AbstractC25225BEi.A04(this.A01));
                return C0eB.A00;
            case 9:
                AbstractC28324CeC.A01(AbstractC25226BEj.A0S(obj, obj2), (AbstractC151906sa) this.A02, (InterfaceC16820sZ) this.A03, (InterfaceC16820sZ) this.A04, AbstractC25225BEi.A04(this.A01));
                return C0eB.A00;
            case 10:
                AbstractC28329CeH.A00(AbstractC25226BEj.A0S(obj, obj2), (ImmutableList) this.A04, (InterfaceC16820sZ) this.A03, (InterfaceC16820sZ) this.A02, AbstractC25225BEi.A04(this.A01));
                return C0eB.A00;
            case 11:
                AbstractC25704BXo.A00(AbstractC25226BEj.A0S(obj, obj2), (C25714BXz) this.A04, (SettingsScreenViewModel) this.A02, (InterfaceC16620sF) this.A03, AbstractC25225BEi.A04(this.A01));
                return C0eB.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            default:
                CKL.A00(AbstractC25226BEj.A0S(obj, obj2), (SettingsScreenViewModel) this.A03, (C26230Biu) this.A04, (InterfaceC16660sJ) this.A02, AbstractC25225BEi.A04(this.A01));
                return C0eB.A00;
            case 14:
                AbstractC28408CgE.A02(AbstractC25226BEj.A0S(obj, obj2), (InterfaceC58202Pr8) this.A04, (C211819a8) this.A03, (InterfaceC16660sJ) this.A02, AbstractC25225BEi.A04(this.A01));
                return C0eB.A00;
        }
    }
}
