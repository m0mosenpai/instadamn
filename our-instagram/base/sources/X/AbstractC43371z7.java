package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeEventHandler;
import com.instagram.realtimeclient.RealtimeEventHandlerProvider;
import java.util.ArrayList;

/* renamed from: X.1z7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC43371z7 {
    public static final ArrayList A00(final Context context) {
        C14360o3.A0B(context, 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RealtimeEventHandlerProvider() { // from class: X.1z8
            @Override // com.instagram.realtimeclient.RealtimeEventHandlerProvider
            public final RealtimeEventHandler get(UserSession userSession) {
                C4M5.A00();
                C14360o3.A0A(userSession);
                Context context2 = context;
                C14360o3.A0B(userSession, 0);
                return new C4M6(userSession, context2);
            }
        });
        arrayList.add(C43401zA.A00);
        arrayList.add(C43431zD.A00);
        arrayList.add(C43441zE.A00);
        arrayList.add(C43461zG.A00);
        arrayList.add(C43481zI.A00);
        arrayList.add(C43491zJ.A00);
        arrayList.add(C43511zL.A00);
        return arrayList;
    }
}
