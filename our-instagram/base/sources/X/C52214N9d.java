package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.N9d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52214N9d extends C1P1 {
    public final /* synthetic */ InterfaceC58049Poa A00;
    public final /* synthetic */ C149586oB A01;
    public final /* synthetic */ String A02;

    public C52214N9d(InterfaceC58049Poa interfaceC58049Poa, C149586oB c149586oB, String str) {
        this.A00 = interfaceC58049Poa;
        this.A01 = c149586oB;
        this.A02 = str;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String str;
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 2024990259);
        InterfaceC58049Poa interfaceC58049Poa = this.A00;
        if (interfaceC58049Poa != null) {
            Throwable A01 = abstractC115105If.A01();
            if (A01 != null) {
                str = A01.getMessage();
            } else {
                str = null;
            }
            interfaceC58049Poa.onFail(AnonymousClass001.A0R("Prefetch Failed: server onFail: ", str));
        }
        C149586oB.A05(this.A01, "native auth response: failure");
        C0f9.A0A(-2070975137, A0N);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        ImmutableList of;
        String str;
        int A03 = C0f9.A03(-1691593579);
        AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
        int A0N = AbstractC167017dG.A0N(anonymousClass435, -80736006);
        AbstractC907342m abstractC907342m = (AbstractC907342m) anonymousClass435.A01;
        if (abstractC907342m != null && abstractC907342m.A00(C51536MpM.class, "fx_growth") != null) {
            AbstractC907342m A00 = abstractC907342m.A00(C51536MpM.class, "fx_growth");
            if (A00 == null || (of = A00.A02("can_user_see_ac_upsell_multi_native_auth", C51535MpL.class)) == null) {
                of = ImmutableList.of();
                C14360o3.A07(of);
            }
            C149586oB c149586oB = this.A01;
            Map map = c149586oB.A03;
            String str2 = this.A02;
            boolean z = false;
            if (!(of instanceof Collection) || !of.isEmpty()) {
                Iterator<E> it = of.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((AbstractC907342m) it.next()).A04("eligibility", Ni8.A03) == Ni8.A02) {
                        z = true;
                        break;
                    }
                }
            }
            AbstractC43592JPx.A1W(str2, map, z);
            Map map2 = c149586oB.A04;
            ArrayList A0q = AbstractC167017dG.A0q(of);
            Iterator<E> it2 = of.iterator();
            while (it2.hasNext()) {
                String A05 = ((AbstractC907342m) it2.next()).A05("opaque_target_account_encrypted_string");
                if (A05 == null) {
                    A05 = "";
                }
                A0q.add(A05);
            }
            map2.put(str2, A0q);
            C149586oB.A04(of, null, c149586oB, str2);
            InterfaceC58049Poa interfaceC58049Poa = this.A00;
            if (interfaceC58049Poa != null) {
                interfaceC58049Poa.onSuccess();
            }
            if (AbstractC166997dE.A1Z(map.get(str2), true)) {
                str = AnonymousClass001.A0R(str2, ": native auth response: eligible");
            } else {
                str = "native auth response: ineligible";
            }
            C149586oB.A05(c149586oB, str);
            i = 1256558642;
        } else {
            InterfaceC58049Poa interfaceC58049Poa2 = this.A00;
            if (interfaceC58049Poa2 != null) {
                interfaceC58049Poa2.onFail("Prefetch Failed: server response.result?.fxGrowth is null");
            }
            i = -487565222;
        }
        C0f9.A0A(i, A0N);
        C0f9.A0A(60914369, A03);
    }
}
