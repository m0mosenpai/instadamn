package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.L9v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47813L9v {
    public long A00;
    public ImageUrl A01;
    public ExtendedImageUrl A02;
    public User A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;

    public final String A00() {
        String str = this.A05;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("replyText");
        throw C00O.createAndThrow();
    }

    public final String A01() {
        String str = this.A06;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("subtitle");
        throw C00O.createAndThrow();
    }

    public final String A02() {
        String str = this.A07;
        if (str != null) {
            return str;
        }
        C14360o3.A0F(DialogModule.KEY_TITLE);
        throw C00O.createAndThrow();
    }
}
