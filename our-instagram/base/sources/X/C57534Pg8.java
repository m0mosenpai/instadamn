package X;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.forker.Process;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Pg8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57534Pg8 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57534Pg8(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public static C57534Pg8 A00(Object obj, Object obj2, int i) {
        return new C57534Pg8(i, obj, obj2);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        AbstractC155316yK abstractC155316yK;
        Object invoke;
        Object invoke2;
        C07N c07n;
        Object invoke3;
        switch (this.A00) {
            case 0:
                C0fN.A02((JobParameters) this.A01, (JobService) this.A02, false);
                break;
            case 1:
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ != null && (invoke = interfaceC16820sZ.invoke()) != null) {
                    return invoke;
                }
                return ((ComponentActivity) this.A02).getDefaultViewModelCreationExtras();
            case 11:
            case Process.SIGTERM /* 15 */:
            case 16:
                InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ2 != null && (invoke2 = interfaceC16820sZ2.invoke()) != null) {
                    return invoke2;
                }
                return AbstractC25231BEo.A0V(this.A02);
            case 18:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 21:
                OH6 oh6 = (OH6) this.A01;
                C51748MtX c51748MtX = (C51748MtX) this.A02;
                EnumC53172NfT CBf = ((InterfaceC57956Pn2) c51748MtX.A01).CBf();
                boolean z = !c51748MtX.A03;
                C14360o3.A0B(CBf, 0);
                N6t n6t = oh6.A00;
                C51000Mg7 c51000Mg7 = (C51000Mg7) n6t.A05.getValue();
                EnumC53172NfT enumC53172NfT = CBf;
                OAS oas = c51000Mg7.A03;
                String name = CBf.name();
                C14360o3.A0B(name, 0);
                InterfaceC58268PsC interfaceC58268PsC = oas.A00;
                if (interfaceC58268PsC != null) {
                    String str = oas.A01;
                    Bundle A0b = AbstractC166987dD.A0b();
                    String str2 = oas.A02;
                    if (str2 != null) {
                        A0b.putString("form_id", str2);
                    }
                    A0b.putString("question_type", name);
                    InterfaceC58268PsC.A00(A0b, interfaceC58268PsC, str, "lead_gen_creatives_context_card", "creatives_context_card_section_row_click");
                }
                C05A c05a = c51000Mg7.A06;
                if (!z) {
                    enumC53172NfT = null;
                }
                c05a.Egh(enumC53172NfT);
                if (z) {
                    RecyclerView recyclerView = n6t.A00;
                    C2UU c2uu = null;
                    if (recyclerView != null) {
                        c2uu = recyclerView.A0A;
                    }
                    if ((c2uu instanceof C51115MiK) && (abstractC155316yK = (AbstractC155316yK) c2uu) != null) {
                        int itemCount = abstractC155316yK.getItemCount();
                        int i = 0;
                        while (true) {
                            if (i >= itemCount) {
                                break;
                            } else if (((InterfaceC57956Pn2) ((C51748MtX) abstractC155316yK.getItem(i)).A01).CBf() == CBf) {
                                Integer valueOf = Integer.valueOf(i);
                                if (valueOf != null) {
                                    int intValue = valueOf.intValue();
                                    RecyclerView recyclerView2 = n6t.A00;
                                    if (recyclerView2 != null) {
                                        recyclerView2.post(new RunnableC57002PQs(n6t, intValue));
                                        break;
                                    }
                                }
                            } else {
                                i++;
                            }
                        }
                    }
                }
                break;
            case 49:
                ((IgdsButton) this.A02).setStyle((EnumC99704do) this.A01);
                break;
            default:
                InterfaceC16820sZ interfaceC16820sZ3 = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ3 == null || (invoke3 = interfaceC16820sZ3.invoke()) == null) {
                    InterfaceC018407e A0i = AbstractC25228BEl.A0i(this.A02);
                    if ((A0i instanceof C07N) && (c07n = (C07N) A0i) != null) {
                        return c07n.getDefaultViewModelCreationExtras();
                    }
                    return C52962bd.A00;
                }
                return invoke3;
        }
        return C0eB.A00;
    }
}
