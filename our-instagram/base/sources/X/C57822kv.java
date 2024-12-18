package X;

import com.instagram.api.schemas.UpcomingEventIDType;
import com.instagram.common.session.UserSession;
import com.instagram.upcomingevents.common.model.UpcomingEventReminderAction;
import com.instagram.user.model.UpcomingEvent;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.2kv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57822kv extends AbstractC57542kT {
    public final C25301Lk A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.INM] */
    public final INM A0L(UpcomingEventIDType upcomingEventIDType, UpcomingEventReminderAction upcomingEventReminderAction, String str, String str2) {
        String str3;
        List list;
        String[] strArr;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(upcomingEventIDType, 1);
        if (str2 != null) {
            List A03 = new C11L("_").A03(str2);
            if (!A03.isEmpty()) {
                ListIterator listIterator = A03.listIterator(A03.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        list = AbstractC001800i.A0d(A03, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            list = C16930sl.A00;
            if (list != null && (strArr = (String[]) list.toArray(new String[0])) != null) {
                str3 = strArr[0];
                ?? obj = new Object();
                obj.A03 = str;
                obj.A00 = upcomingEventIDType;
                obj.A01 = upcomingEventReminderAction;
                obj.A02 = str3;
                A0H(str, obj);
                return obj;
            }
        }
        str3 = null;
        ?? obj2 = new Object();
        obj2.A03 = str;
        obj2.A00 = upcomingEventIDType;
        obj2.A01 = upcomingEventReminderAction;
        obj2.A02 = str3;
        A0H(str, obj2);
        return obj2;
    }

    public final Boolean A0M(UpcomingEvent upcomingEvent) {
        if (super.A00 == null) {
            A0B();
        }
        String id = upcomingEvent.getId();
        if (A0J(id)) {
            INM inm = (INM) A05(id);
            if (inm != null) {
                UpcomingEventReminderAction A01 = inm.A01();
                boolean z = false;
                if (A01 == UpcomingEventReminderAction.A04) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            throw new IllegalStateException("Required value was null.");
        }
        return null;
    }

    public C57822kv(C25301Lk c25301Lk, UserSession userSession) {
        super(userSession);
        this.A00 = c25301Lk;
    }

    public final void A0N(INM inm) {
        if (inm == A05(inm.A02())) {
            A0F(inm.A02());
        }
    }
}
