package X;

import com.instagram.model.direct.gifs.DirectAnimatedMedia;

/* loaded from: classes8.dex */
public final class L93 {
    public L3Y A00;
    public DirectAnimatedMedia A01;
    public C1120954b A02;
    public Integer A03;
    public String A04;
    public String A05;

    public final DirectAnimatedMedia A00() {
        C1120954b c1120954b;
        DirectAnimatedMedia directAnimatedMedia = this.A01;
        if (directAnimatedMedia == null && (c1120954b = this.A02) != null) {
            DirectAnimatedMedia A01 = AbstractC1121154d.A01(c1120954b);
            this.A01 = A01;
            return A01;
        }
        return directAnimatedMedia;
    }

    public final Integer A01() {
        Integer num = this.A03;
        if (num == null) {
            String str = this.A04;
            if (str != null && !str.isEmpty() && str.equals("❤")) {
                return C05F.A01;
            }
            if (A00() != null) {
                return C05F.A0C;
            }
            return C05F.A00;
        }
        return num;
    }
}
