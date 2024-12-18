package X;

import com.facebook.flipper.plugins.bloksdebugger.BloksRawPayload$Companion;
import com.facebook.flipper.plugins.bloksdebugger.Event;
import com.instagram.common.bloks.flipper.BloksPayloadCacheStatus;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.UMh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66550UMh extends Event {
    public static final C3R9[] A08;
    public static final BloksRawPayload$Companion Companion = new Object();
    public final BloksPayloadCacheStatus A00;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final Map A07;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.flipper.plugins.bloksdebugger.BloksRawPayload$Companion] */
    static {
        C3R8 A00 = C3R7.A00("com.instagram.common.bloks.flipper.BloksPayloadCacheStatus", BloksPayloadCacheStatus.values());
        C3RD c3rd = C3RD.A01;
        A08 = new C3R9[]{null, A00, null, null, new C3RL(c3rd, C3RJ.A00), null, new C3SG(c3rd), null};
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ C66550UMh(BloksPayloadCacheStatus bloksPayloadCacheStatus, Object obj, String str, String str2, String str3, String str4, @Serializable(with = C71699Wz8.class) List list, Map map, int i) {
        if (255 != (i & 255)) {
            AbstractC68612VXn.A00(C71709Wza.A01, i, 255);
            throw C00O.createAndThrow();
        }
        this.A05 = str;
        this.A00 = bloksPayloadCacheStatus;
        this.A04 = str2;
        this.A03 = str3;
        this.A07 = map;
        this.A01 = obj;
        this.A06 = list;
        this.A02 = str4;
    }
}
