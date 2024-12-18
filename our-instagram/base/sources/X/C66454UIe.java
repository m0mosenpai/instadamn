package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout2;

/* renamed from: X.UIe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66454UIe extends C3OO {
    public final ViewGroup A00;
    public final IgSegmentedTabLayout2 A01;

    public C66454UIe(View view, boolean z) {
        super(view);
        ViewGroup viewGroup;
        if (z) {
            viewGroup = null;
        } else {
            viewGroup = (ViewGroup) view.findViewById(R.id.tab_layout);
        }
        this.A00 = viewGroup;
        this.A01 = z ? (IgSegmentedTabLayout2) view.findViewById(R.id.tab_prism_layout) : null;
    }
}
