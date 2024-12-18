package X;

import com.instagram.api.schemas.ImmutablePandoNoteEmojiReactionInfo;
import com.instagram.api.schemas.NoteEmojiReactionInfoIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.683, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass683 extends C17T implements AnonymousClass684 {
    public List A00;

    public final List A0q() {
        List list = this.A00;
        if (list == null) {
            return A0o(-1122997398, ImmutablePandoNoteEmojiReactionInfo.class);
        }
        return list;
    }

    @Override // X.AnonymousClass684
    public final AnonymousClass688 ExM(C1DY c1dy) {
        C111074zO Ext = ((InterfaceC111084zP) A04(1726143873, AnonymousClass685.class)).Ext();
        List A0q = A0q();
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A0q, 10));
        Iterator it = A0q.iterator();
        while (it.hasNext()) {
            arrayList.add(((NoteEmojiReactionInfoIntf) it.next()).ExK(c1dy));
        }
        return new AnonymousClass688(Ext, arrayList);
    }
}
