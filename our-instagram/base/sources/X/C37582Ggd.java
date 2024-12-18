package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.mediaactions.ScrubberPreviewThumbnailView;
import com.instagram.ui.videothumbnail.ThumbView;
import java.util.List;

/* renamed from: X.Ggd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37582Ggd extends AbstractC37623GhI implements JIH, C38Y {
    public int A00;
    public View A01;
    public View A02;
    public FrameLayout A03;
    public IgTextView A04;
    public ScrubberPreviewThumbnailView A05;
    public C75363a3 A06;
    public List A07;
    public final UserSession A08;
    public final C37560GgG A09;
    public final boolean A0A;
    public final boolean A0B;

    @Override // X.C38Y
    public final /* synthetic */ void DXR(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXS(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXa(int i, int i2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DY0() {
    }

    @Override // X.JIH
    public final void Dby(C120985dq c120985dq, int i, int i2, boolean z) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void Dim(float f, float f2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void Dj0(Integer num) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrV() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrY(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void DzP(C120985dq c120985dq, Integer num, int i) {
        C14360o3.A0B(c120985dq, 0);
        UserSession userSession = this.A08;
        this.A06 = c120985dq.A0A(userSession, num);
        if (AbstractC25470BOj.A00.A0J(c120985dq, userSession)) {
            this.A07 = AbstractC25226BEj.A0y(c120985dq).A0C.CF8();
        }
    }

    public static final int A00(Context context, C37582Ggd c37582Ggd) {
        if (!c37582Ggd.A0A) {
            return context.getResources().getDimensionPixelOffset(AbstractC53242c7.A0H(context, AbstractC57322k7.A01(c37582Ggd.A08))) / 4;
        }
        if (c37582Ggd.A0B) {
            return AbstractC167017dG.A03(context);
        }
        return 0;
    }

    public static final void A01(C37582Ggd c37582Ggd) {
        C120985dq A09;
        View view;
        C37556GgC c37556GgC = ((AbstractC37623GhI) c37582Ggd).A02;
        if (c37556GgC != null && (A09 = c37556GgC.A09(c37582Ggd.A00)) != null && (view = c37582Ggd.A01) != null) {
            view.setVisibility(AbstractC167007dF.A05(c37582Ggd.A02(A09) ? 1 : 0));
        }
    }

    private final boolean A02(C120985dq c120985dq) {
        long j;
        long j2;
        EnumC129395t1 enumC129395t1 = c120985dq.A01;
        if (enumC129395t1 == EnumC129395t1.A02) {
            return AbstractC25470BOj.A00.A0K(c120985dq, this.A08);
        }
        UserSession userSession = this.A08;
        boolean A1X = AbstractC167007dF.A1X(enumC129395t1, EnumC129395t1.A0G);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            j = (long) c38321qM.A0l();
        } else {
            j = 0;
        }
        boolean A03 = AbstractC37655Gho.A03(c120985dq);
        if (A1X) {
            if (A03) {
                j2 = 10;
            } else {
                j2 = 15;
            }
            if (j >= j2 && !(!C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36317620685510059L))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void A0B() {
        C120985dq A09;
        C37556GgC c37556GgC = super.A02;
        if (c37556GgC != null && (A09 = c37556GgC.A09(this.A00)) != null && A02(A09)) {
            C11T.A02(new BST(this, 0));
        }
    }

    @Override // X.C38Y
    public final void DXc(int i, int i2) {
        ScrubberPreviewThumbnailView scrubberPreviewThumbnailView;
        this.A00 = i;
        A01(this);
        UserSession userSession = this.A08;
        if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36317620685378986L) && (scrubberPreviewThumbnailView = this.A05) != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(scrubberPreviewThumbnailView.A01.getLayoutParams());
            layoutParams.gravity = 8388691;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = 0;
            ViewGroup viewGroup = scrubberPreviewThumbnailView.A01;
            viewGroup.setLayoutParams(layoutParams);
            scrubberPreviewThumbnailView.A02.setText("");
            viewGroup.setVisibility(8);
            ThumbView thumbView = scrubberPreviewThumbnailView.A04;
            if (thumbView != null) {
                ThumbView.A00(thumbView);
                thumbView.A04 = null;
                thumbView.A02 = null;
                thumbView.A03 = null;
                thumbView.A05 = false;
                thumbView.invalidate();
            }
            scrubberPreviewThumbnailView.A03 = null;
        }
    }

    @Override // X.JIH
    public final void E1V() {
    }

    public C37582Ggd(UserSession userSession, C37560GgG c37560GgG, boolean z, boolean z2) {
        AbstractC167017dG.A1P(userSession, c37560GgG);
        this.A08 = userSession;
        this.A09 = c37560GgG;
        this.A0A = z;
        this.A0B = z2;
    }

    @Override // X.JIH
    public final void D8r(C120985dq c120985dq, List list) {
    }

    @Override // X.JIH
    public final void Dbv(C25370BKn c25370BKn, boolean z) {
    }

    @Override // X.JIH
    public final void DzC(C120985dq c120985dq, int i, int i2) {
    }

    @Override // X.JIH
    public final void DzJ(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void DzL(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void E1U(C120985dq c120985dq, InterfaceC31077DlK interfaceC31077DlK, boolean z) {
    }

    @Override // X.JIH
    public final void DzO(C120985dq c120985dq, C37644Ghd c37644Ghd, C37563GgJ c37563GgJ, C25370BKn c25370BKn, boolean z) {
    }
}
