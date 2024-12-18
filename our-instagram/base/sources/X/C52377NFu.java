package X;

import android.graphics.Rect;
import com.instagram.archive.fragment.SelectHighlightsCoverFragment;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.NFu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52377NFu extends C42H {
    public final /* synthetic */ SelectHighlightsCoverFragment A00;

    public C52377NFu(SelectHighlightsCoverFragment selectHighlightsCoverFragment) {
        this.A00 = selectHighlightsCoverFragment;
    }

    @Override // X.C42H, X.InterfaceC62892tS
    public final void DXP(int i, int i2) {
        SelectHighlightsCoverFragment selectHighlightsCoverFragment = this.A00;
        if (selectHighlightsCoverFragment.A01.getItem(i) instanceof C38321qM) {
            C38321qM c38321qM = (C38321qM) selectHighlightsCoverFragment.A01.getItem(i);
            ExtendedImageUrl A1q = c38321qM.A1q(selectHighlightsCoverFragment.requireContext());
            A1q.getClass();
            selectHighlightsCoverFragment.A03 = new C54662OCo(MX2.A01(new Rect(0, 0, A1q.getWidth(), A1q.getHeight())), A1q, c38321qM.getId(), null);
            SelectHighlightsCoverFragment.A00(selectHighlightsCoverFragment);
        }
    }
}
