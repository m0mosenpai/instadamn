package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1fx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32131fx extends C1OW implements InterfaceC29171au {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1fy
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C32131fx parseFromJson = AbstractC34187F6l.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C32131fx c32131fx = (C32131fx) obj;
            anonymousClass182.A0d();
            String str = c32131fx.A00;
            if (str != null) {
                anonymousClass182.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
                anonymousClass182.A0T("translation_enabled", c32131fx.A01);
                AbstractC43669JTd.A00(anonymousClass182, c32131fx);
                anonymousClass182.A0a();
                return;
            }
            C14360o3.A0F("threadId");
            throw C00O.createAndThrow();
        }
    };
    public String A00;
    public boolean A01;

    public C32131fx() {
        super(null, null, 1);
    }

    @Override // X.C1OW
    public final String A02() {
        return "translate_thread";
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
