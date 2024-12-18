package X;

import com.instagram.creation.capture.quickcapture.storydrafts.model.StoryDraftsStore;
import java.util.List;

/* renamed from: X.Ay3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24781Ay3 implements Runnable {
    public final /* synthetic */ C203238yg A00;
    public final /* synthetic */ StoryDraftsStore A01;
    public final /* synthetic */ boolean A02;

    public RunnableC24781Ay3(C203238yg c203238yg, StoryDraftsStore storyDraftsStore, boolean z) {
        this.A01 = storyDraftsStore;
        this.A00 = c203238yg;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        StoryDraftsStore storyDraftsStore = this.A01;
        List list = storyDraftsStore.A03;
        C203238yg c203238yg = this.A00;
        list.remove(c203238yg);
        list.add(new C203238yg(c203238yg.A02, c203238yg.A03, c203238yg.A04, c203238yg.A07, c203238yg.A08, c203238yg.A05, c203238yg.A06, c203238yg.A00, c203238yg.A01, this.A02));
        StoryDraftsStore.A01(storyDraftsStore);
        StoryDraftsStore.A02(storyDraftsStore, list);
    }
}
