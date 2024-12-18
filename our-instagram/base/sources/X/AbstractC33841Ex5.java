package X;

import com.facebook.R;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ex5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33841Ex5 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        List list = c6fw.A00;
        if (list.size() >= 4) {
            Map map = (Map) AbstractC166987dD.A16(list);
            Object A02 = c6fw.A02();
            AbstractC25225BEi.A1S(A02);
            String str = (String) A02;
            InterfaceC103384lE A00 = C1344465q.A00(c6fw.A00());
            InterfaceC103384lE A002 = C1344465q.A00(c6fw.A03(3));
            C34722FRj c34722FRj = (C34722FRj) C6BQ.A0F(c6fq, C34722FRj.class, R.id.ixt_event_ended_handler);
            if (c34722FRj != null && map != null && A00 != null && A002 != null) {
                ImmutableList.Builder builder = new ImmutableList.Builder();
                Iterator A15 = AbstractC166997dE.A15(map);
                while (A15.hasNext()) {
                    builder.add((Object) C6BQ.A0G(AbstractC31176DnK.A0j(A15)));
                }
                c34722FRj.A03(c6fq, A00, A002, str, AbstractC31172DnG.A0K(builder));
            }
        }
        return null;
    }
}
