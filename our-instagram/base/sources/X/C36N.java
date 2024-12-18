package X;

import android.app.Activity;
import com.instagram.api.schemas.IGRFSurveyContextDict;
import com.instagram.api.schemas.IGRFSurveyContextMappingDict;
import com.instagram.api.schemas.IGRFSurveyInfoDict;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.36N, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C36N implements InterfaceC43071ya, C36F {
    public long A00;
    public boolean A01;
    public final long A02;
    public final Activity A03;
    public final UserSession A04;
    public final C64092vU A05;

    public C36N(Activity activity, UserSession userSession, C64092vU c64092vU) {
        C14360o3.A0B(activity, 3);
        this.A05 = c64092vU;
        this.A04 = userSession;
        this.A03 = activity;
        this.A02 = C18U.A01(C06090Tz.A05, userSession, 36610653418494115L);
        this.A00 = -1L;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        Map A0E;
        String A2y;
        IGRFSurveyInfoDict BGD;
        IGRFSurveyContextDict B5d;
        List<IGRFSurveyContextMappingDict> ArK;
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                C64092vU c64092vU = this.A05;
                String id = ((C38321qM) c59062n7.A03).getId();
                if (id != null) {
                    c64092vU.A00(id).A04(interfaceC57162jr);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            C75113Zb c75113Zb = (C75113Zb) c59062n7.A04;
            if (c75113Zb.A2q || c75113Zb.getPosition() < 0) {
                return;
            }
            C64092vU c64092vU2 = this.A05;
            C38321qM c38321qM = (C38321qM) c59062n7.A03;
            String id2 = c38321qM.getId();
            if (id2 != null) {
                if (c64092vU2.A00(id2).A01(interfaceC57162jr) < this.A02) {
                    return;
                }
                UserSession userSession = this.A04;
                C14360o3.A0A(c38321qM);
                long j = this.A00;
                InterfaceC39541sb injected = c38321qM.A0C.getInjected();
                if (injected != null && (BGD = injected.BGD()) != null && (B5d = BGD.B5d()) != null && (ArK = B5d.ArK()) != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (IGRFSurveyContextMappingDict iGRFSurveyContextMappingDict : ArK) {
                        String name = iGRFSurveyContextMappingDict.getName();
                        if (name != null) {
                            String value = iGRFSurveyContextMappingDict.getValue();
                            if (value == null) {
                                value = "";
                            }
                            linkedHashMap.put(name, value);
                        }
                    }
                    A0E = AbstractC06930Yk.A0B(linkedHashMap);
                } else {
                    A0E = AbstractC06930Yk.A0E();
                }
                C09530e4 c09530e4 = new C09530e4("ad_client_impression_ts", String.valueOf(j));
                String A07 = AbstractC41071vF.A07(userSession, c38321qM);
                String str = "";
                if (A07 == null) {
                    A07 = "";
                }
                C09530e4 c09530e42 = new C09530e4("ad_id", A07);
                C40971v4 A00 = AbstractC41561w6.A00(userSession).A00(c38321qM);
                if (A00 != null) {
                    A2y = A00.A0g;
                } else {
                    A2y = c38321qM.A2y();
                }
                if (A2y == null) {
                    A2y = "";
                }
                C09530e4 c09530e43 = new C09530e4("ad_page_id", A2y);
                C09530e4 c09530e44 = new C09530e4(AbstractC111324zv.A00(717), String.valueOf(c75113Zb.getPosition() + 1));
                String A0F = AbstractC41071vF.A0F(userSession, c38321qM);
                if (A0F == null) {
                    A0F = "";
                }
                C09530e4 c09530e45 = new C09530e4("ad_tracking_token", A0F);
                C09530e4 c09530e46 = new C09530e4("gap_to_previous_ad", String.valueOf(C3GC.A02.A00(C5Hq.AD, c75113Zb.getPosition())));
                C09530e4 c09530e47 = new C09530e4("ig_user_id", userSession.userId);
                String BdA = AbstractC11060iN.A00(userSession).BdA();
                if (BdA != null) {
                    str = BdA;
                }
                AbstractC31282Dp4.A00().A01(this.A03, userSession, "817620270559898", AbstractC06930Yk.A04(A0E, AbstractC06930Yk.A06(c09530e4, c09530e42, c09530e43, c09530e44, c09530e45, c09530e46, c09530e47, new C09530e4("pigeon_session_id", str))));
                this.A01 = true;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        C64092vU c64092vU3 = this.A05;
        String id3 = ((C38321qM) c59062n7.A03).getId();
        if (id3 != null) {
            c64092vU3.A00(id3);
            this.A00 = System.currentTimeMillis();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.C36F
    public final boolean CT0(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        String str;
        IGRFSurveyInfoDict BGD;
        IGRFSurveyContextDict B5d;
        if (!this.A01 && this.A02 > 0 && C1VN.A00 != null) {
            if (C18U.A06(C06090Tz.A05, this.A04, 36329178441728115L)) {
                Object obj = c59062n7.A03;
                C14360o3.A06(obj);
                C38321qM c38321qM = (C38321qM) obj;
                C14360o3.A0B(c38321qM, 0);
                if (c38321qM.CdW()) {
                    InterfaceC39541sb injected = c38321qM.A0C.getInjected();
                    if (injected != null && (BGD = injected.BGD()) != null && (B5d = BGD.B5d()) != null) {
                        str = B5d.BIk();
                    } else {
                        str = null;
                    }
                    if (C14360o3.A0K(str, "817620270559898")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
