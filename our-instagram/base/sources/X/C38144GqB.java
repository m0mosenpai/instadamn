package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.chaining.model.DiscoveryChainingItem;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.user.model.User;
import com.instagram.videofeed.intf.VideoFeedType;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.GqB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38144GqB {
    public ExploreTopicCluster A00;
    public String A01;
    public final Context A02;
    public final AbstractC018607g A03;
    public final UserSession A04;
    public final AnonymousClass309 A05;
    public final InterfaceC61432r6 A06;
    public final String A07;
    public final List A08;
    public final List A09;
    public final Map A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final C155936zN A0E;
    public final InterfaceC09390do A0F;

    public C38144GqB(Context context, AbstractC018607g abstractC018607g, UserSession userSession, ExploreTopicCluster exploreTopicCluster, C155936zN c155936zN, AnonymousClass309 anonymousClass309, InterfaceC61432r6 interfaceC61432r6, String str) {
        C14360o3.A0B(userSession, 2);
        this.A02 = context;
        this.A04 = userSession;
        this.A05 = anonymousClass309;
        this.A03 = abstractC018607g;
        this.A0E = c155936zN;
        this.A07 = str;
        this.A06 = interfaceC61432r6;
        this.A00 = exploreTopicCluster;
        this.A09 = AbstractC166987dD.A1E();
        this.A08 = AbstractC166987dD.A1E();
        this.A0A = AbstractC166987dD.A1I();
        this.A0D = AbstractC09440dt.A01(new C37053GUj(this, 4));
        this.A0B = AbstractC09440dt.A01(new C37053GUj(this, 1));
        this.A0F = AbstractC09440dt.A01(new C37053GUj(this, 3));
        this.A0C = AbstractC09440dt.A01(new C37053GUj(this, 2));
    }

    private final void A00() {
        Object obj;
        boolean z;
        InterfaceC43448JHm c42413IqG;
        if (A04()) {
            List list = this.A08;
            if (list.size() <= AbstractC166987dD.A0N(AbstractC166987dD.A17(this.A0B)) && this.A00 != null) {
                Context context = this.A02;
                Iterator it = this.A09.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (!list.contains(obj)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                C38321qM c38321qM = (C38321qM) obj;
                if (c38321qM != null) {
                    list.add(c38321qM);
                    String id = c38321qM.getId();
                    UUID randomUUID = UUID.randomUUID();
                    UserSession userSession = this.A04;
                    User A2E = c38321qM.A2E(userSession);
                    if (A2E != null && id != null) {
                        String id2 = A2E.getId();
                        EnumC39592He2 enumC39592He2 = EnumC39592He2.A05;
                        int i = c38321qM.BRp().A00;
                        String B3P = c38321qM.A0C.B3P();
                        String obj2 = randomUUID.toString();
                        String A2W = c38321qM.A2W();
                        int A00 = AbstractC37302Gc3.A00();
                        if (A00 != 0) {
                            if (A00 == 3) {
                                z = true;
                            } else {
                                throw AbstractC166987dD.A12("All channel-related arguments must be provided");
                            }
                        } else {
                            z = false;
                        }
                        String str = null;
                        DiscoveryChainingItem discoveryChainingItem = new DiscoveryChainingItem(enumC39592He2, null, null, null, id, id2, B3P, null, null, obj2, null, null, null, A2W, null, null, null, null, null, i, z);
                        ExploreTopicCluster exploreTopicCluster = this.A00;
                        if (exploreTopicCluster != null) {
                            String id3 = c38321qM.getId();
                            AnonymousClass309 anonymousClass309 = this.A05;
                            AbstractC018607g abstractC018607g = this.A03;
                            String obj3 = randomUUID.toString();
                            String str2 = this.A07;
                            if (id3 != null) {
                                str = AbstractC166987dD.A1A(id3, AbstractC38168GqZ.A00(userSession).A02);
                            }
                            InterfaceC61432r6 interfaceC61432r6 = this.A06;
                            if (discoveryChainingItem.A0K) {
                                VideoFeedType videoFeedType = discoveryChainingItem.A02;
                                videoFeedType.getClass();
                                int ordinal = videoFeedType.ordinal();
                                if (ordinal != 1) {
                                    if (ordinal != 0 && ordinal != 2 && ordinal != 4 && ordinal != 3) {
                                        throw AbstractC167007dF.A0c("Invalid VideoFeedType: ", videoFeedType.toString());
                                    }
                                    c42413IqG = new C42412IqF(context, userSession, discoveryChainingItem, anonymousClass309, interfaceC61432r6, str2);
                                } else {
                                    c42413IqG = new C42413IqG(context, userSession, discoveryChainingItem, exploreTopicCluster, anonymousClass309, interfaceC61432r6, obj3, "topical_explore", AbstractC111324zv.A00(4399));
                                }
                            } else {
                                c42413IqG = new C42413IqG(context, userSession, discoveryChainingItem, exploreTopicCluster, anonymousClass309, interfaceC61432r6, obj3, "topical_explore", AbstractC111324zv.A00(4401));
                            }
                            IMU imu = new IMU(context, abstractC018607g, userSession, c42413IqG, anonymousClass309, str, null, false);
                            imu.A01 = new C42417IqK(userSession, this, id);
                            imu.A00(new C42433Iqa(c38321qM));
                        }
                    }
                }
            }
        }
    }

    public static final void A01(C38144GqB c38144GqB, String str) {
        UserSession userSession = c38144GqB.A04;
        C38169Gqa A00 = AbstractC38168GqZ.A00(userSession);
        C14360o3.A0B(str, 0);
        A00.A02.remove(str);
        A00.A01.remove(str);
        Map map = A00.A00;
        synchronized (map) {
            map.remove(str);
        }
        c38144GqB.A0A.remove(str);
        C38321qM A0h = AbstractC25229BEm.A0h(userSession, str);
        if (A0h != null) {
            c38144GqB.A02(A0h);
        }
    }

    public final void A03(String str) {
        Object obj;
        this.A0A.put(str, AbstractC31173DnH.A0g());
        List list = this.A09;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(AbstractC37300Gc1.A0V(obj), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C15500q5.A00(list).remove(obj);
        C15500q5.A00(this.A08).remove(obj);
        A00();
    }

    public final boolean A04() {
        Object value = this.A0F.getValue();
        C14360o3.A07(value);
        return ((Boolean) value).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (X.AbstractC38168GqZ.A00(r4.A04).A00.containsKey(r1) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.C38321qM r5) {
        /*
            r4 = this;
            boolean r0 = r4.A04()
            if (r0 == 0) goto L37
            java.lang.String r1 = r5.getId()
            if (r1 == 0) goto L1b
            com.instagram.common.session.UserSession r0 = r4.A04
            X.Gqa r0 = X.AbstractC38168GqZ.A00(r0)
            java.util.Map r0 = r0.A00
            boolean r0 = r0.containsKey(r1)
            r3 = 1
            if (r0 != 0) goto L1c
        L1b:
            r3 = 0
        L1c:
            java.util.List r0 = r4.A08
            boolean r2 = r0.contains(r5)
            java.util.List r1 = r4.A09
            boolean r0 = r1.contains(r5)
            if (r3 != 0) goto L37
            if (r2 != 0) goto L37
            if (r0 != 0) goto L37
            r5.getId()
            r1.add(r5)
            r4.A00()
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38144GqB.A02(X.1qM):void");
    }
}
