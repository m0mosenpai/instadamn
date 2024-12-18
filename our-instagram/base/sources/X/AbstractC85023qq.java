package X;

import android.graphics.PointF;
import com.instagram.api.schemas.FBTagType;
import java.util.ArrayList;

/* renamed from: X.3qq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC85023qq {
    /* JADX WARN: Type inference failed for: r0v15, types: [com.instagram.model.fbusertag.FBUserTag, java.lang.Object, com.instagram.tagging.model.Tag] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.instagram.model.fbusertag.FBUserTag$FBUserInfo, java.lang.Object] */
    public static final ArrayList A00(InterfaceC39001rZ interfaceC39001rZ) {
        PointF pointF;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC43556JLq interfaceC43556JLq : interfaceC39001rZ.CIr()) {
            if (interfaceC43556JLq.B56() != null) {
                JM7 B56 = interfaceC43556JLq.B56();
                String str6 = null;
                if (B56 != null) {
                    String fullName = B56.getFullName();
                    boolean z = false;
                    if (fullName != null && fullName.length() != 0) {
                        if (interfaceC43556JLq.Bec().size() == 2) {
                            pointF = new PointF(((Number) interfaceC43556JLq.Bec().get(0)).floatValue(), ((Number) interfaceC43556JLq.Bec().get(1)).floatValue());
                        } else {
                            pointF = null;
                        }
                        String C4z = interfaceC43556JLq.C4z();
                        JM7 B562 = interfaceC43556JLq.B56();
                        if (B562 != null) {
                            str = B562.B4o();
                        } else {
                            str = null;
                        }
                        JM7 B563 = interfaceC43556JLq.B56();
                        if (B563 != null) {
                            str2 = B563.getFullName();
                        } else {
                            str2 = null;
                        }
                        JM7 B564 = interfaceC43556JLq.B56();
                        if (B564 != null) {
                            str3 = B564.Bhi();
                        } else {
                            str3 = null;
                        }
                        JM7 B565 = interfaceC43556JLq.B56();
                        if (B565 != null) {
                            str4 = B565.Bhz();
                        } else {
                            str4 = null;
                        }
                        JM7 B566 = interfaceC43556JLq.B56();
                        if (B566 != null) {
                            str5 = B566.BiG();
                        } else {
                            str5 = null;
                        }
                        JM7 B567 = interfaceC43556JLq.B56();
                        if (B567 != null) {
                            str6 = B567.getUsername();
                        }
                        ?? obj = new Object();
                        obj.A05 = C4z;
                        obj.A00 = str;
                        obj.A01 = str2;
                        obj.A02 = str3;
                        obj.A03 = str4;
                        obj.A04 = str5;
                        obj.A06 = str6;
                        String C4z2 = interfaceC43556JLq.C4z();
                        Boolean AbJ = interfaceC43556JLq.AbJ();
                        if (AbJ != null) {
                            z = AbJ.booleanValue();
                        }
                        FBTagType B52 = interfaceC43556JLq.B52();
                        ?? obj2 = new Object();
                        obj2.A02 = obj;
                        obj2.A03 = C4z2;
                        obj2.A04 = z;
                        obj2.A01 = B52;
                        obj2.A00 = pointF;
                        obj2.A00 = pointF;
                        arrayList.add(obj2);
                    }
                }
            }
        }
        return arrayList;
    }
}
