package X;

import android.view.View;
import com.facebook.R;
import java.util.Map;

/* renamed from: X.6Xj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140556Xj {
    public final View A00;
    public final InterfaceC09390do A01;
    public final Map A02;

    public C140556Xj(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A02 = AbstractC06930Yk.A07(new C09530e4(Integer.valueOf(R.id.header_menu_button), null), new C09530e4(Integer.valueOf(R.id.toolbar_share_to_link_button), null), new C09530e4(Integer.valueOf(R.id.toolbar_archive_button), null));
        this.A01 = AbstractC09440dt.A01(new C9EU(this, 15));
    }

    public static final void A00(C140556Xj c140556Xj, InterfaceC16820sZ interfaceC16820sZ) {
        Map map = c140556Xj.A02;
        for (Map.Entry entry : map.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            View view = (View) entry.getValue();
            if (view == null) {
                View findViewById = ((View) c140556Xj.A01.getValue()).findViewById(intValue);
                if (findViewById != null) {
                    findViewById.setEnabled(((Boolean) interfaceC16820sZ.invoke()).booleanValue());
                }
                map.put(Integer.valueOf(intValue), findViewById);
            } else {
                view.setEnabled(((Boolean) interfaceC16820sZ.invoke()).booleanValue());
            }
        }
    }
}
