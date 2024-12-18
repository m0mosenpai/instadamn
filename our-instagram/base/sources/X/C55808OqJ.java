package X;

import android.view.View;
import com.instagram.creation.fragment.EditMediaInfoFragment;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;

/* renamed from: X.OqJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55808OqJ implements C2JL {
    public final int A00;
    public final Object A01;

    public C55808OqJ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        if (this.A00 == 0) {
            AbstractC25227BEk.A1Q((InterfaceC16660sJ) this.A01, false);
        }
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.A00) {
            case 0:
                AbstractC25227BEk.A1Q((InterfaceC16660sJ) this.A01, AbstractC31177DnL.A1b(obj));
                return;
            case 1:
                EditMediaInfoFragment editMediaInfoFragment = (EditMediaInfoFragment) this.A01;
                View view = editMediaInfoFragment.mCommentPromptLabelView;
                if (view != null) {
                    view.setVisibility(8);
                    editMediaInfoFragment.mCommentPromptLabelView = null;
                }
                IgAutoCompleteTextView igAutoCompleteTextView = editMediaInfoFragment.mCaption;
                if (igAutoCompleteTextView != null) {
                    igAutoCompleteTextView.setFocusableInTouchMode(true);
                    editMediaInfoFragment.mCaption.setOnClickListener(null);
                    editMediaInfoFragment.mCaption.requestFocus();
                }
                C38321qM c38321qM = editMediaInfoFragment.A0I;
                if (c38321qM != null) {
                    c38321qM.A0C.ERC(null);
                }
                editMediaInfoFragment.A0j = true;
                EditMediaInfoFragment.A07(editMediaInfoFragment);
                return;
            default:
                AbstractC167007dF.A0J().post(new PRX((N55) this.A01, (C09530e4) obj));
                return;
        }
    }
}
