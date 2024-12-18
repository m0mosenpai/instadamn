package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.FbX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35000FbX {
    public final C1ZW A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    public C35000FbX(C1ZW c1zw) {
        C14360o3.A0B(c1zw, 1);
        this.A00 = c1zw;
        this.A01 = AbstractC09440dt.A01(C37037GTt.A00);
        this.A02 = AbstractC09440dt.A01(C37038GTu.A00);
    }

    public static final boolean A00(C35000FbX c35000FbX) {
        if (AbstractC167007dF.A1Z(c35000FbX.A01)) {
            if (C17s.A04(AbstractC50712Us.A00, new C17u(1, AbstractC167027dH.A01(c35000FbX.A02))) != 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void A01(C2EC c2ec, Exception exc) {
        if (!A00(this)) {
            C1ZX A00 = this.A00.A00(C05F.A1I, 817891655, 0, false);
            A00.A05(exc);
            String C7I = c2ec.C7I();
            if (C7I == null) {
                C7I = "null";
            }
            A00.A03(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, C7I);
            A00.A04("is_group", c2ec.CVQ());
            A00.A04(AbstractC111324zv.A00(2597), c2ec.CRD());
            A00.A03("member_ids", AbstractC31175DnJ.A0a(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, c2ec.BSD()));
            A00.A03("system_folder", c2ec.C4i().name());
            A00.A00();
        }
    }
}
