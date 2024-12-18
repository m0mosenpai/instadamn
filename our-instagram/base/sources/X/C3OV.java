package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;

/* renamed from: X.3OV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3OV extends FrameLayout {
    public final C72933Ot A00;

    public C3OV(Context context) {
        super(context, null, 0);
        if (((Boolean) AbstractC15930qn.A02.A0H.invoke()).booleanValue()) {
            LayoutInflater from = LayoutInflater.from(context);
            C14360o3.A07(from);
            C50802Vb.A00(from, new ViewGroup.MarginLayoutParams(-2, -2), this, R.layout.reel_item_avatar_content, 0, true, true);
        } else {
            View.inflate(getContext(), R.layout.reel_item_avatar_content, this);
        }
        this.A00 = new C72933Ot(this);
    }

    public final C72933Ot getHolder() {
        return this.A00;
    }
}
