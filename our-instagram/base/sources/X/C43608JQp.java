package X;

import android.content.Intent;
import java.util.ArrayList;

/* renamed from: X.JQp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43608JQp {
    public static final ArrayList A00(Intent intent) {
        long[] longArrayExtra = intent.getLongArrayExtra("feature_tags");
        if (longArrayExtra != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            EnumC46302KeY enumC46302KeY = EnumC46302KeY.A04;
            if (AbstractC009903n.A0Q(longArrayExtra, 15L)) {
                A1E.add(enumC46302KeY);
            }
            EnumC46302KeY enumC46302KeY2 = EnumC46302KeY.A09;
            if (AbstractC009903n.A0Q(longArrayExtra, 63L)) {
                A1E.add(enumC46302KeY2);
            }
            EnumC46302KeY enumC46302KeY3 = EnumC46302KeY.A0B;
            if (AbstractC009903n.A0Q(longArrayExtra, 64L)) {
                A1E.add(enumC46302KeY3);
            }
            return A1E;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r3 == 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C43606JQm A01(X.C116155Nu r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43608JQp.A01(X.5Nu):X.JQm");
    }
}
