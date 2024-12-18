package X;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.commonavatarliveediting.prefetch.CommonBloksActionHelper$onLiveEditorPrefetchAssetsActionExtended$$inlined$CoroutineExceptionHandler$1;
import com.facebook.commonavatarliveediting.prefetch.CommonBloksActionHelper$onLiveEditorPrefetchAssetsActionExtended$3;
import com.facebook.commonavatarliveediting.prefetch.CommonCdlProviderHolder;
import com.facebook.fbavatar.cdsavatareditor.liveediting.ig.IgCdlProviderBuilder;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.Nqp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53799Nqp {
    /* JADX WARN: Multi-variable type inference failed */
    public static final EnumC53182Nfe A00(C6FQ c6fq, C6FW c6fw) {
        C55643OnT c55643OnT;
        boolean z;
        C51737MtK A01;
        Object obj;
        boolean z2;
        Boolean bool;
        Map map;
        String str;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        C55069OaP c55069OaP = C55069OaP.A0A;
        if (c55069OaP == null) {
            c55069OaP = new C55069OaP();
            C55069OaP.A0A = c55069OaP;
        }
        UserSession A0S = AbstractC31177DnL.A0S(c6fq);
        O1H o1h = new O1H(A0S);
        C006802i A0N = AbstractC43592JPx.A0N();
        C54772OIl c54772OIl = C54772OIl.A03;
        if (c54772OIl == null) {
            c54772OIl = new C54772OIl();
            C54772OIl.A03 = c54772OIl;
        }
        AbstractC167017dG.A1N(A0S, o1h);
        IgCdlProviderBuilder igCdlProviderBuilder = IgCdlProviderBuilder.A06;
        if (igCdlProviderBuilder == null) {
            igCdlProviderBuilder = new IgCdlProviderBuilder(o1h, A0S);
            IgCdlProviderBuilder.A06 = igCdlProviderBuilder;
        }
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            Context context = c6fg.A00;
            CommonCdlProviderHolder A00 = AbstractC53675NoQ.A00(context, igCdlProviderBuilder);
            C19K A0v = MSY.A0v();
            C54775OIo c54775OIo = new C54775OIo(o1h, A0S, A0v);
            C14360o3.A0B(A0S, 0);
            O6V o6v = O6V.A01;
            if (o6v == null) {
                o6v = new O6V(A0S);
                O6V.A01 = o6v;
            }
            String str2 = null;
            C14360o3.A0B(c54772OIl, 3);
            C14360o3.A0B(A00, 5);
            C14360o3.A0B(igCdlProviderBuilder, 6);
            C14360o3.A0B(o6v, 7);
            c55069OaP.A00 = o1h;
            c55069OaP.A06 = c54772OIl;
            c55069OaP.A07 = A0N;
            c55069OaP.A02 = A00;
            c55069OaP.A04 = igCdlProviderBuilder;
            c55069OaP.A08 = A0v;
            c55069OaP.A05 = c54775OIo;
            C53676NoR c53676NoR = C55643OnT.A06;
            OWV A002 = OWV.A06.A00(o6v);
            synchronized (c53676NoR) {
                C14360o3.A0B(A002, 0);
                c55643OnT = C55643OnT.A05;
                if (c55643OnT == null) {
                    c55643OnT = new C55643OnT(context, A002);
                    C55643OnT.A05 = c55643OnT;
                }
            }
            c55069OaP.A01 = c55643OnT;
            OMg oMg = new OMg(new C51753Mtc(231946607, 2, 1), A0N);
            c55069OaP.A03 = new O1N(o1h);
            try {
                int i3 = oMg.A01;
                int i4 = oMg.A00;
                QuickPerformanceLogger quickPerformanceLogger = AbstractC54324Nzi.A00;
                if (quickPerformanceLogger != null) {
                    quickPerformanceLogger.markerStart(i3, i4);
                    O1H o1h2 = c55069OaP.A00;
                    if (o1h2 == null) {
                        C14360o3.A0F("avatarEmbodimentSupport");
                    } else {
                        UserSession userSession = o1h2.A00;
                        C06090Tz c06090Tz = C06090Tz.A05;
                        if (!C18U.A06(c06090Tz, userSession, 36317646454592958L)) {
                            oMg.A04("PREFETCH_NOT_ENABLED", (short) 4);
                            return EnumC53182Nfe.A06;
                        }
                        List list = c6fw.A00;
                        C51687MsI c51687MsI = new C51687MsI((Map) list.get(8));
                        if (!c55069OaP.A02(c51687MsI)) {
                            oMg.A04("NETWORK_NOT_SUPPORTED", (short) 4);
                            return EnumC53182Nfe.A05;
                        }
                        Map map2 = (Map) list.get(10);
                        if (map2 == null) {
                            z = false;
                        } else {
                            z3 = MSY.A1X(map2.get("isDynamicMemoryHandlingEnabled"));
                            Object obj2 = map2.get("normalModeMemoryThreshold");
                            C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.Int");
                            i2 = ((Integer) obj2).intValue();
                            Object obj3 = map2.get("lowMemoryModeMemoryThreshold");
                            C14360o3.A0C(obj3, "null cannot be cast to non-null type kotlin.Int");
                            i = ((Integer) obj3).intValue();
                            z = true;
                        }
                        C15370ps A1F = AbstractC25225BEi.A1F();
                        EnumC53208Ng6 enumC53208Ng6 = EnumC53208Ng6.A05;
                        A1F.A00 = enumC53208Ng6;
                        if (z) {
                            Activity A003 = C66224U4u.A00(context);
                            if (A003 != null) {
                                ActivityManager A0F = MSZ.A0F(A003);
                                C14360o3.A0B(A0F, 0);
                                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                                A0F.getMemoryInfo(memoryInfo);
                                long j = memoryInfo.availMem;
                                if (!memoryInfo.lowMemory) {
                                    if (z3 && j <= i2 * OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED * OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED) {
                                        if (j > i * OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED * OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED) {
                                            enumC53208Ng6 = EnumC53208Ng6.A04;
                                        }
                                    }
                                    A1F.A00 = enumC53208Ng6;
                                }
                                enumC53208Ng6 = EnumC53208Ng6.A03;
                                A1F.A00 = enumC53208Ng6;
                            }
                            if (A1F.A00 == EnumC53208Ng6.A03) {
                                oMg.A04("LOW_MEMORY", (short) 4);
                                return EnumC53182Nfe.A04;
                            }
                        }
                        Object A03 = c6fw.A03(0);
                        C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>");
                        List list2 = (List) A03;
                        String A0s = AbstractC31173DnH.A0s(list, 1);
                        Map map3 = (Map) list.get(2);
                        list.get(3);
                        String A0s2 = AbstractC31173DnH.A0s(list, 4);
                        String A0s3 = AbstractC31173DnH.A0s(list, 5);
                        Boolean bool2 = (Boolean) list.get(6);
                        String A0s4 = AbstractC31173DnH.A0s(list, 7);
                        Map map4 = (Map) list.get(11);
                        Object obj4 = list.get(12);
                        C14360o3.A0C(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean A1a = AbstractC166987dD.A1a(obj4);
                        Object obj5 = list.get(13);
                        AbstractC25225BEi.A1S(obj5);
                        String str3 = (String) obj5;
                        String A004 = AbstractC53674NoP.A00();
                        String A005 = CCA.A00(c54772OIl.A00);
                        Map map5 = c51687MsI.A00;
                        Map map6 = null;
                        if (map5 != null) {
                            Object obj6 = map5.get(A005);
                            if (obj6 != 0) {
                                map6 = obj6;
                            }
                            map6 = map6;
                        }
                        boolean z4 = false;
                        List list3 = null;
                        if (map6 != null) {
                            Object obj7 = map6.get("leLightPayload");
                            if ((obj7 instanceof Map) && (map = (Map) obj7) != null) {
                                Object obj8 = map.get("effect_id");
                                if (obj8 instanceof String) {
                                    str = (String) obj8;
                                } else {
                                    str = null;
                                }
                                Object obj9 = map.get("quality_buckets");
                                if (obj9 instanceof List) {
                                    list3 = (List) obj9;
                                }
                                str2 = str;
                                z4 = true;
                            }
                        }
                        O1N o1n = c55069OaP.A03;
                        if (o1n == null) {
                            C14360o3.A0F("liveEditingParamsResolver");
                        } else {
                            if (!z4 || str2 == null) {
                                str2 = AbstractC31173DnH.A0s(list, 9);
                            }
                            if (str2 == null) {
                                str2 = null;
                            } else {
                                UserSession userSession2 = o1n.A00.A00;
                                if (C18U.A04(c06090Tz, userSession2, 36880596409254231L).length() > 0) {
                                    str2 = C18U.A04(c06090Tz, userSession2, 36880596409254231L);
                                }
                            }
                            if (z4 && list3 != null) {
                                A01 = C54997OUh.A00(list3, C1FP.A00());
                            } else {
                                A01 = c55069OaP.A09.A01(map4, C1FP.A00());
                            }
                            if (map4 == null) {
                                obj = null;
                            } else {
                                obj = map4.get("pinAvatar");
                            }
                            if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
                                z2 = bool.booleanValue();
                            } else {
                                z2 = false;
                            }
                            AbstractC23641Du.A05(new CommonBloksActionHelper$onLiveEditorPrefetchAssetsActionExtended$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, oMg), new CommonBloksActionHelper$onLiveEditorPrefetchAssetsActionExtended$3(context, c51687MsI, c55069OaP, oMg, c54775OIo, A01, bool2, A0s2, A004, A0s3, str2, A0s, A0s4, str3, list2, map4, map3, null, A1F, A0v, A1a, z2), A0v);
                            return EnumC53182Nfe.A07;
                        }
                    }
                    throw C00O.createAndThrow();
                }
                throw new C53400Njp();
            } catch (ClassCastException e) {
                C0K8.A0C("CommonBloksActionHelper", AbstractC167017dG.A0n(e, "Cannot cast argument received. Error: ", AbstractC166987dD.A1C()));
                oMg.A05((short) 3);
                return EnumC53182Nfe.A02;
            } catch (Exception e2) {
                C0K8.A0C("CommonBloksActionHelper", AbstractC167017dG.A0n(e2, "Unknown exception. Error: ", AbstractC166987dD.A1C()));
                oMg.A05((short) 3);
                return EnumC53182Nfe.A09;
            }
        }
        throw AbstractC166997dE.A0g();
    }
}
