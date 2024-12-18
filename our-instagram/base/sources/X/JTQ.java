package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* loaded from: classes8.dex */
public final class JTQ {
    public static final String A00 = JTQ.class.getName();

    public static final int A00(EnumC162657Qc enumC162657Qc, EnumC101664hb enumC101664hb, C2EY c2ey, Integer num, boolean z, boolean z2) {
        C14360o3.A0B(enumC162657Qc, 1);
        if (!z2) {
            int ordinal = enumC162657Qc.ordinal();
            if (ordinal != 4 && ordinal != 3) {
                String str = A00;
                C14360o3.A08(str);
                C0w9.A03(str, AbstractC166997dE.A0z("Unexpected Message lifecycle state for message from other: %s", AbstractC166997dE.A1b(enumC162657Qc, 1)));
            }
            return 0;
        }
        int ordinal2 = enumC162657Qc.ordinal();
        if (ordinal2 != 3) {
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    return 7;
                }
                if (ordinal2 != 2) {
                    String str2 = A00;
                    C14360o3.A08(str2);
                    C0w9.A03(str2, "Invalid message lifecycle state");
                    return 7;
                }
                return 8;
            }
            return 3;
        }
        if (!z) {
            if (C2EY.A0q == c2ey || C2EY.A1l == c2ey) {
                if (enumC101664hb != null && num != null && num.intValue() > 0) {
                    int ordinal3 = enumC101664hb.ordinal();
                    if (ordinal3 == 7) {
                        return 4;
                    }
                    if (ordinal3 == 9) {
                        return 5;
                    }
                    if (ordinal3 == 8) {
                        return 6;
                    }
                    return 1;
                }
                String str3 = A00;
                C14360o3.A08(str3);
                C0w9.A03(str3, "actionLogs null or empty");
                return 1;
            }
            return 1;
        }
        return 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C25312BIh A01(android.content.Context r6, int r7) {
        /*
            r1 = 2
            r0 = 3
            if (r7 == r1) goto L2d
            if (r7 == r0) goto L2d
            switch(r7) {
                case 6: goto L22;
                case 7: goto L29;
                case 8: goto L29;
                case 9: goto L35;
                default: goto L9;
            }
        L9:
            r5 = 0
            r2 = 0
            r3 = 8
            r4 = 0
        Le:
            if (r7 == r0) goto L17
            r1 = 0
        L11:
            X.BIh r0 = new X.BIh
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L17:
            boolean r0 = X.AbstractC13620mo.A02(r6)
            r1 = -1042808832(0xffffffffc1d80000, float:-27.0)
            if (r0 == 0) goto L11
            r1 = 1104674816(0x41d80000, float:27.0)
            goto L11
        L22:
            r4 = 2131960519(0x7f1322c7, float:1.9557709E38)
            r2 = 2131239943(0x7f082407, float:1.8096207E38)
            goto L3b
        L29:
            r4 = 2131962077(0x7f1328dd, float:1.9560869E38)
            goto L38
        L2d:
            r2 = 2131231674(0x7f0803ba, float:1.8079436E38)
            r4 = 2131973312(0x7f1354c0, float:1.9583656E38)
            r5 = 1
            goto L3c
        L35:
            r4 = 2131969899(0x7f13476b, float:1.9576734E38)
        L38:
            r2 = 2131231671(0x7f0803b7, float:1.807943E38)
        L3b:
            r5 = 0
        L3c:
            r3 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JTQ.A01(android.content.Context, int):X.BIh");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if (r0 != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r0 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        r2 = com.facebook.R.drawable.direct_visual_message_status_arrow_right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r2 = com.facebook.R.drawable.direct_visual_message_status_arrow_left;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C25312BIh A02(android.content.Context r4, int r5) {
        /*
            r3 = 0
            boolean r0 = X.AbstractC13620mo.A02(r4)
            switch(r5) {
                case 0: goto L14;
                case 1: goto L1a;
                case 2: goto L8;
                case 3: goto L8;
                case 4: goto L20;
                case 5: goto L24;
                default: goto L8;
            }
        L8:
            r2 = 2131231167(0x7f0801bf, float:1.8078407E38)
        Lb:
            r1 = 0
            X.BIh r0 = new X.BIh
            r4 = r3
            r5 = r3
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L14:
            if (r0 == 0) goto L1c
        L16:
            r2 = 2131231676(0x7f0803bc, float:1.807944E38)
            goto Lb
        L1a:
            if (r0 == 0) goto L16
        L1c:
            r2 = 2131231675(0x7f0803bb, float:1.8079438E38)
            goto Lb
        L20:
            r2 = 2131231672(0x7f0803b8, float:1.8079432E38)
            goto Lb
        L24:
            r2 = 2131231673(0x7f0803b9, float:1.8079434E38)
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JTQ.A02(android.content.Context, int):X.BIh");
    }

    public static final void A03(TextView textView, C25312BIh c25312BIh, int i) {
        Context context = textView.getContext();
        Drawable drawable = context.getDrawable(c25312BIh.A02);
        if (drawable != null) {
            drawable.mutate();
            AbstractC166997dE.A1F(drawable, i);
        }
        if (AbstractC13620mo.A02(context)) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        textView.setCompoundDrawablePadding(AbstractC167017dG.A0D(context));
    }
}
