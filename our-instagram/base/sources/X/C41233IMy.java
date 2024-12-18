package X;

import com.instagram.guides.model.GuideItemAttachment;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.IMy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41233IMy {
    public GuideItemAttachment A00;
    public String A01;
    public String A02;
    public String A03;
    public List A04;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C41233IMy)) {
            return false;
        }
        C41233IMy c41233IMy = (C41233IMy) obj;
        return C2I7.A00(this.A02, c41233IMy.A02) && C2I7.A00(this.A03, c41233IMy.A03) && C2I7.A00(this.A01, c41233IMy.A01) && C2I7.A00(this.A00, c41233IMy.A00) && C2I7.A00(this.A04, c41233IMy.A04);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A03, this.A01, this.A04, this.A00});
    }
}
