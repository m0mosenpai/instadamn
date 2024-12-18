package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3oP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83803oP {
    public long A00;
    public long A01;
    public ImageUrl A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public final ImageUrl A00() {
        return this.A02;
    }

    public final String A01() {
        return this.A05;
    }

    public final String A03() {
        return this.A07;
    }

    public final String toString() {
        return AnonymousClass001.A0m("OneTapLoginUser{username=", this.A07, ", allowOneTap=", '}', this.A08);
    }

    public C83803oP(ImageUrl imageUrl, String str, String str2, String str3) {
        this.A01 = -1L;
        this.A00 = -1L;
        this.A04 = "APP_LEVEL_SPI_NO";
        this.A06 = str;
        this.A07 = str2;
        this.A02 = imageUrl;
        this.A05 = str3;
        this.A08 = true;
        this.A09 = false;
        if (str2 == null) {
            C0w9.A03("OneTapLoginUser", "OneTapLoginUser was created w/ NULL username - should never happen.");
        }
    }

    public final String A02() {
        if (System.currentTimeMillis() - this.A00 >= TimeUnit.DAYS.toMillis(85L)) {
            this.A03 = null;
            this.A00 = -1L;
        }
        return this.A03;
    }

    public C83803oP(User user, String str) {
        this.A01 = -1L;
        this.A00 = -1L;
        this.A04 = "APP_LEVEL_SPI_NO";
        this.A06 = user.getId();
        this.A07 = user.getUsername();
        this.A02 = user.Bhu();
        this.A05 = str;
        this.A08 = true;
        if (this.A07 == null) {
            C0w9.A03("OneTapLoginUser", "OneTapLoginUser was created w/ NULL username - should never happen.");
        }
    }

    public C83803oP() {
        this.A01 = -1L;
        this.A00 = -1L;
        this.A04 = "APP_LEVEL_SPI_NO";
    }
}
