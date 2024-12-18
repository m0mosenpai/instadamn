package X;

import android.R;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* loaded from: classes5.dex */
public abstract class CBQ {
    public static final void A00(C113525Ap c113525Ap, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (CBR.A00(c113525Ap)) {
            C113505An c113505An = c113525Ap.A05;
            C120895dg c120895dg = (C120895dg) C5B6.A00(c113505An, AbstractC120875de.A0G);
            if (c120895dg != null) {
                accessibilityNodeInfoCompat.addAction(new C012804r(R.id.accessibilityActionPageUp, c120895dg.A00));
            }
            C120895dg c120895dg2 = (C120895dg) C5B6.A00(c113505An, AbstractC120875de.A0D);
            if (c120895dg2 != null) {
                accessibilityNodeInfoCompat.addAction(new C012804r(R.id.accessibilityActionPageDown, c120895dg2.A00));
            }
            C120895dg c120895dg3 = (C120895dg) C5B6.A00(c113505An, AbstractC120875de.A0E);
            if (c120895dg3 != null) {
                accessibilityNodeInfoCompat.addAction(new C012804r(R.id.accessibilityActionPageLeft, c120895dg3.A00));
            }
            C120895dg c120895dg4 = (C120895dg) C5B6.A00(c113505An, AbstractC120875de.A0F);
            if (c120895dg4 != null) {
                accessibilityNodeInfoCompat.addAction(new C012804r(R.id.accessibilityActionPageRight, c120895dg4.A00));
            }
        }
    }
}
