package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.chip.Chip;
import java.util.List;

/* renamed from: X.UEh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66373UEh extends C2Y4 {
    public final /* synthetic */ Chip A00;

    @Override // X.C2Y4
    public final void A0e(int i, boolean z) {
        if (i == 1) {
            Chip chip = this.A00;
            chip.A05 = z;
            chip.refreshDrawableState();
        }
    }

    @Override // X.C2Y4
    public final void A0i(List list) {
        MSX.A0u(0, list);
        Chip chip = this.A00;
        C67771Uxm c67771Uxm = chip.A04;
        if (c67771Uxm != null && c67771Uxm.A0T != null && c67771Uxm.A0d && chip.A02 != null) {
            MSX.A0u(1, list);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66373UEh(Chip chip, Chip chip2) {
        super(chip2);
        this.A00 = chip;
    }

    @Override // X.C2Y4
    public final int A0a(float f, float f2) {
        RectF closeIconTouchBounds;
        Chip chip = this.A00;
        C67771Uxm c67771Uxm = chip.A04;
        if (c67771Uxm != null && c67771Uxm.A0T != null) {
            closeIconTouchBounds = chip.getCloseIconTouchBounds();
            if (closeIconTouchBounds.contains(f, f2)) {
                return 1;
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r0.A0b == false) goto L6;
     */
    @Override // X.C2Y4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0g(androidx.core.view.accessibility.AccessibilityNodeInfoCompat r4) {
        /*
            r3 = this;
            com.google.android.material.chip.Chip r2 = r3.A00
            X.Uxm r0 = r2.A04
            if (r0 == 0) goto Lb
            boolean r0 = r0.A0b
            r1 = 1
            if (r0 != 0) goto Lc
        Lb:
            r1 = 0
        Lc:
            android.view.accessibility.AccessibilityNodeInfo r0 = r4.mInfo
            r0.setCheckable(r1)
            boolean r0 = r2.isClickable()
            r4.setClickable(r0)
            X.Uxm r0 = r2.A04
            if (r0 == 0) goto L20
            boolean r0 = r0.A0b
            if (r0 != 0) goto L35
        L20:
            boolean r0 = r2.isClickable()
            if (r0 != 0) goto L35
            java.lang.String r0 = "android.view.View"
        L28:
            r4.setClassName(r0)
            java.lang.CharSequence r1 = r2.getText()
            android.view.accessibility.AccessibilityNodeInfo r0 = r4.mInfo
            r0.setText(r1)
            return
        L35:
            X.Uxm r0 = r2.A04
            if (r0 == 0) goto L40
            boolean r0 = r0.A0b
            if (r0 == 0) goto L40
            java.lang.String r0 = "android.widget.CompoundButton"
            goto L28
        L40:
            java.lang.String r0 = "android.widget.Button"
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66373UEh.A0g(androidx.core.view.accessibility.AccessibilityNodeInfoCompat):void");
    }

    @Override // X.C2Y4
    public final void A0h(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i) {
        Rect closeIconTouchBoundsInt;
        if (i == 1) {
            Chip chip = this.A00;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription == null) {
                CharSequence text = chip.getText();
                closeIconContentDescription = AbstractC167007dF.A0f(chip.getContext(), TextUtils.isEmpty(text) ? "" : text, 2131967841).trim();
            }
            accessibilityNodeInfoCompat.setContentDescription(closeIconContentDescription);
            closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
            accessibilityNodeInfoCompat.mInfo.setBoundsInParent(closeIconTouchBoundsInt);
            accessibilityNodeInfoCompat.addAction(C012804r.A08);
            accessibilityNodeInfoCompat.setEnabled(chip.isEnabled());
            return;
        }
        accessibilityNodeInfoCompat.setContentDescription("");
        accessibilityNodeInfoCompat.mInfo.setBoundsInParent(Chip.A0G);
    }

    @Override // X.C2Y4
    public final boolean A0m(int i, int i2, Bundle bundle) {
        if (i2 == 16) {
            if (i == 0) {
                return this.A00.performClick();
            }
            if (i == 1) {
                Chip chip = this.A00;
                boolean z = false;
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.A02;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z = true;
                }
                chip.A0C.A0d(1, 1);
                return z;
            }
            return false;
        }
        return false;
    }
}
