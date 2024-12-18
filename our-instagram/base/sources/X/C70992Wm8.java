package X;

import com.instagram.music.common.model.LyricsPhrase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Wm8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70992Wm8 implements InterfaceC71984XDt {
    public final C70076W1t A00;
    public final List A01;
    public final List A02;

    @Override // X.InterfaceC71984XDt
    public final int AYr(int i) {
        return VW8.A00(this.A01, i);
    }

    @Override // X.InterfaceC71984XDt
    public final String Bd2(int i) {
        if (i >= 0) {
            List list = this.A01;
            if (i < list.size()) {
                return ((LyricsPhrase) list.get(i)).A01;
            }
        }
        throw AbstractC31172DnG.A0u();
    }

    @Override // X.InterfaceC71984XDt
    public final int Bd3() {
        return this.A01.size();
    }

    @Override // X.InterfaceC71984XDt
    public final int Bzm(int i) {
        if (i >= 0) {
            List list = this.A01;
            if (i < list.size()) {
                return ((LyricsPhrase) list.get(i)).A00;
            }
        }
        throw AbstractC31172DnG.A0u();
    }

    public C70992Wm8(C70076W1t c70076W1t, List list) {
        int size;
        this.A02 = list;
        this.A00 = c70076W1t;
        ArrayList arrayList = new ArrayList();
        List A00 = new C69590Vrt(c70076W1t, list).A00();
        StringBuilder sb = new StringBuilder();
        int size2 = A00.size();
        int i = 0;
        while (i < size2) {
            sb.setLength(0);
            int A01 = AbstractC31176DnK.A01(A00, i);
            i++;
            Number number = (Number) AbstractC001800i.A0O(A00, i);
            if (number != null) {
                size = number.intValue();
            } else {
                size = list.size();
            }
            Iterator it = list.subList(A01, size).iterator();
            while (it.hasNext()) {
                sb.append(((US9) it.next()).A06);
                sb.append(" ");
            }
            arrayList.add(new LyricsPhrase(null, ((US9) list.get(A01)).A00() + 750, AbstractC166987dD.A19(sb)));
        }
        this.A01 = arrayList;
    }
}
