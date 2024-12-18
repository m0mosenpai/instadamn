package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.leadgen.core.api.LeadGenInfoFieldDataIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Nuw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54046Nuw {
    public static LeadForm A00(ImageUrl imageUrl, Boolean bool, String str, String str2, String str3, List list) {
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(((LeadGenInfoFieldDataIntf) it.next()).F52());
        }
        return new LeadForm(imageUrl, bool, str, str2, str3, A0q);
    }
}
