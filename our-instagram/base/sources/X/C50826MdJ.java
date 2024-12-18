package X;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.instagram.rtc.presentation.arsidebar.RtcCallArSidebarTouchUpSlider;

/* renamed from: X.MdJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50826MdJ extends C02V {
    public AccessibilityManager A00;
    public Integer A01;
    public final RtcCallArSidebarTouchUpSlider A02;
    public final View A03;

    public C50826MdJ(View view, RtcCallArSidebarTouchUpSlider rtcCallArSidebarTouchUpSlider) {
        AccessibilityManager accessibilityManager;
        C14360o3.A0B(view, 1);
        this.A03 = view;
        this.A02 = rtcCallArSidebarTouchUpSlider;
        AbstractC010103p.A0B(view, this);
        AbstractC010103p.A0B(rtcCallArSidebarTouchUpSlider, this);
        Object systemService = rtcCallArSidebarTouchUpSlider.getContext().getSystemService("accessibility");
        if (systemService instanceof AccessibilityManager) {
            accessibilityManager = (AccessibilityManager) systemService;
        } else {
            accessibilityManager = null;
        }
        this.A00 = accessibilityManager;
    }

    @Override // X.C02V
    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AbstractC167017dG.A1N(view, accessibilityNodeInfoCompat);
        super.A0Y(view, accessibilityNodeInfoCompat);
        boolean equals = view.equals(this.A03);
        C012804r c012804r = C012804r.A0I;
        Context context = view.getContext();
        int i = 2131976669;
        if (equals) {
            i = 2131976666;
        }
        accessibilityNodeInfoCompat.addAction(new C012804r(32, context.getString(i)));
    }
}
