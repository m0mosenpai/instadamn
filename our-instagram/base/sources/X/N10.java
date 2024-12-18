package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class N10 extends AbstractC55198Oe5 {
    public final InterfaceC02550Ad A08;
    public int A00 = 3;
    public AbstractC55211OeV A01 = new C52047N0y();
    public AbstractC55211OeV A02 = new C52048N0z();
    public AbstractC46523KiO A06 = new N15();
    public AbstractC46523KiO A07 = new N14();
    public AbstractC53637Nni A05 = new Object();
    public OKc A03 = new N12();
    public OKc A04 = new OKc();

    @Override // X.AbstractC55198Oe5
    public final synchronized void A0D(C45127Jxw c45127Jxw, AbstractC53624NnV abstractC53624NnV) {
        InterfaceC02590Ai A0H;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        AbstractC46523KiO abstractC46523KiO;
        EnumC50631MWs enumC50631MWs;
        String str5;
        EnumC53335Nil enumC53335Nil;
        EnumC53334Nik enumC53334Nik;
        String str6;
        N15 n15;
        InterfaceC58164PqU interfaceC58164PqU;
        String str7;
        String str8;
        if (this.A00 != 6 && (interfaceC58164PqU = super.A01) != null) {
            interfaceC58164PqU.markerStart(4);
            String str9 = AbstractC53606NnD.A01;
            if (str9 != null) {
                interfaceC58164PqU.CnW(4, "device_type", str9);
            }
            String str10 = AbstractC53606NnD.A03;
            if (str10 != null) {
                interfaceC58164PqU.CnW(4, "device_build_type", str10);
            }
            String str11 = AbstractC53606NnD.A02;
            if (str11 != null) {
                interfaceC58164PqU.CnW(4, "soc_version", str11);
            }
            String str12 = AbstractC53606NnD.A00;
            if (str12 != null) {
                interfaceC58164PqU.CnW(4, "build_flavor", str12);
            }
            interfaceC58164PqU.CnV(4, 1, A03(this));
            MXK mxk = MXK.A0C;
            interfaceC58164PqU.CnV(4, 0, mxk.A06());
            String A05 = mxk.A05();
            if (A05 == null) {
                A05 = "NULL";
            }
            interfaceC58164PqU.CnW(4, "app_cold_start_session_id", A05);
            interfaceC58164PqU.CnW(4, "failure_category", A04(abstractC53624NnV));
            interfaceC58164PqU.CnW(4, TraceFieldType.FailureReason, abstractC53624NnV.A00());
            if (AbstractC166997dE.A1Z(mxk.A01(), true)) {
                str7 = "CONTINUITY";
            } else {
                str7 = "INITIATION";
            }
            interfaceC58164PqU.CnW(4, "stream_stage", str7);
            interfaceC58164PqU.CnW(4, "event_time_ms", String.valueOf(System.currentTimeMillis()));
            String str13 = super.A08;
            if (str13 != null) {
                interfaceC58164PqU.CnW(4, "smart_glasses_stream_session_id", str13);
            }
            String A07 = mxk.A07();
            if (A07 != null) {
                interfaceC58164PqU.CnW(4, "app_warm_start_session_id", A07);
            }
            if (c45127Jxw != null) {
                interfaceC58164PqU.CnW(4, "failure_detail", A02(c45127Jxw));
            }
            N15 n152 = (N15) this.A06;
            if (n152 == null || (str8 = N15.A00(((AbstractC46523KiO) n152).A00).name()) == null) {
                str8 = "UNKNOWN";
            }
            interfaceC58164PqU.CnW(4, "uplink_type", str8);
            Integer A02 = mxk.A02();
            if (A02 != null) {
                interfaceC58164PqU.CnW(4, "streaming_protocol", AbstractC53761NqD.A00(A02));
            }
            interfaceC58164PqU.markerEnd(4, 2);
        }
        Iterator A15 = AbstractC166997dE.A15(this.A0A);
        while (A15.hasNext()) {
            OTI oti = (OTI) AbstractC31176DnK.A0j(A15);
            C8JN c8jn = oti.A01;
            UserSession userSession = c8jn.A08;
            boolean A0Y = c8jn.A09.A0Y();
            MXK mxk2 = MXK.A0C;
            Boolean A01 = mxk2.A01();
            if (A01 != null) {
                z = A01.booleanValue();
            } else {
                z = false;
            }
            String A052 = mxk2.A05();
            String A072 = mxk2.A07();
            Integer A022 = mxk2.A02();
            AbstractC55198Oe5 abstractC55198Oe5 = oti.A00.A09;
            EnumC53363NjE enumC53363NjE = null;
            if (abstractC55198Oe5 != null) {
                abstractC46523KiO = ((N10) abstractC55198Oe5).A06;
            } else {
                abstractC46523KiO = null;
            }
            if ((abstractC46523KiO instanceof N15) && (n15 = (N15) abstractC46523KiO) != null) {
                enumC53363NjE = N15.A00(((AbstractC46523KiO) n15).A00);
            }
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "ig_camera_smart_glasses_session_error");
            if (A0f.isSampled()) {
                if (A0Y) {
                    enumC50631MWs = EnumC50631MWs.A0M;
                } else {
                    enumC50631MWs = EnumC50631MWs.A0J;
                }
                if (!z) {
                    str5 = "initiation";
                } else {
                    str5 = "continuity";
                }
                String A0t = AbstractC166997dE.A0t(userSession);
                if (A0t == null) {
                    A0t = "";
                }
                MSW.A1M(enumC50631MWs, A0f);
                String str14 = "connection_error";
                if (!(abstractC53624NnV instanceof N1A)) {
                    if (abstractC53624NnV instanceof N1C) {
                        str14 = "stream_start_error";
                    } else if (abstractC53624NnV instanceof N1D) {
                        str14 = "stream_error";
                    } else if (abstractC53624NnV instanceof N1E) {
                        str14 = "telemetry_error";
                    }
                }
                A0f.AAP("failure_category", str14);
                A0f.AAP(TraceFieldType.FailureReason, abstractC53624NnV.A00());
                A0f.AAP("stream_stage", str5);
                A0f.A9K("event_time_ms", AbstractC31173DnH.A0g());
                String str15 = AbstractC53606NnD.A01;
                String str16 = null;
                if (str15 != null) {
                    enumC53335Nil = OXp.A01(str15);
                } else {
                    enumC53335Nil = null;
                }
                A0f.A8R(enumC53335Nil, "device_type");
                String str17 = AbstractC53606NnD.A03;
                if (str17 != null) {
                    enumC53334Nik = OXp.A00(str17);
                } else {
                    enumC53334Nik = null;
                }
                A0f.A8R(enumC53334Nik, "device_build_type");
                A0f.AAP("soc_version", AbstractC53606NnD.A02);
                A0f.AAP("build_flavor", AbstractC53606NnD.A00);
                A0f.AAP("glasses_activation_session_id", A072);
                AbstractC166987dD.A1S(A0f, A0t);
                A0f.AAP("glasses_connection_session_id", A052);
                if (c45127Jxw != null) {
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    String str18 = c45127Jxw.A01;
                    if (str18 != null) {
                        A1C.append(str18);
                    }
                    if (str18 != null && ((Throwable) c45127Jxw.A00) != null) {
                        A1C.append('\n');
                        A1C.append('\n');
                    }
                    Throwable th = (Throwable) c45127Jxw.A00;
                    if (th != null) {
                        StringWriter A0O = AbstractC37300Gc1.A0O();
                        PrintWriter printWriter = new PrintWriter(A0O);
                        th.printStackTrace(printWriter);
                        printWriter.flush();
                        Iterator it = AbstractC001800i.A0d(AbstractC001900j.A0O(AbstractC25228BEl.A1A(AbstractC166987dD.A19(A0O))), 30).iterator();
                        while (it.hasNext()) {
                            A1C.append(AbstractC166987dD.A1B(it));
                            A1C.append('\n');
                        }
                    }
                    str6 = AbstractC166987dD.A19(A1C);
                } else {
                    str6 = null;
                }
                A0f.AAP("failure_detail", str6);
                if (A022 != null) {
                    int intValue = A022.intValue();
                    if (intValue != 0 && intValue != 3) {
                        if (intValue != 1) {
                            if (intValue == 2 || intValue == 4) {
                                str16 = "BTC";
                            } else {
                                throw B4Z.A00();
                            }
                        } else {
                            str16 = "BLE";
                        }
                    } else {
                        str16 = "TCP";
                    }
                }
                A0f.AAP("streaming_protocol", str16);
                A0f.A8R(enumC53363NjE, "uplink_type");
                A0f.Cht();
            }
        }
        int i = this.A00;
        try {
            if (i != 3) {
                if (i == 4) {
                    A0H = MSY.A0H(this.A08, "smart_glasses_app_call_session_error");
                    if (A0H.isSampled()) {
                        C0Zx c0Zx = new C0Zx();
                        AbstractC55198Oe5.A0A(c0Zx);
                        AbstractC55198Oe5.A09(c0Zx);
                        String str19 = AbstractC53606NnD.A02;
                        if (str19 != null) {
                            c0Zx.A06("soc_version", str19);
                        }
                        String str20 = AbstractC53606NnD.A00;
                        if (str20 != null) {
                            c0Zx.A06("build_flavor", str20);
                        }
                        A0H.AAQ(c0Zx, "__device");
                        if (this.A0B) {
                            str3 = "call";
                        } else {
                            str3 = "ringing";
                        }
                        A0H.AAP("call_stage", str3);
                        MXK mxk3 = MXK.A0C;
                        A0H.AAP("app_call_session_id", mxk3.A06());
                        String A053 = mxk3.A05();
                        if (A053 == null) {
                            A053 = "NULL";
                        }
                        A0H.AAP("app_cold_start_session_id", A053);
                        String str21 = "connection_error";
                        if (!(abstractC53624NnV instanceof N1A)) {
                            if (abstractC53624NnV instanceof N1C) {
                                str21 = "call_start_error";
                            } else if (abstractC53624NnV instanceof N1D) {
                                str21 = "call_error";
                            } else if (abstractC53624NnV instanceof N1E) {
                                str21 = "telemetry_error";
                            } else {
                                AbstractC195978lm.A02.A04("sup:SUPMediaStreamFalcoLoggerImpl", "MediaStreamErrorEvent not valid type", null);
                            }
                        }
                        A0H.AAP("failure_category", str21);
                        A0H.AAP(TraceFieldType.FailureReason, abstractC53624NnV.A00());
                        if (AbstractC31177DnL.A1b(mxk3.A01())) {
                            str4 = "continuity";
                        } else {
                            str4 = "initiation";
                        }
                        A0H.AAP("stream_stage", str4);
                        A0H.A9K("event_time_ms", AbstractC31173DnH.A0g());
                        String str22 = super.A08;
                        if (str22 != null) {
                            A0H.AAP("smart_glasses_stream_session_id", str22);
                        }
                        String A073 = mxk3.A07();
                        if (A073 != null) {
                            A0H.AAP("app_warm_start_session_id", A073);
                        }
                        if (c45127Jxw != null) {
                            A0H.AAP("failure_detail", A02(c45127Jxw));
                        }
                        AbstractC46523KiO abstractC46523KiO2 = this.A06;
                        C14360o3.A0C(abstractC46523KiO2, "null cannot be cast to non-null type com.facebook.wearable.mediastream.analytics.logging.impl.SUPNetworkStateManagerImpl");
                        A0H.A8R(N15.A00(((AbstractC46523KiO) ((N15) abstractC46523KiO2)).A00), "uplink_type");
                        AbstractC55198Oe5.A08(A0H, mxk3);
                        A0H.Cht();
                    }
                }
            } else {
                A0H = MSY.A0H(this.A08, "smart_glasses_app_livestream_session_error");
                if (A0H.isSampled()) {
                    C0Zx c0Zx2 = new C0Zx();
                    AbstractC55198Oe5.A0A(c0Zx2);
                    AbstractC55198Oe5.A09(c0Zx2);
                    String str23 = AbstractC53606NnD.A02;
                    if (str23 != null) {
                        c0Zx2.A06("soc_version", str23);
                    }
                    String str24 = AbstractC53606NnD.A00;
                    if (str24 != null) {
                        c0Zx2.A06("build_flavor", str24);
                    }
                    A0H.AAQ(c0Zx2, "__device");
                    if (this.A0B) {
                        str = "live";
                    } else {
                        str = "in_preview";
                    }
                    A0H.AAP("livestream_stage", str);
                    MXK mxk4 = MXK.A0C;
                    A0H.AAP("app_stream_session_id", mxk4.A06());
                    String A054 = mxk4.A05();
                    if (A054 == null) {
                        A054 = "NULL";
                    }
                    A0H.AAP("app_cold_start_session_id", A054);
                    A0H.AAP("failure_category", A04(abstractC53624NnV));
                    A0H.AAP(TraceFieldType.FailureReason, abstractC53624NnV.A00());
                    if (AbstractC31177DnL.A1b(mxk4.A01())) {
                        str2 = "continuity";
                    } else {
                        str2 = "initiation";
                    }
                    A0H.AAP("stream_stage", str2);
                    A0H.A9K("event_time_ms", AbstractC31173DnH.A0g());
                    String str25 = super.A08;
                    if (str25 != null) {
                        A0H.AAP("smart_glasses_stream_session_id", str25);
                    }
                    String A074 = mxk4.A07();
                    if (A074 != null) {
                        A0H.AAP("app_warm_start_session_id", A074);
                    }
                    if (c45127Jxw != null) {
                        A0H.AAP("failure_detail", A02(c45127Jxw));
                    }
                    AbstractC46523KiO abstractC46523KiO3 = this.A06;
                    C14360o3.A0C(abstractC46523KiO3, "null cannot be cast to non-null type com.facebook.wearable.mediastream.analytics.logging.impl.SUPNetworkStateManagerImpl");
                    A0H.A8R(N15.A00(((AbstractC46523KiO) ((N15) abstractC46523KiO3)).A00), "uplink_type");
                    AbstractC55198Oe5.A08(A0H, mxk4);
                    A0H.Cht();
                }
            }
        } catch (Throwable th2) {
        }
    }

    public static final String A03(N10 n10) {
        int i = n10.A00;
        boolean z = n10.A0B;
        if (i == 4) {
            if (z) {
                return "CALL";
            }
            return "RINGING";
        }
        if (z) {
            return "LIVE";
        }
        return "IN_PREVIEW";
    }

    private final String A04(AbstractC53624NnV abstractC53624NnV) {
        if (abstractC53624NnV instanceof N1A) {
            return "connection_error";
        }
        if (abstractC53624NnV instanceof N1C) {
            return "stream_start_error";
        }
        if (abstractC53624NnV instanceof N1D) {
            return "stream_error";
        }
        if (abstractC53624NnV instanceof N1E) {
            return "telemetry_error";
        }
        AbstractC195978lm.A02.A04("sup:SUPMediaStreamFalcoLoggerImpl", "MediaStreamErrorEvent not valid type", null);
        return "connection_error";
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.Nni] */
    public N10(InterfaceC02550Ad interfaceC02550Ad) {
        this.A08 = interfaceC02550Ad;
    }

    public static final EnumC53334Nik A00(String str) {
        for (EnumC53334Nik enumC53334Nik : EnumC53334Nik.values()) {
            if (C14360o3.A0K(enumC53334Nik.A00, str)) {
                return enumC53334Nik;
            }
        }
        return null;
    }

    public static final EnumC53335Nil A01(String str) {
        for (EnumC53335Nil enumC53335Nil : EnumC53335Nil.values()) {
            if (C14360o3.A0K(enumC53335Nil.A00, str)) {
                return enumC53335Nil;
            }
        }
        return null;
    }

    public static final String A02(C45127Jxw c45127Jxw) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        String str = c45127Jxw.A01;
        if (str != null) {
            A1C.append(str);
        }
        if (str != null && c45127Jxw.A00 != null) {
            A1C.append('\n');
            A1C.append('\n');
        }
        Throwable th = (Throwable) c45127Jxw.A00;
        if (th != null) {
            StringWriter A0O = AbstractC37300Gc1.A0O();
            PrintWriter printWriter = new PrintWriter(A0O);
            th.printStackTrace(printWriter);
            printWriter.flush();
            Iterator it = AbstractC001800i.A0d(AbstractC001900j.A0O(AbstractC25228BEl.A1A(AbstractC166987dD.A19(A0O))), 30).iterator();
            while (it.hasNext()) {
                A1C.append(AbstractC166987dD.A1B(it));
                A1C.append('\n');
            }
        }
        return AbstractC166987dD.A19(A1C);
    }

    public static final String A05(Integer num) {
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2 && intValue != 4) {
                    if (intValue == 3) {
                        return "LINK_SWITCH";
                    }
                    throw B4Z.A00();
                }
                return "BTC";
            }
            return "BLE";
        }
        return "TCP";
    }
}
