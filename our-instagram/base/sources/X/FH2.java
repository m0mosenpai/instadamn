package X;

import com.instagram.nux.cal.model.ContentText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class FH2 {
    public final List A00;

    public FH2(EnumC33359Eos enumC33359Eos, List list) {
        List A1J;
        C14360o3.A0B(enumC33359Eos, 2);
        if (list == null) {
            A1J = C16930sl.A00;
        } else if (enumC33359Eos != EnumC33359Eos.A04 && enumC33359Eos != EnumC33359Eos.A05 && enumC33359Eos != EnumC33359Eos.A06) {
            ArrayList A1E = AbstractC166987dD.A1E();
            ArrayList A1E2 = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ContentText contentText = (ContentText) it.next();
                Boolean bool = contentText.A00;
                if (bool != null && bool.booleanValue()) {
                    A1E.add(new C34564FKy(AbstractC001800i.A0a(A1E2)));
                    A1E2 = AbstractC166987dD.A1E();
                }
                A1E2.add(contentText);
            }
            A1E.add(new C34564FKy(A1E2));
            A1J = AbstractC001800i.A0a(A1E);
        } else {
            A1J = AbstractC166987dD.A1J(new C34564FKy(list));
        }
        this.A00 = A1J;
    }
}
