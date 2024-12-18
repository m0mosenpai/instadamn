package X;

import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes6.dex */
public final class FOC {
    public Hashtag A00;
    public final InterfaceC132775z0 A01;
    public final User A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final List A08;

    public FOC(InterfaceC132775z0 interfaceC132775z0) {
        this.A01 = interfaceC132775z0;
        C132765yz c132765yz = (C132765yz) interfaceC132775z0;
        String str = c132765yz.A03;
        this.A04 = str == null ? "" : str;
        String str2 = c132765yz.A05;
        this.A06 = str2 == null ? "" : str2;
        String str3 = c132765yz.A04;
        this.A05 = str3 != null ? str3 : "";
        User user = c132765yz.A01;
        this.A02 = user;
        Hashtag hashtag = c132765yz.A00;
        this.A00 = hashtag;
        List list = c132765yz.A06;
        this.A07 = list == null ? C16930sl.A00 : list;
        this.A03 = c132765yz.A02;
        this.A08 = c132765yz.A07;
        if (hashtag != null) {
            C69730VuP c69730VuP = new C69730VuP(hashtag);
            c69730VuP.A01 = AbstractC166997dE.A0b();
            this.A00 = c69730VuP.A00().F59();
        } else {
            if (user == null) {
                return;
            }
            user.A0k(FollowStatus.A06);
        }
    }
}
