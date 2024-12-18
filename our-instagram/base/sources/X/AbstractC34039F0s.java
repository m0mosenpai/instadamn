package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.F0s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34039F0s {
    public static EOT A00(InterfaceC37149GYk interfaceC37149GYk, UserSession userSession, Map map) {
        ArrayList<String> arrayList;
        Collection collection;
        Parcelable parcelable;
        Bundle A0b = AbstractC166987dD.A0b();
        EnumC33367Ep0 enumC33367Ep0 = EnumC33367Ep0.A09;
        EnumC33505Ere enumC33505Ere = null;
        if (map.containsKey(enumC33367Ep0)) {
            String obj = enumC33367Ep0.toString();
            Object obj2 = map.get(enumC33367Ep0);
            if (obj2 instanceof Parcelable) {
                parcelable = (Parcelable) obj2;
            } else {
                parcelable = null;
            }
            A0b.putParcelable(obj, parcelable);
        }
        AbstractC31178DnM.A0s(A0b, EnumC33367Ep0.A0A, map);
        AbstractC31178DnM.A0s(A0b, EnumC33367Ep0.A02, map);
        AbstractC31178DnM.A0s(A0b, EnumC33367Ep0.A03, map);
        EnumC33367Ep0 enumC33367Ep02 = EnumC33367Ep0.A05;
        if (map.containsKey(enumC33367Ep02)) {
            String obj3 = enumC33367Ep02.toString();
            Object obj4 = map.get(enumC33367Ep02);
            if ((obj4 instanceof List) && (collection = (Collection) obj4) != null) {
                arrayList = AbstractC166987dD.A1F(collection);
            } else {
                arrayList = null;
            }
            A0b.putStringArrayList(obj3, arrayList);
        }
        AbstractC31178DnM.A0s(A0b, EnumC33367Ep0.A08, map);
        AbstractC31178DnM.A0s(A0b, EnumC33367Ep0.A04, map);
        EnumC33367Ep0 enumC33367Ep03 = EnumC33367Ep0.A07;
        if (map.containsKey(enumC33367Ep03)) {
            String obj5 = enumC33367Ep03.toString();
            Object obj6 = map.get(enumC33367Ep03);
            if (obj6 instanceof EnumC33505Ere) {
                enumC33505Ere = (EnumC33505Ere) obj6;
            }
            A0b.putSerializable(obj5, enumC33505Ere);
        }
        AbstractC31178DnM.A0s(A0b, EnumC33367Ep0.A06, map);
        AbstractC60492pY.A04(A0b, userSession);
        EOT eot = new EOT();
        eot.setArguments(A0b);
        eot.A01 = interfaceC37149GYk;
        return eot;
    }
}
