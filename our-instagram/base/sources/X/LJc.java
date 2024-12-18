package X;

import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class LJc {
    public int A00;
    public C1ON A01;
    public KC1 A02;
    public C45195Jzb A03;
    public final C41761wQ A04;
    public final C47559KzU A05;
    public final C47359Kw8 A06;
    public final C3o9 A07;
    public final C18A A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final List A0C;
    public final Map A0D;
    public final boolean A0E;
    public final boolean A0F;

    public static final void A00(LJc lJc) {
        C2EC c2ec;
        C2EC c2ec2;
        KC1 kc1 = lJc.A02;
        if (kc1 != null) {
            boolean A02 = A02(lJc);
            if (kc1.A09 && (c2ec = kc1.A06) != null && c2ec.BI1() == 7 && (c2ec2 = kc1.A06) != null && !c2ec2.CPZ()) {
                IgdsBottomButtonLayout igdsBottomButtonLayout = kc1.A08;
                if (igdsBottomButtonLayout != null) {
                    igdsBottomButtonLayout.setPrimaryButtonEnabled(false);
                    return;
                }
                return;
            }
            IgdsBottomButtonLayout igdsBottomButtonLayout2 = kc1.A08;
            if (igdsBottomButtonLayout2 == null) {
                return;
            }
            igdsBottomButtonLayout2.setPrimaryButtonEnabled(A02);
        }
    }

    public static final void A01(LJc lJc) {
        String str;
        C47559KzU c47559KzU = lJc.A05;
        C45195Jzb c45195Jzb = lJc.A03;
        if (c45195Jzb != null) {
            List list = lJc.A0C;
            List list2 = lJc.A0B;
            AbstractC167017dG.A1P(list, list2);
            ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
            A0E.A00(c45195Jzb);
            A0E.A01(list);
            A0E.A01(list2);
            C66362zD c66362zD = c47559KzU.A00;
            if (c66362zD != null) {
                c66362zD.A05(A0E);
                KC1 kc1 = lJc.A02;
                if (kc1 != null) {
                    AbstractC167007dF.A0x(kc1.A00);
                    AbstractC167007dF.A0w(kc1.A01);
                    return;
                }
                return;
            }
            str = "igRecyclerViewAdapter";
        } else {
            str = "questionViewModel";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final boolean A02(LJc lJc) {
        if (!(!lJc.A0D.isEmpty())) {
            List list = lJc.A0B;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CharSequence charSequence = ((C45204Jzk) it.next()).A00;
                if (charSequence != null && charSequence.length() != 0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.2zJ, java.lang.Object] */
    public LJc(KC1 kc1, C47559KzU c47559KzU, C47359Kw8 c47359Kw8, C3o9 c3o9, C18A c18a, String str, String str2, boolean z, boolean z2) {
        AbstractC167017dG.A1Q(c3o9, c18a);
        this.A07 = c3o9;
        this.A0A = str;
        this.A08 = c18a;
        this.A05 = c47559KzU;
        this.A09 = str2;
        this.A06 = c47359Kw8;
        this.A0F = z;
        this.A0E = z2;
        this.A02 = kc1;
        this.A04 = AbstractC31174DnI.A0S();
        this.A0D = AbstractC166987dD.A1I();
        this.A0C = AbstractC166987dD.A1E();
        this.A0B = AbstractC166987dD.A1E();
        L6H l6h = new L6H(this);
        C66392zG A00 = C66362zD.A00(c47559KzU.A01);
        A00.A01(new Object());
        A00.A01(new KHU(l6h));
        c47559KzU.A00 = AbstractC31173DnH.A0R(A00, new KIV(l6h));
    }
}
