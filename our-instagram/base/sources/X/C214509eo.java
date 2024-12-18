package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9eo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214509eo extends C40781ul implements InterfaceC74303Vl {
    public String A00;
    public List A01;
    public boolean A02;
    public boolean A03;

    @Override // X.InterfaceC74303Vl
    public final boolean CQG() {
        return true;
    }

    @Override // X.InterfaceC74303Vl
    public final boolean CQT() {
        return false;
    }

    public final List A00() {
        List<URL> list = this.A01;
        list.getClass();
        ArrayList A0q = AbstractC167017dG.A0q(list);
        for (URL url : list) {
            C14360o3.A0B(url, 0);
            A0q.add(new AlC(url, AlC.A03));
        }
        return A0q;
    }

    @Override // X.InterfaceC74303Vl
    public final String getNextMaxId() {
        return this.A00;
    }
}
