package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* loaded from: classes5.dex */
public abstract class CWE {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C38321qM A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public final Drawable A00(Context context) {
        if (this instanceof C2J) {
            C14360o3.A0B(context, 0);
            if (((C2J) this).A03) {
                Drawable A00 = AbstractC65877Tvg.A00(context, XNQ.A3u, BSV.SIZE_24, BSU.OUTLINE);
                AbstractC25231BEo.A0x(context, A00, AbstractC53242c7.A0H(context, R.attr.igds_color_primary_icon));
                return A00;
            }
            return null;
        }
        if (this instanceof C2I) {
            C14360o3.A0B(context, 0);
            if (((C2I) this).A02) {
                Drawable A002 = AbstractC65877Tvg.A00(context, XNQ.A3u, BSV.SIZE_16, BSU.OUTLINE);
                AbstractC25231BEo.A0x(context, A002, AbstractC53242c7.A0H(context, R.attr.igds_color_primary_icon));
                return A002;
            }
            return null;
        }
        C14360o3.A0B(context, 0);
        Drawable A003 = AbstractC65877Tvg.A00(context, XNQ.A3v, BSV.SIZE_24, BSU.FILLED);
        AbstractC25231BEo.A0x(context, A003, R.color.igds_facebook_blue);
        return A003;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (X.C18U.A06(r2, r3, 36329762557280783L) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence A01(android.content.res.Resources r5) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C2J
            if (r0 == 0) goto L34
            r0 = r4
            X.C2J r0 = (X.C2J) r0
            com.instagram.common.session.UserSession r3 = r0.A00
            X.1qM r0 = r0.A03
            boolean r0 = X.AbstractC166297by.A00(r3, r0)
            if (r0 == 0) goto L53
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 2342163829649515435(0x20810998000723ab, double:4.0662815402183816E-152)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L53
            r0 = 36329762557280783(0x8111ba0000420f, double:3.038426357211721E-306)
            boolean r1 = X.C18U.A06(r2, r3, r0)
            r0 = 2131976114(0x7f135fb2, float:1.958934E38)
            if (r1 == 0) goto L2f
        L2c:
            r0 = 2131976113(0x7f135fb1, float:1.9589337E38)
        L2f:
            java.lang.CharSequence r0 = r5.getText(r0)
            return r0
        L34:
            boolean r0 = r4 instanceof X.C2I
            if (r0 == 0) goto L53
            r0 = r4
            X.C2I r0 = (X.C2I) r0
            com.instagram.common.session.UserSession r3 = r0.A00
            X.1qM r0 = r0.A03
            boolean r0 = X.AbstractC166297by.A00(r3, r0)
            if (r0 == 0) goto L53
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 2342163829649580972(0x20810998000823ac, double:4.066281540273951E-152)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L53
            goto L2c
        L53:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CWE.A01(android.content.res.Resources):java.lang.CharSequence");
    }

    public final String A02(Resources resources, CharSequence charSequence) {
        String A0r;
        int i;
        Object[] objArr;
        if (this instanceof C2F) {
            C14360o3.A0B(resources, 0);
            A0r = AbstractC166997dE.A0r(resources, charSequence, 2131973686);
        } else if (this instanceof C2G) {
            C14360o3.A0B(resources, 0);
            A0r = AbstractC166997dE.A0r(resources, charSequence, 2131973682);
        } else {
            if (this instanceof C2H) {
                C2H c2h = (C2H) this;
                C14360o3.A0B(resources, 0);
                return BO2.A00.A04(resources, charSequence, c2h.A02, c2h.A01, c2h.A00);
            }
            if (this instanceof C2J) {
                C2J c2j = (C2J) this;
                C14360o3.A0B(resources, 0);
                int i2 = ((CWE) c2j).A02;
                String A0r2 = AbstractC25231BEo.A0r(resources, C84963qk.A04(resources, Integer.valueOf(i2), 10000, false, false), R.plurals.unified_feedback_reactions_from_fb, i2);
                int i3 = ((CWE) c2j).A01;
                String A0r3 = AbstractC25231BEo.A0r(resources, C84963qk.A04(resources, Integer.valueOf(i3), 10000, false, false), R.plurals.unified_feedback_plays_from_fb, i3);
                boolean z = c2j.A01;
                if (i2 > 0) {
                    if (i3 > 0) {
                        i = 2131976108;
                        if (z) {
                            i = 2131976107;
                        }
                        objArr = new Object[]{A0r2, A0r3};
                    } else {
                        i = 2131976110;
                        if (z) {
                            i = 2131976109;
                        }
                        objArr = new Object[]{A0r2};
                    }
                } else {
                    i = 2131976110;
                    if (z) {
                        i = 2131976109;
                    }
                    objArr = new Object[]{A0r3};
                }
                String string = resources.getString(i, objArr);
                C14360o3.A0A(string);
                return string;
            }
            C2I c2i = (C2I) this;
            C14360o3.A0B(resources, 0);
            int i4 = 2131976110;
            if (c2i.A01) {
                i4 = 2131976109;
            }
            int i5 = ((CWE) c2i).A00;
            A0r = AbstractC166997dE.A0r(resources, resources.getQuantityString(R.plurals.unified_feedback_comments_from_fb, i5, AbstractC25231BEo.A0q(resources, i5)), i4);
        }
        C14360o3.A07(A0r);
        return A0r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
    
        if (r3.A0C.getClipsMetadata() == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CWE(X.C38321qM r3) {
        /*
            r2 = this;
            r2.<init>()
            r2.A03 = r3
            java.lang.String r0 = r3.A2u()
            if (r0 != 0) goto Ld
            java.lang.String r0 = ""
        Ld:
            r2.A04 = r0
            int r0 = r3.A0u()
            r2.A02 = r0
            int r0 = r3.A0v()
            r2.A01 = r0
            X.1rF r0 = r3.A0C
            java.lang.Integer r0 = r0.B4a()
            int r0 = X.AbstractC167017dG.A0K(r0)
            r2.A00 = r0
            boolean r0 = r3.A5P()
            if (r0 == 0) goto L36
            X.1rF r0 = r3.A0C
            X.3x9 r1 = r0.getClipsMetadata()
            r0 = 1
            if (r1 != 0) goto L37
        L36:
            r0 = 0
        L37:
            r2.A06 = r0
            boolean r0 = r3.A5b()
            r2.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CWE.<init>(X.1qM):void");
    }
}
