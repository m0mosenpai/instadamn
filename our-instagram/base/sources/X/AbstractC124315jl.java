package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.5jl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC124315jl {
    public static final String A00(Collection collection) {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0c();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C124305jk c124305jk = (C124305jk) it.next();
                A0A.A0d();
                A0A.A0S("signal_id", c124305jk.A07);
                A0A.A0S("container_module", c124305jk.A04);
                A0A.A0S("inventory_source", c124305jk.A05);
                A0A.A0S("author_id", c124305jk.A02);
                A0A.A0S("item_id", c124305jk.A06);
                A0A.A0Q("item_type", c124305jk.A00);
                A0A.A0M("media_ids");
                Iterator it2 = c124305jk.A08.iterator();
                while (it2.hasNext()) {
                    A0A.A0u((String) it2.next());
                }
                A0A.A0Z();
                A0A.A0R("click_timestamp", c124305jk.A01);
                A0A.A0S("click_media_id", c124305jk.A03);
                A0A.A0a();
            }
            A0A.A0Z();
            A0A.close();
            return stringWriter.toString();
        } catch (IOException e) {
            C0K8.A0H("LikeUnlikeClickRealtimeInfo", "Unable to serialize collection.", e);
            return "";
        }
    }
}
