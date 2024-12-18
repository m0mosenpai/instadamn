package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.mediasize.VideoVersion;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Fgg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35247Fgg {
    public static final C74843Xy A00(IgImageView igImageView) {
        C14360o3.A0B(igImageView, 0);
        C74843Xy c74843Xy = new C74843Xy();
        float A05 = AbstractC166997dE.A05(igImageView.getResources());
        c74843Xy.A07(A05, A05, A05, A05);
        return c74843Xy;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C32050E6c A01(com.instagram.common.session.UserSession r10, X.C32050E6c r11, java.lang.String r12) {
        /*
            r0 = 0
            X.C14360o3.A0B(r11, r0)
            boolean r3 = X.AbstractC167007dF.A1V(r12)
            java.util.HashMap r9 = X.AbstractC166987dD.A1G()
            java.util.HashMap r0 = r11.A08
            if (r0 == 0) goto L13
            r9.putAll(r0)
        L13:
            java.lang.String r4 = r11.A07
            java.lang.Class<X.L6n> r2 = X.C47745L6n.class
            r1 = 49
            X.GSy r0 = new X.GSy
            r0.<init>(r10, r1)
            java.lang.Object r0 = r10.A01(r2, r0)
            X.L6n r0 = (X.C47745L6n) r0
            java.lang.String r6 = r11.A05
            if (r6 == 0) goto L33
            java.lang.String r8 = r0.A00(r6, r12, r4)
        L2c:
            boolean r0 = X.C14360o3.A0K(r4, r8)
            if (r0 == 0) goto L35
            return r11
        L33:
            r8 = 0
            goto L2c
        L35:
            if (r8 == 0) goto L68
            if (r4 != 0) goto L68
            java.lang.Number r0 = X.AbstractC31171DnF.A0W(r8, r9)
            if (r0 != 0) goto L5d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
        L43:
            r9.put(r8, r0)
            r12 = 1
        L47:
            X.E6X r1 = r11.A00
            X.7Q4 r2 = r11.A01
            java.lang.String r7 = r11.A06
            java.lang.Integer r4 = r11.A04
            com.instagram.user.model.User r3 = r11.A02
            java.lang.Integer r5 = r11.A03
            boolean r10 = r11.A0B
            boolean r11 = r11.A0A
            X.E6c r0 = new X.E6c
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L5d:
            int r0 = r0.intValue()
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L43
        L68:
            java.lang.String r2 = "Required value was null."
            if (r8 != 0) goto L84
            if (r4 == 0) goto L7d
            java.lang.Object r0 = r9.get(r4)
            if (r0 == 0) goto La9
            int r2 = X.AbstractC166987dD.A0H(r0)
        L78:
            if (r2 != r3) goto L7f
            r9.remove(r4)
        L7d:
            r12 = 0
            goto L47
        L7f:
            int r2 = r2 - r3
            X.AbstractC166997dE.A1U(r4, r9, r2)
            goto L7d
        L84:
            if (r4 == 0) goto L7d
            java.lang.Number r1 = X.AbstractC31171DnF.A0W(r8, r9)
            java.lang.Object r0 = r9.get(r4)
            if (r0 == 0) goto Lae
            int r2 = X.AbstractC166987dD.A0H(r0)
            if (r1 != 0) goto L9e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
        L9a:
            r9.put(r8, r0)
            goto L78
        L9e:
            int r0 = r1.intValue()
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L9a
        La9:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r2)
            throw r0
        Lae:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35247Fgg.A01(com.instagram.common.session.UserSession, X.E6c, java.lang.String):X.E6c");
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.1rE, java.lang.Object] */
    public static final C35169FfL A02(E6X e6x, User user, Integer num, Integer num2, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        ArrayList arrayList;
        EnumC40111tc enumC40111tc;
        String str5;
        long j;
        E6P e6p = e6x.A00;
        if (e6p != null) {
            ?? obj = new Object();
            obj.A5j = str;
            obj.EW3(e6x.A01);
            List<E6Q> list = e6x.A08;
            Float f = null;
            if (list != null) {
                arrayList = AbstractC167017dG.A0q(list);
                for (E6Q e6q : list) {
                    C14360o3.A0B(e6q, 0);
                    arrayList.add(new VideoVersion(null, e6q.A01, e6q.A02, e6q.A03, null, e6q.A05, e6q.A06));
                }
            } else {
                arrayList = null;
            }
            obj.Eh0(arrayList);
            Integer num3 = e6p.A00;
            obj.A4n = num3;
            Integer num4 = e6p.A02;
            obj.A4o = num4;
            obj.A56 = e6p.A03;
            if (list != null && AbstractC166987dD.A1b(list)) {
                enumC40111tc = EnumC40111tc.A0a;
            } else {
                enumC40111tc = EnumC40111tc.A0Q;
            }
            obj.A4m = Integer.valueOf(enumC40111tc.A00);
            if (e6x.A05 != null) {
                f = Float.valueOf(r0.intValue());
            }
            obj.A4P = f;
            obj.A6M = e6x.A07;
            obj.A4j = e6x.A03;
            if (user != null) {
                str5 = user.getId();
            } else {
                User user2 = e6x.A02;
                if (user2 != null) {
                    str5 = user2.getId();
                } else {
                    str5 = "";
                }
            }
            String str6 = e6p.A06;
            if (str6 != null) {
                if (num4 != null) {
                    int intValue = num4.intValue();
                    if (num3 != null) {
                        ExtendedImageUrl extendedImageUrl = new ExtendedImageUrl(str6, intValue, num3.intValue());
                        if (num != null) {
                            j = TimeUnit.SECONDS.toMicros(num.intValue());
                        } else {
                            j = 0;
                        }
                        C38801rC c38801rC = C38321qM.A0h;
                        return new C35169FfL(new C34647FOe(extendedImageUrl, C38801rC.A02(obj), false, str, str5, str6, str2, null, null, str3, str4, AbstractC31177DnL.A03(num2), j, true, false, z, z2, z3, z4));
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.1rE, java.lang.Object] */
    public static final C35169FfL A03(ImageUrl imageUrl, User user, Integer num, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3) {
        String str3;
        long j;
        C14360o3.A0B(imageUrl, 1);
        ExtendedImageUrl extendedImageUrl = new ExtendedImageUrl(imageUrl);
        ?? obj = new Object();
        obj.A5j = str;
        obj.EW3(new ImageInfoImpl(null, null, null, AbstractC166987dD.A1J(extendedImageUrl), null));
        obj.A4n = Integer.valueOf(i2);
        obj.A4o = Integer.valueOf(i);
        if (user != null) {
            str3 = user.getId();
        } else {
            str3 = "";
        }
        String url = imageUrl.getUrl();
        if (num != null) {
            j = TimeUnit.SECONDS.toMicros(num.intValue());
        } else {
            j = 0;
        }
        C38801rC c38801rC = C38321qM.A0h;
        return new C35169FfL(new C34647FOe(extendedImageUrl, C38801rC.A02(obj), false, str, str3, url, null, null, null, str2, null, 0, j, true, false, false, z, z2, z3));
    }

    public static final C199928sw A04(Context context, Boolean bool, Integer num, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        Drawable drawable;
        Drawable drawable2;
        String A0p = AbstractC166997dE.A0p(context, i);
        if (bool.equals(false)) {
            drawable = context.getDrawable(i2);
        } else {
            drawable = null;
        }
        if (bool.equals(true)) {
            drawable2 = context.getDrawable(i2);
        } else {
            drawable2 = null;
        }
        return new C199928sw(drawable2, drawable, null, new G85(interfaceC16820sZ, 4), num, A0p, 0, 0, 0, false, false, false, true, false, false, false);
    }

    public static final void A06(Activity activity, EnumC40111tc enumC40111tc, InterfaceC16820sZ interfaceC16820sZ) {
        int i = 2131959023;
        int i2 = 2131959022;
        if (enumC40111tc == EnumC40111tc.A0a) {
            i = 2131959025;
            i2 = 2131959024;
        }
        C193328hC A0H = AbstractC31171DnF.A0H(activity);
        A0H.A0A(i);
        A0H.A09(i2);
        DialogInterfaceOnClickListenerC35452Fk9.A01(A0H, interfaceC16820sZ, 45, 2131959015);
        A0H.A0D(DialogInterfaceOnClickListenerC35401FjK.A00);
        AbstractC31178DnM.A1R(A0H, true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d4, code lost:
    
        if (r5 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c2, code lost:
    
        if (r18.equals("shared_stack") == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00df, code lost:
    
        if (r18.equals("roll_call") == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList A05(android.content.Context r13, com.instagram.common.session.UserSession r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, boolean r19, boolean r20, boolean r21) {
        /*
            java.util.ArrayList r0 = X.AbstractC166987dD.A1E()
            r6 = r17
            if (r17 == 0) goto L19
            if (r21 == 0) goto L19
            java.lang.Integer r4 = X.C05F.A00
            r2 = 0
            X.Kcx r3 = X.EnumC46221Kcx.A08
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r1 = new com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData
            r5 = r2
            r7 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.add(r1)
        L19:
            boolean r3 = X.AbstractC31171DnF.A1W(r14, r15)
            r1 = r16
            boolean r5 = X.AbstractC31171DnF.A1W(r14, r1)
            if (r20 == 0) goto L41
            java.lang.Integer r9 = X.C05F.A0d
            r1 = 2131960206(0x7f13218e, float:1.9557074E38)
            java.lang.String r11 = X.AbstractC166997dE.A0p(r13, r1)
            r1 = 2131237962(0x7f081c4a, float:1.809219E38)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            X.Kcx r8 = X.EnumC46221Kcx.A09
            r7 = 0
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r6 = new com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData
            r12 = r7
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.add(r6)
        L41:
            r4 = r5
            r2 = r18
            if (r18 == 0) goto L4d
            int r1 = r2.hashCode()
            switch(r1) {
                case -1782234803: goto Lb9;
                case -697290194: goto Lbc;
                case 348943746: goto Lc5;
                case 531959920: goto Lc8;
                case 535918816: goto Ld9;
                default: goto L4d;
            }
        L4d:
            r4 = 0
        L4e:
            java.lang.String r3 = "shared_stack"
            if (r4 == 0) goto L7d
            if (r5 == 0) goto Laf
            r1 = 2131960774(0x7f1323c6, float:1.9558226E38)
            java.lang.String r11 = r13.getString(r1)
            java.lang.Integer r9 = X.C05F.A0Y
        L5d:
            boolean r1 = X.C14360o3.A0K(r2, r3)
            if (r1 == 0) goto L6a
            r1 = 2131957640(0x7f131788, float:1.955187E38)
            java.lang.String r11 = r13.getString(r1)
        L6a:
            r1 = 2131238254(0x7f081d6e, float:1.8092782E38)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            X.Kcx r8 = X.EnumC46221Kcx.A07
            r7 = 0
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r6 = new com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData
            r12 = r7
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.add(r6)
        L7d:
            if (r5 != 0) goto Lae
            boolean r1 = X.C14360o3.A0K(r2, r3)
            if (r1 == 0) goto L92
            X.0Tz r3 = X.C06090Tz.A05
            r1 = 36316430981927305(0x81059a00301189, double:3.0299954152762364E-306)
            boolean r1 = X.C18U.A06(r3, r14, r1)
            if (r1 == 0) goto Lae
        L92:
            java.lang.Integer r4 = X.C05F.A0N
            r1 = 2131960355(0x7f132223, float:1.9557376E38)
            java.lang.String r6 = X.AbstractC166997dE.A0p(r13, r1)
            r1 = 2131238781(0x7f081f7d, float:1.809385E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            X.Kcx r3 = X.EnumC46221Kcx.A07
            r2 = 0
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r1 = new com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData
            r7 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.add(r1)
        Lae:
            return r0
        Laf:
            r1 = 2131972171(0x7f13504b, float:1.9581342E38)
            java.lang.String r11 = r13.getString(r1)
            java.lang.Integer r9 = X.C05F.A0j
            goto L5d
        Lb9:
            java.lang.String r1 = "questions"
            goto Lca
        Lbc:
            java.lang.String r1 = "shared_stack"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto Ld6
            goto L4d
        Lc5:
            java.lang.String r1 = "add_yours"
            goto Lca
        Lc8:
            java.lang.String r1 = "challenges"
        Lca:
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L4d
            if (r3 != 0) goto Ld6
            if (r19 != 0) goto Ld6
            if (r5 == 0) goto L4d
        Ld6:
            r4 = 1
            goto L4e
        Ld9:
            java.lang.String r1 = "roll_call"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L4e
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35247Fgg.A05(android.content.Context, com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean):java.util.ArrayList");
    }
}
