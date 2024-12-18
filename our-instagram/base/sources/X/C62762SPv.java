package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.SPv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62762SPv {
    public final int A00 = C0HM.A00().hashCode();
    public final C63021Sam A01;
    public final C5G6 A02;

    public final void A03(java.util.Set set) {
        C14360o3.A0B(set, 0);
        this.A01.A02(Integer.valueOf(this.A00), null, "check_cache_end", 772815129);
        A02(AbstractC25233BEq.A0p("cache_layers", AnonymousClass001.A0E(AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", set, null), '[', ']'), AbstractC166987dD.A1L("has_cached_screen", String.valueOf(!set.isEmpty()))));
    }

    public final void A00() {
        this.A01.A02(Integer.valueOf(this.A00), null, "check_cache_start", 772815129);
    }

    public final void A02(Map map) {
        C63021Sam c63021Sam = this.A01;
        int i = this.A00;
        Integer valueOf = Integer.valueOf(i);
        if (c63021Sam.A00.A09(true) && valueOf != null) {
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                c63021Sam.A01.markerAnnotate(772815129, i, AbstractC31172DnG.A17(A1K), AbstractC58318PtA.A0p(A1K));
            }
        }
    }

    public C62762SPv(C5G6 c5g6) {
        this.A02 = c5g6;
        this.A01 = c5g6.A02;
    }

    public final void A01(Integer num, Integer num2, String str) {
        String str2;
        String str3;
        this.A01.A00(null, 772815129, this.A00);
        C09530e4 A1L = AbstractC166987dD.A1L("iab_session_id", this.A02.A00.A09.A05);
        C09530e4 A1L2 = AbstractC166987dD.A1L("prompt_session_id", str);
        if (num.intValue() != 0) {
            str2 = "save";
        } else {
            str2 = "usage";
        }
        C09530e4 A1L3 = AbstractC166987dD.A1L("prompt_type", str2);
        if (num2.intValue() != 0) {
            str3 = "PAYMENT_AUTOFILL";
        } else {
            str3 = "CONTACT_AUTOFILL";
        }
        A02(AbstractC06930Yk.A06(A1L, A1L2, A1L3, AbstractC166987dD.A1L("autofill_type", str3), AbstractC166987dD.A1L("cache_ttl", String.valueOf(SandboxRepository.CACHE_TTL))));
    }

    public final void A04(boolean z) {
        A02(AbstractC167007dF.A0n("was_prompt_shown", String.valueOf(z)));
        this.A01.A01(Integer.valueOf(this.A00), null, 772815129);
    }
}
