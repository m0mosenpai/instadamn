package X;

import android.widget.FrameLayout;
import com.instagram.direct.inbox.notes.ui.NoteAvatarView;

/* renamed from: X.AwQ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24685AwQ implements Runnable {
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ NoteAvatarView A01;

    public RunnableC24685AwQ(FrameLayout frameLayout, NoteAvatarView noteAvatarView) {
        this.A00 = frameLayout;
        this.A01 = noteAvatarView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[2];
        FrameLayout frameLayout = this.A00;
        frameLayout.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        NoteAvatarView noteAvatarView = this.A01;
        noteAvatarView.A08.getLocationInWindow(iArr2);
        if (iArr[0] > -1 && iArr[1] > -1) {
            int i = ((-((noteAvatarView.A08.getWidth() + iArr2[0]) - frameLayout.getWidth())) / 2) + iArr[0];
            int i2 = ((-noteAvatarView.A08.getHeight()) - iArr2[1]) + iArr[1];
            noteAvatarView.A08.setTranslationX(i);
            noteAvatarView.A08.setTranslationY(i2);
            AnonymousClass693 anonymousClass693 = noteAvatarView.A03;
            if (anonymousClass693 != null) {
                anonymousClass693.A8x(new C46074KaV(noteAvatarView, 3));
            }
            AnonymousClass693 anonymousClass6932 = noteAvatarView.A03;
            if (anonymousClass6932 != null) {
                anonymousClass6932.E4S();
            }
        }
    }
}
