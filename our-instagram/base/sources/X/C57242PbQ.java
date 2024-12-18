package X;

import android.content.Context;
import com.facebook.R;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.PbQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57242PbQ extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57242PbQ(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.InstagramFilterFactoryProvider, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        int i;
        InterfaceC16820sZ interfaceC16820sZ;
        UserSession A0r;
        String A0B;
        EnumC53344Niu enumC53344Niu;
        EnumC53354Nj4 enumC53354Nj4;
        EnumC53361NjC enumC53361NjC;
        EnumC53353Nj3 enumC53353Nj3;
        N79 n79;
        C50725MaQ A01;
        boolean z;
        switch (this.A00) {
            case 0:
                return AbstractC50523MSb.A0A(this.A01);
            case 1:
                C56181Owo c56181Owo = (C56181Owo) this.A01;
                c56181Owo.A02 = true;
                c56181Owo.A01 = true;
                interfaceC16820sZ = c56181Owo.A09;
                interfaceC16820sZ.invoke();
                return C0eB.A00;
            case 2:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 14:
            default:
                interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                interfaceC16820sZ.invoke();
                return C0eB.A00;
            case 3:
                ((C25870BcR) this.A01).A05 = AbstractC27760CMb.A00.iterator();
                return C0eB.A00;
            case 4:
                C9GR.A07((Context) this.A01, 2131957028);
                return C0eB.A00;
            case 5:
                return new C28162Cb9(AbstractC166987dD.A0r(((C26828Bsq) this.A01).A07));
            case 6:
                C26828Bsq c26828Bsq = (C26828Bsq) this.A01;
                return AbstractC25231BEo.A0c(c26828Bsq.requireActivity(), c26828Bsq.A07);
            case 7:
                C26828Bsq c26828Bsq2 = (C26828Bsq) this.A01;
                AbstractC31177DnL.A0u(c26828Bsq2.requireContext(), AbstractC166987dD.A0r(c26828Bsq2.A07), C2Fb.A1W, AbstractC43591JPw.A00(1037));
                C25870BcR c25870BcR = (C25870BcR) c26828Bsq2.A08.getValue();
                c25870BcR.A07 = true;
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(c25870BcR.A0F);
                A0w.E77("has_seen_ai_themes_disclaimer", true);
                A0w.apply();
                return C0eB.A00;
            case 8:
                return AbstractC25235BEs.A0U(this.A01);
            case 9:
                C26828Bsq c26828Bsq3 = (C26828Bsq) this.A01;
                UserSession A0r2 = AbstractC166987dD.A0r(c26828Bsq3.A07);
                boolean A00 = AbstractC72723Nt.A00(c26828Bsq3.requireActivity());
                C28457Ch7 c28457Ch7 = c26828Bsq3.A00;
                if (c28457Ch7 == null) {
                    str = "aiThemesLogger";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                return new ND2(A0r2, (C28162Cb9) c26828Bsq3.A05.getValue(), c28457Ch7, A00);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                AbstractC25227BEk.A1A((InterfaceC74953Yl) this.A01, false);
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                N7H n7h = (N7H) this.A01;
                return AbstractC31173DnH.A0R(AbstractC31174DnI.A0R(n7h), new NF7(n7h, n7h.A00));
            case 16:
                N7H n7h2 = (N7H) this.A01;
                return MSW.A0F(new NB1(AbstractC166987dD.A0r(n7h2.A05)), n7h2).A00(C50965MfY.class);
            case 17:
                InterfaceC09390do interfaceC09390do = ((N6X) this.A01).A01;
                A0r = AbstractC166987dD.A0r(interfaceC09390do);
                A0B = AbstractC50524MSc.A0B(interfaceC09390do);
                enumC53344Niu = null;
                enumC53354Nj4 = EnumC53354Nj4.HOW_IT_WORKS;
                enumC53361NjC = EnumC53361NjC.SELECTION;
                enumC53353Nj3 = EnumC53353Nj3.POWERED_BY_INSTAGRAM;
                C55192Ody.A01(EnumC53337Nin.A02, enumC53361NjC, enumC53353Nj3, enumC53344Niu, enumC53344Niu, enumC53344Niu, enumC53354Nj4, A0r, A0B);
                return C0eB.A00;
            case 18:
                InterfaceC09390do interfaceC09390do2 = ((N6X) this.A01).A01;
                A0r = AbstractC166987dD.A0r(interfaceC09390do2);
                A0B = AbstractC50524MSc.A0B(interfaceC09390do2);
                enumC53344Niu = null;
                enumC53354Nj4 = EnumC53354Nj4.HOW_IT_WORKS;
                enumC53361NjC = EnumC53361NjC.SELECTION;
                enumC53353Nj3 = EnumC53353Nj3.FEDIVERSE;
                C55192Ody.A01(EnumC53337Nin.A02, enumC53361NjC, enumC53353Nj3, enumC53344Niu, enumC53344Niu, enumC53344Niu, enumC53354Nj4, A0r, A0B);
                return C0eB.A00;
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 21:
            case 22:
                InterfaceC09390do interfaceC09390do3 = ((N6X) this.A01).A01;
                A0r = AbstractC166987dD.A0r(interfaceC09390do3);
                A0B = AbstractC50524MSc.A0B(interfaceC09390do3);
                enumC53344Niu = null;
                enumC53354Nj4 = EnumC53354Nj4.HOW_IT_WORKS;
                enumC53361NjC = EnumC53361NjC.SELECTION;
                enumC53353Nj3 = EnumC53353Nj3.YOUR_DATA;
                C55192Ody.A01(EnumC53337Nin.A02, enumC53361NjC, enumC53353Nj3, enumC53344Niu, enumC53344Niu, enumC53344Niu, enumC53354Nj4, A0r, A0B);
                return C0eB.A00;
            case 23:
                N6Z n6z = (N6Z) this.A01;
                InterfaceC09390do interfaceC09390do4 = n6z.A02;
                UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do4);
                String A0B2 = AbstractC50524MSc.A0B(interfaceC09390do4);
                EnumC53354Nj4 enumC53354Nj42 = EnumC53354Nj4.PRIVACY_SELECTION;
                C55192Ody.A01(EnumC53337Nin.A02, EnumC53361NjC.SELECTION, null, null, EnumC53345Niv.LEARN_MORE, N6Z.A00(n6z), enumC53354Nj42, A0r3, A0B2);
                return C0eB.A00;
            case 24:
                n79 = (N79) this.A01;
                InterfaceC09390do interfaceC09390do5 = n79.A00;
                AbstractC201108us.A00(C82G.A0A, EnumC201098ur.ACCEPT, C82H.A0B, MSW.A0H(), AbstractC166987dD.A0r(interfaceC09390do5));
                AbstractC173537o5.A00(AbstractC166987dD.A0r(interfaceC09390do5)).A01(true);
                AbstractC25233BEq.A14(n79);
                return C0eB.A00;
            case 25:
                n79 = (N79) this.A01;
                AbstractC201108us.A00(C82G.A0A, EnumC201098ur.DECLINE, C82H.A0B, MSW.A0H(), AbstractC166987dD.A0r(n79.A00));
                AbstractC25233BEq.A14(n79);
                return C0eB.A00;
            case 26:
                return new C50699MZu((UserSession) this.A01);
            case 27:
                return new MYZ((UserSession) this.A01);
            case 28:
                ((C47811L9t) this.A01).A00.DB1();
                return C0eB.A00;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                ((L92) this.A01).A02.DAm();
                return C0eB.A00;
            case 30:
                C84743qO c84743qO = new C84743qO();
                C51313Mla c51313Mla = (C51313Mla) this.A01;
                C167847ee c167847ee = new C167847ee();
                c167847ee.A02(1.0f);
                c167847ee.A03(0.6f);
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                Context context = c51313Mla.A01.getContext();
                boolean z2 = c51313Mla.A03;
                int i3 = R.attr.igds_color_tag_or_toast_background;
                if (z2) {
                    i3 = R.attr.igds_color_highlight_background;
                }
                c167847ee.A05(AbstractC167007dF.A09(context, i3));
                int i4 = R.attr.igds_color_media_background;
                if (z2) {
                    i4 = R.attr.igds_color_primary_background;
                }
                int A09 = AbstractC167007dF.A09(context, i4);
                C84793qT c84793qT = c167847ee.A00;
                c84793qT.A09 = A09;
                c84793qT.A06 = 0;
                c84793qT.A03 = 0.0f;
                c84793qT.A0H = false;
                c167847ee.A04(context.getResources().getInteger(R.integer.music_tray_placeholder_shimmer_duration));
                c84743qO.A03(c167847ee.A01());
                return c84743qO;
            case 31:
                ((C56274Oyj) this.A01).A05.cancel();
                return C0eB.A00;
            case 32:
                ColorFilter colorFilter = new ColorFilter("normal");
                colorFilter.A01 = true;
                C199838sn c199838sn = new C199838sn(new Object(), colorFilter);
                c199838sn.A00 = false;
                return c199838sn;
            case 33:
                OK0 ok0 = (OK0) this.A01;
                InterfaceC08830cm interfaceC08830cm = ok0.A00;
                if (interfaceC08830cm != null) {
                    return interfaceC08830cm.get();
                }
                C197328o3 c197328o3 = new C197328o3(null, ok0.A04, ok0.A05, ok0.A06, P05.A00, ok0.A0B, ok0.A01, ok0.A08.A03);
                c197328o3.A04 = ok0.A0E;
                c197328o3.A03 = true;
                InterfaceC197718oi A05 = c197328o3.A05(null, ok0.A0D);
                if (A05 != null) {
                    return A05;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 34:
                C50724MaP c50724MaP = (C50724MaP) this.A01;
                UserSession A0r4 = AbstractC166987dD.A0r(c50724MaP.A0i);
                AnonymousClass841 anonymousClass841 = c50724MaP.A0G;
                if (anonymousClass841 != null) {
                    return new C52279NBu(A0r4, anonymousClass841);
                }
                str = "creationCameraSession";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 35:
                return Boolean.valueOf(AbstractC31172DnG.A1X(AbstractC31179DnN.A04(this.A01), "is_legacy_feed_creation"));
            case 36:
                C50724MaP c50724MaP2 = (C50724MaP) this.A01;
                Context requireContext = c50724MaP2.requireContext();
                UserSession A0r5 = AbstractC166987dD.A0r(c50724MaP2.A0i);
                String str2 = c50724MaP2.A0e;
                C56338Ozz c56338Ozz = new C56338Ozz(c50724MaP2);
                C47Z c47z = c50724MaP2.A0S;
                C14360o3.A0A(c47z);
                AnonymousClass841 anonymousClass8412 = c50724MaP2.A0G;
                if (anonymousClass8412 != null) {
                    return new L92(requireContext, c50724MaP2, A0r5, anonymousClass8412, c56338Ozz, c47z, str2);
                }
                str = "creationCameraSession";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 37:
            case 39:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A01 = C50724MaP.A01((C50724MaP) this.A01);
                z = true;
                A01.A09(z);
                return C0eB.A00;
            case 38:
            case 40:
            case 43:
                A01 = C50724MaP.A01((C50724MaP) this.A01);
                z = false;
                A01.A09(z);
                return C0eB.A00;
            case Seq.NULL_REFNUM /* 41 */:
                InterfaceC50490MQs interfaceC50490MQs = C50724MaP.A01((C50724MaP) this.A01).A01;
                if (interfaceC50490MQs != null) {
                    i = interfaceC50490MQs.BF3();
                } else {
                    i = 0;
                }
                return Integer.valueOf(i);
            case 44:
            case 47:
                return this.A01;
            case 45:
            case 48:
                return AbstractC25226BEj.A1C(this.A01);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            case 49:
                return AbstractC167027dH.A0B(this.A01);
        }
    }
}
