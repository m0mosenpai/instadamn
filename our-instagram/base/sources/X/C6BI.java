package X;

import android.content.Context;
import android.graphics.Typeface;

/* renamed from: X.6BI, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6BI {
    public static final Typeface A00(Context context, String str) {
        EnumC15950qp enumC15950qp;
        C14360o3.A0B(str, 1);
        if (!AbstractC13670mt.A0B(str)) {
            if (str.equals("Optimistic Display App")) {
                enumC15950qp = EnumC15950qp.A0i;
            } else if (str.equals("Optimistic Display App Medium")) {
                enumC15950qp = EnumC15950qp.A0j;
            } else if (str.equals("Optimistic Text App Regular")) {
                enumC15950qp = EnumC15950qp.A0m;
            } else if (str.equals("Optimistic Text App Medium")) {
                enumC15950qp = EnumC15950qp.A0l;
            } else if (str.equals("Optimistic Text App Bold")) {
                enumC15950qp = EnumC15950qp.A0k;
            } else if (str.equals("Optimistic VF App Lite")) {
                enumC15950qp = EnumC15950qp.A0n;
            } else if (str.equals("Old Standard TT")) {
                enumC15950qp = EnumC15950qp.A0g;
            } else if (str.equals("Montserrat")) {
                enumC15950qp = EnumC15950qp.A0e;
            } else if (str.equals("Montserrat Extra Bold Italic")) {
                enumC15950qp = EnumC15950qp.A0c;
            } else if (str.equals("Aveny T Medium")) {
                enumC15950qp = EnumC15950qp.A0W;
            } else if (str.equals("Instagram Sans Condensed")) {
                enumC15950qp = EnumC15950qp.A0V;
            } else if (str.equals("Barlow Semi Bold")) {
                enumC15950qp = EnumC15950qp.A08;
            } else if (str.equals("Courier Prime Bold")) {
                enumC15950qp = EnumC15950qp.A0C;
            } else if (!str.equals("Didot")) {
                if (str.equals("prism")) {
                    enumC15950qp = EnumC15950qp.A0q;
                } else if (str.equals("prism-medium")) {
                    enumC15950qp = EnumC15950qp.A0r;
                } else if (str.equals("prism-bold")) {
                    enumC15950qp = EnumC15950qp.A0p;
                }
            }
            Typeface create = Typeface.create(AbstractC15960qq.A00(context).A02(enumC15950qp), 0);
            if (create != null) {
                return create;
            }
        }
        Typeface create2 = Typeface.create(str, 0);
        C14360o3.A07(create2);
        return create2;
    }
}
