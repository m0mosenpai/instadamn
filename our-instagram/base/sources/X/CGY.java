package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class CGY {
    public static final C51756Mtf A00(List list) {
        ImageUrl imageUrl;
        List A0d = AbstractC001800i.A0d(list, 3);
        ArrayList A0q = AbstractC167017dG.A0q(A0d);
        Iterator it = A0d.iterator();
        while (it.hasNext()) {
            User CDj = ((InterfaceC103524lS) it.next()).CDj();
            if (CDj != null) {
                imageUrl = CDj.Bhu();
            } else {
                imageUrl = null;
            }
            A0q.add(imageUrl);
        }
        return new C51756Mtf((List) A0q, 31);
    }
}
