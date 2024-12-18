package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.Mbs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50784Mbs extends View.AccessibilityDelegate {
    public final /* synthetic */ IgdsListCell A00;
    public final /* synthetic */ boolean A01;

    public C50784Mbs(IgdsListCell igdsListCell, boolean z) {
        this.A01 = z;
        this.A00 = igdsListCell;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean A1a = AbstractC167017dG.A1a(view, accessibilityNodeInfo);
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(A1a);
        accessibilityNodeInfo.setChecked(this.A01);
        EnumC53237Nga enumC53237Nga = this.A00.A0G;
        if (enumC53237Nga != EnumC53237Nga.A09) {
            accessibilityNodeInfo.setClassName(AbstractC58462m5.A00(enumC53237Nga.A00));
        }
    }
}
