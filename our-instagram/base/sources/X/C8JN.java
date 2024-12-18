package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.8JN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8JN extends C8JK {
    public long A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public String A06;
    public final Context A07;
    public final UserSession A08;
    public final C8HI A09;
    public final AnonymousClass880 A0A;
    public final C8FG A0B;
    public final C1813982r A0C;

    public static final void A01(C54845OMq c54845OMq, C8JN c8jn, Boolean bool, boolean z, boolean z2) {
        boolean z3;
        long j;
        Long l;
        AbstractC53637Nni abstractC53637Nni;
        EnumC50631MWs enumC50631MWs;
        EnumC53335Nil enumC53335Nil;
        int i;
        N13 n13;
        N10 n10;
        Long l2;
        Long l3;
        if (C14360o3.A0K(bool, true)) {
            c8jn.A06(z2);
        }
        AbstractC55198Oe5 abstractC55198Oe5 = c54845OMq.A09;
        if (abstractC55198Oe5 != null && abstractC55198Oe5.A0C) {
            abstractC55198Oe5.A0E(false);
        }
        MXK mxk = MXK.A0C;
        String A05 = mxk.A05();
        if (C14360o3.A0K(mxk.A00(), true) && !C14360o3.A0K(A05, c8jn.A06)) {
            UserSession userSession = c8jn.A08;
            if (bool != null) {
                z3 = bool.booleanValue();
            } else {
                z3 = false;
            }
            AbstractC55198Oe5 abstractC55198Oe52 = c54845OMq.A09;
            long j2 = 0;
            if (abstractC55198Oe52 != null && (l3 = abstractC55198Oe52.A06) != null) {
                j = l3.longValue();
            } else {
                j = 0;
            }
            Long valueOf = Long.valueOf(j);
            if (abstractC55198Oe52 != null && (l2 = abstractC55198Oe52.A05) != null) {
                j2 = l2.longValue();
            }
            Long valueOf2 = Long.valueOf(j2);
            EnumC53367NjI enumC53367NjI = null;
            if (abstractC55198Oe52 != null) {
                l = ((N10) abstractC55198Oe52).A05.A01();
            } else {
                l = null;
            }
            AbstractC55198Oe5 abstractC55198Oe53 = c54845OMq.A09;
            if ((abstractC55198Oe53 instanceof N10) && (n10 = (N10) abstractC55198Oe53) != null) {
                abstractC53637Nni = n10.A05;
            } else {
                abstractC53637Nni = null;
            }
            if ((abstractC53637Nni instanceof N13) && (n13 = (N13) abstractC53637Nni) != null) {
                enumC53367NjI = n13.A03();
            }
            if (z2) {
                enumC50631MWs = EnumC50631MWs.A0I;
            } else {
                enumC50631MWs = EnumC50631MWs.A0J;
            }
            C448024k c448024k = AnonymousClass229.A01(userSession).A07;
            Boolean valueOf3 = Boolean.valueOf(z);
            String str = AbstractC53606NnD.A01;
            EnumC53334Nik enumC53334Nik = null;
            if (str != null) {
                enumC53335Nil = OXp.A01(str);
            } else {
                enumC53335Nil = null;
            }
            String str2 = AbstractC53606NnD.A03;
            if (str2 != null) {
                enumC53334Nik = OXp.A00(str2);
            }
            String str3 = AbstractC53606NnD.A02;
            String str4 = AbstractC53606NnD.A00;
            C22M c22m = c448024k.A04;
            if (c22m.A0L != null) {
                C18920wW c18920wW = c448024k.A01;
                InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_end_session");
                if (A00.isSampled()) {
                    if (z3) {
                        i = 4;
                    } else {
                        i = 2;
                        if (c22m.A01 != 2) {
                            i = 1;
                        }
                    }
                    A00.AAP("entity", "SMART_GLASSES");
                    A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    A00.A8p("camera_position", Integer.valueOf(i));
                    A00.A8R(EnumC114925Hg.STORY, "camera_destination");
                    A00.A8R(enumC50631MWs, "surface");
                    String str5 = c22m.A0L;
                    if (str5 == null) {
                        str5 = "";
                    }
                    A00.AAP("camera_session_id", str5);
                    A00.A8R(enumC53335Nil, "device_type");
                    A00.A8R(enumC53334Nik, "device_build_type");
                    A00.AAP("soc_version", str3);
                    A00.AAP("build_flavor", str4);
                    A00.A9K("battery_level_pct", l);
                    A00.A8R(enumC53367NjI, MSV.A00(592));
                    A00.A7v("is_captured_from_glasses", valueOf3);
                    A00.A9K("preview_total_time_ms", valueOf);
                    A00.A9K("capture_total_time_ms", valueOf2);
                    A00.AAP(MSV.A00(454), A05);
                    A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
                    A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
                    A00.AAP("device_fold_state", AbstractC82683mW.A00);
                    A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
                    A00.Cht();
                }
            }
            c8jn.A06 = A05;
        }
        if (c54845OMq.A0J) {
            c54845OMq.A07(false);
        }
    }

    public static final AbstractC55106ObM A00(C8JN c8jn) {
        C190298bn A01 = C190298bn.A03.A01(c8jn.A08);
        if (A01 != null) {
            return A01.A00();
        }
        return null;
    }

    public final void A04() {
        UserSession userSession = this.A08;
        Context context = this.A07;
        if (AbstractC195888lY.A01(context.getApplicationContext(), userSession)) {
            C37101o8.A00(AbstractC195888lY.A00()).A00(context, userSession, new C24065Am2(this), "GlassesStoryViewListenerSTART_STORY_DESINATION_WITH_SUP_CALLBACK");
        }
    }

    public final void A05() {
        UserSession userSession = this.A08;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        InterfaceC16530ry interfaceC16530ry = A00.A5D;
        C0YR[] c0yrArr = C23031Ai.A8c;
        if (!((Boolean) interfaceC16530ry.CES(A00, c0yrArr[342])).booleanValue()) {
            C176567tE.A00(new RunnableC24372ArF(this));
            C23031Ai A002 = AbstractC23021Ah.A00(userSession);
            A002.A5D.Egi(A002, true, c0yrArr[342]);
            C448424o c448424o = AnonymousClass229.A01(userSession).A0C;
            EnumC114925Hg enumC114925Hg = EnumC114925Hg.STORY;
            C18920wW c18920wW = c448424o.A01;
            InterfaceC02590Ai A003 = c18920wW.A00(c18920wW.A00, "ig_camera_nux");
            if (A003.isSampled()) {
                A003.AAP("entity", "GLASSES_CAMERA");
                A003.AAP("nux_step", "OPEN");
                C22M c22m = c448424o.A04;
                String str = c22m.A0L;
                if (str == null) {
                    str = "";
                }
                A003.AAP("camera_session_id", str);
                A003.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                A003.A8R(enumC114925Hg, "camera_destination");
                A003.Cht();
            }
        }
    }

    public final void A06(boolean z) {
        String A07 = MXK.A0C.A07();
        if (A07 != null && !A07.equals(this.A01)) {
            UserSession userSession = this.A08;
            Context context = this.A07;
            if (AbstractC195888lY.A01(context.getApplicationContext(), userSession)) {
                C37101o8.A00(AbstractC195888lY.A00()).A00(context, userSession, new PH2(this, A07, z), "GlassesStoryViewListener_STREAM_ENDING_CALLBACK_ID");
            }
        }
    }

    @Override // X.C8JL
    public final void APQ() {
        String str;
        C88X A0D;
        if (this.A03 == null) {
            C8FG c8fg = this.A0B;
            if (c8fg != null && (A0D = c8fg.A0D()) != null) {
                str = A0D.getId();
            } else {
                str = null;
            }
            this.A03 = str;
        }
        if (!this.A09.A0Y()) {
            C176567tE.A00(new RunnableC24367ArA(this));
        }
        C37101o8.A00(AbstractC195888lY.A00()).A00(this.A07, this.A08, new Am1(this), "sup:SupDelegate_GLASSES_PREVIEW_CALLBACK_ID");
        C176567tE.A00(new RunnableC24368ArB(this));
    }

    @Override // X.C8JL
    public final void ARa() {
        C176567tE.A00(new RunnableC24369ArC(this));
    }

    @Override // X.C8JL
    public final void DJZ() {
        this.A09.A0Q();
        C174757qB c174757qB = this.A0C.A02;
        if (c174757qB != null) {
            BDp bDp = c174757qB.A04;
            if (bDp != null) {
                bDp.D73();
            }
            super.A00 = false;
        }
    }

    @Override // X.C8JL
    public final void DYJ() {
        C174757qB c174757qB = this.A0C.A02;
        if (c174757qB != null) {
            C174757qB.A05(EnumC222819sM.A03, c174757qB);
        }
        super.A00 = true;
        ARa();
    }

    public C8JN(Context context, UserSession userSession, C8HI c8hi, AnonymousClass880 anonymousClass880, C8FG c8fg, C1813982r c1813982r) {
        super(userSession, context);
        this.A08 = userSession;
        this.A07 = context;
        this.A0C = c1813982r;
        this.A0B = c8fg;
        this.A09 = c8hi;
        this.A0A = anonymousClass880;
    }

    public static final void A02(C54845OMq c54845OMq, C8JN c8jn, boolean z) {
        Runnable runnableC24371ArE;
        if (!c8jn.A03()) {
            c54845OMq.A05(EnumC223469td.A0B);
            if (!c8jn.A09.A0Y()) {
                C146106i8 c146106i8 = new C146106i8();
                Context context = c8jn.A07;
                c146106i8.A0D = context.getString(2131974505);
                c146106i8.A0I = context.getString(2131974504);
                c146106i8.A02();
                c146106i8.A07(R.drawable.instagram_glasses_pano_outline_16);
                C41451vu.A01.E4s(new C3KD(c146106i8.A00()));
                return;
            }
            return;
        }
        C8HI c8hi = c8jn.A09;
        if (c8hi.A0Y()) {
            if (c8hi.A1I.A0i.A0A) {
                runnableC24371ArE = new RunnableC24370ArD(c8jn);
            } else {
                c54845OMq.A05(EnumC223469td.A0B);
                return;
            }
        } else {
            if (z) {
                c54845OMq.A05(EnumC223469td.A07);
                C8HI.A09(c8hi);
                return;
            }
            runnableC24371ArE = new RunnableC24371ArE(c8jn);
        }
        C176567tE.A00(runnableC24371ArE);
    }

    @Override // X.C8JL
    public final void Dte() {
        if (A03() && !super.A00) {
            DYJ();
        } else {
            ARa();
        }
    }
}
