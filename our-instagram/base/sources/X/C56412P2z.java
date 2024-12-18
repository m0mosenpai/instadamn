package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.album.AlbumPostCapCropToggleButton;

/* renamed from: X.P2z, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56412P2z implements InterfaceC199918sv {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C56412P2z(AbstractC51356MmH abstractC51356MmH, AbstractC51174MjI abstractC51174MjI, int i) {
        this.A00 = i;
        if (1 - i != 0) {
            this.A02 = abstractC51174MjI;
            this.A01 = abstractC51356MmH;
        } else {
            this.A01 = abstractC51356MmH;
            this.A02 = abstractC51174MjI;
        }
    }

    @Override // X.InterfaceC199918sv
    public final void onClick() {
        C193328hC A0I;
        boolean z;
        AbstractC51356MmH abstractC51356MmH;
        String str;
        switch (this.A00) {
            case 0:
                InterfaceC16660sJ interfaceC16660sJ = ((AlbumPostCapCropToggleButton) this.A02).A01;
                if (interfaceC16660sJ == null) {
                    return;
                }
                interfaceC16660sJ.invoke(this.A01);
                return;
            case 1:
                abstractC51356MmH = (AbstractC51356MmH) this.A01;
                if (abstractC51356MmH.A00.A00()) {
                    UserSession userSession = ((AbstractC51174MjI) this.A02).A07;
                    C22C A01 = AnonymousClass229.A01(userSession);
                    String str2 = abstractC51356MmH.A00.A09;
                    C447924j c447924j = A01.A06;
                    C25531Mh A07 = C25531Mh.A07(c447924j.A01);
                    if (AbstractC25226BEj.A1Z(A07)) {
                        C25531Mh A00 = C447924j.A00(A07, c447924j, "DUPLICATE_CLICK");
                        A00.A0T();
                        A00.A0R("composition_str_id", str2);
                        A00.A0s("IG_CAMERA_DRAFT_DUPLICATE_CLICK");
                        A00.Cht();
                    }
                    C183348Bh A002 = AbstractC183338Bg.A00(userSession);
                    A002.A03 = A002.A0K.A02(42152557, A002.A03);
                }
                N5T n5t = ((AbstractC51174MjI) this.A02).A09;
                C9J0 c9j0 = abstractC51356MmH.A00;
                String str3 = c9j0.A09;
                String str4 = c9j0.A0D;
                C14360o3.A0B(str3, 0);
                AbstractC166987dD.A1Z(new MBX(n5t, str3, str4, (InterfaceC23621Ds) null, 23), C07Y.A00(n5t));
                abstractC51356MmH.A08.dismiss();
                return;
            case 2:
                AbstractC51174MjI abstractC51174MjI = (AbstractC51174MjI) this.A02;
                C31349DqE c31349DqE = abstractC51174MjI.A02;
                if (c31349DqE != null) {
                    AbstractC31177DnL.A1L(c31349DqE);
                    abstractC51174MjI.A02 = null;
                }
                C9J0 c9j02 = ((AbstractC51356MmH) this.A01).A00;
                if (!AbstractC31172DnG.A1a(AbstractC166987dD.A0x(abstractC51174MjI.A07), "has_seen_share_to_direct_dialog_from_draft")) {
                    A0I = AbstractC31171DnF.A0I(abstractC51174MjI.A04);
                    A0I.A0A(2131955814);
                    A0I.A09(2131955813);
                    A0I.A0F(DialogInterfaceOnClickListenerC55321Ogj.A00(c9j02, abstractC51174MjI, 62));
                    A0I.A0D(DialogInterfaceOnClickListenerC55316Oge.A00);
                    DialogInterfaceOnDismissListenerC55324Ogm.A00(A0I, abstractC51174MjI, 21);
                    z = true;
                    break;
                } else {
                    abstractC51174MjI.A09.A06(c9j02);
                    return;
                }
            case 3:
                AbstractC51174MjI abstractC51174MjI2 = (AbstractC51174MjI) this.A02;
                C9J0 c9j03 = ((AbstractC51356MmH) this.A01).A00;
                UserSession userSession2 = abstractC51174MjI2.A07;
                if (C151866sW.A06(userSession2) && abstractC51174MjI2.A00 >= AbstractC25225BEi.A07(C06090Tz.A05, userSession2, 36597296070396702L)) {
                    Context context = abstractC51174MjI2.A04;
                    A0I = AbstractC31171DnF.A0I(context);
                    z = true;
                    AbstractC31177DnL.A0v(context, A0I, Integer.valueOf(abstractC51174MjI2.A00), 2131956757);
                    A0I.A0F(DialogInterfaceOnClickListenerC55315Ogd.A00);
                    break;
                } else {
                    ((OXR) abstractC51174MjI2.A0C.getValue()).A02(EnumC50628MWp.A06);
                    DialogC50731MaZ dialogC50731MaZ = new DialogC50731MaZ(abstractC51174MjI2.A04);
                    dialogC50731MaZ.setCancelable(false);
                    C0fJ.A00(dialogC50731MaZ);
                    C30486DbV c30486DbV = new C30486DbV(19, dialogC50731MaZ, abstractC51174MjI2);
                    AbstractC166987dD.A1Z(new C57159PZd(c30486DbV, c9j03, abstractC51174MjI2, null, 12), AbstractC25229BEm.A0a(abstractC51174MjI2.A09.getViewLifecycleOwner()));
                    return;
                }
                break;
            case 4:
                AbstractC51174MjI abstractC51174MjI3 = (AbstractC51174MjI) this.A02;
                C31349DqE c31349DqE2 = abstractC51174MjI3.A02;
                if (c31349DqE2 != null) {
                    AbstractC31177DnL.A1L(c31349DqE2);
                    abstractC51174MjI3.A02 = null;
                }
                N5T n5t2 = abstractC51174MjI3.A09;
                abstractC51356MmH = (AbstractC51356MmH) this.A01;
                C9J0 c9j04 = abstractC51356MmH.A00;
                String str5 = c9j04.A09;
                boolean z2 = c9j04.A0G;
                C447924j c447924j2 = AnonymousClass229.A01(AbstractC166987dD.A0r(n5t2.A0I)).A06;
                C25531Mh A072 = C25531Mh.A07(c447924j2.A01);
                boolean A1Z = AbstractC25226BEj.A1Z(A072);
                if (z2) {
                    if (A1Z) {
                        str = "UNPIN_CLICK";
                        C25531Mh A003 = C447924j.A00(A072, c447924j2, str);
                        A003.A0T();
                        A003.A0R("composition_str_id", str5);
                        A003.Cht();
                    }
                    AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(n5t2.A0E);
                    C50270MHz c50270MHz = new C50270MHz(str5, n5t2, 8);
                    AbstractC23641Du.A05(MSX.A0J(C12L.A00, 603422383), new MCM(A0Z, c9j04, c50270MHz, null, 1), AbstractC141776au.A00(A0Z));
                } else {
                    if (A1Z) {
                        str = "PIN_CLICK";
                        C25531Mh A0032 = C447924j.A00(A072, c447924j2, str);
                        A0032.A0T();
                        A0032.A0R("composition_str_id", str5);
                        A0032.Cht();
                    }
                    AbstractC52922bZ A0Z2 = AbstractC25225BEi.A0Z(n5t2.A0E);
                    C50270MHz c50270MHz2 = new C50270MHz(str5, n5t2, 8);
                    AbstractC23641Du.A05(MSX.A0J(C12L.A00, 603422383), new MCM(A0Z2, c9j04, c50270MHz2, null, 1), AbstractC141776au.A00(A0Z2));
                }
                abstractC51356MmH.A08.dismiss();
                return;
            case 5:
                AbstractC51174MjI abstractC51174MjI4 = (AbstractC51174MjI) this.A02;
                C31349DqE c31349DqE3 = abstractC51174MjI4.A02;
                if (c31349DqE3 != null) {
                    AbstractC31177DnL.A1L(c31349DqE3);
                    abstractC51174MjI4.A02 = null;
                }
                N5T n5t3 = abstractC51174MjI4.A09;
                abstractC51356MmH = (AbstractC51356MmH) this.A01;
                C9J0 c9j05 = abstractC51356MmH.A00;
                String str6 = c9j05.A0B;
                boolean z3 = n5t3.A04;
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putString("args_draft_name", str6);
                A0b.putBoolean("args_clips_drafts_fragment_should_use_dark_mode", z3);
                N52 n52 = new N52();
                n52.setArguments(A0b);
                n52.A00 = new C55874OrO(c9j05, n5t3);
                InterfaceC09390do interfaceC09390do = n5t3.A0I;
                C189448aO A0y = AbstractC25225BEi.A0y(AbstractC166987dD.A0r(interfaceC09390do));
                EnumC60792q3 enumC60792q3 = n5t3.dayNightMode;
                C14360o3.A0B(enumC60792q3, 0);
                A0y.A0O = enumC60792q3;
                AbstractC31177DnL.A14(n5t3, n52, A0y);
                AnonymousClass229.A01(AbstractC166987dD.A0r(interfaceC09390do)).A1q(c9j05.A09);
                abstractC51356MmH.A08.dismiss();
                return;
            default:
                AbstractC51174MjI abstractC51174MjI5 = (AbstractC51174MjI) this.A02;
                N5T n5t4 = abstractC51174MjI5.A09;
                abstractC51356MmH = (AbstractC51356MmH) this.A01;
                C9J0 c9j06 = abstractC51356MmH.A00;
                boolean A0C = C1LE.A0C(abstractC51174MjI5.A07);
                boolean z4 = ((C53073Ndm) abstractC51174MjI5).A0H;
                OyX oyX = new OyX(c9j06, n5t4);
                if (A0C) {
                    C193328hC A0I2 = AbstractC31171DnF.A0I(n5t4.requireContext());
                    A0I2.A0A(2131955812);
                    A0I2.A09(2131955811);
                    A0I2.A0G(DialogInterfaceOnClickListenerC55319Ogh.A00(oyX, 32));
                    A0I2.A0P(null, EnumC193348hE.A04, 2131954754);
                    A0I2.A0s(true);
                    AbstractC166987dD.A1W(A0I2);
                } else if (z4) {
                    Context themedContext = n5t4.getThemedContext();
                    UserSession A0r = AbstractC166987dD.A0r(n5t4.A0I);
                    boolean z5 = n5t4.A04;
                    C14360o3.A0B(themedContext, 0);
                    C14360o3.A0B(A0r, 1);
                    C50674MYs c50674MYs = new C50674MYs(themedContext, A0r);
                    c50674MYs.A07(themedContext.getResources().getQuantityString(R.plurals.story_drafts_confirmation_title, 1));
                    c50674MYs.A09(AbstractC166997dE.A0q(themedContext.getResources(), 2131974605), ViewOnClickListenerC55457OkB.A00(oyX, 23));
                    c50674MYs.A03(ViewOnClickListenerC55443Ojs.A00, 2131954754);
                    if (z5) {
                        EnumC60792q3 enumC60792q32 = EnumC60792q3.A03;
                        C14360o3.A0B(enumC60792q32, 0);
                        c50674MYs.A02 = enumC60792q32;
                    }
                    C31727DwY.A01(themedContext, c50674MYs);
                } else {
                    AbstractC53899NsV.A00(n5t4.requireContext(), oyX, 1);
                }
                abstractC51356MmH.A08.dismiss();
                return;
        }
        A0I.A0s(z);
        AbstractC166987dD.A1W(A0I);
    }

    public C56412P2z(AlbumPostCapCropToggleButton albumPostCapCropToggleButton, C5L6 c5l6) {
        this.A00 = 0;
        this.A02 = albumPostCapCropToggleButton;
        this.A01 = c5l6;
    }
}
