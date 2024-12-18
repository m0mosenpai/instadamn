package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.Fk6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35449Fk6 implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public DialogInterfaceOnClickListenerC35449Fk6(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.A00 = i;
        this.A06 = obj5;
        this.A05 = obj2;
        this.A01 = obj4;
        this.A04 = obj;
        this.A07 = obj7;
        this.A02 = obj3;
        this.A03 = obj6;
    }

    public static ArrayList A00(DialogInterfaceOnClickListenerC35449Fk6 dialogInterfaceOnClickListenerC35449Fk6) {
        return new ArrayList(((Map) dialogInterfaceOnClickListenerC35449Fk6.A05).keySet());
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C31663DvT c31663DvT;
        Map map;
        int i2;
        if (this.A00 != 0) {
            C36554GAd c36554GAd = (C36554GAd) this.A06;
            C1Q9 c1q9 = C1Q9.A1Z;
            EKF ekf = c36554GAd.A01;
            C19280xC A00 = C35230FgN.A00(ekf, c1q9);
            A00.A0C("autocomplete_account_type", c36554GAd.A00.AY9());
            AbstractC31173DnH.A1S(A00, ekf.A05);
            FP3 fp3 = FP3.A00;
            C07270a1 c07270a1 = (C07270a1) this.A05;
            InterfaceC37225Gaa interfaceC37225Gaa = (InterfaceC37225Gaa) this.A01;
            fp3.A00((AbstractC59962oe) this.A04, c07270a1, (InterfaceC37227Gac) this.A02, interfaceC37225Gaa, (C36554GAd) this.A03, (EnumC31713DwI) this.A07);
            return;
        }
        C31664DvU c31664DvU = (C31664DvU) this.A07;
        UserSession userSession = (UserSession) this.A06;
        InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A01;
        AbstractC46972Dl abstractC46972Dl = (AbstractC46972Dl) this.A04;
        Context context = c31664DvU.A00;
        AbstractC31171DnF.A1O(context);
        if (C35244Fgd.A03((Activity) context, context, interfaceC11380iw, userSession, abstractC46972Dl, -1, false)) {
            AbstractC166987dD.A1Y(this.A03);
        }
        int A01 = AbstractC31176DnK.A01((List) this.A02, i);
        if (A01 != 3) {
            if (A01 != 4) {
                if (A01 != 5) {
                    if (A01 != 6) {
                        if (A01 != 8) {
                            if (A01 != 13) {
                                if (A01 != 15) {
                                    if (A01 != 45) {
                                        if (A01 != 10) {
                                            if (A01 != 11) {
                                                if (A01 != 30) {
                                                    if (A01 == 31) {
                                                        c31664DvU.A03.F9P(A00(this));
                                                    } else {
                                                        throw AbstractC166987dD.A14("Unsupported dialog option for dialog listener");
                                                    }
                                                } else {
                                                    c31664DvU.A03.CqI(A00(this));
                                                }
                                            } else {
                                                c31664DvU.A03.F9A((Map) this.A05);
                                            }
                                        } else {
                                            c31664DvU.A03.CqN(A00(this));
                                        }
                                    } else {
                                        Map map2 = (Map) this.A05;
                                        InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A03;
                                        AbstractC31171DnF.A1P(context);
                                        FVA.A01((FragmentActivity) context, userSession, abstractC46972Dl, new C36471G6v(c31664DvU, map2, interfaceC16820sZ, 1));
                                        return;
                                    }
                                } else {
                                    c31664DvU.A03.F9S(A00(this));
                                }
                            } else {
                                c31664DvU.A03.F9N(A00(this));
                            }
                        } else {
                            c31664DvU.A03.CqF(A00(this));
                        }
                    } else {
                        c31663DvT = c31664DvU.A03;
                        map = (Map) this.A05;
                        i2 = 0;
                    }
                } else {
                    c31663DvT = c31664DvU.A03;
                    map = (Map) this.A05;
                    i2 = 1;
                }
                c31663DvT.Cpw(new C32071E6x(i2), map);
            } else {
                c31664DvU.A03.CnJ((Map) this.A05);
            }
        } else {
            c31664DvU.A03.AVz((Map) this.A05);
        }
        AbstractC166987dD.A1Y(this.A03);
    }
}
