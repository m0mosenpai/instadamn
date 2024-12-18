package X;

import com.instagram.share.handleractivity.StoryShareHandlerActivity;

/* loaded from: classes9.dex */
public final class POO implements Runnable {
    public final /* synthetic */ StoryShareHandlerActivity A00;

    public POO(StoryShareHandlerActivity storyShareHandlerActivity) {
        this.A00 = storyShareHandlerActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.finish();
    }
}
