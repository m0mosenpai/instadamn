package X;

import com.instagram.api.schemas.NoteEmojiReactionInfoIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Hqd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40110Hqd {
    public static AnonymousClass684 A00(AnonymousClass684 anonymousClass684, InterfaceC111084zP interfaceC111084zP, List list) {
        Object anonymousClass688;
        int A00 = AbstractC37301Gc2.A00(new C37761pD(null));
        if (anonymousClass684 instanceof AnonymousClass683) {
            C09530e4 A1L = AbstractC166987dD.A1L("paging_info", interfaceC111084zP.F7o());
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                NoteEmojiReactionInfoIntf noteEmojiReactionInfoIntf = (NoteEmojiReactionInfoIntf) it.next();
                if (noteEmojiReactionInfoIntf != null) {
                    A1E.add(noteEmojiReactionInfoIntf.F7o());
                }
            }
            anonymousClass688 = AbstractC37303Gc4.A06(anonymousClass684, AbstractC25229BEm.A1b("reactions", A1E, A1L));
        } else {
            C1DY A0C = AbstractC37302Gc3.A0C(A00);
            C111074zO Ext = interfaceC111084zP.Ext();
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                A0q.add(((NoteEmojiReactionInfoIntf) it2.next()).ExK(A0C));
            }
            anonymousClass688 = new AnonymousClass688(Ext, A0q);
        }
        return (AnonymousClass684) anonymousClass688;
    }
}
