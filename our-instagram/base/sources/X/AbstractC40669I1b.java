package X;

import java.io.IOException;

/* renamed from: X.I1b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40669I1b {
    public static C41136IJb parseFromJson(C16L c16l) {
        Integer num;
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C41136IJb c41136IJb = new C41136IJb();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("info_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c41136IJb.A05 = A1P;
                } else if ("bloks_data".equals(A0s)) {
                    if (C11T.A08()) {
                        C0w9.A01(EnumC12410kj.A0A, "BloksRenderModel.parse", "BloksRenderModel is being parsed on the UI thread, move this to a background thread");
                    }
                    C914346k parseFromJson = IQ3.parseFromJson(c16l);
                    c41136IJb.A02 = new C114665Fw(parseFromJson.A00, parseFromJson.A01);
                } else if ("sticker_share_data".equals(A0s)) {
                    c41136IJb.A03 = AbstractC40670I1c.parseFromJson(c16l);
                } else if ("padding_top".equals(A0s)) {
                    c41136IJb.A01 = c16l.A1D();
                } else if ("padding_bottom".equals(A0s)) {
                    c41136IJb.A00 = c16l.A1D();
                }
                c16l.A0z();
            }
            if (c41136IJb.A02 != null) {
                num = C05F.A01;
            } else if (c41136IJb.A03 != null) {
                num = C05F.A0C;
            } else {
                return c41136IJb;
            }
            c41136IJb.A04 = num;
            return c41136IJb;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
