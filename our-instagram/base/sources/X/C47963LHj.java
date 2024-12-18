package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.LHj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47963LHj {
    public static final C47963LHj A00 = new Object();

    public static final InterfaceC132185xw A00(C47Z c47z) {
        long j;
        String str;
        GifUrlImpl gifUrlImpl;
        MUD mud = c47z.A0o;
        if (mud != null && (str = mud.A02) != null && (gifUrlImpl = (GifUrlImpl) mud.A00) != null) {
            return new C45168Jz9(AbstractC25225BEi.A0t(gifUrlImpl.A09), gifUrlImpl, c47z.A35, null, str, (int) gifUrlImpl.A03.floatValue(), (int) gifUrlImpl.A02.floatValue());
        }
        String str2 = c47z.A33;
        if (str2 == null) {
            return null;
        }
        SimpleImageUrl A0Q = AbstractC43593JPy.A0Q(str2);
        String str3 = c47z.A35;
        int i = c47z.A0H;
        int i2 = c47z.A0G;
        C38321qM c38321qM = c47z.A1C;
        if (c38321qM != null) {
            j = c38321qM.A18();
        } else {
            j = Long.MAX_VALUE;
        }
        return new C9CM(A0Q, (ImageUrl) null, C05F.A01, str3, (String) null, (String) null, i, i2, j);
    }
}
