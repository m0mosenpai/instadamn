package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressStorySender;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Collection;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1jh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34431jh implements InterfaceC29301b7 {
    public static final C0KV A09 = C34441ji.A00;
    public final UserSession A00;
    public final C2DS A01;
    public final InterfaceC09390do A05 = AbstractC09440dt.A01(new MHR(this, 20));
    public final InterfaceC09390do A06 = AbstractC09440dt.A01(new MHR(this, 21));
    public final InterfaceC09390do A08 = AbstractC09440dt.A01(new MHR(this, 23));
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(new MHR(this, 18));
    public final InterfaceC09390do A07 = AbstractC09440dt.A01(new MHR(this, 22));
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new MHR(this, 17));
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(new MHR(this, 19));

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        C14360o3.A0B(abstractC29011ae, 0);
        C14360o3.A0B(mnp, 1);
        return LCX.A01(mnp, abstractC29011ae, this.A01);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x006f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.54r, java.lang.Object] */
    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        LAC A00;
        C206409Bx c206409Bx;
        ImmutableList copyOf;
        Enum A002;
        StringBuilder sb;
        String str;
        String str2;
        C910143t c910143t;
        String str3;
        C910143t c910143t2;
        String str4;
        C910143t c910143t3;
        String str5;
        C910143t c910143t4;
        String str6;
        C910143t c910143t5;
        String str7;
        C910143t c910143t6;
        String optString;
        C34411jf c34411jf = (C34411jf) c1ow;
        C14360o3.A0B(c34411jf, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        C2EY c2ey = c34411jf.A08().A10;
        F5I f5i = F5I.$redex_init_class;
        int ordinal = c2ey.ordinal();
        if (ordinal != 11) {
            if (ordinal != 98) {
                if (ordinal != 57) {
                    sb = new StringBuilder();
                    sb.append("forwarding a ");
                    A002 = c34411jf.A08().A10;
                } else {
                    A002 = EnumC46252KdU.A00(c34411jf.A08().A0o());
                    EnumC46251KdT A003 = EnumC46251KdT.A00(c34411jf.A08().A0m());
                    if (A002 != null) {
                        switch (A002.ordinal()) {
                            case 2:
                                ArmadilloExpressStorySender armadilloExpressStorySender = (ArmadilloExpressStorySender) this.A08.getValue();
                                try {
                                    JSONObject jSONObject = new JSONObject(c34411jf.A08().A1o);
                                    if (jSONObject.optString("__typename").hashCode() == 221584371) {
                                        UserSession userSession = armadilloExpressStorySender.A02;
                                        if (AbstractC453326q.A03(userSession) && AbstractC453326q.A05(userSession, "send_story_share_message")) {
                                            C25972BeM c25972BeM = new C25972BeM();
                                            c25972BeM.A00("story_igid", jSONObject.optString("story_igid"));
                                            C25975BeP c25975BeP = new C25975BeP(c25972BeM, "XMSGIgReceiverFetchXmaStoryFetchParams");
                                            C25974BeO c25974BeO = new C25974BeO();
                                            c25974BeO.A02(EnumC46251KdT.A00(c34411jf.A08().A0m()));
                                            c25974BeO.A01(EnumC46252KdU.A00(c34411jf.A08().A0o()));
                                            c25974BeO.A00("target_url", AbstractC158887Ba.A00(c34411jf.A08()).A0w);
                                            c25974BeO.A04(c34411jf.A08().A0n());
                                            c25974BeO.A03(c25975BeP);
                                            AbstractC46926Kp7.A00(userSession).A03(new C44920JuY(c25974BeO.A00), c34411jf.A07(), interfaceC37261GbE, c34411jf, null);
                                            return;
                                        }
                                    }
                                    ImmutableList A0H = c34411jf.A08().A0H();
                                    if (A0H != null && (c910143t2 = (C910143t) A0H.get(0)) != null) {
                                        str3 = c910143t2.A0w;
                                    } else {
                                        str3 = null;
                                    }
                                    AbstractC46926Kp7.A00(armadilloExpressStorySender.A02).A01(new C206409Bx(str3), interfaceC37261GbE, c34411jf);
                                    return;
                                } catch (JSONException e) {
                                    e = e;
                                    interfaceC37261GbE.DUq(C114675Fx.A0K, null);
                                    str = "ArmadilloExpressStorySender";
                                    C0K8.A0G(str, "Malformed JSON object for receiver fetch params", e);
                                    return;
                                }
                            case 3:
                                C47415Kx6 c47415Kx6 = (C47415Kx6) this.A06.getValue();
                                try {
                                    JSONObject jSONObject2 = new JSONObject(c34411jf.A08().A1o);
                                    if (jSONObject2.optString("__typename").hashCode() == -1051647809) {
                                        UserSession userSession2 = c47415Kx6.A00;
                                        if (AbstractC453326q.A03(userSession2) && AbstractC453326q.A05(userSession2, "send_profile_share_message")) {
                                            C25969BeJ c25969BeJ = new C25969BeJ();
                                            c25969BeJ.A00("igid", jSONObject2.optString("igid"));
                                            C25975BeP c25975BeP2 = new C25975BeP(c25969BeJ, "XMSGIgReceiverFetchXmaProfileFetchParams");
                                            C25974BeO c25974BeO2 = new C25974BeO();
                                            c25974BeO2.A02(EnumC46251KdT.A00(c34411jf.A08().A0m()));
                                            c25974BeO2.A01(EnumC46252KdU.A00(c34411jf.A08().A0o()));
                                            c25974BeO2.A00("target_url", AbstractC158887Ba.A00(c34411jf.A08()).A0w);
                                            c25974BeO2.A04(c34411jf.A08().A0n());
                                            c25974BeO2.A03(c25975BeP2);
                                            AbstractC46926Kp7.A00(userSession2).A03(new C44920JuY(c25974BeO2.A00), c34411jf.A07(), interfaceC37261GbE, c34411jf, null);
                                            return;
                                        }
                                    }
                                    ImmutableList A0H2 = c34411jf.A08().A0H();
                                    if (A0H2 != null && (c910143t = (C910143t) A0H2.get(0)) != null) {
                                        str2 = c910143t.A0w;
                                    } else {
                                        str2 = null;
                                    }
                                    AbstractC46926Kp7.A00(c47415Kx6.A00).A01(new C206409Bx(str2), interfaceC37261GbE, c34411jf);
                                    return;
                                } catch (JSONException e2) {
                                    e = e2;
                                    interfaceC37261GbE.DUq(C114675Fx.A0K, null);
                                    str = "ArmadilloExpressProfileShareSender";
                                    C0K8.A0G(str, "Malformed JSON object for receiver fetch params", e);
                                    return;
                                }
                            case 4:
                                C47410Kwz c47410Kwz = (C47410Kwz) this.A02.getValue();
                                try {
                                    JSONObject jSONObject3 = new JSONObject(c34411jf.A08().A1o);
                                    if (jSONObject3.optString("__typename").hashCode() == 1959039784) {
                                        UserSession userSession3 = c47410Kwz.A00;
                                        if (AbstractC453326q.A03(userSession3) && AbstractC453326q.A05(userSession3, "send_reel_share_message")) {
                                            C25963BeC c25963BeC = new C25963BeC();
                                            c25963BeC.A00("media_igid", jSONObject3.optString("media_igid"));
                                            C25975BeP c25975BeP3 = new C25975BeP(c25963BeC, "XMSGIgReceiverFetchXmaClipFetchParams");
                                            C25974BeO c25974BeO3 = new C25974BeO();
                                            c25974BeO3.A02(EnumC46251KdT.A00(c34411jf.A08().A0m()));
                                            c25974BeO3.A01(EnumC46252KdU.A00(c34411jf.A08().A0o()));
                                            c25974BeO3.A00("target_url", AbstractC158887Ba.A00(c34411jf.A08()).A0w);
                                            c25974BeO3.A04(c34411jf.A08().A0n());
                                            c25974BeO3.A03(c25975BeP3);
                                            AbstractC46926Kp7.A00(userSession3).A03(new C44920JuY(c25974BeO3.A00), c34411jf.A07(), interfaceC37261GbE, c34411jf, null);
                                            return;
                                        }
                                    }
                                    ImmutableList A0H3 = c34411jf.A08().A0H();
                                    if (A0H3 != null && (c910143t4 = (C910143t) A0H3.get(0)) != null) {
                                        str5 = c910143t4.A0w;
                                    } else {
                                        str5 = null;
                                    }
                                    AbstractC46926Kp7.A00(c47410Kwz.A00).A01(new C206409Bx(str5), interfaceC37261GbE, c34411jf);
                                    return;
                                } catch (JSONException e3) {
                                    e = e3;
                                    interfaceC37261GbE.DUq(C114675Fx.A0K, null);
                                    str = "ArmadilloExpressClipsShareSender";
                                    C0K8.A0G(str, "Malformed JSON object for receiver fetch params", e);
                                    return;
                                }
                            case 5:
                                if (A003 == EnumC46251KdT.SHARE || A003 == EnumC46251KdT.MENTION) {
                                    Kx4 kx4 = (Kx4) this.A05.getValue();
                                    try {
                                        JSONObject jSONObject4 = new JSONObject(c34411jf.A08().A1o);
                                        if (jSONObject4.optString("__typename").hashCode() == 1055290394) {
                                            UserSession userSession4 = kx4.A00;
                                            if (AbstractC453326q.A03(userSession4) && (AbstractC453326q.A05(userSession4, "send_media_share_message") || AbstractC453326q.A05(userSession4, "send_media_mention_message"))) {
                                                BeE beE = new BeE();
                                                beE.A00("media_igid", jSONObject4.optString("media_igid"));
                                                if (jSONObject4.isNull("carousel_share_child_media_igid")) {
                                                    optString = null;
                                                } else {
                                                    optString = jSONObject4.optString("carousel_share_child_media_igid");
                                                }
                                                beE.A00("carousel_share_child_media_igid", optString);
                                                C25975BeP c25975BeP4 = new C25975BeP(beE, "XMSGIgReceiverFetchXmaFeedFetchParams");
                                                C25974BeO c25974BeO4 = new C25974BeO();
                                                c25974BeO4.A02(EnumC46251KdT.A00(c34411jf.A08().A0m()));
                                                c25974BeO4.A01(EnumC46252KdU.A00(c34411jf.A08().A0o()));
                                                c25974BeO4.A00("target_url", AbstractC158887Ba.A00(c34411jf.A08()).A0w);
                                                c25974BeO4.A04(c34411jf.A08().A0n());
                                                c25974BeO4.A03(c25975BeP4);
                                                AbstractC46926Kp7.A00(userSession4).A03(new C44920JuY(c25974BeO4.A00), c34411jf.A07(), interfaceC37261GbE, c34411jf, null);
                                                return;
                                            }
                                        }
                                        ImmutableList A0H4 = c34411jf.A08().A0H();
                                        if (A0H4 != null && (c910143t6 = (C910143t) A0H4.get(0)) != null) {
                                            str7 = c910143t6.A0w;
                                        } else {
                                            str7 = null;
                                        }
                                        AbstractC46926Kp7.A00(kx4.A00).A01(new C206409Bx(str7), interfaceC37261GbE, c34411jf);
                                        return;
                                    } catch (JSONException e4) {
                                        e = e4;
                                        interfaceC37261GbE.DUq(C114675Fx.A0K, null);
                                        str = "ArmadilloExpressMediaShareSender";
                                        C0K8.A0G(str, "Malformed JSON object for receiver fetch params", e);
                                        return;
                                    }
                                }
                                interfaceC37261GbE.DUq(C114675Fx.A0L, null);
                                return;
                            case 6:
                                C47413Kx2 c47413Kx2 = (C47413Kx2) this.A04.getValue();
                                try {
                                    JSONObject jSONObject5 = new JSONObject(c34411jf.A08().A1o);
                                    if (jSONObject5.optString("__typename").hashCode() == -1075368948) {
                                        UserSession userSession5 = c47413Kx2.A00;
                                        if (AbstractC453326q.A03(userSession5) && AbstractC453326q.A05(userSession5, "send_live_viewer_invite_message")) {
                                            C25965BeF c25965BeF = new C25965BeF();
                                            c25965BeF.A00("live_igid", jSONObject5.optString("live_igid"));
                                            C25975BeP c25975BeP5 = new C25975BeP(c25965BeF, "XMSGIgReceiverFetchXmaLiveFetchParams");
                                            C25974BeO c25974BeO5 = new C25974BeO();
                                            c25974BeO5.A02(EnumC46251KdT.A00(c34411jf.A08().A0m()));
                                            c25974BeO5.A01(EnumC46252KdU.A00(c34411jf.A08().A0o()));
                                            c25974BeO5.A00("target_url", AbstractC158887Ba.A00(c34411jf.A08()).A0w);
                                            c25974BeO5.A04(c34411jf.A08().A0n());
                                            c25974BeO5.A03(c25975BeP5);
                                            AbstractC46926Kp7.A00(userSession5).A03(new C44920JuY(c25974BeO5.A00), c34411jf.A07(), interfaceC37261GbE, c34411jf, null);
                                            return;
                                        }
                                    }
                                    ImmutableList A0H5 = c34411jf.A08().A0H();
                                    if (A0H5 != null && (c910143t5 = (C910143t) A0H5.get(0)) != null) {
                                        str6 = c910143t5.A0w;
                                    } else {
                                        str6 = null;
                                    }
                                    AbstractC46926Kp7.A00(c47413Kx2.A00).A01(new C206409Bx(str6), interfaceC37261GbE, c34411jf);
                                    return;
                                } catch (JSONException e5) {
                                    e = e5;
                                    interfaceC37261GbE.DUq(C114675Fx.A0K, null);
                                    str = "ArmadilloExpressLiveViewerInviteMessageSender";
                                    C0K8.A0G(str, "Malformed JSON object for receiver fetch params", e);
                                    return;
                                }
                            case 9:
                                C47416Kx7 c47416Kx7 = (C47416Kx7) this.A07.getValue();
                                try {
                                    JSONObject jSONObject6 = new JSONObject(c34411jf.A08().A1o);
                                    if (jSONObject6.optString("__typename").hashCode() == 353262747) {
                                        UserSession userSession6 = c47416Kx7.A00;
                                        if (AbstractC453326q.A03(userSession6) && AbstractC453326q.A05(userSession6, "send_reels_audio_share_message")) {
                                            C25970BeK c25970BeK = new C25970BeK();
                                            c25970BeK.A00("audio_igid", jSONObject6.optString("audio_igid"));
                                            C25975BeP c25975BeP6 = new C25975BeP(c25970BeK, "XMSGIgReceiverFetchXmaReelsAudioFetchParams");
                                            C25974BeO c25974BeO6 = new C25974BeO();
                                            c25974BeO6.A02(EnumC46251KdT.A00(c34411jf.A08().A0m()));
                                            c25974BeO6.A01(EnumC46252KdU.A00(c34411jf.A08().A0o()));
                                            c25974BeO6.A00("target_url", AbstractC158887Ba.A00(c34411jf.A08()).A0w);
                                            c25974BeO6.A04(c34411jf.A08().A0n());
                                            c25974BeO6.A03(c25975BeP6);
                                            AbstractC46926Kp7.A00(userSession6).A03(new C44920JuY(c25974BeO6.A00), c34411jf.A07(), interfaceC37261GbE, c34411jf, null);
                                            return;
                                        }
                                    }
                                    ImmutableList A0H6 = c34411jf.A08().A0H();
                                    if (A0H6 != null && (c910143t3 = (C910143t) A0H6.get(0)) != null) {
                                        str4 = c910143t3.A0w;
                                    } else {
                                        str4 = null;
                                    }
                                    AbstractC46926Kp7.A00(c47416Kx7.A00).A01(new C206409Bx(str4), interfaceC37261GbE, c34411jf);
                                    return;
                                } catch (JSONException e6) {
                                    e = e6;
                                    interfaceC37261GbE.DUq(C114675Fx.A0K, null);
                                    str = "ArmadilloExpressReelsAudioShareSender";
                                    C0K8.A0G(str, "Malformed JSON object for receiver fetch params", e);
                                    return;
                                }
                        }
                    }
                    sb = new StringBuilder();
                    sb.append("forwarding a ");
                }
                sb.append(A002);
                sb.append(" type is not supported yet");
                C0K8.A0D("DirectForwardContentRefMutationProcessor", sb.toString());
                interfaceC37261GbE.DUq(C114675Fx.A0L, null);
                return;
            }
            UserSession userSession7 = this.A00;
            if (AbstractC453326q.A03(userSession7) && AbstractC453326q.A05(userSession7, "send_link_message")) {
                ArmadilloExpressLinkMessageSender armadilloExpressLinkMessageSender = (ArmadilloExpressLinkMessageSender) this.A03.getValue();
                C206409Bx c206409Bx2 = new C206409Bx();
                C910143t A01 = AbstractC158887Ba.A01(c34411jf.A08());
                if (A01 != null) {
                    String str8 = c34411jf.A08().A1q;
                    if (str8 == null) {
                        str8 = A01.A0w;
                    }
                    c206409Bx2.A01 = str8;
                    ?? obj = new Object();
                    String str9 = A01.A1Q;
                    if (str9 != null) {
                        obj.A03 = str9;
                        String str10 = A01.A0w;
                        if (str10 != null) {
                            obj.A05 = str10;
                            String str11 = A01.A1O;
                            if (str11 != null) {
                                obj.A04 = str11;
                            }
                            ExtendedImageUrl extendedImageUrl = A01.A0X;
                            if (extendedImageUrl != null) {
                                obj.A00 = extendedImageUrl;
                            }
                            String str12 = A01.A1H;
                            if (str12 != null) {
                                obj.A01 = str12;
                            }
                            List list = A01.A1f;
                            if (list != null && (copyOf = ImmutableList.copyOf((Collection) list)) != null) {
                                obj.A06 = copyOf;
                            }
                            String str13 = A01.A0v;
                            if (str13 != null) {
                                obj.A02 = str13;
                            }
                            c206409Bx2.A00 = obj;
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                armadilloExpressLinkMessageSender.A06(c34411jf.A07(), interfaceC37261GbE, new C29481bP(c206409Bx2, null, ((C1OW) c34411jf).A02, null, (DirectThreadKey) c34411jf.C7R().get(0), ((AbstractC29011ae) c34411jf).A02, NetInfoModule.CONNECTION_TYPE_NONE, ((AbstractC29011ae) c34411jf).A00, false, false));
                return;
            }
            A00 = AbstractC46926Kp7.A00(userSession7);
            c206409Bx = new C206409Bx(c34411jf.A08().A1q);
        } else {
            A00 = AbstractC46926Kp7.A00(this.A00);
            Object obj2 = c34411jf.A08().A1T;
            C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.direct.model.DirectLink");
            c206409Bx = (C206409Bx) obj2;
        }
        A00.A01(c206409Bx, interfaceC37261GbE, c34411jf);
    }

    public C34431jh(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
    }
}
