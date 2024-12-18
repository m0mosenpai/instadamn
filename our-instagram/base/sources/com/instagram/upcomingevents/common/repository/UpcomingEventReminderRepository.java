package com.instagram.upcomingevents.common.repository;

import X.AbstractC146056i3;
import X.AbstractC23641Du;
import X.AbstractC25651Mw;
import X.AbstractC41071vF;
import X.AbstractC57812ku;
import X.AnonymousClass191;
import X.C0eB;
import X.C141986bH;
import X.C14360o3;
import X.C146066i4;
import X.C146076i5;
import X.C146086i6;
import X.C19L;
import X.C1JX;
import X.C25671My;
import X.C38321qM;
import X.C41213IMc;
import X.C42242InS;
import X.C57166PZk;
import X.C57822kv;
import X.EnumC39559HdV;
import X.INM;
import X.InterfaceC23621Ds;
import X.InterfaceC60442pS;
import X.JHX;
import X.OCN;
import com.instagram.api.schemas.UpcomingEventIDType;
import com.instagram.common.session.UserSession;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import com.instagram.upcomingevents.common.model.UpcomingEventReminderAction;
import com.instagram.user.model.UpcomingEvent;

/* loaded from: classes3.dex */
public final class UpcomingEventReminderRepository {
    public final C25671My A00;
    public final UserSession A01;
    public final C57822kv A02;
    public final C146076i5 A03;
    public final C146086i6 A04;
    public final C141986bH A05;
    public final C146066i4 A06;

    public UpcomingEventReminderRepository(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC60442pS, 2);
        C57822kv A00 = AbstractC57812ku.A00(userSession);
        C141986bH A002 = AbstractC146056i3.A00(userSession);
        C146066i4 c146066i4 = new C146066i4(userSession);
        C146076i5 c146076i5 = new C146076i5(interfaceC60442pS, userSession, str);
        C146086i6 c146086i6 = new C146086i6(userSession);
        C25671My A003 = AbstractC25651Mw.A00(userSession);
        C14360o3.A0B(A002, 3);
        C14360o3.A0B(A003, 7);
        this.A01 = userSession;
        this.A02 = A00;
        this.A05 = A002;
        this.A06 = c146066i4;
        this.A03 = c146076i5;
        this.A04 = c146086i6;
        this.A00 = A003;
    }

    public final void A03(JHX jhx, OCN ocn, C19L c19l) {
        C14360o3.A0B(ocn, 0);
        C14360o3.A0B(c19l, 2);
        AbstractC23641Du.A05(AnonymousClass191.A00, new C57166PZk(jhx, this, ocn, null, 35), c19l);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.INM r8, X.JHX r9, X.OCN r10, com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository r11, X.InterfaceC23621Ds r12) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository.A01(X.INM, X.JHX, X.OCN, com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository, X.1Ds):java.lang.Object");
    }

    public final Object A02(JHX jhx, OCN ocn, InterfaceC23621Ds interfaceC23621Ds) {
        String str;
        String str2;
        String str3;
        String id;
        C146086i6 c146086i6 = this.A04;
        UpcomingEventReminderAction upcomingEventReminderAction = ocn.A01;
        EnumC39559HdV A00 = A00(upcomingEventReminderAction);
        String str4 = ocn.A03;
        UpcomingEvent upcomingEvent = ocn.A02;
        String obj = upcomingEvent.CD5().toString();
        C38321qM c38321qM = ocn.A00;
        String str5 = null;
        if (c38321qM != null) {
            str = AbstractC41071vF.A07(this.A01, c38321qM);
        } else {
            str = null;
        }
        c146086i6.A02(A00, str4, obj, str);
        C146076i5 c146076i5 = this.A03;
        if (c38321qM == null || (str2 = c38321qM.getId()) == null) {
            UpcomingEventMedia BQO = upcomingEvent.BQO();
            if (BQO != null) {
                str2 = BQO.getId();
            } else {
                str2 = null;
            }
        }
        int ordinal = upcomingEventReminderAction.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                str3 = "upcoming_event_reminder_off";
            } else {
                throw new RuntimeException();
            }
        } else {
            str3 = "upcoming_event_reminder_on";
        }
        c146076i5.A04(upcomingEvent, str2, str3, str4);
        C57822kv c57822kv = this.A02;
        String id2 = upcomingEvent.getId();
        UpcomingEventIDType CD5 = upcomingEvent.CD5();
        if (c38321qM != null && (id = c38321qM.getId()) != null) {
            str5 = id;
        } else {
            UpcomingEventMedia BQO2 = upcomingEvent.BQO();
            if (BQO2 != null) {
                str5 = BQO2.getId();
            }
        }
        INM A0L = c57822kv.A0L(CD5, upcomingEventReminderAction, id2, str5);
        C41213IMc c41213IMc = new C41213IMc(upcomingEvent);
        boolean z = false;
        if (A0L.A01() == UpcomingEventReminderAction.A04) {
            z = true;
        }
        c41213IMc.A0E = z;
        this.A00.E4s(new C42242InS(c41213IMc.A00()));
        Object A01 = A01(A0L, jhx, ocn, this, interfaceC23621Ds);
        if (A01 != C1JX.A02) {
            return C0eB.A00;
        }
        return A01;
    }

    public static final EnumC39559HdV A00(UpcomingEventReminderAction upcomingEventReminderAction) {
        int ordinal = upcomingEventReminderAction.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return EnumC39559HdV.A04;
            }
            throw new RuntimeException();
        }
        return EnumC39559HdV.A03;
    }
}
