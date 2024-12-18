package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9ke, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218069ke extends ACt {
    public String A00;
    public String A01;
    public String A02 = "";
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public Runnable A07;
    public final int A08;
    public final Context A09;
    public final ColorDrawable A0A;
    public final Handler A0B;
    public final UserSession A0C;
    public final C50745Maz A0D;
    public final C88Y A0E;
    public final C224149uy A0F;
    public final UGe A0G;
    public final L13 A0H;
    public final Runnable A0I;
    public final String A0J;
    public final String A0K;

    public static void A02(C218069ke c218069ke, String str) {
        c218069ke.A01 = null;
        c218069ke.A05 = false;
        UGe uGe = c218069ke.A0G;
        uGe.A05.clear();
        uGe.A06.clear();
        uGe.A01 = null;
        uGe.notifyDataSetChanged();
        C88Y c88y = c218069ke.A0E;
        c88y.A00.A01.A00();
        c88y.A07();
        Handler handler = c218069ke.A0B;
        handler.removeCallbacks(c218069ke.A0I);
        c88y.A09(c218069ke.A0D);
        Runnable runnable = c218069ke.A07;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        M3K m3k = new M3K(c218069ke, str);
        c218069ke.A07 = m3k;
        handler.postDelayed(m3k, 800L);
    }

    public static void A01(C148276lx c148276lx, C148286ly c148286ly, C218069ke c218069ke, String str) {
        int A07;
        int A06;
        float f;
        ImageUrl imageUrl;
        Context context = c218069ke.A09;
        UserSession userSession = c218069ke.A0C;
        C23666Ae1 c23666Ae1 = new C23666Ae1(c218069ke, str);
        Integer num = C05F.A00;
        AbstractC167017dG.A1O(context, c148286ly);
        Resources resources = context.getResources();
        ArrayList A1E = AbstractC166987dD.A1E();
        float f2 = c148286ly.A01;
        float f3 = c148286ly.A00;
        if (C57992lC.A03()) {
            A07 = AbstractC58002lE.A01(context).getWidth();
        } else {
            AbstractC12120kG.A07(AnonymousClass001.A0R("TargetViewSizeUtil", "#getDisplayWidth"), "TargetViewSizeProvider has not been initialized", null);
            A07 = AbstractC13880nE.A07(context);
        }
        if (C57992lC.A03()) {
            A06 = AbstractC58002lE.A01(context).getHeight();
        } else {
            AbstractC12120kG.A07(AnonymousClass001.A0R("TargetViewSizeUtil", "#getDisplayHeight"), "TargetViewSizeProvider has not been initialized", null);
            A06 = AbstractC13880nE.A06(context);
        }
        float f4 = A07;
        float f5 = (f4 / f2) * f3;
        float f6 = A06;
        if (f5 * 4.0f < f6) {
            f5 = (float) Math.ceil(f6 / 4.0f);
            f = f2 * (f5 / f3);
        } else {
            f = f4;
        }
        int i = (int) f5;
        int i2 = (int) ((f - f4) / 2.0f);
        int i3 = 0;
        for (int i4 = i; i4 < f6 + f5; i4 += i) {
            ImageUrl imageUrl2 = c148286ly.A0H;
            C14360o3.A07(imageUrl2);
            String str2 = c148286ly.A0S;
            C14360o3.A07(str2);
            C148286ly c148286ly2 = c148286ly.A0I;
            if (c148286ly2 != null) {
                imageUrl = c148286ly2.A0H;
            } else {
                imageUrl = null;
            }
            C74P c74p = new C74P(context, userSession, imageUrl2, imageUrl, c23666Ae1, new C74V(-1, (int) f, i), num, str2, AbstractC166997dE.A0B(resources), context.getColor(R.color.cds_white_a20), context.getColor(R.color.fds_white_alpha60), true);
            c74p.setBounds(-i2, i3, A07 + i2, i4);
            A1E.add(c74p);
            i3 += i;
        }
        for (int i5 = 0; i5 < A1E.size(); i5++) {
            Drawable drawable = (Drawable) A1E.get(i5);
            c218069ke.A0E.A0B(drawable, C5GJ.CREATE_MODE_GIF_SEARCH, c148276lx, new C8FC((C8D0) new C221619qQ(drawable.getBounds()), (C8FD) null, (C89G) null, num, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, 0.25f, 1.5f, -1.0f, -1.0f, -1.0f, -2, false, false, false, true, false, false, false, true, true, true, true, true, false, false), false, AbstractC167007dF.A1N(i5));
        }
    }

    public final void A0A(String str, List list, List list2, boolean z) {
        if (this.A04) {
            if (!z) {
                String str2 = this.A0K;
                this.A01 = str2;
                this.A0E.A0J(str2);
            } else {
                if (!this.A02.equals(str)) {
                    this.A01 = null;
                    return;
                }
                if (!list.isEmpty() && ((InterfaceC148316m1) list.get(0)).C0S() != null) {
                    UGe uGe = this.A0G;
                    if (!str.equals(uGe.A01)) {
                        List list3 = uGe.A05;
                        list3.clear();
                        list3.addAll(list);
                        List list4 = uGe.A06;
                        list4.clear();
                        list4.addAll(list2);
                        uGe.A01 = str;
                        int i = 0;
                        if (TextUtils.isEmpty(str)) {
                            i = -1;
                        }
                        uGe.A00 = i;
                        uGe.notifyDataSetChanged();
                    }
                    C148276lx C0S = ((InterfaceC148316m1) list.get(0)).C0S();
                    C0S.getClass();
                    C148286ly c148286ly = (C148286ly) C0S.A0O.get(0);
                    if (!TextUtils.isEmpty(str)) {
                        A01(C0S, c148286ly, this, str);
                    }
                    this.A01 = null;
                } else {
                    String str3 = this.A0J;
                    this.A01 = str3;
                    this.A0E.A0J(str3);
                    return;
                }
            }
            UserSession userSession = this.A0C;
            boolean z2 = false;
            if (!list.isEmpty() && ((InterfaceC148316m1) list.get(0)).C0S() != null) {
                z2 = true;
            }
            boolean z3 = !z;
            C22C A01 = AnonymousClass229.A01(userSession);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(((C22F) A01).A01, "ig_camera_create_mode_gif_search");
            if (A0f.isSampled()) {
                C22M c22m = ((C22F) A01).A04;
                AbstractC166997dE.A1N(A0f, "camera_position", AbstractC167017dG.A0I(c22m));
                AbstractC166987dD.A1S(A0f, c22m.A0L);
                AbstractC167007dF.A11(A0f, A01);
                AbstractC167017dG.A1A(c22m.A09, A0f);
                A00(A0f, z3, z2);
                A0f.A8R(c22m.A0A, "media_type");
                AbstractC167017dG.A1B(A0f);
                AbstractC167027dH.A0s(c22m.A0C, A0f, c22m, "surface");
                A0f.AAP("search_session_id", c22m.A0P);
                AbstractC167017dG.A1C(A0f);
            }
            C448224m c448224m = A01.A08;
            C18920wW c18920wW = c448224m.A01;
            String A00 = AbstractC43591JPw.A00(162);
            C12180kM c12180kM = c18920wW.A00;
            InterfaceC02590Ai A002 = c18920wW.A00(c12180kM, A00);
            if (A002.isSampled()) {
                A002.AAP("entity", "CREATE_MODE_GIF_SEARCH");
                C22M c22m2 = c448224m.A04;
                A002.A8R(c22m2.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                int i2 = 2;
                AbstractC166997dE.A1N(A002, "event_type", 2);
                EnumC50631MWs enumC50631MWs = c22m2.A0C;
                if (enumC50631MWs == null) {
                    enumC50631MWs = EnumC50631MWs.A0F;
                }
                A002.A8R(enumC50631MWs, "surface");
                String str4 = c22m2.A0L;
                if (str4 == null) {
                    str4 = "";
                }
                AbstractC166987dD.A1S(A002, str4);
                AbstractC167017dG.A1B(A002);
                A002.AAP("legacy_falco_event_name", "IG_CAMERA_CREATE_MODE_GIF_SEARCH");
                if (c22m2.A01 != 2) {
                    i2 = 1;
                }
                AbstractC166997dE.A1N(A002, "camera_position", i2);
                AbstractC167007dF.A11(A002, c448224m);
                A00(A002, z3, z2);
                AbstractC167027dH.A0s(c22m2.A0A, A002, c22m2, "media_type");
                A002.AAP("search_session_id", c22m2.A0P);
                AbstractC167017dG.A1C(A002);
            }
            InterfaceC02590Ai A003 = c18920wW.A00(c12180kM, AbstractC111324zv.A00(992));
            if (A003.isSampled()) {
                A003.AAP("legacy_falco_event_name", "IG_CAMERA_CREATE_MODE_GIF_SEARCH");
                A003.AAP("entity", "CREATE_MODE_GIF_SEARCH");
                C22M c22m3 = c448224m.A04;
                AbstractC166997dE.A1N(A003, "camera_position", AbstractC167017dG.A0I(c22m3));
                AbstractC166987dD.A1S(A003, c22m3.A0L);
                AbstractC167007dF.A11(A003, c448224m);
                AbstractC167017dG.A1A(c22m3.A09, A003);
                A00(A003, z3, z2);
                A003.A8R(c22m3.A0A, "media_type");
                AbstractC167017dG.A1B(A003);
                AbstractC167027dH.A0s(c22m3.A0C, A003, c22m3, "surface");
                A003.AAP("search_session_id", c22m3.A0P);
                AbstractC167017dG.A1C(A003);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, X.9uy] */
    public C218069ke(Context context, UserSession userSession, C88Y c88y) {
        this.A0E = c88y;
        this.A09 = context;
        this.A0H = new L13(userSession, this, new M8T(this, 2));
        this.A0C = userSession;
        C50745Maz c50745Maz = new C50745Maz(context);
        this.A0D = c50745Maz;
        if (!c50745Maz.A04) {
            c50745Maz.A04 = true;
        }
        this.A0A = new ColorDrawable(context.getColor(R.color.black_40_transparent));
        this.A0K = context.getResources().getString(2131963231);
        this.A0J = context.getResources().getString(2131963230);
        this.A0B = AbstractC167007dF.A0J();
        this.A0I = new RunnableC24349Aqs(this);
        A5L a5l = new A5L(this);
        ?? obj = new Object();
        obj.A00 = a5l;
        this.A0F = obj;
        this.A0G = new UGe(context, userSession, new A5M(this));
        this.A08 = context.getResources().getDimensionPixelOffset(R.dimen.canvas_gifs_tile_height);
    }

    public static void A00(InterfaceC02590Ai interfaceC02590Ai, boolean z, boolean z2) {
        interfaceC02590Ai.A7v("has_network_error", Boolean.valueOf(z));
        interfaceC02590Ai.A7v("has_result", Boolean.valueOf(z2));
    }
}
