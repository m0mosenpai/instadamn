package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.3io, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80593io {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final TextView A03;
    public final InterfaceC09390do A04;

    public C80593io(View view) {
        C14360o3.A0B(view, 1);
        this.A01 = view;
        View requireViewById = view.requireViewById(R.id.indicator_background_view);
        C14360o3.A07(requireViewById);
        this.A00 = requireViewById;
        View requireViewById2 = view.requireViewById(R.id.indicator_icon_view);
        C14360o3.A07(requireViewById2);
        this.A02 = (ImageView) requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.indicator_text_view);
        C14360o3.A07(requireViewById3);
        this.A03 = (TextView) requireViewById3;
        this.A04 = AbstractC09440dt.A00(EnumC09460dv.A02, new C206839Do(this, 31));
    }
}
