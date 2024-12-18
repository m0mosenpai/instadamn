package X;

import com.instagram.archive.fragment.ArchiveReelCalendarFragment;
import com.instagram.model.reels.Reel;
import java.util.Map;

/* renamed from: X.LvQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49571LvQ implements C51R {
    public final /* synthetic */ C51378Mmd A00;
    public final /* synthetic */ ArchiveReelCalendarFragment A01;
    public final /* synthetic */ Reel A02;

    public C49571LvQ(C51378Mmd c51378Mmd, ArchiveReelCalendarFragment archiveReelCalendarFragment, Reel reel) {
        this.A01 = archiveReelCalendarFragment;
        this.A00 = c51378Mmd;
        this.A02 = reel;
    }

    @Override // X.C51R
    public final void DqI(Map map) {
        ArchiveReelCalendarFragment archiveReelCalendarFragment = this.A01;
        archiveReelCalendarFragment.A0F.remove(this);
        if (ArchiveReelCalendarFragment.A05(archiveReelCalendarFragment)) {
            ArchiveReelCalendarFragment.A00(this.A00, archiveReelCalendarFragment, this.A02);
        }
    }

    @Override // X.C51R
    public final void onFailure() {
        ArchiveReelCalendarFragment archiveReelCalendarFragment = this.A01;
        archiveReelCalendarFragment.A0F.remove(this);
        if (ArchiveReelCalendarFragment.A05(archiveReelCalendarFragment)) {
            ArchiveReelCalendarFragment.A01(this.A00, archiveReelCalendarFragment, this.A02);
        }
    }
}
