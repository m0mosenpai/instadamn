package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes8.dex */
public final class LES {
    public L2Y A00;
    public final UserSession A01;
    public final Queue A02 = new LinkedList();

    public static final void A00(LES les) {
        C45115Jxk c45115Jxk = (C45115Jxk) les.A02.poll();
        if (c45115Jxk != null) {
            MHS A00 = MHS.A00(les, 38);
            IgImageView igImageView = (IgImageView) c45115Jxk.A03;
            les.A00 = C47985LJk.A00.A02(AbstractC43679JTn.A00(AbstractC166997dE.A0L(igImageView), c45115Jxk, les.A01), igImageView, (IgImageView) c45115Jxk.A04, c45115Jxk.A06, A00, false);
        }
    }

    public LES(UserSession userSession) {
        this.A01 = userSession;
    }
}
