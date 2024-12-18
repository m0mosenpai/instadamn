package X;

import com.facebook.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4nR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C104614nR extends AbstractC51572Yf {
    public final C101734hi A00;
    public final C51722Yv A01;

    public C104614nR(C51722Yv c51722Yv, C101734hi c101734hi, String str, String str2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(c101734hi, 2);
        C14360o3.A0B(str2, 3);
        this.A00 = c101734hi;
        this.A01 = c51722Yv;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C101734hi c101734hi = this.A00;
        List list = c101734hi.A02;
        C75113Zb c75113Zb = c101734hi.A01;
        C2XI A00 = AbstractC80383iT.A00(c76223bS, Boolean.valueOf(c75113Zb.A1y));
        Object A002 = AbstractC77183d4.A00(c76223bS, new C206839Do(A00, 30), new Object[]{Boolean.valueOf(c75113Zb.A1y), 10});
        AbstractC77313dH.A00(c76223bS, new C9F7(27, A002, c75113Zb), new Object[]{c75113Zb, A002});
        Float valueOf = Float.valueOf(0.0f);
        C2XI A003 = AbstractC80383iT.A00(c76223bS, valueOf);
        C2XI A004 = AbstractC80383iT.A00(c76223bS, valueOf);
        C2XI A005 = AbstractC80383iT.A00(c76223bS, valueOf);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.instagram.tagging.model.Tag) it.next()).getId());
        }
        Object A006 = AbstractC77183d4.A00(c76223bS, new C9FL(13, A003, A004, A005), new Object[]{arrayList});
        AbstractC77313dH.A00(c76223bS, new C206839Do(A006, 29), new Object[]{arrayList});
        if (!c101734hi.A03 && !list.isEmpty() && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((com.instagram.tagging.model.Tag) it2.next()).A00 != null) {
                    if (!((Boolean) A00.A00).booleanValue()) {
                        int dimensionPixelSize = c76223bS.A05.A0C.getResources().getDimensionPixelSize(R.dimen.asset_picker_cell_margin);
                        C51722Yv c51722Yv = this.A01;
                        C77863eE c77863eE = new C77863eE(C05F.A00, new C207179Ew(43, A006, this), "media_tag_hints");
                        if (c51722Yv == C51722Yv.A02) {
                            c51722Yv = null;
                        }
                        return CCI.A00(c76223bS, new C51722Yv(new C51722Yv(c51722Yv, c77863eE), new C77863eE(C05F.A01, new C207179Ew(44, A006, this), null)), new C207239Fc(this, A003, A004, A005, dimensionPixelSize, 1));
                    }
                    return null;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((com.instagram.tagging.model.Tag) it3.next()).A00);
        }
        return null;
    }
}
