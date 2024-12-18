package X;

import com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class JTT implements C11R {
    public final C7TT A00;
    public final Integer A01;
    public final List A02;
    public final List A03;
    public final List A04;
    public volatile List A05;
    public volatile List A06;
    public final /* synthetic */ C7K6 A07;

    @Override // X.C11R
    public final void onCancel() {
    }

    @Override // X.C11R
    public final void onStart() {
    }

    public JTT(C7K6 c7k6, C7TT c7tt, Integer num, List list, List list2, List list3) {
        this.A07 = c7k6;
        this.A00 = c7tt;
        this.A02 = list;
        this.A03 = list2;
        this.A04 = list3;
        this.A01 = num;
    }

    @Override // X.C11R
    public final String getName() {
        return "UpdateThreadRowsTask";
    }

    @Override // X.C11R
    public final int getRunnableId() {
        return 303;
    }

    @Override // X.C11R
    public final void onFinish() {
        ArrayList arrayList;
        ArrayList arrayList2;
        List list = this.A05;
        ArrayList arrayList3 = null;
        if (list != null) {
            C7K6 c7k6 = this.A07;
            if (list.size() == 1 && ((C160787Im) AbstractC001800i.A0I(list)).A0e.A0g() != null) {
                IGFOAMessagingLocalSendSpeedLogger A00 = C7R5.A00(c7k6.A02, Integer.valueOf(AbstractC31177DnL.A04(((C160787Im) AbstractC001800i.A0I(list)).A0e.A0g())));
                if (A00 != null) {
                    A00.onLogFinishThreadRowUpdateTask();
                }
            }
        }
        C7K6 c7k62 = this.A07;
        c7k62.A00--;
        if (!c7k62.A01) {
            C7V2 c7v2 = c7k62.A04;
            C7TT c7tt = this.A00;
            List list2 = this.A05;
            if (list2 != null) {
                arrayList = AbstractC166987dD.A1F(list2);
            } else {
                arrayList = null;
            }
            List list3 = this.A03;
            if (list3 != null) {
                arrayList2 = AbstractC166987dD.A1F(list3);
            } else {
                arrayList2 = null;
            }
            List list4 = this.A06;
            if (list4 != null) {
                arrayList3 = AbstractC166987dD.A1F(list4);
            }
            c7v2.DxD(c7tt, this.A01, arrayList, arrayList2, arrayList3);
        }
    }

    @Override // X.C11R
    public final void run() {
        C83403nh c83403nh;
        List list = this.A02;
        IGFOAMessagingLocalSendSpeedLogger iGFOAMessagingLocalSendSpeedLogger = null;
        if (list != null && (c83403nh = (C83403nh) AbstractC001800i.A0J(list)) != null) {
            C7K6 c7k6 = this.A07;
            if (c83403nh.A0g() != null && list.size() == 1) {
                iGFOAMessagingLocalSendSpeedLogger = C7R5.A00(c7k6.A02, Integer.valueOf(AbstractC31177DnL.A04(c83403nh.A0g())));
                if (iGFOAMessagingLocalSendSpeedLogger != null) {
                    iGFOAMessagingLocalSendSpeedLogger.onLogScheduleThreadRowUpdateTaskEnd();
                }
            }
        }
        List list2 = this.A04;
        if (list2 != null) {
            this.A06 = this.A07.A03.EqQ(this.A00, list2);
        }
        if (list != null) {
            if (iGFOAMessagingLocalSendSpeedLogger != null) {
                iGFOAMessagingLocalSendSpeedLogger.onLogGenerateMessageRowDataStart();
            }
            this.A05 = this.A07.A03.EqQ(this.A00, list);
            if (iGFOAMessagingLocalSendSpeedLogger != null) {
                iGFOAMessagingLocalSendSpeedLogger.onLogGenerateMessageRowDataEnd();
            }
        }
    }
}
