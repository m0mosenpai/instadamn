package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.archive.intf.ArchivePendingUpload;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Ale, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24042Ale implements InterfaceC146856jN {
    public final FragmentActivity A00;
    public final ArchivePendingUpload A01;
    public final UserSession A02;
    public final IngestSessionShim A03;
    public final IngestSessionShim A04;
    public final C214959fX A05;
    public final C195918ld A06;
    public final InterfaceC16820sZ A07;
    public final boolean A08;
    public final C684436h A09;
    public final C47Z A0A;
    public final C8DP A0B;

    public C24042Ale(FragmentActivity fragmentActivity, ArchivePendingUpload archivePendingUpload, C684436h c684436h, UserSession userSession, IngestSessionShim ingestSessionShim, IngestSessionShim ingestSessionShim2, C214959fX c214959fX, C47Z c47z, C8DP c8dp, C195918ld c195918ld, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        AbstractC167007dF.A1G(userSession, 1, archivePendingUpload);
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A03 = ingestSessionShim;
        this.A04 = ingestSessionShim2;
        this.A01 = archivePendingUpload;
        this.A05 = c214959fX;
        this.A06 = c195918ld;
        this.A0B = c8dp;
        this.A09 = c684436h;
        this.A08 = z;
        this.A0A = c47z;
        this.A07 = interfaceC16820sZ;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.82I, X.0Zx] */
    public static final void A00(EnumC201098ur enumC201098ur, C24042Ale c24042Ale) {
        String str;
        UserSession userSession = c24042Ale.A02;
        C82H A00 = A2L.A00(C196008lp.A00(userSession), c24042Ale.A06.A06());
        C82G c82g = C82G.A0u;
        ?? c0Zx = new C0Zx();
        C47Z c47z = c24042Ale.A0A;
        if (c47z != null) {
            str = c47z.A0H();
        } else {
            str = null;
        }
        c0Zx.A06("waterfall_id", str);
        AbstractC201108us.A00(c82g, enumC201098ur, A00, c0Zx, userSession);
    }

    public final void A01() {
        BottomSheetFragment bottomSheetFragment;
        C214959fX c214959fX = this.A05;
        Fragment fragment = c214959fX.mParentFragment;
        C214959fX c214959fX2 = null;
        if ((fragment instanceof BottomSheetFragment) && (bottomSheetFragment = (BottomSheetFragment) fragment) != null) {
            UserSession userSession = this.A02;
            if (c214959fX instanceof InterfaceC37173GZk) {
                c214959fX2 = c214959fX;
            }
            EOS A00 = F84.A00(userSession, c214959fX2, null, null, false);
            C189478aR c189478aR = bottomSheetFragment.A02;
            if (c189478aR != null) {
                C189448aO c189448aO = new C189448aO(userSession);
                c189448aO.A1O = false;
                c189448aO.A0U = A00;
                c189448aO.A0T = A00;
                c189478aR.A0F(A00, c189448aO);
            }
        }
    }

    public final void A02() {
        UserSession userSession = this.A02;
        Bundle A0b = AbstractC166987dD.A0b();
        FragmentActivity fragmentActivity = this.A00;
        C6XJ c6xj = new C6XJ(fragmentActivity, A0b, userSession, ModalActivity.class, AbstractC111324zv.A00(113));
        c6xj.A07();
        c6xj.A0C(fragmentActivity);
    }

    public final void A03(boolean z) {
        C684436h c684436h = this.A09;
        C214959fX c214959fX = this.A05;
        EnumC33409Epg enumC33409Epg = EnumC33409Epg.STORY_SHARE_SHEET;
        if (z) {
            this.A0B.A00();
        }
        c684436h.A00(c214959fX, enumC33409Epg, 2002, false);
    }

    @Override // X.InterfaceC146856jN
    public final void CyQ(C82G c82g, C41181vS c41181vS) {
        A00(EnumC201098ur.ACCEPT, this);
        this.A06.A05(true, "ig_story_composer");
    }

    @Override // X.InterfaceC146856jN
    public final void D9P(C82G c82g, C41181vS c41181vS) {
        A00(EnumC201098ur.DECLINE, this);
    }

    @Override // X.InterfaceC146856jN
    public final void DmS(C82G c82g, C41181vS c41181vS) {
        A00(EnumC201098ur.OTHER, this);
        this.A06.A04(true);
    }

    @Override // X.InterfaceC146856jN
    public final void Dos() {
        A00(EnumC201098ur.OTHER, this);
        this.A06.A05(false, "ig_story_composer");
    }

    @Override // X.InterfaceC146856jN
    public final void Dp0() {
        A00(EnumC201098ur.ACCEPT, this);
        this.A06.A04(false);
    }
}
