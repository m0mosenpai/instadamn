package X;

import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.InputStream;
import java.io.Reader;

/* renamed from: X.0aQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07510aQ extends C222015v {
    public final UserSession A00;

    public C07510aQ(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36324007301492496L) || C18U.A06(c06090Tz, userSession, 36324007302934304L)) {
            C222015v c222015v = AbstractC221915u.A00;
            c222015v.A00 = ((1 << 0) ^ (-1)) & c222015v.A00;
        }
    }

    @Override // X.C222015v
    /* renamed from: A0C, reason: merged with bridge method [inline-methods] */
    public final C07950bF A03(String str) {
        C14360o3.A0B(str, 0);
        C07880b8 c07880b8 = C07950bF.A04;
        return C07880b8.A00(AbstractC221915u.A00.A03(str), this.A00);
    }

    @Override // X.C222015v
    public final /* bridge */ /* synthetic */ C16L A00(File file) {
        C07880b8 c07880b8 = C07950bF.A04;
        return C07880b8.A00(AbstractC221915u.A00.A00(file), this.A00);
    }

    @Override // X.C222015v
    public final /* bridge */ /* synthetic */ C16L A01(InputStream inputStream) {
        C07880b8 c07880b8 = C07950bF.A04;
        return C07880b8.A00(AbstractC221915u.A00.A01(inputStream), this.A00);
    }

    @Override // X.C222015v
    public final /* bridge */ /* synthetic */ C16L A02(Reader reader) {
        C07880b8 c07880b8 = C07950bF.A04;
        return C07880b8.A00(AbstractC221915u.A00.A02(reader), this.A00);
    }

    @Override // X.C222015v
    public final /* bridge */ /* synthetic */ C16L A04(byte[] bArr) {
        C07880b8 c07880b8 = C07950bF.A04;
        return C07880b8.A00(AbstractC221915u.A00.A04(bArr), this.A00);
    }
}
