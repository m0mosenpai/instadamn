package X;

import com.instagram.creation.capture.quickcapture.storydrafts.model.StoryDraftsStore;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class B03 implements Runnable {
    public final /* synthetic */ C196948nP A00;
    public final /* synthetic */ C196948nP A01;
    public final /* synthetic */ C203248yh A02;
    public final /* synthetic */ C203238yg A03;
    public final /* synthetic */ InterfaceC25186BCj A04;
    public final /* synthetic */ StoryDraftsStore A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;

    public B03(C196948nP c196948nP, C196948nP c196948nP2, C203248yh c203248yh, C203238yg c203238yg, InterfaceC25186BCj interfaceC25186BCj, StoryDraftsStore storyDraftsStore, String str, String str2, String str3, boolean z) {
        this.A05 = storyDraftsStore;
        this.A00 = c196948nP;
        this.A01 = c196948nP2;
        this.A02 = c203248yh;
        this.A08 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A03 = c203238yg;
        this.A09 = z;
        this.A04 = interfaceC25186BCj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis;
        StoryDraftsStore storyDraftsStore = this.A05;
        C196948nP c196948nP = this.A00;
        C196948nP c196948nP2 = this.A01;
        C203248yh c203248yh = this.A02;
        String str = this.A08;
        String str2 = this.A07;
        String str3 = this.A06;
        C203238yg c203238yg = this.A03;
        boolean z = this.A09;
        if (c203238yg != null) {
            currentTimeMillis = c203238yg.A00;
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        C203238yg c203238yg2 = new C203238yg(c196948nP, c196948nP2, c203248yh, str2, AbstractC167017dG.A0j(), str3, str, currentTimeMillis, System.currentTimeMillis(), z);
        try {
            C11T.A02(new RunnableC24780Ay2(c203238yg2, storyDraftsStore, str2));
            InterfaceC25186BCj interfaceC25186BCj = this.A04;
            if (interfaceC25186BCj != null) {
                interfaceC25186BCj.Dps(c203238yg2);
            }
        } catch (IOException e) {
            AbstractC12120kG.A0F("StoryDraftsStore", "Failed to save story draft", e);
            InterfaceC25186BCj interfaceC25186BCj2 = this.A04;
            if (interfaceC25186BCj2 != null) {
                interfaceC25186BCj2.onError(AnonymousClass001.A0R("StoryDraftStore#save failed ", c196948nP.A02()));
            }
        }
    }
}
