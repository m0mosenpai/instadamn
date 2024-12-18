package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.systrace.Systrace;
import com.instagram.clips.model.metadata.AudioPageMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.ui.dynamiclayout.DynamicConstraintLayout;
import com.instagram.user.model.User;
import java.util.List;
import java.util.UUID;

/* renamed from: X.72f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1567972f {
    public static boolean A00;
    public static boolean A01;
    public static boolean A02;
    public static boolean A03;
    public static boolean A04;
    public static boolean A05;
    public static final C1567972f A06 = new Object();

    public static final long A00(String str, List list) {
        String str2;
        int i = -1;
        if (list != null) {
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                InterfaceC37273GbQ interfaceC37273GbQ = (InterfaceC37273GbQ) obj;
                if (interfaceC37273GbQ != null) {
                    str2 = interfaceC37273GbQ.B6s();
                } else {
                    str2 = null;
                }
                if (C14360o3.A0K(str2, str)) {
                    i = i2;
                }
                i2 = i3;
            }
        }
        return i;
    }

    public static final View A01(ViewGroup viewGroup, UserSession userSession, boolean z, boolean z2) {
        View inflate;
        InterfaceC1568572n c1568472m;
        if (Systrace.A0E(1L)) {
            C0fO.A01("ProfileUserInfoViewBinder.newView", 1724118334);
        }
        try {
            C06090Tz c06090Tz = C06090Tz.A05;
            int A012 = (int) C18U.A01(c06090Tz, userSession, 36604880988738724L);
            boolean z3 = true;
            boolean z4 = false;
            if (A012 > 0) {
                z4 = true;
            }
            if (!z4) {
                inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.profile_header_user_info_row, viewGroup, false);
            } else {
                LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
                C14360o3.A07(from);
                View A002 = C50802Vb.A00(from, null, viewGroup, R.layout.profile_header_user_info_row, 0, false, true);
                C14360o3.A0C(A002, "null cannot be cast to non-null type com.instagram.ui.dynamiclayout.DynamicConstraintLayout");
                inflate = (DynamicConstraintLayout) A002;
            }
            if (C18U.A06(c06090Tz, userSession, 36327267181279694L)) {
                inflate.setPadding(inflate.getPaddingLeft(), 0, inflate.getPaddingRight(), inflate.getPaddingBottom());
            }
            C14360o3.A0A(inflate);
            C1568072i c1568072i = new C1568072i(inflate, userSession);
            if (AbstractC1568272k.A00(userSession).equals(EnumC1568372l.A06)) {
                View view = (View) c1568072i.A0o.getValue();
                int i = 8;
                int i2 = 8;
                if (!C18U.A06(c06090Tz, userSession, 36324965078807149L)) {
                    i2 = 0;
                }
                view.setVisibility(i2);
                View view2 = (View) c1568072i.A0n.getValue();
                if (z2 || !C18U.A06(c06090Tz, userSession, 36324965078872686L)) {
                    z3 = false;
                }
                if (z3) {
                    i = 0;
                }
                view2.setVisibility(i);
            }
            View requireViewById = inflate.requireViewById(R.id.profile_header_avatar_container_top_left_stub);
            C14360o3.A07(requireViewById);
            ViewStub viewStub = (ViewStub) requireViewById;
            if (z) {
                viewStub.setLayoutResource(R.layout.row_profile_cobroadcast_avatar);
                View inflate2 = viewStub.inflate();
                C14360o3.A07(inflate2);
                c1568472m = new GBE((ViewGroup) inflate2);
            } else {
                viewStub.setLayoutResource(R.layout.profile_header_user_avatar);
                View inflate3 = viewStub.inflate();
                C14360o3.A07(inflate3);
                c1568472m = new C1568472m((ViewGroup) inflate3, userSession);
            }
            c1568072i.A00 = c1568472m;
            A03 = false;
            A00 = false;
            inflate.setTag(c1568072i);
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1707703566);
            }
            return inflate;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1509240608);
            }
            throw th;
        }
    }

    public static final void A02(Context context, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, MusicAssetModel musicAssetModel, InterfaceC678133v interfaceC678133v, C72q c72q, User user, boolean z) {
        if (z) {
            String A0g = AnonymousClass001.A0g(musicAssetModel.A0I, " · ", musicAssetModel.A0D);
            C50674MYs c50674MYs = new C50674MYs(context, userSession);
            c50674MYs.A07(A0g);
            if (C36A.A0A(userSession)) {
                c50674MYs.A03(new ViewOnClickListenerC35605Fnw(abstractC59962oe, interfaceC11380iw, userSession, musicAssetModel), 2131967964);
            }
            c50674MYs.A03(new ViewOnClickListenerC35615Fo6(abstractC59962oe, interfaceC11380iw, userSession, musicAssetModel, interfaceC678133v), 2131967968);
            c50674MYs.A01(new ViewOnClickListenerC35627FoI(interfaceC11380iw, userSession, musicAssetModel, interfaceC678133v, c72q, user), 2131967966);
            C31727DwY c31727DwY = new C31727DwY(c50674MYs);
            Activity rootActivity = abstractC59962oe.getRootActivity();
            C14360o3.A0A(rootActivity);
            c31727DwY.A05(rootActivity);
            return;
        }
        A07(abstractC59962oe, userSession, musicAssetModel, interfaceC678133v);
    }

    public static final void A07(AbstractC59962oe abstractC59962oe, UserSession userSession, MusicAssetModel musicAssetModel, InterfaceC678133v interfaceC678133v) {
        if (interfaceC678133v != null && interfaceC678133v.isPlaying()) {
            interfaceC678133v.pause();
        }
        String str = musicAssetModel.A0B;
        String str2 = musicAssetModel.A0E;
        ImageUrl imageUrl = musicAssetModel.A02;
        ImageUrl imageUrl2 = musicAssetModel.A03;
        String str3 = musicAssetModel.A0I;
        String str4 = musicAssetModel.A0A;
        String str5 = musicAssetModel.A0D;
        Bundle A022 = AbstractC86593tX.A02(null, C8JW.A0O, new AudioPageMetadata(null, imageUrl, imageUrl2, null, AudioType.A03, musicAssetModel.A05, str, str4, str5, str2, str, null, null, null, null, null, str3, null, null, null, null, null, null, null, false, false, musicAssetModel.A0P, musicAssetModel.A0S, musicAssetModel.A0Q, false), UUID.randomUUID().toString());
        C14360o3.A0B(A022, 1);
        C38929HCc c38929HCc = new C38929HCc();
        c38929HCc.setArguments(A022);
        C189448aO c189448aO = new C189448aO(userSession);
        c189448aO.A0a = true;
        c189448aO.A03 = 0.66f;
        c189448aO.A00().A02(abstractC59962oe.requireActivity(), c38929HCc);
    }

    public static final void A05(C25531Mh c25531Mh, UserSession userSession, Long l, String str, long j, boolean z) {
        String str2;
        String str3 = C1QM.A00.A02.A00;
        if (str3 != null) {
            c25531Mh.A0Q("viewer_id", Long.valueOf(Long.parseLong(userSession.userId)));
            if (z) {
                str2 = "self_profile";
            } else {
                str2 = "profile";
            }
            c25531Mh.A0R("container_module", str2);
            c25531Mh.A0R("action_type", str);
            c25531Mh.A0R("nav_chain", str3);
            c25531Mh.A0Q("bio_interest_id", l);
            c25531Mh.A0Q("position", Long.valueOf(j));
            c25531Mh.Cht();
        }
    }

    public static final void A03(View view, UserSession userSession) {
        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
        int A012 = (int) C18U.A01(C06090Tz.A05, userSession, 36608810877720350L);
        InterfaceC19610xo ARD = A002.A01.ARD();
        ARD.E7D("profile_card_nux_banner_shown_count", A012);
        ARD.apply();
        view.setVisibility(8);
    }

    public static final void A04(FragmentActivity fragmentActivity, UserSession userSession, User user) {
        InterfaceC19610xo ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
        ARD.E77("has_seen_self_profile_card", true);
        ARD.apply();
        Bundle bundle = new Bundle();
        bundle.putString("displayed_user_id", user.getId());
        FAK.A00(fragmentActivity, bundle, userSession, user.getId(), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x032c, code lost:
    
        if (r7 == 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x033c, code lost:
    
        if (r7 == 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0580, code lost:
    
        if (X.AbstractC154816xW.A02(r54, r61) != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0b5a, code lost:
    
        if (r3 == X.C05F.A0Y) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x0d64, code lost:
    
        if (r0.intValue() != 0) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x05af, code lost:
    
        if (X.AbstractC154816xW.A02(r54, r61) == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x0e70, code lost:
    
        if (r64 != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0f32, code lost:
    
        if (r7.contains(3) == false) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0f4e, code lost:
    
        if (r3.A00 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02a3, code lost:
    
        if (r7 == 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02b3, code lost:
    
        if (r7 == 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0058, code lost:
    
        if (r4.length() == 0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0550 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0561 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0ac0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0afc  */
    /* JADX WARN: Removed duplicated region for block: B:247:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x09e3  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0a4f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0a9d  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0b04  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0c2b  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0c3f  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0e70  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0e80  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0ea2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0298  */
    /* JADX WARN: Type inference failed for: r36v7, types: [X.6s0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r36v8, types: [X.6s0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(com.instagram.aistudio.profile.model.AiStudioProfileBannerModel r51, X.AbstractC59962oe r52, final X.InterfaceC11380iw r53, final com.instagram.common.session.UserSession r54, X.C38321qM r55, X.EnumC155686yx r56, X.MWW r57, X.InterfaceC678133v r58, X.C1568072i r59, final X.C72q r60, final com.instagram.user.model.User r61, java.lang.String r62, java.lang.String r63, boolean r64, boolean r65, boolean r66, boolean r67, boolean r68) {
        /*
            Method dump skipped, instructions count: 3944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1567972f.A06(com.instagram.aistudio.profile.model.AiStudioProfileBannerModel, X.2oe, X.0iw, com.instagram.common.session.UserSession, X.1qM, X.6yx, X.MWW, X.33v, X.72i, X.72q, com.instagram.user.model.User, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean):void");
    }
}
