package X;

import com.instagram.api.schemas.ImmutablePandoTrackData;
import com.instagram.api.schemas.TrackData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HT1 extends C17T implements JJH {
    @Override // X.JJH
    public final C51797Mv1 Ezi() {
        List A0n = A0n(2140775389);
        if (A0n == null) {
            A0n = C16930sl.A00;
        }
        List A0o = A0o(335261151, HT2.class);
        ArrayList A0q = AbstractC167017dG.A0q(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            A0q.add(((InterfaceC43512JJy) it.next()).Ezj());
        }
        return new C51797Mv1(((TrackData) A04(1159450142, ImmutablePandoTrackData.class)).F3P(), A0n, A0q, getIntValueByHashCode(635235326));
    }
}
