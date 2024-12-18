package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.EPp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32414EPp extends C7E1 implements InterfaceC161877Mx {
    public boolean A00;
    public C168737g7 A01;
    public ESA A02;
    public boolean A03;
    public final C31363DqS A04;
    public final java.util.Set A05;
    public final C32462ERo A06;
    public final C31369DqY A07;
    public final C31545DtV A08;
    public final InterfaceC62602sz A09;
    public final C65842yM A0A;
    public final String A0B;

    @Override // X.InterfaceC161877Mx
    public final boolean AJn(String str) {
        C14360o3.A0B(str, 0);
        return this.A05.contains(str);
    }

    @Override // X.C7E1, android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.2sz] */
    public C32414EPp(Activity activity, Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C31363DqS c31363DqS, InterfaceC37215GaQ interfaceC37215GaQ, GXk gXk, C38O c38o, InterfaceC37216GaR interfaceC37216GaR, EVJ evj, String str, boolean z) {
        boolean A1a = AbstractC31175DnJ.A1a(userSession);
        AbstractC167017dG.A1U(c31363DqS, interfaceC37216GaR);
        C14360o3.A0B(interfaceC37215GaQ, 9);
        C14360o3.A0B(str, 11);
        this.A05 = AbstractC166987dD.A1H();
        this.A04 = c31363DqS;
        this.A09 = new Object();
        C65842yM c65842yM = new C65842yM(context);
        this.A0A = c65842yM;
        C31369DqY c31369DqY = new C31369DqY(context, interfaceC11380iw, userSession, c38o, interfaceC37216GaR, z, A1a, A1a);
        this.A07 = c31369DqY;
        C32462ERo c32462ERo = new C32462ERo(context, interfaceC11380iw, userSession, interfaceC37215GaQ, gXk);
        this.A06 = c32462ERo;
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36318655771842941L);
        this.A03 = A06;
        if (A06 && evj != null) {
            this.A02 = new ESA(activity, context, null, interfaceC11380iw, userSession, evj, "unknown");
            this.A01 = new C168737g7(context);
        }
        C31545DtV c31545DtV = new C31545DtV(context);
        this.A08 = c31545DtV;
        this.A0B = str;
        ArrayList A1F = AbstractC166987dD.A1F(AbstractC16960so.A1Q(c65842yM, c31369DqY, c32462ERo, this.A02, c31545DtV, this.A01));
        java.util.Set singleton = Collections.singleton(null);
        C14360o3.A07(singleton);
        C15500q5.A00(A1F).removeAll(singleton);
        A0A(A1F);
    }

    public final void A0C(List list) {
        List list2 = this.A04.A00;
        list2.clear();
        java.util.Set set = this.A05;
        set.clear();
        for (Object obj : list) {
            if (obj instanceof C47P) {
                set.add(AbstractC31173DnH.A0p((C47P) obj));
            }
        }
        list2.addAll(AbstractC001800i.A0X(list));
        this.A00 = true;
        A00(this);
    }

    public static final void A00(C32414EPp c32414EPp) {
        InterfaceC65642y0 interfaceC65642y0;
        Class<?> cls;
        Integer valueOf;
        InterfaceC65642y0 interfaceC65642y02;
        Object obj;
        c32414EPp.A06();
        C168737g7 c168737g7 = c32414EPp.A01;
        ESA esa = c32414EPp.A02;
        if (c32414EPp.A03 && esa != null && c168737g7 != null) {
            c32414EPp.A09(esa, new Object(), new C34686FPx(C05F.A0Y));
            c32414EPp.A09(c168737g7, C31335Dq0.A00(2131974884), new Object());
        }
        List list = c32414EPp.A04.A00;
        if (!AbstractC166987dD.A1b(list) && c32414EPp.A00) {
            String str = c32414EPp.A0B;
            interfaceC65642y0 = c32414EPp.A08;
            obj = str;
        } else {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                if (obj2 instanceof C47P) {
                    valueOf = Integer.valueOf(i);
                    interfaceC65642y02 = c32414EPp.A07;
                } else {
                    String str2 = null;
                    if (obj2 instanceof FOC) {
                        FOC foc = (FOC) obj2;
                        Integer A00 = FVZ.A00(foc);
                        if (A00 != C05F.A00 && A00 != C05F.A01) {
                            Integer A002 = FVZ.A00(foc);
                            if (A002 != null) {
                                str2 = F8P.A00(A002);
                            }
                            throw AbstractC167007dF.A0c("Unaccepted recommendation type for InterestRecommendation: ", str2);
                        }
                        valueOf = Integer.valueOf(i);
                        interfaceC65642y02 = c32414EPp.A06;
                    } else {
                        if (obj2 != null && (cls = obj2.getClass()) != null) {
                            str2 = cls.getCanonicalName();
                        }
                        throw AbstractC167007dF.A0c("Unaccepted model type: ", str2);
                    }
                }
                c32414EPp.A09(interfaceC65642y02, obj2, valueOf);
            }
            InterfaceC62602sz interfaceC62602sz = c32414EPp.A09;
            if (interfaceC62602sz != null && interfaceC62602sz.CLJ()) {
                interfaceC65642y0 = c32414EPp.A0A;
                obj = interfaceC62602sz;
            }
            c32414EPp.A07();
        }
        c32414EPp.A08(interfaceC65642y0, obj);
        c32414EPp.A07();
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        A00(this);
    }
}
