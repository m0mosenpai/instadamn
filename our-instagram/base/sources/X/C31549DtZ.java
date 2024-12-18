package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.google.common.collect.ImmutableList;

/* renamed from: X.DtZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31549DtZ extends C3OO {
    public ImmutableList A00;
    public final ViewGroup A01;
    public final boolean A02;

    public C31549DtZ(View view, boolean z) {
        super(view);
        this.A01 = (ViewGroup) AbstractC166987dD.A0c(view, z ? R.id.find_people_vertical_layout : R.id.find_people_horizontal_layout);
        this.A02 = z;
    }
}
