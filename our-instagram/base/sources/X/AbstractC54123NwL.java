package X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.NwL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54123NwL {
    public static final void A00(C54696ODy c54696ODy, String str, String str2, String str3, boolean z) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c54696ODy.A00, c54696ODy.A05), "ig_fb_xposting_deep_deletion_event");
        A0f.A7v("contains_deep_deletion", AbstractC31173DnH.A0e(A0f, "event_name", str, z));
        A0f.A7v("is_story_not_null", Boolean.valueOf(c54696ODy.A04));
        A0f.A7v("is_fb_account_hard_linked", Boolean.valueOf(c54696ODy.A03));
        A0f.A7v("is_experiment_enabled", AbstractC166997dE.A0b());
        A0f.AAP(AbstractC58410Puo.A00(), c54696ODy.A01);
        A0f.AAP(TraceFieldType.FailureReason, str3);
        A0f.AAP("surface", str2);
        A0f.A7v("is_dating", Boolean.valueOf(c54696ODy.A02));
        A0f.AAP("xposting_status", null);
        A0f.Cht();
    }
}
