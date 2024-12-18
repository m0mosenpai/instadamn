package X;

import com.instagram.api.schemas.AudioBrowserCategoryType;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class HNT extends C17T implements InterfaceC43529JKp {
    public List A00;

    @Override // X.InterfaceC43529JKp
    public final AudioBrowserCategoryType Amc() {
        return (AudioBrowserCategoryType) A0N(338885083, J9D.A00);
    }

    @Override // X.InterfaceC43529JKp
    public final List Bfr() {
        List list = this.A00;
        if (list == null) {
            return A0o(696989833, C39245HRi.class);
        }
        return list;
    }

    @Override // X.InterfaceC43529JKp
    public final String getId() {
        return A0h(3355);
    }

    @Override // X.InterfaceC43529JKp
    public final InterfaceC43529JKp E8o(C1DY c1dy) {
        List<JJV> Bfr = Bfr();
        ArrayList A0q = AbstractC167017dG.A0q(Bfr);
        for (JJV jjv : Bfr) {
            jjv.E9a(c1dy);
            A0q.add(jjv);
        }
        this.A00 = A0q;
        return this;
    }

    @Override // X.InterfaceC43529JKp
    public final String getTitle() {
        return A0S();
    }
}
