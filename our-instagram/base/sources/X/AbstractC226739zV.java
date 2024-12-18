package X;

import com.instagram.creation.capture.quickcapture.rulesystem.CaptureRuleSystemState;
import java.util.LinkedHashSet;

/* renamed from: X.9zV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226739zV {
    public static final java.util.Set A00(CaptureRuleSystemState captureRuleSystemState) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (captureRuleSystemState.A0n) {
            linkedHashSet.add(new C23003ACc(EnumC173517o3.A1X));
        }
        if (captureRuleSystemState.A0f) {
            linkedHashSet.add(new C23003ACc(EnumC173517o3.A1Y));
        }
        if (captureRuleSystemState.A0k) {
            linkedHashSet.add(new C23003ACc(EnumC173517o3.A1W));
        }
        if (captureRuleSystemState.A0c) {
            linkedHashSet.add(new C23003ACc(EnumC173517o3.A1Q));
        }
        if (captureRuleSystemState.A02 > 0) {
            linkedHashSet.add(new C23003ACc(EnumC173517o3.A1A));
        }
        return AbstractC001800i.A0k(linkedHashSet);
    }
}
