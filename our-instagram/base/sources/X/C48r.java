package X;

import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.48r, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C48r {
    public static final C84823qW A00(EnumC75383a5 enumC75383a5, List list) {
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C84823qW) next).A12 == enumC75383a5) {
                obj = next;
                break;
            }
        }
        return (C84823qW) obj;
    }

    public static final List A01(EnumC75383a5 enumC75383a5, List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((C84823qW) obj).A12 == enumC75383a5) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return null;
    }

    public final MusicOverlayStickerModel A02(List list) {
        C84823qW A00 = A00(EnumC75383a5.A0s, list);
        if (A00 != null) {
            return A00.A0v;
        }
        return null;
    }
}
