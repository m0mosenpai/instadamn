package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3kG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81463kG {
    public C97404Za A00;
    public C75113Zb A01;
    public final Context A02;
    public final View A03;
    public final ViewGroup A04;
    public final AbstractC81293jz A05;
    public final C81303k0 A06;
    public final Map A07;

    public C81463kG(ViewGroup viewGroup, AbstractC81293jz abstractC81293jz, C81303k0 c81303k0) {
        this.A04 = viewGroup;
        this.A05 = abstractC81293jz;
        this.A06 = c81303k0;
        Context context = viewGroup.getContext();
        C14360o3.A07(context);
        this.A02 = context;
        View requireViewById = viewGroup.requireViewById(R.id.top_legibility_gradient);
        C14360o3.A07(requireViewById);
        this.A03 = requireViewById;
        this.A07 = new LinkedHashMap();
    }
}
