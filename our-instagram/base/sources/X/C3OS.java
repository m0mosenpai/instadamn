package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.3OS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3OS {
    public final ViewGroup A00;
    public final View A01;

    public C3OS(ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 1);
        View requireViewById = viewGroup.requireViewById(R.id.reels_tray_container);
        C14360o3.A07(requireViewById);
        this.A00 = (ViewGroup) requireViewById;
        this.A01 = viewGroup.findViewById(R.id.group_story_arrow_icon);
    }
}
