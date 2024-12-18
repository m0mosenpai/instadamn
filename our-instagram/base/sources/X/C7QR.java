package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelType;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7QR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7QR {
    public C47653L2m A00;
    public C7O9 A01;
    public C38321qM A02;
    public C1120954b A03;
    public ReelType A04;
    public User A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public List A0B;
    public List A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.L2m] */
    public C7QR(C38321qM c38321qM, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        C7O9 c7o9;
        this.A02 = c38321qM;
        this.A09 = str2;
        this.A0A = str;
        if (z) {
            if (str6 != null) {
                c7o9 = C7O9.AVATAR_REACTION;
            } else {
                c7o9 = C7O9.EMOJI_REACTION;
            }
            this.A01 = c7o9;
        }
        if (str3 != null && str4 != null) {
            this.A01 = C7O9.INTERACTIVE_STICKER;
            ?? obj = new Object();
            this.A00 = obj;
            obj.A01 = str3;
            obj.A02 = str4;
            obj.A00 = null;
            obj.A03 = str5;
        }
        A03();
    }

    public final String A00(UserSession userSession) {
        User A02;
        if (this.A06 == null || (A02 = AnonymousClass189.A00(userSession).A02(this.A06)) == null) {
            return null;
        }
        return A02.getUsername();
    }

    public final String A01(UserSession userSession) {
        if (this.A07 != null && this.A05 == null) {
            this.A05 = AnonymousClass189.A00(userSession).A02(this.A07);
        }
        User user = this.A05;
        if (user != null) {
            return user.getUsername();
        }
        return null;
    }

    public final List A02(UserSession userSession) {
        if (this.A0B != null && this.A0C == null) {
            this.A0C = new ArrayList();
            C18A A00 = AnonymousClass189.A00(userSession);
            for (String str : this.A0B) {
                List list = this.A0C;
                User A02 = A00.A02(str);
                A02.getClass();
                list.add(A02.getUsername());
            }
        }
        List list2 = this.A0C;
        if (list2 != null) {
            return Collections.unmodifiableList(list2);
        }
        return null;
    }

    public final void A03() {
        if (this.A0E) {
            this.A01 = C7O9.CHALLENGE_NOMINATION;
        }
        if (this.A01 == null) {
            this.A01 = C7O9.REPLY;
        }
        if (this.A04 == null) {
            this.A04 = ReelType.A0n;
        }
    }

    public C7QR() {
    }
}
