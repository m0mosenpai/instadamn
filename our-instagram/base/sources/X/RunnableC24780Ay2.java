package X;

import com.instagram.creation.capture.quickcapture.storydrafts.model.StoryDraftsStore;
import java.util.List;

/* renamed from: X.Ay2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24780Ay2 implements Runnable {
    public final /* synthetic */ C203238yg A00;
    public final /* synthetic */ StoryDraftsStore A01;
    public final /* synthetic */ String A02;

    public RunnableC24780Ay2(C203238yg c203238yg, StoryDraftsStore storyDraftsStore, String str) {
        this.A01 = storyDraftsStore;
        this.A00 = c203238yg;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        StoryDraftsStore storyDraftsStore = this.A01;
        List list = storyDraftsStore.A03;
        AnonymousClass016.A1A(list, new C50361MLn(this.A02, 23));
        C203238yg c203238yg = this.A00;
        list.add(0, c203238yg);
        StoryDraftsStore.A01(storyDraftsStore);
        StoryDraftsStore.A02(storyDraftsStore, list);
        for (C194698jV c194698jV : storyDraftsStore.A04) {
            C14360o3.A0B(c203238yg, 0);
            c194698jV.A00.A05.F8s(new C23089AFx(c203238yg));
        }
    }
}
