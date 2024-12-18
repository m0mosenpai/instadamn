package com.instagram.direct.ui.polls;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC25228BEl;
import X.AbstractC31172DnG;
import X.AbstractC43592JPx;
import X.AbstractC53242c7;
import X.C00O;
import X.C14360o3;
import X.C44339Jie;
import X.C84963qk;
import X.InterfaceC11380iw;
import X.JQ0;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class PollMessageVotersView extends FrameLayout implements InterfaceC11380iw {
    public int A00;
    public int A01;
    public final int A02;
    public final IgTextView A03;
    public final C44339Jie A04;
    public final List A05;

    public final void A00(List list, long j) {
        C14360o3.A0B(list, 0);
        List list2 = this.A05;
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            IgImageView igImageView = (IgImageView) obj;
            if (i < list.size()) {
                igImageView.setVisibility(0);
                igImageView.setUrl((ImageUrl) list.get(i), this);
            } else {
                igImageView.setVisibility(8);
            }
            i = i2;
        }
        int min = Math.min(list2.size(), 100);
        if (j > min) {
            int i3 = min - 1;
            IgTextView igTextView = this.A03;
            igTextView.setVisibility(0);
            Integer valueOf = Integer.valueOf((int) (j - i3));
            Resources A0M = AbstractC25228BEl.A0M(this);
            C14360o3.A07(A0M);
            igTextView.setText(C84963qk.A04(A0M, valueOf, 1000, true, false));
            AbstractC43592JPx.A1U(list2.get(i3), 8);
        }
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "PollMessageVotersView";
    }

    public /* synthetic */ PollMessageVotersView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollMessageVotersView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A05 = A1E;
        int A07 = AbstractC167017dG.A07(context);
        this.A02 = A07;
        this.A01 = AbstractC53242c7.A0F(context, R.attr.messageFromOthersGrayBackground);
        this.A00 = context.getColor(AbstractC53242c7.A0D(context));
        context.getColor(AbstractC53242c7.A07(context));
        View.inflate(context, R.layout.direct_poll_message_voters, this);
        A1E.add(AbstractC166997dE.A0S(this, R.id.voter_avatar_1));
        A1E.add(AbstractC166997dE.A0S(this, R.id.voter_avatar_2));
        A1E.add(AbstractC166997dE.A0S(this, R.id.voter_avatar_3));
        IgTextView A0X = AbstractC31172DnG.A0X(this, R.id.avatar_count);
        this.A03 = A0X;
        C44339Jie c44339Jie = new C44339Jie(A07, this.A01, this.A00);
        this.A04 = c44339Jie;
        A0X.setBackground(c44339Jie);
        int i2 = this.A01;
        for (CircularImageView circularImageView : this.A05) {
            circularImageView.A0H(this.A02, i2);
            circularImageView.A02 = true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PollMessageVotersView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PollMessageVotersView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
