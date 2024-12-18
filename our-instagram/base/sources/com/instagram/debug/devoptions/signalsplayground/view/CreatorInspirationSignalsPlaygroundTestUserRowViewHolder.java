package com.instagram.debug.devoptions.signalsplayground.view;

import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.AbstractC25231BEo;
import X.C0f9;
import X.C0fQ;
import X.C14360o3;
import X.C3OO;
import X.InterfaceC11380iw;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;

/* loaded from: classes5.dex */
public final class CreatorInspirationSignalsPlaygroundTestUserRowViewHolder extends C3OO {
    public final InterfaceC11380iw analyticsModule;
    public final Delegate delegate;
    public final GradientSpinnerAvatarView imageView;
    public final IgTextView primaryName;
    public final IgTextView secondaryName;
    public final ConstraintLayout testUserRowContainer;

    /* loaded from: classes5.dex */
    public interface Delegate {
        void onUserRowClick(User user);
    }

    public final void bind(final User user) {
        C14360o3.A0B(user, 0);
        this.imageView.A0F(null, this.analyticsModule, user.Bhu());
        this.imageView.setGradientSpinnerVisible(false);
        this.primaryName.setText(user.getUsername());
        this.secondaryName.setText(user.A0Q());
        C0fQ.A00(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.signalsplayground.view.CreatorInspirationSignalsPlaygroundTestUserRowViewHolder$bind$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(913714391);
                CreatorInspirationSignalsPlaygroundTestUserRowViewHolder creatorInspirationSignalsPlaygroundTestUserRowViewHolder = CreatorInspirationSignalsPlaygroundTestUserRowViewHolder.this;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                creatorInspirationSignalsPlaygroundTestUserRowViewHolder.delegate.onUserRowClick(user);
                C0f9.A0C(-924346320, A05);
            }
        }, this.testUserRowContainer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorInspirationSignalsPlaygroundTestUserRowViewHolder(View view, InterfaceC11380iw interfaceC11380iw, Delegate delegate) {
        super(view);
        AbstractC167027dH.A13(view, interfaceC11380iw, delegate);
        this.analyticsModule = interfaceC11380iw;
        this.delegate = delegate;
        this.testUserRowContainer = (ConstraintLayout) AbstractC166997dE.A0R(view, R.id.test_user_row_container);
        this.imageView = (GradientSpinnerAvatarView) AbstractC166997dE.A0R(view, R.id.profile_image);
        this.primaryName = AbstractC25231BEo.A0d(view, R.id.primary_name);
        this.secondaryName = AbstractC25231BEo.A0d(view, R.id.secondary_name);
    }
}
