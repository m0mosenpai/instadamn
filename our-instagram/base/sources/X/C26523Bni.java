package X;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Bni, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26523Bni extends AbstractC51572Yf {
    public final C120985dq A00;
    public final InterfaceC11380iw A01;
    public final C37577GgY A02;
    public final C2XI A03;
    public final ClipsViewerConfig A04;
    public final C37644Ghd A05;
    public final UserSession A06;
    public final InterfaceC31137Dmc A07;
    public final InterfaceC31048Dkm A08;
    public final HashMap A09;
    public final HashMap A0A;
    public final boolean A0B;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        String str;
        String str2;
        C25622BUk c25622BUk;
        C14360o3.A0B(c76223bS, 0);
        C120985dq c120985dq = this.A00;
        if (C14360o3.A0K(c120985dq.A08().A09.A00, "instagram_reels_video_midcard")) {
            UserSession userSession = this.A06;
            InterfaceC11380iw interfaceC11380iw = this.A01;
            C37577GgY c37577GgY = this.A02;
            InterfaceC31137Dmc interfaceC31137Dmc = this.A07;
            HashMap hashMap = this.A0A;
            HashMap hashMap2 = this.A09;
            return new C26524Bnj(this.A03, this.A04, c120985dq, this.A05, interfaceC11380iw, userSession, interfaceC31137Dmc, c37577GgY, this.A08, hashMap, hashMap2, this.A0B);
        }
        C4NJ A08 = c120985dq.A08();
        C4NM c4nm = A08.A08;
        C4NN c4nn = c4nm.A09;
        C117095Rs c117095Rs = c4nm.A03;
        if (c117095Rs == null || (str = c117095Rs.A00) == null) {
            str = "";
        }
        C5Ry c5Ry = c4nm.A07;
        C4NV c4nv = c4nm.A01;
        if (c4nv != null) {
            String str3 = c4nv.A00.A00;
            str2 = str3;
            if (str3 == null) {
                str2 = "";
            }
        } else {
            str2 = null;
        }
        if (c5Ry != null) {
            C75933ay c75933ay = C51722Yv.A02;
            c25622BUk = new C25622BUk(ImageView.ScaleType.CENTER_CROP, AbstractC25233BEq.A0X(C9CU.A00(C9CV.A00(null, C05F.A0Y, EnumC77933eL.RELATIVE, 3), C05F.A00, 0, AbstractC77623dm.A0D(c76223bS, R.dimen.abc_list_item_height_large_material)), c76223bS, R.dimen.abc_list_item_height_large_material), this.A01, c5Ry.A00, null, null, null, null, 3, false, false);
        } else {
            c25622BUk = null;
        }
        C75933ay c75933ay2 = C51722Yv.A02;
        long A04 = AbstractC77623dm.A04(c76223bS);
        long A07 = AbstractC77623dm.A07(c76223bS);
        C51722Yv A00 = C9CU.A00(null, C05F.A08, 0, A04);
        Integer num = C05F.A0A;
        C51722Yv A002 = C9CU.A00(A00, num, 0, A07);
        long A042 = AbstractC77623dm.A04(c76223bS);
        Integer num2 = C05F.A04;
        C51722Yv A003 = C9CU.A00(A002, num2, 0, A042);
        String str4 = c4nn.A00;
        if (str4 == null) {
            str4 = "";
        }
        Integer num3 = C05F.A0N;
        C51722Yv A004 = C9CV.A00(A003, num3, str4, 0);
        Integer num4 = C05F.A0C;
        long A0D = AbstractC77623dm.A0D(c76223bS, R.dimen.avatar_search_sticker_tray_text_size);
        C2XE c2xe = c76223bS.A05;
        Context context = c2xe.A0C;
        int A02 = AbstractC25232BEp.A02(context, c76223bS);
        String str5 = c4nn.A00;
        if (str5 == null) {
            str5 = "";
        }
        Typeface typeface = Typeface.DEFAULT;
        long A0D2 = AbstractC25229BEm.A0D();
        Integer num5 = C05F.A00;
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, str5, 0);
        AbstractC25233BEq.A19(c76223bS, A0a, A02, A0D);
        A0a.A0S(0);
        AbstractC25234BEr.A0n(typeface, c76223bS, A0a, A0D2);
        AbstractC25230BEn.A1M(A0a, num4, num5);
        AbstractC25230BEn.A1J(A0a, 1.09f, false);
        A0a.A0M(2);
        AbstractC25234BEr.A17(A004, A0a, false);
        C51682Yq A0A = A0a.A0A();
        C51722Yv A0V = AbstractC25233BEq.A0V(C9CU.A00(null, num, 0, AbstractC77623dm.A04(c76223bS)), AbstractC25225BEi.A0n(num2, 0, AbstractC77623dm.A04(c76223bS)), num3, str, 0);
        int A022 = AbstractC25232BEp.A02(context, c76223bS);
        long A05 = AbstractC77623dm.A05(c76223bS);
        C77723dw A0a2 = AbstractC25231BEo.A0a(c2xe, null, str, 0);
        AbstractC25233BEq.A19(c76223bS, A0a2, A022, A05);
        A0a2.A0S(0);
        AbstractC25234BEr.A0n(typeface, c76223bS, A0a2, A0D2);
        A0a2.A0X(num4);
        AbstractC25233BEq.A1E(A0a2, num5, 1.09f, false);
        A0a2.A0M(3);
        AbstractC25234BEr.A17(A0V, A0a2, false);
        C51682Yq A0A2 = A0a2.A0A();
        Integer num6 = C05F.A01;
        C51722Yv A005 = C9CV.A00(null, num6, "android.widget.Button", 0);
        if (str2 != null) {
            A005 = C9CV.A00(A005, num3, str2, 0);
        }
        C51722Yv A006 = C9CV.A00(AbstractC25233BEq.A0R(A005, AbstractC25230BEn.A0h(c76223bS, num2, R.dimen.ad4ad_button_bottom_margin, 0), 0, AbstractC77623dm.A0A(c76223bS)), num5, AbstractC77623dm.A0E(c76223bS, R.drawable.rounded_gray_button), 4);
        DRY A007 = DRY.A00(this, A08, 22);
        Integer num7 = C05F.A1F;
        C51722Yv A008 = C9CV.A00(A006, num7, A007, 4);
        int A023 = AbstractC25232BEp.A02(context, c76223bS);
        long A0D3 = AbstractC77623dm.A0D(c76223bS, R.dimen.button_text_size);
        C77723dw A0a3 = AbstractC25231BEo.A0a(c2xe, null, str2, 0);
        AbstractC25233BEq.A19(c76223bS, A0a3, A023, A0D3);
        A0a3.A0S(1);
        AbstractC25234BEr.A0n(typeface, c76223bS, A0a3, A0D2);
        A0a3.A0X(num4);
        AbstractC25234BEr.A1C(A0a3, num4, 1.09f);
        C51682Yq A0g = AbstractC25230BEn.A0g(null, A008, A0a3);
        C51722Yv A009 = C9CV.A00(AbstractC25233BEq.A0c(C9CU.A00(C9CV.A00(null, num6, "android.widget.Button", 0), C05F.A06, 0, AbstractC77623dm.A07(c76223bS)), num6, true), num7, DRY.A00(this, A08, 21), 4);
        int A03 = AbstractC25232BEp.A03(context, c76223bS, R.attr.igds_color_secondary_text_on_media);
        long A0D4 = AbstractC77623dm.A0D(c76223bS, R.dimen.button_text_size);
        C77723dw A0a4 = AbstractC25231BEo.A0a(c2xe, null, "Hide", 0);
        AbstractC25233BEq.A19(c76223bS, A0a4, A03, A0D4);
        A0a4.A0S(0);
        AbstractC25234BEr.A0n(typeface, c76223bS, A0a4, A0D2);
        A0a4.A0X(num5);
        A0a4.A0C();
        A0a4.A0Y(num5);
        AbstractC25230BEn.A1J(A0a4, 1.0f, false);
        A0a4.A0E();
        AbstractC25233BEq.A1D(A009, A0a4, false);
        C51682Yq A0A3 = A0a4.A0A();
        C51722Yv A0N = AbstractC25234BEr.A0N(null, num5, num6, 100.0f, 0);
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        C51722Yv A0d = AbstractC25230BEn.A0d(null, num6, 1.0f, 1);
        C2XE c2xe2 = A0P.A00;
        C2Z0 A0I = AbstractC25233BEq.A0I(c25622BUk, A0A, c2xe2);
        A0I.A00(A0A2);
        AbstractC25231BEo.A19(A0g, A0I, A0P, A0d);
        A0P.A00(AbstractC76963ci.A01(AbstractC25232BEp.A11(A0A3, c2xe2), A0P, C9CU.A00(C9CU.A00(null, C05F.A0E, 0, AbstractC77623dm.A04(A0P)), num, 0, AbstractC77623dm.A04(A0P))));
        return AbstractC76963ci.A05(A0P, c76223bS, A0N);
    }

    public C26523Bni(C2XI c2xi, ClipsViewerConfig clipsViewerConfig, C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC31137Dmc interfaceC31137Dmc, C37577GgY c37577GgY, InterfaceC31048Dkm interfaceC31048Dkm, HashMap hashMap, HashMap hashMap2, boolean z) {
        AbstractC167027dH.A13(c120985dq, userSession, interfaceC11380iw);
        AbstractC167017dG.A1U(hashMap, hashMap2);
        AbstractC25229BEm.A1J(c37644Ghd, 9, c2xi);
        C14360o3.A0B(clipsViewerConfig, 12);
        this.A00 = c120985dq;
        this.A06 = userSession;
        this.A01 = interfaceC11380iw;
        this.A02 = c37577GgY;
        this.A07 = interfaceC31137Dmc;
        this.A0A = hashMap;
        this.A09 = hashMap2;
        this.A08 = interfaceC31048Dkm;
        this.A05 = c37644Ghd;
        this.A03 = c2xi;
        this.A0B = z;
        this.A04 = clipsViewerConfig;
    }
}
