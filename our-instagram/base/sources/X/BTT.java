package X;

import android.content.Context;
import android.graphics.Color;
import android.util.Size;
import com.facebook.R;
import com.instagram.api.schemas.StoryLinkInfoDict;

/* loaded from: classes5.dex */
public final class BTT extends AbstractC51572Yf {
    public final InterfaceC30982Djd A00;
    public final C25586BSz A01;
    public final Size A02;

    public BTT(Size size, InterfaceC30982Djd interfaceC30982Djd, C25586BSz c25586BSz) {
        C14360o3.A0B(interfaceC30982Djd, 2);
        this.A01 = c25586BSz;
        this.A00 = interfaceC30982Djd;
        this.A02 = size;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.6RN, java.lang.Object] */
    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        int A03;
        int A00;
        int A01;
        C14360o3.A0B(c76223bS, 0);
        C25586BSz c25586BSz = this.A01;
        if (!c25586BSz.A05) {
            return null;
        }
        String str = c25586BSz.A04;
        StoryLinkInfoDict storyLinkInfoDict = new StoryLinkInfoDict(null, null, null, null, null, null, str, null, null, null, null);
        ?? obj = new Object();
        obj.A00 = storyLinkInfoDict;
        String str2 = c25586BSz.A03;
        if (str2 != null) {
            A03 = Color.parseColor(str2);
        } else {
            A03 = AbstractC25232BEp.A03(c76223bS.A05.A0C, c76223bS, R.attr.igds_color_text_on_white);
        }
        C2XE c2xe = c76223bS.A05;
        Context A0E = AbstractC25225BEi.A0E(c2xe);
        C133115zd c133115zd = new C133115zd(A0E, c25586BSz.A02, obj, false, Integer.valueOf(A03), null, "link_sticker_primary_color", null, null, AbstractC13890nF.A01(A0E), true, false, false);
        Size size = this.A02;
        if (size != null) {
            A00 = size.getHeight();
            A01 = size.getWidth();
        } else {
            A00 = AbstractC13890nF.A00(A0E);
            A01 = AbstractC13890nF.A01(A0E);
        }
        float f = A00 * 0.65f;
        int i = (A01 - c133115zd.A08) / 2;
        C75933ay c75933ay = C51722Yv.A02;
        long j = ((int) f) | 9221401712017801216L;
        C51722Yv A002 = C9CU.A00(C9CV.A00(null, C05F.A0Y, EnumC77933eL.ABSOLUTE, 3), C05F.A0C, 1, i | 9221401712017801216L);
        Integer num = C05F.A0N;
        C51722Yv A003 = C9CV.A00(C9CV.A00(C9CV.A00(C9CU.A00(A002, num, 1, j), C05F.A00, EnumC77683ds.CENTER, 3), C05F.A0u, true, 4), C05F.A01, true, 4);
        if (str != null) {
            A003 = C9CV.A00(A003, num, str, 0);
        }
        return AbstractC25234BEr.A0O(c133115zd, c2xe, AbstractC25231BEo.A0Y(A003, C30180DRl.A00(this, 20)));
    }
}
