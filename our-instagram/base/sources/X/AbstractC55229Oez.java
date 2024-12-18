package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Base64;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.model.people.PeopleTag;
import com.instagram.tagging.activity.TaggingActivity;
import com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo;
import com.instagram.user.model.User;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Oez, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55229Oez {
    public static final Integer A02(MediaTaggingInfo mediaTaggingInfo, boolean z) {
        C14360o3.A0B(mediaTaggingInfo, 0);
        if (!mediaTaggingInfo.A0C.isEmpty()) {
            return C05F.A00;
        }
        if (!mediaTaggingInfo.A0B.isEmpty() || (z && !mediaTaggingInfo.A0A.isEmpty())) {
            return C05F.A01;
        }
        return C05F.A0C;
    }

    public static final ArrayList A04(UserSession userSession, AnonymousClass841 anonymousClass841, boolean z) {
        ArrayList A12 = AbstractC166997dE.A12(userSession, 0);
        Iterator A0n = MSX.A0n(anonymousClass841);
        while (A0n.hasNext()) {
            C47Z A0b = AbstractC50522MSa.A0b(userSession, A0n);
            if (A0b != null) {
                List list = A0b.A48;
                if (!z || list.isEmpty()) {
                    list = A0b.A40;
                }
                A12.addAll(list);
            }
        }
        return A12;
    }

    public static final void A07(Bundle bundle, Fragment fragment, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC86363t8 interfaceC86363t8, String str) {
        int A06 = AbstractC167007dF.A06(0, fragment, userSession);
        ENN enn = new ENN();
        enn.setArguments(bundle);
        AbstractC10360h2 abstractC10360h2 = fragment.mFragmentManager;
        if (abstractC10360h2 != null) {
            C55772hI.A00(userSession).A0C(interfaceC60442pS, null, abstractC10360h2.A0L());
        }
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A0d = str;
        A0y.A0T = enn;
        A0y.A0U = new C36727GGw(A06, fragment, enn);
        if (interfaceC86363t8 != null) {
            A0y.A0X = interfaceC86363t8;
        }
        C189478aR A00 = A0y.A00();
        enn.A01 = new C34469FHh(A00);
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            A00.A02(activity, enn);
        }
    }

    public static final void A09(Fragment fragment, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, InterfaceC86363t8 interfaceC86363t8, String str, boolean z, boolean z2) {
        int i;
        Bundle A0b = AbstractC166987dD.A0b();
        String A0p = AbstractC25231BEo.A0p();
        A08(A0b, c38321qM);
        A0b.putString("prior_module", interfaceC60442pS.getModuleName());
        A0b.putString("bottomsheet_session_id", A0p);
        A0b.putString("bottomsheet_entrypoint", "bottomsheet_entry_from_tag_indicator_icon");
        ArrayList<? extends Parcelable> A3M = c38321qM.A3M();
        boolean z3 = true;
        if (z) {
            A3M = A06(c38321qM.A3M(), c38321qM.A0C.getCoauthorProducers());
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                A3M.add(0, new PeopleTag(A2E));
            }
            A0b.putBoolean("is_collabs_display", true);
        }
        if (str != null) {
            A0b.putString("collab_follow_button_click_point", str);
        }
        if (c38321qM.A2C() != null) {
            if (A3M == null) {
                A3M = AbstractC166987dD.A1E();
            }
            A3M.add(new PeopleTag(c38321qM.A2C()));
        }
        if (z2) {
            A3M = A06(c38321qM.A3M(), c38321qM.A3i());
        }
        A0b.putParcelableArrayList("tagged_people", A3M);
        AbstractC31173DnH.A1C(A0b, userSession);
        ArrayList A3Q = c38321qM.A3Q();
        String str2 = null;
        User A2E2 = c38321qM.A2E(userSession);
        if (A2E2 != null) {
            str2 = A2E2.getId();
        }
        if (A3Q == null || A3Q.isEmpty() || !OWJ.A00.A01(userSession, str2, c38321qM.A5P()) || z || z2) {
            z3 = false;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        if (z3) {
            A0b.putParcelableArrayList("tagged_fb_people", AbstractC166987dD.A1F(A3Q));
            if (A3M != null) {
                A1E.addAll(A3M);
            }
            if (A3Q != null) {
                A1E.addAll(A3Q);
            }
            if (!A1E.isEmpty()) {
                String id = c38321qM.getId();
                ArrayList A02 = AnonymousClass426.A02(A1E);
                if (AnonymousClass426.A04(A02)) {
                    AnonymousClass426.A03(null, EnumC53372NjN.CROSSPOST_WITH_FB_TAGS_ICON_CLICK, null, userSession, userSession.userId, id, null, AnonymousClass426.A01(id, A02), null);
                }
            }
        }
        if (z2) {
            i = 2131975157;
        } else if (z) {
            i = 2131975156;
        } else if (z3) {
            i = 2131975629;
        } else {
            i = 2131975628;
            if (c38321qM.Cff()) {
                i = 2131975632;
            }
        }
        A07(A0b, fragment, userSession, interfaceC60442pS, interfaceC86363t8, AbstractC25227BEk.A0v(fragment, i));
        if (z3 && !A1E.isEmpty()) {
            AnonymousClass426.A00.A08(userSession, c38321qM.getId(), A0p, "bottomsheet_entry_from_tag_indicator_icon", A1E);
        }
    }

    public static final void A0B(Fragment fragment, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str) {
        if (c38321qM.A10() == 1) {
            ArrayList A3M = c38321qM.A3M();
            if (A3M != null) {
                String id = ((com.instagram.tagging.model.Tag) A3M.get(0)).getId();
                C14360o3.A07(id);
                C31368DqX A01 = AbstractC31402Dr6.A01(userSession, id, AbstractC111324zv.A00(2706), interfaceC60442pS.getModuleName());
                A01.A0L = str;
                C140966Yy A0C = AbstractC31175DnJ.A0C(fragment, userSession);
                A0C.A08();
                C31368DqX.A02(A0C, userSession, AbstractC31364DqT.A02(), A01);
                return;
            }
            return;
        }
        throw AbstractC31172DnG.A0u();
    }

    public static final void A0C(Fragment fragment, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, List list) {
        AbstractC37302Gc3.A1U(userSession, list);
        Bundle A0E = AbstractC31174DnI.A0E(str, 6);
        A08(A0E, c38321qM);
        A0E.putString("prior_module", interfaceC60442pS.getModuleName());
        A0E.putBoolean("show_follow_button", true);
        A0E.putBoolean("allow_navigation_to_self_profile", false);
        ArrayList<? extends Parcelable> A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1E.add(new PeopleTag(AbstractC25226BEj.A15(it)));
        }
        A0E.putParcelableArrayList("tagged_people", A1E);
        AbstractC31173DnH.A1C(A0E, userSession);
        A07(A0E, fragment, userSession, interfaceC60442pS, null, str);
    }

    public static final void A0D(Fragment fragment, UserSession userSession, C38321qM c38321qM, FBUserTag fBUserTag) {
        C14360o3.A0B(c38321qM, 0);
        Context context = fragment.getContext();
        if (context != null) {
            FBUserTag.FBUserInfo fBUserInfo = fBUserTag.A02;
            C35134Feb.A00(context, fBUserInfo.A02, fBUserInfo.A04);
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A3M = c38321qM.A3M();
        if (A3M != null) {
            A1E.addAll(A3M);
        }
        ArrayList A3Q = c38321qM.A3Q();
        if (A3Q != null) {
            A1E.addAll(A3Q);
        }
        if (!A1E.isEmpty()) {
            String id = c38321qM.getId();
            ArrayList A02 = AnonymousClass426.A02(A1E);
            if (AnonymousClass426.A04(A02)) {
                ArrayList A01 = AnonymousClass426.A01(id, A02);
                AnonymousClass426.A03(null, EnumC53372NjN.FB_TAG_TOOLTIP_IN_CROSSPOST_CLICK, AnonymousClass426.A00(fBUserTag, id), userSession, userSession.userId, id, null, A01, null);
            }
        }
    }

    public static final boolean A0E(Activity activity, UserSession userSession, InterfaceC30955DjC interfaceC30955DjC, Boolean bool) {
        C14360o3.A0B(userSession, 0);
        Boolean bool2 = false;
        if (MSZ.A0h(userSession) == C05F.A0C) {
            Boolean bool3 = true;
            if (((bool3.equals(bool) && AbstractC166987dD.A0x(userSession).getInt("invite_collaborators_nux_seen_count", 0) == 0) || (bool2.equals(bool) && AbstractC166987dD.A0x(userSession).getInt("invite_collaborators_for_posts_nux_seen_count", 0) == 0)) && C18U.A06(C06090Tz.A05, userSession, 36312999299909204L)) {
                C26859BtL c26859BtL = new C26859BtL();
                Bundle A05 = AbstractC31178DnM.A05(userSession);
                A05.putBoolean("args_is_clips_entry_point", bool3.equals(bool));
                c26859BtL.setArguments(A05);
                c26859BtL.A00 = interfaceC30955DjC;
                C189448aO A0y = AbstractC25225BEi.A0y(userSession);
                A0y.A0T = c26859BtL;
                A0y.A0a = bool2;
                AbstractC31173DnH.A0w(activity, c26859BtL, A0y);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (X.C18U.A06(r2, r5, 36312999300236887L) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0F(X.C22P r4, com.instagram.common.session.UserSession r5, java.lang.Boolean r6) {
        /*
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            r3 = 1
            if (r6 == 0) goto L1f
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36594474276882159(0x82027b000406ef, double:3.20583111459617E-306)
            int r0 = X.AbstractC25225BEi.A07(r2, r5, r0)
            if (r0 <= r3) goto L1f
            r0 = 36312999300236887(0x81027b00050657, double:3.027825205956943E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 != 0) goto L36
        L1f:
            X.22P r0 = X.C22P.A0x
            if (r4 != r0) goto L37
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36597905957850181(0x82059a00240c45, double:3.208001323458617E-306)
            int r0 = X.AbstractC25225BEi.A07(r2, r5, r0)
            if (r0 <= r3) goto L37
            boolean r0 = A0H(r5)
            if (r0 == 0) goto L37
        L36:
            return r3
        L37:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC55229Oez.A0F(X.22P, com.instagram.common.session.UserSession, java.lang.Boolean):boolean");
    }

    public static final boolean A0G(C22P c22p, UserSession userSession, Boolean bool, int i) {
        C14360o3.A0B(userSession, 0);
        if (bool != null) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (i >= AbstractC25225BEi.A07(c06090Tz, userSession, 36594474276882159L) && C18U.A06(c06090Tz, userSession, 36312999300236887L)) {
                return true;
            }
        }
        if (C22P.A0x == c22p && i >= AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36597905957850181L) && A0H(userSession)) {
            return true;
        }
        return false;
    }

    public static final boolean A0I(UserSession userSession, AnonymousClass841 anonymousClass841, boolean z) {
        if (!A0K(userSession, z)) {
            if (A0M(A04(userSession, anonymousClass841, true)) && A0J(userSession, z)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean A0L(TaggingActivity taggingActivity) {
        return A0G(null, TaggingActivity.A03(taggingActivity), Boolean.valueOf(taggingActivity.A0S), taggingActivity.C52().size());
    }

    public static final boolean A0M(ArrayList arrayList) {
        C14360o3.A0B(arrayList, 1);
        Iterator A13 = AbstractC166997dE.A13(arrayList);
        while (A13.hasNext()) {
            if (((PeopleTag) AbstractC166997dE.A0l(A13)).A07().A1S()) {
                return true;
            }
        }
        return false;
    }

    public static final float A00(MediaTaggingInfo mediaTaggingInfo) {
        if (mediaTaggingInfo.A0H) {
            return mediaTaggingInfo.A00;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        ImageUrl imageUrl = mediaTaggingInfo.A02;
        if (imageUrl != null) {
            BitmapFactory.decodeFile(AbstractC08820cl.A03(imageUrl.getUrl()).getPath(), options);
        }
        return options.outWidth / options.outHeight;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        if (r3.A63() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.BZr() == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A03(android.content.Context r2, X.C38321qM r3) {
        /*
            if (r3 == 0) goto L38
            boolean r0 = r3.A5P()
            if (r0 == 0) goto L25
            X.3x9 r0 = X.AbstractC25226BEj.A0u(r3)
            if (r0 == 0) goto L1d
            X.3p3 r0 = r0.BPh()
            if (r0 == 0) goto L1d
            X.4GI r0 = r0.BZr()
            r1 = 2131975631(0x7f135dcf, float:1.958836E38)
            if (r0 != 0) goto L20
        L1d:
            r1 = 2131975626(0x7f135dca, float:1.958835E38)
        L20:
            java.lang.String r0 = X.AbstractC166997dE.A0p(r2, r1)
            return r0
        L25:
            boolean r0 = r3.Cff()
            if (r0 == 0) goto L2f
            r1 = 2131975632(0x7f135dd0, float:1.9588362E38)
            goto L20
        L2f:
            boolean r0 = r3.A63()
            r1 = 2131975625(0x7f135dc9, float:1.9588348E38)
            if (r0 != 0) goto L20
        L38:
            r1 = 2131975628(0x7f135dcc, float:1.9588354E38)
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC55229Oez.A03(android.content.Context, X.1qM):java.lang.String");
    }

    public static final int A01(UserSession userSession, AnonymousClass841 anonymousClass841) {
        AbstractC167017dG.A1N(userSession, anonymousClass841);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator A0n = MSX.A0n(anonymousClass841);
        while (A0n.hasNext()) {
            C47Z A0b = AbstractC50522MSa.A0b(userSession, A0n);
            if (A0b != null) {
                Iterator A13 = AbstractC166997dE.A13(A0b.A41);
                while (A13.hasNext()) {
                    com.instagram.tagging.model.Tag tag = (com.instagram.tagging.model.Tag) AbstractC166997dE.A0l(A13);
                    if (!A1E.contains(tag.getId())) {
                        String id = tag.getId();
                        C14360o3.A07(id);
                        A1E.add(id);
                    }
                }
            }
        }
        return A1E.size();
    }

    public static final ArrayList A05(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Bitmap decodeFile = BitmapFactory.decodeFile(A1B);
            if (decodeFile != null) {
                AbstractC50673MYr.A00(Bitmap.CompressFormat.JPEG, decodeFile, byteArrayOutputStream);
                String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                C14360o3.A07(encodeToString);
                A1E.add(encodeToString);
            }
        }
        return A1E;
    }

    public static final ArrayList A06(List list, List list2) {
        ArrayList A1E = AbstractC166987dD.A1E();
        if (list != null && list2 != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PeopleTag peopleTag = (PeopleTag) it.next();
                if (list2.contains(peopleTag.A07())) {
                    A1E.add(peopleTag);
                }
            }
        }
        return A1E;
    }

    public static void A08(Bundle bundle, C38321qM c38321qM) {
        bundle.putString("media_id", c38321qM.getId());
        bundle.putSerializable("media_type", c38321qM.BRp());
    }

    public static final void A0A(Fragment fragment, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, AbstractC86353t7 abstractC86353t7) {
        Bundle A0b = AbstractC166987dD.A0b();
        A08(A0b, c38321qM);
        ArrayList<? extends Parcelable> A1E = AbstractC166987dD.A1E();
        Iterator it = c38321qM.A3Z().iterator();
        while (it.hasNext()) {
            User A15 = AbstractC25226BEj.A15(it);
            C14360o3.A0C(A15, AbstractC43591JPw.A00(47));
            A1E.add(new PeopleTag(A15));
        }
        A0b.putParcelableArrayList("tagged_people", A1E);
        A0b.putString("prior_module", interfaceC60442pS.getModuleName());
        AbstractC31173DnH.A1C(A0b, userSession);
        ENN enn = new ENN();
        enn.setArguments(A0b);
        C55772hI.A00(userSession).A0C(interfaceC60442pS, null, AbstractC50523MSb.A01(fragment));
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        AbstractC31172DnG.A1L(fragment, A0y, 2131969313);
        A0y.A0T = enn;
        if (abstractC86353t7 != null) {
            A0y.A0X = abstractC86353t7;
        }
        AbstractC31177DnL.A14(fragment, enn, A0y);
    }

    public static final boolean A0H(UserSession userSession) {
        Integer A0h = MSZ.A0h(userSession);
        if (A0h != C05F.A0C || !C18U.A06(C06090Tz.A05, userSession, 36316430981009797L)) {
            if (A0h == C05F.A01 && C18U.A06(C06090Tz.A05, userSession, 36316430981075334L)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean A0J(UserSession userSession, boolean z) {
        C06090Tz c06090Tz;
        if (AbstractC31178DnM.A0T(userSession).A1N()) {
            if (z) {
                c06090Tz = C06090Tz.A05;
            } else {
                c06090Tz = C06090Tz.A06;
            }
            if (C18U.A06(c06090Tz, userSession, 36314631387482870L)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A0K(UserSession userSession, boolean z) {
        C06090Tz c06090Tz;
        if (AbstractC31178DnM.A0T(userSession).A1N()) {
            if (z) {
                c06090Tz = C06090Tz.A05;
            } else {
                c06090Tz = C06090Tz.A06;
            }
            if (C18U.A06(c06090Tz, userSession, 36314631388007161L)) {
                return true;
            }
        }
        return false;
    }
}
