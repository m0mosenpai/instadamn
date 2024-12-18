package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.rtc.RtcCallAudience;
import com.instagram.model.rtc.RtcCallSource;
import com.instagram.model.rtc.RtcCreateCallArgs;
import com.instagram.model.rtc.RtcThreadKey;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;
import java.util.List;
import java.util.Map;

/* renamed from: X.9DL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9DL extends AbstractC23611Dp implements InterfaceC16620sF {
    public Object A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DL(Object obj, Object obj2, Object obj3, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A04 = obj3;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        Object obj4;
        int i;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        int i2;
        switch (this.A01) {
            case 0:
                obj4 = this.A04;
                obj3 = this.A02;
                obj2 = this.A03;
                i = 0;
                break;
            case 1:
                obj4 = this.A04;
                obj3 = this.A02;
                obj2 = this.A03;
                i = 1;
                break;
            case 2:
                obj2 = this.A03;
                obj3 = this.A02;
                obj4 = this.A04;
                i = 2;
                break;
            case 3:
                obj5 = this.A04;
                obj6 = this.A03;
                obj7 = this.A02;
                obj8 = this.A00;
                i2 = 3;
                return new C9DL(obj5, obj6, obj7, obj8, interfaceC23621Ds, i2);
            default:
                obj7 = this.A02;
                obj5 = this.A04;
                obj6 = this.A03;
                obj8 = this.A00;
                i2 = 4;
                return new C9DL(obj5, obj6, obj7, obj8, interfaceC23621Ds, i2);
        }
        C9DL c9dl = new C9DL(obj2, obj3, obj4, interfaceC23621Ds, i);
        c9dl.A00 = obj;
        return c9dl;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C9DL) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        EnumC222719sC enumC222719sC;
        C7V1 c7v1;
        C89F c89f;
        C55208OeM c55208OeM;
        C5TA c5ta;
        C55061OaG c55061OaG;
        Context context;
        UserSession userSession;
        String str;
        String str2;
        RtcCreateCallArgs rtcCreateCallArgs;
        String str3;
        String str4;
        Bundle bundle;
        RtcConnectionEntity.EndCallConnectionEntity endCallConnectionEntity;
        switch (this.A01) {
            case 0:
                AbstractC09560e7.A00(obj);
                int ordinal = ((EnumC1828289c) this.A00).ordinal();
                if (ordinal != 3) {
                    if (ordinal != 2) {
                        if (ordinal != 1) {
                            C89F c89f2 = (C89F) this.A04;
                            AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A02;
                            C89P c89p = (C89P) this.A03;
                            if (ordinal != 4) {
                                C89F.A00(abstractC59962oe, c89f2, c89p, false);
                            } else {
                                C89F.A00(abstractC59962oe, c89f2, c89p, false);
                                if (c89f2.A0B()) {
                                    c89f2.A06();
                                }
                            }
                        } else {
                            C89P c89p2 = (C89P) this.A03;
                            boolean A0H = c89p2.A0H();
                            C89F c89f3 = (C89F) this.A04;
                            if (A0H) {
                                C89F.A03(c89f3);
                            } else {
                                C89F.A05(c89f3, c89p2);
                                c89f3.A0P.A05("template preview resumed");
                            }
                            c89f3.A0V.A01();
                            C89F.A00((AbstractC59962oe) this.A02, c89f3, c89p2, true);
                        }
                        return C0eB.A00;
                    }
                    c89f = (C89F) this.A04;
                    c89f.A0P.A05("template preview resumed");
                    c89f.A0V.A01();
                    c89f.A0U.setVisibility(0);
                } else {
                    c89f = (C89F) this.A04;
                    c89f.A0P.A04("template builder paused");
                    c89f.A0U.setVisibility(4);
                    C89N c89n = c89f.A0V;
                    C221849qn c221849qn = c89n.A00;
                    if (c221849qn != null && (c5ta = c221849qn.A00) != null) {
                        c5ta.A09("auto");
                    }
                    C22947A9r c22947A9r = c89n.A01;
                    if (c22947A9r != null && (c55208OeM = c22947A9r.A00) != null) {
                        c55208OeM.A05();
                    }
                }
                C89F.A00((AbstractC59962oe) this.A02, c89f, (C89P) this.A03, false);
                return C0eB.A00;
            case 1:
                AbstractC09560e7.A00(obj);
                C19L c19l = (C19L) this.A00;
                AbstractC09800fd.A01("IgRunnableId.PRELOAD_MESSAGES", -152462056);
                try {
                    C164087Vx c164087Vx = (C164087Vx) this.A04;
                    C2DS c2ds = c164087Vx.A0A;
                    DirectThreadKey directThreadKey = (DirectThreadKey) this.A02;
                    C81663kb B3U = c2ds.B3U(directThreadKey);
                    List A00 = c164087Vx.A08.A00(B3U, directThreadKey);
                    if (AnonymousClass194.A07(c19l)) {
                        List A002 = C164087Vx.A00(c164087Vx, (C7TT) this.A03, B3U, A00);
                        if (AnonymousClass194.A07(c19l)) {
                            c164087Vx.A02 = new C09530e4(A00, A002);
                            if (C18U.A06(C06090Tz.A05, c164087Vx.A07, 36318033003681610L) && (c7v1 = c164087Vx.A01) != null) {
                                c7v1.DTN(A002);
                            }
                        }
                    }
                    AbstractC09800fd.A00(80293609);
                    return C0eB.A00;
                } catch (Throwable th) {
                    AbstractC09800fd.A00(-279385194);
                    throw th;
                }
            case 2:
                AbstractC09560e7.A00(obj);
                C19L c19l2 = (C19L) this.A00;
                UserSession userSession2 = (UserSession) this.A03;
                C81663kb c81663kb = (C81663kb) this.A02;
                if (Systrace.A0E(1L)) {
                    C0fO.A01("DirectInboxImagePrefetcher.prefetchAvatarImagesAsync", -987059310);
                }
                try {
                    C3AY A003 = C4GQ.A00(userSession2, c81663kb);
                    C4AB.A00((ImageUrl) A003.A00, c19l2);
                    C4AB.A00((ImageUrl) A003.A01, c19l2);
                    C0eB c0eB = C0eB.A00;
                    if (!Systrace.A0E(1L)) {
                        return c0eB;
                    }
                    C0fO.A00(727405025);
                    return c0eB;
                } catch (Throwable th2) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-2065847136);
                    }
                    throw th2;
                }
            case 3:
                AbstractC09560e7.A00(obj);
                Map map = ((ContentFilterEngineImpl) this.A04).A05;
                ContentFilterDictionaryImpl contentFilterDictionaryImpl = (ContentFilterDictionaryImpl) this.A03;
                InterfaceC2040891d interfaceC2040891d = (InterfaceC2040891d) map.get(contentFilterDictionaryImpl);
                if (interfaceC2040891d != null) {
                    List list = (List) this.A02;
                    List list2 = (List) this.A00;
                    C006802i.A0p.markerStart(893650399);
                    interfaceC2040891d.FBi(list, list2, AbstractC001800i.A0a(ContentFilterDictionaryImpl.A00(contentFilterDictionaryImpl.A0B)));
                    int size = list.size();
                    int size2 = list2.size();
                    String str5 = contentFilterDictionaryImpl.A0A;
                    C006802i c006802i = C006802i.A0p;
                    if (size > 0) {
                        if (size2 > 0) {
                            enumC222719sC = EnumC222719sC.A03;
                        } else {
                            enumC222719sC = EnumC222719sC.A02;
                        }
                    } else {
                        enumC222719sC = EnumC222719sC.A04;
                    }
                    c006802i.markerAnnotate(893650399, C2044292z.A00(EnumC2041191g.A0A), C2044292z.A00(enumC222719sC));
                    c006802i.markerAnnotate(893650399, C2044292z.A00(EnumC2041191g.A05), C2044292z.A00(interfaceC2040891d.C2Y()));
                    c006802i.markerAnnotate(893650399, C2044292z.A00(EnumC2041191g.A07), interfaceC2040891d.BYG());
                    c006802i.markerAnnotate(893650399, C2044292z.A00(EnumC2041191g.A08), size);
                    c006802i.markerAnnotate(893650399, C2044292z.A00(EnumC2041191g.A09), size2);
                    c006802i.markerAnnotate(893650399, C2044292z.A00(EnumC2041191g.A02), str5);
                    c006802i.markerEnd(893650399, (short) 2);
                    return C0eB.A00;
                }
                return null;
            default:
                AbstractC09560e7.A00(obj);
                RtcConnectionEntity rtcConnectionEntity = (RtcConnectionEntity) this.A02;
                if (rtcConnectionEntity instanceof RtcConnectionEntity.RtcCallConnectionEntity) {
                    C1WB c1wb = (C1WB) this.A04;
                    c55061OaG = (C55061OaG) c1wb.A08.getValue();
                    context = c1wb.A01;
                    userSession = (UserSession) this.A03;
                    RtcConnectionEntity.RtcCallConnectionEntity rtcCallConnectionEntity = (RtcConnectionEntity.RtcCallConnectionEntity) rtcConnectionEntity;
                    C14360o3.A0B(context, 0);
                    C14360o3.A0B(userSession, 1);
                    C14360o3.A0B(rtcCallConnectionEntity, 2);
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("com.instagram.rtc.notifications.service.entity", rtcCallConnectionEntity);
                    Integer num = rtcCallConnectionEntity.A08;
                    C36731nW c36731nW = C3EG.A00().A00;
                    EnumC53137Neq enumC53137Neq = rtcCallConnectionEntity.A01;
                    str = rtcCallConnectionEntity.A00();
                    str2 = rtcCallConnectionEntity.A0D;
                    String str6 = str2;
                    if (str2 == null) {
                        str6 = "";
                    }
                    boolean z = rtcCallConnectionEntity.A0N;
                    String str7 = rtcCallConnectionEntity.A0C;
                    if (str7 == null) {
                        str7 = "";
                    }
                    RtcCallAudience A004 = c36731nW.A00(context, userSession, num, str, str6, str7, rtcCallConnectionEntity.A0B, z);
                    if (A004 == null) {
                        rtcCreateCallArgs = null;
                    } else {
                        C7T3 c7t3 = C7T3.A0L;
                        String str8 = str;
                        if (str == null) {
                            str8 = "";
                        }
                        rtcCreateCallArgs = new RtcCreateCallArgs(null, enumC53137Neq, A004, null, new RtcCallSource(null, c7t3, new RtcThreadKey(str8, null, null, null, null)), rtcCallConnectionEntity.A04, null, OPw.A01(rtcCallConnectionEntity), 1910377639, !rtcCallConnectionEntity.A0L, false, false);
                    }
                    str3 = rtcCallConnectionEntity.A0G;
                    str4 = rtcCallConnectionEntity.A0F;
                    endCallConnectionEntity = rtcCallConnectionEntity;
                    bundle = bundle2;
                } else {
                    if (rtcConnectionEntity instanceof RtcConnectionEntity.EndCallConnectionEntity) {
                        C1WB c1wb2 = (C1WB) this.A04;
                        c55061OaG = (C55061OaG) c1wb2.A08.getValue();
                        context = c1wb2.A01;
                        userSession = (UserSession) this.A03;
                        RtcConnectionEntity.EndCallConnectionEntity endCallConnectionEntity2 = (RtcConnectionEntity.EndCallConnectionEntity) rtcConnectionEntity;
                        C14360o3.A0B(context, 0);
                        C14360o3.A0B(userSession, 1);
                        C14360o3.A0B(endCallConnectionEntity2, 2);
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("com.instagram.rtc.notifications.service.entity", endCallConnectionEntity2);
                        Integer num2 = endCallConnectionEntity2.A05;
                        C36731nW c36731nW2 = C3EG.A00().A00;
                        EnumC53137Neq enumC53137Neq2 = endCallConnectionEntity2.A00;
                        str = endCallConnectionEntity2.A0F;
                        str2 = endCallConnectionEntity2.A0A;
                        String str9 = str2;
                        if (str2 == null) {
                            str9 = "";
                        }
                        boolean z2 = endCallConnectionEntity2.A0H;
                        String str10 = endCallConnectionEntity2.A09;
                        if (str10 == null) {
                            str10 = "";
                        }
                        String str11 = endCallConnectionEntity2.A08;
                        if (str11 == null) {
                            str11 = "";
                        }
                        RtcCallAudience A005 = c36731nW2.A00(context, userSession, num2, str, str9, str10, str11, z2);
                        if (A005 == null) {
                            rtcCreateCallArgs = null;
                        } else {
                            C7T3 c7t32 = C7T3.A0L;
                            String str12 = str;
                            if (str == null) {
                                str12 = "";
                            }
                            rtcCreateCallArgs = new RtcCreateCallArgs(null, enumC53137Neq2, A005, null, new RtcCallSource(null, c7t32, new RtcThreadKey(str12, null, null, null, null)), endCallConnectionEntity2.A01, null, OPw.A01(endCallConnectionEntity2), 1910377639, !endCallConnectionEntity2.A0G, false, false);
                        }
                        str3 = endCallConnectionEntity2.A0C;
                        str4 = endCallConnectionEntity2.A0B;
                        endCallConnectionEntity = endCallConnectionEntity2;
                        bundle = bundle3;
                    }
                    ((InterfaceC58275PsT) this.A00).AIo("notif_displayed");
                    OXE oxe = OXE.A00;
                    StringBuilder sb = new StringBuilder();
                    sb.append("showMissedCallNotification(");
                    sb.append(rtcConnectionEntity);
                    sb.append(')');
                    oxe.A00("RtcCallSignalingProcessor", sb.toString());
                    return C0eB.A00;
                }
                C55061OaG.A00(context, bundle, userSession, rtcCreateCallArgs, c55061OaG, str, str3, str2, str4, OPw.A01(endCallConnectionEntity));
                ((InterfaceC58275PsT) this.A00).AIo("notif_displayed");
                OXE oxe2 = OXE.A00;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("showMissedCallNotification(");
                sb2.append(rtcConnectionEntity);
                sb2.append(')');
                oxe2.A00("RtcCallSignalingProcessor", sb2.toString());
                return C0eB.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DL(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A04 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A00 = obj4;
    }
}
