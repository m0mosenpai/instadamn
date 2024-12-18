package X;

import com.instagram.model.hashtag.HashtagImpl;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.WiV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70865WiV implements XCW {
    public int A00 = 0;
    public HashtagImpl A01 = null;

    @Override // X.XCW
    public final Integer CBt() {
        return C05F.A0Y;
    }

    @Override // X.XCW
    public final String toJson() {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0S = AbstractC167007dF.A0S(stringWriter);
            A0S.A0Q("bounds_padding_for_underline", this.A00);
            if (this.A01 != null) {
                A0S.A0r("hashtag");
                AbstractC109614wn.A00(A0S, this.A01);
            }
            return AbstractC167017dG.A0l(A0S, stringWriter);
        } catch (IOException unused) {
            return null;
        }
    }
}
