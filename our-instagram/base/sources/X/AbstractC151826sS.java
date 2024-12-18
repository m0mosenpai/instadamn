package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.6sS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC151826sS {
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (X.AbstractC31248DoW.A01(r11) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List A00(com.instagram.common.session.UserSession r11) {
        /*
            r8 = 1
            r9 = 0
            X.C14360o3.A0B(r11, r9)
            X.6oQ r7 = X.EnumC143276dS.A01
            X.6dT r6 = X.EnumC143286dT.A0E
            boolean r0 = X.AbstractC31248DoW.A00(r11)
            if (r0 == 0) goto L6e
            X.6dS r0 = X.EnumC143276dS.A0E
        L11:
            r10 = 0
            java.lang.String r5 = r7.A00(r0, r6, r11, r9)
            boolean r0 = X.AbstractC31248DoW.A06(r11, r8)
            if (r0 == 0) goto L23
            boolean r1 = X.AbstractC31248DoW.A01(r11)
            r0 = 1
            if (r1 != 0) goto L24
        L23:
            r0 = 0
        L24:
            r4 = 0
            if (r0 != 0) goto L28
            r5 = r10
        L28:
            X.6dS r0 = X.EnumC143276dS.A09
            java.lang.String r3 = r7.A00(r0, r6, r11, r9)
            boolean r0 = X.AbstractC31248DoW.A06(r11, r8)
            if (r0 == 0) goto L6c
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36315915583098571(0x81052200060ecb, double:3.0296694749816005E-306)
            boolean r0 = X.C18U.A06(r2, r11, r0)
            if (r0 == 0) goto L6c
            boolean r0 = X.AbstractC31248DoW.A01(r11)
            if (r0 != 0) goto L6c
        L47:
            boolean r0 = X.AbstractC31248DoW.A00(r11)
            if (r0 == 0) goto L69
            X.6dS r0 = X.EnumC143276dS.A0C
        L4f:
            java.lang.String r1 = r7.A00(r0, r6, r11, r9)
            boolean r0 = X.AbstractC31248DoW.A06(r11, r8)
            if (r0 == 0) goto L60
            boolean r0 = X.AbstractC31248DoW.A04(r11)
            if (r0 == 0) goto L60
            r4 = r1
        L60:
            java.lang.String[] r0 = new java.lang.String[]{r5, r3, r4}
            java.util.List r0 = X.AbstractC16960so.A1R(r0)
            return r0
        L69:
            X.6dS r0 = X.EnumC143276dS.A0B
            goto L4f
        L6c:
            r3 = r10
            goto L47
        L6e:
            X.6dS r0 = X.EnumC143276dS.A0D
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC151826sS.A00(com.instagram.common.session.UserSession):java.util.List");
    }

    public static final void A01(Context context, Intent intent, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16600sD interfaceC16600sD) {
        C14360o3.A0B(userSession, 1);
        if (intent != null && AbstractC31248DoW.A04(userSession)) {
            if (intent.hasExtra("coin_flip_disabled")) {
                interfaceC16600sD.invoke(false, null, null, "ig_coin_flip_customization_sheet");
                C41451vu c41451vu = C41451vu.A01;
                C146106i8 c146106i8 = new C146106i8();
                c146106i8.A04();
                c146106i8.A0D = context.getString(2131956292);
                c146106i8.A06();
                String string = context.getString(2131976066);
                C14360o3.A07(string);
                c146106i8.A0G = string;
                c146106i8.A0L = true;
                c146106i8.A0A(new C29313Cw8(interfaceC16600sD));
                c41451vu.E4s(new C3KD(c146106i8.A00()));
            }
            if (intent.hasExtra("avatar_updated")) {
                interfaceC16820sZ.invoke();
            }
            if (intent.hasExtra("background_updated") || (AbstractC31248DoW.A04(userSession) && intent.hasExtra("pose_updated"))) {
                interfaceC16600sD.invoke(true, intent.getStringExtra("background_updated"), intent.getStringExtra("pose_updated"), "ig_coin_flip_customization_sheet");
            }
            if (intent.hasExtra("avatar_deleted")) {
                interfaceC16820sZ2.invoke();
            }
        }
    }

    public static final void A02(final Context context, C07X c07x, final C3CZ c3cz, C60852q9 c60852q9, final UserSession userSession, final C151696sF c151696sF, final String str, final InterfaceC16820sZ interfaceC16820sZ, final InterfaceC16820sZ interfaceC16820sZ2, final InterfaceC16620sF interfaceC16620sF, final InterfaceC16610sE interfaceC16610sE) {
        C14360o3.A0B(c60852q9, 0);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c3cz, 4);
        c60852q9.A00.A06(c07x, new C151846sU(new InterfaceC58362lv() { // from class: X.6sT
            @Override // X.InterfaceC58362lv
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                C3CZ c3cz2;
                Context context2;
                com.instagram.creation.base.ui.mediatabbar.Tab tab;
                InterfaceC16820sZ interfaceC16820sZ3;
                int i;
                AbstractC46377Kfz abstractC46377Kfz = (AbstractC46377Kfz) obj;
                if (abstractC46377Kfz instanceof EEB) {
                    interfaceC16820sZ3 = interfaceC16820sZ;
                } else {
                    if (abstractC46377Kfz instanceof EEA) {
                        C151696sF c151696sF2 = c151696sF;
                        if (c151696sF2 == null) {
                            return;
                        }
                        C53O c53o = c151696sF2.A07;
                        EEA eea = (EEA) abstractC46377Kfz;
                        String str2 = eea.A02;
                        String str3 = eea.A00;
                        String str4 = eea.A01;
                        List A00 = AbstractC151826sS.A00(userSession);
                        C14360o3.A0B(c53o, 0);
                        C14360o3.A0B(str2, 1);
                        C14360o3.A0B(str3, 2);
                        Activity activity = (Activity) c151696sF2.A0C.get();
                        if (activity == null) {
                            return;
                        }
                        AbstractC47193KtS.A01.A03(activity, c53o, c151696sF2.A09, str2, str3, null, str4, null, A00, false, false);
                        return;
                    }
                    if (!(abstractC46377Kfz instanceof C45420K9h) && !(abstractC46377Kfz instanceof C45419K9g)) {
                        if (abstractC46377Kfz instanceof C45421K9i) {
                            c3cz2 = c3cz;
                            context2 = context;
                            tab = AbstractC43884Jap.A01;
                        } else {
                            if (abstractC46377Kfz instanceof C45423K9k) {
                                c3cz.A05(context);
                                return;
                            }
                            if (abstractC46377Kfz instanceof C45422K9j) {
                                C3CZ c3cz3 = c3cz;
                                C25621Ms c25621Ms = new C25621Ms(c3cz3.A04, -2);
                                c25621Ms.A05();
                                c25621Ms.A03();
                                String A0u = AnonymousClass001.A0u("api/", "v1/", "users/", "set_birthday_opt_in_settings/");
                                C14360o3.A07(A0u);
                                c25621Ms.A0E = A0u;
                                c25621Ms.A0R(EA1.class, C34733FRw.class);
                                c25621Ms.A9s("effects_enabled", "false");
                                c25621Ms.A9s("surface", "profile");
                                C1ON A0N = c25621Ms.A0N();
                                C14360o3.A0C(A0N, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.BirthdayOptInSettingsUpdateResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.BirthdayOptInSettingsUpdateResponse>>");
                                A0N.A00 = new EU7(c3cz3);
                                Fragment fragment = c3cz3.A01;
                                C1GJ.A00(fragment.requireContext(), AbstractC018607g.A00(fragment), A0N);
                                return;
                            }
                            if (abstractC46377Kfz instanceof C45424K9l) {
                                c3cz.A04(context);
                                return;
                            }
                            if (abstractC46377Kfz instanceof C45417K9e) {
                                C45417K9e c45417K9e = (C45417K9e) abstractC46377Kfz;
                                interfaceC16610sE.invoke(Integer.valueOf(c45417K9e.A00), Integer.valueOf(c45417K9e.A01), c45417K9e.A02);
                                return;
                            }
                            if (abstractC46377Kfz instanceof C45416K9d) {
                                InterfaceC16620sF interfaceC16620sF2 = interfaceC16620sF;
                                if (interfaceC16620sF2 == null) {
                                    return;
                                }
                                if (C14360o3.A0K(str, "ig_self_profile")) {
                                    i = 1065;
                                } else {
                                    i = 1053;
                                }
                                interfaceC16620sF2.invoke(AbstractC43591JPw.A00(i), Boolean.valueOf(((C45416K9d) abstractC46377Kfz).A00));
                                return;
                            }
                            if (abstractC46377Kfz instanceof C45418K9f) {
                                interfaceC16820sZ3 = interfaceC16820sZ2;
                            } else if (abstractC46377Kfz == null) {
                                return;
                            } else {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        c3cz2 = c3cz;
                        context2 = context;
                        tab = AbstractC43884Jap.A00;
                    }
                    c3cz2.A06(context2, tab);
                    return;
                }
                if (interfaceC16820sZ3 != null) {
                    interfaceC16820sZ3.invoke();
                }
            }
        }));
    }
}
