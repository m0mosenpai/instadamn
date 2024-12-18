package X;

import com.instagram.guides.model.GuideItemAttachment;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I1C {
    public static GuideItemAttachment parseFromJson(C16L c16l) {
        EnumC39543HdF enumC39543HdF;
        C14360o3.A0B(c16l, 0);
        try {
            GuideItemAttachment guideItemAttachment = new GuideItemAttachment();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("account".equals(A0s)) {
                    guideItemAttachment.A03 = AbstractC31171DnF.A0S(c16l, false);
                } else if ("place".equals(A0s)) {
                    guideItemAttachment.A02 = I4Q.parseFromJson(c16l);
                } else if ("product_container".equals(A0s)) {
                    guideItemAttachment.A01 = I3G.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (guideItemAttachment.A03 != null) {
                enumC39543HdF = EnumC39543HdF.A02;
            } else if (guideItemAttachment.A02 != null) {
                enumC39543HdF = EnumC39543HdF.A03;
            } else if (guideItemAttachment.A01 != null) {
                enumC39543HdF = EnumC39543HdF.A04;
            } else {
                enumC39543HdF = EnumC39543HdF.A05;
            }
            guideItemAttachment.A00 = enumC39543HdF;
            return guideItemAttachment;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
