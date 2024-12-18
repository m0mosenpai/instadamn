package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.Collections;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(message = "CANNOT REMOVE DUE TO DynamicDispatchAdapter")
/* renamed from: X.1az, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29221az extends AbstractC29011ae {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1b0
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C29221az parseFromJson = AbstractC34175F5z.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            String str;
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C29221az c29221az = (C29221az) obj;
            anonymousClass182.A0d();
            if (c29221az.A01 != null) {
                anonymousClass182.A0r("thread_key");
                DirectThreadKey directThreadKey = c29221az.A01;
                if (directThreadKey != null) {
                    AbstractC83623o5.A00(anonymousClass182, directThreadKey);
                    if (c29221az.A00 != null) {
                        anonymousClass182.A0r("clip");
                        C1575375n c1575375n = c29221az.A00;
                        if (c1575375n != null) {
                            IQG.A00(anonymousClass182, c1575375n);
                            AbstractC47856LCb.A00(anonymousClass182, c29221az);
                            anonymousClass182.A0a();
                            return;
                        }
                    }
                    str = "clipsShare";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            }
            str = "threadKey";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    };
    public C1575375n A00;
    public DirectThreadKey A01;

    @Override // X.C1OW
    public final String A02() {
        return "send_clips_reaction_request_message";
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0z;
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        List singletonList = Collections.singletonList(AbstractC47996LLi.A00());
        C14360o3.A07(singletonList);
        return singletonList;
    }
}
