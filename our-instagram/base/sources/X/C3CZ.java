package X;

import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result;
import com.instagram.common.session.UserSession;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.user.model.User;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.3CZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3CZ implements InterfaceC69913Ca, CallerContextable {
    public static boolean A09 = true;
    public static android.net.Uri A0A = null;
    public static EnumC69993Ci A0B = null;
    public static String A0C = null;
    public static String A0D = null;
    public static String A0E = null;
    public static boolean A0F = false;
    public static boolean A0G = false;
    public static final String __redex_internal_original_name = "UpdateProfilePictureHelper";
    public boolean A00;
    public final Fragment A01;
    public final AbstractC10360h2 A02;
    public final InterfaceC114785Gl A03;
    public final UserSession A04;
    public final User A05;
    public final InterfaceC16660sJ A06;
    public final InterfaceC69973Cg A07;
    public final Integer A08;
    public static final C69923Cb A0J = new Object();
    public static final CallerContext A0I = CallerContext.A00(C3CZ.class);
    public static final Handler A0H = new Handler(Looper.getMainLooper());

    public C3CZ(Fragment fragment, AbstractC10360h2 abstractC10360h2, InterfaceC114785Gl interfaceC114785Gl, UserSession userSession, User user, Integer num, InterfaceC16660sJ interfaceC16660sJ) {
        EnumC69993Ci enumC69993Ci;
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        this.A01 = fragment;
        this.A02 = abstractC10360h2;
        this.A05 = user;
        this.A03 = interfaceC114785Gl;
        this.A08 = num;
        this.A06 = interfaceC16660sJ;
        C69923Cb.A00();
        this.A07 = AbstractC69933Cc.A00(fragment.requireContext(), userSession, this);
        if (num == C05F.A0s) {
            enumC69993Ci = EnumC69993Ci.IG_EDIT_PROFILE;
        } else if (num != C05F.A0r) {
            return;
        } else {
            enumC69993Ci = EnumC69993Ci.IG_PROFILE_PHOTO_LONG_PRESS;
        }
        A0B = enumC69993Ci;
    }

    public final void A06(Context context, com.instagram.creation.base.ui.mediatabbar.Tab tab) {
        C14360o3.A0B(tab, 1);
        UserSession userSession = this.A04;
        if (AbstractC55157OdL.A04(userSession)) {
            C08730cb c08730cb = C17060sy.A01;
            Boolean BCC = c08730cb.A01(userSession).A03.BCC();
            if (BCC != null && BCC.booleanValue()) {
                AbstractC55157OdL.A00(context);
                return;
            }
            Boolean CZG = c08730cb.A01(userSession).A03.CZG();
            if (CZG != null && CZG.booleanValue()) {
                AbstractC55157OdL.A01(context);
                return;
            }
            if (c08730cb.A01(userSession).A03.CZE() != null && (!r0.booleanValue())) {
                AbstractC55157OdL.A02(context);
                return;
            } else {
                AbstractC55157OdL.A03(context, new C57261Pbj(36, context, tab, this));
                return;
            }
        }
        if (AbstractC35182FfZ.A02(userSession)) {
            AbstractC35182FfZ.A00(context);
        } else if (AbstractC35182FfZ.A03(userSession)) {
            AbstractC35182FfZ.A01(context, new C57261Pbj(37, context, tab, this));
        } else {
            A07(context, tab);
        }
    }

    public final void A07(Context context, com.instagram.creation.base.ui.mediatabbar.Tab tab) {
        C14360o3.A0B(tab, 1);
        UserSession userSession = this.A04;
        FA7.A00(userSession).A02(EnumC33422Ept.A07, C05F.A0Y);
        AbstractC155496ye.A00(userSession).A06(AbstractC111324zv.A00(112));
        Fragment fragment = this.A01;
        Integer num = C05F.A00;
        C36492G7q c36492G7q = new C36492G7q(this, tab);
        if (AbstractC70201WGq.A01 && AbstractC70201WGq.A0F()) {
            VTK.A00(context, new DialogInterfaceOnClickListenerC35338FiF(fragment, userSession, num), userSession, c36492G7q, num);
        } else {
            c36492G7q.D6t();
        }
    }

    public final void A09(com.instagram.creation.base.ui.mediatabbar.Tab tab) {
        C14360o3.A0B(tab, 0);
        UserSession userSession = this.A04;
        C006802i.A0p.markerStart(18297178);
        C36290Fzk A00 = AbstractC34220F7s.A00(userSession);
        UserSession userSession2 = A00.A01;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession2, 2342155956973995573L) && (!C36290Fzk.A00(A00, true))) {
            CallerContext callerContext = AbstractC173237nb.A00;
            C173247nc c173247nc = new C173247nc();
            C2JM c2jm = c173247nc.A01.A00;
            c2jm.A02("ig_profile_photo_change", true);
            ArrayList arrayList = c173247nc.A02;
            arrayList.add(AbstractC111324zv.A00(1651));
            c2jm.A02("ig_profile_photo_completeness", true);
            arrayList.add("IG_PROFILE_PHOTO_CHANGE_IS_COMPLETENESS_UPSELL");
            C06090Tz c06090Tz2 = C06090Tz.A06;
            if (!C18U.A06(c06090Tz2, userSession2, 36314442408921657L) && C18U.A06(c06090Tz2, userSession2, 36314442409118268L)) {
                c173247nc.A00();
                if (!C18U.A06(c06090Tz2, userSession2, 2342157451622681146L)) {
                    c2jm.A01(AbstractC111324zv.A00(2524));
                }
                if (!C18U.A06(c06090Tz2, userSession2, 2342157451622746683L)) {
                    c2jm.A01(AbstractC111324zv.A00(2953));
                }
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            boolean z = c173247nc.A00;
            C14360o3.A0B(strArr, 2);
            AbstractC173237nb.A00(userSession2, new C31725DwU(A00), c173247nc, strArr, z);
        }
        boolean A06 = C18U.A06(c06090Tz, userSession, 36328053160426559L);
        if (tab.equals(AbstractC43884Jap.A01)) {
            A0C = AbstractC43591JPw.A00(474);
            InterfaceC69973Cg interfaceC69973Cg = this.A07;
            EnumC69983Ch enumC69983Ch = EnumC69983Ch.A05;
            C43846JaA c43846JaA = new C43846JaA(enumC69983Ch);
            c43846JaA.A0A = false;
            c43846JaA.A06 = !A06;
            interfaceC69973Cg.EoK(EnumC33447EqK.A0J, new MediaCaptureConfig(c43846JaA), enumC69983Ch);
            return;
        }
        boolean equals = tab.equals(AbstractC43884Jap.A00);
        A0C = "choose_from_library";
        InterfaceC69973Cg interfaceC69973Cg2 = this.A07;
        if (equals) {
            EnumC69983Ch enumC69983Ch2 = EnumC69983Ch.A05;
            C43846JaA c43846JaA2 = new C43846JaA(enumC69983Ch2);
            c43846JaA2.A0A = false;
            boolean z2 = !A06;
            c43846JaA2.A09 = z2;
            c43846JaA2.A05 = z2;
            c43846JaA2.A0E = A06;
            interfaceC69973Cg2.EoI(EnumC33447EqK.A0J, new MediaCaptureConfig(c43846JaA2), enumC69983Ch2);
            return;
        }
        EnumC69983Ch enumC69983Ch3 = EnumC69983Ch.A05;
        C43846JaA c43846JaA3 = new C43846JaA(enumC69983Ch3);
        c43846JaA3.A0A = false;
        interfaceC69973Cg2.Emz(EnumC33447EqK.A0J, new MediaCaptureConfig(c43846JaA3), enumC69983Ch3);
    }

    @Override // X.InterfaceC69913Ca
    public final void CKE(Intent intent) {
        C14360o3.A0B(intent, 0);
        ComponentCallbacks2 parent = this.A01.requireActivity().getParent();
        if (parent != null) {
            ((InterfaceC53722dB) parent).BQV().CKE(intent);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void Cv3(int i, int i2) {
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void Cv4(int i, int i2) {
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void En7(File file, int i) {
    }

    @Override // X.InterfaceC69913Ca
    public final void EnX(Intent intent, int i) {
        C14360o3.A0B(intent, 0);
        UserSession userSession = this.A04;
        C55782hJ A00 = C55772hI.A00(userSession);
        Fragment fragment = this.A01;
        A00.A09(fragment.getActivity(), "new_profile_photo");
        AbstractC31718DwN.A01(userSession, this.A08);
        Context context = fragment.getContext();
        if (context != null && AbstractC86593tX.A0o(context, intent)) {
            C12260kU.A06(fragment, intent, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (X.AbstractC70201WGq.A0G() == false) goto L6;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.7oe] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(android.content.Context r9, X.C3CZ r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3CZ.A00(android.content.Context, X.3CZ, boolean):void");
    }

    public static final void A01(android.net.Uri uri, C3CZ c3cz, int i) {
        A0A = uri;
        InterfaceC16660sJ interfaceC16660sJ = c3cz.A06;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(true);
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        Fragment fragment = c3cz.A01;
        Context context = fragment.getContext();
        if (context != null) {
            UserSession userSession = c3cz.A04;
            FA7.A00(userSession).A00(EnumC33422Ept.A07, C05F.A1F);
            C121275eQ A01 = AbstractC34756FSv.A01(context, uri, userSession, valueOf, i);
            A01.A00 = new EZ6(new C32529EUf(fragment, c3cz.A02, c3cz.A03, userSession, c3cz.A05, interfaceC16660sJ), new C1Ee(), userSession, valueOf);
            C1GJ.A03(A01);
            return;
        }
        throw new IllegalStateException("cannot operate with null context");
    }

    public final void A02() {
        UserSession userSession = this.A04;
        C36282FzZ A00 = AbstractC34219F7r.A00(userSession);
        UserSession userSession2 = A00.A01;
        if (!C18U.A06(C06090Tz.A06, userSession2, 36314506833431203L) && C18U.A06(C06090Tz.A05, userSession2, 36314506833496740L)) {
            CallerContext callerContext = AbstractC173237nb.A00;
            C173247nc c173247nc = new C173247nc();
            c173247nc.A01.A00.A02("ig_import_from_fb", true);
            ArrayList arrayList = c173247nc.A02;
            arrayList.add(AbstractC111324zv.A00(1650));
            c173247nc.A00();
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            boolean z = c173247nc.A00;
            C14360o3.A0B(strArr, 2);
            AbstractC173237nb.A00(userSession2, new C36488G7m(A00), c173247nc, strArr, z);
        }
        A0C = "import_from_facebook";
        EnumC69993Ci enumC69993Ci = A0B;
        String str = userSession.userId;
        C14360o3.A0B(str, 0);
        AbstractC003100w.A0k(10, str);
        AbstractC31719DwO.A00(enumC69993Ci, userSession, AbstractC43591JPw.A00(91), "photo_editing", A0C, null, null);
        C2Ne A002 = AbstractC49092Nc.A00(userSession);
        CallerContext callerContext2 = A0I;
        if (!A002.A00(callerContext2, "UpdateAvatarHelper")) {
            AbstractC35174FfR.A00(EnumC72435Xdf.A05, userSession, MSV.A00(600));
        }
        if (AbstractC34219F7r.A00(userSession).A00()) {
            C69923Cb.A02(this.A01, this.A02);
        }
        EnumC72412Xd8 enumC72412Xd8 = EnumC72412Xd8.A0a;
        if (AbstractC49092Nc.A00(userSession).A00(callerContext2, "UpdateAvatarHelper")) {
            A01(null, this, 0);
        } else {
            AbstractC34213F7l.A00().A01(this.A01, userSession, new C36781GJe(this)).A06(enumC72412Xd8.A01(), null);
        }
    }

    public final void A03() {
        if (this.A00) {
            this.A00 = false;
            C69923Cb.A02(this.A01, this.A02);
        }
        if (A0G) {
            A0H.post(new GKX(this));
        }
    }

    public final void A04(Context context) {
        UserSession userSession = this.A04;
        if (AbstractC55157OdL.A04(userSession)) {
            C08730cb c08730cb = C17060sy.A01;
            Boolean BCC = c08730cb.A01(userSession).A03.BCC();
            if (BCC != null && BCC.booleanValue()) {
                AbstractC55157OdL.A00(context);
                return;
            }
            Boolean CZG = c08730cb.A01(userSession).A03.CZG();
            if (CZG != null && CZG.booleanValue()) {
                AbstractC55157OdL.A01(context);
                return;
            }
            if (c08730cb.A01(userSession).A03.CZE() != null && (!r0.booleanValue())) {
                AbstractC55157OdL.A02(context);
                return;
            } else {
                AbstractC55157OdL.A03(context, new C50162MDp(this, 41));
                return;
            }
        }
        if (AbstractC35182FfZ.A02(userSession)) {
            AbstractC35182FfZ.A00(context);
        } else if (AbstractC35182FfZ.A03(userSession)) {
            AbstractC35182FfZ.A01(context, new C50162MDp(this, 42));
        } else {
            A02();
        }
    }

    public final void A05(Context context) {
        C2JS optionalTreeField;
        A0C = AbstractC111324zv.A00(3010);
        UserSession userSession = this.A04;
        EnumC69993Ci enumC69993Ci = A0B;
        String str = userSession.userId;
        C14360o3.A0B(str, 0);
        AbstractC003100w.A0k(10, str);
        AbstractC31719DwO.A00(enumC69993Ci, userSession, AbstractC43591JPw.A00(91), "photo_editing", A0C, null, null);
        C36490G7o c36490G7o = new C36490G7o(this);
        C67542Ung A00 = AbstractC34896FZi.A00();
        if (A00 != null) {
            String A002 = AbstractC111324zv.A00(2237);
            if (A00.getOptionalTreeField(3, A002, C67023UfA.class, -1883645928) != null) {
                C67542Ung A003 = AbstractC34896FZi.A00();
                if (A003 != null && (optionalTreeField = A003.getOptionalTreeField(3, A002, C67023UfA.class, -1883645928)) != null && optionalTreeField.A09("header") != null && optionalTreeField.A08("confirm_cta") != null && optionalTreeField.A07("cancel_cta") != null && optionalTreeField.getOptionalStringField(3, "subtext") != null) {
                    EnumC33507Erg enumC33507Erg = EnumC33507Erg.BIZ_REMOVE_PHOTO;
                    String A092 = optionalTreeField.A09("header");
                    String optionalStringField = optionalTreeField.getOptionalStringField(3, "subtext");
                    String A08 = optionalTreeField.A08("confirm_cta");
                    String A07 = optionalTreeField.A07("cancel_cta");
                    C193328hC c193328hC = new C193328hC(context);
                    c193328hC.A05 = A092;
                    c193328hC.A0r(optionalStringField);
                    c193328hC.A0e(new DialogInterfaceOnClickListenerC35337FiE(enumC33507Erg, userSession, c36490G7o), A08);
                    c193328hC.A0c(new DialogInterfaceOnClickListenerC35323Fi0(enumC33507Erg, userSession), A07);
                    Dialog A02 = c193328hC.A02();
                    C35241Fga.A01(enumC33507Erg, userSession, "reminder_shown");
                    C0fJ.A00(A02);
                    return;
                }
                c36490G7o.D6t();
            }
        }
        Fragment fragment = this.A01;
        Integer num = C05F.A0N;
        if (AbstractC70201WGq.A0F()) {
            VTK.A00(context, new DialogInterfaceOnClickListenerC35338FiF(fragment, userSession, num), userSession, c36490G7o, num);
            return;
        }
        c36490G7o.D6t();
    }

    public final void A08(Intent intent, int i, int i2, boolean z) {
        C2JS optionalTreeField;
        Bundle extras;
        LoginClient$Result loginClient$Result;
        if (!z && i2 != 0) {
            Fragment fragment = this.A01;
            AbstractC13530mf.A0A(new File(fragment.requireContext().getFilesDir(), "avatar_temp/").getAbsolutePath());
            if (i2 == -1) {
                CallerContext callerContext = C1L2.A00;
                if (i == 64206) {
                    UserSession userSession = this.A04;
                    String str = null;
                    boolean z2 = false;
                    if (intent != null && (extras = intent.getExtras()) != null) {
                        Object obj = extras.get(MSV.A00(189));
                        if ((obj instanceof LoginClient$Result) && (loginClient$Result = (LoginClient$Result) obj) != null) {
                            LoginClient$Request loginClient$Request = loginClient$Result.A01;
                            str = loginClient$Request.A01;
                            z2 = loginClient$Request.A02;
                        }
                    }
                    C34876FYl.A00();
                    HashMap hashMap = new HashMap();
                    hashMap.put(MSV.A00(205), String.valueOf(AbstractC23851Es.A03()));
                    hashMap.put("exception", null);
                    AbstractC62273S4s.A00(userSession, MSV.A00(440), str, hashMap, z2);
                    return;
                }
                if (i == 10001 && intent != null && intent.getAction() != null) {
                    String action = intent.getAction();
                    Context context = fragment.getContext();
                    UserSession userSession2 = this.A04;
                    C36493G7r c36493G7r = new C36493G7r(this, action);
                    C67542Ung A00 = AbstractC34896FZi.A00();
                    if (A00 != null && (optionalTreeField = A00.getOptionalTreeField(2, AbstractC111324zv.A00(2871), C67024UfB.class, 450216751)) != null && optionalTreeField.getOptionalStringField(2, "header") != null && optionalTreeField.A08("confirm_cta") != null && optionalTreeField.A07("cancel_cta") != null && optionalTreeField.A0A("subtext") != null) {
                        EnumC33507Erg enumC33507Erg = EnumC33507Erg.BIZ_EDIT_PHOTO;
                        String optionalStringField = optionalTreeField.getOptionalStringField(2, "header");
                        String A0A2 = optionalTreeField.A0A("subtext");
                        String A08 = optionalTreeField.A08("confirm_cta");
                        String A07 = optionalTreeField.A07("cancel_cta");
                        if (context == null) {
                            return;
                        }
                        C193328hC c193328hC = new C193328hC(context);
                        c193328hC.A05 = optionalStringField;
                        c193328hC.A0r(A0A2);
                        c193328hC.A0Z(new DialogInterfaceOnClickListenerC35337FiE(enumC33507Erg, userSession2, c36493G7r), EnumC193348hE.A03, A08, true);
                        c193328hC.A0c(new DialogInterfaceOnClickListenerC35323Fi0(enumC33507Erg, userSession2), A07);
                        Dialog A02 = c193328hC.A02();
                        C35241Fga.A01(enumC33507Erg, userSession2, "reminder_shown");
                        C0fJ.A00(A02);
                        return;
                    }
                    c36493G7r.D6t();
                    return;
                }
            } else {
                return;
            }
        }
        C69923Cb.A00();
    }
}
