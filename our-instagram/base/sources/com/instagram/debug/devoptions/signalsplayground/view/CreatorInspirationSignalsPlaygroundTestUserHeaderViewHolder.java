package com.instagram.debug.devoptions.signalsplayground.view;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25228BEl;
import X.C14360o3;
import X.C3OO;
import android.content.res.Resources;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes5.dex */
public final class CreatorInspirationSignalsPlaygroundTestUserHeaderViewHolder extends C3OO {
    public final IgTextView titleView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorInspirationSignalsPlaygroundTestUserHeaderViewHolder(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.titleView = (IgTextView) AbstractC166987dD.A0c(view, R.id.test_user_list_header);
    }

    public final void bind(int i, int i2) {
        AbstractC166987dD.A1P(this.itemView.getContext(), this.titleView, i);
        IgTextView igTextView = this.titleView;
        Resources A0M = AbstractC25228BEl.A0M(this.itemView);
        if (i2 != 0) {
            igTextView.setPadding(A0M.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), AbstractC167017dG.A06(this.itemView.getContext()), AbstractC166997dE.A04(this.itemView.getContext(), R.dimen.account_discovery_bottom_gap), 0);
        } else {
            igTextView.setPadding(A0M.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), 0, AbstractC166997dE.A04(this.itemView.getContext(), R.dimen.account_discovery_bottom_gap), 0);
        }
    }
}
