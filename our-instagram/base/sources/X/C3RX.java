package X;

import com.facebook.odin.features.persistence.room.ig4a.IgRoomExampleDatabase;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3RX, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3RX {
    public final C0JM A00;
    public final UserSession A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;

    /* JADX WARN: Type inference failed for: r6v0, types: [X.3Ro, java.lang.Object] */
    public final C3SC A00(InterfaceC73523Rd interfaceC73523Rd, C3RU c3ru, List list) {
        C14360o3.A0B(c3ru, 0);
        C14360o3.A0B(interfaceC73523Rd, 1);
        C14360o3.A0B(list, 2);
        C3S8 c3s8 = new C3S8(this.A00, ((IgRoomExampleDatabase) this.A02.getValue()).A00(), c3ru);
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        C73673Rt c73673Rt = new C73673Rt(c006802i, c3ru.Bjk());
        C17050sx A01 = AbstractC09440dt.A01(C3SA.A00);
        ?? obj = new Object();
        ArrayList arrayList = new ArrayList(list);
        if (c3ru.CDg()) {
            arrayList.add(new C73613Rn((InterfaceC73603Rm) this.A03.getValue(), c3ru.CDV()));
        }
        C73683Ru c73683Ru = new C73683Ru(null, AnonymousClass001.A0R(c3ru.CDV(), "_source"), arrayList);
        Object value = A01.getValue();
        C14360o3.A07(value);
        return new C3SC(c73683Ru, obj, c3s8, c73673Rt, interfaceC73523Rd, c3ru, (InterfaceExecutorServiceC73393Qq) value);
    }

    public C3RX(UserSession userSession) {
        this.A01 = userSession;
        C03250Di c03250Di = C03250Di.A00;
        C14360o3.A07(c03250Di);
        this.A00 = c03250Di;
        this.A02 = AbstractC09440dt.A01(new C206859Dq(this, 30));
        this.A03 = AbstractC09440dt.A01(new C206859Dq(this, 31));
    }
}
