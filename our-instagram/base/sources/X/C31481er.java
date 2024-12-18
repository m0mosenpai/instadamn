package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1er, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31481er extends C1OW implements InterfaceC29021af, InterfaceC29171au {
    public static final C1OZ A05 = new C1OZ() { // from class: X.1es
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C31481er parseFromJson = AbstractC46941KpM.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            String str;
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C31481er c31481er = (C31481er) obj;
            anonymousClass182.A0d();
            C2EY c2ey = c31481er.A03;
            if (c2ey != null) {
                anonymousClass182.A0S(TraceFieldType.ContentType, c2ey.toString());
                if (c31481er.A02 != null) {
                    anonymousClass182.A0r("thread_key");
                    DirectThreadKey directThreadKey = c31481er.A02;
                    if (directThreadKey != null) {
                        AbstractC83623o5.A00(anonymousClass182, directThreadKey);
                        Long l = c31481er.A04;
                        if (l != null) {
                            anonymousClass182.A0R("pending_timestamp_us", l.longValue());
                        }
                        anonymousClass182.A0R("timestamp_us", c31481er.A00);
                        c31481er.A03();
                        anonymousClass182.A0r("params");
                        FUT.A00(anonymousClass182, c31481er.A03());
                        AbstractC43669JTd.A00(anonymousClass182, c31481er);
                        anonymousClass182.A0a();
                        return;
                    }
                }
                str = "directThreadKey";
            } else {
                str = "_contentType";
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    };
    public long A00;
    public DirectForwardingParams A01;
    public DirectThreadKey A02;
    public C2EY A03;
    public Long A04;

    public C31481er() {
        super(null, null, 1);
        this.A00 = -1L;
    }

    @Override // X.C1OW
    public final String A02() {
        return "forward_message";
    }

    @Override // X.C1OW
    public final DirectThreadKey A01() {
        DirectThreadKey directThreadKey = this.A02;
        if (directThreadKey != null) {
            return directThreadKey;
        }
        C14360o3.A0F("directThreadKey");
        throw C00O.createAndThrow();
    }

    public final DirectForwardingParams A03() {
        DirectForwardingParams directForwardingParams = this.A01;
        if (directForwardingParams != null) {
            return directForwardingParams;
        }
        C14360o3.A0F("forwardingParams");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        C2EY c2ey = this.A03;
        if (c2ey != null) {
            return c2ey;
        }
        C14360o3.A0F("_contentType");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        DirectThreadKey directThreadKey = this.A02;
        if (directThreadKey != null) {
            return directThreadKey;
        }
        C14360o3.A0F("directThreadKey");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29021af
    public final List C7R() {
        DirectThreadKey directThreadKey = this.A02;
        if (directThreadKey != null) {
            List singletonList = Collections.singletonList(directThreadKey);
            C14360o3.A07(singletonList);
            return singletonList;
        }
        C14360o3.A0F("directThreadKey");
        throw C00O.createAndThrow();
    }
}
