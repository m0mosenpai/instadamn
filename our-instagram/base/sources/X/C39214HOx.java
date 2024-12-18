package X;

import com.instagram.api.schemas.ClipsACRMidCardSubType;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HOx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39214HOx extends C17T implements JJN {
    public List A00;

    @Override // X.JJN
    public final JJN E92(C1DY c1dy) {
        List A0o = A0o(1939383089, ImmutablePandoMediaDict.class);
        ArrayList A0q = AbstractC167017dG.A0q(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            AbstractC37304Gc5.A1E(c1dy, A0q, it);
        }
        this.A00 = A0q;
        return this;
    }

    @Override // X.JJN
    public final C51785Mup EtV(C1DY c1dy) {
        ClipsACRMidCardSubType clipsACRMidCardSubType = (ClipsACRMidCardSubType) A0N(346870402, C43232J9d.A00);
        String A0h = A0h(-815905284);
        String A0j = A0j(-1850778673);
        String A0j2 = A0j(-574529157);
        List A0o = A0o(1939383089, ImmutablePandoMediaDict.class);
        ArrayList A0q = AbstractC167017dG.A0q(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            AbstractC37304Gc5.A1E(c1dy, A0q, it);
        }
        ArrayList A0i = AbstractC167007dF.A0i(A0q);
        Iterator it2 = A0q.iterator();
        while (it2.hasNext()) {
            AbstractC37304Gc5.A1H(c1dy, A0i, it2);
        }
        List A0o2 = A0o(-724653039, HT1.class);
        ArrayList A0i2 = AbstractC167007dF.A0i(A0o2);
        Iterator it3 = A0o2.iterator();
        while (it3.hasNext()) {
            A0i2.add(((JJH) it3.next()).Ezi());
        }
        return new C51785Mup(clipsACRMidCardSubType, A0h, A0j, A0j2, A0h(-2060497896), A0S(), A0i, A0i2);
    }
}
