package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class PH2 implements InterfaceC57997Pnh {
    public final /* synthetic */ C8JN A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public PH2(C8JN c8jn, String str, boolean z) {
        this.A00 = c8jn;
        this.A02 = z;
        this.A01 = str;
    }

    @Override // X.InterfaceC57997Pnh
    public final void Dd6(C54845OMq c54845OMq) {
        Long l;
        Long l2;
        AbstractC53637Nni abstractC53637Nni;
        EnumC50631MWs enumC50631MWs;
        EnumC53335Nil enumC53335Nil;
        N13 n13;
        N10 n10;
        C14360o3.A0B(c54845OMq, 0);
        AbstractC55198Oe5 abstractC55198Oe5 = c54845OMq.A09;
        EnumC53367NjI enumC53367NjI = null;
        if (abstractC55198Oe5 != null) {
            l = abstractC55198Oe5.A07;
        } else {
            l = null;
        }
        InterfaceC58276PsU interfaceC58276PsU = c54845OMq.A0B;
        C51712Msh CF7 = interfaceC58276PsU.CF7();
        C51664Mrv Adp = interfaceC58276PsU.Adp();
        C8JN c8jn = this.A00;
        UserSession userSession = c8jn.A08;
        boolean z = this.A02;
        if (abstractC55198Oe5 != null) {
            l2 = ((N10) abstractC55198Oe5).A05.A01();
        } else {
            l2 = null;
        }
        AbstractC55198Oe5 abstractC55198Oe52 = c54845OMq.A09;
        if ((abstractC55198Oe52 instanceof N10) && (n10 = (N10) abstractC55198Oe52) != null) {
            abstractC53637Nni = n10.A05;
        } else {
            abstractC53637Nni = null;
        }
        if ((abstractC53637Nni instanceof N13) && (n13 = (N13) abstractC53637Nni) != null) {
            enumC53367NjI = n13.A03();
        }
        String A05 = MXK.A0C.A05();
        String str = this.A01;
        boolean A0Y = c8jn.A09.A0Y();
        if (z) {
            enumC50631MWs = EnumC50631MWs.A0I;
        } else if (A0Y) {
            enumC50631MWs = EnumC50631MWs.A0M;
        } else {
            enumC50631MWs = EnumC50631MWs.A0J;
        }
        C448024k c448024k = AnonymousClass229.A01(userSession).A07;
        String str2 = AbstractC53606NnD.A01;
        EnumC53334Nik enumC53334Nik = null;
        if (str2 != null) {
            enumC53335Nil = OXp.A01(str2);
        } else {
            enumC53335Nil = null;
        }
        String str3 = AbstractC53606NnD.A03;
        if (str3 != null) {
            enumC53334Nik = OXp.A00(str3);
        }
        String str4 = AbstractC53606NnD.A02;
        String str5 = AbstractC53606NnD.A00;
        C0Zx c0Zx = new C0Zx();
        c0Zx.A05(TraceFieldType.Bitrate, AbstractC31171DnF.A0V(CF7.A00));
        C51712Msh.A00(c0Zx, CF7);
        c0Zx.A05("start_time_ms", l);
        c0Zx.A05("end_time_ms", AbstractC31173DnH.A0g());
        C0Zx c0Zx2 = new C0Zx();
        c0Zx2.A05(TraceFieldType.Bitrate, AbstractC31171DnF.A0V(Adp.A00));
        c0Zx2.A05("sample_rate", AbstractC31171DnF.A0V(Adp.A02));
        c0Zx2.A05("channels", AbstractC31171DnF.A0V(Adp.A01));
        c0Zx2.A06("codec_profile", "AAC");
        c0Zx2.A05("start_time_ms", l);
        c0Zx2.A05("end_time_ms", AbstractC31173DnH.A0g());
        C22M c22m = c448024k.A04;
        if (c22m.A0L != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c448024k.A01, "ig_camera_end_session");
            if (A0f.isSampled()) {
                MSZ.A1E(A0f, c22m, "entity", "SMART_GLASSES");
                AbstractC166997dE.A1N(A0f, "camera_position", 4);
                A0f.A8R(EnumC114925Hg.STORY, "camera_destination");
                MSW.A1M(enumC50631MWs, A0f);
                AbstractC166987dD.A1S(A0f, MSX.A0f(c22m));
                A0f.A8R(enumC53335Nil, "device_type");
                A0f.A8R(enumC53334Nik, "device_build_type");
                A0f.AAP("soc_version", str4);
                A0f.AAP("build_flavor", str5);
                A0f.A9K("battery_level_pct", l2);
                A0f.A8R(enumC53367NjI, "thermal_throttling_state");
                A0f.AAP("glasses_connection_session_id", A05);
                A0f.AAP("glasses_activation_session_id", str);
                A0f.AAQ(c0Zx, "glass_phone_video");
                A0f.AAQ(c0Zx2, "glass_phone_audio");
                AbstractC25234BEr.A11(A0f, "device_aspect_ratio_category", AbstractC82663mU.A00);
                A0f.Cht();
            }
        }
        c8jn.A01 = str;
    }
}
