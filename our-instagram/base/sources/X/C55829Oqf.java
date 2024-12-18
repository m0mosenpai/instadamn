package X;

import androidx.fragment.app.Fragment;
import com.instagram.archive.fragment.ArchiveReelHighlightsFragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.Oqf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55829Oqf implements YOz {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C55829Oqf(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.YOz
    public final void onFailure() {
        Fragment fragment;
        switch (this.A00) {
            case 0:
                C9GR.A0F(AbstractC31172DnG.A06(this.A01), "unarchive_highlight_failed", 2131963586);
                return;
            case 1:
                fragment = ((C56532P8e) this.A01).A05;
                AbstractC50558MTp.A07(fragment.requireActivity());
                return;
            default:
                fragment = (Fragment) this.A01;
                AbstractC50558MTp.A07(fragment.requireActivity());
                return;
        }
    }

    @Override // X.YOz
    public final void onSuccess() {
        switch (this.A00) {
            case 0:
                ArchiveReelHighlightsFragment archiveReelHighlightsFragment = (ArchiveReelHighlightsFragment) this.A01;
                ArchiveReelHighlightsFragment.A00(archiveReelHighlightsFragment, this.A02);
                C9GR.A07(archiveReelHighlightsFragment.getContext(), 2131963589);
                return;
            case 1:
                C56532P8e c56532P8e = (C56532P8e) this.A01;
                UserSession userSession = c56532P8e.A03;
                Reel A0M = C1OU.A04(userSession).A0M(this.A02);
                if (A0M == null) {
                    return;
                }
                AbstractC25651Mw.A00(userSession).E4s(new C155116y0(A0M));
                AbstractC50558MTp.A09(c56532P8e.A05.requireActivity(), userSession, A0M);
                return;
            default:
                C52167N6w c52167N6w = (C52167N6w) this.A01;
                InterfaceC09390do interfaceC09390do = c52167N6w.A0C;
                Reel A0M2 = C1OU.A04(AbstractC166987dD.A0r(interfaceC09390do)).A0M(this.A02);
                if (A0M2 != null) {
                    AbstractC25651Mw.A00(AbstractC166987dD.A0r(interfaceC09390do)).E4s(new C155116y0(A0M2));
                    AbstractC50558MTp.A09(c52167N6w.requireActivity(), AbstractC166987dD.A0r(interfaceC09390do), A0M2);
                    return;
                }
                return;
        }
    }
}
