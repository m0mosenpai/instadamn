package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Map;

/* renamed from: X.1oQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37271oQ extends C1OW implements InterfaceC29171au {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1oR
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C37271oQ parseFromJson = F1D.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C37271oQ c37271oQ;
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            if (obj instanceof C37271oQ) {
                c37271oQ = (C37271oQ) obj;
            } else {
                c37271oQ = null;
            }
            anonymousClass182.A0d();
            if (c37271oQ.A01 != null) {
                anonymousClass182.A0r("creator_ai_enabled_map");
                anonymousClass182.A0d();
                for (Map.Entry entry : c37271oQ.A01.entrySet()) {
                    if (!C16V.A04(anonymousClass182, entry)) {
                        anonymousClass182.A0y(((Boolean) entry.getValue()).booleanValue());
                    }
                }
                anonymousClass182.A0a();
            }
            String str = c37271oQ.A00;
            if (str != null) {
                anonymousClass182.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
                AbstractC43669JTd.A00(anonymousClass182, c37271oQ);
                anonymousClass182.A0a();
                return;
            }
            C14360o3.A0F("threadId");
            throw C00O.createAndThrow();
        }
    };
    public String A00;
    public Map A01;

    /* JADX WARN: Multi-variable type inference failed */
    public C37271oQ() {
        super(null, 0 == true ? 1 : 0, 1);
    }

    @Override // X.C1OW
    public final String A02() {
        return "toggle_creator_agent_replies";
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        String str = this.A00;
        if (str != null) {
            return new DirectThreadKey(str);
        }
        C14360o3.A0F("threadId");
        throw C00O.createAndThrow();
    }
}
