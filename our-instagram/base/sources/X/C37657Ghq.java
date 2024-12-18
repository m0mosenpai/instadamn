package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.EnumSet;

/* renamed from: X.Ghq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37657Ghq {
    public final C37531Gfn A00;
    public final ClipsViewerConfig A01;
    public final UserSession A02;
    public final C64842wi A03;
    public final C37522Gfe A04;

    public final void A00() {
        C38321qM c38321qM;
        EnumSet noneOf = EnumSet.noneOf(Trigger.class);
        ClipsViewerConfig clipsViewerConfig = this.A01;
        ClipsViewerSource clipsViewerSource = clipsViewerConfig.A0J;
        if (clipsViewerSource != ClipsViewerSource.A2E && clipsViewerSource != ClipsViewerSource.A1K && clipsViewerSource != ClipsViewerSource.A1J) {
            noneOf.add(Trigger.A0J);
            if (this.A00.A00(this.A04.getModuleName()) && !clipsViewerConfig.A1u) {
                noneOf.add(Trigger.A16);
            }
        }
        String str = clipsViewerConfig.A1I;
        UserSession userSession = this.A02;
        C120985dq A00 = C37621GhG.A00(clipsViewerConfig, userSession, str);
        if (A00 != null && (c38321qM = A00.A02) != null && C14360o3.A0K(AbstractC166987dD.A10(userSession), c38321qM.A2E(userSession))) {
            noneOf.add(Trigger.A1o);
        }
        if (!noneOf.isEmpty()) {
            this.A03.AVr(noneOf);
        }
    }

    public C37657Ghq(C37531Gfn c37531Gfn, ClipsViewerConfig clipsViewerConfig, UserSession userSession, C64842wi c64842wi, C37522Gfe c37522Gfe) {
        this.A02 = userSession;
        this.A01 = clipsViewerConfig;
        this.A04 = c37522Gfe;
        this.A00 = c37531Gfn;
        this.A03 = c64842wi;
    }
}
