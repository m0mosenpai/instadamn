package X;

import com.instagram.creation.capture.quickcapture.storydrafts.model.StoryDraftsStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Avr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24657Avr implements Runnable {
    public final /* synthetic */ StoryDraftsStore A00;
    public final /* synthetic */ java.util.Set A01;

    public RunnableC24657Avr(StoryDraftsStore storyDraftsStore, java.util.Set set) {
        this.A00 = storyDraftsStore;
        this.A01 = set;
    }

    @Override // java.lang.Runnable
    public final void run() {
        StoryDraftsStore storyDraftsStore = this.A00;
        List list = storyDraftsStore.A03;
        AnonymousClass016.A1A(list, new C57747Pja(this.A01, 1));
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(AbstractC203228yf.A00((C203238yg) it.next()));
        }
        java.util.Set A0k = AbstractC001800i.A0k(A0q);
        InterfaceC19610xo ARD = storyDraftsStore.A02.A01.ARD();
        ARD.E7L("story_drafts", A0k);
        ARD.apply();
        StoryDraftsStore.A02(storyDraftsStore, list);
    }
}
