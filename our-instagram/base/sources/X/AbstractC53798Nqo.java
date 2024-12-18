package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.commonavatarliveediting.prefetch.CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$$inlined$CoroutineExceptionHandler$1;
import com.facebook.commonavatarliveediting.prefetch.CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1;
import com.facebook.commonavatarliveediting.prefetch.CommonCdlProviderHolder;
import com.facebook.fbavatar.cdsavatareditor.liveediting.ig.IgCdlProviderBuilder;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.Nqo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53798Nqo {
    public static final EnumC53182Nfe A00(C6FQ c6fq, C6FW c6fw) {
        C55643OnT c55643OnT;
        boolean z;
        boolean z2;
        Boolean bool;
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
            Object obj = null;
            synchronized (c53676NoR) {
                C14360o3.A0B(A002, 0);
                c55643OnT = C55643OnT.A05;
                if (c55643OnT == null) {
                    c55643OnT = new C55643OnT(context, A002);
                    C55643OnT.A05 = c55643OnT;
                }
            }
            c55069OaP.A01 = c55643OnT;
            C15370ps A1F = AbstractC25225BEi.A1F();
            OMg oMg = new OMg(new C51753Mtc(231937012, 2, 1), A0N);
            try {
                int i = oMg.A01;
                int i2 = oMg.A00;
                QuickPerformanceLogger quickPerformanceLogger = AbstractC54324Nzi.A00;
                if (quickPerformanceLogger != null) {
                    quickPerformanceLogger.markerStart(i, i2);
                    A1F.A00 = AbstractC31175DnJ.A0I(c6fw, 4);
                    O1H o1h2 = c55069OaP.A00;
                    if (o1h2 == null) {
                        C14360o3.A0F("avatarEmbodimentSupport");
                        throw C00O.createAndThrow();
                    }
                    if (!C18U.A06(C06090Tz.A05, o1h2.A00, 36317646455707074L)) {
                        oMg.A04("LOAD_ACTION_NOT_ENABLED", (short) 4);
                        C55069OaP.A01(c55069OaP, c6fq, (InterfaceC103384lE) A1F.A00, "load_live_editor_not_enabled");
                        return EnumC53182Nfe.A03;
                    }
                    List list = c6fw.A00;
                    C51687MsI c51687MsI = new C51687MsI((Map) list.get(7));
                    if (!c55069OaP.A02(c51687MsI)) {
                        oMg.A04("NETWORK_NOT_SUPPORTED", (short) 4);
                        C55069OaP.A01(c55069OaP, c6fq, (InterfaceC103384lE) A1F.A00, "network_type_not_supported");
                    }
                    String A0s = AbstractC31173DnH.A0s(list, 0);
                    Map map = (Map) list.get(1);
                    C15370ps A1F2 = AbstractC25225BEi.A1F();
                    A1F2.A00 = AbstractC31173DnH.A0s(list, 2);
                    Object obj2 = list.get(3);
                    C14360o3.A0C(obj2, AbstractC111324zv.A00(38));
                    double A003 = MSW.A00(obj2);
                    Boolean bool2 = (Boolean) list.get(5);
                    if (bool2 != null) {
                        z = bool2.booleanValue();
                    } else {
                        z = false;
                    }
                    String A0s2 = AbstractC31173DnH.A0s(list, 6);
                    Map map2 = (Map) list.get(8);
                    Object obj3 = list.get(9);
                    C14360o3.A0C(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean A1a = AbstractC166987dD.A1a(obj3);
                    String A004 = AbstractC53674NoP.A00();
                    if (map2 != null) {
                        obj = map2.get("pinAvatar");
                    }
                    if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
                        z2 = bool.booleanValue();
                    } else {
                        z2 = false;
                    }
                    C51737MtK A01 = c55069OaP.A09.A01(map2, C1FP.A00());
                    Object obj4 = (String) A1F2.A00;
                    oMg.A03(TraceFieldType.RequestID, A004);
                    int i3 = 1;
                    oMg.A03("isAvatarConfigEmpty", Integer.valueOf(AbstractC25229BEm.A1Z(map) ? 1 : 0));
                    if (obj4 != null) {
                        i3 = 0;
                    }
                    oMg.A03("isEffectConfigEmpty", Integer.valueOf(i3));
                    if (obj4 != null) {
                        oMg.A03("effectId", obj4);
                    }
                    oMg.A03(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT, Double.valueOf(A003));
                    AbstractC23641Du.A05(new CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, c55069OaP, A1F, c6fq, oMg), new CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1(context, c51687MsI, c55069OaP, oMg, c54775OIo, A01, c6fq, A0s, A0s2, A004, map, null, A1F2, A1F, A0v, A003, A1a, z, z2), A0v);
                    return EnumC53182Nfe.A07;
                }
                throw new C53400Njp();
            } catch (ClassCastException e) {
                C0K8.A0C("CommonBloksActionHelper", AbstractC167017dG.A0n(e, "Cannot cast argument received. Error: ", AbstractC166987dD.A1C()));
                oMg.A05((short) 3);
                C55069OaP.A01(c55069OaP, c6fq, (InterfaceC103384lE) A1F.A00, "class_cast_error");
                return EnumC53182Nfe.A02;
            } catch (Exception e2) {
                C0K8.A0C("CommonBloksActionHelper", AbstractC167017dG.A0n(e2, "Unknown exception. Error: ", AbstractC166987dD.A1C()));
                oMg.A05((short) 3);
                C55069OaP.A01(c55069OaP, c6fq, (InterfaceC103384lE) A1F.A00, "unknown_error");
                return EnumC53182Nfe.A09;
            }
        }
        throw AbstractC166997dE.A0g();
    }
}
