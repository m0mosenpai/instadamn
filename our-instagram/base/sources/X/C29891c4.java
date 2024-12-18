package X;

import android.os.Parcelable;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;
import java.util.Collections;

@Deprecated
/* renamed from: X.1c4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29891c4 extends AbstractC29011ae {
    public static final C1OZ A01 = new C1OZ() { // from class: X.1c5
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C29891c4 c29891c4 = (C29891c4) obj;
            anonymousClass182.A0d();
            if (c29891c4.A00 != null) {
                anonymousClass182.A0r("sender");
                User user = c29891c4.A00;
                Parcelable.Creator creator = User.CREATOR;
                AbstractC38851rI.A08(anonymousClass182, user);
            }
            AbstractC47856LCb.A00(anonymousClass182, c29891c4);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC46958Kpd.parseFromJson(c16l);
        }
    };
    public User A00;

    @Override // X.C1OW
    public final String A02() {
        return "send_book_now_link_share_message";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        String str;
        String str2;
        User user = this.A00;
        if (user == null) {
            return Collections.emptyList();
        }
        String username = user.getUsername();
        this.A00.Bhu();
        String str3 = null;
        ExtendedImageUrl extendedImageUrl = new ExtendedImageUrl(this.A00.Bhu());
        this.A00.A0C();
        ExtendedImageUrl extendedImageUrl2 = new ExtendedImageUrl(this.A00.A0C());
        InterfaceC111194zh Ayj = this.A00.A03.Ayj();
        if (Ayj != null) {
            str = Ayj.AyS();
            str2 = Ayj.getUrl();
            str3 = Ayj.getUrl();
        } else {
            str = null;
            str2 = null;
        }
        return Collections.singletonList(AbstractC47996LLi.A05(extendedImageUrl, extendedImageUrl2, null, null, 1, null, null, username, str, str2, str3, null, 0));
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0Q;
    }
}
