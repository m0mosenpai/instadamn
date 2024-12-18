package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.N9g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52217N9g extends C1P1 {
    public final /* synthetic */ InterfaceC58049Poa A00;
    public final /* synthetic */ C149586oB A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C52217N9g(InterfaceC58049Poa interfaceC58049Poa, C149586oB c149586oB, String str, String str2) {
        this.A00 = interfaceC58049Poa;
        this.A01 = c149586oB;
        this.A02 = str;
        this.A03 = str2;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        ImmutableList of;
        ImmutableList of2;
        boolean z;
        String A0R;
        int A03 = C0f9.A03(-156984420);
        AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
        int A0N = AbstractC167017dG.A0N(anonymousClass435, 821196918);
        AbstractC907342m abstractC907342m = (AbstractC907342m) anonymousClass435.A01;
        if (abstractC907342m != null && abstractC907342m.A00(C51539MpP.class, "fx_growth") != null) {
            AbstractC907342m A00 = abstractC907342m.A00(C51539MpP.class, "fx_growth");
            if (A00 == null || (of = A00.A02("can_user_see_ac_upsell_for_entry_point_one", C51537MpN.class)) == null) {
                of = ImmutableList.of();
                C14360o3.A07(of);
            }
            AbstractC907342m A002 = abstractC907342m.A00(C51539MpP.class, "fx_growth");
            if (A002 == null || (of2 = A002.A02("can_user_see_ac_upsell_for_entry_point_two", C51538MpO.class)) == null) {
                of2 = ImmutableList.of();
                C14360o3.A07(of2);
            }
            C149586oB c149586oB = this.A01;
            Map map = c149586oB.A03;
            String str = this.A02;
            boolean z2 = false;
            if (!(of instanceof Collection) || !of.isEmpty()) {
                Iterator<E> it = of.iterator();
                while (it.hasNext()) {
                    if (((AbstractC907342m) it.next()).A04("eligibility", Ni8.A03) == Ni8.A02) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            AbstractC43592JPx.A1W(str, map, z);
            String str2 = this.A03;
            if (!(of2 instanceof Collection) || !of2.isEmpty()) {
                Iterator<E> it2 = of2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (((AbstractC907342m) it2.next()).A04("eligibility", Ni8.A03) == Ni8.A02) {
                        z2 = true;
                        break;
                    }
                }
            }
            AbstractC43592JPx.A1W(str2, map, z2);
            Map map2 = c149586oB.A04;
            ArrayList A0i = AbstractC167007dF.A0i(of);
            Iterator<E> it3 = of.iterator();
            while (true) {
                String str3 = "";
                if (!it3.hasNext()) {
                    break;
                }
                String A05 = ((AbstractC907342m) it3.next()).A05("opaque_target_account_encrypted_string");
                if (A05 != null) {
                    str3 = A05;
                }
                A0i.add(str3);
            }
            map2.put(str, A0i);
            ArrayList A0i2 = AbstractC167007dF.A0i(of2);
            Iterator<E> it4 = of2.iterator();
            while (it4.hasNext()) {
                String A052 = ((AbstractC907342m) it4.next()).A05("opaque_target_account_encrypted_string");
                if (A052 == null) {
                    A052 = "";
                }
                A0i2.add(A052);
            }
            map2.put(str2, A0i2);
            C149586oB.A04(null, of, c149586oB, str);
            InterfaceC58049Poa interfaceC58049Poa = this.A00;
            if (interfaceC58049Poa != null) {
                interfaceC58049Poa.onSuccess();
            }
            if (!C14360o3.A0K(map.get(str), true) && !C14360o3.A0K(map.get(str2), true)) {
                A0R = "native auth response: ineligible";
            } else {
                if (C14360o3.A0K(map.get(str), true)) {
                    C149586oB.A05(c149586oB, AnonymousClass001.A0R(str, ": native auth response: eligible"));
                }
                if (C14360o3.A0K(map.get(str2), true)) {
                    A0R = AnonymousClass001.A0R(str2, ": native auth response: eligible");
                }
                i = 1305315062;
            }
            C149586oB.A05(c149586oB, A0R);
            i = 1305315062;
        } else {
            InterfaceC58049Poa interfaceC58049Poa2 = this.A00;
            if (interfaceC58049Poa2 != null) {
                interfaceC58049Poa2.onFail("Prefetch Failed: server response.result?.fxGrowth is null");
            }
            i = 1557225849;
        }
        C0f9.A0A(i, A0N);
        C0f9.A0A(706106028, A03);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String str;
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 1877609486);
        InterfaceC58049Poa interfaceC58049Poa = this.A00;
        String str2 = null;
        if (interfaceC58049Poa != null) {
            Throwable A01 = abstractC115105If.A01();
            if (A01 != null) {
                str2 = A01.getMessage();
            }
            interfaceC58049Poa.onFail(AnonymousClass001.A0R("Prefetch Failed: server onFail: ", str2));
        }
        C149586oB c149586oB = this.A01;
        C149586oB.A05(c149586oB, "native auth response: failure");
        UserSession userSession = c149586oB.A02;
        EnumC72435Xdf A00 = C149586oB.A00(this.A02);
        Throwable A012 = abstractC115105If.A01();
        C09530e4 A1L = AbstractC166987dD.A1L("exception", String.valueOf(A012));
        if (A012 == null || (str = A012.getMessage()) == null) {
            str = "";
        }
        AbstractC35174FfR.A01(A00, userSession, "upsell_combined_two_entry_point_multi_native_auth_prefetch_exception", AbstractC25233BEq.A0p(DialogModule.KEY_MESSAGE, str, A1L));
        C0f9.A0A(-2089126442, A0N);
    }
}
