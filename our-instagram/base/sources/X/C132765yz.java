package X;

import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.5yz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132765yz extends C0T6 implements InterfaceC132775z0 {
    public final Hashtag A00;
    public final User A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C132765yz) {
                C132765yz c132765yz = (C132765yz) obj;
                if (!C14360o3.A0K(this.A02, c132765yz.A02) || !C14360o3.A0K(this.A00, c132765yz.A00) || !C14360o3.A0K(this.A06, c132765yz.A06) || !C14360o3.A0K(this.A03, c132765yz.A03) || !C14360o3.A0K(this.A04, c132765yz.A04) || !C14360o3.A0K(this.A05, c132765yz.A05) || !C14360o3.A0K(this.A07, c132765yz.A07) || !C14360o3.A0K(this.A01, c132765yz.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A02;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Hashtag hashtag = this.A00;
        int hashCode2 = (hashCode + (hashtag == null ? 0 : hashtag.hashCode())) * 31;
        List list = this.A06;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.A03;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A04;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A05;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list2 = this.A07;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        User user = this.A01;
        return hashCode7 + (user != null ? user.hashCode() : 0);
    }

    public C132765yz(Hashtag hashtag, User user, String str, String str2, String str3, String str4, List list, List list2) {
        this.A02 = str;
        this.A00 = hashtag;
        this.A06 = list;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A07 = list2;
        this.A01 = user;
    }
}
