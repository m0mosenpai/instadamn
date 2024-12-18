package com.instagram.comments.commentactions;

import X.AbstractC167007dF;
import X.C14360o3;
import X.ViewOnClickListenerC28667ClF;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class CommentActionsMultiSelect extends IgLinearLayout {
    public final Set A00;
    public final View A01;
    public final View A02;
    public final View A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommentActionsMultiSelect(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public final void setBlockButtonVisibility(boolean z) {
        this.A01.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
    }

    public final void setDeleteButtonVisibility(boolean z) {
        this.A02.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
    }

    public final void setRestrictButtonVisibility(boolean z) {
        this.A03.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
    }

    public /* synthetic */ CommentActionsMultiSelect(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentActionsMultiSelect(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A00 = new LinkedHashSet();
        LayoutInflater.from(context).inflate(R.layout.comment_actions_multi_select_menu, this);
        setOrientation(1);
        View findViewById = findViewById(R.id.bulk_comment_actions_delete);
        this.A02 = findViewById;
        View findViewById2 = findViewById(R.id.bulk_comment_actions_restrict);
        this.A03 = findViewById2;
        View findViewById3 = findViewById(R.id.bulk_comment_actions_block);
        this.A01 = findViewById3;
        findViewById.setOnClickListener(new ViewOnClickListenerC28667ClF(this, 20));
        findViewById2.setOnClickListener(new ViewOnClickListenerC28667ClF(this, 21));
        findViewById3.setOnClickListener(new ViewOnClickListenerC28667ClF(this, 22));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommentActionsMultiSelect(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
