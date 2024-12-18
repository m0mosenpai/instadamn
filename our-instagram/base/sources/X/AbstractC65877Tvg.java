package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.Tvg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC65877Tvg {
    public static final AbstractC70117W4p A00 = new C65880Tvj(Arrays.asList(new Object(), new Object()));

    public static Drawable A00(Context context, XC0 xc0, InterfaceC133175zj interfaceC133175zj, InterfaceC133165zi interfaceC133165zi) {
        AbstractC70117W4p abstractC70117W4p = A00;
        Integer Btr = xc0.Btr();
        int A01 = abstractC70117W4p.A01((xc0.ordinal() << 8) | (Btr.intValue() << 24) | (interfaceC133165zi.ordinal() << 5) | interfaceC133175zj.ordinal());
        if (A01 == 0) {
            String A002 = AbstractC70117W4p.A00(context.getResources(), interfaceC133175zj, interfaceC133165zi, Btr, xc0.toString());
            int Bxg = interfaceC133175zj.Bxg();
            return AbstractC56412ia.A00.A04(context.getResources(), A002, Bxg, Bxg, 160);
        }
        return context.getDrawable(A01);
    }

    public static Drawable A01(Context context, InterfaceC133175zj interfaceC133175zj, InterfaceC133165zi interfaceC133165zi, String str) {
        XC0 A02 = A00.A02(C05F.A0C, str);
        if (A02 != null) {
            return A00(context, A02, interfaceC133175zj, interfaceC133165zi);
        }
        String A002 = AbstractC70117W4p.A00(context.getResources(), interfaceC133175zj, interfaceC133165zi, interfaceC133165zi.Btr(), str);
        int Bxg = interfaceC133175zj.Bxg();
        return AbstractC56412ia.A00.A04(context.getResources(), A002, Bxg, Bxg, 160);
    }

    public static XNQ A03(String str) {
        return (XNQ) A00.A02(C05F.A0C, str.replace("-", "_").toUpperCase(Locale.ROOT));
    }

    public static Integer A04(XC0 xc0, InterfaceC133175zj interfaceC133175zj, InterfaceC133165zi interfaceC133165zi) {
        int A01;
        AbstractC70117W4p abstractC70117W4p = A00;
        if (xc0 == null) {
            A01 = 0;
        } else {
            A01 = abstractC70117W4p.A01((xc0.ordinal() << 8) | (xc0.Btr().intValue() << 24) | (interfaceC133165zi.ordinal() << 5) | interfaceC133175zj.ordinal());
        }
        return Integer.valueOf(A01);
    }

    public static Integer A05(String str) {
        String str2;
        String str3;
        String str4;
        String[] split = str.split("_");
        int length = split.length;
        if (length != 3) {
            if (length != 4) {
                if (length != 5) {
                    return null;
                }
                str2 = split[0].concat("_").concat(split[1]).concat("_").concat(split[2]);
                str3 = split[3];
                str4 = split[4];
            } else {
                str2 = split[0].concat("_").concat(split[1]);
                str3 = split[2];
                str4 = split[3];
            }
        } else {
            str2 = split[0];
            str3 = split[1];
            str4 = split[2];
        }
        String replace = str2.replace("-", "_");
        Locale locale = Locale.ROOT;
        return A04(XNQ.valueOf(replace.toUpperCase(locale)), BSV.valueOf(AnonymousClass001.A0R("SIZE_", str4)), BSU.valueOf(str3.toUpperCase(locale)));
    }

    public static Drawable A02(Context context, String str) {
        int intValue;
        Integer A05 = A05(str);
        if (A05 != null && (intValue = A05.intValue()) != 0) {
            return context.getDrawable(intValue);
        }
        return null;
    }
}
