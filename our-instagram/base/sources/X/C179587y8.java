package X;

import android.content.Context;

/* renamed from: X.7y8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C179587y8 extends AbstractC178657wd implements InterfaceC179597y9 {
    public C177487ui A00;
    public final InterfaceC178337w7 A01;
    public volatile C175887s2 A02;
    public volatile InterfaceC178817wt A03;

    /* JADX WARN: Multi-variable type inference failed */
    public static C175887s2 A00(Context context, InterfaceC178407wE interfaceC178407wE, InterfaceC178337w7 interfaceC178337w7, String str) {
        String str2;
        boolean z;
        C175877s1 c175877s1;
        C175867s0 c175867s0 = new C175867s0(interfaceC178407wE);
        if (AbstractC14490oL.A0C(context)) {
            Object obj = new Object();
            z = interfaceC178337w7.CUa(75);
            c175877s1 = obj;
        } else {
            switch (str.hashCode()) {
                case -2109762974:
                    str2 = "ar_ads_camera";
                    break;
                case -1872202802:
                    str2 = "messenger_camera_composer";
                    break;
                case -1860080918:
                    str2 = "inspiration";
                    break;
                case -1344425781:
                    str2 = "inspiration_camera_shortcut";
                    break;
                case -1180487979:
                    str2 = "inspiration_composer";
                    break;
                case -875891333:
                    str2 = "inspiration_other";
                    break;
                case -873570300:
                    str2 = "inspiration_reels";
                    break;
                case -725934347:
                    str2 = "inspiration_composer_comment";
                    break;
                case -656087042:
                    str2 = "inspiration_stories";
                    break;
                case 3628448:
                    if (!str.equals("vros")) {
                        return null;
                    }
                    z = true;
                    c175877s1 = new Object();
                    break;
                case 165128166:
                    str2 = "messenger_camera_chathead";
                    break;
                case 267394712:
                    str2 = "messenger_camera_inbox";
                    break;
                case 287240773:
                    str2 = "msqrd_player_app";
                    break;
                case 628042777:
                    str2 = "messenger_kids";
                    break;
                case 2017524177:
                    str2 = "messenger_camera";
                    break;
                default:
                    return null;
            }
            if (!str.equals(str2)) {
                return null;
            }
            z = false;
            c175877s1 = new Object();
        }
        return new C175887s2(context, c175867s0, interfaceC178407wE, interfaceC178337w7, c175877s1, z);
    }

    @Override // X.AbstractC178227vw
    public final void A09() {
        C178307w4 c178307w4 = InterfaceC178407wE.A00;
        InterfaceC178207vu interfaceC178207vu = ((AbstractC178657wd) this).A00;
        InterfaceC178407wE interfaceC178407wE = (InterfaceC178407wE) interfaceC178207vu.Aq1(c178307w4);
        String str = (String) A0B(C178027vb.A02);
        this.A03 = (InterfaceC178817wt) A0A(InterfaceC178817wt.A01);
        interfaceC178207vu.AqG(AbstractC174817qH.A01);
        this.A02 = A00(interfaceC178207vu.getContext(), interfaceC178407wE, this.A01, str);
    }

    @Override // X.InterfaceC178067vf
    public final C178087vh BKV() {
        return InterfaceC179597y9.A00;
    }

    public C179587y8(InterfaceC178207vu interfaceC178207vu) {
        super(interfaceC178207vu);
        this.A01 = (InterfaceC178337w7) ((AbstractC178657wd) this).A00.Aq1(InterfaceC178337w7.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:3:0x0009 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A01(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r2 = 1
            r1 = 0
            switch(r0) {
                case -2109762974: goto L34;
                case -1872202802: goto L31;
                case -1860080918: goto L2e;
                case -1344425781: goto L2b;
                case -1180487979: goto L28;
                case -875891333: goto L25;
                case -873570300: goto L22;
                case -817936692: goto L1f;
                case -725934347: goto L1c;
                case -656087042: goto L19;
                case 17032470: goto L16;
                case 165128166: goto L13;
                case 267394712: goto L10;
                case 1268202694: goto Ld;
                case 2017524177: goto La;
                default: goto L9;
            }
        L9:
            return r1
        La:
            java.lang.String r0 = "messenger_camera"
            goto L36
        Ld:
            java.lang.String r0 = "instagram_stories"
            goto L36
        L10:
            java.lang.String r0 = "messenger_camera_inbox"
            goto L36
        L13:
            java.lang.String r0 = "messenger_camera_chathead"
            goto L36
        L16:
            java.lang.String r0 = "instagram_direct"
            goto L36
        L19:
            java.lang.String r0 = "inspiration_stories"
            goto L36
        L1c:
            java.lang.String r0 = "inspiration_composer_comment"
            goto L36
        L1f:
            java.lang.String r0 = "instagram_reels"
            goto L36
        L22:
            java.lang.String r0 = "inspiration_reels"
            goto L36
        L25:
            java.lang.String r0 = "inspiration_other"
            goto L36
        L28:
            java.lang.String r0 = "inspiration_composer"
            goto L36
        L2b:
            java.lang.String r0 = "inspiration_camera_shortcut"
            goto L36
        L2e:
            java.lang.String r0 = "inspiration"
            goto L36
        L31:
            java.lang.String r0 = "messenger_camera_composer"
            goto L36
        L34:
            java.lang.String r0 = "ar_ads_camera"
        L36:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L9
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C179587y8.A01(java.lang.String):boolean");
    }
}
