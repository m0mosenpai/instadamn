package instagram.features.clips.viewer.controller;

import X.AbstractC166987dD;
import X.C14360o3;
import X.JQ0;
import X.L0U;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.R;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class EmojiReactionTrayView extends FrameLayout {
    public L0U A00;
    public final float A01;
    public final List A02;
    public final List A03;

    private final int getReactionsCount() {
        return this.A03.size() + 1;
    }

    public /* synthetic */ EmojiReactionTrayView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiReactionTrayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A02 = AbstractC166987dD.A1E();
        this.A03 = AbstractC166987dD.A1E();
        this.A01 = context.getResources().getDimension(R.dimen.abc_dropdownitem_icon_width);
        setLayoutDirection(0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmojiReactionTrayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmojiReactionTrayView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
