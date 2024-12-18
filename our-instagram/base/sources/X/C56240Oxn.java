package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.filterview.FilterViewContainer;
import java.util.HashMap;

/* renamed from: X.Oxn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56240Oxn implements InterfaceC58110PpZ {
    public final FilterViewContainer A00;
    public final Integer A01;
    public final /* synthetic */ C50724MaP A02;

    @Override // X.InterfaceC58110PpZ
    public final void DtC(C47283Kuu c47283Kuu) {
    }

    @Override // X.InterfaceC58110PpZ
    public final void DtD(C44428Jkf c44428Jkf) {
        C14360o3.A0B(c44428Jkf, 0);
        InterfaceC50490MQs interfaceC50490MQs = c44428Jkf.A05.A01;
        C14360o3.A07(interfaceC50490MQs);
        InterfaceC58189Pqv Arg = interfaceC50490MQs.Arg();
        if (Arg != null && Arg.COQ(c44428Jkf, C50724MaP.A01(this.A02).A03())) {
            DtE(c44428Jkf, false);
        }
    }

    @Override // X.InterfaceC58110PpZ
    public final void DtE(C44428Jkf c44428Jkf, boolean z) {
        String name;
        C81X c81x;
        HashMap A1G;
        UserSession A0r;
        EnumC69993Ci enumC69993Ci;
        String str;
        String str2;
        C22C A01;
        EnumC50631MWs enumC50631MWs;
        String str3;
        C14360o3.A0B(c44428Jkf, 0);
        C44437Jky c44437Jky = c44428Jkf.A05;
        InterfaceC50490MQs interfaceC50490MQs = c44437Jky.A01;
        C14360o3.A07(interfaceC50490MQs);
        InterfaceC58189Pqv Arg = interfaceC50490MQs.Arg();
        if (Arg != null) {
            Integer num = this.A01;
            Integer num2 = C05F.A00;
            if (num == num2) {
                C50725MaQ A012 = C50724MaP.A01(this.A02);
                InterfaceC50490MQs interfaceC50490MQs2 = c44437Jky.A01;
                C14360o3.A07(interfaceC50490MQs2);
                if (A012.A01 == null) {
                    A012.A01 = interfaceC50490MQs2;
                }
                A012.A02 = interfaceC50490MQs2;
            }
            C50724MaP c50724MaP = this.A02;
            boolean A09 = C50724MaP.A09(c44428Jkf, Arg, this.A00, c50724MaP, z);
            if (z) {
                InterfaceC50490MQs interfaceC50490MQs3 = c44437Jky.A01;
                C14360o3.A07(interfaceC50490MQs3);
                if (num == num2) {
                    if (A09) {
                        AnonymousClass841 anonymousClass841 = c50724MaP.A0G;
                        if (anonymousClass841 != null) {
                            boolean CPp = anonymousClass841.CPp();
                            A01 = AnonymousClass229.A01(AbstractC166987dD.A0r(c50724MaP.A0i));
                            if (CPp) {
                                A01.A1A(AnonymousClass249.PHOTO);
                                return;
                            } else {
                                if (A01.A0J() == null) {
                                    return;
                                }
                                enumC50631MWs = EnumC50631MWs.A0I;
                                str3 = "FEED_COLOR_FILTER_STRENGTH_TAP";
                                C22C.A08(enumC50631MWs, A01, str3, false);
                                return;
                            }
                        }
                        C14360o3.A0F("creationCameraSession");
                        throw C00O.createAndThrow();
                    }
                    name = interfaceC50490MQs3.getName();
                    C14360o3.A07(name);
                    InterfaceC09390do interfaceC09390do = c50724MaP.A0i;
                    AbstractC53887NsJ.A00(AbstractC166987dD.A0r(interfaceC09390do)).A00(name, true);
                    C22C A013 = AnonymousClass229.A01(AbstractC166987dD.A0r(interfaceC09390do));
                    int BF3 = interfaceC50490MQs3.BF3();
                    int A00 = AbstractC53889NsL.A00(c50724MaP.A0V, BF3);
                    if (A013.A0J() != null) {
                        A013.A1B(AnonymousClass249.PHOTO, EnumC50631MWs.A0I, BF3, A00);
                    }
                    if (C3CZ.A0B == null) {
                        return;
                    }
                    C3CZ.A0D = name;
                    A1G = AbstractC166987dD.A1G();
                    A1G.put(AbstractC111324zv.A00(941), name);
                    A0r = AbstractC166987dD.A0r(interfaceC09390do);
                    enumC69993Ci = C3CZ.A0B;
                    String str4 = AbstractC166987dD.A0r(interfaceC09390do).userId;
                    C14360o3.A0B(str4, 0);
                    AbstractC003100w.A0k(10, str4);
                    str = C3CZ.A0C;
                    str2 = "profile_picture_filter_clicked";
                    AbstractC31719DwO.A00(enumC69993Ci, A0r, str2, AbstractC43591JPw.A00(445), str, name, A1G);
                }
                if (num != C05F.A01 || !A09) {
                    return;
                }
                if (interfaceC50490MQs3.Arg() instanceof C56230Oxd) {
                    AnonymousClass841 anonymousClass8412 = c50724MaP.A0G;
                    if (anonymousClass8412 != null) {
                        boolean CPp2 = anonymousClass8412.CPp();
                        A01 = AnonymousClass229.A01(AbstractC166987dD.A0r(c50724MaP.A0i));
                        EnumC114925Hg A0J = A01.A0J();
                        if (CPp2) {
                            if (A0J == null) {
                                return;
                            }
                            enumC50631MWs = EnumC50631MWs.A0I;
                            str3 = "FEED_LUX_CAROUSEL_TAP";
                        } else {
                            if (A0J == null) {
                                return;
                            }
                            enumC50631MWs = EnumC50631MWs.A0I;
                            str3 = "FEED_LUX_TAP";
                        }
                        C22C.A08(enumC50631MWs, A01, str3, false);
                        return;
                    }
                    C14360o3.A0F("creationCameraSession");
                    throw C00O.createAndThrow();
                }
                if (C3CZ.A0B == null) {
                    return;
                }
                name = interfaceC50490MQs3.getName();
                C14360o3.A07(name);
                C50725MaQ A014 = C50724MaP.A01(c50724MaP);
                switch (name.hashCode()) {
                    case -2146480813:
                        if (name.equals("Structure")) {
                            c81x = C81X.A2Z;
                            MYZ A015 = MX1.A01(A014.A09);
                            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A015.A0D, "ig_camera_ui_tool_click");
                            MSW.A1N(c81x, A0f);
                            MSX.A1E(A0f);
                            AbstractC166987dD.A1S(A0f, AbstractC193278h7.A00(A015.A0E).A00());
                            AbstractC31175DnJ.A14(A0f, A015.A0C);
                            MSX.A1C(A0f);
                            A0f.Cht();
                            break;
                        }
                        break;
                    case -1944197537:
                        if (name.equals("Highlights")) {
                            c81x = C81X.A1A;
                            MYZ A0152 = MX1.A01(A014.A09);
                            InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(A0152.A0D, "ig_camera_ui_tool_click");
                            MSW.A1N(c81x, A0f2);
                            MSX.A1E(A0f2);
                            AbstractC166987dD.A1S(A0f2, AbstractC193278h7.A00(A0152.A0E).A00());
                            AbstractC31175DnJ.A14(A0f2, A0152.A0C);
                            MSX.A1C(A0f2);
                            A0f2.Cht();
                            break;
                        }
                        break;
                    case -1711144999:
                        if (name.equals("Warmth")) {
                            c81x = C81X.A2g;
                            MYZ A01522 = MX1.A01(A014.A09);
                            InterfaceC02590Ai A0f22 = AbstractC166987dD.A0f(A01522.A0D, "ig_camera_ui_tool_click");
                            MSW.A1N(c81x, A0f22);
                            MSX.A1E(A0f22);
                            AbstractC166987dD.A1S(A0f22, AbstractC193278h7.A00(A01522.A0E).A00());
                            AbstractC31175DnJ.A14(A0f22, A01522.A0C);
                            MSX.A1C(A0f22);
                            A0f22.Cht();
                            break;
                        }
                        break;
                    case -1653340047:
                        if (name.equals("Brightness")) {
                            c81x = C81X.A0V;
                            MYZ A015222 = MX1.A01(A014.A09);
                            InterfaceC02590Ai A0f222 = AbstractC166987dD.A0f(A015222.A0D, "ig_camera_ui_tool_click");
                            MSW.A1N(c81x, A0f222);
                            MSX.A1E(A0f222);
                            AbstractC166987dD.A1S(A0f222, AbstractC193278h7.A00(A015222.A0E).A00());
                            AbstractC31175DnJ.A14(A0f222, A015222.A0C);
                            MSX.A1C(A0f222);
                            A0f222.Cht();
                            break;
                        }
                        break;
                    case -576502989:
                        if (name.equals("Shadows")) {
                            c81x = C81X.A2D;
                            MYZ A0152222 = MX1.A01(A014.A09);
                            InterfaceC02590Ai A0f2222 = AbstractC166987dD.A0f(A0152222.A0D, "ig_camera_ui_tool_click");
                            MSW.A1N(c81x, A0f2222);
                            MSX.A1E(A0f2222);
                            AbstractC166987dD.A1S(A0f2222, AbstractC193278h7.A00(A0152222.A0E).A00());
                            AbstractC31175DnJ.A14(A0f2222, A0152222.A0C);
                            MSX.A1C(A0f2222);
                            A0f2222.Cht();
                            break;
                        }
                        break;
                    case -576085517:
                        if (name.equals("Sharpen")) {
                            c81x = C81X.A2I;
                            MYZ A01522222 = MX1.A01(A014.A09);
                            InterfaceC02590Ai A0f22222 = AbstractC166987dD.A0f(A01522222.A0D, "ig_camera_ui_tool_click");
                            MSW.A1N(c81x, A0f22222);
                            MSX.A1E(A0f22222);
                            AbstractC166987dD.A1S(A0f22222, AbstractC193278h7.A00(A01522222.A0E).A00());
                            AbstractC31175DnJ.A14(A0f22222, A01522222.A0C);
                            MSX.A1C(A0f22222);
                            A0f22222.Cht();
                            break;
                        }
                        break;
                    case -502302942:
                        if (name.equals("Contrast")) {
                            c81x = C81X.A0j;
                            MYZ A015222222 = MX1.A01(A014.A09);
                            InterfaceC02590Ai A0f222222 = AbstractC166987dD.A0f(A015222222.A0D, "ig_camera_ui_tool_click");
                            MSW.A1N(c81x, A0f222222);
                            MSX.A1E(A0f222222);
                            AbstractC166987dD.A1S(A0f222222, AbstractC193278h7.A00(A015222222.A0E).A00());
                            AbstractC31175DnJ.A14(A0f222222, A015222222.A0C);
                            MSX.A1C(A0f222222);
                            A0f222222.Cht();
                            break;
                        }
                        break;
                    case -19268257:
                        if (name.equals("Tilt Shift")) {
                            c81x = C81X.A2w;
                            MYZ A0152222222 = MX1.A01(A014.A09);
                            InterfaceC02590Ai A0f2222222 = AbstractC166987dD.A0f(A0152222222.A0D, "ig_camera_ui_tool_click");
                            MSW.A1N(c81x, A0f2222222);
                            MSX.A1E(A0f2222222);
                            AbstractC166987dD.A1S(A0f2222222, AbstractC193278h7.A00(A0152222222.A0E).A00());
                            AbstractC31175DnJ.A14(A0f2222222, A0152222222.A0C);
                            MSX.A1C(A0f2222222);
                            A0f2222222.Cht();
                            break;
                        }
                        break;
                    case 2181788:
                        if (name.equals("Fade")) {
                            c81x = C81X.A0z;
                            MYZ A01522222222 = MX1.A01(A014.A09);
                            InterfaceC02590Ai A0f22222222 = AbstractC166987dD.A0f(A01522222222.A0D, "ig_camera_ui_tool_click");
                            MSW.A1N(c81x, A0f22222222);
                            MSX.A1E(A0f22222222);
                            AbstractC166987dD.A1S(A0f22222222, AbstractC193278h7.A00(A01522222222.A0E).A00());
                            AbstractC31175DnJ.A14(A0f22222222, A01522222222.A0C);
                            MSX.A1C(A0f22222222);
                            A0f22222222.Cht();
                            break;
                        }
                        break;
                    case 65290051:
                        if (name.equals("Color")) {
                            c81x = C81X.A0c;
                            MYZ A015222222222 = MX1.A01(A014.A09);
                            InterfaceC02590Ai A0f222222222 = AbstractC166987dD.A0f(A015222222222.A0D, "ig_camera_ui_tool_click");
                            MSW.A1N(c81x, A0f222222222);
                            MSX.A1E(A0f222222222);
                            AbstractC166987dD.A1S(A0f222222222, AbstractC193278h7.A00(A015222222222.A0E).A00());
                            AbstractC31175DnJ.A14(A0f222222222, A015222222222.A0C);
                            MSX.A1C(A0f222222222);
                            A0f222222222.Cht();
                            break;
                        }
                        break;
                    case 1309953370:
                        if (name.equals("Vignette")) {
                            c81x = C81X.A37;
                            MYZ A0152222222222 = MX1.A01(A014.A09);
                            InterfaceC02590Ai A0f2222222222 = AbstractC166987dD.A0f(A0152222222222.A0D, "ig_camera_ui_tool_click");
                            MSW.A1N(c81x, A0f2222222222);
                            MSX.A1E(A0f2222222222);
                            AbstractC166987dD.A1S(A0f2222222222, AbstractC193278h7.A00(A0152222222222.A0E).A00());
                            AbstractC31175DnJ.A14(A0f2222222222, A0152222222222.A0C);
                            MSX.A1C(A0f2222222222);
                            A0f2222222222.Cht();
                            break;
                        }
                        break;
                    case 1762973682:
                        if (name.equals("Saturation")) {
                            c81x = C81X.A20;
                            MYZ A01522222222222 = MX1.A01(A014.A09);
                            InterfaceC02590Ai A0f22222222222 = AbstractC166987dD.A0f(A01522222222222.A0D, "ig_camera_ui_tool_click");
                            MSW.A1N(c81x, A0f22222222222);
                            MSX.A1E(A0f22222222222);
                            AbstractC166987dD.A1S(A0f22222222222, AbstractC193278h7.A00(A01522222222222.A0E).A00());
                            AbstractC31175DnJ.A14(A0f22222222222, A01522222222222.A0C);
                            MSX.A1C(A0f22222222222);
                            A0f22222222222.Cht();
                            break;
                        }
                        break;
                    case 1956520879:
                        if (name.equals("Adjust")) {
                            c81x = C81X.A09;
                            MYZ A015222222222222 = MX1.A01(A014.A09);
                            InterfaceC02590Ai A0f222222222222 = AbstractC166987dD.A0f(A015222222222222.A0D, "ig_camera_ui_tool_click");
                            MSW.A1N(c81x, A0f222222222222);
                            MSX.A1E(A0f222222222222);
                            AbstractC166987dD.A1S(A0f222222222222, AbstractC193278h7.A00(A015222222222222.A0E).A00());
                            AbstractC31175DnJ.A14(A0f222222222222, A015222222222222.A0C);
                            MSX.A1C(A0f222222222222);
                            A0f222222222222.Cht();
                            break;
                        }
                        break;
                }
                C3CZ.A0E = name;
                A1G = AbstractC166987dD.A1G();
                A1G.put("tool_name", name);
                InterfaceC09390do interfaceC09390do2 = c50724MaP.A0i;
                A0r = AbstractC166987dD.A0r(interfaceC09390do2);
                enumC69993Ci = C3CZ.A0B;
                String str5 = AbstractC166987dD.A0r(interfaceC09390do2).userId;
                C14360o3.A0B(str5, 0);
                AbstractC003100w.A0k(10, str5);
                str = C3CZ.A0C;
                str2 = "profile_picture_tool_clicked";
                AbstractC31719DwO.A00(enumC69993Ci, A0r, str2, AbstractC43591JPw.A00(445), str, name, A1G);
            }
        }
    }

    public C56240Oxn(FilterViewContainer filterViewContainer, C50724MaP c50724MaP, Integer num) {
        this.A02 = c50724MaP;
        this.A00 = filterViewContainer;
        this.A01 = num;
    }
}
