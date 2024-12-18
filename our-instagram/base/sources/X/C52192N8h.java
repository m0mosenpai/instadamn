package X;

import android.content.Context;
import android.widget.ListAdapter;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.N8h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52192N8h extends C7E1 implements ListAdapter, CallerContextable {
    public static final String __redex_internal_original_name = "RecipientSearchAdapter";
    public InterfaceC169517hR A00;
    public N91 A01;
    public final int A02;
    public final UserSession A03;
    public final C54486O5o A04;
    public final C31545DtV A05;
    public final ERQ A06;
    public final C31699Dw4 A07;
    public final C34707FQs A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final Context A0C;
    public final C54408O2o A0D;
    public final C32461ERn A0E;
    public final String A0F;
    public final boolean A0G;

    public static int A00(C52192N8h c52192N8h, List list, int i, int i2, boolean z) {
        int i3 = i2;
        Iterator it = list.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            DirectShareTarget directShareTarget = (DirectShareTarget) it.next();
            UserSession userSession = c52192N8h.A03;
            if (!AbstractC31231DoE.A02(userSession, directShareTarget) && !AbstractC31231DoE.A01(userSession, directShareTarget)) {
                Context context = c52192N8h.A0C;
                int i5 = 2;
                if (c52192N8h.A0G) {
                    i5 = i;
                }
                c52192N8h.A08(c52192N8h.A0E, C36005Fv3.A00(context, userSession, directShareTarget, c52192N8h.A0F, i5, i3, i4, -1, c52192N8h.A0D.A00.A0H.A07(directShareTarget), false, z, false));
                i3++;
                i4++;
            }
        }
        return i3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.FQs] */
    public C52192N8h(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C54404O2k c54404O2k, C54408O2o c54408O2o, DirectPrivateStoryRecipientController directPrivateStoryRecipientController, InterfaceC37209GaK interfaceC37209GaK, InterfaceC58010Pnu interfaceC58010Pnu, String str, boolean z, boolean z2) {
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A0C = context;
        this.A08 = new Object();
        this.A07 = new C31699Dw4();
        this.A09 = context.getString(2131968660);
        this.A02 = context.getColor(R.color.grey_5);
        this.A0A = context.getString(2131973064);
        this.A03 = userSession;
        N91 n91 = new N91(c54404O2k);
        this.A01 = n91;
        A1E.add(n91);
        this.A0G = z;
        this.A0B = z2;
        C32461ERn c32461ERn = new C32461ERn(interfaceC11380iw, userSession, directPrivateStoryRecipientController, interfaceC37209GaK, interfaceC58010Pnu);
        this.A0E = c32461ERn;
        A1E.add(c32461ERn);
        this.A04 = new C54486O5o(context.getString(2131971491));
        C31545DtV c31545DtV = new C31545DtV(context);
        this.A05 = c31545DtV;
        A1E.add(c31545DtV);
        ERQ erq = new ERQ(context, new PI2(this, 0));
        this.A06 = erq;
        A1E.add(erq);
        this.A0D = c54408O2o;
        this.A0F = str;
        A0A(A1E);
    }
}
