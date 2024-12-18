package X;

import android.content.Context;
import android.util.SparseArray;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.73P, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C73P {
    public static final C73P A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006f, code lost:
    
        if (X.C08730cb.A00(r22).A00().A2I() == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0191 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List A02(android.content.Context r20, X.InterfaceC11380iw r21, com.instagram.common.session.UserSession r22, X.C70O r23, com.instagram.user.model.User r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73P.A02(android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.70O, com.instagram.user.model.User, java.lang.String):java.util.List");
    }

    public static final boolean A03(UserSession userSession, User user) {
        boolean z;
        Boolean BmX = user.A03.BmX();
        if (BmX != null) {
            z = BmX.booleanValue();
        } else {
            z = false;
        }
        if (z || AbstractC154816xW.A02(userSession, user)) {
            return false;
        }
        Boolean CYM = user.A03.CYM();
        if (CYM != null && CYM.booleanValue()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        if (X.C17060sy.A01.A01(r26).A2I() == false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList A05(android.content.Context r24, X.InterfaceC11380iw r25, com.instagram.common.session.UserSession r26, X.C70O r27, com.instagram.user.model.User r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73P.A05(android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.70O, com.instagram.user.model.User, java.lang.String):java.util.ArrayList");
    }

    private final ArrayList A01(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C70O c70o, User user, boolean z) {
        EnumC151426rk enumC151426rk;
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            EnumC151426rk A01 = AbstractC1567472a.A01(context, userSession, user, i2, true);
            if (A01 != null && A01 != EnumC151426rk.MESSAGE && ((A01 != (enumC151426rk = EnumC151426rk.SHOP) && A01 != enumC151426rk) || !C2TN.A04(userSession, user) || !C17060sy.A01.A01(userSession).A2I())) {
                switch (A01.ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 11:
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        sparseArray.put(i, A01);
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    default:
                        arrayList.add(A00(context, A01, interfaceC11380iw, userSession, c70o.BhX(), user, null, z));
                        break;
                }
                i++;
            }
        }
        if (sparseArray.size() > 1 || (sparseArray.size() >= 1 && AbstractC1567472a.A0C(user))) {
            ArrayList arrayList2 = new ArrayList();
            int size = sparseArray.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object valueAt = sparseArray.valueAt(i3);
                if (valueAt != null) {
                    arrayList2.add(Integer.valueOf(((EnumC151426rk) valueAt).A00));
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            arrayList.add(sparseArray.keyAt(0), A00(context, EnumC151426rk.CONTACT, interfaceC11380iw, userSession, c70o.BhX(), user, arrayList2, z));
        } else {
            int size2 = sparseArray.size();
            for (int i4 = 0; i4 < size2; i4++) {
                int keyAt = sparseArray.keyAt(i4);
                Object valueAt2 = sparseArray.valueAt(i4);
                if (valueAt2 != null) {
                    arrayList.add(keyAt, A00(context, (EnumC151426rk) valueAt2, interfaceC11380iw, userSession, c70o.BhX(), user, null, z));
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        return arrayList;
    }

    public static final boolean A04(UserSession userSession, User user) {
        if (user.CS0(new C150866ql(userSession)) && C18U.A06(C06090Tz.A05, userSession, 36322929265617653L)) {
            return true;
        }
        return false;
    }

    private final C73R A00(final Context context, EnumC151426rk enumC151426rk, final InterfaceC11380iw interfaceC11380iw, final UserSession userSession, final InterfaceC151446rm interfaceC151446rm, final User user, ArrayList arrayList, boolean z) {
        C73R gbi;
        switch (enumC151426rk.ordinal()) {
            case 0:
                gbi = new GBI(context, interfaceC151446rm, user);
                break;
            case 1:
                gbi = new GBO(context, interfaceC151446rm, user);
                break;
            case 2:
                gbi = new C31439Drj(context, interfaceC151446rm, user);
                break;
            case 3:
                gbi = new GBQ(context, interfaceC151446rm, user);
                break;
            case 4:
                gbi = new GBK(context, interfaceC151446rm, user);
                break;
            case 5:
                gbi = new GBJ(context, interfaceC151446rm, user);
                break;
            case 6:
                return new C1569673a(context, userSession, interfaceC151446rm, user, z);
            case 7:
                gbi = new GBL(context, interfaceC151446rm, user);
                break;
            case 8:
                if (arrayList != null) {
                    return new C31432Drc(context, interfaceC151446rm, user, arrayList);
                }
                throw new IllegalStateException("Required value was null.");
            case 9:
                return new C73R(context, interfaceC11380iw, userSession, interfaceC151446rm, user) { // from class: X.73b
                    public final Context A00;
                    public final InterfaceC11380iw A01;
                    public final UserSession A02;
                    public final InterfaceC151446rm A03;
                    public final C73S A04;
                    public final User A05;

                    {
                        C14360o3.A0B(interfaceC151446rm, 2);
                        this.A00 = context;
                        this.A03 = interfaceC151446rm;
                        this.A05 = user;
                        this.A02 = userSession;
                        this.A01 = interfaceC11380iw;
                        interfaceC151446rm.D0q(user);
                        this.A04 = C73S.A08;
                    }

                    @Override // X.C73R
                    public final String AjD() {
                        return "generic";
                    }

                    @Override // X.C73R
                    public final String Aj7() {
                        Context context2 = this.A00;
                        int i = 2131961117;
                        if (WE6.A02(this.A02)) {
                            i = 2131975005;
                        }
                        String string = context2.getString(i);
                        C14360o3.A07(string);
                        return string;
                    }

                    @Override // X.C73R
                    public final C73S AjB() {
                        return this.A04;
                    }

                    @Override // X.C73R
                    public final /* synthetic */ Integer BEt() {
                        return null;
                    }

                    @Override // X.C73R
                    public final /* synthetic */ boolean DQZ() {
                        return false;
                    }

                    @Override // X.C73R
                    public final void onClick() {
                        UserSession userSession2 = this.A02;
                        InterfaceC11380iw interfaceC11380iw2 = this.A01;
                        User user2 = this.A05;
                        String id = user2.getId();
                        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw2, userSession2);
                        InterfaceC02590Ai A002 = A01.A00(A01.A00, "ig_cg_click_profile_donate_cta");
                        A002.A9K("charity_user_id", Long.valueOf(Long.parseLong(id)));
                        A002.A8R(EnumC72419XdP.IG_CHARITY_BUSINESS_PROFILE, MSV.A00(95));
                        A002.Cht();
                        this.A03.D0r(user2, "button_tray");
                    }
                };
            case 10:
                gbi = new C73R(context, userSession, interfaceC151446rm, user) { // from class: X.73Z
                    public final Context A00;
                    public final UserSession A01;
                    public final InterfaceC151446rm A02;
                    public final C73S A03;
                    public final User A04;

                    {
                        C14360o3.A0B(interfaceC151446rm, 2);
                        this.A00 = context;
                        this.A02 = interfaceC151446rm;
                        this.A04 = user;
                        this.A01 = userSession;
                        this.A03 = C73S.A0G;
                    }

                    @Override // X.C73R
                    public final String AjD() {
                        return "generic";
                    }

                    @Override // X.C73R
                    public final String Aj7() {
                        String str;
                        InterfaceC111194zh Ayj = this.A04.A03.Ayj();
                        if (Ayj != null && Ayj.AyS() != null) {
                            str = Ayj.AyS();
                        } else {
                            str = "";
                        }
                        C14360o3.A07(str);
                        return str;
                    }

                    @Override // X.C73R
                    public final C73S AjB() {
                        return this.A03;
                    }

                    @Override // X.C73R
                    public final /* synthetic */ Integer BEt() {
                        return null;
                    }

                    @Override // X.C73R
                    public final /* synthetic */ boolean DQZ() {
                        return false;
                    }

                    @Override // X.C73R
                    public final void onClick() {
                        this.A02.D10(this.A04, "support");
                    }
                };
                break;
            case 11:
                return new C151566s2(context, userSession, interfaceC151446rm, user, A04(userSession, user));
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                gbi = new GBM(context, interfaceC151446rm, user);
                break;
            default:
                throw new IllegalStateException("Unknown business action on profile.");
        }
        return gbi;
    }
}
