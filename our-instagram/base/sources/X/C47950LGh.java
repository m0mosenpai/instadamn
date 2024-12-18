package X;

import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.ArrayList;

/* renamed from: X.LGh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47950LGh {
    public final C43718JVd A01(C45113Jxi c45113Jxi, Integer num) {
        C45282K2k c45282K2k;
        C14360o3.A0B(num, 1);
        LA4 A00 = AbstractC46886KoT.A00(c45113Jxi, null);
        C45090JxK c45090JxK = (C45090JxK) c45113Jxi.A02;
        if (c45090JxK != null) {
            MNQ mnq = c45090JxK.A02;
            String str = null;
            if (C45282K2k.A00(mnq, 2) && (c45282K2k = (C45282K2k) mnq) != null) {
                str = c45282K2k.A01;
            }
            C43719JVe c43719JVe = new C43719JVe(Boolean.valueOf(c45090JxK.A0C), Boolean.valueOf(c45090JxK.A00()), c45090JxK.A07, c45090JxK.A0A, c45090JxK.A08, c45090JxK.A06, str);
            C43606JQm c43606JQm = new C43606JQm();
            c43606JQm.A0F = A00.A03();
            String str2 = c45113Jxi.A04;
            c43606JQm.A09 = AbstractC25233BEq.A0n(str2);
            c43606JQm.A0G = A00.A02();
            c43606JQm.A0C = RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING;
            C45090JxK c45090JxK2 = (C45090JxK) c45113Jxi.A02;
            boolean z = c45090JxK2 instanceof C45090JxK;
            c43606JQm.A0O = z;
            String str3 = null;
            if (z && c45090JxK2 != null) {
                str3 = c45090JxK2.A09;
            }
            c43606JQm.A0A = AbstractC25233BEq.A0n(str3);
            c43606JQm.A0D = A00.A00();
            c43606JQm.A0E = A00.A01();
            c43606JQm.A0K = null;
            c43606JQm.A03 = num;
            C45090JxK c45090JxK3 = (C45090JxK) c45113Jxi.A02;
            String str4 = null;
            if (c45090JxK3 != null) {
                str4 = c45090JxK3.A0A;
            }
            c43606JQm.A0H = str4;
            Integer num2 = (Integer) c45113Jxi.A01;
            c43606JQm.A0Q = AbstractC167007dF.A1X(num2, C05F.A01);
            c43606JQm.A02 = AbstractC43715JVa.A00(num2);
            ArrayList A1E = AbstractC166987dD.A1E();
            C45090JxK c45090JxK4 = (C45090JxK) c45113Jxi.A02;
            if (c45090JxK4 != null) {
                if (c45090JxK4.A00()) {
                    A1E.add(EnumC46302KeY.A04);
                }
                if (c45090JxK4.A0C) {
                    A1E.add(EnumC46302KeY.A0G);
                }
            }
            c43606JQm.A0N = A1E;
            c43606JQm.A0P = C50C.A02(str2);
            c43606JQm.A06 = AbstractC37302Gc3.A0V(c43719JVe.A05);
            c43606JQm.A0I = c43719JVe.A02;
            return new C43718JVd(new JQO(c43606JQm), c43719JVe, c45113Jxi.A00);
        }
        throw B4Z.A00();
    }

    public final C43718JVd A02(C43735JVu c43735JVu, Integer num, long j) {
        Long l;
        String str;
        Long l2 = null;
        String str2 = c43735JVu.A0A;
        Long A0k = AbstractC003100w.A0k(10, str2);
        C83403nh c83403nh = c43735JVu.A02;
        if (c83403nh != null && (str = c83403nh.A1u) != null) {
            l = AbstractC003100w.A0k(10, str);
        } else {
            l = null;
        }
        String str3 = c43735JVu.A04.A00;
        Integer num2 = c43735JVu.A07;
        boolean A1X = AbstractC167007dF.A1X(num2, C05F.A01);
        PushChannelType A00 = AbstractC43715JVa.A00(num2);
        ArrayList A002 = A00(c43735JVu);
        boolean A02 = C50C.A02(str2);
        String str4 = c43735JVu.A09;
        if (str4 != null) {
            l2 = AbstractC003100w.A0k(10, str4);
        }
        return new C43718JVd(new JQO(A00, num, l2, null, A0k, l, null, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, null, null, null, null, str3, c43735JVu.A01, null, null, null, A002, -1L, true, A02, A1X), AbstractC46887KoU.A00(c43735JVu), j);
    }

    public final C43718JVd A03(C47577Kzn c47577Kzn, Integer num, long j) {
        Long l = null;
        C43735JVu c43735JVu = c47577Kzn.A01;
        String str = c43735JVu.A0A;
        Long A0k = AbstractC003100w.A0k(10, str);
        Long A0k2 = AbstractC003100w.A0k(10, c47577Kzn.A00.A00());
        String str2 = c43735JVu.A04.A00;
        Integer num2 = c43735JVu.A07;
        boolean A1X = AbstractC167007dF.A1X(num2, C05F.A01);
        PushChannelType A00 = AbstractC43715JVa.A00(num2);
        ArrayList A002 = A00(c43735JVu);
        boolean A02 = C50C.A02(str);
        String str3 = c43735JVu.A09;
        if (str3 != null) {
            l = AbstractC003100w.A0k(10, str3);
        }
        return new C43718JVd(new JQO(A00, num, l, null, A0k, A0k2, null, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, null, null, null, null, str2, c43735JVu.A01, null, null, null, A002, -1L, true, A02, A1X), AbstractC46887KoU.A00(c43735JVu), j);
    }

    public static final ArrayList A00(C43735JVu c43735JVu) {
        ArrayList A1E = AbstractC166987dD.A1E();
        C83403nh c83403nh = c43735JVu.A02;
        if (c83403nh != null) {
            if (c83403nh.A1T()) {
                A1E.add(EnumC46302KeY.A04);
            }
            if (c83403nh.A2P) {
                A1E.add(EnumC46302KeY.A0G);
            }
        }
        return A1E;
    }
}
