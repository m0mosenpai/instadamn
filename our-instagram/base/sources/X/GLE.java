package X;

import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;

/* loaded from: classes6.dex */
public final class GLE implements Runnable {
    public final /* synthetic */ DirectShareSheetFragment A00;

    public GLE(DirectShareSheetFragment directShareSheetFragment) {
        this.A00 = directShareSheetFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DirectShareSheetFragment directShareSheetFragment = this.A00;
        if (directShareSheetFragment.isAdded()) {
            DirectShareSheetFragment.A0D(directShareSheetFragment);
        }
    }
}
