package X;

import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ahi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23889Ahi implements InterfaceC58037PoN {
    public final /* synthetic */ C8JT A00;
    public final /* synthetic */ C128175qm A01;

    public C23889Ahi(C8JT c8jt, C128175qm c128175qm) {
        this.A00 = c8jt;
        this.A01 = c128175qm;
    }

    @Override // X.InterfaceC58037PoN
    public final void DBn(List list) {
        String str;
        C8JT c8jt = this.A00;
        ClipsCreationViewModel clipsCreationViewModel = c8jt.A1n;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(new C8ZT(it.next()));
        }
        clipsCreationViewModel.A0K.A0C(A0q);
        AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) AbstractC001800i.A0L(list);
        if (audioOverlayTrack != null) {
            C128175qm c128175qm = this.A01;
            C447024a c447024a = AnonymousClass229.A01(c8jt.A1D).A02;
            String str2 = c128175qm.A0T;
            String str3 = audioOverlayTrack.A0A;
            String str4 = audioOverlayTrack.A0B;
            MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
            if (musicAssetModel != null) {
                str = musicAssetModel.A0I;
            } else {
                str = null;
            }
            c447024a.A05(str2, str3, str4, str);
        }
    }

    @Override // X.InterfaceC58037PoN
    public final void DBo() {
        C8JT c8jt = this.A00;
        if (c8jt.A0l) {
            C9GR.A0F(c8jt.A11, "music_track_not_available", 2131968067);
            C8JT.A0b(c8jt);
            c8jt.A1h.A04();
        }
    }
}
