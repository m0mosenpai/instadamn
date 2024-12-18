package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.DnS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31183DnS implements C1OZ {
    @Override // X.C1OZ
    public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        C35131ks parseFromJson = F6V.parseFromJson(c16l);
        C14360o3.A07(parseFromJson);
        return parseFromJson;
    }

    @Override // X.C1OZ
    public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
        String str;
        AbstractC167017dG.A1N(anonymousClass182, obj);
        C35131ks c35131ks = (C35131ks) obj;
        anonymousClass182.A0d();
        String str2 = c35131ks.A03;
        if (str2 != null) {
            anonymousClass182.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
            String str3 = c35131ks.A01;
            if (str3 != null) {
                anonymousClass182.A0S("item_id", str3);
                String str4 = c35131ks.A02;
                str = "otid";
                if (str4 != null) {
                    anonymousClass182.A0S("otid", str4);
                    if (c35131ks.A00 != null) {
                        anonymousClass182.A0r("one_click_upsell");
                        AbstractC126465nh.A00(c35131ks.A00, anonymousClass182);
                    }
                    AbstractC43669JTd.A00(anonymousClass182, c35131ks);
                    anonymousClass182.A0a();
                    return;
                }
            } else {
                str = "itemId";
            }
        } else {
            str = "threadId";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
