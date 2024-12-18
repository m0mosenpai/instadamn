package X;

import android.content.Context;
import android.view.View;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.instagram.api.tigon.IGTigonQuickPerformanceLogger;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubNetworkDataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.9G1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9G1 extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9G1(Object obj, Object obj2, String str, int i) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = obj2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        List list;
        int intValue;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger;
        int i2;
        switch (this.A00) {
            case 0:
                intValue = ((Number) obj).intValue();
                lightweightQuickPerformanceLogger = ((IGTigonQuickPerformanceLogger) this.A02).logger;
                i2 = this.A01.hashCode();
                break;
            case 1:
                EnumC132255y4 enumC132255y4 = (EnumC132255y4) obj;
                C14360o3.A0B(enumC132255y4, 0);
                ((C5yI) this.A01).Dx7(enumC132255y4, this.A03, ((C132265y5) ((InterfaceC132245y2) this.A02)).A00);
                return C0eB.A00;
            case 2:
                C166137bh c166137bh = (C166137bh) obj;
                C14360o3.A0B(c166137bh, 0);
                String str = this.A03;
                Object obj2 = this.A01;
                Object obj3 = this.A02;
                C14360o3.A0B(str, 1);
                C14360o3.A0B(obj2, 2);
                return AbstractC166327c1.A08(c166137bh, str, new C9F3(37, obj3, obj2));
            case 3:
                intValue = ((Number) obj).intValue();
                lightweightQuickPerformanceLogger = ((CacheBehaviorLogger) this.A02).logger;
                i2 = ((C1QW) this.A01).A04;
                break;
            case 4:
                C40741uh c40741uh = (C40741uh) obj;
                C14360o3.A0B(c40741uh, 0);
                C15370ps c15370ps = (C15370ps) this.A01;
                C37771pE c37771pE = (C37771pE) c40741uh.A03(((InspirationHubNetworkDataSource) this.A02).A00).get(this.A03);
                if (c37771pE != null) {
                    list = c37771pE.A1k;
                } else {
                    list = null;
                }
                c15370ps.A00 = list;
                return C0eB.A00;
            case 5:
                C14360o3.A0B(obj, 0);
                C135976Dc c135976Dc = (C135976Dc) this.A02;
                String str2 = this.A03;
                C4F5 c4f5 = (C4F5) this.A01;
                String id = c4f5.A0A.getId();
                ArrayList A04 = C135976Dc.A04(c4f5, false);
                String str3 = c4f5.A03;
                Integer num = c4f5.A02;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                c135976Dc.A00 = new C22945A9p(Boolean.valueOf(obj instanceof InterfaceC2056098k), str2, id, str3, A04, i);
                return C0eB.A00;
            case 6:
                Context context = (Context) obj;
                C14360o3.A0B(context, 0);
                C87143uX c87143uX = (C87143uX) this.A02;
                C38321qM c38321qM = (C38321qM) this.A01;
                String str4 = this.A03;
                boolean A02 = AbstractC76923ce.A00(c87143uX.A00).A02(c38321qM);
                C57332k8 c57332k8 = c87143uX.A01;
                if (A02) {
                    return c57332k8.A0G(context, c38321qM, str4);
                }
                return c57332k8.A0F(context, c38321qM, str4);
            case 7:
                Context context2 = (Context) obj;
                C14360o3.A0B(context2, 0);
                C87143uX c87143uX2 = (C87143uX) this.A02;
                return c87143uX2.A01.A0A(context2, (C38321qM) this.A01, this.A03);
            case 8:
                Context context3 = (Context) obj;
                C14360o3.A0B(context3, 0);
                C87143uX c87143uX3 = (C87143uX) this.A02;
                return c87143uX3.A01.A09(context3, (C38321qM) this.A01, this.A03);
            case 9:
                Context context4 = (Context) obj;
                C14360o3.A0B(context4, 0);
                C87143uX c87143uX4 = (C87143uX) this.A02;
                return c87143uX4.A01.A0H(context4, (C38321qM) this.A01, this.A03);
            case 10:
                View view = (View) obj;
                C14360o3.A0B(view, 0);
                C59072n8 A00 = C59062n7.A00(this.A01, C0eB.A00, AnonymousClass001.A0R("XarDisclosureBanner_for_", this.A03));
                final C167257de c167257de = (C167257de) this.A02;
                A00.A00(new AnonymousClass358() { // from class: X.9jp
                    {
                        super(250L);
                    }

                    @Override // X.AnonymousClass358
                    public final /* bridge */ /* synthetic */ void A00(Object obj4, long j, Object obj5) {
                        C167257de c167257de2 = C167257de.this;
                        if (!c167257de2.A00) {
                            c167257de2.A00 = true;
                            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c167257de2.A01, AbstractC111324zv.A00(2504));
                            if (A0f.isSampled()) {
                                A0f.Cht();
                            }
                            if (C18U.A06(C06090Tz.A05, c167257de2.A02, 36315838274342507L)) {
                                C2B9 c2b9 = c167257de2.A04;
                                EnumC46582Bw enumC46582Bw = EnumC46582Bw.A0a;
                                if (c2b9.A03.get(enumC46582Bw) != null) {
                                    C46552Bt c46552Bt = c2b9.A02;
                                    int A002 = c46552Bt.A00() + 1;
                                    InterfaceC19610xo ARD = c46552Bt.A04.ARD();
                                    ARD.E7D("PREFERENCE_REELS_RECOMMEND_ON_FACEBOOK_CONSUMPTION_DISCLOSURE_IMPRESSION_COUNT", A002);
                                    ARD.apply();
                                    C9B9 A003 = C2B9.A00(c2b9, enumC46582Bw);
                                    if (A003.A01 < 1) {
                                        A003 = new C9B9(1, 0, 12);
                                        c2b9.A01.A03(A003, enumC46582Bw);
                                    }
                                    c2b9.A01.A03(new C9B9(A003.A04, A003.A00 + 1, A003.A01, A003.A03, 0), enumC46582Bw);
                                    return;
                                }
                                return;
                            }
                            C46552Bt c46552Bt2 = c167257de2.A05;
                            int A004 = c46552Bt2.A00() + 1;
                            InterfaceC19610xo ARD2 = c46552Bt2.A04.ARD();
                            ARD2.E7D("PREFERENCE_REELS_RECOMMEND_ON_FACEBOOK_CONSUMPTION_DISCLOSURE_IMPRESSION_COUNT", A004);
                            ARD2.apply();
                        }
                    }
                });
                c167257de.A03.A05(view, A00.A01());
                return C0eB.A00;
            case 11:
                C14360o3.A0B(obj, 0);
                C77123cy c77123cy = (C77123cy) this.A02;
                C2XV.A00();
                C77103cw c77103cw = (C77103cw) c77123cy.A00;
                String str5 = this.A03;
                C14360o3.A0B(str5, 0);
                Map map = c77103cw.A00;
                Boolean bool = (Boolean) map.get(str5);
                if (bool == null || !bool.booleanValue()) {
                    ((InterfaceC16660sJ) this.A01).invoke(obj);
                    map.put(str5, true);
                    C2XV.A00();
                    c77123cy.A00 = c77103cw;
                }
                return C0eB.A00;
            default:
                String str6 = (String) obj;
                C14360o3.A0B(str6, 0);
                String str7 = this.A03;
                Object obj4 = this.A01;
                C14360o3.A0B(str7, 1);
                C14360o3.A0B(obj4, 2);
                C2ZE.A00(new C5Q5(str6, obj4, str7));
                return C0eB.A00;
        }
        lightweightQuickPerformanceLogger.markerPoint(intValue, i2, this.A03);
        return C0eB.A00;
    }
}
