package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.common.ui.base.IgFrameLayout;

/* loaded from: classes9.dex */
public final class NFY extends IgFrameLayout {
    public final /* synthetic */ ViewGroup A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NFY(Context context, ViewGroup viewGroup) {
        super(context);
        this.A00 = viewGroup;
    }

    @Override // android.view.View
    public int getId() {
        ViewGroup viewGroup = this.A00;
        if (viewGroup != null) {
            return viewGroup.getId();
        }
        return super.getId();
    }
}
