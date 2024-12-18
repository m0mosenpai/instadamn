package X;

import com.instagram.share.handleractivity.CustomStoryShareHandlerActivity;

/* loaded from: classes9.dex */
public final class PON implements Runnable {
    public final /* synthetic */ CustomStoryShareHandlerActivity A00;

    public PON(CustomStoryShareHandlerActivity customStoryShareHandlerActivity) {
        this.A00 = customStoryShareHandlerActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.finish();
    }
}
