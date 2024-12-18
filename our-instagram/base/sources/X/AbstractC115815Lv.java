package X;

import android.view.View;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.Map;

/* renamed from: X.5Lv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC115815Lv {
    public final View A00;
    public final Map A01;

    public AbstractC115815Lv(View view, EnumC77673dr enumC77673dr) {
        this.A00 = view;
        this.A01 = AbstractC06930Yk.A07(new C09530e4("view_tracking_node_name", enumC77673dr));
        View view2 = this.A00;
        view2.getLocationOnScreen(new int[2]);
        Map map = this.A01;
        C14360o3.A07(view2.getContext());
        map.put("x_pos", Double.valueOf(AbstractC13880nE.A01(r4, r6[0])));
        map.put("y_pos", Double.valueOf(AbstractC13880nE.A01(r4, r6[1])));
        map.put(IgReactMediaPickerNativeModule.WIDTH, Double.valueOf(AbstractC13880nE.A01(r4, view2.getWidth())));
        map.put(IgReactMediaPickerNativeModule.HEIGHT, Double.valueOf(AbstractC13880nE.A01(r4, view2.getHeight())));
        map.put("is_tappable", Boolean.valueOf(view2.isClickable() || view2.isLongClickable() || view2.hasOnClickListeners()));
    }
}
