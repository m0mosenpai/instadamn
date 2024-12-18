package X;

import android.text.Layout;
import com.instagram.api.schemas.ClipsTextFormatType;
import java.util.List;

/* loaded from: classes4.dex */
public final class Al6 implements C5NL {
    public final float A00;
    public final int A01;
    public final Layout.Alignment A02;
    public final ClipsTextFormatType A03;
    public final EnumC194908jr A04;
    public final C6S5 A05;
    public final String A06;

    public Al6(Layout.Alignment alignment, ClipsTextFormatType clipsTextFormatType, EnumC194908jr enumC194908jr, C6S5 c6s5, String str, float f, int i) {
        AbstractC167007dF.A1G(str, 1, clipsTextFormatType);
        this.A06 = str;
        this.A00 = f;
        this.A01 = i;
        this.A02 = alignment;
        this.A03 = clipsTextFormatType;
        this.A05 = c6s5;
        this.A04 = enumC194908jr;
    }

    @Override // X.C5NL
    public final /* synthetic */ List B6F() {
        return C16930sl.A00;
    }

    @Override // X.C5NL
    public final C5NG BlQ() {
        C5NG c5ng = new C5NG();
        c5ng.A01 = C5NH.A07;
        c5ng.A06 = AbstractC166987dD.A1J(AbstractC111324zv.A00(5477));
        return c5ng;
    }

    @Override // X.C5NL
    public final Integer CBq() {
        return C05F.A0w;
    }
}
