package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.1cq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30351cq extends AbstractC29011ae implements InterfaceC29501bR {
    public static final C1OZ A03 = new C1OZ() { // from class: X.1cr
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C30351cq parseFromJson = F60.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            String str;
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C30351cq c30351cq = (C30351cq) obj;
            anonymousClass182.A0d();
            if (c30351cq.A00 != null) {
                anonymousClass182.A0r("clip");
                C1575375n c1575375n = c30351cq.A00;
                if (c1575375n != null) {
                    IQG.A00(anonymousClass182, c1575375n);
                    String str2 = c30351cq.A01;
                    if (str2 != null) {
                        anonymousClass182.A0S("emoji_reaction", str2);
                        String str3 = c30351cq.A02;
                        if (str3 != null) {
                            anonymousClass182.A0S("social_context_share_type", str3);
                        }
                        AbstractC47856LCb.A00(anonymousClass182, c30351cq);
                        anonymousClass182.A0a();
                        return;
                    }
                    str = "emojiReaction";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            }
            str = "clipsShare";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    };
    public C1575375n A00;
    public String A01;
    public String A02;

    @Override // X.C1OW
    public final String A02() {
        return "send_clips_share_reply";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        C1575375n c1575375n = this.A00;
        if (c1575375n != null) {
            return c1575375n;
        }
        C14360o3.A0F("clipsShare");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0W;
    }

    @Override // X.InterfaceC29511bS
    public final /* bridge */ /* synthetic */ Object BSj() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("emojiReaction");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29511bS
    public final C2EY BSm() {
        return C2EY.A0m;
    }

    @Override // X.InterfaceC29521bT
    public final C2EY CIC() {
        return C2EY.A1r;
    }

    @Override // X.InterfaceC29521bT
    public final List CI9() {
        C47939LFp A00 = AbstractC46893Koa.A00();
        C2EY c2ey = C2EY.A0W;
        C1575375n c1575375n = this.A00;
        if (c1575375n != null) {
            List singletonList = Collections.singletonList(A00.A00(c2ey, c1575375n));
            C14360o3.A07(singletonList);
            return singletonList;
        }
        C14360o3.A0F("clipsShare");
        throw C00O.createAndThrow();
    }
}
