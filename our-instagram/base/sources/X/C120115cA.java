package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5cA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C120115cA {
    public Integer A00;
    public final C006802i A01;
    public final Map A02 = new LinkedHashMap();
    public final java.util.Set A03 = new LinkedHashSet();
    public final java.util.Set A04 = new LinkedHashSet();

    public final void A00(EnumC33443EqF enumC33443EqF, Boolean bool, Long l, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        String str5;
        C14360o3.A0B(str, 0);
        Map map = this.A02;
        if (map.get(str) == null) {
            int A03 = AbstractC50712Us.A01.A03();
            C006802i c006802i = this.A01;
            if (l != null) {
                c006802i.A0Y(814299525, A03, str4, true, l.longValue(), TimeUnit.NANOSECONDS);
            } else {
                c006802i.A0S(814299525, A03, str4);
            }
            c006802i.markerAnnotate(814299525, A03, "thread_key", str2);
            c006802i.markerAnnotate(814299525, A03, AbstractC43591JPw.A00(1220), str);
            if (bool != null) {
                c006802i.markerAnnotate(814299525, A03, "client_thread_exists", bool.booleanValue());
            }
            c006802i.markerAnnotate(814299525, A03, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str3);
            c006802i.markerAnnotate(814299525, A03, "includes_text", z);
            c006802i.markerAnnotate(814299525, A03, "prompt_type", enumC33443EqF.toString());
            if (z2) {
                str5 = "image";
            } else {
                str5 = null;
            }
            c006802i.markerAnnotate(814299525, A03, "input_message_type", str5);
            C16910sj c16910sj = C16910sj.A00;
            map.put(str, new L42(c16910sj, c16910sj, A03, 0, 0, 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.C7BW r20, X.C2EY r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120115cA.A01(X.7BW, X.2EY, java.lang.String):void");
    }

    public final void A02(String str) {
        if (this.A00 == null) {
            int A03 = AbstractC50712Us.A01.A03();
            Integer valueOf = Integer.valueOf(A03);
            this.A00 = valueOf;
            if (valueOf != null) {
                C006802i c006802i = this.A01;
                c006802i.markerStart(814299525, A03);
                c006802i.markerAnnotate(814299525, A03, "rewrite_type", str);
            }
        }
    }

    public final void A03(boolean z) {
        Integer num = this.A00;
        if (num != null) {
            int intValue = num.intValue();
            C006802i c006802i = this.A01;
            short s = 3;
            if (z) {
                s = 2;
            }
            c006802i.markerEnd(814299525, intValue, s);
            this.A00 = null;
        }
    }

    public C120115cA(C006802i c006802i) {
        this.A01 = c006802i;
    }
}
