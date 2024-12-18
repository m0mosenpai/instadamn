package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import com.instagram.api.schemas.DirectMediaFallbackUrl;
import com.instagram.api.schemas.NotePogImageDict;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.mediasize.VideoVersion;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.user.model.User;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4En, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC92944En {
    public static final SpannableStringBuilder A00(Context context, UserSession userSession, boolean z, boolean z2) {
        int i;
        C14360o3.A0B(userSession, 1);
        Resources resources = context.getResources();
        if (z) {
            i = 2131965277;
        } else {
            i = 2131965275;
            if (z2) {
                i = 2131965276;
            }
        }
        String string = resources.getString(i);
        C14360o3.A0A(string);
        String string2 = context.getResources().getString(2131965052);
        C14360o3.A07(string2);
        SpannableStringBuilder append = new SpannableStringBuilder(string).append((CharSequence) AnonymousClass001.A0E(string2, ' ', '.'));
        C14360o3.A0A(append);
        AnonymousClass773.A05(append, new C46063KaK(context, userSession, context.getColor(AbstractC53242c7.A06(context))), string2);
        return append;
    }

    public static final C67s A01(UserSession userSession, C45099JxT c45099JxT, String str, List list) {
        Object obj;
        Object obj2;
        C67x c67x;
        User A02;
        MUD mud;
        String str2;
        C14360o3.A0B(list, 3);
        C1348267y c1348267y = null;
        if (c45099JxT == null && !(!list.isEmpty())) {
            return null;
        }
        INC inc = new INC(C41673Id2.A00());
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C47Z) obj).A1G == EnumC40111tc.A0a) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C47Z c47z = (C47Z) obj;
        if (c47z != null) {
            String str3 = null;
            String str4 = c47z.A3t;
            DirectMediaFallbackUrl directMediaFallbackUrl = null;
            ImageInfoImpl imageInfoImpl = new ImageInfoImpl(null, null, null, null, null);
            VideoVersion videoVersion = new VideoVersion(null, null, null, null, null, null, null);
            DirectMediaFallbackUrl directMediaFallbackUrl2 = videoVersion.A00;
            Integer num = videoVersion.A02;
            Long l = videoVersion.A04;
            Integer valueOf = Integer.valueOf(c47z.A0G);
            ClipInfo clipInfo = (ClipInfo) AbstractC001800i.A0J(c47z.A4G);
            if (clipInfo != null) {
                str3 = clipInfo.A0F;
            }
            Integer valueOf2 = Integer.valueOf(c47z.A0H);
            if (directMediaFallbackUrl2 != null) {
                directMediaFallbackUrl = directMediaFallbackUrl2;
            }
            List singletonList = Collections.singletonList(new VideoVersion(directMediaFallbackUrl, valueOf, num, valueOf2, l, null, str3));
            C14360o3.A07(singletonList);
            c67x = new C67x(null, new NotePogVideoDict(imageInfoImpl, str4, str4, singletonList));
        } else {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (((C47Z) obj2).A1G == EnumC40111tc.A0Q) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            C47Z c47z2 = (C47Z) obj2;
            if (c47z2 != null) {
                String str5 = c47z2.A3t;
                String obj3 = new File(c47z2.A33).toURI().toURL().toString();
                C14360o3.A07(obj3);
                c67x = new C67x(new NotePogImageDict(str5, obj3, c47z2.A3t), null);
            } else {
                c67x = null;
            }
        }
        inc.A09 = c67x;
        if (str != null && (A02 = AnonymousClass189.A00(userSession).A02(userSession.userId)) != null) {
            C41603Iar c41603Iar = InterfaceC1347967p.A00;
            if (c45099JxT != null && (mud = c45099JxT.A07) != null && (str2 = mud.A02) != null) {
                IN4 A00 = c41603Iar.A00(str, str2);
                List singletonList2 = Collections.singletonList(A02);
                C14360o3.A07(singletonList2);
                A00.A04 = singletonList2;
                A00.A01 = 1;
                c1348267y = A00.A00();
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        inc.A0B = c1348267y;
        return inc.A00();
    }

    public static final String A03(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        return new String[]{context.getResources().getString(2131968742), context.getResources().getString(2131968741), context.getResources().getString(2131968743), context.getResources().getString(2131968712)}[AbstractC23021Ah.A00(userSession).A01.getInt(AbstractC43591JPw.A00(1190), 0)];
    }

    public static final String A04(Context context, UserSession userSession, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String string;
        Resources resources;
        int i;
        C14360o3.A0B(userSession, 1);
        String[] strArr = {context.getResources().getString(2131968741), context.getResources().getString(2131968742), context.getResources().getString(2131968743), context.getResources().getString(2131968740)};
        String[] strArr2 = {context.getResources().getString(2131968751), context.getResources().getString(2131968752), context.getResources().getString(2131968753), context.getResources().getString(2131968754)};
        if (z) {
            resources = context.getResources();
            i = 2131968795;
        } else if (z2) {
            resources = context.getResources();
            i = 2131968702;
        } else if (z4) {
            resources = context.getResources();
            i = 2131956719;
        } else {
            if (!z3) {
                if (z5) {
                    string = context.getResources().getString(2131968741);
                    C14360o3.A07(string);
                    return string;
                }
                C06090Tz c06090Tz = C06090Tz.A05;
                if (!C18U.A06(c06090Tz, userSession, 36329290111402233L)) {
                    if (C18U.A06(c06090Tz, userSession, 36329290111271160L)) {
                        return strArr2[AbstractC23021Ah.A00(userSession).A01.getInt("notes_creation_cta_variant", 0)];
                    }
                    if (C18U.A06(c06090Tz, userSession, 36327254296443311L)) {
                        return strArr[0];
                    }
                    if (C18U.A06(c06090Tz, userSession, 36327254296508848L)) {
                        return strArr[1];
                    }
                    if (C18U.A06(c06090Tz, userSession, 36327254296574385L)) {
                        return strArr[2];
                    }
                    if (C18U.A06(c06090Tz, userSession, 36327254296377774L)) {
                        return strArr[AbstractC23021Ah.A00(userSession).A01.getInt("notes_creation_cta_variant", 0)];
                    }
                }
            }
            string = context.getResources().getString(2131968740);
            C14360o3.A07(string);
            return string;
        }
        string = resources.getString(i);
        C14360o3.A07(string);
        return string;
    }

    public static final void A05(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        SimpleWebViewActivity.A02.A02(context, userSession, new SimpleWebViewConfig(new SXK("https://help.instagram.com/1048118103140467")));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.1rE, java.lang.Object] */
    public static final C38321qM A02(NotePogVideoDict notePogVideoDict) {
        ?? obj = new Object();
        obj.A5j = notePogVideoDict.A01;
        obj.A64 = notePogVideoDict.A02;
        obj.Eh0(notePogVideoDict.A03);
        obj.EW3(notePogVideoDict.A00);
        obj.A4m = Integer.valueOf(EnumC40111tc.A0a.A00);
        C38801rC c38801rC = C38321qM.A0h;
        return C38801rC.A02(obj);
    }
}
