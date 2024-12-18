package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.1lJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35371lJ extends AbstractC29011ae implements InterfaceC29501bR {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1lK
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C35371lJ parseFromJson = AbstractC40588Hz8.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C35371lJ c35371lJ = (C35371lJ) obj;
            anonymousClass182.A0d();
            String str = c35371lJ.A00;
            if (str != null) {
                anonymousClass182.A0S("presence_id", str);
                String str2 = c35371lJ.A01;
                if (str2 != null) {
                    anonymousClass182.A0S("reply_text", str2);
                }
                AbstractC47856LCb.A00(anonymousClass182, c35371lJ);
                anonymousClass182.A0a();
                return;
            }
            C14360o3.A0F("presenceId");
            throw C00O.createAndThrow();
        }
    };
    public String A00;
    public String A01 = "";

    @Override // X.C1OW
    public final String A02() {
        return "friend_map_presence";
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0z;
    }

    @Override // X.InterfaceC29511bS
    public final /* bridge */ /* synthetic */ Object BSj() {
        return this.A01;
    }

    @Override // X.InterfaceC29511bS
    public final C2EY BSm() {
        return C2EY.A1i;
    }

    @Override // X.InterfaceC29521bT
    public final C2EY CIC() {
        return C2EY.A0z;
    }

    public static final List A00() {
        List singletonList = Collections.singletonList(AbstractC47996LLi.A00());
        C14360o3.A07(singletonList);
        return singletonList;
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        return A00();
    }

    @Override // X.InterfaceC29521bT
    public final List CI9() {
        return A00();
    }
}
