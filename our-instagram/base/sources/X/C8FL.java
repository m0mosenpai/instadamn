package X;

import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.HashSet;

/* renamed from: X.8FL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8FL {
    public C8FP A00;
    public final C8FH A01;
    public final C87Q A02;
    public final java.util.Set A03 = new HashSet();
    public final UserSession A04;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.01p, java.util.Map] */
    private final void A00(int i) {
        String A0O;
        C88X B0q;
        C8FP c8fp = this.A00;
        if (c8fp != null && (B0q = c8fp.B0q(i)) != null) {
            C88Z c88z = B0q.A04;
            if ((c88z != C88Z.A0E && B0q == C88X.A0T) || c88z == C88Z.A0J) {
                return;
            }
            C87Q c87q = this.A02;
            String id = B0q.getId();
            C14360o3.A07(id);
            HashSet hashSet = c87q.A00;
            if (hashSet.contains(id)) {
                return;
            }
            ?? c005001p = new C005001p(1);
            C88Z c88z2 = B0q.A04;
            if (c88z2 == null) {
                c88z2 = C88Z.A0G;
            }
            if (c88z2 == C88Z.A04 || c88z2 == C88Z.A08) {
                CameraAREffect A00 = B0q.A00();
                if (A00 != null) {
                    String str = A00.A0K;
                    if (str != null) {
                        C8FH c8fh = this.A01;
                        c005001p.put(str, String.valueOf(i - c8fh.BMv()));
                        c8fh.AVq(B0q, c005001p);
                    }
                } else {
                    A0O = "fireLoggingEvent() logs empty effect id";
                }
            }
            String id2 = B0q.getId();
            C14360o3.A07(id2);
            hashSet.add(id2);
            return;
        }
        A0O = AnonymousClass001.A0O("fireLoggingEvent() effect is null at index=", i);
        AbstractC12120kG.A07("DialImpressionLogger", A0O, null);
    }

    public final void A01() {
        C88X B0q;
        C8FP c8fp = this.A00;
        if (c8fp == null) {
            AbstractC12120kG.A07("DialImpressionLogger", "logImpressionForVisibleElements() mEffectPickerViewManager is null", null);
            return;
        }
        if (!c8fp.AFk()) {
            return;
        }
        int B6m = c8fp.B6m();
        int BM1 = c8fp.BM1();
        if (B6m == -1 || BM1 == -1 || B6m > BM1) {
            return;
        }
        while (true) {
            C8FP c8fp2 = this.A00;
            if (c8fp2 != null && (B0q = c8fp2.B0q(B6m)) != null && (B0q.A04 == C88Z.A0E || this.A03.contains(B0q))) {
                A00(B6m);
            }
            if (B6m == BM1) {
                return;
            } else {
                B6m++;
            }
        }
    }

    public final void A02(int i) {
        String A0O;
        C8FP c8fp = this.A00;
        if (c8fp == null) {
            A0O = "logImpressionOnIconLoaded() mEffectPickerViewManager is null";
        } else {
            C88X B0q = c8fp.B0q(i);
            if (B0q == null) {
                A0O = AnonymousClass001.A0O("logImpressionOnIconLoaded() effect is null at index=", i);
            } else {
                java.util.Set set = this.A03;
                if (set.contains(B0q)) {
                    return;
                }
                set.add(B0q);
                if (!c8fp.AFk()) {
                    return;
                }
                int B6m = c8fp.B6m();
                int BM1 = c8fp.BM1();
                if (B6m == -1 || BM1 == -1 || i < B6m || i > BM1) {
                    return;
                }
                A00(i);
                return;
            }
        }
        AbstractC12120kG.A07("DialImpressionLogger", A0O, null);
    }

    public C8FL(UserSession userSession, C8FH c8fh, C87Q c87q) {
        this.A01 = c8fh;
        this.A02 = c87q;
        this.A04 = userSession;
    }
}
