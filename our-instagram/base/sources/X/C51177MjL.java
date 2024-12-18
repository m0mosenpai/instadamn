package X;

import com.instagram.reels.storiestemplate.discovery.view.StoryTemplateDiscoverySurfaceFragment;

/* renamed from: X.MjL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51177MjL extends AbstractC65392xb {
    public final /* synthetic */ StoryTemplateDiscoverySurfaceFragment A00;

    public C51177MjL(StoryTemplateDiscoverySurfaceFragment storyTemplateDiscoverySurfaceFragment) {
        this.A00 = storyTemplateDiscoverySurfaceFragment;
    }

    @Override // X.AbstractC65392xb
    public final void onItemRangeInserted(int i, int i2) {
        this.A00.logTemplateImpression();
    }
}
