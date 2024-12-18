package X;

import com.facebook.quicklog.PointEditor;

/* renamed from: X.Ny1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54223Ny1 {
    public static final void A00(PointEditor pointEditor, C54702OEe c54702OEe, String str) {
        String str2;
        AbstractC167017dG.A1O(pointEditor, str);
        if (AbstractC25225BEi.A1Y(str) && C00Q.A00(str) != '_') {
            str = AnonymousClass001.A0C(str, '_');
        }
        pointEditor.addPointData(AnonymousClass001.A0R(str, "previous_value"), c54702OEe.A01);
        pointEditor.addPointData(AnonymousClass001.A0R(str, "was_activated"), c54702OEe.A06);
        String A0R = AnonymousClass001.A0R(str, "new_value");
        Integer num = c54702OEe.A03;
        if (num == null || (str2 = num.toString()) == null) {
            str2 = "null";
        }
        pointEditor.addPointData(A0R, str2);
        pointEditor.addPointData(AnonymousClass001.A0R(str, "is_activated_with_new_value"), c54702OEe.A04);
        pointEditor.addPointData(AnonymousClass001.A0R(str, "new_value_source"), c54702OEe.A02.toString());
        pointEditor.addPointData(AnonymousClass001.A0R(str, "event_id"), c54702OEe.A00);
        pointEditor.addPointData(AnonymousClass001.A0R(str, "timestamp"), System.currentTimeMillis());
    }
}
