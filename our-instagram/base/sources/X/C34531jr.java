package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1jr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34531jr extends C1OW implements InterfaceC29171au {
    public static final C1OZ A05 = new C1OZ() { // from class: X.1js
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C34531jr parseFromJson = AbstractC46930KpB.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C34531jr c34531jr = (C34531jr) obj;
            anonymousClass182.A0d();
            String str = c34531jr.A02;
            if (str != null) {
                anonymousClass182.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
                anonymousClass182.A0R("last_sent_message_timestamp_ms", c34531jr.A00);
                String str2 = c34531jr.A01;
                if (str2 != null) {
                    anonymousClass182.A0S("item_id", str2);
                }
                anonymousClass182.A0T("is_message_deletion", c34531jr.A03);
                anonymousClass182.A0T("is_message_reaction", c34531jr.A04);
                AbstractC43669JTd.A00(anonymousClass182, c34531jr);
                anonymousClass182.A0a();
                return;
            }
            C14360o3.A0F("threadId");
            throw C00O.createAndThrow();
        }
    };
    public long A00;
    public String A01;
    public String A02;
    public boolean A03;
    public boolean A04;

    public C34531jr() {
        super(null, null, 1);
        this.A01 = "";
    }

    @Override // X.C1OW
    public final String A02() {
        return "bump_thread";
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        String str = this.A02;
        if (str != null) {
            return new DirectThreadKey(str);
        }
        C14360o3.A0F("threadId");
        throw C00O.createAndThrow();
    }
}
