package X;

import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class EgQ extends GAU {
    public static final Map A07 = new GS5();
    public final String A00;
    public final ImageUrl A03;
    public final EnumC33388EpL A04;
    public final String A05;
    public final String A06;
    public final AtomicReference A02 = new AtomicReference(EnumC33323EoI.PENDING);
    public final CopyOnWriteArrayList A01 = new CopyOnWriteArrayList();

    @Override // X.InterfaceC37225Gaa
    public final boolean EJP() {
        return false;
    }

    @Override // X.InterfaceC37225Gaa
    public final String AY9() {
        return "PENDING".toLowerCase(Locale.US);
    }

    @Override // X.InterfaceC37225Gaa
    public final int AdK() {
        int ordinal = this.A04.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return R.drawable.google_glyph_gray;
            }
            return 0;
        }
        return R.drawable.instagram_facebook_circle_filled_12;
    }

    public EgQ(ImageUrl imageUrl, EnumC33388EpL enumC33388EpL, String str, String str2, String str3) {
        this.A06 = str;
        this.A05 = str2 == null ? "" : str2;
        this.A03 = imageUrl;
        this.A00 = str3;
        this.A04 = enumC33388EpL;
    }

    @Override // X.InterfaceC37225Gaa
    public final String B1C() {
        return "";
    }

    @Override // X.InterfaceC37225Gaa
    public final ImageUrl BGs() {
        return this.A03;
    }

    @Override // X.InterfaceC37225Gaa
    public final String Bck() {
        return "";
    }

    @Override // X.InterfaceC37225Gaa
    public final String getFullName() {
        return this.A05;
    }

    @Override // X.InterfaceC37225Gaa
    public final String getUserId() {
        return "";
    }

    @Override // X.InterfaceC37225Gaa
    public final String getUsername() {
        return this.A06;
    }
}
