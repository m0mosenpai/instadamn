package X;

import com.instagram.model.keyword.Keyword;
import java.util.Iterator;

/* renamed from: X.Wmj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71028Wmj implements XBJ {
    public final /* synthetic */ Keyword A00;
    public final /* synthetic */ Tx0 A01;
    public final /* synthetic */ C66152U1t A02;
    public final /* synthetic */ String A03;

    public C71028Wmj(Keyword keyword, Tx0 tx0, C66152U1t c66152U1t, String str) {
        this.A01 = tx0;
        this.A02 = c66152U1t;
        this.A00 = keyword;
        this.A03 = str;
    }

    @Override // X.XBJ
    public final void EKb() {
        if (this.A01.A0F) {
            AbstractC66132U0y.A00(this.A02.A01).A00(this.A00);
        }
        java.util.Set set = this.A02.A05;
        String str = this.A03;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((XBG) it.next()).CMd(str);
        }
    }
}
