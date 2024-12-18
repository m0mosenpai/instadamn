package X;

import android.content.Context;
import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.model.comments.ParcelableCommenterDetails;
import com.instagram.user.model.User;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.V2g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67916V2g extends C7E1 {
    public boolean A01;
    public boolean A02;
    public final V35 A03;
    public final UserSession A04;
    public final InterfaceC169497hP A06;
    public final C195218kN A0A;
    public final Context A0F;
    public final V3I A0G;
    public final C31545DtV A0H;
    public final ERQ A0I;
    public final C31699Dw4 A08 = new C31699Dw4();
    public final C34707FQs A09 = new Object();
    public final InterfaceC169497hP A07 = new C169487hO();
    public final java.util.Set A0C = new HashSet();
    public final java.util.Set A0D = new HashSet();
    public final java.util.Set A0B = new HashSet();
    public final java.util.Set A0E = new HashSet();
    public final C71198Wpn A05 = new C71198Wpn();
    public boolean A00 = true;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.FQs] */
    public C67916V2g(Context context, C67893V1b c67893V1b, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC169497hP interfaceC169497hP, ArrayList arrayList) {
        Integer num;
        this.A0F = context;
        this.A04 = userSession;
        this.A0A = C195218kN.A00(userSession);
        this.A06 = interfaceC169497hP;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ParcelableCommenterDetails parcelableCommenterDetails = (ParcelableCommenterDetails) it.next();
            java.util.Set set = this.A0B;
            Parcelable.Creator creator = User.CREATOR;
            User user = new User(new BigDecimal(parcelableCommenterDetails.A00).toPlainString(), parcelableCommenterDetails.A04);
            user.A1C(parcelableCommenterDetails.A06);
            if (parcelableCommenterDetails.A05) {
                num = C05F.A0C;
            } else {
                num = C05F.A01;
            }
            user.A0n(num);
            user.A0q(parcelableCommenterDetails.A01);
            user.A0r(parcelableCommenterDetails.A03);
            user.A03.Ebj(parcelableCommenterDetails.A02);
            set.add(new C65741TtG(user));
        }
        Context context2 = this.A0F;
        C31545DtV c31545DtV = new C31545DtV(context2);
        this.A0H = c31545DtV;
        V3I v3i = new V3I(context2);
        this.A0G = v3i;
        V35 v35 = new V35(context2, c67893V1b, interfaceC11380iw, userSession);
        this.A03 = v35;
        ERQ erq = new ERQ(context2, c67893V1b);
        this.A0I = erq;
        A0B(c31545DtV, v3i, v35, erq);
    }

    private void A00(java.util.Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            C65741TtG c65741TtG = (C65741TtG) it.next();
            C65954Twz c65954Twz = new C65954Twz();
            c65954Twz.A01 = i;
            c65954Twz.A00 = i;
            c65954Twz.A0D = this.A0B.contains(c65741TtG);
            Tx0 tx0 = new Tx0(c65954Twz);
            A09(this.A03, c65741TtG.A06(), tx0);
            i++;
        }
    }

    public final void A0C() {
        String string;
        InterfaceC65642y0 interfaceC65642y0;
        A06();
        if (this.A00) {
            java.util.Set set = this.A0B;
            if (set.isEmpty() && this.A0E.isEmpty()) {
                string = null;
                interfaceC65642y0 = this.A0G;
                A08(interfaceC65642y0, string);
            } else {
                A00(set);
                A00(this.A0E);
            }
        } else if (this.A01 && this.A05.A00.isEmpty()) {
            string = this.A0F.getString(2131968660);
            interfaceC65642y0 = this.A0H;
            A08(interfaceC65642y0, string);
        } else {
            C71198Wpn c71198Wpn = this.A05;
            int i = 0;
            while (true) {
                List list = c71198Wpn.A00;
                if (i >= list.size()) {
                    break;
                }
                C65741TtG c65741TtG = (C65741TtG) ((AbstractC65924TwV) list.get(i));
                C65954Twz c65954Twz = new C65954Twz();
                c65954Twz.A01 = i;
                c65954Twz.A00 = i;
                c65954Twz.A0D = this.A0B.contains(c65741TtG);
                Tx0 tx0 = new Tx0(c65954Twz);
                A09(this.A03, c65741TtG.A06(), tx0);
                i++;
            }
        }
        if (this.A02) {
            A09(this.A0I, this.A08, this.A09);
        }
        A07();
    }
}
