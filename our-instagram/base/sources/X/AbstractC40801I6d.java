package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.I6d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40801I6d {
    public static final C42923Iyb A00(UserSession userSession, HBA hba, JID jid) {
        AbstractC42328Ioq A00;
        C14360o3.A0B(userSession, 0);
        IKJ ikj = new IKJ(userSession, hba, jid);
        for (IJD ijd : hba.A04) {
            C14360o3.A0B(ijd, 0);
            if (ijd.A02 != null && (A00 = AbstractC40800I6c.A00(ikj.A02, ijd)) != null) {
                List list = ikj.A07;
                if (!list.isEmpty()) {
                    AbstractC42328Ioq abstractC42328Ioq = (AbstractC42328Ioq) list.get(AbstractC31172DnG.A03(list, 1));
                    C14360o3.A0B(abstractC42328Ioq, 0);
                    Integer num = A00.A01;
                    if (num == C05F.A09 && abstractC42328Ioq.A01 == num && C14360o3.A0K(abstractC42328Ioq.A02, A00.A02)) {
                        AbstractC42328Ioq abstractC42328Ioq2 = (AbstractC42328Ioq) list.get(AbstractC31172DnG.A03(list, 1));
                        C14360o3.A0B(abstractC42328Ioq2, 0);
                        Integer num2 = abstractC42328Ioq2.A01;
                        if (num2.intValue() == 17) {
                            throw AbstractC166987dD.A15("mId");
                        }
                        throw AbstractC167007dF.A0c("Unsupported PDP concatenated section type ", I88.A00(num2));
                    }
                }
                list.add(A00);
                Integer num3 = A00.A01;
                if (num3 == C05F.A0I) {
                    ikj.A01 = true;
                }
                if (num3 == C05F.A0H) {
                    ikj.A00 = true;
                }
            }
        }
        return new C42923Iyb(ikj);
    }
}
