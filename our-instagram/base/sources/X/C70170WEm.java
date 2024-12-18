package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.WEm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70170WEm {
    public static final C70170WEm A00 = new Object();

    public final void A02(FragmentActivity fragmentActivity, XIGIGBoostCallToAction xIGIGBoostCallToAction, UserSession userSession, C38321qM c38321qM, AudioOverlayTrack audioOverlayTrack, String str, String str2, Map map) {
        EnumC40111tc enumC40111tc;
        AbstractC167017dG.A1Q(userSession, map);
        if (!C18U.A06(C06090Tz.A05, userSession, 36316577008259598L) && !A01(userSession, c38321qM)) {
            if (c38321qM != null) {
                enumC40111tc = c38321qM.BRp();
            } else {
                enumC40111tc = null;
            }
            if (enumC40111tc != EnumC40111tc.A09 || map.get(AdsAPIInstagramPosition.A0C) == null) {
                AbstractC138316On.A04(fragmentActivity, xIGIGBoostCallToAction, userSession, audioOverlayTrack, str, str2);
                return;
            }
        }
        A00(fragmentActivity, (LEI) map.get(AdsAPIInstagramPosition.A0C), userSession);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001e A[PHI: r0
      0x001e: PHI (r0v11 boolean) = (r0v0 boolean), (r0v9 boolean) binds: [B:9:0x001b, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A01(com.instagram.common.session.UserSession r4, X.C38321qM r5) {
        /*
            if (r5 == 0) goto L3c
            X.1rF r0 = r5.A0C
            java.lang.String r1 = r0.getBoostUnavailableIdentifier()
            if (r1 == 0) goto L3c
            java.util.Map r0 = com.instagram.api.schemas.PromoteUnavailableReason.A01
            java.lang.Object r0 = r0.get(r1)
            com.instagram.api.schemas.PromoteUnavailableReason r0 = (com.instagram.api.schemas.PromoteUnavailableReason) r0
            if (r0 != 0) goto L16
            com.instagram.api.schemas.PromoteUnavailableReason r0 = com.instagram.api.schemas.PromoteUnavailableReason.A1N
        L16:
            int r1 = r0.ordinal()
        L1a:
            r0 = 0
            switch(r1) {
                case 9: goto L3e;
                case 19: goto L1f;
                case 63: goto L46;
                default: goto L1e;
            }
        L1e:
            return r0
        L1f:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36318561282758972(0x81078a0003193c, double:3.0313426261002155E-306)
            boolean r3 = X.C18U.A06(r2, r4, r0)
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36318561282693435(0x81078a0002193b, double:3.0313426260587696E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 != 0) goto L3a
            r0 = 0
            if (r3 == 0) goto L1e
        L3a:
            r0 = 1
            return r0
        L3c:
            r1 = -1
            goto L1a
        L3e:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36321494745228813(0x810a350000260d, double:3.033197759578248E-306)
            goto L4d
        L46:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36319514765303270(0x81086800001de6, double:3.0319456123005956E-306)
        L4d:
            boolean r0 = X.C18U.A06(r2, r4, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70170WEm.A01(com.instagram.common.session.UserSession, X.1qM):boolean");
    }

    public static final void A00(FragmentActivity fragmentActivity, LEI lei, UserSession userSession) {
        Object obj;
        Fragment A002;
        boolean A1a = AbstractC167017dG.A1a(fragmentActivity, userSession);
        if (lei != null) {
            List<C45126Jxv> list = lei.A01;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((C45126Jxv) obj2).A00 == EnumC68192VFk.OPTIMIZED) {
                    arrayList.add(obj2);
                }
            }
            int size = arrayList.size();
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((C45126Jxv) obj).A00 == EnumC68192VFk.DEFAULT) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C45126Jxv c45126Jxv = (C45126Jxv) obj;
            if (c45126Jxv != null) {
                if (size > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (C45126Jxv c45126Jxv2 : list) {
                        arrayList2.add(new C69216Vjj((EnumC68192VFk) c45126Jxv2.A00, c45126Jxv2.A02, c45126Jxv2.A01, c45126Jxv2.A03));
                    }
                    Gson gson = new Gson();
                    Type type = new C67786UyL().type;
                    C14360o3.A07(type);
                    JsonElement A01 = gson.A01(arrayList2, type);
                    AbstractC65702TsY.A0q();
                    String obj3 = lei.A00.toString();
                    String A19 = AbstractC166987dD.A19(A01);
                    C14360o3.A0B(obj3, A1a ? 1 : 0);
                    Bundle A05 = AbstractC31178DnM.A05(userSession);
                    A05.putString("instagram_positions", obj3);
                    A05.putString("preview_info", A19);
                    A002 = new V0J();
                    A002.setArguments(A05);
                } else {
                    String str = c45126Jxv.A03;
                    if (str != null) {
                        A002 = AbstractC155756z4.A00().A02().A00(userSession, str);
                    } else {
                        return;
                    }
                }
                AbstractC31177DnL.A16(A002, fragmentActivity, userSession);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The default preview must exist in the graphql response of ");
            sb.append(lei.A00);
            throw AbstractC58320PtC.A0o(" ad preview.", sb);
        }
    }

    public final void A03(FragmentActivity fragmentActivity, XIGIGBoostCallToAction xIGIGBoostCallToAction, UserSession userSession, C38321qM c38321qM, String str, List list, Map map) {
        AbstractC167017dG.A1Q(userSession, map);
        AdsAPIInstagramPosition adsAPIInstagramPosition = AdsAPIInstagramPosition.A06;
        if (!list.contains(adsAPIInstagramPosition) || map.get(adsAPIInstagramPosition) == null) {
            if (!C18U.A06(C06090Tz.A05, userSession, 36316577008194061L) && !A01(userSession, c38321qM)) {
                C6PZ.A01(fragmentActivity, AdsAPIInstagramPosition.A05, xIGIGBoostCallToAction, userSession, str);
                return;
            }
            adsAPIInstagramPosition = AdsAPIInstagramPosition.A05;
        }
        A00(fragmentActivity, (LEI) map.get(adsAPIInstagramPosition), userSession);
    }

    public final void A04(FragmentActivity fragmentActivity, XIGIGBoostCallToAction xIGIGBoostCallToAction, UserSession userSession, C38321qM c38321qM, String str, Map map, boolean z) {
        AdsAPIInstagramPosition adsAPIInstagramPosition;
        AbstractC167017dG.A1Q(userSession, map);
        if (!C18U.A06(C06090Tz.A05, userSession, 36316577008128524L) && !A01(userSession, c38321qM)) {
            if (z) {
                adsAPIInstagramPosition = AdsAPIInstagramPosition.A0A;
            } else {
                adsAPIInstagramPosition = AdsAPIInstagramPosition.A0G;
            }
            C6PZ.A01(fragmentActivity, adsAPIInstagramPosition, xIGIGBoostCallToAction, userSession, str);
            return;
        }
        A00(fragmentActivity, (LEI) map.get(AdsAPIInstagramPosition.A0G), userSession);
    }
}
