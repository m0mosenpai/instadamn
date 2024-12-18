package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.1mB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35911mB extends C1OW implements InterfaceC29171au {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1mC
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            String str;
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C35911mB c35911mB = (C35911mB) obj;
            anonymousClass182.A0d();
            String str2 = c35911mB.A01;
            if (str2 != null) {
                anonymousClass182.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
                if (c35911mB.A00 != null) {
                    anonymousClass182.A0r("mark_seen_thread_data");
                    C34583FLs c34583FLs = c35911mB.A00;
                    if (c34583FLs != null) {
                        anonymousClass182.A0d();
                        String str3 = c34583FLs.A01;
                        if (str3 != null) {
                            anonymousClass182.A0S("ig_thread_igid", str3);
                            String str4 = c34583FLs.A02;
                            if (str4 != null) {
                                anonymousClass182.A0S("viewing_actor_igid", str4);
                            }
                            if (c34583FLs.A03 != null) {
                                C16V.A03(anonymousClass182, "viewed_item_ranges");
                                List<FNP> list = c34583FLs.A03;
                                if (list != null) {
                                    for (FNP fnp : list) {
                                        if (fnp != null) {
                                            anonymousClass182.A0d();
                                            anonymousClass182.A0Q("item_count", fnp.A00);
                                            String str5 = fnp.A02;
                                            if (str5 != null) {
                                                anonymousClass182.A0S("range_end_item_id", str5);
                                                String str6 = fnp.A03;
                                                if (str6 != null) {
                                                    anonymousClass182.A0S("range_end_otid", str6);
                                                    anonymousClass182.A0Q("range_ephemeral_view_duration_sec", fnp.A01);
                                                    String str7 = fnp.A04;
                                                    if (str7 != null) {
                                                        anonymousClass182.A0S("range_start_item_id", str7);
                                                        String str8 = fnp.A05;
                                                        if (str8 != null) {
                                                            anonymousClass182.A0S("range_start_otid", str8);
                                                            anonymousClass182.A0a();
                                                        } else {
                                                            str = "rangeStartOtid";
                                                        }
                                                    } else {
                                                        str = "rangeStartItemId";
                                                    }
                                                } else {
                                                    str = "rangeEndOtid";
                                                }
                                            } else {
                                                str = "rangeEndItemId";
                                            }
                                        }
                                    }
                                    anonymousClass182.A0Z();
                                    anonymousClass182.A0R("viewed_timestamp_ms", c34583FLs.A00);
                                    anonymousClass182.A0a();
                                    AbstractC43669JTd.A00(anonymousClass182, c35911mB);
                                    anonymousClass182.A0a();
                                    return;
                                }
                            }
                            str = "viewedItemRanges";
                        } else {
                            str = "igThreadIgid";
                        }
                    }
                }
                str = "seenEphemeralMessageThreadData";
            } else {
                str = "threadId";
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C35911mB parseFromJson = AbstractC34160F5k.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }
    };
    public C34583FLs A00;
    public String A01;

    public C35911mB() {
        super(null, null, 1);
    }

    @Override // X.C1OW
    public final String A02() {
        return "mark_ephemeral_item_ranges_viewed";
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        String str = this.A01;
        if (str != null) {
            return new DirectThreadKey(str);
        }
        C14360o3.A0F("threadId");
        throw C00O.createAndThrow();
    }
}
