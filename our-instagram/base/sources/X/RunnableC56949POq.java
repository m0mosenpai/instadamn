package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.POq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56949POq implements Runnable {
    public final /* synthetic */ C53021Nct A00;

    public RunnableC56949POq(C53021Nct c53021Nct) {
        this.A00 = c53021Nct;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SpannableStringBuilder A05;
        InterfaceC16660sJ interfaceC16660sJ;
        C53021Nct c53021Nct = this.A00;
        String str = ((AbstractC55102ObF) c53021Nct).A03;
        if (str != null) {
            PJC pjc = c53021Nct.A0E;
            if (pjc != null) {
                N3J n3j = c53021Nct.A0D;
                String str2 = c53021Nct.A0c.A0C;
                boolean A1a = AbstractC167017dG.A1a(n3j, str);
                pjc.A04 = n3j;
                if (n3j.A0K) {
                    C55085Oah c55085Oah = pjc.A0U;
                    c55085Oah.A06 = n3j.A0C;
                    c55085Oah.A00 = -1L;
                    c55085Oah.A01 = C05F.A01;
                    C19260xA c19260xA = new C19260xA();
                    C19260xA.A00(c19260xA, c55085Oah.A02.userId, "u");
                    C19260xA.A00(c19260xA, AbstractC111324zv.A00(1478), "appID");
                    C19260xA.A00(c19260xA, c55085Oah.A03, "v");
                    C55085Oah.A00(c19260xA, c55085Oah, "CREATE", "INFO", "BROADCASTER");
                }
                if (!pjc.A05.A01()) {
                    String str3 = n3j.A0C;
                    pjc.A09 = str3;
                    pjc.A01 = AbstractC31177DnL.A06();
                    UserSession userSession = pjc.A0R;
                    C147856lA c147856lA = OYB.A02(userSession).A03;
                    c147856lA.A01.A02 = Long.valueOf(pjc.A01);
                    pjc.A0A = str;
                    pjc.A0D = str2;
                    OYB.A02(userSession).A03.A01.A03 = str2;
                    C56806PIx c56806PIx = pjc.A08;
                    if (c56806PIx != null) {
                        long j = n3j.A0B;
                        pjc.A0O.CR9();
                        c56806PIx.A02 = str3;
                        c56806PIx.A0J.invoke(str3, Long.valueOf(j));
                        C147896lL c147896lL = c56806PIx.A0B;
                        c147896lL.A04(str3);
                        c147896lL.A03(c56806PIx.A08, str3);
                        if (C18U.A06(C06090Tz.A05, c56806PIx.A06, 2342166213356039244L)) {
                            PZK.A01(c147896lL, AbstractC141776au.A00(c147896lL), 14, A1a);
                        }
                        c56806PIx.A07.A00.Ebz(new C56793PIk(c56806PIx, str3));
                        C2GS c2gs = c147896lL.A01;
                        AbstractC59962oe abstractC59962oe = c56806PIx.A05;
                        AbstractC37301Gc2.A0w(abstractC59962oe, c2gs, C57755Pji.A02(c56806PIx, 36), 39);
                        AbstractC37301Gc2.A0w(abstractC59962oe, c147896lL.A03, C57755Pji.A02(c56806PIx, 37), 39);
                        c56806PIx.A0F.A03(str3);
                        C54801OJv c54801OJv = c56806PIx.A00;
                        if (c54801OJv != null) {
                            C51723Mt0 c51723Mt0 = new C51723Mt0();
                            Context context = c54801OJv.A08;
                            String str4 = c51723Mt0.A01;
                            String str5 = c51723Mt0.A02;
                            C14360o3.A0B(str4, A1a ? 1 : 0);
                            C14360o3.A0B(str5, 2);
                            Integer A0i = AbstractC003100w.A0i(str5);
                            if (A0i != null && A0i.intValue() != 0) {
                                SpannableStringBuilder append = AbstractC37300Gc1.A01().append((CharSequence) AbstractC31177DnL.A0b(context, str4, 2131965592)).append((CharSequence) " • ");
                                String A0k = AbstractC167017dG.A0k(context.getResources(), AbstractC167017dG.A0K(AbstractC003100w.A0i(str5)), R.plurals.live_user_pay_badges_lowercase);
                                C14360o3.A07(A0k);
                                A05 = append.append((CharSequence) A0k);
                                C14360o3.A0A(A05);
                            } else {
                                A05 = AbstractC31175DnJ.A05(context, 2131965597);
                            }
                            if (!String.valueOf((Object) null).contentEquals(AbstractC166987dD.A19(A05)) && (interfaceC16660sJ = c54801OJv.A0B) != null) {
                                interfaceC16660sJ.invoke(c51723Mt0);
                            }
                        }
                    }
                    pjc.A0W.A02().A0U.Egh(EnumC53165NfK.A04);
                    ((C006802i) AbstractC166987dD.A17(((O93) pjc.A0V.A01.getValue()).A01)).markerEnd(29241390, (short) 2);
                    return;
                }
                return;
            }
            return;
        }
        throw AbstractC166987dD.A14("Broadcast must have an associated mediaId.");
    }
}
